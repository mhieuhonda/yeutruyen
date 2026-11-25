package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcqy extends com.google.android.gms.ads.internal.client.zzcx {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdxk zzc;
    private final zzemc zzd;
    private final zzese zze;
    private final zzece zzf;
    private final zzceg zzg;
    private final zzdxp zzh;
    private final zzecz zzi;
    private final zzblr zzj;
    private final zzfqt zzk;
    private final zzfmc zzl;
    private final zzdal zzm;
    private final zzdzt zzn;
    private final zzeeg zzo;
    private boolean zzp = false;
    private final Long zzq = Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());

    zzcqy(Context context, VersionInfoParcel versionInfoParcel, zzdxk zzdxkVar, zzemc zzemcVar, zzese zzeseVar, zzece zzeceVar, zzceg zzcegVar, zzdxp zzdxpVar, zzecz zzeczVar, zzblr zzblrVar, zzfqt zzfqtVar, zzfmc zzfmcVar, zzdal zzdalVar, zzdzt zzdztVar, zzeeg zzeegVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdxkVar;
        this.zzd = zzemcVar;
        this.zze = zzeseVar;
        this.zzf = zzeceVar;
        this.zzg = zzcegVar;
        this.zzh = zzdxpVar;
        this.zzi = zzeczVar;
        this.zzj = zzblrVar;
        this.zzk = zzfqtVar;
        this.zzl = zzfmcVar;
        this.zzm = zzdalVar;
        this.zzn = zzdztVar;
        this.zzo = zzeegVar;
    }

    final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzh().zzp().zzJ()) {
            String strZzL = com.google.android.gms.ads.internal.zzt.zzh().zzp().zzL();
            if (com.google.android.gms.ads.internal.zzt.zzo().zze(this.zza, strZzL, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzh().zzp().zzK(false);
            com.google.android.gms.ads.internal.zzt.zzh().zzp().zzM("");
        }
    }

    final /* synthetic */ void zzc() {
        zzfml.zza(this.zza, true);
    }

    final /* synthetic */ void zzd() {
        com.google.android.gms.ads.internal.zzt.zzn().zza(this.zza, this.zzn);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zze() {
        if (this.zzp) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Mobile ads is initialized already.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdn)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        Context context = this.zza;
        zzbix.zza(context);
        com.google.android.gms.ads.internal.zzt.zzh().zzf(context, this.zzb, this.zzn);
        this.zzm.zzc();
        com.google.android.gms.ads.internal.zzt.zzj().zza(context);
        this.zzp = true;
        this.zzf.zzc();
        this.zze.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfd)).booleanValue()) {
            this.zzh.zza();
        }
        this.zzi.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkK)).booleanValue()) {
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmC)).booleanValue()) {
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzea)).booleanValue()) {
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfI)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfJ)).booleanValue()) {
                zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqt
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzd();
                    }
                });
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfX)).booleanValue()) {
            final zzeeg zzeegVar = this.zzo;
            zzhcp zzhcpVar = zzcfy.zzf;
            Objects.requireNonNull(zzeegVar);
            zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeegVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzf(float f) {
        com.google.android.gms.ads.internal.zzt.zzi().zza(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzg(String str) {
        Context context = this.zza;
        zzbix.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzl().zza(context, this.zzb, str, null, this.zzk, null, null, this.zzi.zzs());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzh(boolean z) {
        com.google.android.gms.ads.internal.zzt.zzi().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Context is null. Failed to open debug menu.");
        } else {
            com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
            zzatVar.zzc(str);
            zzatVar.zzd(this.zzb.afmaVersion);
            zzatVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(String str, IObjectWrapper iObjectWrapper) {
        String strZzr;
        Runnable runnable;
        Context context = this.zza;
        zzbix.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfi)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                strZzr = com.google.android.gms.ads.internal.util.zzs.zzr(context);
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "NonagonMobileAdsSettingManager_AppId");
                strZzr = "";
            }
        } else {
            strZzr = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strZzr) ? str : strZzr;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfb)).booleanValue();
        zzbio zzbioVar = zzbix.zzbI;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzhcp zzhcpVar = zzcfy.zzf;
                    final zzcqy zzcqyVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcqyVar.zzy(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z) {
            com.google.android.gms.ads.internal.zzt.zzl().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzq, this.zzi.zzs());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized float zzk() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized boolean zzl() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzm() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(String str) {
        this.zze.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(zzbvj zzbvjVar) throws RemoteException {
        this.zzl.zzc(zzbvjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(zzbsd zzbsdVar) throws RemoteException {
        this.zzf.zzb(zzbsdVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzq() throws RemoteException {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(com.google.android.gms.ads.internal.client.zzfr zzfrVar) throws RemoteException {
        this.zzg.zzc(this.zza, zzfrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() {
        this.zzf.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(com.google.android.gms.ads.internal.client.zzdk zzdkVar) throws RemoteException {
        this.zzi.zzo(zzdkVar, zzecy.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkW)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzu(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzw() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzr().zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdn)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.zzd();
            }
        }
    }

    final /* synthetic */ void zzx() {
        this.zzj.zza(new zzcaj());
    }

    final /* synthetic */ void zzy(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZzf = com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzf();
        if (mapZzf.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzc()) {
            HashMap map = new HashMap();
            Iterator it = mapZzf.values().iterator();
            while (it.hasNext()) {
                for (zzbvc zzbvcVar : ((zzbvd) it.next()).zza) {
                    String str = zzbvcVar.zzb;
                    for (String str2 : zzbvcVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzemd zzemdVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzemdVarZza != null) {
                        zzfme zzfmeVar = (zzfme) zzemdVarZza.zzb;
                        if (!zzfmeVar.zzn() && zzfmeVar.zzq()) {
                            zzfmeVar.zzr(this.zza, (zzenq) zzemdVarZza.zzc, (List) entry.getValue());
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                            sb.append("Initialized rewarded video mediation adapter ");
                            sb.append(str3);
                            String string = sb.toString();
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                        }
                    }
                } catch (zzfln e) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb2.append("Failed to initialize rewarded video mediation adapter \"");
                    sb2.append(str3);
                    sb2.append("\"");
                    String string2 = sb2.toString();
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj(string2, e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z) throws RemoteException {
        try {
            zzgcs.zza(this.zza).zzb(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }
}
