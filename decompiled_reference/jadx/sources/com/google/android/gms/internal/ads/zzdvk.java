package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvk {
    private final zzdcx zza;
    private final zzdeg zzb;
    private final zzdet zzc;
    private final zzdfk zzd;
    private final zzdid zze;
    private final zzdle zzf;
    private final zzdzt zzg;
    private final zzfsm zzh;
    private final zzeko zzi;
    private final zzctq zzj;

    zzdvk(zzdcx zzdcxVar, zzdeg zzdegVar, zzdet zzdetVar, zzdfk zzdfkVar, zzdid zzdidVar, zzdle zzdleVar, zzdzt zzdztVar, zzfsm zzfsmVar, zzeko zzekoVar, zzctq zzctqVar) {
        this.zza = zzdcxVar;
        this.zzb = zzdegVar;
        this.zzc = zzdetVar;
        this.zzd = zzdfkVar;
        this.zze = zzdidVar;
        this.zzf = zzdleVar;
        this.zzg = zzdztVar;
        this.zzh = zzfsmVar;
        this.zzi = zzekoVar;
        this.zzj = zzctqVar;
    }

    public final void zza(zzdvl zzdvlVar, zzclb zzclbVar) throws Throwable {
        zzdvi zzdviVarZzb = zzdvlVar.zzb();
        final zzdeg zzdegVar = this.zzb;
        Objects.requireNonNull(zzdegVar);
        zzdviVarZzb.zzn(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdvj
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzdegVar.zzb();
            }
        }, this.zzf);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlN)).booleanValue() || zzclbVar == null || zzclbVar.zzP() == null) {
            return;
        }
        zzcmz zzcmzVarZzP = zzclbVar.zzP();
        zzctq zzctqVar = this.zzj;
        zzeko zzekoVar = this.zzi;
        zzcmzVarZzP.zzd(zzctqVar, zzekoVar, this.zzh);
        zzcmzVarZzP.zze(zzctqVar, zzekoVar, this.zzg);
    }
}
