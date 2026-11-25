package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegq extends zzegk {
    private String zzg;
    private int zzh = 1;

    zzegq(Context context) {
        this.zzf = new zzcam(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzegk, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzegz(1));
    }

    public final ListenableFuture zza(zzcbk zzcbkVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return zzhcf.zzc(new zzegz(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzcbkVar;
            this.zzf.checkAvailabilityAndConnect();
            zzcgd zzcgdVar = this.zza;
            zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, zzcfy.zzh);
            return zzcgdVar;
        }
    }

    public final ListenableFuture zzd(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return zzhcf.zzc(new zzegz(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            zzcgd zzcgdVar = this.zza;
            zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzego
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, zzcfy.zzh);
            return zzcgdVar;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        this.zzf.zzp().zzg(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoG)).booleanValue() ? new zzegj(this.zza, this.zze) : new zzegi(this));
                    } else if (i == 3) {
                        this.zzf.zzp().zzh(this.zzg, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoG)).booleanValue() ? new zzegj(this.zza, this.zze) : new zzegi(this));
                    } else {
                        this.zza.zzd(new zzegz(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzegz(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new zzegz(1));
                }
            }
        }
    }
}
