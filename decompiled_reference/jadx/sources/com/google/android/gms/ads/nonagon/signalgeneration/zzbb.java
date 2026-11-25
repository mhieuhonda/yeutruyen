package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzefo;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbb implements zzimz {
    private final zzini zza;

    private zzbb(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzbb zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzbb(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzba zzb() {
        return new zzba(zzfoi.zzc(), ((zzefo) this.zza).zzb());
    }
}
