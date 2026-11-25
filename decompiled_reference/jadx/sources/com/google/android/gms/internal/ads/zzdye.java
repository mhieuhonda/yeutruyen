package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdye implements zzimz {
    private final zzini zza;

    private zzdye(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzdye zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdye(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzhcp zzhcpVarZzc = zzfoi.zzc();
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgk)).booleanValue() ? Collections.singleton(new zzdky(((zzdyx) this.zza).zzb(), zzhcpVarZzc)) : Collections.emptySet();
        zzinh.zzb(setSingleton);
        return setSingleton;
    }
}
