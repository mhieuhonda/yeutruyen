package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzm implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzm(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzm zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzm(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzj(((zzcnz) this.zza).zza(), (zzdzy) this.zzb.zzb(), zzfoi.zzc());
    }
}
