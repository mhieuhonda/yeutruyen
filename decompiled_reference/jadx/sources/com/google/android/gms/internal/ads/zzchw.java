package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzchw implements Runnable {
    private final zzchi zza;
    private boolean zzb = false;

    zzchw(zzchi zzchiVar) {
        this.zza = zzchiVar;
    }

    private final void zzc() {
        zzgax zzgaxVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzgaxVar.removeCallbacks(this);
        zzgaxVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzF();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzF();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
