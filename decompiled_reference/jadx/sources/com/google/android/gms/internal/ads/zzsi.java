package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.work.WorkRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsi {
    private final zzsh zza;
    private final int zzb;
    private final zzth zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzsi(AudioTrack audioTrack, zzth zzthVar) {
        this.zza = new zzsh(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzthVar;
        zzf(0);
    }

    private final void zzf(int i) {
        this.zzd = i;
        long j = WorkRequest.MIN_BACKOFF_MILLIS;
        if (i == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.zzf = WorkRequest.MIN_BACKOFF_MILLIS;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzf = j;
    }

    private final long zzg(long j, float f) {
        zzsh zzshVar = this.zza;
        return zzh(zzshVar.zzc(), zzshVar.zzb(), j, f);
    }

    private final long zzh(long j, long j2, long j3, float f) {
        return zzfm.zzu(j, this.zzb) + zzfm.zzy(j3 - j2, f);
    }

    public final void zza(long j, float f, long j2, boolean z) {
        boolean z2;
        int i;
        if (z || j - this.zzg >= this.zzf) {
            this.zzg = j;
            zzsh zzshVar = this.zza;
            boolean zZza = zzshVar.zza();
            if (zZza) {
                long jZzb = zzshVar.zzb();
                long jZzg = zzg(j, f);
                i = 2;
                if (Math.abs(jZzb - j) > 5000000) {
                    zzth zzthVar = this.zzc;
                    long jZzc = zzshVar.zzc();
                    long jZzs = ((zzsu) zzthVar).zza.zzs();
                    int length = String.valueOf(jZzc).length();
                    int length2 = String.valueOf(jZzb).length();
                    int length3 = String.valueOf(j).length();
                    StringBuilder sb = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j2).length() + 2 + String.valueOf(jZzs).length());
                    sb.append("Spurious audio timestamp (system clock mismatch): ");
                    sb.append(jZzc);
                    sb.append(", ");
                    sb.append(jZzb);
                    sb.append(", ");
                    sb.append(j);
                    sb.append(", ");
                    sb.append(j2);
                    sb.append(", ");
                    sb.append(jZzs);
                    zzeh.zzc("AudioTrackAudioOutput", sb.toString());
                    zzf(4);
                    z2 = zZza;
                } else if (Math.abs(jZzg - j2) > 5000000) {
                    zzth zzthVar2 = this.zzc;
                    long jZzc2 = zzshVar.zzc();
                    long jZzs2 = ((zzsu) zzthVar2).zza.zzs();
                    int length4 = String.valueOf(jZzc2).length();
                    int length5 = String.valueOf(jZzb).length();
                    int length6 = String.valueOf(j).length();
                    int length7 = length4 + 54 + length5 + 2 + length6 + 2 + String.valueOf(j2).length() + 2;
                    z2 = zZza;
                    StringBuilder sb2 = new StringBuilder(length7 + String.valueOf(jZzs2).length());
                    sb2.append("Spurious audio timestamp (frame position mismatch): ");
                    sb2.append(jZzc2);
                    sb2.append(", ");
                    sb2.append(jZzb);
                    sb2.append(", ");
                    sb2.append(j);
                    sb2.append(", ");
                    sb2.append(j2);
                    sb2.append(", ");
                    sb2.append(jZzs2);
                    zzeh.zzc("AudioTrackAudioOutput", sb2.toString());
                    zzf(4);
                } else {
                    z2 = zZza;
                    if (this.zzd == 4) {
                        zzf(0);
                    }
                }
            } else {
                z2 = zZza;
                i = 2;
            }
            int i2 = this.zzd;
            if (i2 == 0) {
                if (!z2) {
                    if (j - this.zze > 500000) {
                        zzf(3);
                        return;
                    }
                    return;
                } else {
                    if (zzshVar.zzb() >= this.zze) {
                        this.zzh = zzshVar.zzc();
                        this.zzi = zzshVar.zzb();
                        zzf(1);
                        return;
                    }
                    return;
                }
            }
            if (i2 != 1) {
                if (i2 == i) {
                    if (z2) {
                        return;
                    }
                    zzf(0);
                    return;
                } else {
                    if (i2 == 3 && z2) {
                        zzf(0);
                        return;
                    }
                    return;
                }
            }
            if (!z2) {
                zzf(0);
                return;
            }
            long jZzc3 = zzshVar.zzc();
            long j3 = this.zzh;
            if (jZzc3 > j3) {
                if (Math.abs(zzg(j, f) - zzh(j3, this.zzi, j, f)) < 1000) {
                    zzf(2);
                    return;
                }
            }
            if (j - this.zze > 2000000) {
                zzf(3);
            } else {
                this.zzh = zzshVar.zzc();
                this.zzi = zzshVar.zzb();
            }
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i = this.zzd;
        return i == 0 || i == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j, float f) {
        return zzg(j, f);
    }
}
