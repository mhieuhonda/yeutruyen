package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnx implements zzden, com.google.android.gms.ads.internal.overlay.zzr, zzddt {
    zzelv zza;
    private final Context zzb;
    private final zzclb zzc;
    private final zzfkn zzd;
    private final VersionInfoParcel zze;
    private final zzelt zzf;

    public zzdnx(Context context, zzclb zzclbVar, zzfkn zzfknVar, VersionInfoParcel versionInfoParcel, zzelt zzeltVar) {
        this.zzb = context;
        this.zzc = zzclbVar;
        this.zzd = zzfknVar;
        this.zze = versionInfoParcel;
        this.zzf = zzeltVar;
    }

    private final boolean zzl() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgt)).booleanValue() && this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        zzclb zzclbVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzclbVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgw)).booleanValue()) {
                zzclbVar.zze("onSdkImpression", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        zzclb zzclbVar;
        zzels zzelsVar;
        zzelr zzelrVar;
        zzfkn zzfknVar = this.zzd;
        if (!zzfknVar.zzT || (zzclbVar = this.zzc) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzb)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
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
                zzelsVar = zzfknVar.zzY == 2 ? zzels.UNSPECIFIED : zzels.BEGIN_TO_RENDER;
                zzelrVar = zzelr.HTML_DISPLAY;
            }
            zzelv zzelvVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzclbVar.zzD(), "", "javascript", strZza, zzelsVar, zzelrVar, zzfknVar.zzal);
            this.zza = zzelvVarZzc;
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
                zzclbVar.zzak(this.zza);
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzfuuVarZza);
                zzclbVar.zze("onSdkLoaded", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzclb zzclbVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgw)).booleanValue() || (zzclbVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzclbVar.zze("onSdkImpression", new ArrayMap());
            } else {
                this.zzf.zzd();
            }
        }
    }
}
