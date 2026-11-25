package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgon implements zzgnh {
    private final zzglk zza;
    private final ExecutorService zzb;
    private final zzgqo zzc;

    zzgon(zzglk zzglkVar, ExecutorService executorService, zzgqo zzgqoVar) {
        this.zza = zzglkVar;
        this.zzb = executorService;
        this.zzc = zzgqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zza() {
        return zzhcf.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzd = zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgom
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, listenableFutureZzd);
        return listenableFutureZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zzc(final zzggb zzggbVar, final byte[] bArr, final byte[] bArr2) {
        ListenableFuture listenableFutureZzd = zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgol
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzi(zzggbVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, listenableFutureZzd);
        return listenableFutureZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zzd(final zzggb zzggbVar, final byte[] bArr) {
        ListenableFuture listenableFutureZzd = zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgok
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh(zzggbVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, listenableFutureZzd);
        return listenableFutureZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final ListenableFuture zze() {
        ListenableFuture listenableFutureZzd = zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgoj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, listenableFutureZzd);
        return listenableFutureZzd;
    }

    final /* synthetic */ zzggb zzf() {
        zzggb zzggbVarZzc = this.zza.zzc(1);
        return zzggbVarZzc == null ? zzggb.zzh() : zzggbVarZzc;
    }

    final /* synthetic */ zzfyz zzg() {
        return this.zza.zzb(1);
    }

    final /* synthetic */ Void zzh(zzggb zzggbVar, byte[] bArr) {
        this.zza.zza(zzggbVar, null, bArr);
        return null;
    }

    final /* synthetic */ Void zzi(zzggb zzggbVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzggbVar, bArr, bArr2);
        return null;
    }
}
