package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbpb implements zzhcc {
    final /* synthetic */ zzclb zza;

    zzbpb(zzclb zzclbVar) {
        this.zza = zzclbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzclb zzclbVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbt(zzclbVar.getContext(), zzclbVar.zzs().afmaVersion, str, null, zzclbVar.zzC() != null ? zzclbVar.zzC().zzax : null).zzb();
    }
}
