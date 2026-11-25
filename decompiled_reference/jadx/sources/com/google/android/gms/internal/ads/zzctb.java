package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzctb implements zzimz {
    private final zzini zza;

    private zzctb(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzctb zza(zzini zziniVar) {
        return new zzctb(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcta(((zzcnt) this.zza).zzb());
    }
}
