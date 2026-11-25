package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfnx {
    private final zzfnp zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfnx(final zzfmv zzfmvVar, final zzfno zzfnoVar, final zzfnp zzfnpVar) {
        this.zza = zzfnpVar;
        this.zzb = zzhcf.zzh(zzhcf.zzj(zzfnoVar.zza(zzfnpVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfnw
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfnoVar, zzfmvVar, zzfnpVar, (zzfne) obj);
            }
        }, zzfnpVar.zza()), Exception.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfnu
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzfnoVar, (Exception) obj);
            }
        }, zzfnpVar.zza());
    }

    public final synchronized void zza(zzhcc zzhccVar) {
        zzfnp zzfnpVar = this.zza;
        zzhcf.zzr(zzhcf.zzj(this.zzb, zzfnv.zza, zzfnpVar.zza()), zzhccVar, zzfnpVar.zza());
    }

    public final synchronized ListenableFuture zzb(zzfnp zzfnpVar) {
        if (!this.zzd && !this.zzc) {
            zzfnp zzfnpVar2 = this.zza;
            if (zzfnpVar2.zzb() != null && zzfnpVar.zzb() != null && zzfnpVar2.zzb().equals(zzfnpVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    final /* synthetic */ ListenableFuture zzc(zzfno zzfnoVar, zzfmv zzfmvVar, zzfnp zzfnpVar, zzfne zzfneVar) {
        synchronized (this) {
            this.zzd = true;
            zzfnoVar.zzb(zzfneVar);
            if (this.zzc) {
                return zzhcf.zza(new zzfnn(zzfneVar, zzfnpVar));
            }
            zzfmvVar.zzb(zzfnpVar.zzb(), zzfneVar);
            return zzhcf.zza(null);
        }
    }

    final /* synthetic */ ListenableFuture zzd(zzfno zzfnoVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}
