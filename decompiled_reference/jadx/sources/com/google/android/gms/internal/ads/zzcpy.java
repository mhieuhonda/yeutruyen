package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcpy implements zzfis {
    private final zzcpe zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    /* synthetic */ zzcpy(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final zzfit zza() {
        zzinh.zzc(this.zzb, Context.class);
        zzinh.zzc(this.zzc, String.class);
        zzinh.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcpz(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final /* bridge */ /* synthetic */ zzfis zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final /* bridge */ /* synthetic */ zzfis zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final /* bridge */ /* synthetic */ zzfis zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
