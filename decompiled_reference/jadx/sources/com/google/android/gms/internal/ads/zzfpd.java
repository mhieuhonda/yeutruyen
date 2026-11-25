package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfpd {
    public static final zzfpj zza(ListenableFuture listenableFuture, Object obj, zzfpk zzfpkVar) {
        return new zzfpj(zzfpkVar, obj, null, zzfpk.zza, Collections.emptyList(), listenableFuture, null);
    }

    public static final zzfpj zzb(Callable callable, Object obj, zzfpk zzfpkVar) {
        return zzc(callable, zzfpkVar.zze(), obj, zzfpkVar);
    }

    public static final zzfpj zzc(Callable callable, zzhcp zzhcpVar, Object obj, zzfpk zzfpkVar) {
        return new zzfpj(zzfpkVar, obj, null, zzfpk.zza, Collections.emptyList(), zzhcpVar.submit(callable), null);
    }

    public static final zzfpj zzd(final zzfoy zzfoyVar, zzhcp zzhcpVar, Object obj, zzfpk zzfpkVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfpc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                zzfoyVar.zza();
                return null;
            }
        }, zzhcpVar, obj, zzfpkVar);
    }
}
