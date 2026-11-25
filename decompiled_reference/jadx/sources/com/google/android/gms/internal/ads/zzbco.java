package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbco extends zzbdm {
    public zzbco(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2) {
        super(zzbbzVar, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", zzaxtVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaxt zzaxtVar = this.zzd;
        zzaxtVar.zzd(-1L);
        zzaxtVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzaxtVar) {
            zzaxtVar.zzd(iArr[0]);
            zzaxtVar.zze(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                zzaxtVar.zzO(i);
            }
        }
    }
}
