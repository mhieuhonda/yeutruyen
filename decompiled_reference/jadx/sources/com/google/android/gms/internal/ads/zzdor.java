package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdor implements zzbpx {
    private final WeakReference zza;

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzdov zzdovVar = (zzdov) this.zza.get();
        if (zzdovVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzdovVar.zzD().onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzms)).booleanValue()) {
                zzdovVar.zzE().zzdu();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdovVar.zzE().zzdR();
            }
        }
    }
}
