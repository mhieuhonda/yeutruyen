package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmc extends zzdix {
    private boolean zzb;

    protected zzdmc(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdmb.zza);
    }

    public final void zzb() {
        zzs(zzdlx.zza);
    }

    public final synchronized void zzc() {
        zzs(zzdly.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        if (!this.zzb) {
            zzs(zzdma.zza);
            this.zzb = true;
        }
        zzs(zzdlz.zza);
    }
}
