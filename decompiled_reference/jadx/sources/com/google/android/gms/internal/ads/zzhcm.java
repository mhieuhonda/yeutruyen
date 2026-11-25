package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzhcm extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzhcl(null);
    private static final Runnable zzb = new zzhcl(null);

    zzhcm() {
    }

    private final void zzb(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzhck zzhckVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzhck)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzhckVar = (zzhck) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzhckVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzd = zzd();
            if (!zZzd) {
                try {
                    objZza = zza();
                } catch (Throwable th) {
                    try {
                        zzhcx.zza(th);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzg(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzf(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzb(threadCurrentThread);
            }
            if (zZzd) {
                return;
            }
            zzf(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            string = "running=[DONE]";
        } else if (runnable instanceof zzhck) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strZzc = zzc();
        StringBuilder sb2 = new StringBuilder(string.length() + 2 + String.valueOf(strZzc).length());
        sb2.append(string);
        sb2.append(", ");
        sb2.append(strZzc);
        return sb2.toString();
    }

    abstract Object zza() throws Exception;

    abstract String zzc();

    abstract boolean zzd();

    abstract void zzf(Object obj);

    abstract void zzg(Throwable th);

    final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzhck zzhckVar = new zzhck(this, null);
            zzhckVar.zza(Thread.currentThread());
            if (compareAndSet(runnable, zzhckVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                    }
                } finally {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }
}
