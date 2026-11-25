package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfvv {
    private final zzfxj zza;
    private final String zzb;
    private final zzfvb zzc;
    private final String zzd = "Ad overlay";

    public zzfvv(View view, zzfvb zzfvbVar, String str) {
        this.zza = new zzfxj(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfvbVar;
    }

    public final zzfxj zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzfvb zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
