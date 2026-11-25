package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfgm implements zzddc, zzdey, zzfib, com.google.android.gms.ads.internal.overlay.zzr, zzdfq, zzddp, zzdlg {
    private final zzfmr zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfgm zzi = null;

    public zzfgm(zzfmr zzfmrVar) {
        this.zza = zzfmrVar;
    }

    public static zzfgm zzn(zzfgm zzfgmVar) {
        zzfgm zzfgmVar2 = new zzfgm(zzfgmVar.zza);
        zzfgmVar2.zzi = zzfgmVar;
        return zzfgmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdR() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzdT();
        } else {
            zzfht.zza(this.zzf, zzffx.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(final int i) {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzdU(i);
        } else {
            zzfht.zza(this.zzf, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfgd
                @Override // com.google.android.gms.internal.ads.zzfhs
                public final /* synthetic */ void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdU(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdu() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzdu();
        } else {
            zzfht.zza(this.zzd, zzfgj.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzdv();
        } else {
            zzfht.zza(this.zzf, zzffy.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzh();
            return;
        }
        zzfht.zza(this.zzf, zzffz.zza);
        AtomicReference atomicReference = this.zzd;
        zzfht.zza(atomicReference, zzfgh.zza);
        zzfht.zza(atomicReference, zzfgi.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzj(zzeVar);
        } else {
            zzfht.zza(this.zzd, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfge
                @Override // com.google.android.gms.internal.ads.zzfhs
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbgx) obj).zze(zzeVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdey
    public final void zzl() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzl();
        } else {
            zzfht.zza(this.zze, zzffw.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzm(zztVar);
        } else {
            zzfht.zza(this.zzg, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfgf
                @Override // com.google.android.gms.internal.ads.zzfhs
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
                }
            });
        }
    }

    public final void zzo(zzbgt zzbgtVar) {
        this.zzb.set(zzbgtVar);
    }

    public final void zzp(zzbgx zzbgxVar) {
        this.zzd.set(zzbgxVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zzf.set(zzrVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzg.set(zzdqVar);
    }

    public final void zzs(zzfti zzftiVar) {
        this.zzh.set(zzftiVar);
    }

    public final void zzu() {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzu();
            return;
        }
        this.zza.zzb();
        zzfht.zza(this.zzc, zzfgg.zza);
        zzfht.zza(this.zzd, zzfgk.zza);
        zzfht.zza(this.zzh, zzfgl.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfib
    public final void zzv(zzfib zzfibVar) {
        this.zzi = (zzfgm) zzfibVar;
    }

    public final void zzt(final zzbgq zzbgqVar) {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzt(zzbgqVar);
        } else {
            zzfht.zza(this.zzb, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfga
                @Override // com.google.android.gms.internal.ads.zzfhs
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbgt) obj).zzb(zzbgqVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfgm zzfgmVar = this.zzi;
        if (zzfgmVar != null) {
            zzfgmVar.zzdJ(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzfht.zza(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfgb
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbgt) obj).zzd(zzeVar);
            }
        });
        zzfht.zza(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfgc
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbgt) obj).zzc(zzeVar.zza);
            }
        });
    }
}
