package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfcd implements zzfcq {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzfcd(String str, String str2, String str3, String str4, Long l) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflv.zze(bundle, "gmp_app_id", this.zza);
        zzflv.zze(bundle, "fbs_aiid", this.zzb);
        zzflv.zze(bundle, "fbs_aeid", this.zzc);
        zzflv.zze(bundle, "apm_id_origin", this.zzd);
        Long l = this.zze;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
