package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnu implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;

    private zzcnu(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
    }

    public static zzcnu zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzcnu(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.util.zzg zzgVarZzb = ((zzcnt) this.zza).zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        zzftn zzftnVarZzb = ((zzfto) this.zzc).zzb();
        Clock clock = (Clock) this.zzd.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzR)).booleanValue()) {
            return new zzfsx(zzgVarZzb, scheduledExecutorService, zzftnVarZzb, clock);
        }
        return null;
    }
}
