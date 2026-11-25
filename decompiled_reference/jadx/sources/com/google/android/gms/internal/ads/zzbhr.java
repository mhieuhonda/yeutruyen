package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhr implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcgd zza;
    final /* synthetic */ zzbhs zzb;

    zzbhr(zzbhs zzbhsVar, zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
        Objects.requireNonNull(zzbhsVar);
        this.zzb = zzbhsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzf()) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
