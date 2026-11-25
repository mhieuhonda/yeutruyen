package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgqr extends zzbel implements zzgqt {
    zzgqr(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final void zze(String str, Bundle bundle, zzgqv zzgqvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zzc(parcelZza, bundle);
        zzben.zze(parcelZza, zzgqvVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final void zzf(Bundle bundle, zzgqv zzgqvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, bundle);
        zzben.zze(parcelZza, zzgqvVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final void zzg(Bundle bundle, zzgqv zzgqvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, bundle);
        zzben.zze(parcelZza, zzgqvVar);
        zzdb(3, parcelZza);
    }
}
