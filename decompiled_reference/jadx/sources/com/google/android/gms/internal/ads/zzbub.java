package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbub {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzfqt zze;
    private final com.google.android.gms.ads.internal.util.zzbc zzf;
    private final com.google.android.gms.ads.internal.util.zzbc zzg;
    private zzbua zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbub(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbc zzbcVar, com.google.android.gms.ads.internal.util.zzbc zzbcVar2, zzfqt zzfqtVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfqtVar;
        this.zzf = zzbcVar;
        this.zzg = zzbcVar2;
    }

    protected final zzbua zza(zzbaw zzbawVar) {
        zzfqg zzfqgVarZzn = zzfqg.zzn(this.zzb, 6);
        zzfqgVarZzn.zza();
        final zzbua zzbuaVar = new zzbua(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzbaw zzbawVar2 = null;
        zzcfy.zzf.execute(new Runnable(zzbawVar2, zzbuaVar) { // from class: com.google.android.gms.internal.ads.zzbtr
            private final /* synthetic */ zzbua zzb;

            {
                this.zzb = zzbuaVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbuaVar.zze(new zzbtk(this, zzbuaVar, zzfqgVarZzn), new zzbtl(this, zzbuaVar, zzfqgVarZzn));
        return zzbuaVar;
    }

    public final zzbtv zzb(zzbaw zzbawVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized (obj) {
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                zzbua zzbuaVar = this.zzh;
                if (zzbuaVar != null && this.zzi == 0) {
                    zzbuaVar.zze(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzbtn
                        @Override // com.google.android.gms.internal.ads.zzcgh
                        public final /* synthetic */ void zza(Object obj2) {
                            this.zza.zze((zzbsw) obj2);
                        }
                    }, zzbto.zza);
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
        zzbua zzbuaVar2 = this.zzh;
        if (zzbuaVar2 != null && zzbuaVar2.zzi() != -1) {
            int i = this.zzi;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i != 1) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zza(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zza(null);
        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final void zzc() {
        zzbua zzbuaVar = this.zzh;
        if (zzbuaVar != null) {
            zzbuaVar.zzc();
            this.zzh = null;
        }
    }

    final /* synthetic */ void zzd(zzbaw zzbawVar, final zzbua zzbuaVar) {
        final long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            final zzbte zzbteVar = new zzbte(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbteVar.zzi(new zzbsv() { // from class: com.google.android.gms.internal.ads.zzbtp
                @Override // com.google.android.gms.internal.ads.zzbsv
                public final /* synthetic */ void zza() {
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    final long j = jCurrentTimeMillis;
                    final ArrayList arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(jCurrentTimeMillis2 - j));
                    String strValueOf = String.valueOf(arrayList2.get(0));
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 52);
                    sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                    sb.append(strValueOf);
                    sb.append(" ms.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    zzgax zzgaxVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    final zzbub zzbubVar = this.zza;
                    final zzbua zzbuaVar2 = zzbuaVar;
                    final zzbsw zzbswVar = zzbteVar;
                    zzgaxVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbubVar.zzf(zzbuaVar2, zzbswVar, arrayList2, j);
                        }
                    }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzd)).intValue());
                }
            });
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbteVar.zzm("/jsLoaded", new zzbtg(this, jCurrentTimeMillis, zzbuaVar, zzbteVar));
            com.google.android.gms.ads.internal.util.zzbv zzbvVar = new com.google.android.gms.ads.internal.util.zzbv();
            zzbth zzbthVar = new zzbth(this, null, zzbteVar, zzbvVar);
            zzbvVar.zzb(zzbthVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            if (!((Boolean) zzbkx.zzd.zze()).booleanValue() || TextUtils.equals(this.zzb.getPackageName(), "com.google.android.gms")) {
                zzbteVar.zzm("/requestReload", zzbthVar);
            }
            String str = this.zzc;
            String.valueOf(str);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbteVar.zzf(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbteVar.zzh(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbteVar.zzg(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbtj(this, zzbuaVar, zzbteVar, arrayList, jCurrentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zze)).intValue());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziL)).booleanValue()) {
                zzbuaVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziN)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbuaVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbuaVar.zzg();
            }
        }
    }

    final /* synthetic */ void zze(zzbsw zzbswVar) {
        if (zzbswVar.zzk()) {
            this.zzi = 1;
        }
    }

    final /* synthetic */ void zzf(zzbua zzbuaVar, final zzbsw zzbswVar, ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbuaVar.zzi() != -1 && zzbuaVar.zzi() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziL)).booleanValue()) {
                    zzbuaVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                } else {
                    zzbuaVar.zzg();
                }
                zzhcp zzhcpVar = zzcfy.zzf;
                Objects.requireNonNull(zzbswVar);
                zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbswVar.zzj();
                    }
                });
                String strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzd));
                int iZzi = zzbuaVar.zzi();
                int i = this.zzi;
                String strValueOf2 = String.valueOf(arrayList.get(0));
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 94 + String.valueOf(iZzi).length() + 39 + String.valueOf(i).length() + 57 + String.valueOf(strValueOf2).length() + 42 + String.valueOf(jCurrentTimeMillis).length() + 15);
                sb.append("Could not receive /jsLoaded in ");
                sb.append(strValueOf);
                sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                sb.append(iZzi);
                sb.append(". Update status(onEngLoadedTimeout) is ");
                sb.append(i);
                sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                sb.append(strValueOf2);
                sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                sb.append(jCurrentTimeMillis);
                sb.append(" ms. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    final /* synthetic */ Object zzg() {
        return this.zza;
    }

    final /* synthetic */ zzfqt zzh() {
        return this.zze;
    }

    final /* synthetic */ zzbua zzi() {
        return this.zzh;
    }

    final /* synthetic */ void zzj(zzbua zzbuaVar) {
        this.zzh = zzbuaVar;
    }

    final /* synthetic */ int zzk() {
        return this.zzi;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzi = i;
    }
}
