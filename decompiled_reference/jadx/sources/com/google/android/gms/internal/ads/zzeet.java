package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeet {
    private final zzhcp zza;
    private final zzhcp zzb;
    private final zzegd zzc;
    private final zzimt zzd;

    public zzeet(zzhcp zzhcpVar, zzhcp zzhcpVar2, zzegd zzegdVar, zzimt zzimtVar) {
        this.zza = zzhcpVar;
        this.zzb = zzhcpVar2;
        this.zzc = zzegdVar;
        this.zzd = zzimtVar;
    }

    public final ListenableFuture zza(final zzcbk zzcbkVar) {
        ListenableFuture listenableFutureZzh;
        String str = zzcbkVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            listenableFutureZzh = zzhcf.zzc(new zzegz(1));
        } else {
            listenableFutureZzh = zzhcf.zzh(this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzees
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(zzcbkVar);
                }
            }), ExecutionException.class, zzeep.zza, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzhcf.zzh(listenableFutureZzh, zzegz.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeeq
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzcbkVar, callingUid, (zzegz) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzeha zzb(zzcbk zzcbkVar) {
        return (zzeha) this.zzc.zza(zzcbkVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgJ)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ ListenableFuture zzc(final zzcbk zzcbkVar, int i, zzegz zzegzVar) {
        Bundle bundle;
        if (zzcbkVar != null && (bundle = zzcbkVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzhcf.zzj(((zzeiq) this.zzd.zzb()).zzb(zzcbkVar, i), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeer
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhcf.zza(new zzeha((InputStream) obj, zzcbkVar));
            }
        }, this.zzb);
    }
}
