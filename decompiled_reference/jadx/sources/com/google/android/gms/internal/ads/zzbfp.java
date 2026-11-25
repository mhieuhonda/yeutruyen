package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbfp implements Runnable {
    final /* synthetic */ zzbfq zza;

    zzbfp(zzbfq zzbfqVar) {
        Objects.requireNonNull(zzbfqVar);
        this.zza = zzbfqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbfq zzbfqVar = this.zza;
        synchronized (zzbfqVar.zzf()) {
            if (zzbfqVar.zzg().get() && zzbfqVar.zzh()) {
                zzbfqVar.zzg().set(false);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                Iterator it = zzbfqVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbfr) it.next()).zza(false);
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                    }
                }
            } else {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}
