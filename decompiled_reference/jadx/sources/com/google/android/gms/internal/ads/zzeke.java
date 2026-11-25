package com.google.android.gms.internal.ads;

import android.app.Activity;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeke extends zzela {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzm zzb;
    private String zzc;
    private String zzd;

    zzeke() {
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final zzela zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final zzela zzb(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzb = zzmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final zzela zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final zzela zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final zzelb zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzekf(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
