package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeoq extends zzbxb {
    final /* synthetic */ zzeor zza;
    private final zzemd zzb;

    /* synthetic */ zzeoq(zzeor zzeorVar, zzemd zzemdVar, byte[] bArr) {
        Objects.requireNonNull(zzeorVar);
        this.zza = zzeorVar;
        this.zzb = zzemdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zze(zzbvy zzbvyVar) throws RemoteException {
        this.zza.zzc(zzbvyVar);
        ((zzenp) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzf(String str) throws RemoteException {
        ((zzenp) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzenp) this.zzb.zzc).zzx(zzeVar);
    }
}
