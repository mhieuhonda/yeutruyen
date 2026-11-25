package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdeq implements zzimz {
    private final zzini zza;

    private zzdeq(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdeq zzc(zzini zziniVar) {
        return new zzdeq(zziniVar);
    }

    public static zzdep zzd(Set set) {
        return new zzdep(set);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdep zzb() {
        return new zzdep(((zzinl) this.zza).zzb());
    }
}
