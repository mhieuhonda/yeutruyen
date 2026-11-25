package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbhe {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbha(this);
    private final Object zzc = new Object();
    private zzbhh zzd;
    private Context zze;
    private zzbhk zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzbhh zzbhhVarZze = zze(new zzbhc(this), new zzbhd(this));
                this.zzd = zzbhhVarZze;
                zzbhhVarZze.checkAvailabilityAndConnect();
            }
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfo)).booleanValue()) {
                zzf();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfn)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzbhb(this));
                }
            }
        }
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfp)).booleanValue()) {
            synchronized (this.zzc) {
                zzf();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcfy.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfq)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final zzbhf zzc(zzbhi zzbhiVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbhf();
            }
            try {
                boolean zZzp = this.zzd.zzp();
                zzbhk zzbhkVar = this.zzf;
                if (zZzp) {
                    return zzbhkVar.zzf(zzbhiVar);
                }
                return zzbhkVar.zze(zzbhiVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                return new zzbhf();
            }
        }
    }

    public final long zzd(zzbhi zzbhiVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zzg(zzbhiVar);
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    protected final synchronized zzbhh zze(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbhh(this.zze, com.google.android.gms.ads.internal.zzt.zzs().zza(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            zzbhh zzbhhVar = this.zzd;
            if (zzbhhVar == null) {
                return;
            }
            if (zzbhhVar.isConnected() || this.zzd.isConnecting()) {
                this.zzd.disconnect();
            }
            this.zzd = null;
            this.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    final /* synthetic */ Object zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzbhh zzi() {
        return this.zzd;
    }

    final /* synthetic */ void zzj(zzbhh zzbhhVar) {
        this.zzd = null;
    }

    final /* synthetic */ void zzk(zzbhk zzbhkVar) {
        this.zzf = zzbhkVar;
    }
}
