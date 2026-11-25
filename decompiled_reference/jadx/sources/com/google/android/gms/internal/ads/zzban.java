package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzban implements Runnable {
    final /* synthetic */ zzbao zza;

    zzban(zzbao zzbaoVar) {
        Objects.requireNonNull(zzbaoVar);
        this.zza = zzbaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbao zzbaoVar = this.zza;
        synchronized (zzbaoVar.zzp()) {
            if (zzbaoVar.zzq()) {
                return;
            }
            zzbaoVar.zzr(true);
            try {
                zzbaoVar.zzn();
            } catch (Exception e) {
                this.zza.zzo().zzc(2023, -1L, e);
            }
            zzbao zzbaoVar2 = this.zza;
            synchronized (zzbaoVar2.zzp()) {
                zzbaoVar2.zzr(false);
            }
        }
    }
}
