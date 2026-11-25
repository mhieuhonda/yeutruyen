package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfhx implements zzgti {
    final /* synthetic */ zzfia zza;

    zzfhx(zzfia zzfiaVar) {
        Objects.requireNonNull(zzfiaVar);
        this.zza = zzfiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcbk zzcbkVar = (zzcbk) obj;
        zzfhy zzfhyVar = new zzfhy(zzcbkVar, new zzfnh(zzcbkVar.zzj), null);
        zzfia zzfiaVar = this.zza;
        zzfiaVar.zzd(zzfhyVar);
        return zzfiaVar.zzc();
    }
}
