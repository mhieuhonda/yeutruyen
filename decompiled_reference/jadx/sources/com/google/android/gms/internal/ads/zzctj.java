package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzctj implements zzhcc {
    final /* synthetic */ zzfsm zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ zzctq zzd;

    zzctj(zzctq zzctqVar, zzfsm zzfsmVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfsmVar;
        this.zzb = str;
        this.zzc = zzvVar;
        Objects.requireNonNull(zzctqVar);
        this.zzd = zzctqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(final Throwable th) {
        final zzfsm zzfsmVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcti
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlV)).booleanValue();
                Throwable th2 = th;
                zzctj zzctjVar = this.zza;
                if (zBooleanValue) {
                    zzctq zzctqVar = zzctjVar.zzd;
                    zzctqVar.zzb = zzcaf.zzc(zzctqVar.zzi());
                    zzctqVar.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzctq zzctqVar2 = zzctjVar.zzd;
                    zzctqVar2.zza = zzcaf.zza(zzctqVar2.zzi());
                    zzctqVar2.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfsmVar.zzb(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfsm zzfsmVar = this.zza;
        final String str = (String) obj;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcth
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfsmVar.zzb(str, zzvVar, null, null);
            }
        });
    }
}
