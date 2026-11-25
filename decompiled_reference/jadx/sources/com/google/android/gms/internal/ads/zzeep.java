package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzeep implements zzhbn {
    static final /* synthetic */ zzeep zza = new zzeep();

    private /* synthetic */ zzeep() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        ExecutionException executionException = (ExecutionException) obj;
        Throwable cause = executionException.getCause();
        ExecutionException cause2 = executionException;
        if (cause != null) {
            cause2 = executionException.getCause();
        }
        return zzhcf.zzc(cause2);
    }
}
