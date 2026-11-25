package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfxw implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfys zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfxw(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfys zzfysVar = new zzfys(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfysVar;
        this.zzd = new LinkedBlockingQueue();
        zzfysVar.checkAvailabilityAndConnect();
    }

    static zzayt zzc() {
        zzaxt zzaxtVarZzj = zzayt.zzj();
        zzaxtVarZzj.zzl(32768L);
        return (zzayt) zzaxtVarZzj.zzbu();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfyx zzfyxVarZzd = zzd();
        if (zzfyxVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfyxVarZzd.zze(new zzfyt(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zzc());
                }
            } catch (InterruptedException unused2) {
            } finally {
                zzb();
                this.zze.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzayt zza(int i) {
        zzayt zzaytVar;
        try {
            zzaytVar = (zzayt) this.zzd.poll(CoroutineLiveDataKt.DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaytVar = null;
        }
        return zzaytVar == null ? zzc() : zzaytVar;
    }

    public final void zzb() {
        zzfys zzfysVar = this.zza;
        if (zzfysVar != null) {
            if (zzfysVar.isConnected() || zzfysVar.isConnecting()) {
                zzfysVar.disconnect();
            }
        }
    }

    protected final zzfyx zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
