package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzemr extends zzbws {
    private final zzemd zza;

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zze() throws RemoteException {
        ((zzenp) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzf(String str) throws RemoteException {
        ((zzenp) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzenp) this.zza.zzc).zzx(zzeVar);
    }
}
