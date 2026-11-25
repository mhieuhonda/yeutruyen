package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfby implements zzfcs {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfbz zzc = new zzfbz(new JSONArray().toString(), new Bundle(), "");
    final String zza;
    private final zzhcp zzd;
    private final ScheduledExecutorService zze;
    private final zzese zzf;
    private final Context zzg;
    private final zzflg zzh;
    private final zzerz zzi;
    private final zzdxk zzj;
    private final zzecg zzk;

    zzfby(zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, String str, zzese zzeseVar, Context context, zzflg zzflgVar, zzerz zzerzVar, zzdxk zzdxkVar, zzecg zzecgVar) {
        this.zzd = zzhcpVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzeseVar;
        this.zzg = context;
        this.zzh = zzflgVar;
        this.zzi = zzerzVar;
        this.zzj = zzdxkVar;
        this.zzk = zzecgVar;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzesi zzesiVar = (zzesi) ((Map.Entry) it.next()).getValue();
            String str = zzesiVar.zza;
            list.add(zzh(str, Collections.singletonList(zzesiVar.zze), zzg(str), zzesiVar.zzb, zzesiVar.zzc));
        }
    }

    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzhbx zzh(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzhbm zzhbmVar = new zzhbm() { // from class: com.google.android.gms.internal.ads.zzfbt
            @Override // com.google.android.gms.internal.ads.zzhbm
            public final /* synthetic */ ListenableFuture zza() {
                return this.zza.zzd(str, list, bundle, z, z2);
            }
        };
        zzhcp zzhcpVar = this.zzd;
        zzhbx zzhbxVarZzw = zzhbx.zzw(zzhcf.zzf(zzhbmVar, zzhcpVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcp)).booleanValue()) {
            zzhbxVarZzw = (zzhbx) zzhcf.zzi(zzhbxVarZzw, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzci)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzhbx) zzhcf.zzg(zzhbxVarZzw, Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfbu
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i = zzfby.zzb;
                String str2 = str;
                String.valueOf(str2);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoL)).booleanValue()) {
                    zzcfk zzcfkVarZzh = com.google.android.gms.ads.internal.zzt.zzh();
                    String.valueOf(str2);
                    zzcfkVarZzh.zzi(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                zzcfk zzcfkVarZzh2 = com.google.android.gms.ads.internal.zzt.zzh();
                String.valueOf(str2);
                zzcfkVarZzh2.zzh(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzhcpVar);
    }

    private final void zzi(zzbxi zzbxiVar, Bundle bundle, List list, zzesh zzeshVar) throws RemoteException {
        zzbxiVar.zze(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzeshVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzflg zzflgVar = this.zzh;
        if (zzflgVar.zzs) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcv)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzflgVar.zzd)))) {
                return zzhcf.zza(zzc);
            }
        }
        return zzhcf.zzf(new zzhbm() { // from class: com.google.android.gms.internal.ads.zzfbw
            @Override // com.google.android.gms.internal.ads.zzhbm
            public final /* synthetic */ ListenableFuture zza() {
                return this.zza.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 32;
    }

    final /* synthetic */ ListenableFuture zzc() {
        final String str;
        zzfby zzfbyVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmA)).booleanValue();
        zzflg zzflgVar = this.zzh;
        String lowerCase = zBooleanValue ? zzflgVar.zzg.toLowerCase(Locale.ROOT) : zzflgVar.zzg;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzct)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfl)).booleanValue()) {
            int iZzk = com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzk();
            str = iZzk != 1 ? iZzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = this.zzh.zzw;
        if (jSONArray != null) {
            HashMap map = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                    String string = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) ? "" : jSONArrayOptJSONArray.getString(0);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Constant.PARAM_ERROR_DATA);
                        Bundle bundle = new Bundle();
                        if (jSONObjectOptJSONObject != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                bundle.putString(next, jSONObjectOptJSONObject.optString(next, ""));
                            }
                        }
                        map.put(string, new zzesi(string, true, true, false, bundle));
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(new JSONException("Malformed RTB adapter config."), "RecursiveRtbAdapterMap.parseAdapters");
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed RTB adapter config.", e);
                }
            }
            zzf(arrayList, map);
            zzfbyVar = this;
        } else {
            boolean zBooleanValue2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcC)).booleanValue();
            zzese zzeseVar = this.zzf;
            if (zBooleanValue2) {
                zzfbyVar = this;
                zzf(arrayList, zzeseVar.zzd(zzfbyVar.zza, lowerCase));
            } else {
                for (Map.Entry entry : zzeseVar.zzc(this.zza, lowerCase).entrySet()) {
                    String str2 = (String) entry.getKey();
                    arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
                }
                zzfbyVar = this;
                zzf(arrayList, zzeseVar.zzb());
            }
        }
        return zzhcf.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i2 = zzfby.zzb;
                JSONArray jSONArray2 = new JSONArray();
                for (ListenableFuture listenableFuture : arrayList) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray2.put(listenableFuture.get());
                    }
                }
                String str3 = str;
                Bundle bundle2 = bundleZzg;
                if (jSONArray2.length() != 0) {
                    return new zzfbz(jSONArray2.toString(), bundle2, str3);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfl)).booleanValue()) {
                    return new zzfbz(new JSONArray().toString(), bundle2, str3);
                }
                return null;
            }
        }, zzfbyVar.zzd);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ ListenableFuture zzd(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws RemoteException {
        final zzbxi zzbxiVar;
        zzbxi zzbxiVarZzb;
        final zzcgd zzcgdVar = new zzcgd();
        if (z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcu)).booleanValue()) {
                try {
                    zzbxiVarZzb = this.zzj.zzb(str);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
                    zzbxiVar = null;
                }
            } else {
                zzerz zzerzVar = this.zzi;
                zzerzVar.zza(str);
                zzbxiVarZzb = zzerzVar.zzb(str);
            }
            zzbxiVar = zzbxiVarZzb;
        } else {
            zzbxiVarZzb = this.zzj.zzb(str);
            zzbxiVar = zzbxiVarZzb;
        }
        if (zzbxiVar == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzck)).booleanValue()) {
                throw null;
            }
            zzesh.zzd(str, zzcgdVar);
            return zzcgdVar;
        }
        final zzesh zzeshVar = new zzesh(str, zzbxiVar, zzcgdVar, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcp)).booleanValue()) {
            ScheduledExecutorService scheduledExecutorService = this.zze;
            Objects.requireNonNull(zzeshVar);
            scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeshVar.zzc();
                }
            }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzci)).longValue(), TimeUnit.MILLISECONDS);
        }
        if (!z) {
            zzeshVar.zzb();
            return zzcgdVar;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcw)).booleanValue()) {
            this.zzd.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(zzbxiVar, bundle, list, zzeshVar, zzcgdVar);
                }
            });
            return zzcgdVar;
        }
        zzi(zzbxiVar, bundle, list, zzeshVar);
        return zzcgdVar;
    }

    final /* synthetic */ void zze(zzbxi zzbxiVar, Bundle bundle, List list, zzesh zzeshVar, zzcgd zzcgdVar) {
        try {
            zzi(zzbxiVar, bundle, list, zzeshVar);
        } catch (RemoteException e) {
            zzcgdVar.zzd(e);
        }
    }
}
