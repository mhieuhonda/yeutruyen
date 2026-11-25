package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfhk implements zzfnp {
    public final zzfid zza;
    public final zzfif zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzx zzf;
    public final zzfnf zzg;

    public zzfhk(zzfid zzfidVar, zzfif zzfifVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzx zzxVar, zzfnf zzfnfVar) {
        this.zza = zzfidVar;
        this.zzb = zzfifVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzxVar;
        this.zzg = zzfnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnp
    public final Executor zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnp
    public final zzfnf zzb() {
        return this.zzg;
    }
}
