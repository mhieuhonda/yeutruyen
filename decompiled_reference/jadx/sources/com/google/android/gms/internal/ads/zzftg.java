package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Random;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzftg {
    private final long zza;
    private final long zzb;
    private final Clock zzf;
    private final zzftn zzg;
    private long zzh;
    private long zzd = 5;
    private long zze = 0;
    private final Random zzi = new Random();
    private long zzc = 0;

    public zzftg(long j, double d, long j2, double d2, Clock clock, zzftn zzftnVar) {
        this.zza = j;
        this.zzb = j2;
        this.zzg = zzftnVar;
        this.zzf = clock;
        zza();
    }

    public final synchronized void zza() {
        this.zzh = this.zza;
        this.zzc = 0L;
        this.zze = 0L;
    }

    public final synchronized long zzb() {
        long j;
        long j2;
        double d = this.zzh;
        double d2 = 0.2d * d;
        j = (long) (d + d2);
        j2 = (long) (d - d2);
        return j2 + ((long) (this.zzi.nextDouble() * ((j - j2) + 1)));
    }

    public final synchronized void zzc() {
        long jZzb = zzb();
        Clock clock = this.zzf;
        this.zze = clock.currentTimeMillis() + jZzb;
        double d = this.zzh;
        long j = this.zzb;
        this.zzh = Math.min((long) (d + d), j);
        this.zzc++;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzM)).booleanValue()) {
            this.zzg.zzt(clock.currentTimeMillis(), this.zzc, this.zzh, this.zzd, j);
        }
    }

    public final synchronized boolean zzd() {
        return this.zzf.currentTimeMillis() < this.zze;
    }

    public final synchronized boolean zze() {
        zzbio zzbioVar = zzbix.zzN;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).intValue() < 0) {
            return false;
        }
        return this.zzc > Math.max(this.zzd, (long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).intValue()) && this.zzh >= this.zzb;
    }

    public final synchronized void zzf(int i) {
        Preconditions.checkArgument(i > 0);
        this.zzd = i;
    }
}
