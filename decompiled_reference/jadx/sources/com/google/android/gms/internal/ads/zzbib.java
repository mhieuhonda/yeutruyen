package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbib {
    zzbet zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbib() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    final /* synthetic */ ExecutorService zza() {
        return this.zzc;
    }

    public zzbib(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgk)).booleanValue();
                Context context2 = context;
                zzbib zzbibVar = this.zza;
                if (zBooleanValue) {
                    try {
                        zzbibVar.zza = (zzbet) com.google.android.gms.ads.internal.util.client.zzs.zza(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbhy.zza);
                        zzbibVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbibVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
