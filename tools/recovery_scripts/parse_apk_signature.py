#!/usr/bin/env python3
"""Parse APK Signing Block v2/v3 để trích certificate + fingerprint từ base APK."""
import struct
import sys
from pathlib import Path

APK = Path("/home/z/my-project/work/xapk/vn.yeutruyen.app.apk")


def u32(b, o):
    return struct.unpack_from("<I", b, o)[0]


def u64(b, o):
    return struct.unpack_from("<Q", b, o)[0]


def find_eocd(data):
    for i in range(len(data) - 22, max(len(data) - 22 - 65536, -1), -1):
        if data[i:i + 4] == b"\x50\x4b\x05\x06":
            return i
    return -1


def main():
    data = APK.read_bytes()
    eocd = find_eocd(data)
    if eocd < 0:
        print("no EOCD")
        return
    cd_offset = u32(data, eocd + 16)
    magic = data[cd_offset - 16:cd_offset]
    if magic != b"APK Sig Block 42":
        print("no APK Signing Block (magic not found)")
        return
    size2 = u64(data, cd_offset - 24)
    # block = 8 (leading size) + size2 bytes, kết thúc ngay trước CD
    block_start = cd_offset - 8 - size2
    size1 = u64(data, block_start)
    print(f"signing block: start={block_start}, size={size2} (check {size1})")

    o = block_start + 8
    end = cd_offset - 24
    while o < end:
        plen = u64(data, o)
        pid = u32(data, o + 8)
        payload = data[o + 12:o + 8 + plen]
        name = {0x7109871A: "v2", 0xF05368C0: "v3", 0x42726577: "v4", 0x2146354D: "v2.1", 0x57CBCA3: "verity"}.get(pid, hex(pid))
        print(f"block ID {pid} ({name}), len={plen}")
        if pid in (0x7109871A, 0xF05368C0):
            parse_signers(payload, name)
        o += 8 + plen


def parse_signers(p, scheme):
    """v2: [signers seq]; mỗi signer: [signed data][signatures][publickey] (u32-len prefixed)."""
    signers_len = u32(p, 0)
    o = 4
    end = 4 + signers_len
    i = 0
    while o < end:
        signer_len = u32(p, o)
        s = p[o + 4:o + 4 + signer_len]
        # signed data
        sd_len = u32(s, 0)
        sd = s[4:4 + sd_len]
        # trong signed data: digests(u32 seq) + certificates(u32 seq)
        dig_len = u32(sd, 0)
        certs_len = u32(sd, 4 + dig_len)
        certs_blob = sd[8 + dig_len:8 + dig_len + certs_len]
        co = 0
        while co < len(certs_blob):
            clen = u32(certs_blob, co)
            cert = certs_blob[co + 4:co + 4 + clen]
            co += 4 + clen
            if not cert:
                continue
            out = Path(f"/home/z/my-project/work/signer_{scheme}_{i}.der")
            out.write_bytes(cert)
            print(f"  -> cert saved: {out} ({len(cert)} bytes)")
            i += 1
        o += 4 + signer_len


if __name__ == "__main__":
    main()
    # in thông tin cert
    try:
        from cryptography import x509
        for f in Path("/home/z/my-project/work").glob("signer_*.der"):
            c = x509.load_der_x509_certificate(f.read_bytes())
            print(f"\n=== {f.name} ===")
            print("subject:", c.subject.rfc4514_string())
            print("issuer :", c.issuer.rfc4514_string())
            print("serial :", hex(c.serial_number))
            print("valid  :", c.not_valid_before_utc, "->", c.not_valid_after_utc)
            for h in ("md5", "sha1", "sha256"):
                import hashlib
                d = hashlib.new(h, f.read_bytes()).hexdigest()
                print(f"{h:6}:", ":".join(d[j:j + 2] for j in range(0, len(d), 2)))
    except Exception as e:
        print("cert info error:", e)
