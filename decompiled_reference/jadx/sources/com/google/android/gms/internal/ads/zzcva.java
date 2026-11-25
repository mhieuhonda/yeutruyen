package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcva {
    private final zzdzt zza;
    private final zzfky zzb;

    zzcva(zzdzt zzdztVar, zzfky zzfkyVar) {
        this.zza = zzdztVar;
        this.zzb = zzfkyVar;
    }

    public final void zza(long j, int i) {
        String str;
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zza(this.zzb.zzb.zzb);
        zzdzsVarZza.zzc("action", "ad_closed");
        zzdzsVarZza.zzc("show_time", String.valueOf(j));
        zzdzsVarZza.zzc("ad_format", "app_open_ad");
        int i2 = i - 1;
        if (i2 == 0) {
            str = "h";
        } else if (i2 == 1) {
            str = "bb";
        } else if (i2 == 2) {
            str = "cc";
        } else if (i2 != 3) {
            str = i2 != 4 ? "u" : "ac";
        } else {
            str = "cb";
        }
        zzdzsVarZza.zzc("acr", str);
        zzdzsVarZza.zzd();
    }
}
