package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzeuw implements zzhbn {
    static final /* synthetic */ zzeuw zza = new zzeuw();

    private /* synthetic */ zzeuw() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzhcf.zza(new zzeuz(Integer.toString(17))) : zzhcf.zza(new zzeuz(null));
    }
}
