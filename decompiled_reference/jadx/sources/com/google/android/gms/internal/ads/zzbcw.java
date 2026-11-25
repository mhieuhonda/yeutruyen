package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcw extends zzbdm {
    private final zzbbr zzh;

    public zzbcw(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2, zzbbr zzbbrVar) {
        super(zzbbzVar, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", zzaxtVar, i, 94);
        this.zzh = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zzb())).intValue();
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzaj(zzayh.zza(iIntValue));
        }
    }
}
