package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeri implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdcx zzb;
    private final zzddr zzc;
    private final zzdli zzd;
    private final zzdla zze;
    private final zzcun zzf;

    zzeri(zzdcx zzdcxVar, zzddr zzddrVar, zzdli zzdliVar, zzdla zzdlaVar, zzcun zzcunVar) {
        this.zzb = zzdcxVar;
        this.zzc = zzddrVar;
        this.zzd = zzdliVar;
        this.zze = zzdlaVar;
        this.zzf = zzcunVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzdr();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
