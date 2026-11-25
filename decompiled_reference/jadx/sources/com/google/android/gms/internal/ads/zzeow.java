package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeow {
    private final zzhcy zzc;
    private zzepm zzf;
    private final String zzh;
    private final int zzi;
    private final zzepl zzj;
    private zzfkn zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Integer.MAX_VALUE;
    private boolean zzl = false;

    zzeow(zzfky zzfkyVar, zzepl zzeplVar, zzhcy zzhcyVar) {
        this.zzi = zzfkyVar.zzb.zzb.zzr;
        this.zzj = zzeplVar;
        this.zzc = zzhcyVar;
        this.zzh = zzeps.zzb(zzfkyVar);
        List list = zzfkyVar.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((zzfkn) list.get(i), Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized boolean zze() {
        if (this.zzl) {
            return false;
        }
        List list = this.zzb;
        if (!list.isEmpty() && ((zzfkn) list.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list2 = this.zzd;
            if (list2.size() < this.zzi && zzf(false)) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzf(boolean z) {
        for (zzfkn zzfknVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfknVar);
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            if (z || !this.zze.contains(zzfknVar.zzat)) {
                if (numValueOf.intValue() < this.zzg) {
                    return true;
                }
                if (numValueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzg() {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) this.zza.get((zzfkn) it.next());
            if (Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE).intValue() < this.zzg) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        return zzf(true) || zzg();
    }

    private final synchronized void zzi() {
        this.zzj.zzd(this.zzk);
        zzepm zzepmVar = this.zzf;
        zzhcy zzhcyVar = this.zzc;
        if (zzepmVar != null) {
            zzhcyVar.zza(zzepmVar);
        } else {
            zzhcyVar.zzb(new zzepp(3, this.zzh));
        }
    }

    @Nullable
    final synchronized zzfkn zza() {
        if (zze()) {
            int i = 0;
            while (true) {
                List list = this.zzb;
                if (i >= list.size()) {
                    break;
                }
                zzfkn zzfknVar = (zzfkn) list.get(i);
                String str = zzfknVar.zzat;
                Set set = this.zze;
                if (!set.contains(str)) {
                    if (zzfknVar.zzav) {
                        this.zzl = true;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        set.add(str);
                    }
                    this.zzd.add(zzfknVar);
                    return (zzfkn) list.remove(i);
                }
                i++;
            }
        }
        return null;
    }

    final synchronized void zzb(zzepm zzepmVar, zzfkn zzfknVar) {
        this.zzl = false;
        this.zzd.remove(zzfknVar);
        if (zzd()) {
            zzepmVar.zzm();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfknVar);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        if (numValueOf.intValue() > this.zzg) {
            this.zzj.zzf(zzfknVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzf(this.zzk);
        }
        this.zzg = numValueOf.intValue();
        this.zzf = zzepmVar;
        this.zzk = zzfknVar;
        if (zzh()) {
            return;
        }
        zzi();
    }

    final synchronized void zzc(Throwable th, zzfkn zzfknVar) {
        this.zzl = false;
        this.zzd.remove(zzfknVar);
        this.zze.remove(zzfknVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zzi();
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
