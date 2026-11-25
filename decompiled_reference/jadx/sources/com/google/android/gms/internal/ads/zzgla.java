package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgla extends zzfxq {
    private final zzgfs zzb;

    zzgla(Context context, Executor executor, zzgfs zzgfsVar) {
        super(context, executor, new TaskCompletionSource().getTask(), false);
        this.zzb = zzgfsVar;
    }

    private static Task zzh() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(true);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final Task zzb(int i, long j) {
        this.zzb.zzb(i, j, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final Task zzc(int i, long j, Exception exc) {
        this.zzb.zzb(i, j, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final Task zze(int i, String str) {
        this.zzb.zzb(i, -1L, null, str);
        return zzh();
    }
}
