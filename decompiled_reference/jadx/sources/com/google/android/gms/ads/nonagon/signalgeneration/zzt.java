package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzt implements zzimz {
    private final zzini zza;

    private zzt(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzt zza(zzini zziniVar) {
        return new zzt(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzq((zzdzy) this.zza.zzb());
    }
}
