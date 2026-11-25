package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenp extends zzbvo implements zzdej {
    private zzbvp zza;
    private zzdei zzb;

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zza(zzdei zzdeiVar) {
        this.zzb = zzdeiVar;
    }

    public final synchronized void zzc(zzbvp zzbvpVar) {
        this.zza = zzbvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zze() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzf() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzg(int i) throws RemoteException {
        zzdei zzdeiVar = this.zzb;
        if (zzdeiVar != null) {
            zzdeiVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzh() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzi() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzj() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzj();
        }
        zzdei zzdeiVar = this.zzb;
        if (zzdeiVar != null) {
            zzdeiVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzk() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzl(String str, String str2) throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzl(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzm(zzbnc zzbncVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzn() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzo() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzp(zzcci zzcciVar) throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzp(zzcciVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzq() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzr(zzccm zzccmVar) throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzr(zzccmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzs(int i) throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzt() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzu() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzv(String str) throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzw(int i, String str) throws RemoteException {
        zzdei zzdeiVar = this.zzb;
        if (zzdeiVar != null) {
            zzdeiVar.zzc(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdei zzdeiVar = this.zzb;
        if (zzdeiVar != null) {
            zzdeiVar.zzd(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzy(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzz() throws RemoteException {
        zzbvp zzbvpVar = this.zza;
        if (zzbvpVar != null) {
            zzbvpVar.zzz();
        }
    }
}
