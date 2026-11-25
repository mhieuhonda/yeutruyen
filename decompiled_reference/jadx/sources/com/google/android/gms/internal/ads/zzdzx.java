package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzx implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzdzx(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzdzx zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzdzx(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdzw((zzdzo) this.zza.zzb(), ((zzinl) this.zzb).zzb(), (Clock) this.zzc.zzb());
    }
}
