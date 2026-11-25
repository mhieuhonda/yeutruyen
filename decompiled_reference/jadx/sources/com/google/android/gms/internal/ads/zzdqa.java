package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqa extends com.google.android.gms.ads.internal.client.zzdz {
    private final Object zza = new Object();

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzea zzb;

    @Nullable
    private final zzbvy zzc;

    public zzdqa(@Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar, @Nullable zzbvy zzbvyVar) {
        this.zzb = zzeaVar;
        this.zzc = zzbvyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() throws RemoteException {
        zzbvy zzbvyVar = this.zzc;
        if (zzbvyVar != null) {
            return zzbvyVar.zzA();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() throws RemoteException {
        zzbvy zzbvyVar = this.zzc;
        if (zzbvyVar != null) {
            return zzbvyVar.zzB();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(@Nullable com.google.android.gms.ads.internal.client.zzed zzedVar) throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar != null) {
                zzeaVar.zzl(zzedVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzed zzo() throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return null;
            }
            return zzeaVar.zzo();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}
