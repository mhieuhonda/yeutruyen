package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.tekartik.sqflite.Constant;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbqo implements zzbpx {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        String strConcat;
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get(Constant.PARAM_RESULT);
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            strConcat = "";
        } else {
            String.valueOf(str4);
            strConcat = "\n".concat(String.valueOf(str4));
        }
        synchronized (this.zza) {
            zzbqn zzbqnVar = (zzbqn) this.zzb.remove(str);
            if (zzbqnVar == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                sb.append("Received result for unexpected method invocation: ");
                sb.append(str);
                String string = sb.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + strConcat.length());
                sb2.append(str3);
                sb2.append(strConcat);
                zzbqnVar.zzb(sb2.toString());
                return;
            }
            if (str5 == null) {
                zzbqnVar.zza(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    String string2 = jSONObject.toString(2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 13);
                    sb3.append("Result GMSG: ");
                    sb3.append(string2);
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                }
                zzbqnVar.zza(jSONObject);
            } catch (JSONException e) {
                zzbqnVar.zzb(e.getMessage());
            }
        }
    }

    public final void zzb(String str, zzbqn zzbqnVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbqnVar);
        }
    }

    public final ListenableFuture zzc(zzbtf zzbtfVar, String str, JSONObject jSONObject) {
        zzcgd zzcgdVar = new zzcgd();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzb(string, new zzbqm(this, zzcgdVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbtfVar.zzb(str, jSONObject2);
            return zzcgdVar;
        } catch (Exception e) {
            zzcgdVar.zzd(e);
            return zzcgdVar;
        }
    }
}
