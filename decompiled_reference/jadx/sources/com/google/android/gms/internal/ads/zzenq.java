package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenq extends zzccg implements zzdej {
    private zzcch zza;
    private zzdei zzb;
    private zzdlr zzc;

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zza(zzdei zzdeiVar) {
        this.zzb = zzdeiVar;
    }

    public final synchronized void zzc(zzcch zzcchVar) {
        this.zza = zzcchVar;
    }

    public final synchronized void zzd(zzdlr zzdlrVar) {
        this.zzc = zzdlrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdlr zzdlrVar = this.zzc;
        if (zzdlrVar != null) {
            final zzemd zzemdVar = ((zzeqq) zzdlrVar).zzc;
            final zzfkn zzfknVar = ((zzeqq) zzdlrVar).zzb;
            final zzfky zzfkyVar = ((zzeqq) zzdlrVar).zza;
            final zzeqq zzeqqVar = (zzeqq) zzdlrVar;
            ((zzeqq) zzdlrVar).zzd.zzc().execute(new Runnable(zzeqqVar, zzfkyVar, zzfknVar, zzemdVar) { // from class: com.google.android.gms.internal.ads.zzeqp
                private final /* synthetic */ zzfky zza;
                private final /* synthetic */ zzfkn zzb;
                private final /* synthetic */ zzemd zzc;

                {
                    this.zza = zzfkyVar;
                    this.zzb = zzfknVar;
                    this.zzc = zzemdVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeqt.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdlr zzdlrVar = this.zzc;
        if (zzdlrVar != null) {
            String str = ((zzeqq) zzdlrVar).zzc.zza;
            String.valueOf(str);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdei zzdeiVar = this.zzb;
        if (zzdeiVar != null) {
            zzdeiVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            zzcchVar.zzj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, zzcci zzcciVar) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzd.zzb(zzcciVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdei zzdeiVar = this.zzb;
        if (zzdeiVar != null) {
            zzdeiVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzd.zzb(null);
        }
    }
}
