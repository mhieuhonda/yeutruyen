package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdky;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzax implements zzimz {
    private final zzini zza;

    private zzax(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzax zza(zzini zziniVar, zzini zziniVar2) {
        return new zzax(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzr) this.zza.zzb(), zzfoi.zzc());
    }
}
