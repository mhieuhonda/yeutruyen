package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhcz implements Runnable {
    zzhdb zza;

    zzhcz(zzhdb zzhdbVar) {
        this.zza = zzhdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFutureZzf;
        zzhdb zzhdbVar = this.zza;
        if (zzhdbVar == null || (listenableFutureZzf = zzhdbVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (listenableFutureZzf.isDone()) {
            zzhdbVar.zzk(listenableFutureZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzhdbVar.zzx();
            zzhdbVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb.append("Timed out (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    zzhdbVar.zzb(new zzhda(string, null));
                    throw th;
                }
            }
            String string2 = listenableFutureZzf.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 2 + string2.length());
            sb2.append(string);
            sb2.append(": ");
            sb2.append(string2);
            zzhdbVar.zzb(new zzhda(sb2.toString(), null));
            listenableFutureZzf.cancel(true);
        } catch (Throwable th2) {
            listenableFutureZzf.cancel(true);
            throw th2;
        }
    }
}
