package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzcop;
import com.google.android.gms.internal.ads.zzcri;
import com.google.android.gms.internal.ads.zzexz;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzb implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzb(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar4;
    }

    public static zzb zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzb(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zza(((zzcnz) this.zza).zza(), zzcri.zza(), zzexz.zzc(), ((zzcop) this.zzb).zza());
    }
}
