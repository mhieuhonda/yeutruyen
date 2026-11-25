package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzebp extends zzccv {
    final /* synthetic */ zzebr zza;

    zzebp(zzebr zzebrVar) {
        Objects.requireNonNull(zzebrVar);
        this.zza = zzebrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zze() throws RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzk(zzebrVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzf(int i) throws RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzl(zzebrVar.zzd(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzl(zzebrVar.zzd(), zzeVar.zza);
    }
}
