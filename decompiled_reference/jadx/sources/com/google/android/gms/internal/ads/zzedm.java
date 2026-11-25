package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzedm extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ BaseAdView zzb;
    final /* synthetic */ zzedw zzc;

    zzedm(zzedw zzedwVar, String str, BaseAdView baseAdView) {
        this.zza = str;
        this.zzb = baseAdView;
        Objects.requireNonNull(zzedwVar);
        this.zzc = zzedwVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzc.zzg(zzedw.zzm(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzc.zzf(this.zza, this.zzb);
    }
}
