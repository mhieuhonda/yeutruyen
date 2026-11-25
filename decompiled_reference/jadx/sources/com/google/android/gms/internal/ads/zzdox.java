package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdox {
    private final JSONObject zza;
    private final zzdvf zzb;
    private final com.google.android.gms.ads.internal.zzb zzc;
    private final zzcdu zzd;

    public zzdox(JSONObject jSONObject, zzdvf zzdvfVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar) {
        this.zza = jSONObject;
        this.zzb = zzdvfVar;
        this.zzc = zzbVar;
        this.zzd = zzcduVar;
    }

    final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    final zzcdu zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdvf zzd() {
        return this.zzb;
    }
}
