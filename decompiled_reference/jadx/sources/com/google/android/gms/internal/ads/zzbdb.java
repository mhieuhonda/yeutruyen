package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdb extends zzbdm {
    public zzbdb(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2) {
        super(zzbbzVar, "sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", zzaxtVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzaxt zzaxtVar = this.zzd;
            int i = 1;
            if (true == zBooleanValue) {
                i = 2;
            }
            zzaxtVar.zzah(i);
        } catch (InvocationTargetException unused) {
            this.zzd.zzah(3);
        }
    }
}
