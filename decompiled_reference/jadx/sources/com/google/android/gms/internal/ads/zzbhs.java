package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbhs {
    private zzbhh zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzbhs(Context context) {
        this.zzc = context;
    }

    final Future zza(zzbhi zzbhiVar) {
        zzbhm zzbhmVar = new zzbhm(this);
        zzbhq zzbhqVar = new zzbhq(this, zzbhiVar, zzbhmVar);
        zzbhr zzbhrVar = new zzbhr(this, zzbhmVar);
        synchronized (this.zzd) {
            zzbhh zzbhhVar = new zzbhh(this.zzc, com.google.android.gms.ads.internal.zzt.zzs().zza(), zzbhqVar, zzbhrVar);
            this.zza = zzbhhVar;
            zzbhhVar.checkAvailabilityAndConnect();
        }
        return zzbhmVar;
    }

    final /* synthetic */ zzbhh zzc() {
        return this.zza;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzb = true;
    }

    final /* synthetic */ Object zzf() {
        return this.zzd;
    }

    final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            zzbhh zzbhhVar = this.zza;
            if (zzbhhVar == null) {
                return;
            }
            zzbhhVar.disconnect();
            this.zza = null;
            Binder.flushPendingCommands();
        }
    }
}
