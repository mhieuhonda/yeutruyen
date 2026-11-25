package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcld implements zzhcc {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzclm zzd;

    zzcld(zzclm zzclmVar, List list, String str, Uri uri) {
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
        Objects.requireNonNull(zzclmVar);
        this.zzd = zzclmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        String strValueOf = String.valueOf(this.zzc);
        String.valueOf(strValueOf);
        String strValueOf2 = String.valueOf(strValueOf);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to parse gmsg params for: ".concat(strValueOf2));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.zza;
        String str = this.zzb;
        this.zzd.zzaa((Map) obj, list, str);
    }
}
