package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbur implements zzcgf {
    final /* synthetic */ zzcgd zza;
    final /* synthetic */ zzbtv zzb;

    zzbur(zzbut zzbutVar, zzcgd zzcgdVar, zzbtv zzbtvVar) {
        this.zza = zzcgdVar;
        this.zzb = zzbtvVar;
        Objects.requireNonNull(zzbutVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbue("Unable to obtain a JavascriptEngine."));
        this.zzb.zza();
    }
}
