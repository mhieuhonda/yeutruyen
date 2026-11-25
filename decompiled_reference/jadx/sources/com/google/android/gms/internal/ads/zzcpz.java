package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcpz implements zzfit {
    final zzini zza;
    final zzini zzb;
    final zzini zzc;
    final zzini zzd;
    final zzini zze;
    final zzini zzf;
    final zzini zzg;
    private final zzcpe zzh;

    zzcpz(zzcpe zzcpeVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzcpeVar;
        zzimz zzimzVarZza = zzina.zza(context);
        this.zza = zzimzVarZza;
        zzimz zzimzVarZza2 = zzina.zza(zzrVar);
        this.zzb = zzimzVarZza2;
        zzimz zzimzVarZza3 = zzina.zza(str);
        this.zzc = zzimzVarZza3;
        zzini zziniVar = zzcpeVar.zzp;
        zzini zziniVarZza = zzimy.zza(zzetl.zza(zziniVar));
        this.zzd = zziniVarZza;
        zzini zziniVarZza2 = zzimy.zza(zzfjs.zza(zzcpeVar.zzby));
        this.zze = zziniVarZza2;
        zzini zziniVarZza3 = zzimy.zza(zzfir.zza(zzimzVarZza, zzcpeVar.zza, zzcpeVar.zzaf, zziniVarZza, zziniVarZza2, zzfli.zza()));
        this.zzf = zziniVarZza3;
        this.zzg = zzimy.zza(zzett.zza(zzimzVarZza, zzimzVarZza2, zzimzVarZza3, zziniVarZza3, zziniVarZza, zziniVarZza2, zzcpeVar.zzi, zzcpeVar.zzai, zziniVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final zzets zza() {
        return (zzets) this.zzg.zzb();
    }
}
