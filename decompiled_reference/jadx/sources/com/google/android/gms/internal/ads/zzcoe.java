package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcoe implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcoe(zzcns zzcnsVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcoe zza(zzcns zzcnsVar, zzini zziniVar, zzini zziniVar2) {
        return new zzcoe(zzcnsVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdN)).booleanValue() ? new zzbaw((zzbar) this.zzb.zzb()) : new zzbaw((zzbar) this.zza.zzb());
    }
}
