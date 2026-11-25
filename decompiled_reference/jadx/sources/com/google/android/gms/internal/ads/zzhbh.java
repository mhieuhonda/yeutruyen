package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzhbh extends zzhbl {
    private static final zzhcn zza = new zzhcn(zzhbh.class);
    private zzgwp zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzhbh(zzgwp zzgwpVar, boolean z, boolean z2) {
        super(zzgwpVar.size());
        zzgwpVar.getClass();
        this.zzb = zzgwpVar;
        this.zzc = z;
        this.zzd = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, listenableFuture);
            }
        } finally {
            zzz(null);
        }
    }

    private static void zzF(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void zzG(int i, ListenableFuture listenableFuture) {
        try {
            zzw(i, zzhdg.zza(listenableFuture));
        } catch (ExecutionException e) {
            zzE(e.getCause());
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgwp zzgwpVar) {
        int iZzC = zzC();
        int i = 0;
        zzgtr.zzj(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgwpVar != null) {
                zzgzh it = zzgwpVar.iterator();
                while (it.hasNext()) {
                    ListenableFuture listenableFuture = (ListenableFuture) it.next();
                    if (!listenableFuture.isCancelled()) {
                        zzG(i, listenableFuture);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    void zzA(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    protected final void zzc() {
        zzgwp zzgwpVar = this.zzb;
        zzA(1);
        if ((zzgwpVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgzh it = zzgwpVar.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    protected final String zzd() {
        zzgwp zzgwpVar = this.zzb;
        return zzgwpVar != null ? "futures=".concat(zzgwpVar.toString()) : super.zzd();
    }

    final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        boolean z = this.zzc;
        zzgwp zzgwpVar = this.zzb;
        if (!z) {
            final zzgwp zzgwpVar2 = true != this.zzd ? null : zzgwpVar;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzhbf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzz(zzgwpVar2);
                }
            };
            zzgzh it = zzgwpVar.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    zzz(zzgwpVar2);
                } else {
                    listenableFuture.addListener(runnable, zzhbu.INSTANCE);
                }
            }
            return;
        }
        zzgzh it2 = zzgwpVar.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                zzy(i, listenableFuture2);
            } else {
                listenableFuture2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhbg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzy(i, listenableFuture2);
                    }
                }, zzhbu.INSTANCE);
            }
            i = i2;
        }
    }

    abstract void zzw(int i, Object obj);

    abstract void zzx();

    @Override // com.google.android.gms.internal.ads.zzhbl
    final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        zzI(set, (Throwable) Objects.requireNonNull(zzl()));
    }

    private final void zzE(Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof Error) {
            zzF(th);
        }
    }
}
