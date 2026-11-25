package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzmb {
    private long zza;
    private float zzb;
    private long zzc;

    public zzmb() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    /* synthetic */ zzmb(zzmc zzmcVar, byte[] bArr) {
        this.zza = zzmcVar.zza;
        this.zzb = zzmcVar.zzb;
        this.zzc = zzmcVar.zzc;
    }

    public final zzmb zza(long j) {
        this.zza = j;
        return this;
    }

    public final zzmb zzb(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        zzgtr.zza(z);
        this.zzb = f;
        return this;
    }

    public final zzmb zzc(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        zzgtr.zza(z);
        this.zzc = j;
        return this;
    }

    public final zzmc zzd() {
        return new zzmc(this, null);
    }

    final /* synthetic */ long zze() {
        return this.zza;
    }

    final /* synthetic */ float zzf() {
        return this.zzb;
    }

    final /* synthetic */ long zzg() {
        return this.zzc;
    }
}
