package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcza implements zzhcc {
    final /* synthetic */ zzcze zza;

    zzcza(zzcze zzczeVar) {
        Objects.requireNonNull(zzczeVar);
        this.zza = zzczeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zza.zzk().zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzk().zzn(true);
    }
}
