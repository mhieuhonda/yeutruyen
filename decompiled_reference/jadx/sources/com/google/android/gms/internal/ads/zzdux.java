package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdux implements zzhcc {
    final /* synthetic */ String zza = "sendMessageToNativeJs";
    final /* synthetic */ Map zzb;

    zzdux(zzdvf zzdvfVar, String str, Map map) {
        this.zzb = map;
        Objects.requireNonNull(zzdvfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzclb) obj).zze(this.zza, this.zzb);
    }
}
