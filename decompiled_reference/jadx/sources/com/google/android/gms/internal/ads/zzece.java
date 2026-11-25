package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.tekartik.sqflite.Constant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzece {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdxk zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzeae zzl;
    private final VersionInfoParcel zzm;
    private final zzdkf zzo;
    private final zzfqt zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcgd zze = new zzcgd();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();

    public zzece(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdxk zzdxkVar, ScheduledExecutorService scheduledExecutorService, zzeae zzeaeVar, VersionInfoParcel versionInfoParcel, zzdkf zzdkfVar, zzfqt zzfqtVar) {
        this.zzh = zzdxkVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzeaeVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdkfVar;
        this.zzp = zzfqtVar;
        zzm("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    private final synchronized ListenableFuture zzu() {
        String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzd();
        if (!TextUtils.isEmpty(strZzd)) {
            return zzhcf.zza(strZzd);
        }
        final zzcgd zzcgdVar = new zzcgd();
        com.google.android.gms.ads.internal.zzt.zzh().zzp().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(zzcgdVar);
            }
        });
        return zzcgdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbrw(str, z, i, str2));
    }

    public final void zza() {
        this.zzq = false;
    }

    public final void zzb(final zzbsd zzbsdVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzbsdVar.zzb(this.zza.zzd());
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!((Boolean) zzbld.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcD)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zze();
                    this.zzo.zze();
                    zzcgd zzcgdVar = this.zze;
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzebw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzf();
                        }
                    };
                    Executor executor = this.zzi;
                    zzcgdVar.addListener(runnable, executor);
                    this.zza = true;
                    ListenableFuture listenableFutureZzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeby
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzh();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcF)).longValue(), TimeUnit.SECONDS);
                    zzhcf.zzr(listenableFutureZzu, new zzebu(this), executor);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(false);
        this.zza = true;
        this.zzb = true;
    }

    public final List zzd() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzbrw zzbrwVar = (zzbrw) map.get(str);
            arrayList.add(new zzbrw(str, zzbrwVar.zzb, zzbrwVar.zzc, zzbrwVar.zzd));
        }
        return arrayList;
    }

    public final boolean zze() {
        return this.zzb;
    }

    final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    final /* synthetic */ void zzg(final zzcgd zzcgdVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzecc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzd();
                boolean zIsEmpty = TextUtils.isEmpty(strZzd);
                zzcgd zzcgdVar2 = zzcgdVar;
                if (zIsEmpty) {
                    zzcgdVar2.zzd(new Exception());
                } else {
                    zzcgdVar2.zzc(strZzd);
                }
            }
        });
    }

    final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzd));
            this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    final /* synthetic */ void zzi(Object obj, zzcgd zzcgdVar, String str, long j, zzfqg zzfqgVar) {
        synchronized (obj) {
            if (!zzcgdVar.isDone()) {
                zzm(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j));
                this.zzl.zzc(str, "timeout");
                this.zzo.zzc(str, "timeout");
                zzfqt zzfqtVar = this.zzp;
                zzfqgVar.zzk("Timeout");
                zzfqgVar.zzd(false);
                zzfqtVar.zzb(zzfqgVar.zzm());
                zzcgdVar.zzc(false);
            }
        }
    }

    final /* synthetic */ Object zzj(zzfqg zzfqgVar) {
        this.zze.zzc(true);
        zzfqgVar.zzd(true);
        this.zzp.zzb(zzfqgVar.zzm());
        return null;
    }

    final /* synthetic */ void zzk(String str, zzbsa zzbsaVar, zzfme zzfmeVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbsaVar.zze();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfmeVar.zzA(context, zzbsaVar, list);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            }
        } catch (RemoteException e2) {
            throw new zzguo(e2);
        } catch (zzfln unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            zzbsaVar.zzf(sb.toString());
        }
    }

    final /* synthetic */ void zzl(String str) {
        final zzece zzeceVar = this;
        Context context = zzeceVar.zzf;
        int i = 5;
        final zzfqg zzfqgVarZzn = zzfqg.zzn(context, 5);
        zzfqgVarZzn.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfqg zzfqgVarZzn2 = zzfqg.zzn(context, i);
                zzfqgVarZzn2.zza();
                zzfqgVarZzn2.zzi(next);
                final Object obj = new Object();
                final zzcgd zzcgdVar = new zzcgd();
                ListenableFuture listenableFutureZzi = zzhcf.zzi(zzcgdVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcE)).longValue(), TimeUnit.SECONDS, zzeceVar.zzk);
                zzeceVar.zzl.zza(next);
                zzeceVar.zzo.zza(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                listenableFutureZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi(obj, zzcgdVar, next, jElapsedRealtime, zzfqgVarZzn2);
                    }
                }, zzeceVar.zzi);
                arrayList.add(listenableFutureZzi);
                try {
                    try {
                        final zzebv zzebvVar = new zzebv(this, obj, next, jElapsedRealtime, zzfqgVarZzn2, zzcgdVar);
                        zzeceVar = this;
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (jSONObjectOptJSONObject != null) {
                            try {
                                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray(Constant.PARAM_ERROR_DATA);
                                int i2 = 0;
                                while (i2 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                    String strOptString = jSONObject2.optString("format", "");
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject(Constant.PARAM_ERROR_DATA);
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                        while (itKeys2.hasNext()) {
                                            String next2 = itKeys2.next();
                                            bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                            jSONArray = jSONArray;
                                        }
                                    }
                                    JSONArray jSONArray2 = jSONArray;
                                    arrayList2.add(new zzbsg(strOptString, bundle));
                                    i2++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        zzeceVar.zzm(next, false, "", 0);
                        try {
                            final zzfme zzfmeVarZza = zzeceVar.zzh.zza(next, new JSONObject());
                            zzeceVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecb
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzk(next, zzebvVar, zzfmeVarZza, arrayList2);
                                }
                            });
                        } catch (zzfln e) {
                            try {
                                String string = "Failed to create Adapter.";
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoJ)).booleanValue()) {
                                    String message = e.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                    sb.append("Failed to create Adapter.");
                                    sb.append(" ");
                                    sb.append(message);
                                    string = sb.toString();
                                }
                                zzebvVar.zzf(string);
                            } catch (RemoteException e2) {
                                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                            }
                        }
                        i = 5;
                    } catch (JSONException e3) {
                        e = e3;
                        zzeceVar = this;
                        com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
                        zzeceVar.zzo.zzd("MalformedJson");
                        zzeceVar.zzl.zzd("MalformedJson");
                        zzeceVar.zze.zzd(e);
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdapterInitializer.updateAdapterStatus");
                        zzfqt zzfqtVar = zzeceVar.zzp;
                        zzfqgVarZzn.zzj(e);
                        zzfqgVarZzn.zzd(false);
                        zzfqtVar.zzb(zzfqgVarZzn.zzm());
                    }
                } catch (JSONException e4) {
                    e = e4;
                    zzeceVar = this;
                }
            }
            zzhcf.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeca
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.zza.zzj(zzfqgVarZzn);
                    return null;
                }
            }, zzeceVar.zzi);
        } catch (JSONException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
            zzeceVar.zzo.zzd("MalformedJson");
            zzeceVar.zzl.zzd("MalformedJson");
            zzeceVar.zze.zzd(e);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdapterInitializer.updateAdapterStatus");
            zzfqt zzfqtVar2 = zzeceVar.zzp;
            zzfqgVarZzn.zzj(e);
            zzfqgVarZzn.zzd(false);
            zzfqtVar2.zzb(zzfqgVarZzn.zzm());
        }
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zzc = true;
    }

    final /* synthetic */ long zzo() {
        return this.zzd;
    }

    final /* synthetic */ zzcgd zzp() {
        return this.zze;
    }

    final /* synthetic */ Executor zzq() {
        return this.zzi;
    }

    final /* synthetic */ zzeae zzr() {
        return this.zzl;
    }

    final /* synthetic */ zzdkf zzs() {
        return this.zzo;
    }

    final /* synthetic */ zzfqt zzt() {
        return this.zzp;
    }
}
