package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfep implements zzimz {
    private final zzini zza;

    private zzfep(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar3;
    }

    public static zzfep zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzfep(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfen zzb() {
        return new zzfen(zzcrp.zza(), zzfoi.zzc(), ((zzfey) this.zza).zza());
    }
}
