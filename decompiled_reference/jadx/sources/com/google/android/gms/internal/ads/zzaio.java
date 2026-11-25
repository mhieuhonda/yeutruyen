package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzaio {
    protected final zzahm zza;

    protected zzaio(zzahm zzahmVar) {
        this.zza = zzahmVar;
    }

    protected abstract boolean zza(zzeu zzeuVar) throws zzat;

    protected abstract boolean zzb(zzeu zzeuVar, long j) throws zzat;

    public final boolean zzf(zzeu zzeuVar, long j) throws zzat {
        return zza(zzeuVar) && zzb(zzeuVar, j);
    }
}
