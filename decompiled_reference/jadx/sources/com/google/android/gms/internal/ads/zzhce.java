package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhce {
    private final boolean zza;
    private final zzgwt zzb;

    /* synthetic */ zzhce(boolean z, zzgwt zzgwtVar, byte[] bArr) {
        this.zza = z;
        this.zzb = zzgwtVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzhbt(this.zzb, this.zza, executor, callable);
    }
}
