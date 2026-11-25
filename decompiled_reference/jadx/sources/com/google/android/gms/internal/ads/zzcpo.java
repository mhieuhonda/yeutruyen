package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcpo implements zzfhd {
    final zzini zza;
    final zzini zzb;
    final zzini zzc;
    final zzini zzd;
    final zzini zze;
    final zzini zzf;
    private final Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final String zzi;
    private final zzcpe zzj;

    zzcpo(zzcpe zzcpeVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzcpeVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        zzimz zzimzVarZza = zzina.zza(context);
        this.zza = zzimzVarZza;
        zzimz zzimzVarZza2 = zzina.zza(zzrVar);
        this.zzb = zzimzVarZza2;
        zzini zziniVarZza = zzimy.zza(zzetl.zza(zzcpeVar.zzp));
        this.zzc = zziniVarZza;
        zzini zziniVarZza2 = zzimy.zza(zzetq.zza());
        this.zzd = zziniVarZza2;
        zzini zziniVarZza3 = zzimy.zza(zzdih.zza());
        this.zze = zziniVarZza3;
        this.zzf = zzimy.zza(zzfhb.zza(zzimzVarZza, zzcpeVar.zza, zzimzVarZza2, zzcpeVar.zzaf, zziniVarZza, zziniVarZza2, zzfli.zza(), zziniVarZza3));
    }

    @Override // com.google.android.gms.internal.ads.zzfhd
    public final zzeso zza() {
        zzfha zzfhaVar = (zzfha) this.zzf.zzb();
        zzetk zzetkVar = (zzetk) this.zzc.zzb();
        zzcpe zzcpeVar = this.zzj;
        zzini zziniVar = zzcpeVar.zzp;
        return new zzeso(this.zzg, this.zzh, this.zzi, zzfhaVar, zzetkVar, zzcop.zzd(zzcpeVar.zzI()), (zzdzt) zziniVar.zzb());
    }
}
