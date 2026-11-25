package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzexg implements zzfcs {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(false);
    private final Clock zzc;
    private final Executor zzd;
    private final zzfcs zze;
    private final long zzf;
    private final zzdzt zzg;

    public zzexg(zzfcs zzfcsVar, long j, Clock clock, Executor executor, zzdzt zzdztVar) {
        this.zzc = clock;
        this.zze = zzfcsVar;
        this.zzf = j;
        this.zzd = executor;
        this.zzg = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzexd zzexdVar;
        zzexd zzexdVar2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznw)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznv)).booleanValue() && !((Boolean) this.zzb.getAndSet(true)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcfy.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzexf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzc();
                    }
                };
                long j = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                AtomicReference atomicReference = this.zza;
                zzexdVar = (zzexd) atomicReference.get();
                if (zzexdVar == null) {
                    zzexd zzexdVar3 = new zzexd(this.zze.zza(), this.zzf, this.zzc);
                    atomicReference.set(zzexdVar3);
                    return zzexdVar3.zza;
                }
                if (!((Boolean) this.zzb.get()).booleanValue() && zzexdVar.zza()) {
                    ListenableFuture listenableFuture = zzexdVar.zza;
                    zzfcs zzfcsVar = this.zze;
                    zzexdVar2 = new zzexd(zzfcsVar.zza(), this.zzf, this.zzc);
                    this.zza.set(zzexdVar2);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznx)).booleanValue()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzny)).booleanValue()) {
                            zzdzs zzdzsVarZza = this.zzg.zza();
                            zzdzsVarZza.zzc("action", "scs");
                            zzdzsVarZza.zzc("sid", String.valueOf(zzfcsVar.zzb()));
                            zzdzsVarZza.zzd();
                        }
                        return listenableFuture;
                    }
                    zzexdVar = zzexdVar2;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzexdVar = (zzexd) atomicReference2.get();
            if (zzexdVar == null || zzexdVar.zza()) {
                zzfcs zzfcsVar2 = this.zze;
                zzexdVar2 = new zzexd(zzfcsVar2.zza(), this.zzf, this.zzc);
                atomicReference2.set(zzexdVar2);
                zzexdVar = zzexdVar2;
            }
        }
        return zzexdVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return this.zze.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }

    final /* synthetic */ void zzd() {
        this.zza.set(new zzexd(this.zze.zza(), this.zzf, this.zzc));
    }
}
