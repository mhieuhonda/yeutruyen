package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdaj implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdaj(zzdai zzdaiVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdaj zza(zzdai zzdaiVar, zzini zziniVar, zzini zziniVar2) {
        return new zzdaj(zzdaiVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zza.zzb(), (zzcdu) this.zzb.zzb(), null);
    }
}
