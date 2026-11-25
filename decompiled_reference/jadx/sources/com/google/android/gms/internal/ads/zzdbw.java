package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbw implements zzimz {
    private final zzini zza;

    private zzdbw(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdbw zza(zzini zziniVar) {
        return new zzdbw(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdbv(((zzcyu) this.zza).zza());
    }
}
