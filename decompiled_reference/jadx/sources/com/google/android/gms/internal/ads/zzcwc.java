package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwc implements zzimz {
    private final zzcvz zza;

    private zzcwc(zzcvz zzcvzVar) {
        this.zza = zzcvzVar;
    }

    public static zzcwc zzc(zzcvz zzcvzVar) {
        return new zzcwc(zzcvzVar);
    }

    public static zzfko zzd(zzcvz zzcvzVar) {
        zzfko zzfkoVarZzd = zzcvzVar.zzd();
        zzinh.zzb(zzfkoVarZzd);
        return zzfkoVarZzd;
    }

    public final zzfko zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
