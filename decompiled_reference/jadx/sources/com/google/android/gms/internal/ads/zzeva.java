package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeva implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeva(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar3;
    }

    public static zzeva zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzeva(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeuy((ListenableFuture) this.zza.zzb(), zzfoi.zzc(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
