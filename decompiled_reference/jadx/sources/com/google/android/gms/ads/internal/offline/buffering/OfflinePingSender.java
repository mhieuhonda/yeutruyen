package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbzb;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class OfflinePingSender extends Worker {
    private final zzbzb zza;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zzb().zzj(context, new zzbvf());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        try {
            this.zza.zzg();
            return ListenableWorker.Result.success();
        } catch (RemoteException unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
