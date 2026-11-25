package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyp implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeyp(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeyp zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeyp(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbe(((zzexc) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznW)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
