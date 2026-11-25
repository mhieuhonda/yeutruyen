package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzduc {
    private final zzflg zza;
    private final Executor zzb;
    private final zzdwq zzc;
    private final zzdvl zzd;
    private final Context zze;
    private final zzdzt zzf;
    private final zzfsm zzg;
    private final zzeko zzh;
    private final zzdzo zzi;
    private final zzeaw zzj;

    public zzduc(zzflg zzflgVar, Executor executor, zzdwq zzdwqVar, Context context, zzdzt zzdztVar, zzfsm zzfsmVar, zzeko zzekoVar, zzdvl zzdvlVar, zzdzo zzdzoVar, zzeaw zzeawVar) {
        this.zza = zzflgVar;
        this.zzb = executor;
        this.zzc = zzdwqVar;
        this.zze = context;
        this.zzf = zzdztVar;
        this.zzg = zzfsmVar;
        this.zzh = zzekoVar;
        this.zzd = zzdvlVar;
        this.zzi = zzdzoVar;
        this.zzj = zzeawVar;
    }

    private final void zzh(zzclb zzclbVar, zzcgc zzcgcVar) {
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = this.zza.zza;
        if (zzfwVar != null && zzclbVar.zzh() != null) {
            zzclbVar.zzh().zzc(zzfwVar);
        }
        zzcgcVar.zzb();
    }

    private final void zzi(zzclb zzclbVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar) {
        zzeaw zzeawVar;
        zzj(zzclbVar);
        zzclbVar.zzab("/video", zzbpw.zzl);
        zzclbVar.zzab("/videoMeta", zzbpw.zzm);
        zzclbVar.zzab("/precache", new zzcji());
        zzclbVar.zzab("/delayPageLoaded", zzbpw.zzp);
        zzclbVar.zzab("/instrument", zzbpw.zzn);
        zzclbVar.zzab("/log", zzbpw.zzg);
        zzclbVar.zzab("/click", zzbpw.zzb(null, null));
        if (this.zza.zzb != null) {
            zzclbVar.zzP().zzT(true);
            zzclbVar.zzab("/open", new zzbqk(true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpr)).booleanValue() ? null : zzbVar, null, null, null, null, null));
        } else {
            zzclbVar.zzP().zzT(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zzb(zzclbVar.getContext())) {
            Map map = new HashMap();
            if (zzclbVar.zzC() != null) {
                map = zzclbVar.zzC().zzaw;
            }
            zzclbVar.zzab("/logScionEvent", new zzbqd(zzclbVar.getContext(), map));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpr)).booleanValue()) {
            zzclbVar.zzP().zzi(zzbVar);
            zzclbVar.zzP().zzj(zzcduVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziQ)).booleanValue() || (zzeawVar = this.zzj) == null) {
            return;
        }
        zzclbVar.zzab("/onDeviceStorageEvent", new zzbqf(zzeawVar));
    }

    private static final void zzj(zzclb zzclbVar) {
        zzclbVar.zzab("/videoClicked", zzbpw.zzh);
        zzclbVar.zzP().zzR(true);
        zzclbVar.zzab("/getNativeAdViewSignals", zzbpw.zzs);
        zzclbVar.zzab("/getNativeClickMeta", zzbpw.zzt);
    }

    public final ListenableFuture zza(final JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcdu zzcduVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcZ)).booleanValue()) {
            this.zzi.zzf(zzdzc.NATIVE_ASSETS_LOADING_VIDEO_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture listenableFutureZza = zzhcf.zza(null);
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtx
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze(zzbVar, zzcduVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzhcf.zzj(zzhcf.zzj(listenableFutureZza, zzhbnVar, executor), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdub
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzclb) obj);
            }
        }, executor);
    }

    public final ListenableFuture zzb(final String str, final String str2, final zzfkn zzfknVar, final zzfkq zzfkqVar, final com.google.android.gms.ads.internal.client.zzr zzrVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcdu zzcduVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcZ)).booleanValue()) {
            this.zzi.zzf(zzdzc.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtw
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzrVar, zzfknVar, zzfkqVar, zzbVar, zzcduVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject, final zzclb zzclbVar) {
        zzbsi zzbsiVar = this.zza.zzb;
        final zzcgc zzcgcVarZza = zzcgc.zza(zzclbVar);
        if (zzbsiVar != null) {
            zzclbVar.zzaf(zzcnl.zze());
        } else {
            zzclbVar.zzaf(zzcnl.zzd());
        }
        zzclbVar.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdua
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
                this.zza.zzg(zzclbVar, zzcgcVarZza, z, i, str, str2);
            }
        });
        zzclbVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcgcVarZza;
    }

    final /* synthetic */ ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfkn zzfknVar, zzfkq zzfkqVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar, String str, String str2, Object obj) throws zzclq {
        final zzclb zzclbVarZza = this.zzc.zza(zzrVar, zzfknVar, zzfkqVar);
        final zzcgc zzcgcVarZza = zzcgc.zza(zzclbVarZza);
        if (this.zza.zzb != null) {
            zzi(zzclbVarZza, zzbVar, zzcduVar);
            zzclbVarZza.zzaf(zzcnl.zze());
        } else {
            zzdvi zzdviVarZza = this.zzd.zza();
            zzcmz zzcmzVarZzP = zzclbVarZza.zzP();
            zzbio zzbioVar = zzbix.zzpr;
            zzcmzVarZzP.zzab(zzdviVarZza, zzdviVarZza, zzdviVarZza, zzdviVarZza, zzdviVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zze, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue() ? null : zzcduVar, this.zzh, this.zzg, this.zzf, null, zzdviVarZza, null, null, null, null, this.zzj, null, null);
            zzj(zzclbVarZza);
        }
        zzclbVarZza.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdtz
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                this.zza.zzf(zzclbVarZza, zzcgcVarZza, z, i, str3, str4);
            }
        });
        zzclbVarZza.zzau(str, str2, null);
        return zzcgcVarZza;
    }

    final /* synthetic */ ListenableFuture zze(com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar, Object obj) throws zzclq {
        zzclb zzclbVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        final zzcgc zzcgcVarZza = zzcgc.zza(zzclbVarZza);
        zzi(zzclbVarZza, zzbVar, zzcduVar);
        zzclbVarZza.zzP().zzH(new zzcmy() { // from class: com.google.android.gms.internal.ads.zzdty
            @Override // com.google.android.gms.internal.ads.zzcmy
            public final /* synthetic */ void zza() {
                zzcgcVarZza.zzb();
            }
        });
        zzclbVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeO));
        return zzcgcVarZza;
    }

    final /* synthetic */ void zzf(zzclb zzclbVar, zzcgc zzcgcVar, boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = this.zza.zza;
            if (zzfwVar != null && zzclbVar.zzh() != null) {
                zzclbVar.zzh().zzc(zzfwVar);
            }
            zzcgcVar.zzb();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcgcVar.zzd(new zzepp(1, sb.toString()));
    }

    final /* synthetic */ void zzg(zzclb zzclbVar, zzcgc zzcgcVar, boolean z, int i, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeW)).booleanValue()) {
            zzh(zzclbVar, zzcgcVar);
            return;
        }
        if (z) {
            zzh(zzclbVar, zzcgcVar);
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcgcVar.zzd(new zzepp(1, sb.toString()));
    }
}
