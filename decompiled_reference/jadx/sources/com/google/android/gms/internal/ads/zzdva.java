package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdva {
    private final zzdcx zza;
    private final zzdeg zzb;
    private final zzdet zzc;
    private final zzdfk zzd;
    private final zzdid zze;
    private final zzfkn zzf;
    private final zzfkq zzg;
    private final zzctq zzh;

    public zzdva(zzdcx zzdcxVar, zzdeg zzdegVar, zzdet zzdetVar, zzdfk zzdfkVar, zzdid zzdidVar, zzfkn zzfknVar, zzfkq zzfkqVar, zzctq zzctqVar) {
        this.zza = zzdcxVar;
        this.zzb = zzdegVar;
        this.zzc = zzdetVar;
        this.zzd = zzdfkVar;
        this.zze = zzdidVar;
        this.zzf = zzfknVar;
        this.zzg = zzfkqVar;
        this.zzh = zzctqVar;
    }

    public final void zza(zzdvf zzdvfVar) {
        final zzdeg zzdegVar = this.zzb;
        zzdut zzdutVarZzk = zzdvfVar.zzk();
        Objects.requireNonNull(zzdegVar);
        zzdutVarZzk.zzm(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzduz
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzdegVar.zzb();
            }
        });
        zzdvfVar.zzg(this.zzf, this.zzg, this.zzh);
    }
}
