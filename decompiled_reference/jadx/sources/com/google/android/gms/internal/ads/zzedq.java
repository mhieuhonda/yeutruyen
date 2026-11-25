package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzedq extends AdListener {
    final /* synthetic */ zzedw zza;

    zzedq(zzedw zzedwVar) {
        Objects.requireNonNull(zzedwVar);
        this.zza = zzedwVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zzg(zzedw.zzm(loadAdError));
    }
}
