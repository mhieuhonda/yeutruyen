package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.exifinterface.media.ExifInterface;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdrw {
    private final zzdwq zza;
    private final zzdvf zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdrw(zzdwq zzdwqVar, zzdvf zzdvfVar) {
        this.zza = zzdwqVar;
        this.zzb = zzdvfVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzclq {
        zzclb zzclbVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zzclbVarZza.zzE().setVisibility(4);
        zzclbVarZza.zzE().setContentDescription("policy_validator");
        zzclbVarZza.zzab("/sendMessageToSdk", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrv
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzclb) obj, map);
            }
        });
        zzclbVarZza.zzab("/hideValidatorOverlay", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrq
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzclb) obj, map);
            }
        });
        zzclbVarZza.zzab("/open", new zzbqk(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzclbVarZza);
        zzbpx zzbpxVar = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrr
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd(view, windowManager, (zzclb) obj, map);
            }
        };
        zzdvf zzdvfVar = this.zzb;
        zzdvfVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzbpxVar);
        zzdvfVar.zzh(new WeakReference(zzclbVarZza), "/showValidatorOverlay", zzdrs.zza);
        return zzclbVarZza.zzE();
    }

    final /* synthetic */ void zzb(zzclb zzclbVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(WindowManager windowManager, View view, zzclb zzclbVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hide native ad policy validator overlay.");
        zzclbVar.zzE().setVisibility(8);
        if (zzclbVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzclbVar.zzE());
        }
        zzclbVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zzd(final View view, final WindowManager windowManager, zzclb zzclbVar, final Map map) {
        final zzclb zzclbVar2;
        zzclbVar.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdru
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
                this.zza.zze(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjw)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjx)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzclbVar.zzaf(zzcnl.zzc(iZzf, iZzf2));
        try {
            zzclbVar.zzD().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjy)).booleanValue());
            zzclbVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjz)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzk = com.google.android.gms.ads.internal.util.zzbs.zzk();
        layoutParamsZzk.x = iZzf3;
        layoutParamsZzk.y = iZzf4;
        windowManager.updateViewLayout(zzclbVar.zzE(), layoutParamsZzk);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || ExifInterface.GPS_MEASUREMENT_2D.equals(str)) ? rect.bottom : rect.top) - iZzf4;
            zzclbVar2 = zzclbVar;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdrt
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final /* synthetic */ void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzclb zzclbVar3 = zzclbVar2;
                        if (zzclbVar3.zzE().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        WindowManager.LayoutParams layoutParams = layoutParamsZzk;
                        String str2 = str;
                        if ("1".equals(str2) || ExifInterface.GPS_MEASUREMENT_2D.equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(zzclbVar3.zzE(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        } else {
            zzclbVar2 = zzclbVar;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzclbVar2.loadUrl(str2);
    }

    final /* synthetic */ void zze(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", map2);
    }
}
