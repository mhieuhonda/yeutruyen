package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdge implements zzimz {
    private final zzini zza;

    private zzdge(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdge zzc(zzini zziniVar) {
        return new zzdge(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdgd zzb() {
        return new zzdgd(((zzinl) this.zza).zzb());
    }
}
