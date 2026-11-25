package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgot implements zzgop {
    private final zzgfe zza;
    private final zzgfe zzb;
    private final zzimt zzc;
    private final zzgqo zzd;
    private final ExecutorService zze;

    zzgot(zzgfe zzgfeVar, zzgfe zzgfeVar2, zzimt zzimtVar, ExecutorService executorService, zzgqo zzgqoVar) {
        this.zza = zzgfeVar;
        this.zzb = zzgfeVar2;
        this.zzc = zzimtVar;
        this.zzd = zzgqoVar;
        this.zze = executorService;
    }

    private final ListenableFuture zzi(zzggb zzggbVar) {
        ListenableFuture listenableFutureZzc = this.zza.zzc(zzggbVar);
        this.zzd.zze(20303, listenableFutureZzc);
        return listenableFutureZzc;
    }

    private final ListenableFuture zzj(byte[] bArr) {
        ListenableFuture listenableFutureZzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zza() {
        return zzhcf.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        this.zzd.zze(20302, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zzc(final zzggb zzggbVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture listenableFutureZzc = ((zzgfe) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, listenableFutureZzc);
        return (zzhbx) zzhcf.zzj(zzhbx.zzw(zzhcf.zzl(listenableFutureZzc, zzj(bArr2))), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgor
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzggbVar, (List) obj);
            }
        }, zzhcw.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zzd(final zzggb zzggbVar, byte[] bArr) {
        return (zzhbx) zzhcf.zzj(zzhbx.zzw(zzj(bArr)), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgoq
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzg(zzggbVar, (Void) obj);
            }
        }, zzhcw.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgop
    public final ListenableFuture zze() {
        ListenableFuture listenableFutureZzb = this.zzb.zzb();
        this.zzd.zze(20304, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgop
    public final ListenableFuture zzf() {
        ListenableFuture listenableFutureZzd = zzhcf.zzd(zzgos.zza, this.zze);
        this.zzd.zze(20312, listenableFutureZzd);
        return listenableFutureZzd;
    }

    final /* synthetic */ ListenableFuture zzg(zzggb zzggbVar, Void r2) {
        return zzi(zzggbVar);
    }

    final /* synthetic */ ListenableFuture zzh(zzggb zzggbVar, List list) {
        return zzi(zzggbVar);
    }
}
