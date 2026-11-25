package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzfxq {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfxq(Context context, Executor executor, Task task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static zzfxq zza(final Context context, Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzfxq.zza;
                    taskCompletionSource.setResult(zzfzm.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzfxq.zza;
                    taskCompletionSource.setResult(zzfzm.zzc());
                }
            });
        }
        return new zzfxq(context, executor, taskCompletionSource.getTask(), z);
    }

    static void zzg(int i) {
        zzf = i;
    }

    private final Task zzh(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfxp.zza);
        }
        Context context = this.zzb;
        final zzawz zzawzVarZza = zzaxd.zza();
        zzawzVarZza.zza(context.getPackageName());
        zzawzVarZza.zzb(j);
        zzawzVarZza.zzg(zzf);
        if (exc != null) {
            int i2 = zzgun.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzawzVarZza.zzc(stringWriter.toString());
            zzawzVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzawzVarZza.zze(str2);
        }
        if (str != null) {
            zzawzVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfxn
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                int i3 = zzfxq.zza;
                if (!task.isSuccessful()) {
                    return false;
                }
                int i4 = i;
                zzfzl zzfzlVarZza = ((zzfzm) task.getResult()).zza(((zzaxd) zzawzVarZza.zzbu()).zzaN());
                zzfzlVarZza.zzc(i4);
                zzfzlVarZza.zza();
                return true;
            }
        });
    }

    public Task zzb(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public Task zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task zzd(int i, long j, String str, Map map) {
        return zzh(i, j, null, str, null, null);
    }

    public Task zze(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzf(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }
}
