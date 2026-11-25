package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzerm implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcgd zza;
    final /* synthetic */ zzfky zzb;
    final /* synthetic */ zzfkn zzc;
    final /* synthetic */ zzert zzd;
    final /* synthetic */ zzero zze;

    zzerm(zzero zzeroVar, zzcgd zzcgdVar, zzfky zzfkyVar, zzfkn zzfknVar, zzert zzertVar) {
        this.zza = zzcgdVar;
        this.zzb = zzfkyVar;
        this.zzc = zzfknVar;
        this.zzd = zzertVar;
        Objects.requireNonNull(zzeroVar);
        this.zze = zzeroVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzert zzertVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzertVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
