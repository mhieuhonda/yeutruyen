package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.lifecycle.AtomicReference$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzva implements zzvn {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdt zzg;
    private boolean zzh;

    public zzva(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdt zzdtVar = new zzdt(zzdp.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdtVar;
        this.zzf = new AtomicReference();
    }

    private static zzuz zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzuz();
            }
            return (zzuz) arrayDeque.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzuy(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzb(int i, int i2, int i3, long j, int i4) {
        zzg();
        zzuz zzuzVarZzi = zzi();
        zzuzVarZzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(1, zzuzVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzc(int i, int i2, zziu zziuVar, long j, int i3) {
        zzg();
        zzuz zzuzVarZzi = zzi();
        zzuzVarZzi.zza(i, 0, 0, j, i3);
        MediaCodec.CryptoInfo cryptoInfo = zzuzVarZzi.zzd;
        cryptoInfo.numSubSamples = zziuVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zziuVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zziuVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zziuVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zziuVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zziuVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zziuVar.zzg, zziuVar.zzh));
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(2, zzuzVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzdt zzdtVar = this.zzg;
                zzdtVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdtVar.zzc();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ void zzh(Message message) {
        zzuz zzuzVar;
        ArrayDeque arrayDeque;
        int i = message.what;
        zzuz zzuzVar2 = null;
        if (i != 1) {
            if (i == 2) {
                zzuzVar = (zzuz) message.obj;
                int i2 = zzuzVar.zza;
                int i3 = zzuzVar.zzb;
                MediaCodec.CryptoInfo cryptoInfo = zzuzVar.zzd;
                long j = zzuzVar.zze;
                int i4 = zzuzVar.zzf;
                try {
                    synchronized (zzb) {
                        try {
                            this.zzc.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i4);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RuntimeException e) {
                    AtomicReference$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, e);
                }
            } else if (i == 3) {
                this.zzg.zza();
            } else if (i != 4) {
                AtomicReference$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    this.zzc.setParameters((Bundle) message.obj);
                } catch (RuntimeException e2) {
                    AtomicReference$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, e2);
                }
            }
            if (zzuzVar2 != null) {
                arrayDeque = zza;
                synchronized (arrayDeque) {
                    arrayDeque.add(zzuzVar2);
                }
            }
        }
        zzuzVar = (zzuz) message.obj;
        int i5 = zzuzVar.zza;
        int i6 = zzuzVar.zzb;
        try {
            this.zzc.queueInputBuffer(i5, 0, zzuzVar.zzc, zzuzVar.zze, zzuzVar.zzf);
        } catch (RuntimeException e3) {
            AtomicReference$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, e3);
        }
        zzuzVar2 = zzuzVar;
        if (zzuzVar2 != null) {
            arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzuzVar2);
            }
        }
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private static byte[] zzk(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
