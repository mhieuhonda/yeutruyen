package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcxs {
    private final zzdga zza;
    private final zzdif zzb;

    public zzcxs(zzdga zzdgaVar, zzdif zzdifVar) {
        this.zza = zzdgaVar;
        this.zzb = zzdifVar;
    }

    public final zzdga zza() {
        return this.zza;
    }

    final zzdky zzb() {
        zzdif zzdifVar = this.zzb;
        return zzdifVar != null ? new zzdky(zzdifVar, zzcfy.zzh) : new zzdky(new zzcxr(this), zzcfy.zzh);
    }

    final zzdif zzc() {
        return this.zzb;
    }
}
