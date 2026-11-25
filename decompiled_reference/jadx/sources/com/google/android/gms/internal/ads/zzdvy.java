package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzdvy extends zzdcg {
    @Override // com.google.android.gms.internal.ads.zzdcg
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    zzdvz zzh();

    zzdvy zzb(zzfhm zzfhmVar);

    zzdvy zzc(zzfii zzfiiVar);

    zzdvy zzd(zzdcj zzdcjVar);

    zzdvy zze(zzdiz zzdizVar);

    @Override // com.google.android.gms.internal.ads.zzdcg
    /* bridge */ /* synthetic */ default zzdcg zzi(zzfhm zzfhmVar) {
        zzb(zzfhmVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    /* bridge */ /* synthetic */ default zzdcg zzj(zzfii zzfiiVar) {
        zzc(zzfiiVar);
        return this;
    }
}
