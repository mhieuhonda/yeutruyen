package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevi implements zzimz {
    private final zzini zza;

    private zzevi(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzevi zza(zzini zziniVar) {
        return new zzevi(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevh((Set) this.zza.zzb());
    }
}
