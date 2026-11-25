package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeom implements zzeog {
    private final zzdok zza;
    private final zzhcp zzb;
    private final zzdsv zzc;
    private final zzfmf zzd;
    private final zzdvl zze;
    private final zzdzo zzf;
    private final VersionInfoParcel zzg;
    private final Context zzh;
    private final zzcdq zzi;

    public zzeom(zzdok zzdokVar, zzhcp zzhcpVar, zzdsv zzdsvVar, zzfmf zzfmfVar, zzdvl zzdvlVar, zzdzo zzdzoVar, VersionInfoParcel versionInfoParcel, Context context, zzcdq zzcdqVar) {
        this.zzg = versionInfoParcel;
        this.zzh = context;
        this.zzi = zzcdqVar;
        this.zza = zzdokVar;
        this.zzb = zzhcpVar;
        this.zzc = zzdsvVar;
        this.zzd = zzfmfVar;
        this.zze = zzdvlVar;
        this.zzf = zzdzoVar;
    }

    private final ListenableFuture zzg(final zzfky zzfkyVar, final zzfkn zzfknVar, final JSONObject jSONObject) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        zzcdu zzcduVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcV)).booleanValue()) {
            this.zzf.zzf(zzdzc.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture listenableFutureZzb = this.zzd.zzb();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpr)).booleanValue();
        Context context = this.zzh;
        if (zBooleanValue) {
            zzcdu zzcduVarZza = zzdcu.zza(context, this.zzg, zzfknVar, this.zzi);
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, zzcduVarZza, null);
            zzcduVar = zzcduVarZza;
        } else {
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, null, null);
            zzcduVar = null;
        }
        final com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar;
        final zzcdu zzcduVar2 = zzcduVar;
        final ListenableFuture listenableFutureZza = this.zzc.zza(zzfkyVar, zzfknVar, jSONObject, zzbVar2, zzcduVar2);
        return zzhcf.zzo(listenableFutureZzb, listenableFutureZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeok
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf(listenableFutureZza, listenableFutureZzb, zzfkyVar, zzfknVar, jSONObject, zzbVar2, zzcduVar2);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar = zzfknVar.zzs;
        return (zzfksVar == null || zzfksVar.zzc == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final ListenableFuture zzb(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcU)).booleanValue()) {
            this.zzf.zzf(zzdzc.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture listenableFutureZzb = this.zzd.zzb();
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeol
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfknVar, (zzdvf) obj);
            }
        };
        zzhcp zzhcpVar = this.zzb;
        return zzhcf.zzj(zzhcf.zzj(listenableFutureZzb, zzhbnVar, zzhcpVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeoh
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzfkyVar, zzfknVar, (JSONArray) obj);
            }
        }, zzhcpVar);
    }

    final /* synthetic */ ListenableFuture zzc(zzfkn zzfknVar, final zzdvf zzdvfVar) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcU)).booleanValue()) {
            this.zzf.zzf(zzdzc.RENDERING_NATIVE_ADS_PREPROCESS_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkb)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfknVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzhcf.zzj(zzdvfVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeoi
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze(zzdvfVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzd(zzfky zzfkyVar, zzfkn zzfknVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzhcf.zzc(new zzeel(3));
        }
        int i = zzfkyVar.zza.zza.zzl;
        if (i <= 1) {
            return zzhcf.zzk(zzg(zzfkyVar, zzfknVar, jSONArray.getJSONObject(0)), zzeoj.zza, this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcW)).booleanValue()) {
            this.zzf.zzd("nsl", String.valueOf(length));
        }
        this.zzd.zza(Math.min(length, i));
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < length) {
                arrayList.add(zzg(zzfkyVar, zzfknVar, jSONArray.getJSONObject(i2)));
            } else {
                arrayList.add(zzhcf.zzc(new zzeel(3)));
            }
        }
        return zzhcf.zza(arrayList);
    }

    final /* synthetic */ ListenableFuture zze(zzdvf zzdvfVar, JSONObject jSONObject) throws zzbue {
        this.zzd.zzc(zzhcf.zza(zzdvfVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzbue("process json failed");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcU)).booleanValue()) {
            this.zzf.zzf(zzdzc.RENDERING_NATIVE_ADS_PREPROCESS_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzhcf.zza(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdpw zzf(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfky zzfkyVar, zzfkn zzfknVar, JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar) throws Throwable {
        zzdqb zzdqbVar = (zzdqb) listenableFuture.get();
        zzdvf zzdvfVar = (zzdvf) listenableFuture2.get();
        zzbio zzbioVar = zzbix.zzcV;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            this.zzf.zzf(zzdzc.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdqc zzdqcVarZzd = this.zza.zzd(new zzcyq(zzfkyVar, zzfknVar, null), new zzdqm(zzdqbVar), new zzdox(jSONObject, zzdvfVar, zzbVar, zzcduVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdzo zzdzoVar = this.zzf;
            zzdzoVar.zzf(zzdzc.RENDERING_AD_COMPONENT_CREATION_END.zza(), jCurrentTimeMillis);
            zzdzoVar.zzf(zzdzc.RENDERING_CONFIGURE_WEBVIEW_START.zza(), jCurrentTimeMillis);
        }
        zzdqcVarZzd.zzi().zzb();
        zzdqcVarZzd.zzj().zza(zzdvfVar);
        zzdqcVarZzd.zzk().zza(zzdqbVar.zzT());
        zzdqcVarZzd.zzl().zza(this.zze, zzdqbVar.zzU());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            this.zzf.zzf(zzdzc.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzdqcVarZzd.zzh();
    }
}
