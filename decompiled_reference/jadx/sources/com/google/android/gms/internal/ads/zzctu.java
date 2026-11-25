package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzctu implements zzddc {
    private final zzfkq zza;
    private final zzfky zzb;
    private final zzfsi zzc;
    private final zzfsm zzd;

    public zzctu(zzfky zzfkyVar, zzfsm zzfsmVar, zzfsi zzfsiVar) {
        this.zzb = zzfkyVar;
        this.zzd = zzfsmVar;
        this.zzc = zzfsiVar;
        this.zza = zzfkyVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zza(this.zzc.zza(this.zzb, null, list), null);
    }
}
