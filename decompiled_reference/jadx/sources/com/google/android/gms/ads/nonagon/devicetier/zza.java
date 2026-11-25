package com.google.android.gms.ads.nonagon.devicetier;

import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zza implements zzimz {
    private final zzini zza;

    private zza(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zza zza(zzini zziniVar) {
        return new zza(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DeviceTierManager(((zzcnz) this.zza).zza());
    }
}
