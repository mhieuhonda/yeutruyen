package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgzo {
    private static final zzgzo zza = new zzgzl("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzgzo zzb = new zzgzl("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzgzo zzc;

    static {
        new zzgzn("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgzn("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzc = new zzgzk("base16()", "0123456789ABCDEF");
    }

    zzgzo() {
    }

    public static zzgzo zzl() {
        return zza;
    }

    public static zzgzo zzm() {
        return zzb;
    }

    public static zzgzo zzn() {
        return zzc;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgzm;

    abstract int zzd(int i);

    abstract int zzf(int i);

    CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgzo zzh();

    public abstract zzgzo zzi();

    public final String zzj(byte[] bArr, int i, int i2) {
        zzgtr.zzo(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zza(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzf = zzf(charSequenceZzg.length());
            byte[] bArr = new byte[iZzf];
            int iZzb = zzb(bArr, charSequenceZzg);
            if (iZzb == iZzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZzb];
            System.arraycopy(bArr, 0, bArr2, 0, iZzb);
            return bArr2;
        } catch (zzgzm e) {
            throw new IllegalArgumentException(e);
        }
    }
}
