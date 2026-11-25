package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgzk extends zzgzn {
    final char[] zza;

    private zzgzk(zzgzj zzgzjVar) {
        super(zzgzjVar, null);
        this.zza = new char[512];
        zzgtr.zza(zzgzjVar.zzf().length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzgzjVar.zza(i >>> 4);
            this.zza[i | 256] = zzgzjVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzn, com.google.android.gms.internal.ads.zzgzo
    final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzgtr.zzo(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i4]);
            appendable.append(cArr[i4 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzn, com.google.android.gms.internal.ads.zzgzo
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgzm {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new zzgzm(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            zzgzj zzgzjVar = this.zzb;
            bArr[i2] = (byte) (zzgzjVar.zzc(charSequence.charAt(i + 1)) | (zzgzjVar.zzc(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzn
    final zzgzo zzc(zzgzj zzgzjVar, Character ch) {
        return new zzgzk(zzgzjVar);
    }

    zzgzk(String str, String str2) {
        this(new zzgzj("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
