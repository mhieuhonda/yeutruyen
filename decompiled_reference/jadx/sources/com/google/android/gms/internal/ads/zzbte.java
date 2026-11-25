package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbte implements zzbsw, zzbsu {
    private zzclb zza;

    public zzbte(Context context, VersionInfoParcel versionInfoParcel, zzbaw zzbawVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzclq {
        com.google.android.gms.ads.internal.zzt.zzd();
        zzclb zzclbVarZza = zzclr.zza(context, zzcnl.zzb(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbhw.zza(), null, null, null, null, null);
        this.zza = zzclbVarZza;
        zzclbVarZza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf(String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzg(final String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzh(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbta
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzq(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzi(final zzbsv zzbsvVar) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzcmz zzcmzVarZzP = zzclbVar.zzP();
            Objects.requireNonNull(zzbsvVar);
            zzcmzVarZzP.zzH(new zzcmy() { // from class: com.google.android.gms.internal.ads.zzbsy
                @Override // com.google.android.gms.internal.ads.zzcmy
                public final /* synthetic */ void zza() {
                    zzbsvVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.destroy();
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzk() {
        zzclb zzclbVar = this.zza;
        return zzclbVar == null || zzclbVar.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final zzbud zzl() {
        return new zzbud(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzm(String str, zzbpx zzbpxVar) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.zzab(str, new zzbsx(this, zzbpxVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzn(String str, final zzbpx zzbpxVar) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.zzad(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbtc
                @Override // com.google.android.gms.common.util.Predicate
                public final /* synthetic */ boolean apply(Object obj) {
                    zzbpx zzbpxVar2 = (zzbpx) obj;
                    if (zzbpxVar2 instanceof zzbsx) {
                        return ((zzbsx) zzbpxVar2).zzb().equals(zzbpxVar);
                    }
                    return false;
                }
            });
        }
    }

    final /* synthetic */ void zzo(String str) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.zza(str);
        }
    }

    final /* synthetic */ void zzp(String str) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.loadData(str, "text/html", "UTF-8");
        }
    }

    final /* synthetic */ void zzq(String str) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.loadData(str, "text/html", "UTF-8");
        }
    }

    final /* synthetic */ void zzr(String str) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.loadUrl(str);
        }
    }
}
