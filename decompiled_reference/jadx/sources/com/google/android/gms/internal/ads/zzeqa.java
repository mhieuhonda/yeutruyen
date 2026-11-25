package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeqa extends zzbxe {
    private final zzemd zza;

    /* synthetic */ zzeqa(zzeqb zzeqbVar, zzemd zzemdVar, byte[] bArr) {
        Objects.requireNonNull(zzeqbVar);
        this.zza = zzemdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zze() throws RemoteException {
        ((zzenp) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzf(String str) throws RemoteException {
        ((zzenp) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzenp) this.zza.zzc).zzx(zzeVar);
    }
}
