package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztb implements zzqx {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private final AudioTrack zzd;
    private final zzrg zze;
    private final float zzf;
    private final zzso zzg;
    private zzss zzh;
    private final zzti zzi;
    private final boolean zzj;
    private final int zzk;
    private final zzta zzl;
    private final zzeg zzm = new zzeg(Thread.currentThread());
    private boolean zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    /* JADX WARN: Multi-variable type inference failed */
    public zztb(AudioTrack audioTrack, zzrg zzrgVar, zzso zzsoVar, float f, zzdp zzdpVar) {
        this.zzd = audioTrack;
        this.zze = zzrgVar;
        this.zzf = f;
        this.zzg = zzsoVar;
        boolean zZzE = zzfm.zzE(zzrgVar.zza);
        this.zzj = zZzE;
        if (zZzE) {
            this.zzk = zzfm.zzI(zzrgVar.zza) * Integer.bitCount(zzrgVar.zzc);
        } else {
            this.zzk = -1;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.zzi = new zzti(new zzsu(this, null), zzdpVar, audioTrack, zzrgVar.zza, this.zzk, zzrgVar.zze);
        if (zzsoVar != null) {
            this.zzh = new zzss(audioTrack, zzsoVar, objArr2 == true ? 1 : 0);
        }
        this.zzl = zzg() ? new zzta(this, objArr == true ? 1 : 0) : null;
    }

    static /* synthetic */ void zzp(AudioTrack audioTrack, Handler handler, final zzeg zzegVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zztb.zzw(zzegVar);
                    }
                });
            }
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    ScheduledExecutorService scheduledExecutorService = zzb;
                    if (scheduledExecutorService == null) {
                        throw null;
                    }
                    scheduledExecutorService.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zztb.zzw(zzegVar);
                    }
                });
            }
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    ScheduledExecutorService scheduledExecutorService2 = zzb;
                    if (scheduledExecutorService2 == null) {
                        throw null;
                    }
                    scheduledExecutorService2.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final long zzs() {
        if (!this.zzj) {
            return this.zzp;
        }
        long j = this.zzo;
        int i = this.zzk;
        String str = zzfm.zza;
        long j2 = i;
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzw(zzeg zzegVar) {
        if (zzegVar.zzb()) {
            zzegVar.zze(-1, zzsj.zza);
            zzegVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zza() {
        this.zzi.zzb();
        if (!this.zzn || zzg()) {
            this.zzd.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzb() {
        this.zzi.zzf();
        if (!this.zzn || zzg()) {
            this.zzd.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final boolean zzc(ByteBuffer byteBuffer, int i, long j) throws zzqw {
        zzso zzsoVar;
        boolean z = this.zzj;
        if (!z && this.zzq == 0) {
            this.zzq = zztu.zzF(this.zze.zza, byteBuffer);
        }
        zzeg zzegVar = this.zzm;
        if (zzegVar.zzb()) {
            zzs();
            int underrunCount = this.zzd.getUnderrunCount();
            int i2 = this.zzr;
            this.zzr = underrunCount;
            if (underrunCount > i2) {
                zzegVar.zze(-1, zzsk.zza);
                zzegVar.zzf();
            }
        }
        int iRemaining = byteBuffer.remaining();
        boolean z2 = true;
        int iWrite = this.zzd.write(byteBuffer, byteBuffer.remaining(), 1);
        if (iWrite >= 0) {
            z2 = iWrite == iRemaining;
            if (z) {
                this.zzo += (long) iWrite;
                return z2;
            }
            if (z2) {
                this.zzp += ((long) this.zzq) * ((long) i);
            }
            return z2;
        }
        if (iWrite != -6 && iWrite != -32) {
            z2 = false;
        }
        if (z2 && (zzsoVar = this.zzg) != null) {
            zztg zztgVar = ((zztf) zzsoVar).zza;
            if (zztgVar.zzj() != null) {
                zzqj zzqjVar = zzqj.zza;
                zztgVar.zzi(zzqjVar);
                zztgVar.zzj().zza(zzqjVar);
            }
        }
        throw new zzqw(iWrite, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzd() {
        if (this.zzn) {
            return;
        }
        this.zzn = true;
        this.zzi.zze(zzs());
        this.zzd.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zze() {
        if (this.zzi.zzc()) {
            this.zzd.pause();
        }
        if (Build.VERSION.SDK_INT >= 29 && zzg()) {
            zzta zztaVar = this.zzl;
            zztaVar.getClass();
            zztaVar.zza();
        }
        zzss zzssVar = this.zzh;
        if (zzssVar != null) {
            zzssVar.zzd();
            this.zzh = null;
        }
        final AudioTrack audioTrack = this.zzd;
        final zzeg zzegVar = this.zzm;
        final Handler handlerZzd = zzfm.zzd(null);
        synchronized (zza) {
            if (zzb == null) {
                zzb = zzfm.zzh("ExoPlayer:AudioTrackReleaseThread");
            }
            zzc++;
            zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zztb.zzp(audioTrack, handlerZzd, zzegVar);
                }
            }, 20L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzf(float f) {
        this.zzd.setVolume(f);
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final boolean zzg() {
        return Build.VERSION.SDK_INT >= 29 && this.zzd.isOffloadedPlayback();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final int zzh() {
        return this.zzd.getAudioSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final int zzi() {
        return this.zzd.getSampleRate();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final long zzj() {
        return this.zzd.getBufferSizeInFrames();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final long zzk() {
        return this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final boolean zzl() {
        return this.zzi.zzd(zzs());
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzm(zzqv zzqvVar) {
        this.zzm.zzc(zzqvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzn(zzqh zzqhVar) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdZza = zzqhVar.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.zzd.setLogSessionId(logSessionIdZza);
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzo(AudioDeviceInfo audioDeviceInfo) {
        this.zzd.setPreferredDevice(audioDeviceInfo);
    }

    final /* synthetic */ AudioTrack zzt() {
        return this.zzd;
    }

    final /* synthetic */ zzeg zzu() {
        return this.zzm;
    }
}
