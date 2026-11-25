package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdsv {
    private final zzhcp zza;
    private final zzdtk zzb;
    private final zzdtp zzc;
    private final zzdzo zzd;

    zzdsv(zzhcp zzhcpVar, zzdtk zzdtkVar, zzdtp zzdtpVar, zzdzo zzdzoVar) {
        this.zza = zzhcpVar;
        this.zzb = zzdtkVar;
        this.zzc = zzdtpVar;
        this.zzd = zzdzoVar;
    }

    private final ListenableFuture zze(ListenableFuture listenableFuture, zzdzc zzdzcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcZ)).booleanValue()) {
            zzhcf.zzr(listenableFuture, new zzdss(this, zzdzcVar), this.zza);
        }
        return listenableFuture;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00fa  */
    public final ListenableFuture zza(final zzfky zzfkyVar, final zzfkn zzfknVar, final JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar) {
        ListenableFuture listenableFutureZza;
        JSONArray jSONArrayOptJSONArray;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcU)).booleanValue()) {
            this.zzd.zzf(zzdzc.RENDERING_NATIVE_ASSETS_LOADING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture listenableFutureSubmit = this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdsu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzb(zzfkyVar, zzfknVar, jSONObject);
            }
        });
        zze(listenableFutureSubmit, zzdzc.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdtk zzdtkVar = this.zzb;
        final ListenableFuture listenableFutureZzb = zzdtkVar.zzb(jSONObject, "images", zzdzc.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(listenableFutureZzb, zzdzc.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfkq zzfkqVar = zzfkyVar.zzb.zzb;
        final ListenableFuture listenableFutureZzc = zzdtkVar.zzc(jSONObject, "images", zzfknVar, zzfkqVar, zzbVar, zzcduVar);
        zze(listenableFutureZzc, zzdzc.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final ListenableFuture listenableFutureZza2 = zzdtkVar.zza(jSONObject, "secondary_image", zzdzc.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(listenableFutureZza2, zzdzc.NATIVE_ASSETS_LOADING_LOGO_END);
        final ListenableFuture listenableFutureZza3 = zzdtkVar.zza(jSONObject, "app_icon", zzdzc.NATIVE_ASSETS_LOADING_ICON_START);
        zze(listenableFutureZza3, zzdzc.NATIVE_ASSETS_LOADING_ICON_END);
        final ListenableFuture listenableFutureZzd = zzdtkVar.zzd(jSONObject, "attribution", zzdzc.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(listenableFutureZzd, zzdzc.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final ListenableFuture listenableFutureZzg = zzdtkVar.zzg(jSONObject, zzfknVar, zzfkqVar, zzbVar, zzcduVar);
        zze(listenableFutureZzg, zzdzc.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoI)).booleanValue() || !jSONObject.has("video")) {
            listenableFutureZza = zzhcf.zza(new Bundle());
            break;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject.has("flags") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("flags")) != null) {
            int i = 0;
            while (true) {
                if (i < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i++;
                    } else {
                        try {
                            if (Integer.parseInt(jSONObjectOptJSONObject2.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE)) == 3) {
                                listenableFutureZza = this.zzb.zzf(listenableFutureZzg);
                                zze(listenableFutureZza, zzdzc.NATIVE_ASSETS_LOADING_MEDIA_END);
                                break;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                listenableFutureZza = zzhcf.zza(new Bundle());
                break;
            }
        }
        listenableFutureZza = zzhcf.zza(new Bundle());
        break;
        final ListenableFuture listenableFutureZza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(listenableFutureZza4, zzdzc.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final ListenableFuture listenableFutureZze = this.zzb.zze(jSONObject, zzbVar, zzcduVar);
        zze(listenableFutureZze, zzdzc.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(listenableFutureSubmit);
        arrayList.add(listenableFutureZzb);
        arrayList.add(listenableFutureZzc);
        arrayList.add(listenableFutureZza2);
        arrayList.add(listenableFutureZza3);
        arrayList.add(listenableFutureZzd);
        arrayList.add(listenableFutureZzg);
        arrayList.add(listenableFutureZza);
        arrayList.add(listenableFutureZza4);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgx)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(listenableFutureZze);
        }
        final ListenableFuture listenableFuture = listenableFutureZza;
        return zzhcf.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdst
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(listenableFutureSubmit, listenableFutureZzb, listenableFutureZza3, listenableFutureZza2, listenableFutureZzd, jSONObject, listenableFutureZzg, listenableFuture, listenableFutureZzc, listenableFutureZze, listenableFutureZza4);
            }
        }, this.zza);
    }

    final /* synthetic */ zzdqb zzb(zzfky zzfkyVar, zzfkn zzfknVar, JSONObject jSONObject) throws zzepp {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcZ)).booleanValue()) {
            this.zzd.zzf(zzdzc.NATIVE_ASSETS_LOADING_BASIC_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdqb zzdqbVar = new zzdqb();
        zzdqbVar.zza(jSONObject.optInt("template_id", -1));
        zzdqbVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdqbVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzflg zzflgVar = zzfkyVar.zza.zza;
        if (!zzflgVar.zzh.contains(Integer.toString(zzdqbVar.zzx()))) {
            int iZzx = zzdqbVar.zzx();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzx).length() + 21);
            sb.append("Invalid template ID: ");
            sb.append(iZzx);
            throw new zzepp(1, sb.toString());
        }
        if (zzdqbVar.zzx() == 3) {
            if (zzdqbVar.zzS() == null) {
                throw new zzepp(1, "No custom template id for custom template ad response.");
            }
            if (!zzflgVar.zzi.contains(zzdqbVar.zzS())) {
                throw new zzepp(1, "Unexpected custom template id in the response.");
            }
        }
        zzdqbVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfknVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String strZzB = com.google.android.gms.ads.internal.util.zzs.zzB();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strZzB).length() + 3 + String.valueOf(strOptString).length());
            sb2.append(strZzB);
            sb2.append(" : ");
            sb2.append(strOptString);
            strOptString = sb2.toString();
        }
        zzdqbVar.zzs("headline", strOptString);
        zzdqbVar.zzs("body", jSONObject.optString("body", null));
        zzdqbVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdqbVar.zzs("store", jSONObject.optString("store", null));
        zzdqbVar.zzs("price", jSONObject.optString("price", null));
        zzdqbVar.zzs("advertiser", jSONObject.optString("advertiser", null));
        return zzdqbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdqb zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcU)).booleanValue()) {
            this.zzd.zzf(zzdzc.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdqb zzdqbVar = (zzdqb) listenableFuture.get();
        zzdqbVar.zzd((List) listenableFuture2.get());
        zzdqbVar.zzj((zzbml) listenableFuture3.get());
        zzdqbVar.zzk((zzbml) listenableFuture4.get());
        zzdqbVar.zzc((zzbme) listenableFuture5.get());
        zzdqbVar.zze(zzdtk.zzl(jSONObject));
        zzdqbVar.zzf(zzdtk.zzk(jSONObject));
        zzclb zzclbVar = (zzclb) listenableFuture6.get();
        if (zzclbVar != null) {
            zzdqbVar.zzm(zzclbVar);
            zzdqbVar.zzg(zzclbVar.zzE());
            zzdqbVar.zzb(zzclbVar.zzh());
        }
        zzdqbVar.zzH().putAll((Bundle) listenableFuture7.get());
        zzclb zzclbVar2 = (zzclb) listenableFuture8.get();
        if (zzclbVar2 != null) {
            zzdqbVar.zzn(zzclbVar2);
            zzdqbVar.zzh(zzclbVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgx)).booleanValue() || zzf(jSONObject)) {
            zzclb zzclbVar3 = (zzclb) listenableFuture9.get();
            if (zzclbVar3 != null) {
                zzdqbVar.zzo(zzclbVar3);
            }
        } else {
            zzdqbVar.zzp(listenableFuture9);
            zzdqbVar.zzr(new zzcgd());
        }
        for (zzdtm zzdtmVar : (List) listenableFuture10.get()) {
            if (zzdtmVar.zza != 1) {
                zzdqbVar.zzt(zzdtmVar.zzb, zzdtmVar.zzd);
            } else {
                zzdqbVar.zzs(zzdtmVar.zzb, zzdtmVar.zzc);
            }
        }
        return zzdqbVar;
    }

    final /* synthetic */ zzdzo zzd() {
        return this.zzd;
    }
}
