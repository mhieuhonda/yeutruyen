package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdzo;
import com.google.android.gms.internal.ads.zzdzy;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzq {
    private final zzdzy zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhX)).intValue();
    private final long zzb = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhY)).longValue();
    private final boolean zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzic)).booleanValue();
    private final boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzib)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzn(this));

    public zzq(zzdzy zzdzyVar) {
        this.zzh = zzdzyVar;
    }

    private final synchronized void zzi() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            try {
                Iterator it = this.zze.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (jCurrentTimeMillis - ((zzo) entry.getValue()).zza.longValue() <= this.zzb) {
                        break;
                    }
                    this.zzg.add(new Pair((String) entry.getKey(), ((zzo) entry.getValue()).zzb));
                    it.remove();
                    throw th;
                }
            } catch (ConcurrentModificationException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "QueryJsonMap.removeExpiredEntries");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzj(final zzdzo zzdzoVar) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(zzdzoVar, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void zzk(zzdzo zzdzoVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdzoVar.zzc());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzv.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzl(this.zzi, "e_type", (String) pair.first);
                zzl(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzb(this.zzi);
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized void zza(String str, String str2, zzdzo zzdzoVar) {
        this.zze.put(str, new zzo(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()), str2, new HashSet()));
        zzi();
        zzj(zzdzoVar);
    }

    public final synchronized String zzb(String str, zzdzo zzdzoVar) {
        zzo zzoVar = (zzo) this.zze.get(str);
        zzdzoVar.zzc().put("request_id", str);
        if (zzoVar == null) {
            zzdzoVar.zzc().put("mhit", "false");
            return null;
        }
        zzdzoVar.zzc().put("mhit", "true");
        return zzoVar.zzb;
    }

    public final synchronized void zzc(String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzd(String str, String str2) {
        zzo zzoVar = (zzo) this.zze.get(str);
        return zzoVar != null && zzoVar.zzc.contains(str2);
    }

    public final synchronized boolean zze(String str, String str2, int i) {
        zzo zzoVar = (zzo) this.zze.get(str);
        if (zzoVar == null) {
            return false;
        }
        Set set = zzoVar.zzc;
        set.add(str2);
        return set.size() < i;
    }

    final /* synthetic */ void zzf(zzdzo zzdzoVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzk(zzdzoVar, arrayDeque, TypedValues.TransitionType.S_TO);
        zzk(zzdzoVar, arrayDeque2, "of");
    }

    final /* synthetic */ int zzg() {
        return this.zza;
    }

    final /* synthetic */ ArrayDeque zzh() {
        return this.zzf;
    }
}
