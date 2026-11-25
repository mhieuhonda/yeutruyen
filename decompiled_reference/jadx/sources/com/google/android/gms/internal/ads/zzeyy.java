package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyy implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzeyy(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
    }

    public static zzeyy zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzeyy(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfbe zzfbeVar;
        zzfal zzfalVarZzc = zzfan.zzc();
        zzexg zzexgVar = (zzexg) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            zzfbeVar = new zzfbe(zzexgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznR)).intValue(), scheduledExecutorService);
        } else {
            zzfbeVar = new zzfbe(zzfalVarZzc, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznR)).intValue(), scheduledExecutorService);
        }
        return zzfbeVar;
    }
}
