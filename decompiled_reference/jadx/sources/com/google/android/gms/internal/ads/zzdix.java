package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzdix {
    protected final Map zza = new HashMap();

    protected zzdix(Set set) {
        zzr(set);
    }

    public final synchronized void zzp(zzdky zzdkyVar) {
        zzq(zzdkyVar.zza, zzdkyVar.zzb);
    }

    public final synchronized void zzq(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzr(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzp((zzdky) it.next());
        }
    }

    protected final synchronized void zzs(final zzdiw zzdiwVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    try {
                        zzdiwVar.zza(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
