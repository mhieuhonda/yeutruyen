package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwu implements zzddt {
    private final zzclb zza;
    private final zzdzt zzb;
    private final zzfkn zzc;

    zzcwu(zzclb zzclbVar, zzdzt zzdztVar, zzfkn zzfknVar) {
        this.zza = zzclbVar;
        this.zzb = zzdztVar;
        this.zzc = zzfknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        zzclb zzclbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoE)).booleanValue() || (zzclbVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzclbVar.zzE()) ? "0" : "1";
        zzdzs zzdzsVarZza = this.zzb.zza();
        zzdzsVarZza.zzc("action", "hcp");
        zzdzsVarZza.zzc("hcp", str);
        zzdzsVarZza.zzb(this.zzc);
        zzdzsVarZza.zzd();
    }
}
