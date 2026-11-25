package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgyg extends zzgyf {
    final /* synthetic */ zzgyh zza;

    zzgyg(zzgyh zzgyhVar, int i) {
        Objects.requireNonNull(zzgyhVar);
        this.zza = zzgyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final zzgxo zza() {
        return new zzgyj(this.zza.zza(), new zzgye(2));
    }
}
