package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzibm {
    private final zzibk zza;

    private zzibm(zzibk zzibkVar) {
        this.zza = zzibkVar;
    }

    public static zzibm zza(byte[] bArr, zzhey zzheyVar) {
        return new zzibm(zzibk.zza(bArr));
    }

    public static zzibm zzb(int i) {
        return new zzibm(zzibk.zza(zzhoc.zza(i)));
    }

    public final byte[] zzc(zzhey zzheyVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
