package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbwn extends zzbvo {
    private final Adapter zza;
    private final zzcch zzb;

    zzbwn(Adapter adapter, zzcch zzcchVar) {
        this.zza = adapter;
        this.zzb = zzcchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze() throws RemoteException {
        zzcch zzcchVar = this.zzb;
        if (zzcchVar != null) {
            zzcchVar.zzl(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf() throws RemoteException {
        zzcch zzcchVar = this.zzb;
        if (zzcchVar != null) {
            zzcchVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg(int i) throws RemoteException {
        zzcch zzcchVar = this.zzb;
        if (zzcchVar != null) {
            zzcchVar.zzm(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzh() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzi() throws RemoteException {
        zzcch zzcchVar = this.zzb;
        if (zzcchVar != null) {
            zzcchVar.zzh(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzj() throws RemoteException {
        zzcch zzcchVar = this.zzb;
        if (zzcchVar != null) {
            zzcchVar.zzg(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzk() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzl(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzm(zzbnc zzbncVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzo() throws RemoteException {
        zzcch zzcchVar = this.zzb;
        if (zzcchVar != null) {
            zzcchVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzp(zzcci zzcciVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzr(zzccm zzccmVar) throws RemoteException {
        zzcch zzcchVar = this.zzb;
        if (zzcchVar != null) {
            zzcchVar.zzk(ObjectWrapper.wrap(this.zza), new zzcci(zzccmVar.zze(), zzccmVar.zzf()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzs(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzt() throws RemoteException {
        zzcch zzcchVar = this.zzb;
        if (zzcchVar != null) {
            zzcchVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzu() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzv(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzw(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzz() throws RemoteException {
        zzcch zzcchVar = this.zzb;
        if (zzcchVar != null) {
            zzcchVar.zzp(ObjectWrapper.wrap(this.zza));
        }
    }
}
