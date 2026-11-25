package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdoq implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;

    private zzdoq(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar6;
    }

    public static zzdoq zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        return new zzdoq(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcnq zzcnqVar = (zzcnq) this.zza.zzb();
        zzdci zzdciVarZza = ((zzdcr) this.zzb).zza();
        zzdiz zzdizVarZza = ((zzdju) this.zzc).zza();
        zzdof zzdofVarZza = ((zzdoh) this.zzd).zza();
        zzdga zzdgaVarZzb = ((zzcvr) this.zze).zzb();
        zzepl zzeplVar = (zzepl) this.zzf.zzb();
        zzcww zzcwwVarZzi = zzcnqVar.zzi();
        zzcwwVarZzi.zzl(zzdciVarZza.zze());
        zzcwwVarZzi.zzm(zzdizVarZza);
        zzcwwVarZzi.zzd(zzdofVarZza);
        zzcwwVarZzi.zzk(new zzerq(null));
        zzcwwVarZzi.zzg(new zzcxs(zzdgaVarZzb, null));
        zzcwwVarZzi.zze(new zzcvp(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeH)).booleanValue()) {
            zzcwwVarZzi.zzf(zzepu.zza(zzeplVar));
        }
        zzcyd zzcydVarZzd = zzcwwVarZzi.zzh().zzd();
        zzinh.zzb(zzcydVarZzd);
        return zzcydVarZzd;
    }
}
