package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdsr implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdsr(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdsr zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzdsr(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdsq((com.google.android.gms.ads.internal.util.zzbl) this.zza.zzb(), (Clock) this.zzb.zzb(), zzfoi.zzc());
    }
}
