package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfpb {
    final /* synthetic */ zzfpk zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfpb(zzfpk zzfpkVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfpkVar);
        this.zza = zzfpkVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfpj zza(Callable callable) {
        List list = this.zzc;
        zzhce zzhceVarZzp = zzhcf.zzp(list);
        ListenableFuture listenableFutureZza = zzhceVarZzp.zza(zzfpa.zza, zzcfy.zzh);
        zzfpk zzfpkVar = this.zza;
        return new zzfpj(zzfpkVar, this.zzb, null, listenableFutureZza, list, zzhceVarZzp.zza(callable, zzfpkVar.zze()), null);
    }
}
