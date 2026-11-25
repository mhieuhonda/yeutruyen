package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcsc implements zzcsa {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcsc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        this.zza.zzb(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
