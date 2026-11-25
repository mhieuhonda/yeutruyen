package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzetx {
    private final zzdql zza;
    private final zzetk zzb;
    private final zzddc zzc;

    public zzetx(zzdql zzdqlVar, zzdzt zzdztVar) {
        this.zza = zzdqlVar;
        final zzetk zzetkVar = new zzetk(zzdztVar);
        this.zzb = zzetkVar;
        final zzbsr zzbsrVarZze = zzdqlVar.zze();
        this.zzc = new zzddc() { // from class: com.google.android.gms.internal.ads.zzetw
            @Override // com.google.android.gms.internal.ads.zzddc
            public final /* synthetic */ void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzetkVar.zzdJ(zzeVar);
                zzbsr zzbsrVar = zzbsrVarZze;
                if (zzbsrVar != null) {
                    try {
                        zzbsrVar.zzg(zzeVar);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbsrVar != null) {
                    try {
                        zzbsrVar.zzf(zzeVar.zza);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zzl(zzbhVar);
    }

    public final zzdof zzb() {
        return new zzdof(this.zza, this.zzb.zzi());
    }

    public final zzetk zzc() {
        return this.zzb;
    }

    public final zzden zzd() {
        return this.zzb;
    }

    public final zzddc zze() {
        return this.zzc;
    }
}
