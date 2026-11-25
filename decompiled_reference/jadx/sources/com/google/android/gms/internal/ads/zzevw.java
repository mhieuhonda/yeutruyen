package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevw implements zzfcq {
    private final com.google.android.gms.ads.internal.client.zzx zza;
    private final boolean zzb;

    public zzevw(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z) {
        this.zza = zzxVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgA)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.zza;
        if (zzxVar != null) {
            int i = zzxVar.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
