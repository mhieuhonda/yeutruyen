package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdot implements zzbpx {
    private final WeakReference zza;
    private final WeakReference zzb;

    /* synthetic */ zzdot(zzdov zzdovVar, View view, byte[] bArr) {
        this.zza = new WeakReference(zzdovVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoE)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzdov zzdovVar = (zzdov) this.zza.get();
        if (zzdovVar == null) {
            return;
        }
        zzdovVar.zzC().zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoE)).booleanValue()) {
            zzdovVar.zzB((View) this.zzb.get());
        }
    }
}
