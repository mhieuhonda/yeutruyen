package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbok extends zzbns {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbok(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    final /* synthetic */ OnAdManagerAdViewLoadedListener zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zze(com.google.android.gms.ads.internal.client.zzbu zzbuVar, IObjectWrapper iObjectWrapper) {
        if (zzbuVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbuVar.zzw() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbuVar.zzw();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzk() : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        try {
            if (zzbuVar.zzv() instanceof zzbfm) {
                zzbfm zzbfmVar = (zzbfm) zzbuVar.zzv();
                adManagerAdView.setAppEventListener(zzbfmVar != null ? zzbfmVar.zzc() : null);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzboj(this, adManagerAdView, zzbuVar));
    }
}
