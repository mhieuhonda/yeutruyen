package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbfs {
    private final Object zza = new Object();
    private zzbfq zzb = null;
    private boolean zzc = false;

    public final void zza(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not cast Context to Application");
                } else {
                    if (this.zzb == null) {
                        this.zzb = new zzbfq();
                    }
                    this.zzb.zza(application, context);
                    this.zzc = true;
                }
            }
        }
    }

    public final void zzb(zzbfr zzbfrVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzbfq();
            }
            this.zzb.zzb(zzbfrVar);
        }
    }

    public final Activity zzd() {
        synchronized (this.zza) {
            zzbfq zzbfqVar = this.zzb;
            if (zzbfqVar == null) {
                return null;
            }
            return zzbfqVar.zzd();
        }
    }

    public final Context zze() {
        synchronized (this.zza) {
            zzbfq zzbfqVar = this.zzb;
            if (zzbfqVar == null) {
                return null;
            }
            return zzbfqVar.zze();
        }
    }

    public final boolean zzf() {
        synchronized (this.zza) {
            zzbfq zzbfqVar = this.zzb;
            if (zzbfqVar == null) {
                return false;
            }
            return zzbfqVar.zzg().get();
        }
    }

    public final void zzg(zzdxc zzdxcVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzbfq();
            }
            this.zzb.zzj(zzdxcVar);
        }
    }

    public final void zzc(zzbfr zzbfrVar) {
        synchronized (this.zza) {
            zzbfq zzbfqVar = this.zzb;
            if (zzbfqVar == null) {
                return;
            }
            zzbfqVar.zzc(zzbfrVar);
        }
    }
}
