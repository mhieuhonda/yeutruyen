package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfxy implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfys zza;
    private final String zzb;
    private final String zzc;
    private final zzbdz zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfxq zzg;
    private final long zzh;

    public zzfxy(Context context, int i, zzbdz zzbdzVar, String str, String str2, String str3, zzfxq zzfxqVar) {
        this.zzb = str;
        this.zzd = zzbdzVar;
        this.zzc = str2;
        this.zzg = zzfxqVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfys zzfysVar = new zzfys(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfysVar;
        this.zze = new LinkedBlockingQueue();
        zzfysVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i, long j, Exception exc) {
        zzfxq zzfxqVar = this.zzg;
        if (zzfxqVar != null) {
            zzfxqVar.zzc(i, System.currentTimeMillis() - j, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfyx zzfyxVarZzc = zzc();
        if (zzfyxVarZzc != null) {
            try {
                zzfze zzfzeVarZzg = zzfyxVarZzc.zzg(new zzfzc(1, this.zzd, this.zzb, this.zzc));
                zzd(5011, this.zzh, null);
                this.zze.put(zzfzeVarZzg);
            } catch (Throwable th) {
                try {
                    zzd(2010, this.zzh, new Exception(th));
                } finally {
                    zzb();
                    this.zzf.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzh, null);
            this.zze.put(new zzfze(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zzd(4011, this.zzh, null);
            this.zze.put(new zzfze(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfze zza(int i) {
        zzfze zzfzeVar;
        try {
            zzfzeVar = (zzfze) this.zze.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzd(2009, this.zzh, e);
            zzfzeVar = null;
        }
        zzd(3004, this.zzh, null);
        if (zzfzeVar != null) {
            if (zzfzeVar.zzc == 7) {
                zzfxq.zzg(3);
            } else {
                zzfxq.zzg(2);
            }
        }
        return zzfzeVar == null ? new zzfze(null, 1) : zzfzeVar;
    }

    public final void zzb() {
        zzfys zzfysVar = this.zza;
        if (zzfysVar != null) {
            if (zzfysVar.isConnected() || zzfysVar.isConnecting()) {
                zzfysVar.disconnect();
            }
        }
    }

    protected final zzfyx zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
