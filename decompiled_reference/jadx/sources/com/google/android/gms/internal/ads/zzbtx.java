package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbtx implements zzcgf {
    final /* synthetic */ zzbtv zza;

    zzbtx(zzbua zzbuaVar, zzbtv zzbtvVar) {
        this.zza = zzbtvVar;
        Objects.requireNonNull(zzbuaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("Rejecting reference for JS Engine.");
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziL)).booleanValue();
        zzbtv zzbtvVar = this.zza;
        if (zBooleanValue) {
            zzbtvVar.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            zzbtvVar.zzg();
        }
    }
}
