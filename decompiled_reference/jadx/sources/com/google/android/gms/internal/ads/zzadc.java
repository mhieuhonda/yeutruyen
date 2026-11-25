package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzadc implements zzaeu {
    final /* synthetic */ zzvm zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzadg zzd;

    zzadc(zzadg zzadgVar, zzvm zzvmVar, int i, long j) {
        this.zza = zzvmVar;
        this.zzb = i;
        this.zzc = j;
        Objects.requireNonNull(zzadgVar);
        this.zzd = zzadgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zza(long j) {
        this.zzd.zzaD(this.zza, this.zzb, this.zzc, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzb() {
        this.zzd.zzaA(this.zza, this.zzb, this.zzc);
    }
}
