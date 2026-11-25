package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyq implements zzimz {
    private final zzini zza;

    private zzeyq(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzeyq zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeyq(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgxd zzgxdVarZzh;
        zzexi zzexiVarZzc = zzexk.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfg)).booleanValue()) {
            zzgxdVarZzh = zzgxd.zzi(new zzfbe(zzexiVarZzc, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfh)).intValue(), scheduledExecutorService));
        } else {
            zzgxdVarZzh = zzgxd.zzh();
        }
        zzinh.zzb(zzgxdVarZzh);
        return zzgxdVarZzh;
    }
}
