package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdun implements zzbly {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzduo zzb;

    zzdun(zzduo zzduoVar, String str) {
        Objects.requireNonNull(zzduoVar);
        this.zzb = zzduoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zza() {
        zzduo zzduoVar = this.zzb;
        if (zzduoVar.zzc() != null) {
            zzduoVar.zzc().zza(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzb(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final JSONObject zzd() {
        return null;
    }
}
