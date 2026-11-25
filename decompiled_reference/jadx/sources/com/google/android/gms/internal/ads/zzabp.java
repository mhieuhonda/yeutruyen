package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabp {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzabq zzabqVar) {
        zzb(zzabqVar);
        this.zza.add(new zzabo(handler, zzabqVar));
    }

    public final void zzb(zzabq zzabqVar) {
        CopyOnWriteArrayList<zzabo> copyOnWriteArrayList = this.zza;
        for (zzabo zzaboVar : copyOnWriteArrayList) {
            if (zzaboVar.zzc() == zzabqVar) {
                zzaboVar.zza();
                copyOnWriteArrayList.remove(zzaboVar);
            }
        }
    }

    public final void zzc(final int i, final long j, final long j2) {
        for (final zzabo zzaboVar : this.zza) {
            if (!zzaboVar.zzd()) {
                zzaboVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzaboVar.zzc().zzX(i, j, j2);
                    }
                });
            }
        }
    }
}
