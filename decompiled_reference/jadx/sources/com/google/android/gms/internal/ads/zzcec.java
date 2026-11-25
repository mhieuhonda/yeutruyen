package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcec extends zzceh {
    final zzini zza;
    final zzini zzb;
    final zzini zzc;
    final zzini zzd;
    final zzini zze;
    final zzini zzf;
    final zzini zzg;
    final zzini zzh;
    private final Clock zzj;

    zzcec(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzceg zzcegVar) {
        this.zzj = clock;
        zzimz zzimzVarZza = zzina.zza(context);
        this.zza = zzimzVarZza;
        zzimz zzimzVarZza2 = zzina.zza(zzgVar);
        this.zzb = zzimzVarZza2;
        this.zzc = zzimy.zza(zzcdw.zza(zzimzVarZza, zzimzVarZza2));
        zzimz zzimzVarZza3 = zzina.zza(clock);
        this.zzd = zzimzVarZza3;
        zzimz zzimzVarZza4 = zzina.zza(zzcegVar);
        this.zze = zzimzVarZza4;
        zzini zziniVarZza = zzimy.zza(zzcdy.zza(zzimzVarZza3, zzimzVarZza2, zzimzVarZza4));
        this.zzf = zziniVarZza;
        zzcea zzceaVarZzc = zzcea.zzc(zzimzVarZza3, zziniVarZza);
        this.zzg = zzceaVarZzc;
        this.zzh = zzimy.zza(zzcen.zza(zzimzVarZza, zzceaVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzceh
    final zzcdz zza() {
        return new zzcdz(this.zzj, (zzcdx) this.zzf.zzb());
    }
}
