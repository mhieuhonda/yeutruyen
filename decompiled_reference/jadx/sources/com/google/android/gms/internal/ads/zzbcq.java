package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcq extends zzbdm {
    private final long zzh;

    public zzbcq(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, long j, int i, int i2) {
        super(zzbbzVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", zzaxtVar, i, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzac(jLongValue);
            long j = this.zzh;
            if (j != 0) {
                zzaxtVar.zzk(jLongValue - j);
                zzaxtVar.zzn(j);
            }
        }
    }
}
