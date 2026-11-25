package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgnm implements zzgnh {
    private final zzgfe zza;
    private final zzgfe zzb;
    private final zzgfe zzc;
    private final zzgfe zzd;
    private final zzimt zze;
    private final zzimt zzf;
    private final File zzg;
    private final ExecutorService zzh;
    private final zzgqo zzi;

    zzgnm(zzgfe zzgfeVar, zzgfe zzgfeVar2, zzimt zzimtVar, zzgfe zzgfeVar3, zzgfe zzgfeVar4, zzimt zzimtVar2, File file, ExecutorService executorService, zzgqo zzgqoVar) {
        this.zza = zzgfeVar;
        this.zzc = zzgfeVar2;
        this.zze = zzimtVar;
        this.zzb = zzgfeVar3;
        this.zzd = zzgfeVar4;
        this.zzf = zzimtVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgqoVar;
    }

    private final ListenableFuture zzj(byte[] bArr) {
        ListenableFuture listenableFutureZzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, listenableFutureZzc);
        return listenableFutureZzc;
    }

    private final ListenableFuture zzk(zzggb zzggbVar) {
        ListenableFuture listenableFutureZzc = this.zzb.zzc(zzggbVar);
        this.zzi.zze(15303, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zza() {
        return zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgnl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new Boolean(this.zza.zzf());
            }
        }, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        this.zzi.zze(15302, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zzc(final zzggb zzggbVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture listenableFutureZzc = ((zzgfe) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, listenableFutureZzc);
        return (zzhbx) zzhcf.zzj(zzhbx.zzw(zzhcf.zzl(listenableFutureZzc, zzj(bArr2))), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgnk
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzi(zzggbVar, (List) obj);
            }
        }, zzhcw.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final ListenableFuture zzd(final zzggb zzggbVar, byte[] bArr) {
        return (zzhbx) zzhcf.zzj(zzhbx.zzw(zzj(bArr)), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgnj
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzggbVar, (Void) obj);
            }
        }, zzhcw.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final ListenableFuture zze() {
        zzhbx zzhbxVar = (zzhbx) zzhcf.zzk(zzhbx.zzw(this.zza.zzb()), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgni
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzg((zzggb) obj);
            }
        }, zzhcw.zza());
        this.zzi.zze(15314, zzhbxVar);
        return zzhbxVar;
    }

    final /* synthetic */ boolean zzf() {
        zzgfe zzgfeVar;
        try {
            zzgfe zzgfeVar2 = this.zzb;
            File fileZza = zzgfeVar2.zza();
            if (!fileZza.exists()) {
                zzgfeVar2.zza().delete();
                ((zzgfe) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
            File fileZza2 = ((zzgfe) this.zzf.zzb()).zza();
            File fileZza3 = ((zzgfe) this.zze.zzb()).zza();
            try {
                if (fileZza2.exists()) {
                    File parentFile = fileZza3.getParentFile();
                    if (parentFile != null) {
                        zzfzb.zze(parentFile);
                    }
                    zzhaa.zzb(fileZza3);
                    zzhaa.zzc(fileZza2, fileZza3);
                }
                File fileZza4 = this.zzd.zza();
                File fileZza5 = this.zzc.zza();
                try {
                    if (fileZza4.exists()) {
                        zzhaa.zzb(fileZza5);
                        zzhaa.zzc(fileZza4, fileZza5);
                    }
                    File fileZza6 = this.zza.zza();
                    try {
                        if (fileZza.exists()) {
                            zzhaa.zzb(fileZza6);
                            zzhaa.zzc(fileZza, fileZza6);
                        }
                        this.zzb.zza().delete();
                        ((zzgfe) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return true;
                    } catch (IOException | SecurityException e) {
                        this.zzi.zzd(15313, e);
                        zzgfeVar = this.zzb;
                        zzgfeVar.zza().delete();
                        ((zzgfe) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return false;
                    }
                } catch (IOException | SecurityException e2) {
                    this.zzi.zzd(15312, e2);
                    zzgfeVar = this.zzb;
                }
            } catch (IOException | SecurityException e3) {
                this.zzi.zzd(15311, e3);
                zzgfeVar = this.zzb;
            }
        } catch (Throwable th) {
            this.zzb.zza().delete();
            ((zzgfe) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    final /* synthetic */ zzfyz zzg(zzggb zzggbVar) {
        if (zzggbVar == null || zzggbVar.equals(zzggb.zzh())) {
            return null;
        }
        zzbei zzbeiVarZza = zzggbVar.zza();
        File fileZza = ((zzgfe) this.zze.zzb()).zza();
        zzgfe zzgfeVar = this.zzc;
        return new zzfyz(zzbeiVarZza, fileZza, zzgfeVar.zza(), this.zzg);
    }

    final /* synthetic */ ListenableFuture zzh(zzggb zzggbVar, Void r2) {
        return zzk(zzggbVar);
    }

    final /* synthetic */ ListenableFuture zzi(zzggb zzggbVar, List list) {
        return zzk(zzggbVar);
    }
}
