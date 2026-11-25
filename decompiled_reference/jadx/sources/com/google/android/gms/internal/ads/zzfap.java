package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfap implements zzfcq {
    public final zzfkm zza;

    public zzfap(zzfkm zzfkmVar) {
        this.zza = zzfkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfkm zzfkmVar = this.zza;
        if (zzfkmVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznE)).booleanValue()) {
                return;
            }
            bundle.putBoolean("render_in_browser", zzfkmVar.zzb());
            bundle.putBoolean("disable_ml", zzfkmVar.zzc());
        }
    }
}
