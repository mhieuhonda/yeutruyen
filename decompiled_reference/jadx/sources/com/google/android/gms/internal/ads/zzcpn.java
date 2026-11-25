package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcpn implements zzfhc {
    private final zzcpe zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    /* synthetic */ zzcpn(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final zzfhd zza() {
        zzinh.zzc(this.zzb, Context.class);
        zzinh.zzc(this.zzc, String.class);
        zzinh.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcpo(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
