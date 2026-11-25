package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzddi extends zzdix implements zzddd {
    public zzddi(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzddh
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((zzddp) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zzd(final zzdnv zzdnvVar) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzddf
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                zzddp zzddpVar = (zzddp) obj;
                String message = zzdnvVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzddpVar.zzj(zzfmi.zzd(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zze() {
        zzs(zzddg.zza);
    }
}
