package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegm extends zzegk {
    private final Context zzg;
    private final Executor zzh;

    zzegm(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzcam(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoG)).booleanValue() ? new zzegj(this.zza, this.zze) : new zzegi(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzegz(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzegz(1));
                }
            }
        }
    }

    public final ListenableFuture zza(zzcbk zzcbkVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzcbkVar;
            this.zzf.checkAvailabilityAndConnect();
            zzcgd zzcgdVar = this.zza;
            zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, zzcfy.zzh);
            zzc(this.zzg, zzcgdVar, this.zzh);
            return zzcgdVar;
        }
    }
}
