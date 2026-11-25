package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcq implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzgcq(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar3;
    }

    public static zzgcq zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzgcq(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgcp zzb() {
        return new zzgcp((DataStore) this.zza.zzb(), zzcob.zzc(), (zzdxe) this.zzb.zzb(), new zzgbo());
    }
}
