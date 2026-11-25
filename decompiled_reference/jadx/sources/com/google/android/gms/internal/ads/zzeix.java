package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeix implements zzfos {
    private static final Pattern zzd = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zza;
    private final zzfqg zzb;
    private final zzfqq zzc;

    public zzeix(String str, zzfqq zzfqqVar, zzfqg zzfqgVar) {
        this.zza = str;
        this.zzc = zzfqqVar;
        this.zzb = zzfqgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzeel zzeelVar;
        String strJoin;
        byte[] bArr;
        JSONObject jSONObjectZza;
        String strConcat;
        zzeiw zzeiwVar = (zzeiw) obj;
        int iOptInt = zzeiwVar.zza().optInt("http_timeout_millis", 60000);
        zzcbm zzcbmVarZzb = zzeiwVar.zzb();
        if (zzcbmVarZzb.zza() != -2) {
            if (zzcbmVarZzb.zza() == 1) {
                if (zzcbmVarZzb.zzb() != null) {
                    strJoin = TextUtils.join(", ", zzcbmVarZzb.zzb());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strJoin);
                } else {
                    strJoin = "";
                }
                String.valueOf(strJoin);
                zzeelVar = new zzeel(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzeelVar = new zzeel(1);
            }
            zzfqq zzfqqVar = this.zzc;
            zzfqg zzfqgVar = this.zzb;
            zzfqgVar.zzj(zzeelVar);
            zzfqgVar.zzd(false);
            zzfqqVar.zza(zzfqgVar);
            throw zzeelVar;
        }
        HashMap map = new HashMap();
        if (zzeiwVar.zzb().zzg()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbF)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = zzd.matcher(str);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null && (strGroup.toLowerCase(Locale.ROOT).startsWith("id=") || strGroup.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put(HttpHeaders.COOKIE, strConcat);
                    }
                } else {
                    map.put(HttpHeaders.COOKIE, str);
                }
            }
        }
        if (zzeiwVar.zzb().zzf() && (jSONObjectZza = zzeiwVar.zza()) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObjectZza.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        byte[] byteArray = new byte[0];
        if (TextUtils.isEmpty(zzeiwVar.zzb().zzd())) {
            bArr = byteArray;
        } else {
            byte[] bytes = zzeiwVar.zzb().zzd().getBytes(StandardCharsets.UTF_8);
            if (zzeiwVar.zzb().zzm()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "PrepareRequestFunction.apply");
                    byteArray = null;
                }
                if (byteArray != null) {
                    map.put(HttpHeaders.CONTENT_ENCODING, "gzip");
                    bArr = byteArray;
                }
            }
            bArr = bytes;
        }
        String strZzl = !TextUtils.isEmpty(zzeiwVar.zzb().zzl()) ? zzeiwVar.zzb().zzl() : "";
        zzfqq zzfqqVar2 = this.zzc;
        zzfqg zzfqgVar2 = this.zzb;
        zzfqgVar2.zzd(true);
        zzfqqVar2.zza(zzfqgVar2);
        return new zzeis(zzeiwVar.zzb().zze(), iOptInt, map, bArr, strZzl, zzeiwVar.zzb().zzf());
    }
}
