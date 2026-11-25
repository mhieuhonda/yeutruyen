package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbjm {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbjm(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbjj zzf() {
        return new zzbjj(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(zzbjm zzbjmVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbjj zzbjjVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbjj(j, strArr[0], zzbjjVar));
        }
        return true;
    }

    public final zzbjl zzc() {
        zzbjl zzbjlVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcG)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            List<zzbjj> list = this.zza;
            for (zzbjj zzbjjVar : list) {
                long jZza = zzbjjVar.zza();
                String strZzb = zzbjjVar.zzb();
                zzbjj zzbjjVarZzc = zzbjjVar.zzc();
                if (zzbjjVarZzc != null && jZza > 0) {
                    long jZza2 = jZza - zzbjjVarZzc.zza();
                    sb.append(strZzb);
                    sb.append('.');
                    sb.append(jZza2);
                    sb.append(',');
                    if (zBooleanValue) {
                        if (map.containsKey(Long.valueOf(zzbjjVarZzc.zza()))) {
                            StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbjjVarZzc.zza()));
                            sb2.append('+');
                            sb2.append(strZzb);
                        } else {
                            map.put(Long.valueOf(zzbjjVarZzc.zza()), new StringBuilder(strZzb));
                        }
                    }
                }
            }
            list.clear();
            String string = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (zBooleanValue) {
                for (Map.Entry entry : map.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                string = sb3.toString();
            }
            zzbjlVar = new zzbjl(sb.toString(), string);
        }
        return zzbjlVar;
    }

    public final void zzd(String str, String str2) {
        zzbjc zzbjcVarZza;
        if (TextUtils.isEmpty(str2) || (zzbjcVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbji zzbjiVarZzd = zzbjcVarZza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzbjiVarZzd.zza((String) map.get(str), str2));
        }
    }

    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
