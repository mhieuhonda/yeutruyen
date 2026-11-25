package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzamv implements zzanc {
    private final zzanb zza;
    private final long zzb;
    private final long zzc;
    private final zzang zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzamv(zzang zzangVar, long j, long j2, long j3, long j4, boolean z) {
        zzgtr.zza(j >= 0 && j2 > j);
        this.zzd = zzangVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzanb();
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final void zzb(long j) {
        long j2 = this.zzf - 1;
        String str = zzfm.zza;
        this.zzh = Math.max(0L, Math.min(j, j2));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzanc
    public final /* bridge */ /* synthetic */ zzahd zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzamu(this, bArr);
        }
        return null;
    }

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ zzang zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzf;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzanc
    public final long zza(zzagb zzagbVar) throws IOException {
        long j;
        long j2;
        long jMax;
        int i = this.zze;
        if (i == 0) {
            long jZzn = zzagbVar.zzn();
            this.zzg = jZzn;
            this.zze = 1;
            long j3 = this.zzc - 65307;
            if (j3 > jZzn) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j4 = this.zzi;
                long j5 = this.zzj;
                if (j4 == j5) {
                    jMax = -1;
                    j2 = -1;
                } else {
                    long jZzn2 = zzagbVar.zzn();
                    zzanb zzanbVar = this.zza;
                    if (zzanbVar.zzb(zzagbVar, j5)) {
                        zzanbVar.zzc(zzagbVar, false);
                        zzagbVar.zzl();
                        long j6 = this.zzh;
                        j = 2;
                        long j7 = zzanbVar.zzb;
                        long j8 = j6 - j7;
                        int i2 = zzanbVar.zzd + zzanbVar.zze;
                        if (j8 < 0 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.zzj = jZzn2;
                                this.zzl = j7;
                            } else {
                                this.zzi = zzagbVar.zzn() + ((long) i2);
                                this.zzk = j7;
                            }
                            long j9 = this.zzj;
                            long j10 = this.zzi;
                            long j11 = j9 - j10;
                            if (j11 < 100000) {
                                this.zzj = j10;
                                j2 = -1;
                                jMax = j10;
                            } else {
                                long jZzn3 = zzagbVar.zzn() - (((long) i2) * (j8 <= 0 ? 2L : 1L));
                                j2 = -1;
                                String str = zzfm.zza;
                                jMax = Math.max(j10, Math.min(jZzn3 + ((j8 * j11) / (this.zzl - this.zzk)), j9 - 1));
                            }
                        } else {
                            jMax = -1;
                            j2 = -1;
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j2 = -1;
                    }
                    if (jMax != j2) {
                        return jMax;
                    }
                    this.zze = 3;
                }
                j = 2;
                if (jMax != j2) {
                    return jMax;
                }
                this.zze = 3;
            } else {
                if (i != 3) {
                    return -1L;
                }
                j2 = -1;
                j = 2;
            }
            while (true) {
                zzanb zzanbVar2 = this.zza;
                zzanbVar2.zzb(zzagbVar, j2);
                zzanbVar2.zzc(zzagbVar, false);
                if (zzanbVar2.zzb > this.zzh) {
                    zzagbVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + j);
                }
                zzagbVar.zzf(zzanbVar2.zzd + zzanbVar2.zze);
                this.zzi = zzagbVar.zzn();
                this.zzk = zzanbVar2.zzb;
                j2 = -1;
            }
        }
        zzanb zzanbVar3 = this.zza;
        zzanbVar3.zza();
        if (!zzanbVar3.zzb(zzagbVar, -1L)) {
            throw new EOFException();
        }
        zzanbVar3.zzc(zzagbVar, false);
        zzagbVar.zzf(zzanbVar3.zzd + zzanbVar3.zze);
        long j12 = zzanbVar3.zzb;
        while ((zzanbVar3.zza & 4) != 4 && zzanbVar3.zzb(zzagbVar, -1L) && zzagbVar.zzn() < this.zzc && zzanbVar3.zzc(zzagbVar, true) && zzage.zzd(zzagbVar, zzanbVar3.zzd + zzanbVar3.zze)) {
            j12 = zzanbVar3.zzb;
        }
        this.zzf = j12;
        this.zze = 4;
        return this.zzg;
    }
}
