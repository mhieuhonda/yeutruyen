package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzasb implements zzahd {
    private final zzary zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzasb(zzary zzaryVar, int i, long j, long j2) {
        this.zza = zzaryVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / ((long) zzaryVar.zzd);
        this.zzd = j3;
        this.zze = zze(j3);
    }

    private final long zze(long j) {
        return zzfm.zzw(j * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        long j2 = this.zzb;
        zzary zzaryVar = this.zza;
        long j3 = (((long) zzaryVar.zzc) * j) / (j2 * 1000000);
        String str = zzfm.zza;
        long j4 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j3, j4));
        long j5 = zzaryVar.zzd;
        long jZze = zze(jMax);
        long j6 = this.zzc;
        zzahe zzaheVar = new zzahe(jZze, (jMax * j5) + j6);
        if (jZze >= j || jMax == j4) {
            return new zzahb(zzaheVar, zzaheVar);
        }
        long j7 = jMax + 1;
        return new zzahb(zzaheVar, new zzahe(zze(j7), j6 + (j5 * j7)));
    }
}
