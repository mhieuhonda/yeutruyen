package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzamu implements zzahd {
    final /* synthetic */ zzamv zza;

    /* synthetic */ zzamu(zzamv zzamvVar, byte[] bArr) {
        Objects.requireNonNull(zzamvVar);
        this.zza = zzamvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        zzamv zzamvVar = this.zza;
        return zzamvVar.zzf().zzh(zzamvVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        zzamv zzamvVar = this.zza;
        long jZzd = zzamvVar.zzd() + BigInteger.valueOf(zzamvVar.zzf().zzi(j)).multiply(BigInteger.valueOf(zzamvVar.zze() - zzamvVar.zzd())).divide(BigInteger.valueOf(zzamvVar.zzg())).longValue();
        String str = zzfm.zza;
        zzahe zzaheVar = new zzahe(j, Math.max(zzamvVar.zzd(), Math.min(jZzd - 30000, zzamvVar.zze() - 1)));
        return new zzahb(zzaheVar, zzaheVar);
    }
}
