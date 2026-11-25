package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzemf {
    private final String zzc;
    private zzfkq zzd = null;
    private zzfkn zze = null;
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzemf(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzfkn zzfknVar, int i) {
        Map map = this.zzb;
        String strZzl = zzl(zzfknVar);
        if (map.containsKey(strZzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfknVar.zzv;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfknVar.zzE, 0L, null, bundle, zzfknVar.zzF, zzfknVar.zzG, zzfknVar.zzH, zzfknVar.zzI);
        try {
            this.zza.add(i, zzvVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzl, zzvVar);
    }

    private final void zzk(zzfkn zzfknVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        Map map = this.zzb;
        String strZzl = zzl(zzfknVar);
        if (map.containsKey(strZzl)) {
            if (this.zze == null) {
                this.zze = zzfknVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(strZzl);
            zzvVar.zzb = j;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhP)).booleanValue() && z) {
                this.zzf = zzvVar;
            }
        }
    }

    private static String zzl(zzfkn zzfknVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeE)).booleanValue() ? zzfknVar.zzap : zzfknVar.zzw;
    }

    public final void zza(zzfkq zzfkqVar) {
        this.zzd = zzfkqVar;
    }

    public final void zzb(zzfkn zzfknVar) {
        zzj(zzfknVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        try {
            Map map = this.zzb;
            if (map.containsKey(str)) {
                com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
                List list2 = this.zza;
                int iIndexOf = list2.indexOf(zzvVar);
                try {
                    list2.remove(iIndexOf);
                } catch (IndexOutOfBoundsException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
                }
                this.zzb.remove(str);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzj((zzfkn) it.next(), iIndexOf);
                    iIndexOf++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzd(zzfkn zzfknVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfknVar, j, null, true);
    }

    public final void zze(zzfkn zzfknVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfknVar, j, zzeVar, false);
    }

    public final zzdcs zzf() {
        return new zzdcs(this.zze, "", this, this.zzd, this.zzc);
    }

    public final com.google.android.gms.ads.internal.client.zzv zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzfkn zzfknVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzfknVar));
        List list = this.zza;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }
}
