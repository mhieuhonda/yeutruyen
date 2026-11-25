package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzerw implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdmi zza;

    zzerw(zzerx zzerxVar, zzdmi zzdmiVar) {
        this.zza = zzdmiVar;
        Objects.requireNonNull(zzerxVar);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdmi zzdmiVar = this.zza;
        zzdmiVar.zzd().zza();
        zzdmiVar.zze().zza();
    }
}
