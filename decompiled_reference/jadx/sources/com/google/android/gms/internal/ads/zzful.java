package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzful {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfmc zzd;
    protected AtomicReference zze;
    protected final zzfsx zzf;
    protected AtomicBoolean zzg;
    protected com.google.android.gms.ads.internal.client.zzce zzh;
    protected final ScheduledExecutorService zzi;
    private com.google.android.gms.ads.internal.client.zzcb zzj;
    private final Queue zzk;
    private final zzftg zzl;
    private final String zzm;
    private AtomicBoolean zzn;
    private final zzfow zzo;
    private AtomicBoolean zzp;
    private zzftn zzq;
    private final Clock zzr;
    private final zzftu zzs;

    public zzful(ClientApi clientApi, Context context, int i, zzfmc zzfmcVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, Clock clock) {
        this("none", clientApi, context, i, zzfmcVar, zzfpVar, scheduledExecutorService, zzfowVar, zzftgVar, clock, null);
        this.zzj = zzcbVar;
    }

    private final void zzR(boolean z) {
        zzfsx zzfsxVar = this.zzf;
        if (zzfsxVar != null) {
            if (z) {
                this.zzl.zzc();
            }
            zzfsxVar.zza(this);
        } else {
            zzftg zzftgVar = this.zzl;
            if (zzftgVar.zze()) {
                return;
            }
            if (z) {
                zzftgVar.zzc();
            }
            this.zzi.schedule(new zzftz(this), zzftgVar.zzb(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzF() {
        boolean z;
        int i;
        int i2;
        Queue queue = this.zzk;
        synchronized (queue) {
            Iterator it = queue.iterator();
            z = false;
            i = 0;
            while (it.hasNext()) {
                if (((zzftw) it.next()).zzb()) {
                    it.remove();
                    i++;
                }
            }
            if (i > 0 && queue.isEmpty()) {
                z = true;
            }
            i2 = (i <= 0 || !queue.isEmpty()) ? i : i - 1;
        }
        zzfsx zzfsxVar = this.zzf;
        if (zzfsxVar != null && i > 0) {
            zzfsxVar.zzd(this, i2);
        }
        if (z) {
            zzT();
        }
    }

    private final void zzT() {
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfud(this));
        }
        this.zzi.execute(new zzfue(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final String zzM() {
        return true != "none".equals(this.zzm) ? ExifInterface.GPS_MEASUREMENT_2D : "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzV(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        if (zzdxVar instanceof zzdcs) {
            return ((zzdcs) zzdxVar).zzk();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    protected final void zzA(final int i) {
        int size;
        zzfsx zzfsxVar;
        boolean z = true;
        int size2 = 0;
        Preconditions.checkArgument(i > 0);
        com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) this.zze.getAndUpdate(new UnaryOperator() { // from class: com.google.android.gms.internal.ads.zzfug
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return ((com.google.android.gms.ads.internal.client.zzfp) obj).zza(i);
            }
        });
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        int i2 = zzfpVar.zzd;
        Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
            if (queue.size() <= i) {
                z = false;
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzB)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                while (size2 < i) {
                    zzftw zzftwVar = (zzftw) queue.poll();
                    if (zzftwVar != null) {
                        arrayList.add(zzftwVar);
                    }
                    size2++;
                }
                queue.clear();
                queue.addAll(arrayList);
                size2 = arrayList.size();
            } else {
                z = false;
            }
        }
        if (z && size > size2 && (zzfsxVar = this.zzf) != null) {
            int i3 = size - size2;
            if (size2 == 0) {
                i3--;
            }
            zzfsxVar.zzd(this, i3);
        }
        zzftn zzftnVar = this.zzq;
        if (zzftnVar == null || adFormat == null) {
            return;
        }
        zzftnVar.zzc(i2, i, this.zzr.currentTimeMillis(), new zzftu(new zzftt(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, adFormat), null));
    }

    protected final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzG)).booleanValue()) {
            Bundle bundle = zzmVar.zzC;
            bundle.putInt("plcs", zzt());
            bundle.putInt("plbs", zzs());
            bundle.putString("plid", this.zzm);
        }
    }

    final long zzC() {
        long jZzb = zzb();
        if (jZzb >= 0) {
            return jZzb;
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzU)).longValue();
    }

    final /* synthetic */ void zzD(int i, zzftw zzftwVar, zzftw zzftwVar2, long j, int i2, int i3, boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzQ)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzP)).booleanValue() || i == 1) {
                this.zzl.zza();
            }
        }
        if (zzftwVar != null && zzftwVar2 != null) {
            AdFormat adFormat = AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb);
            String strZzV = zzV(zzc(zzftwVar.zza()));
            if (adFormat != null && strZzV != null && zzftwVar2.zzd() < zzftwVar.zzd()) {
                this.zzq.zzg(j, i2, i3, strZzV, this.zzs, zzM());
            }
        }
        zzfsx zzfsxVar = this.zzf;
        if (zzfsxVar != null) {
            zzfsxVar.zzb(this);
        } else {
            long jZzC = zzC();
            if (jZzC > 0) {
                this.zzi.schedule(new zzftz(this), jZzC, TimeUnit.MILLISECONDS);
            } else {
                zzy();
            }
        }
        if (z) {
            zzT();
        }
    }

    final /* synthetic */ void zzG(Object obj) {
        Object obj2;
        if (obj != null) {
            this.zzl.zza();
            com.google.android.gms.ads.internal.client.zzdx zzdxVarZzc = zzc(obj);
            double dZzl = !(zzdxVarZzc instanceof zzdcs) ? 0.0d : ((zzdcs) zzdxVarZzc).zzl();
            com.google.android.gms.ads.internal.client.zzdx zzdxVarZzc2 = zzc(obj);
            obj2 = obj;
            zzftw zzftwVar = new zzftw(obj2, this.zzr, dZzl, zzdxVarZzc2 instanceof zzdcs ? ((zzdcs) zzdxVarZzc2).zzm() : 2);
            Queue queue = this.zzk;
            synchronized (queue) {
                queue.add(zzftwVar);
            }
            com.google.android.gms.ads.internal.client.zzdx zzdxVarZzc3 = zzc(obj2);
            long jCurrentTimeMillis = this.zzr.currentTimeMillis();
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfua(this, zzdxVarZzc3));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzi;
            scheduledExecutorService.execute(new zzfub(this, jCurrentTimeMillis, zzdxVarZzc3));
            if (this.zzf != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzI)).booleanValue()) {
                    this.zzo.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzF();
                        }
                    }, zzftwVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfui
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzE();
                        }
                    }, zzftwVar.zzc(), TimeUnit.MILLISECONDS);
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzI)).booleanValue()) {
                    this.zzo.zzb(new zzftz(this), zzftwVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new zzftz(this), zzftwVar.zzc(), TimeUnit.MILLISECONDS);
                }
            }
        } else {
            obj2 = obj;
        }
        this.zzn.set(false);
        if (obj2 == null || this.zzf == null) {
            zzR(obj2 == null);
        }
    }

    final /* synthetic */ void zzH(Throwable th) {
        this.zzn.set(false);
        if ((th instanceof zzfsy) && ((zzfsy) th).zza() == 0) {
            throw null;
        }
        zzR(true);
    }

    final /* synthetic */ void zzI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfuc(this, zzeVar));
        }
        this.zzn.set(false);
        int i = zzeVar.zza;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            zzR(true);
            return;
        }
        int i2 = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb;
        String str = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26 + String.valueOf(str).length() + 61);
        sb.append("Preloading ");
        sb.append(i2);
        sb.append(", for adUnitId:");
        sb.append(str);
        sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String string = sb.toString();
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
        this.zzg.set(false);
        zzfsx zzfsxVar = this.zzf;
        if (zzfsxVar != null) {
            zzfsxVar.zza(this);
        }
        zzftt zzfttVar = new zzftt(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzq());
        zzfttVar.zza(this.zzm);
        this.zzq.zzk(this.zzr.currentTimeMillis(), new zzftu(zzfttVar, null), zzeVar, zzs(), zzt(), zzM());
    }

    final /* synthetic */ void zzJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzg(this.zzm, zzeVar);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    final /* synthetic */ void zzK(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zze((com.google.android.gms.ads.internal.client.zzfp) this.zze.get());
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zze(this.zzm, zzdxVar);
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
            }
        }
    }

    final /* synthetic */ void zzL() {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zzf((com.google.android.gms.ads.internal.client.zzfp) this.zze.get());
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzf(this.zzm);
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
    }

    final /* synthetic */ zzftn zzN() {
        return this.zzq;
    }

    final /* synthetic */ Clock zzO() {
        return this.zzr;
    }

    final /* synthetic */ zzftu zzP() {
        return this.zzs;
    }

    protected abstract ListenableFuture zza(Context context);

    protected long zzb() {
        throw null;
    }

    protected abstract com.google.android.gms.ads.internal.client.zzdx zzc(Object obj);

    public final zzful zzd() {
        this.zzi.submit(new zzftz(this));
        return this;
    }

    public final void zze() {
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd) {
                this.zzn.set(false);
            } else {
                this.zzi.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzz();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        boolean zIsEmpty;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzO)).booleanValue()) {
            this.zzl.zza();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzH)).booleanValue() && this.zzf == null) {
            zzy();
        } else {
            zzF();
        }
        Queue queue = this.zzk;
        synchronized (queue) {
            zIsEmpty = queue.isEmpty();
        }
        return !zIsEmpty;
    }

    public final Object zzg() {
        final zzftw zzftwVar;
        final boolean z;
        final zzftw zzftwVar2;
        Queue queue = this.zzk;
        final int iZzt = zzt();
        synchronized (queue) {
            zzftwVar = (zzftw) queue.poll();
            boolean z2 = false;
            if (zzftwVar != null && queue.isEmpty()) {
                z2 = true;
            }
            z = z2;
            zzftwVar2 = (zzftwVar == null || queue.isEmpty()) ? null : (zzftw) queue.peek();
        }
        final long jCurrentTimeMillis = this.zzr.currentTimeMillis();
        final int iZzs = zzs();
        final int iZzt2 = zzt();
        this.zzi.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzD(iZzt, zzftwVar, zzftwVar2, jCurrentTimeMillis, iZzs, iZzt2, z);
            }
        });
        if (zzftwVar == null) {
            return null;
        }
        return zzftwVar.zza();
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    public final void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        zzfsx zzfsxVar = this.zzf;
        if (zzfsxVar == null) {
            this.zzi.submit(new zzftz(this));
        } else {
            zzfsxVar.zzd(this, 0);
        }
    }

    public final boolean zzk(com.google.android.gms.ads.internal.client.zzfp zzfpVar) {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).equals(zzfpVar);
    }

    public final String zzl() {
        zzftw zzftwVar;
        Queue queue = this.zzk;
        synchronized (queue) {
            zzftwVar = (zzftw) queue.peek();
        }
        Object objZza = zzftwVar == null ? null : zzftwVar.zza();
        return zzV(objZza != null ? zzc(objZza) : null);
    }

    public final void zzm(zzftn zzftnVar) {
        this.zzq = zzftnVar;
    }

    public final void zzn(int i) {
        Preconditions.checkArgument(i >= 5);
        this.zzl.zzf(i);
    }

    protected final com.google.android.gms.ads.internal.client.zzfp zzo() {
        return (com.google.android.gms.ads.internal.client.zzfp) this.zze.get();
    }

    protected final String zzp() {
        return this.zzm;
    }

    protected final AdFormat zzq() {
        return AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb);
    }

    protected final String zzr() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
    }

    protected final int zzs() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd;
    }

    protected final int zzt() {
        int size;
        Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    protected final boolean zzu() {
        if (!this.zzg.get() || this.zzn.get() || zzt() >= zzs()) {
            return false;
        }
        zzftg zzftgVar = this.zzl;
        return (zzftgVar.zzd() || zzftgVar.zze()) ? false : true;
    }

    protected final void zzv() {
        Queue queue = this.zzk;
        synchronized (queue) {
            queue.clear();
        }
    }

    protected final boolean zzw() {
        return this.zzn.get();
    }

    protected final int zzx() {
        int iZzt = zzt();
        int i = iZzt - 1;
        if (!this.zzn.get()) {
            iZzt = i;
        }
        return Math.max(iZzt, 0);
    }

    protected final void zzy() {
        zzF();
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd) {
                this.zzn.set(false);
            } else {
                zzz();
            }
        }
    }

    protected final void zzz() {
        ListenableFuture listenableFutureZza;
        Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (activityZzd == null) {
            String str = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
            String.valueOf(str);
            String strValueOf = String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(strValueOf));
            listenableFutureZza = zza(this.zzb);
        } else {
            listenableFutureZza = zza(activityZzd);
        }
        zzhcf.zzr(listenableFutureZza, new zzftx(this), this.zzi);
    }

    public zzful(String str, ClientApi clientApi, Context context, int i, zzfmc zzfmcVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, Clock clock, zzfsx zzfsxVar) {
        this(str, clientApi, context, i, zzfmcVar, zzfpVar, scheduledExecutorService, zzfowVar, zzftgVar, clock, zzfsxVar);
        this.zzh = zzceVar;
    }

    private zzful(String str, ClientApi clientApi, Context context, int i, zzfmc zzfmcVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, Clock clock, zzfsx zzfsxVar) {
        Queue priorityQueue;
        this.zzm = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzfmcVar;
        this.zze = new AtomicReference(zzfpVar);
        int iMax = Math.max(1, zzfpVar.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzag)).booleanValue()) {
            priorityQueue = new zzfuo();
        } else {
            priorityQueue = new PriorityQueue(iMax, zzfuh.zza);
        }
        this.zzk = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzn = new AtomicBoolean(false);
        this.zzi = scheduledExecutorService;
        this.zzo = zzfowVar;
        this.zzl = zzftgVar;
        this.zzp = new AtomicBoolean(true);
        this.zzr = clock;
        zzftt zzfttVar = new zzftt(zzfpVar.zza, AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb));
        zzfttVar.zza(str);
        this.zzs = new zzftu(zzfttVar, null);
        this.zzf = zzfsxVar;
    }
}
