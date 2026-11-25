package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgvt extends zzgvw {
    final /* synthetic */ zzgwa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgvt(zzgwa zzgwaVar) {
        super(zzgwaVar, null);
        Objects.requireNonNull(zzgwaVar);
        this.zza = zzgwaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvw
    final /* bridge */ /* synthetic */ Object zza(int i) {
        return new zzgvy(this.zza, i);
    }
}
