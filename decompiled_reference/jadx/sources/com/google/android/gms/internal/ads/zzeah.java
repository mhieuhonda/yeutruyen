package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeah implements zzimz {
    private final zzini zza;

    private zzeah(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzeah zza(zzini zziniVar) {
        return new zzeah(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeag((Clock) this.zza.zzb());
    }
}
