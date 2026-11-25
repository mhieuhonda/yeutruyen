package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyv implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeyv(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeyv zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeyv(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbe(((zzezy) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoi)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
