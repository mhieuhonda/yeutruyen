package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.tekartik.sqflite.Constant;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbpw {
    public static final zzbpx zza = zzbpv.zza;
    public static final zzbpx zzb = zzbpm.zza;
    public static final zzbpx zzc = zzbpn.zza;
    public static final zzbpx zzd = new zzbpe();
    public static final zzbpx zze = new zzbpf();
    public static final zzbpx zzf = zzbps.zza;
    public static final zzbpx zzg = new zzbpg();
    public static final zzbpx zzh = new zzbph();
    public static final zzbpx zzi = zzbpt.zza;
    public static final zzbpx zzj = new zzbpi();
    public static final zzbpx zzk = new zzbpj();
    public static final zzbpx zzl = new zzciv();
    public static final zzbpx zzm = new zzciw();
    public static final zzbpx zzn = new zzboq();
    public static final zzbqo zzo = new zzbqo();
    public static final zzbpx zzp = new zzbpk();
    public static final zzbpx zzq = new zzbpl();
    public static final zzbpx zzr = new zzbor();
    public static final zzbpx zzs = new zzbos();
    public static final zzbpx zzt = new zzbot();
    public static final zzbpx zzu = new zzbou();
    public static final zzbpx zzv = new zzbov();
    public static final zzbpx zzw = new zzbow();
    public static final zzbpx zzx = new zzbox();
    public static final zzbpx zzy = new zzboy();
    public static final zzbpx zzz = new zzboz();
    public static final zzbpx zzA = new zzbpa();
    public static final zzbpx zzB = new zzbpc();
    public static final zzbpx zzC = new zzbpd();

    public static ListenableFuture zza(zzclb zzclbVar, String str) {
        Uri uriZzd = Uri.parse(str);
        try {
            zzbaw zzbawVarZzS = zzclbVar.zzS();
            zzflk zzflkVarZzT = zzclbVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznH)).booleanValue() || zzflkVarZzT == null) {
                if (zzbawVarZzS != null && zzbawVarZzS.zza(uriZzd)) {
                    uriZzd = zzbawVarZzS.zzd(uriZzd, zzclbVar.getContext(), zzclbVar.zzE(), zzclbVar.zzj());
                }
            } else if (zzbawVarZzS != null && zzbawVarZzS.zza(uriZzd)) {
                uriZzd = zzflkVarZzT.zza(uriZzd, zzclbVar.getContext(), zzclbVar.zzE(), zzclbVar.zzj());
            }
        } catch (zzbax unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        }
        Map map = new HashMap();
        if (zzclbVar.zzC() != null) {
            map = zzclbVar.zzC().zzaw;
        }
        final String strZzb = zzcei.zzb(uriZzd, zzclbVar.getContext(), map);
        long jLongValue = ((Long) zzbkw.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 254730000) {
            return zzhcf.zza(strZzb);
        }
        zzhbx zzhbxVarZzw = zzhbx.zzw(zzclbVar.zzaF());
        zzbpo zzbpoVar = zzbpo.zza;
        zzhcp zzhcpVar = zzcfy.zzh;
        return (zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzk((zzhbx) zzhcf.zzg(zzhbxVarZzw, Throwable.class, zzbpoVar, zzhcpVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzbpp
            /* JADX WARN: Code duplicated, block: B:15:0x0055  */
            /* JADX WARN: Code duplicated, block: B:18:0x005f  */
            /* JADX WARN: Code duplicated, block: B:20:0x006d  */
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                String str2;
                String str3;
                Uri uri;
                String str4 = (String) obj;
                zzbpx zzbpxVar = zzbpw.zza;
                String strReplace = strZzb;
                if (str4 != null) {
                    if (((Boolean) zzbkw.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (host.endsWith(strArr[i2])) {
                                str2 = (String) zzbkw.zza.zze();
                                str3 = (String) zzbkw.zzb.zze();
                                if (!TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (String) zzbkw.zza.zze();
                        str3 = (String) zzbkw.zzb.zze();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzhcpVar), Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzbpq
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbpx zzbpxVar = zzbpw.zza;
                if (((Boolean) zzbkw.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzhcpVar);
    }

    public static zzbpx zzb(final zzdlg zzdlgVar, final zzctq zzctqVar) {
        return new zzbpx() { // from class: com.google.android.gms.internal.ads.zzbpr
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzclb zzclbVar = (zzclb) obj;
                zzbpw.zzc(map, zzdlgVar);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzctq zzctqVar2 = zzctqVar;
                zzhbx zzhbxVarZzw = zzhbx.zzw(zzbpw.zza(zzclbVar, str));
                zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzbpu
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    public final /* synthetic */ ListenableFuture zza(Object obj2) {
                        zzctq zzctqVar3;
                        String str2 = (String) obj2;
                        zzbpx zzbpxVar = zzbpw.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlH)).booleanValue() && (zzctqVar3 = zzctqVar2) != null && zzctq.zzc(str)) ? zzctqVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhcf.zza(str2);
                    }
                };
                zzhcp zzhcpVar = zzcfy.zza;
                zzhcf.zzr((zzhbx) zzhcf.zzj(zzhbxVarZzw, zzhbnVar, zzhcpVar), new zzbpb(zzclbVar), zzhcpVar);
            }
        };
    }

    public static void zzc(Map map, zzdlg zzdlgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmr)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdlgVar != null) {
            zzdlgVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zze(zzcmn zzcmnVar, Map map) {
        Intent uri;
        PackageManager packageManager = zzcmnVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get(Constant.PARAM_ERROR_DATA)).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e) {
                                String.valueOf(strOptString7);
                                String strValueOf = String.valueOf(strOptString7);
                                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(strValueOf), e);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (NullPointerException e2) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (JSONException e3) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", e3);
                        }
                    } catch (JSONException e4) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the intent data.", e4);
                    }
                }
                ((zzbst) zzcmnVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbst) zzcmnVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbst) zzcmnVar).zzd("openableIntents", new JSONObject());
        }
    }
}
