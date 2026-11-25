package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeaw {
    private final Map zza = new ConcurrentHashMap();

    zzeaw() {
    }

    public final synchronized void zza(long j, int i, long j2) {
        int iIntValue;
        ArrayDeque arrayDeque;
        Long l;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziQ)).booleanValue()) {
            if (i == 2) {
                zzeau zzeauVar = new zzeau();
                zzeauVar.zza(j);
                zzeauVar.zzb(1);
                zzeaz zzeazVarZzc = zzeauVar.zzc();
                Map map = this.zza;
                ArrayDeque arrayDeque2 = (ArrayDeque) map.get(zzeazVarZzc);
                if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                    arrayDeque2.removeFirst();
                    if (arrayDeque2.isEmpty()) {
                        map.remove(zzeazVarZzc);
                    }
                }
                i = 2;
            }
            zzeau zzeauVar2 = new zzeau();
            zzeauVar2.zza(j);
            zzeauVar2.zzb(i);
            zzeaz zzeazVarZzc2 = zzeauVar2.zzc();
            int iZzb = zzeazVarZzc2.zzb();
            if (iZzb != 0) {
                if (iZzb == 1) {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziX)).intValue();
                } else if (iZzb != 2) {
                    iIntValue = iZzb != 3 ? 0 : ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziZ)).intValue();
                } else {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziY)).intValue();
                }
            }
            if (iIntValue > 0) {
                Map map2 = this.zza;
                ArrayDeque arrayDeque3 = (ArrayDeque) map2.get(zzeazVarZzc2);
                if (arrayDeque3 == null) {
                    arrayDeque3 = new ArrayDeque();
                    map2.put(zzeazVarZzc2, arrayDeque3);
                }
                arrayDeque3.addLast(Long.valueOf(j2));
                while (arrayDeque3.size() > iIntValue) {
                    arrayDeque3.removeFirst();
                }
                zzc();
                int iIntValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzja)).intValue();
                if (iIntValue2 <= 0) {
                    map2.clear();
                    return;
                }
                while (true) {
                    Iterator it = map2.values().iterator();
                    int size = 0;
                    while (it.hasNext()) {
                        size += ((ArrayDeque) it.next()).size();
                    }
                    if (size <= iIntValue2) {
                        break;
                    }
                    if (!map2.isEmpty()) {
                        Long l2 = Long.MAX_VALUE;
                        Map.Entry entry = null;
                        for (Map.Entry entry2 : map2.entrySet()) {
                            ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                            if (!arrayDeque4.isEmpty() && (l = (Long) arrayDeque4.peekFirst()) != null && l.longValue() < l2.longValue()) {
                                entry = entry2;
                                l2 = l;
                            }
                        }
                        if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                            arrayDeque.removeFirst();
                            if (arrayDeque.isEmpty()) {
                                map2.remove(entry.getKey());
                            }
                        }
                    }
                }
            }
        }
    }

    public final synchronized Map zzb() {
        HashMap map;
        map = new HashMap();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziQ)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                map.put((zzeaz) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    final void zzc() {
        long jLongValue;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        Iterator it = this.zza.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzeaz zzeazVar = (zzeaz) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int iZzb = zzeazVar.zzb();
            if (iZzb == 0) {
                jLongValue = 0;
            } else if (iZzb == 1) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziU)).longValue();
            } else if (iZzb == 2) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziV)).longValue();
            } else if (iZzb != 3) {
                jLongValue = 0;
            } else {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziW)).longValue();
            }
            if (jLongValue == 0) {
                it.remove();
                jLongValue = 0;
            }
            if (jLongValue > 0) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext() && jCurrentTimeMillis - ((Long) it2.next()).longValue() > jLongValue) {
                    it2.remove();
                }
                if (arrayDeque.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
