package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyw implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;

    private zzeyw(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
    }

    public static zzeyw zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzeyw(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfbe zzfbeVar;
        zzfad zzfadVarZzb = ((zzfaf) this.zza).zzb();
        zzexg zzexgVar = (zzexg) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("60")) {
            zzfbeVar = new zzfbe(zzexgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoz)).intValue(), scheduledExecutorService);
        } else {
            zzfbeVar = new zzfbe(zzfadVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoz)).intValue(), scheduledExecutorService);
        }
        return zzfbeVar;
    }
}
