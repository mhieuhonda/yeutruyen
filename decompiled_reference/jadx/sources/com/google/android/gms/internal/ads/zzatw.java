package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzatw {
    public static final boolean zza = zzatx.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzatw() {
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzatx.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzatv(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzatv> list = this.zzb;
        long j = list.size() == 0 ? 0L : ((zzatv) list.get(list.size() - 1)).zzc - ((zzatv) list.get(0)).zzc;
        if (j > 0) {
            long j2 = ((zzatv) list.get(0)).zzc;
            zzatx.zzb("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzatv zzatvVar : list) {
                long j3 = zzatvVar.zzc;
                zzatx.zzb("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzatvVar.zzb), zzatvVar.zza);
                j2 = j3;
            }
        }
    }
}
