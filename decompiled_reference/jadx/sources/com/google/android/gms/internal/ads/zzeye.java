package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeye implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzeye(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar4;
    }

    public static zzeye zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzeye(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzexg(((zzfci) this.zza).zzb(), ((Long) zzbkm.zzg.zze()).longValue(), (Clock) this.zzb.zzb(), zzfoi.zzc(), (zzdzt) this.zzc.zzb());
    }
}
