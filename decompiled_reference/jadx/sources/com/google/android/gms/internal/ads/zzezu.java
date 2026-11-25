package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzezu implements zzimz {
    private final zzini zza;

    private zzezu(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzezu zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzezu(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzezs zzb() {
        return new zzezs(zzfoi.zzc(), ((zzcnz) this.zza).zza());
    }
}
