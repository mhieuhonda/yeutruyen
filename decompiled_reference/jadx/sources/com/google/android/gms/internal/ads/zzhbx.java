package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzhbx extends zzhcg {
    zzhbx() {
    }

    public static zzhbx zzw(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzhbx ? (zzhbx) listenableFuture : new zzhby(listenableFuture);
    }
}
