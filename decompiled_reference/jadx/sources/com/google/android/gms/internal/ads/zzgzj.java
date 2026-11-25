package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgzj {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    zzgzj(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            zzgtr.zzc(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            zzgtr.zzc(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgzj) {
            zzgzj zzgzjVar = (zzgzj) obj;
            if (this.zzi == zzgzjVar.zzi && Arrays.equals(this.zzf, zzgzjVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i) {
        return this.zzf[i];
    }

    final boolean zzb(int i) {
        return this.zzh[i % this.zzc];
    }

    final int zzc(char c) throws zzgzm {
        if (c > 127) {
            String hexString = Integer.toHexString(c);
            String.valueOf(hexString);
            throw new zzgzm("Unrecognized character: 0x".concat(String.valueOf(hexString)));
        }
        byte b = this.zzg[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            String hexString2 = Integer.toHexString(c);
            String.valueOf(hexString2);
            throw new zzgzm("Unrecognized character: 0x".concat(String.valueOf(hexString2)));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 24);
        sb.append("Unrecognized character: ");
        sb.append(c);
        throw new zzgzm(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    final zzgzj zzd() {
        boolean z;
        int i = 0;
        while (true) {
            char[] cArr = this.zzf;
            int length = cArr.length;
            if (i >= length) {
                return this;
            }
            if (zzgsz.zzd(cArr[i])) {
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (zzgsz.zzc(cArr[i2])) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                zzgtr.zzj(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i3 = 0; i3 < cArr.length; i3++) {
                    char c = cArr[i3];
                    if (zzgsz.zzd(c)) {
                        c ^= 32;
                    }
                    cArr2[i3] = (char) c;
                }
                zzgzj zzgzjVar = new zzgzj(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzgzjVar.zzi) {
                    return zzgzjVar;
                }
                byte[] bArr = zzgzjVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i4 = 65; i4 <= 90; i4++) {
                    int i5 = i4 | 32;
                    byte b = bArr[i4];
                    byte b2 = bArr[i5];
                    if (b == -1) {
                        bArrCopyOf[i4] = b2;
                    } else {
                        char c2 = (char) i4;
                        char c3 = (char) i5;
                        if (b2 != -1) {
                            throw new IllegalStateException(zzgui.zzd("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c2), Character.valueOf(c3)));
                        }
                        bArrCopyOf[i5] = b;
                    }
                }
                return new zzgzj(zzgzjVar.zze.concat(".ignoreCase()"), zzgzjVar.zzf, bArrCopyOf, true);
            }
            i++;
        }
    }

    public final boolean zze(char c) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    final /* synthetic */ char[] zzf() {
        return this.zzf;
    }

    private zzgzj(String str, char[] cArr, byte[] bArr, boolean z) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZza = zzhag.zza(length, RoundingMode.UNNECESSARY);
            this.zzb = iZza;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZza);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i;
            this.zzd = iZza >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.zzd; i2++) {
                zArr[zzhag.zzb(i2 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z;
        } catch (ArithmeticException e) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 24);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }
}
