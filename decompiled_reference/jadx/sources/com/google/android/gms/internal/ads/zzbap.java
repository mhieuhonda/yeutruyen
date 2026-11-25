package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbap implements Runnable {
    final /* synthetic */ zzbaq zza;

    zzbap(zzbaq zzbaqVar) {
        Objects.requireNonNull(zzbaqVar);
        this.zza = zzbaqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzbaq zzbaqVar = this.zza;
        if (zzbaqVar.zzb != null) {
            return;
        }
        synchronized (zzbaq.zzd) {
            if (zzbaqVar.zzb != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = ((Boolean) zzbix.zzdz.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzbaq.zza = zzfzm.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z = zBooleanValue;
            this.zza.zzb = Boolean.valueOf(z);
            zzbaq.zzd.open();
        }
    }
}
