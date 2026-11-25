package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzmz extends zzwz {
    private final zzbe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmz(zzna zznaVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zznaVar);
        this.zzc = new zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i, zzbd zzbdVar, boolean z) {
        zzbf zzbfVar = this.zzb;
        zzbd zzbdVarZzd = zzbfVar.zzd(i, zzbdVar, z);
        if (!zzbfVar.zzb(zzbdVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzbdVarZzd.zzf = true;
            return zzbdVarZzd;
        }
        Object obj = zzbdVar.zza;
        Object obj2 = zzbdVar.zzb;
        int i2 = zzbdVar.zzc;
        long j = zzbdVar.zzd;
        long j2 = zzbdVar.zze;
        zzc zzcVar = zzc.zza;
        boolean z2 = zzbdVar.zzh;
        zzbdVarZzd.zza(obj, obj2, i2, j, 0L, zzcVar, true, false);
        return zzbdVarZzd;
    }
}
