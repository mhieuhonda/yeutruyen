package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdf implements zzimz {
    private final zzini zza;

    private zzgdf(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzgdf zza(zzini zziniVar) {
        return new zzgdf(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzhcp zzhcpVarZzb = zzhcw.zzb((ExecutorService) this.zza.zzb());
        zzinh.zzb(zzhcpVarZzb);
        return zzhcpVarZzb;
    }
}
