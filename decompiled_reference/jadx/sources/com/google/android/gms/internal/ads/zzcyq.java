package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcyq {
    private final zzfky zza;
    private final zzfkn zzb;
    private final String zzc;

    public zzcyq(zzfky zzfkyVar, zzfkn zzfknVar, String str) {
        this.zza = zzfkyVar;
        this.zzb = zzfknVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzfky zza() {
        return this.zza;
    }

    public final zzfkn zzb() {
        return this.zzb;
    }

    public final zzfkq zzc() {
        return this.zza.zzb.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }
}
