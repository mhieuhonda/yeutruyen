package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbng;
import com.google.android.gms.internal.ads.zzbnj;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbsr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbo extends zzbel implements zzbq {
    zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel parcelZzcZ = zzcZ(1, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzblVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = iInterfaceQueryLocalInterface instanceof zzbn ? (zzbn) iInterfaceQueryLocalInterface : new zzbl(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbh zzbhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbhVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbng zzbngVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(zzbnj zzbnjVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, zzbnp zzbnpVar, zzbnm zzbnmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbnpVar);
        zzben.zze(parcelZza, zzbnmVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbma zzbmaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzbmaVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbnt zzbntVar, zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbntVar);
        zzben.zzc(parcelZza, zzrVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(zzbnw zzbnwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbnwVar);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbsi zzbsiVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbsr zzbsrVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, adManagerAdViewOptions);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcp zzcpVar) throws RemoteException {
        throw null;
    }
}
