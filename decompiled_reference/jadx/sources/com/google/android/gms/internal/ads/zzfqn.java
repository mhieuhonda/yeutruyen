package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfqn implements zzhcc {
    final /* synthetic */ zzfqq zza;
    final /* synthetic */ zzfqg zzb;

    zzfqn(zzfqq zzfqqVar, zzfqg zzfqgVar) {
        this.zza = zzfqqVar;
        this.zzb = zzfqgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqg zzfqgVar = this.zzb;
        zzfqgVar.zzj(th);
        zzfqgVar.zzd(false);
        this.zza.zza(zzfqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
    }
}
