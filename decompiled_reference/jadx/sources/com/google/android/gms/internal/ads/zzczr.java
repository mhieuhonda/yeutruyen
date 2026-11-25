package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzczr implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzczr(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzczr zza(zzini zziniVar, zzini zziniVar2) {
        return new zzczr(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzczq((Clock) this.zza.zzb(), (zzcfe) this.zzb.zzb());
    }
}
