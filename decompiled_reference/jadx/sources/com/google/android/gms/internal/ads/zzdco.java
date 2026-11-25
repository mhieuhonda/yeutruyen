package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdco implements zzimz {
    private final zzini zza;

    private zzdco(zzdcj zzdcjVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdco zzc(zzdcj zzdcjVar, zzini zziniVar) {
        return new zzdco(zzdcjVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String strZzp = ((zzczq) this.zza.zzb()).zzp();
        zzinh.zzb(strZzp);
        return strZzp;
    }
}
