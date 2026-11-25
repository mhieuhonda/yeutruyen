package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzecu {
    private final zzece zza;
    private final zzdxh zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzecu(zzece zzeceVar, zzdxh zzdxhVar) {
        this.zza = zzeceVar;
        this.zzb = zzdxhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        zzdxg zzdxgVarZzc;
        zzdxg zzdxgVarZzc2;
        zzbxx zzbxxVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbrw zzbrwVar = (zzbrw) it.next();
                String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkR)).booleanValue() || (zzdxgVarZzc2 = this.zzb.zzc(zzbrwVar.zza)) == null || (zzbxxVar = zzdxgVarZzc2.zzc) == null) ? "" : zzbxxVar.toString();
                String str = string;
                boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkS)).booleanValue() && (zzdxgVarZzc = this.zzb.zzc(zzbrwVar.zza)) != null && zzdxgVarZzc.zzd;
                List list2 = this.zzd;
                String str2 = zzbrwVar.zza;
                list2.add(new zzect(str2, str, this.zzb.zzd(str2), zzbrwVar.zzb ? 1 : 0, zzbrwVar.zzd, zzbrwVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzb(new zzecs(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                zzece zzeceVar = this.zza;
                if (!zzeceVar.zze()) {
                    zza();
                    return jSONArray;
                }
                zzc(zzeceVar.zzd());
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzect) it.next()).zza());
            }
            return jSONArray;
        }
    }
}
