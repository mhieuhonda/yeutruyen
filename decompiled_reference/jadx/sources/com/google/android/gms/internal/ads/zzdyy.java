package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyy implements zzdib, com.google.android.gms.ads.internal.client.zza, zzddt, zzddd, zzdfu {
    private final Context zzc;
    private final zzflz zzd;
    private final zzdzt zze;
    private final zzfky zzf;
    private final zzfkn zzg;
    private final zzeko zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhS)).booleanValue();

    public zzdyy(Context context, zzflz zzflzVar, zzdzt zzdztVar, zzfky zzfkyVar, zzfkn zzfknVar, zzeko zzekoVar, String str) {
        this.zzc = context;
        this.zzd = zzflzVar;
        this.zze = zzdztVar;
        this.zzf = zzfkyVar;
        this.zzg = zzfknVar;
        this.zzh = zzekoVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String strZzr;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcj);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        strZzr = com.google.android.gms.ads.internal.util.zzs.zzr(this.zzc);
                    } catch (RemoteException unused) {
                        strZzr = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzr != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzr);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdzs zzg(String str) {
        zzfky zzfkyVar = this.zzf;
        zzfkx zzfkxVar = zzfkyVar.zzb;
        zzdzs zzdzsVarZza = this.zze.zza();
        zzdzsVarZza.zza(zzfkxVar.zzb);
        zzfkn zzfknVar = this.zzg;
        zzdzsVarZza.zzb(zzfknVar);
        zzdzsVarZza.zzc("action", str);
        zzdzsVarZza.zzc("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfknVar.zzt;
        if (!list.isEmpty()) {
            zzdzsVarZza.zzc("ancn", (String) list.get(0));
        }
        if (zzfknVar.zzb()) {
            zzdzsVarZza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzt(this.zzc) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzdzsVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zzdzsVarZza.zzc("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhZ)).booleanValue()) {
            boolean zZza = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzfkyVar);
            zzdzsVarZza.zzc("scar", String.valueOf(zZza));
            if (zZza) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkyVar.zza.zza.zzd;
                zzdzsVarZza.zzc("ragent", zzmVar.zzp);
                zzdzsVarZza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzmVar)));
            }
        }
        return zzdzsVarZza;
    }

    private final void zzi(zzdzs zzdzsVar) {
        if (!this.zzg.zzb()) {
            zzdzsVar.zzd();
            return;
        }
        this.zzh.zze(new zzekq(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdzsVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i = this.zzg.zzb;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzdzs zzdzsVarZzg = zzg("ifts");
            zzdzsVarZzg.zzc("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzdzsVarZzg.zzc("arec", String.valueOf(i));
            }
            String strZza = this.zzd.zza(str);
            if (strZza != null) {
                zzdzsVarZzg.zzc("areec", strZza);
            }
            zzdzsVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zzd(zzdnv zzdnvVar) {
        if (this.zzl) {
            zzdzs zzdzsVarZzg = zzg("ifts");
            zzdzsVarZzg.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdnvVar.getMessage())) {
                zzdzsVarZzg.zzc(NotificationCompat.CATEGORY_MESSAGE, zzdnvVar.getMessage());
            }
            zzdzsVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final void zzdH() {
        if (zzf()) {
            zzdzs zzdzsVarZzg = zzg("adapter_impression");
            zzdzsVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzdzsVarZzg.zzc("po", "1");
                zzdzsVarZzg.zzc("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            } else {
                zzdzsVarZzg.zzc("po", "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpl)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdzsVarZzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc) ? "1" : "0");
                zzdzsVarZzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpm)).booleanValue() && zzj()) {
                zzdzsVarZzg.zzc("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "0" : "1");
            }
            zzdzsVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final void zzdI() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        if (zzf() || this.zzg.zzb()) {
            zzdzs zzdzsVarZzg = zzg("impression");
            zzdzsVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzdzsVarZzg.zzc("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpl)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdzsVarZzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc) ? "1" : "0");
                zzdzsVarZzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            zzi(zzdzsVarZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zze() {
        if (this.zzl) {
            zzdzs zzdzsVarZzg = zzg("ifts");
            zzdzsVarZzg.zzc("reason", "blocked");
            zzdzsVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfu
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdzs zzdzsVarZzg = zzg("presentation");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpl)).booleanValue() && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc));
                zzdzsVarZzg.zzc("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpm)).booleanValue() && zzj()) {
                zzdzsVarZzg.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
            }
            zzdzsVarZzg.zzd();
        }
    }
}
