package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdfz implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdga zzdgaVar = (zzdga) this.zza.get();
        if (zzdgaVar != null) {
            zzdgaVar.zzs(zzdfw.zza);
        }
    }
}
