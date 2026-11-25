package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzgre;
import com.google.android.gms.internal.ads.zzgrf;
import com.google.android.gms.internal.ads.zzgrg;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.android.gms.internal.ads.zzgsc;
import com.google.android.gms.internal.ads.zzgsd;
import com.google.android.gms.internal.ads.zzgse;
import com.google.android.gms.internal.ads.zzgsf;
import com.google.android.gms.internal.ads.zzgss;
import com.tekartik.sqflite.Constant;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzz {
    private zzgsd zzf;
    private zzclb zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzgrg zzd = null;
    private String zzb = null;

    private final void zzl() {
        if (this.zzf == null) {
            this.zzf = new zzx(this);
        }
    }

    private final zzgsf zzm() {
        zzgse zzgseVarZzc = zzgsf.zzc();
        if (!((Boolean) zzba.zzc().zzd(zzbix.zznh)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzgseVarZzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgseVarZzc.zzb(this.zzb);
        }
        return zzgseVarZzc.zzc();
    }

    public final synchronized void zza(zzclb zzclbVar, Context context) {
        this.zzc = zzclbVar;
        if (!zzb(context)) {
            zzg("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        zzi("on_play_store_bind", map);
    }

    public final synchronized boolean zzb(Context context) {
        if (!zzgss.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzgrh.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzl();
        this.zze = true;
        return true;
    }

    public final void zzc(zzclb zzclbVar, zzgsa zzgsaVar) {
        if (zzclbVar == null) {
            zzg("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzclbVar;
        if (!this.zze && !zzb(zzclbVar.getContext())) {
            zzg("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zznh)).booleanValue()) {
            this.zzb = zzgsaVar.zzb();
        }
        zzl();
        zzgrg zzgrgVar = this.zzd;
        if (zzgrgVar != null) {
            zzgrgVar.zza(zzgsaVar, this.zzf);
        }
    }

    final void zzg(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put(Constant.PARAM_ERROR_MESSAGE, str);
            map.put("action", str2);
            zzi("onError", map);
        }
    }

    final void zzh(String str) {
        zzi(str, new HashMap());
    }

    final void zzi(final String str, final Map map) {
        zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk(str, map);
            }
        });
    }

    final void zzj(zzgsc zzgscVar) {
        if (!TextUtils.isEmpty(zzgscVar.zzb())) {
            if (!((Boolean) zzba.zzc().zzd(zzbix.zznh)).booleanValue()) {
                this.zza = zzgscVar.zzb();
            }
        }
        switch (zzgscVar.zza()) {
            case 8152:
                zzh("onLMDOverlayOpened");
                break;
            case 8153:
                zzh("onLMDOverlayClicked");
                break;
            case 8155:
                zzh("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put(Constant.PARAM_ERROR, String.valueOf(zzgscVar.zza()));
                zzi("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    final /* synthetic */ void zzk(String str, Map map) {
        zzclb zzclbVar = this.zzc;
        if (zzclbVar != null) {
            zzclbVar.zze(str, map);
        }
    }

    public final void zzd() {
        zzgrg zzgrgVar;
        if (!this.zze || (zzgrgVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgrgVar.zzd(zzm(), this.zzf);
            zzh("onLMDOverlayExpand");
        }
    }

    public final void zze() {
        zzgrg zzgrgVar;
        if (!this.zze || (zzgrgVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgrgVar.zzc(zzm(), this.zzf);
            zzh("onLMDOverlayCollapse");
        }
    }

    public final void zzf() {
        zzgrg zzgrgVar;
        if (!this.zze || (zzgrgVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzgre zzgreVarZzc = zzgrf.zzc();
        if (!((Boolean) zzba.zzc().zzd(zzbix.zznh)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzgreVarZzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgreVarZzc.zzb(this.zzb);
        }
        zzgrgVar.zzb(zzgreVarZzc.zzc(), this.zzf);
    }
}
