package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcyr implements zzimz {
    private final zzcyq zza;

    private zzcyr(zzcyq zzcyqVar) {
        this.zza = zzcyqVar;
    }

    public static zzcyr zzc(zzcyq zzcyqVar) {
        return new zzcyr(zzcyqVar);
    }

    public static zzfkn zzd(zzcyq zzcyqVar) {
        zzfkn zzfknVarZzb = zzcyqVar.zzb();
        zzinh.zzb(zzfknVarZzb);
        return zzfknVarZzb;
    }

    public final zzfkn zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
