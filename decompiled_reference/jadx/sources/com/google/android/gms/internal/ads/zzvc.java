package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvc extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzvl zzo;
    private final Object zza = new Object();
    private final zzdo zzd = new zzdo();
    private final zzdo zze = new zzdo();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    zzvc(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    private final void zzj() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        this.zzd.zzc();
        this.zze.zzc();
        this.zzf.clear();
        arrayDeque.clear();
    }

    private final boolean zzk() {
        return this.zzl > 0 || this.zzm;
    }

    private final void zzl(MediaFormat mediaFormat) {
        this.zze.zza(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzm() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.zza) {
            this.zzd.zza(i);
            zzvl zzvlVar = this.zzo;
            if (zzvlVar != null) {
                zzvw zzvwVar = ((zzvu) zzvlVar).zza;
                if (zzvwVar.zzbn() != null) {
                    zzvwVar.zzbn().zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzl(mediaFormat);
                this.zzi = null;
            }
            this.zze.zza(i);
            this.zzf.add(bufferInfo);
            zzvl zzvlVar = this.zzo;
            if (zzvlVar != null) {
                zzvw zzvwVar = ((zzvu) zzvlVar).zza;
                if (zzvwVar.zzbn() != null) {
                    zzvwVar.zzbn().zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzl(mediaFormat);
            this.zzi = null;
        }
    }

    public final void zza(MediaCodec mediaCodec) {
        zzgtr.zzi(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzb() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }

    public final void zzc(Runnable runnable) {
        synchronized (this.zza) {
            zzm();
            runnable.run();
        }
    }

    public final int zzd() {
        synchronized (this.zza) {
            zzm();
            int iZzb = -1;
            if (zzk()) {
                return -1;
            }
            zzdo zzdoVar = this.zzd;
            if (!zzdoVar.zzd()) {
                iZzb = zzdoVar.zzb();
            }
            return iZzb;
        }
    }

    public final int zze(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            zzm();
            if (zzk()) {
                return -1;
            }
            zzdo zzdoVar = this.zze;
            if (zzdoVar.zzd()) {
                return -1;
            }
            int iZzb = zzdoVar.zzb();
            if (iZzb >= 0) {
                if (this.zzh == null) {
                    throw null;
                }
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iZzb == -2) {
                this.zzh = (MediaFormat) this.zzg.remove();
                iZzb = -2;
            }
            return iZzb;
        }
    }

    public final MediaFormat zzf() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzfm.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzi();
                }
            });
        }
    }

    public final void zzh(zzvl zzvlVar) {
        synchronized (this.zza) {
            this.zzo = zzvlVar;
        }
    }

    final /* synthetic */ void zzi() {
        Object obj = this.zza;
        synchronized (obj) {
            if (this.zzm) {
                return;
            }
            long j = this.zzl - 1;
            this.zzl = j;
            if (j > 0) {
                return;
            }
            if (j >= 0) {
                zzj();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            synchronized (obj) {
                this.zzn = illegalStateException;
            }
        }
    }
}
