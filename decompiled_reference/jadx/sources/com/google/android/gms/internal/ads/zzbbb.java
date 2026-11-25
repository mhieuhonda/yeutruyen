package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbbb extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbbc zza;

    zzbbb(zzbbc zzbbcVar) {
        Objects.requireNonNull(zzbbcVar);
        this.zza = zzbbcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzbbc.class) {
            this.zza.zzd(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzbbc.class) {
            this.zza.zzd(null);
        }
    }
}
