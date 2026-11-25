package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcxk implements zzbex {
    private final zzclb zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    zzcxk(zzclb zzclbVar, Executor executor) {
        this.zza = zzclbVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final synchronized void zzdj(zzbew zzbewVar) {
        final zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzon)).booleanValue()) {
                boolean z = zzbewVar.zzj;
                AtomicReference atomicReference = this.zzc;
                if (z) {
                    if (!Boolean.TRUE.equals(atomicReference.getAndSet(true))) {
                        Executor executor = this.zzb;
                        Objects.requireNonNull(zzclbVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxj
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclbVar.onResume();
                            }
                        });
                    }
                } else if (!Boolean.FALSE.equals(atomicReference.getAndSet(false))) {
                    Executor executor2 = this.zzb;
                    Objects.requireNonNull(zzclbVar);
                    executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzclbVar.onPause();
                        }
                    });
                }
            }
        }
    }
}
