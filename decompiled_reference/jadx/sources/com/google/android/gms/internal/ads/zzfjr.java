package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjr implements OnAdMetadataChangedListener, zzden, zzddc, zzdcz, zzddp, zzdfq, zzfib, zzdlg {
    private final zzfmr zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private final AtomicReference zzi = new AtomicReference();
    private zzfjr zzj = null;

    public zzfjr(zzfmr zzfmrVar) {
        this.zza = zzfmrVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.onAdMetadataChanged();
        } else {
            zzfht.zza(this.zzb, zzfjq.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdR() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.zzds();
            return;
        }
        this.zza.zzb();
        zzfht.zza(this.zzd, zzfjf.zza);
        zzfht.zza(this.zze, zzfjk.zza);
        zzfht.zza(this.zzi, zzfjp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdu() {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.zzdu();
        } else {
            zzfht.zza(this.zzd, zzfjg.zza);
        }
    }

    public final void zzh(zzccw zzccwVar) {
        this.zzc.set(zzccwVar);
    }

    public final void zzi(zzccs zzccsVar) {
        this.zzd.set(zzccsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.zzj(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzfht.zza(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfja
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzccs) obj).zzi(zzeVar);
            }
        });
        zzfht.zza(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjb
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzccs) obj).zzh(zzeVar.zza);
            }
        });
    }

    public final void zzk(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzh.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.zzm(zztVar);
        } else {
            zzfht.zza(this.zzh, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjc
                @Override // com.google.android.gms.internal.ads.zzfhs
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
                }
            });
        }
    }

    @Deprecated
    public final void zzn(zzccc zzcccVar) {
        this.zze.set(zzcccVar);
    }

    public final void zzo(zzfti zzftiVar) {
        this.zzi.set(zzftiVar);
    }

    public final void zzp(zzccx zzccxVar) {
        this.zzf.set(zzccxVar);
    }

    @Deprecated
    public final void zzq(zzcbx zzcbxVar) {
        this.zzg.set(zzcbxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfib
    public final void zzv(zzfib zzfibVar) {
        this.zzj = (zzfjr) zzfibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.zzdK();
        } else {
            zzfht.zza(this.zze, zzfjl.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.zze();
        } else {
            zzfht.zza(this.zze, zzfjm.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.zzf();
        } else {
            zzfht.zza(this.zze, zzfjn.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.zzg();
        } else {
            zzfht.zza(this.zzc, zzfji.zza);
            zzfht.zza(this.zze, zzfjo.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.zzdt();
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzfht.zza(atomicReference, zzfjh.zza);
        zzfht.zza(this.zze, zzfjj.zza);
        zzfht.zza(atomicReference, zzfje.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(final zzcbw zzcbwVar, final String str, final String str2) {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.zzd(zzcbwVar, str, str2);
            return;
        }
        zzfht.zza(this.zzd, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfiw
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzcbw zzcbwVar2 = zzcbwVar;
                ((zzccs) obj).zzg(new zzcdg(zzcbwVar2.zzb(), zzcbwVar2.zzc()));
            }
        });
        zzfht.zza(this.zzf, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfix
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzcbw zzcbwVar2 = zzcbwVar;
                ((zzccx) obj).zze(new zzcdg(zzcbwVar2.zzb(), zzcbwVar2.zzc()), str, str2);
            }
        });
        zzfht.zza(this.zze, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfiy
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzccc) obj).zzi(zzcbwVar);
            }
        });
        zzfht.zza(this.zzg, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfiz
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcbx) obj).zze(zzcbwVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfjr zzfjrVar = this.zzj;
        if (zzfjrVar != null) {
            zzfjrVar.zzdJ(zzeVar);
            return;
        }
        final int i = zzeVar.zza;
        AtomicReference atomicReference = this.zzc;
        zzfht.zza(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfjd
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzccw) obj).zzg(zzeVar);
            }
        });
        zzfht.zza(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfiu
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzccw) obj).zzf(i);
            }
        });
        zzfht.zza(this.zze, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzfiv
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzccc) obj).zzk(i);
            }
        });
    }
}
