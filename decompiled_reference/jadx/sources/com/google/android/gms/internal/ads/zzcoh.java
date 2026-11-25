package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcoh implements zzimz {
    private final zzini zza;

    private zzcoh(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzcoh zza(zzini zziniVar, zzini zziniVar2) {
        return new zzcoh(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzct)).booleanValue() ? Collections.singleton(new zzdky((zzecg) this.zza.zzb(), zzfoi.zzc())) : Collections.emptySet();
        zzinh.zzb(setSingleton);
        return setSingleton;
    }
}
