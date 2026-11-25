package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwf implements zzimz {
    private final zzcvz zza;
    private final zzini zzb;

    private zzcwf(zzcvz zzcvzVar, zzini zziniVar) {
        this.zza = zzcvzVar;
        this.zzb = zziniVar;
    }

    public static zzcwf zzc(zzcvz zzcvzVar, zzini zziniVar) {
        return new zzcwf(zzcvzVar, zziniVar);
    }

    public static zzcvs zzd(zzcvz zzcvzVar, Object obj) {
        return (zzcvv) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcvs zzb() {
        return ((zzcvw) this.zzb).zzb();
    }
}
