package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeoe implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeoe(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeoe zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzeoe(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeod zzb() {
        return new zzeod((Context) this.zza.zzb(), (zzdno) this.zzb.zzb());
    }
}
