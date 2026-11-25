package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfun implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;
    private final zzini zzg;
    private final zzini zzh;

    private zzfun(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar6;
        this.zzg = zziniVar7;
        this.zzh = zziniVar8;
    }

    public static zzfun zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8) {
        return new zzfun(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfum(((zzcnz) this.zza).zza(), ((zzcop) this.zzb).zza(), (ScheduledExecutorService) this.zzc.zzb(), (zzfow) this.zzd.zzb(), ((zzcrj) this.zze).zzb(), (Clock) this.zzf.zzb(), (zzfsx) this.zzg.zzb(), ((zzfto) this.zzh).zzb());
    }
}
