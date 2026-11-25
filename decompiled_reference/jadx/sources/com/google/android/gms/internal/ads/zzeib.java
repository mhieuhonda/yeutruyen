package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeib implements zzhcc {
    final /* synthetic */ zzcbk zza;
    final /* synthetic */ zzcbb zzb;

    zzeib(zzeiq zzeiqVar, zzcbk zzcbkVar, zzcbb zzcbbVar) {
        this.zza = zzcbkVar;
        this.zzb = zzcbbVar;
        Objects.requireNonNull(zzeiqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        try {
            this.zzb.zzf(com.google.android.gms.ads.internal.util.zzba.zza(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue()) {
                this.zzb.zze(parcelFileDescriptor);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcT)).booleanValue() && (bundle = this.zza.zzm) != null) {
                bundle.putLong(zzdzc.BINDER_CALL_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            }
            this.zzb.zzg(parcelFileDescriptor, this.zza);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}
