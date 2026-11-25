package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwz implements Runnable {
    zzfwz() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzfxc.zzc != null) {
            zzfxc.zzc.post(zzfxc.zzk);
            zzfxc.zzc.postDelayed(zzfxc.zzl, 200L);
        }
    }
}
