package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcea implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcea(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcea zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzcea(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcdz zzb() {
        return new zzcdz((Clock) this.zza.zzb(), (zzcdx) this.zzb.zzb());
    }
}
