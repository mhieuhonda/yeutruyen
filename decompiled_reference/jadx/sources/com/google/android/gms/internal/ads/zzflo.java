package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzflo implements zzhcc {
    final /* synthetic */ zzclb zza;
    final /* synthetic */ zzctq zzb;
    final /* synthetic */ zzfsm zzc;
    final /* synthetic */ zzeko zzd;

    zzflo(zzclb zzclbVar, zzctq zzctqVar, zzfsm zzfsmVar, zzeko zzekoVar) {
        this.zza = zzclbVar;
        this.zzb = zzctqVar;
        this.zzc = zzfsmVar;
        this.zzd = zzekoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzctq zzctqVar;
        String str = (String) obj;
        zzclb zzclbVar = this.zza;
        zzfkn zzfknVarZzC = zzclbVar.zzC();
        if (zzfknVarZzC != null && !zzfknVarZzC.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzfknVarZzC.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlH)).booleanValue() && (zzctqVar = this.zzb) != null && zzctq.zzc(str)) {
                zzctqVar.zza(str, this.zzc, com.google.android.gms.ads.internal.client.zzay.zzh(), zzvVar);
                return;
            } else {
                this.zzc.zzb(str, zzvVar, null, null);
                return;
            }
        }
        zzfkq zzfkqVarZzaC = zzclbVar.zzaC();
        if (zzfkqVarZzaC == null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        boolean zZzt = com.google.android.gms.ads.internal.zzt.zzh().zzt(zzclbVar.getContext());
        boolean z = false;
        boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhp)).booleanValue() && zzfknVarZzC != null && zzfknVarZzC.zzS;
        if (zzfknVarZzC != null && zzfknVarZzC.zzad != null) {
            z = true;
        }
        this.zzd.zze(new zzekq(jCurrentTimeMillis, zzfkqVarZzaC.zzb, str, (zZzt || z2 || z) ? 2 : 1));
    }
}
