package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeni extends zzbwv {
    final /* synthetic */ zzenj zza;
    private final zzemd zzb;

    /* synthetic */ zzeni(zzenj zzenjVar, zzemd zzemdVar, byte[] bArr) {
        Objects.requireNonNull(zzenjVar);
        this.zza = zzenjVar;
        this.zzb = zzemdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzd((View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzenp) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(String str) throws RemoteException {
        ((zzenp) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzenp) this.zzb.zzc).zzx(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzh(zzbvs zzbvsVar) throws RemoteException {
        this.zza.zze(zzbvsVar);
        ((zzenp) this.zzb.zzc).zzj();
    }
}
