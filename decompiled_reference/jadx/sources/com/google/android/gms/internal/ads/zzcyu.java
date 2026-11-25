package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcyu implements zzimz {
    private final zzcyq zza;

    private zzcyu(zzcyq zzcyqVar) {
        this.zza = zzcyqVar;
    }

    public static zzcyu zzc(zzcyq zzcyqVar) {
        return new zzcyu(zzcyqVar);
    }

    public static zzfky zzd(zzcyq zzcyqVar) {
        zzfky zzfkyVarZza = zzcyqVar.zza();
        zzinh.zzb(zzfkyVarZza);
        return zzfkyVarZza;
    }

    public final zzfky zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
