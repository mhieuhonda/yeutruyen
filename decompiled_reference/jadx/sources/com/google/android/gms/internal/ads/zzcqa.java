package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcqa implements zzehq {
    private final zzcpe zza;
    private Context zzb;

    /* synthetic */ zzcqa(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final zzehr zza() {
        zzinh.zzc(this.zzb, Context.class);
        return new zzcqb(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final /* bridge */ /* synthetic */ zzehq zzb(Context context) {
        this.zzb = context;
        return this;
    }
}
