package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcvr implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzcvr(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzcvr zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcvr(zziniVar, zziniVar2, zziniVar3);
    }

    public static zzdga zzd(ScheduledExecutorService scheduledExecutorService, Clock clock, zzdzt zzdztVar) {
        return new zzdga(scheduledExecutorService, clock, zzdztVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdga zzb() {
        return zzd((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb(), (zzdzt) this.zzc.zzb());
    }
}
