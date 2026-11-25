package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyt implements zzimz {
    private final zzini zza;

    private zzeyt(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzeyt zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeyt(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbe(zzezq.zzc(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznU)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}
