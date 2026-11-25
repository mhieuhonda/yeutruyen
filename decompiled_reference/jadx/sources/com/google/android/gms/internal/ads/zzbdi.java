package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdi extends zzbdm {
    public zzbdi(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2) {
        super(zzbbzVar, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", zzaxtVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaxt zzaxtVar = this.zzd;
        zzaxtVar.zzae(3);
        boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzaxtVar) {
            try {
                if (zBooleanValue) {
                    zzaxtVar.zzae(2);
                } else {
                    zzaxtVar.zzae(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
