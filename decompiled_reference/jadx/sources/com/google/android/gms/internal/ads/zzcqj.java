package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcqj implements com.google.android.gms.ads.nonagon.signalgeneration.zzw {
    private final zzcpe zza;
    private zzdcj zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzat zzc;

    /* synthetic */ zzcqj(zzcpe zzcpeVar, byte[] bArr) {
        this.zza = zzcpeVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzx zza() {
        zzinh.zzc(this.zzb, zzdcj.class);
        zzinh.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzat.class);
        return new zzcqk(this.zza, this.zzc, new zzczg(), new zzdbi(), new zzeai(), this.zzb, null, null);
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzw zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzat zzatVar) {
        this.zzc = zzatVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzw zzc(zzdcj zzdcjVar) {
        this.zzb = zzdcjVar;
        return this;
    }
}
