package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcxn implements zzden, zzddt {
    private final Context zza;
    private final zzclb zzb;
    private final zzfkn zzc;
    private final VersionInfoParcel zzd;
    private zzelv zze;
    private boolean zzf;
    private final zzelt zzg;

    public zzcxn(Context context, zzclb zzclbVar, zzfkn zzfknVar, VersionInfoParcel versionInfoParcel, zzelt zzeltVar) {
        this.zza = context;
        this.zzb = zzclbVar;
        this.zzc = zzfknVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzeltVar;
    }

    private final synchronized void zza() {
        zzclb zzclbVar;
        zzels zzelsVar;
        zzelr zzelrVar;
        zzfkn zzfknVar = this.zzc;
        if (zzfknVar.zzT && (zzclbVar = this.zzb) != null) {
            if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
                int i = versionInfoParcel.buddyApkVersion;
                int i2 = versionInfoParcel.clientJarVersion;
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                String string = sb.toString();
                zzflj zzfljVar = zzfknVar.zzV;
                String strZza = zzfljVar.zza();
                if (zzfljVar.zzc() == 1) {
                    zzelrVar = zzelr.VIDEO;
                    zzelsVar = zzels.DEFINED_BY_JAVASCRIPT;
                } else {
                    int i3 = zzfknVar.zze;
                    zzelr zzelrVar2 = zzelr.HTML_DISPLAY;
                    zzelsVar = i3 == 1 ? zzels.ONE_PIXEL : zzels.BEGIN_TO_RENDER;
                    zzelrVar = zzelrVar2;
                }
                zzelv zzelvVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzclbVar.zzD(), "", "javascript", strZza, zzelsVar, zzelrVar, zzfknVar.zzal);
                this.zze = zzelvVarZzc;
                if (zzelvVarZzc != null) {
                    zzfuu zzfuuVarZza = zzelvVarZzc.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgs)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfuuVarZza, zzclbVar.zzD());
                        Iterator it = zzclbVar.zzF().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzfuuVarZza, (View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfuuVarZza, zzclbVar.zzE());
                    }
                    zzclbVar.zzak(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzu().zze(zzfuuVarZza);
                    this.zzf = true;
                    zzclbVar.zze("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgt)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzdr() {
        zzclb zzclbVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzclbVar = this.zzb) == null) {
            return;
        }
        zzclbVar.zze("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
