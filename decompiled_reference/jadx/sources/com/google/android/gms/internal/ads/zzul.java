package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzul {
    public final int zza;
    public final zzxl zzb;
    private final CopyOnWriteArrayList zzc;

    public zzul() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzul(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzxl zzxlVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxlVar;
    }

    public final zzul zza(int i, zzxl zzxlVar) {
        return new zzul(this.zzc, 0, zzxlVar);
    }

    public final void zzb(Handler handler, zzum zzumVar) {
        this.zzc.add(new zzuk(handler, zzumVar));
    }

    public final void zzc(zzum zzumVar) {
        CopyOnWriteArrayList<zzuk> copyOnWriteArrayList = this.zzc;
        for (zzuk zzukVar : copyOnWriteArrayList) {
            if (zzukVar.zza == zzumVar) {
                copyOnWriteArrayList.remove(zzukVar);
            }
        }
    }
}
