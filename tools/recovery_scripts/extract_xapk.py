#!/usr/bin/env python3
"""Bóc tách XAPK an toàn: chặn path traversal, liệt kê nội dung, giải nén vào thư mục riêng."""
import json
import sys
import zipfile
from pathlib import Path

XAPK = Path("/home/z/my-project/work/dl/yeu_truyen_1.0.18.xapk")
OUT = Path("/home/z/my-project/work/xapk")


def main():
    OUT.mkdir(parents=True, exist_ok=True)
    with zipfile.ZipFile(XAPK) as zf:
        names = zf.namelist()
        print(f"=== {len(names)} entries ===")
        for info in zf.infolist():
            print(f"  {info.file_size:>12,}  {info.filename}")
        # Bảo mật: từ chối entry path traversal / tuyệt đối
        bad = [n for n in names if n.startswith(("/", "\\")) or ".." in Path(n).parts]
        if bad:
            print(f"!!! PATH TRAVERSAL DETECTED, abort: {bad}")
            sys.exit(1)
        zf.extractall(OUT)
        print(f"=== extracted to {OUT} ===")

    mf = OUT / "manifest.json"
    if mf.exists():
        print("\n=== manifest.json ===")
        data = json.loads(mf.read_text(encoding="utf-8"))
        print(json.dumps(data, indent=2, ensure_ascii=False))


if __name__ == "__main__":
    main()
