package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfnr {
    private final zzfmv zza;
    private final zzfno zzb;
    private final zzfmr zzc;
    private zzfnx zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfnr(zzfmv zzfmvVar, zzfmr zzfmrVar, zzfno zzfnoVar) {
        this.zza = zzfmvVar;
        this.zzc = zzfmrVar;
        this.zzb = zzfnoVar;
        zzfmrVar.zza(new zzfmq() { // from class: com.google.android.gms.internal.ads.zzfnq
            @Override // com.google.android.gms.internal.ads.zzfmq
            public final /* synthetic */ void zza() {
                this.zza.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzd() {
        zzfnp zzfnpVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhq)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (!arrayDeque.isEmpty()) {
                    zzfnpVar = (zzfnp) arrayDeque.pollFirst();
                    if (zzfnpVar == null || (zzfnpVar.zzb() != null && this.zza.zzc(zzfnpVar.zzb()))) {
                        break;
                    }
                }
            }
            zzfnx zzfnxVar = new zzfnx(this.zza, this.zzb, zzfnpVar);
            this.zze = zzfnxVar;
            zzfnxVar.zza(new zzfnm(this, zzfnpVar));
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzfnp zzfnpVar) {
        this.zzd.add(zzfnpVar);
    }

    public final synchronized ListenableFuture zzb(zzfnp zzfnpVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfnpVar);
    }

    final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(zzfnx zzfnxVar) {
        this.zze = null;
    }

    final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
