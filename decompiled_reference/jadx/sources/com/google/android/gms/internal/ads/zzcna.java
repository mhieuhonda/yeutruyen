package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcna {
    private Profile zza = null;

    zzcna() {
    }

    public final void zza(WebView webView) {
        if (this.zza != null) {
            try {
                WebViewCompat.setProfile(webView, "GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e) {
                String strConcat = "WebViewCompat error: ".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpJ)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "WebViewCompat.setProfile");
                }
            }
        }
    }

    final void zzb(zzcne zzcneVar) {
        ProfileStore profileStore;
        if (!WebViewFeature.isFeatureSupported("MULTI_PROFILE")) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzgbc.zza("androidx.webkit.ProfileStore", "getInstance", new zzgbb[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e) {
            String message = e.getMessage();
            String.valueOf(message);
            String strValueOf = String.valueOf(message);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(strValueOf));
            try {
                profileStore = (ProfileStore) zzgbc.zza("androidx.webkit.ProfileStore$-CC", "getInstance", new zzgbb[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e2) {
                String message2 = e2.getMessage();
                String.valueOf(message2);
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(message2)));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpI)).booleanValue()) {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzcneVar.zza;
                zzdzs zzdzsVarZza = zzcneVar.zzb.zzd().zza();
                zzdzsVarZza.zzc("action", "webview_p_l");
                zzdzsVarZza.zzc("webview_p_l", Long.toString(jElapsedRealtime));
                zzdzsVarZza.zzd();
                return;
            }
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpI)).booleanValue()) {
            zzdzs zzdzsVarZza2 = zzcneVar.zzb.zzd().zza();
            zzdzsVarZza2.zzc("action", "webview_p_f");
            zzdzsVarZza2.zzc("webview_p_f", "No instance");
            zzdzsVarZza2.zzd();
        }
    }
}
