package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefc implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;

    private zzefc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
    }

    public static zzefc zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        return new zzefc(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0058  */
    /* JADX WARN: Code duplicated, block: B:8:0x0076  */
    /* JADX WARN: Code duplicated, block: B:9:0x0080  */
    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        ListenableFuture listenableFutureSubmit;
        final zzbaw zzbawVar = (zzbaw) this.zza.zzb();
        final Context contextZza = ((zzcnz) this.zzb).zza();
        zzflg zzflgVarZza = ((zzdcq) this.zzc).zza();
        long jLongValue = ((Long) this.zzd.zzb()).longValue();
        zzhcp zzhcpVarZzc = zzfoi.zzc();
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdF)).intValue();
        if (iIntValue != -1) {
            if (Integer.toString(iIntValue).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzflgVarZza.zzd)))) {
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jLongValue < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdH)).intValue()) {
                    listenableFutureSubmit = zzhcpVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeex
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return zzbawVar.zzb().zzk(contextZza);
                        }
                    });
                } else {
                    listenableFutureSubmit = zzhcpVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeew
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return zzbawVar.zzb().zzl(contextZza);
                        }
                    });
                }
            } else {
                listenableFutureSubmit = zzhcpVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeew
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzbawVar.zzb().zzl(contextZza);
                    }
                });
            }
        } else {
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jLongValue < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdH)).intValue()) {
                listenableFutureSubmit = zzhcpVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeex
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzbawVar.zzb().zzk(contextZza);
                    }
                });
            } else {
                listenableFutureSubmit = zzhcpVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeew
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzbawVar.zzb().zzl(contextZza);
                    }
                });
            }
        }
        zzinh.zzb(listenableFutureSubmit);
        return listenableFutureSubmit;
    }
}
