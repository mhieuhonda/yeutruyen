package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzejc implements zzimz {
    private final zzini zza;

    private zzejc(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzejc zza(zzini zziniVar, zzini zziniVar2) {
        return new zzejc(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky(((zzejy) this.zza).zzb(), zzfoi.zzc());
    }
}
