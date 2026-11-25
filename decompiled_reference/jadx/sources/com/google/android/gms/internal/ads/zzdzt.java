package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzt {
    private final zzdzy zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdzt(zzdzy zzdzyVar, Executor executor) {
        this.zza = zzdzyVar;
        this.zzc = zzdzyVar.zza();
        this.zzb = executor;
    }

    public final zzdzs zza() {
        zzdzs zzdzsVar = new zzdzs(this);
        zzdzsVar.zzj();
        return zzdzsVar;
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznn)).booleanValue()) {
            zzdzs zzdzsVarZza = zza();
            zzdzsVarZza.zzc("action", "pecr");
            zzdzsVarZza.zzd();
        }
    }

    final /* synthetic */ zzdzy zzc() {
        return this.zza;
    }

    final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
