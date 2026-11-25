package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzetk implements AppEventListener, zzdgf, zzden, zzddc, zzddt, com.google.android.gms.ads.internal.client.zza, zzdcz, zzdfq, zzddp, zzdlg {
    final zzdzt zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    private final AtomicReference zzk = new AtomicReference();
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzks)).intValue());

    public zzetk(zzdzt zzdztVar) {
        this.zza = zzdztVar;
    }

    private final void zzs() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (final Pair pair : blockingQueue) {
                zzfht.zza(this.zzd, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesu
                    @Override // com.google.android.gms.internal.ads.zzfhs
                    public final /* synthetic */ void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcl) obj).zzb((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzms)).booleanValue()) {
            return;
        }
        zzfht.zza(this.zzc, zzesz.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzfht.zza(this.zzd, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzess
                @Override // com.google.android.gms.internal.ads.zzfhs
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzcl) obj).zzb(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("The queue for app events is full, dropping the new event.");
            zzdzt zzdztVar = this.zza;
            if (zzdztVar != null) {
                zzdzs zzdzsVarZza = zzdztVar.zza();
                zzdzsVarZza.zzc("action", "dae_action");
                zzdzsVarZza.zzc("dae_name", str);
                zzdzsVarZza.zzc("dae_data", str2);
                zzdzsVarZza.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(zzcbw zzcbwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfhs zzfhsVar = new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesv
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd(zzeVar);
            }
        };
        AtomicReference atomicReference = this.zzc;
        zzfht.zza(atomicReference, zzfhsVar);
        zzfht.zza(atomicReference, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesp
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzc(zzeVar.zza);
            }
        });
        zzfht.zza(this.zzf, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesq
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc(zzeVar);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
        zzfht.zza(this.zzc, zzesw.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdR() {
        zzfht.zza(this.zzc, zzeta.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        zzfht.zza(this.zzc, zzetc.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
        zzfht.zza(this.zzc, zzetd.zza);
        zzfht.zza(this.zzg, zzeti.zza);
        zzfht.zza(this.zzk, zzetj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
        zzfht.zza(this.zzc, zzesy.zza);
        AtomicReference atomicReference = this.zzg;
        zzfht.zza(atomicReference, zzetf.zza);
        zzfht.zza(atomicReference, zzetg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzms)).booleanValue()) {
            zzfht.zza(this.zzc, zzetb.zza);
        }
        zzfht.zza(this.zzg, zzeth.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final synchronized void zzg() {
        zzfht.zza(this.zzc, zzesx.zza);
        zzfht.zza(this.zzf, zzete.zza);
        this.zzj.set(true);
        zzs();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh zzi() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfht.zza(this.zzg, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzest
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).zzb(zzeVar);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcl zzk() {
        return (com.google.android.gms.ads.internal.client.zzcl) this.zzd.get();
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzc.set(zzbhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfht.zza(this.zze, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzesr
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
            }
        });
    }

    public final void zzn(zzfti zzftiVar) {
        this.zzk.set(zzftiVar);
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzd.set(zzclVar);
        this.zzi.set(true);
        zzs();
    }

    public final void zzp(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zze.set(zzdqVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.set(zzbkVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzg.set(zzcsVar);
    }
}
