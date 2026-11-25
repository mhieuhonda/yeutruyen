package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlv extends zzdix {
    zzdlv(Set set) {
        super(set);
    }

    public final synchronized void zza(final com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((zzdls) obj).zzd(zzbcVar);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdlt
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((zzdls) obj).zze(str);
            }
        });
    }
}
