package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdd {
    public static ListenableFuture zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzgdb zzgdbVar = new zzgdb(task, null);
        task.addOnCompleteListener(zzhcw.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzgdc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzgdb zzgdbVar2 = zzgdbVar;
                if (task2.isCanceled()) {
                    zzgdbVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzgdbVar2.zza(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzgdbVar2.zzb(exception);
            }
        });
        return zzgdbVar;
    }
}
