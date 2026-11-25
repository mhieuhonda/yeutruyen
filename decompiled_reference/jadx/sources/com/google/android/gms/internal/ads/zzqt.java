package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqt {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzqt zza(boolean z) {
        this.zza = z;
        return this;
    }

    public final zzqt zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzqt zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzqu zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqu(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    final /* synthetic */ boolean zze() {
        return this.zza;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
