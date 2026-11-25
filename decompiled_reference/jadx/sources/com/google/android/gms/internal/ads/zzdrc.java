package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdrc {
    private final zzdzt zza;

    zzdrc(zzdzt zzdztVar) {
        this.zza = zzdztVar;
    }

    public final void zza(View view, zzfkn zzfknVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoE)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : "1";
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("action", "hcp");
        zzdzsVarZza.zzc("hcp", str);
        zzdzsVarZza.zzb(zzfknVar);
        zzdzsVarZza.zzd();
    }
}
