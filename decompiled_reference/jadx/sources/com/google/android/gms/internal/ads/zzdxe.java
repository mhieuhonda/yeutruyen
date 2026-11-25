package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxe {
    private final zzdzt zza;

    zzdxe(zzdzt zzdztVar) {
        this.zza = zzdztVar;
    }

    public final boolean zza(zzgbe zzgbeVar) {
        boolean zZzj = zzgbeVar.zzj();
        zzdzt zzdztVar = this.zza;
        if (zZzj) {
            zzdzs zzdzsVarZza = zzdztVar.zza();
            zzdzsVarZza.zzc("action", "aq_ad_closed");
            zzdzsVarZza.zzc("gqi", zzgbeVar.zza());
            zzdzsVarZza.zzc("aq_ad_duration", String.valueOf(zzgbeVar.zzb()));
            zzdzsVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzgbeVar.zzc()));
            zzdzsVarZza.zzc("aq_time_away", String.valueOf(zzgbeVar.zzg()));
            return Boolean.valueOf(zzdzsVarZza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS)).booleanValue();
        }
        zzdzs zzdzsVarZza2 = zzdztVar.zza();
        zzdzsVarZza2.zzc("action", "aq_ad_kill");
        zzdzsVarZza2.zzc("gqi", zzgbeVar.zza());
        zzdzsVarZza2.zzc("aq_ad_duration", String.valueOf(zzgbeVar.zzb()));
        zzdzsVarZza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzgbeVar.zzc()));
        zzdzsVarZza2.zzc("aq_time_away", String.valueOf(zzgbeVar.zzg()));
        zzdzsVarZza2.zzc("aq_is_os_kill", String.valueOf(zzgbeVar.zze()));
        return Boolean.valueOf(zzdzsVarZza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS)).booleanValue();
    }
}
