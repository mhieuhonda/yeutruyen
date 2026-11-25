package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbtv extends zzcgk {
    private final Object zza = new Object();
    private final zzbua zzb;
    private boolean zzc;

    public zzbtv(zzbua zzbuaVar) {
        this.zzb = zzbuaVar;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
            if (this.zzc) {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zze(new zzbts(this), new zzcgg());
            zze(new zzbtt(this), new zzbtu(this));
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
        }
    }

    final /* synthetic */ zzbua zzb() {
        return this.zzb;
    }
}
