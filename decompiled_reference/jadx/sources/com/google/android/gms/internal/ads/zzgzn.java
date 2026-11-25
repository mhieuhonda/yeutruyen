package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzgzn extends zzgzo {
    private volatile zzgzo zza;
    final zzgzj zzb;
    final Character zzc;

    zzgzn(zzgzj zzgzjVar, Character ch) {
        this.zzb = zzgzjVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (zzgzjVar.zze('=')) {
                z = false;
            }
        }
        zzgtr.zzf(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgzn) {
            zzgzn zzgznVar = (zzgzn) obj;
            if (this.zzb.equals(zzgznVar.zzb) && Objects.equals(this.zzc, zzgznVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgzj zzgzjVar = this.zzb;
        sb.append(zzgzjVar);
        if (8 % zzgzjVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzgtr.zzo(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.zzb.zzd;
            zze(appendable, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    int zzb(byte[] bArr, CharSequence charSequence) throws zzgzm {
        int i;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgzj zzgzjVar = this.zzb;
        if (!zzgzjVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new zzgzm(sb.toString());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = zzgzjVar.zzc;
                if (i4 >= i) {
                    break;
                }
                jZzc <<= zzgzjVar.zzb;
                if (i2 + i4 < charSequenceZzg.length()) {
                    jZzc |= (long) zzgzjVar.zzc(charSequenceZzg.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = zzgzjVar.zzd;
            int i7 = i5 * zzgzjVar.zzb;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((jZzc >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    zzgzo zzc(zzgzj zzgzjVar, Character ch) {
        return new zzgzn(zzgzjVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    final int zzd(int i) {
        zzgzj zzgzjVar = this.zzb;
        return zzgzjVar.zzc * zzhag.zzb(i, zzgzjVar.zzd, RoundingMode.CEILING);
    }

    final void zze(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzgtr.zzo(i, i + i2, bArr.length);
        zzgzj zzgzjVar = this.zzb;
        int i3 = zzgzjVar.zzd;
        int i4 = 0;
        zzgtr.zza(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zzgzjVar.zzb;
        while (i4 < i2 * 8) {
            appendable.append(zzgzjVar.zza(zzgzjVar.zza & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        Character ch = this.zzc;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    final int zzf(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    public final zzgzo zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    public final zzgzo zzi() {
        zzgzo zzgzoVarZzc = this.zza;
        if (zzgzoVarZzc == null) {
            zzgzj zzgzjVar = this.zzb;
            zzgzj zzgzjVarZzd = zzgzjVar.zzd();
            zzgzoVarZzc = zzgzjVarZzd == zzgzjVar ? this : zzc(zzgzjVarZzd, this.zzc);
            this.zza = zzgzoVarZzc;
        }
        return zzgzoVarZzc;
    }

    zzgzn(String str, String str2, Character ch) {
        this(new zzgzj(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }
}
