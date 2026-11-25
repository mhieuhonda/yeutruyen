package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgpw extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzgpy zza;

    zzgpw(zzgpy zzgpyVar) {
        Objects.requireNonNull(zzgpyVar);
        this.zza = zzgpyVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zzgpy zzgpyVar = this.zza;
        synchronized (zzgpyVar) {
            zzgpyVar.zzf(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzgpy zzgpyVar = this.zza;
        synchronized (zzgpyVar) {
            zzgpyVar.zzf(null);
        }
    }
}
