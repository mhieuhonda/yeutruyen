package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdve implements zzbpx {
    final /* synthetic */ zzdvf zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbpx zzd;

    /* synthetic */ zzdve(zzdvf zzdvfVar, WeakReference weakReference, String str, zzbpx zzbpxVar, byte[] bArr) {
        Objects.requireNonNull(zzdvfVar);
        this.zza = zzdvfVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zze(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
