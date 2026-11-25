package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdds implements zzimz {
    private final zzini zza;

    private zzdds(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdds zza(zzini zziniVar) {
        return new zzdds(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddr(((zzinl) this.zza).zzb());
    }
}
