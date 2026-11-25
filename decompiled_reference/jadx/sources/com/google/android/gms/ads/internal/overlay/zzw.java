package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzw extends zzm {
    public zzw(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzm, com.google.android.gms.internal.ads.zzbzi
    public final void zzh(Bundle bundle) {
        com.google.android.gms.ads.internal.util.zze.zza("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzo = 4;
        this.zzb.finish();
    }
}
