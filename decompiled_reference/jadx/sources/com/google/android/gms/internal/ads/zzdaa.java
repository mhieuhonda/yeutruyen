package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdaa implements com.google.android.gms.ads.internal.client.zza {
    private final zzdae zza;
    private final zzflg zzb;

    zzdaa(zzdae zzdaeVar, zzflg zzflgVar) {
        this.zza = zzdaeVar;
        this.zzb = zzflgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
