package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdd extends zzbdm {
    private final boolean zzh;

    public zzbdd(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2) {
        super(zzbbzVar, "NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", zzaxtVar, i, 61);
        this.zzh = zzbbzVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))).longValue();
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzQ(jLongValue);
        }
    }
}
