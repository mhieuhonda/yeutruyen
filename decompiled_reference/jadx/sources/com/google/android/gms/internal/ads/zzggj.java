package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzggj {
    private final zzimt zza;
    private final zzimt zzb;
    private final zzimt zzc;
    private final ExecutorService zzd;
    private final zzgqo zze;
    private final int zzf;

    zzggj(zzimt zzimtVar, zzimt zzimtVar2, zzimt zzimtVar3, zzgdq zzgdqVar, ExecutorService executorService, zzgqo zzgqoVar) {
        this.zza = zzimtVar;
        this.zzb = zzimtVar2;
        this.zzc = zzimtVar3;
        this.zzd = executorService;
        this.zze = zzgqoVar;
        this.zzf = zzgdqVar.zzL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture zzd(final int i) {
        return (zzhbx) zzhcf.zzj(zzhbx.zzw(zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzggf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(i);
            }
        }, this.zzd)), zzggg.zza, zzhcw.zza());
    }

    final /* synthetic */ zzgqo zza() {
        return this.zze;
    }

    final ListenableFuture zzb(int i, boolean z) {
        ListenableFuture listenableFutureZzd = zzd(i);
        return (!z || i == this.zzf) ? listenableFutureZzd : (zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzg(zzhbx.zzw(listenableFutureZzd), Throwable.class, zzggi.zza, zzhcw.zza()), new zzgge(this), zzhcw.zza());
    }

    final /* synthetic */ int zze() {
        return this.zzf;
    }

    final /* synthetic */ zzggc zzc(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return (zzggc) this.zza.zzb();
        }
        if (i2 == 2) {
            return (zzggc) this.zzb.zzb();
        }
        if (i2 == 3) {
            return (zzggc) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }
}
