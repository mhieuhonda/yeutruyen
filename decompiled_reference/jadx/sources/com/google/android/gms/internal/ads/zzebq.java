package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzebq extends zzccr {
    final /* synthetic */ zzebr zza;

    zzebq(zzebr zzebrVar) {
        Objects.requireNonNull(zzebrVar);
        this.zza = zzebrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zze() throws RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzm(zzebrVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzf() throws RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzo(zzebrVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzg(zzccm zzccmVar) throws RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzp(zzebrVar.zzd(), zzccmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzh(int i) throws RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzn(zzebrVar.zzd(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzn(zzebrVar.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzj() throws RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzq(zzebrVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk() throws RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzr(zzebrVar.zzd());
    }
}
