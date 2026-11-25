package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwy implements zzddu {
    private final zzclb zza;

    zzdwy(zzclb zzclbVar) {
        this.zza = zzclbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zza(Context context) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzb(Context context) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzc(Context context) {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.destroy();
        }
    }
}
