package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import androidx.work.WorkRequest;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzti {
    private boolean zzA;
    private long zzB;
    private final zzth zza;
    private final zzdp zzb;
    private final long[] zzc;
    private final AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final zzsi zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzti(zzth zzthVar, zzdp zzdpVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.zza = zzthVar;
        this.zzb = zzdpVar;
        this.zzd = audioTrack;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzh = new zzsi(audioTrack, zzthVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zZzE = zzfm.zzE(i);
        this.zzg = zZzE;
        this.zzf = zZzE ? zzfm.zzu(i3 / i2, sampleRate) : -9223372036854775807L;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = -9223372036854775807L;
    }

    private final void zzg(long j) {
        long j2 = this.zzj;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long jZzz = zzfm.zzz(j - j2, this.zzi);
        zzdp zzdpVar = this.zzb;
        long jZza = zzdpVar.zza() - zzfm.zzs(jZzz);
        this.zzj = -9223372036854775807L;
        this.zza.zzb(jZza);
    }

    private final long zzh(long j) {
        long jZzy;
        if (this.zzt == 0) {
            jZzy = this.zzu != -9223372036854775807L ? zzfm.zzu(zzl(), this.zze) : zzj();
        } else {
            jZzy = zzfm.zzy(j + this.zzk, this.zzi);
        }
        long jMax = Math.max(0L, jZzy - this.zzn);
        return this.zzu != -9223372036854775807L ? Math.min(zzfm.zzu(this.zzx, this.zze), jMax) : jMax;
    }

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
    }

    private final long zzj() {
        return zzfm.zzu(zzk(), this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    private final long zzk() {
        if (this.zzu != -9223372036854775807L) {
            return Math.min(this.zzx, zzl());
        }
        long jZzb = this.zzb.zzb();
        if (jZzb - this.zzp >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition();
                int i = Build.VERSION.SDK_INT;
                long j = playbackHeadPosition & KeyboardMap.kValueMask;
                if (i > 29) {
                    if (this.zzq > j) {
                        this.zzr++;
                    }
                    this.zzq = j;
                } else if (j != 0 || this.zzq <= 0 || playState != 3) {
                    this.zzv = -9223372036854775807L;
                    if (this.zzq > j) {
                        this.zzr++;
                    }
                    this.zzq = j;
                } else if (this.zzv == -9223372036854775807L) {
                    this.zzv = jZzb;
                }
            }
            this.zzp = jZzb;
        }
        return this.zzq + this.zzB + (this.zzr << 32);
    }

    private final long zzl() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + zzfm.zzv(zzfm.zzy(zzfm.zzt(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    public final long zza() {
        long j;
        Method method;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        long j2 = 1000;
        if (audioTrack.getPlayState() == 3) {
            long jZzc = this.zzb.zzc() / 1000;
            if (jZzc - this.zzl >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long jZzj = zzj();
                if (jZzj != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzs] = zzfm.zzz(jZzj, this.zzi) - jZzc;
                    this.zzs = (this.zzs + 1) % 10;
                    int i = this.zzt;
                    if (i < 10) {
                        this.zzt = i + 1;
                    }
                    this.zzl = jZzc;
                    this.zzk = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.zzt;
                        if (i2 >= i3) {
                            break;
                        }
                        this.zzk += jArr[i2] / ((long) i3);
                        i2++;
                        j2 = j2;
                    }
                } else {
                    j = 1000;
                }
            }
            j = j2;
            long j3 = this.zzn;
            if (this.zzg && (method = this.zzm) != null && jZzc - this.zzo >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                    String str = zzfm.zza;
                    long jIntValue = (((long) num.intValue()) * j) - this.zzf;
                    this.zzn = jIntValue;
                    long jMax = Math.max(jIntValue, 0L);
                    this.zzn = jMax;
                    if (jMax > 10000000) {
                        this.zza.zza(jMax);
                        this.zzn = 0L;
                    }
                } catch (Exception unused) {
                    this.zzm = null;
                }
                this.zzo = jZzc;
            }
            this.zzh.zza(jZzc, this.zzi, zzh(jZzc), j3 != this.zzn);
        } else {
            j = 1000;
        }
        long jZzc2 = this.zzb.zzc() / j;
        zzsi zzsiVar = this.zzh;
        boolean zZzb = zzsiVar.zzb();
        long jZze = zZzb ? zzsiVar.zze(jZzc2, this.zzi) : zzh(jZzc2);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zZzb || !zzsiVar.zzc()) {
                zzg(jZze);
            }
            long j4 = this.zzz;
            if (j4 != -9223372036854775807L) {
                long j5 = jZze - this.zzy;
                long jZzy = zzfm.zzy(jZzc2 - j4, this.zzi);
                long j6 = this.zzy + jZzy;
                long jAbs = Math.abs(j6 - jZze);
                if (j5 != 0 && jAbs < 1000000) {
                    long j7 = (jZzy * 10) / 100;
                    jZze = Math.max(j6 - j7, Math.min(jZze, j6 + j7));
                }
            }
            this.zzz = jZzc2;
            this.zzy = jZze;
        } else if (playState == 1) {
            zzg(jZze);
            return jZze;
        }
        return jZze;
    }

    public final void zzb() {
        if (this.zzu != -9223372036854775807L) {
            this.zzu = zzfm.zzt(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j) {
        return this.zzv != -9223372036854775807L && j > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public final void zze(long j) {
        this.zzw = zzk();
        this.zzu = zzfm.zzt(this.zzb.zzb());
        this.zzx = j;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == -9223372036854775807L) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}
