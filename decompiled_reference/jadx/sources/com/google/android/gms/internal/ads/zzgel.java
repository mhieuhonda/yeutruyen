package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgel {
    public static String zza(byte[] bArr, boolean z) {
        return zzc(z).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(String str, boolean z) throws IllegalArgumentException {
        byte[] bArrZzk = zzc(z).zzk(str);
        if (bArrZzk.length != 0 || str.length() <= 0) {
            return bArrZzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static zzgzo zzc(boolean z) {
        return z ? zzgzo.zzm().zzh() : zzgzo.zzl();
    }
}
