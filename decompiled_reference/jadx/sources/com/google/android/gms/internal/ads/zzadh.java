package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzadh extends HandlerThread implements Handler.Callback {
    private zzdw zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzadi zze;

    public zzadh() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        int i2 = message.arg1;
                        zzdw zzdwVar = this.zza;
                        if (zzdwVar == null) {
                            throw null;
                        }
                        zzdwVar.zza(i2);
                        this.zze = new zzadi(this, this.zza.zzc(), i2 != 0, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (zzdx e) {
                        zzeh.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.zzd = new IllegalStateException(e);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e2) {
                    zzeh.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.zzc = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    zzeh.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzd = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    zzdw zzdwVar2 = this.zza;
                    if (zzdwVar2 == null) {
                        throw null;
                    }
                    zzdwVar2.zzb();
                    return true;
                } catch (Throwable th) {
                    try {
                        zzeh.zzf("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzadi zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdw(this.zzb, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzadi zzadiVar = this.zze;
        zzadiVar.getClass();
        return zzadiVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
