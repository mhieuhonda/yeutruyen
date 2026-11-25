package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhcf extends zzhch {
    public static ListenableFuture zza(Object obj) {
        return obj == null ? zzhcj.zza : new zzhcj(obj);
    }

    public static ListenableFuture zzb() {
        return zzhcj.zza;
    }

    public static ListenableFuture zzd(Callable callable, Executor executor) {
        zzhde zzhdeVar = new zzhde(callable);
        executor.execute(zzhdeVar);
        return zzhdeVar;
    }

    public static ListenableFuture zze(Runnable runnable, Executor executor) {
        zzhde zzhdeVarZze = zzhde.zze(runnable, null);
        executor.execute(zzhdeVarZze);
        return zzhdeVarZze;
    }

    public static ListenableFuture zzf(zzhbm zzhbmVar, Executor executor) {
        zzhde zzhdeVar = new zzhde(zzhbmVar);
        executor.execute(zzhdeVar);
        return zzhdeVar;
    }

    public static ListenableFuture zzg(ListenableFuture listenableFuture, Class cls, zzgti zzgtiVar, Executor executor) {
        int i = zzhax.zzd;
        zzhaw zzhawVar = new zzhaw(listenableFuture, cls, zzgtiVar);
        listenableFuture.addListener(zzhawVar, zzhcw.zzd(executor, zzhawVar));
        return zzhawVar;
    }

    public static ListenableFuture zzh(ListenableFuture listenableFuture, Class cls, zzhbn zzhbnVar, Executor executor) {
        int i = zzhax.zzd;
        zzhav zzhavVar = new zzhav(listenableFuture, cls, zzhbnVar);
        listenableFuture.addListener(zzhavVar, zzhcw.zzd(executor, zzhavVar));
        return zzhavVar;
    }

    public static ListenableFuture zzi(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : zzhdb.zze(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static ListenableFuture zzj(ListenableFuture listenableFuture, zzhbn zzhbnVar, Executor executor) {
        int i = zzhbe.zzc;
        zzhbc zzhbcVar = new zzhbc(listenableFuture, zzhbnVar);
        listenableFuture.addListener(zzhbcVar, zzhcw.zzd(executor, zzhbcVar));
        return zzhbcVar;
    }

    public static ListenableFuture zzk(ListenableFuture listenableFuture, zzgti zzgtiVar, Executor executor) {
        int i = zzhbe.zzc;
        zzhbd zzhbdVar = new zzhbd(listenableFuture, zzgtiVar);
        listenableFuture.addListener(zzhbdVar, zzhcw.zzd(executor, zzhbdVar));
        return zzhbdVar;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzhbo(zzgwt.zzr(listenableFutureArr), true);
    }

    public static ListenableFuture zzm(Iterable iterable) {
        return new zzhbo(zzgwt.zzp(iterable), true);
    }

    public static zzhce zzn(Iterable iterable) {
        return new zzhce(false, zzgwt.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzhce zzo(ListenableFuture... listenableFutureArr) {
        return new zzhce(true, zzgwt.zzr(listenableFutureArr), null);
    }

    public static zzhce zzp(Iterable iterable) {
        return new zzhce(true, zzgwt.zzp(iterable), null);
    }

    @SafeVarargs
    public static ListenableFuture zzq(ListenableFuture... listenableFutureArr) {
        return new zzhbo(zzgwt.zzr(listenableFutureArr), false);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzhdg.zza(future);
        }
        throw new IllegalStateException(zzgui.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhdg.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzhbv((Error) e.getCause());
            }
            throw new zzhdf(e.getCause());
        }
    }

    public static ListenableFuture zzc(Throwable th) {
        th.getClass();
        return new zzhci(th);
    }

    public static void zzr(ListenableFuture listenableFuture, zzhcc zzhccVar, Executor executor) {
        zzhccVar.getClass();
        listenableFuture.addListener(new zzhcd(listenableFuture, zzhccVar), executor);
    }
}
