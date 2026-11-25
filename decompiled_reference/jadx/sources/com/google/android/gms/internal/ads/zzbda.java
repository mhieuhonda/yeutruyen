package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbda extends zzbdm {
    public zzbda(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2) {
        super(zzbbzVar, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", zzaxtVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzbbf zzbbfVar = new zzbbf((String) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdU)).booleanValue())));
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzc(zzbbfVar.zza);
            zzaxtVar.zzP(zzbbfVar.zzb);
        }
    }
}
