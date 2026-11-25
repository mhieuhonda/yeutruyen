package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcmm {
    private final zzcml zza;
    private final zzcmn zzb;

    public zzcmm(zzcmn zzcmnVar, zzcml zzcmlVar) {
        this.zza = zzcmlVar;
        this.zzb = zzcmnVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzcmn zzcmnVar = this.zzb;
        zzbaw zzbawVarZzS = ((zzcmu) zzcmnVar).zzS();
        if (zzbawVarZzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzbar zzbarVarZzb = zzbawVarZzS.zzb();
        if (zzbarVarZzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcmnVar.getContext() != null) {
            return zzbarVarZzb.zzf(zzcmnVar.getContext(), str, ((zzcmw) zzcmnVar).zzE(), zzcmnVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzcmn zzcmnVar = this.zzb;
        zzbaw zzbawVarZzS = ((zzcmu) zzcmnVar).zzS();
        if (zzbawVarZzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzbar zzbarVarZzb = zzbawVarZzS.zzb();
        if (zzbarVarZzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (zzcmnVar.getContext() != null) {
            return zzbarVarZzb.zzj(zzcmnVar.getContext(), ((zzcmw) zzcmnVar).zzE(), zzcmnVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        zzcmn zzcmnVar = this.zzb;
        zzbix.zza(zzcmnVar.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpu)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            zzcmz zzcmzVarZzP = ((zzclb) zzcmnVar).zzP();
            zzdbv zzdbvVarZzK = zzcmzVarZzP != null ? zzcmzVarZzP.zzK() : null;
            if (zzdbvVarZzK != null) {
                long jZza = zzdbvVarZzK.zza();
                if (jZza > 0) {
                    jSONObject.put("plcmtid", jZza);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Error constructing JSON.", e);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(str);
                }
            });
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty, ignoring message");
        }
    }

    final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}
