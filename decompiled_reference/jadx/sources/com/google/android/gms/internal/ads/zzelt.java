package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzelt {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfkn zzc;
    private final zzclb zzd;
    private final zzdzt zze;
    private zzfvg zzf;

    zzelt(Context context, VersionInfoParcel versionInfoParcel, zzfkn zzfknVar, zzclb zzclbVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfknVar;
        this.zzd = zzclbVar;
        this.zze = zzdztVar;
    }

    public final synchronized boolean zza(boolean z) {
        zzclb zzclbVar;
        zzfkn zzfknVar = this.zzc;
        if (zzfknVar.zzT) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgq)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgt)).booleanValue() && (zzclbVar = this.zzd) != null) {
                    if (this.zzf != null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to initialize omid.");
                        return false;
                    }
                    if (zzfknVar.zzV.zzb()) {
                        zzfvg zzfvgVarZzi = com.google.android.gms.ads.internal.zzt.zzu().zzi(this.zzb, zzclbVar.zzD(), true);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgu)).booleanValue()) {
                            zzdzt zzdztVar = this.zze;
                            String str = zzfvgVarZzi != null ? "1" : "0";
                            zzdzs zzdzsVarZza = zzdztVar.zza();
                            zzdzsVarZza.zzc("omid_js_session_success", str);
                            zzdzsVarZza.zzd();
                        }
                        if (zzfvgVarZzi == null) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to create javascript session service.");
                            return false;
                        }
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Created omid javascript session service.");
                        this.zzf = zzfvgVarZzi;
                        zzclbVar.zzal(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized boolean zzb() {
        return this.zzf != null;
    }

    public final synchronized void zzc() {
        zzclb zzclbVar;
        zzfvg zzfvgVar = this.zzf;
        if (zzfvgVar == null || (zzclbVar = this.zzd) == null) {
            return;
        }
        Iterator it = zzclbVar.zzF().iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzk(zzfvgVar, (View) it.next());
        }
        zzclbVar.zze("onSdkLoaded", zzgww.zza());
    }

    public final synchronized void zzd() {
        zzclb zzclbVar;
        if (this.zzf == null || (zzclbVar = this.zzd) == null) {
            return;
        }
        zzclbVar.zze("onSdkImpression", zzgww.zza());
    }

    public final synchronized void zze(zzfvf zzfvfVar) {
        zzclb zzclbVar;
        zzfvg zzfvgVar = this.zzf;
        if (zzfvgVar == null || (zzclbVar = this.zzd) == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzj(zzfvgVar, zzfvfVar);
        this.zzf = null;
        zzclbVar.zzal(null);
    }

    public final synchronized void zzf(View view) {
        zzfvg zzfvgVar = this.zzf;
        if (zzfvgVar != null) {
            com.google.android.gms.ads.internal.zzt.zzu().zzk(zzfvgVar, view);
        }
    }
}
