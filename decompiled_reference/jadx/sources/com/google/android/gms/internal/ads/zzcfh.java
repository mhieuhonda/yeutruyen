package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcfh extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzcfk zza;

    zzcfh(zzcfk zzcfkVar) {
        Objects.requireNonNull(zzcfkVar);
        this.zza = zzcfkVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzD().set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzD().set(false);
    }
}
