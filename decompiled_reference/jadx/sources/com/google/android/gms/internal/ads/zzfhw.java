package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfhw implements zzgti {
    final /* synthetic */ zzfia zza;

    zzfhw(zzfia zzfiaVar) {
        Objects.requireNonNull(zzfiaVar);
        this.zza = zzfiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", (zzegz) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfia zzfiaVar = this.zza;
        zzfiaVar.zzd(new zzfhy(null, zzfiaVar.zzb(), null));
        return zzfiaVar.zzc();
    }
}
