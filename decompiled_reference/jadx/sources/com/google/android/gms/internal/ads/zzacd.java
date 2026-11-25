package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzacd implements Runnable {
    private final zzacc zza;

    public zzacd(zzacc zzaccVar) {
        this.zza = zzaccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
