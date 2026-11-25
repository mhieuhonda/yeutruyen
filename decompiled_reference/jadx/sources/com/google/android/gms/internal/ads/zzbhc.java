package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhc implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbhe zza;

    zzbhc(zzbhe zzbheVar) {
        Objects.requireNonNull(zzbheVar);
        this.zza = zzbheVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbhe zzbheVar = this.zza;
        synchronized (zzbheVar.zzh()) {
            try {
                if (zzbheVar.zzi() != null) {
                    zzbheVar.zzk(zzbheVar.zzi().zzq());
                }
            } catch (DeadObjectException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                this.zza.zzg();
            }
            this.zza.zzh().notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbhe zzbheVar = this.zza;
        synchronized (zzbheVar.zzh()) {
            zzbheVar.zzk(null);
            zzbheVar.zzh().notifyAll();
        }
    }
}
