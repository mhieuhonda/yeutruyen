package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcsv implements zzimz {
    private final zzini zza;

    private zzcsv(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcsv zza(zzini zziniVar) {
        return new zzcsv(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcsu((DeviceTierManager) this.zza.zzb());
    }
}
