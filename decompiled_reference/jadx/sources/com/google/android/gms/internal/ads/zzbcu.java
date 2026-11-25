package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcu extends zzbdm {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbcu(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2) {
        super(zzbbzVar, "AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", zzaxtVar, i, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (Long) this.zze.invoke(null, new Object[0]);
                }
            }
        }
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzm(zzh.longValue());
        }
    }
}
