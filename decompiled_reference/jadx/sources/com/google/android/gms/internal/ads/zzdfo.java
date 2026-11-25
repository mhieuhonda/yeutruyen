package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdfo extends zzdix implements zzddt, zzdey {
    private final zzfkn zzb;
    private final AtomicBoolean zzc;
    private final zzfky zzd;

    public zzdfo(Set set, zzfkn zzfknVar, zzfky zzfkyVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfknVar;
        this.zzd = zzfkyVar;
    }

    private final void zzb() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjd)).booleanValue() && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3 && this.zzc.compareAndSet(false, true)) {
            zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdfn
                @Override // com.google.android.gms.internal.ads.zzdiw
                public final /* synthetic */ void zza(Object obj) {
                    ((zzdfq) obj).zzm(zztVar);
                }
            });
        }
    }

    public final void zza(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(this.zzd) && this.zzb.zzaB && this.zzc.compareAndSet(false, true)) {
            zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdfm
                @Override // com.google.android.gms.internal.ads.zzdiw
                public final /* synthetic */ void zza(Object obj) {
                    ((zzdfq) obj).zzm(zztVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdey
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
