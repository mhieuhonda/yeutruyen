package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhd implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbhe zza;

    zzbhd(zzbhe zzbheVar) {
        Objects.requireNonNull(zzbheVar);
        this.zza = zzbheVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzbhe zzbheVar = this.zza;
        synchronized (zzbheVar.zzh()) {
            zzbheVar.zzk(null);
            if (zzbheVar.zzi() != null) {
                zzbheVar.zzj(null);
            }
            zzbheVar.zzh().notifyAll();
        }
    }
}
