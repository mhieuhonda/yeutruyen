package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdf extends zzbdm {
    public zzbdf(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2) {
        super(zzbbzVar, "Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", zzaxtVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzbbu zzbbuVar = new zzbbu((String) this.zze.invoke(null, new Object[0]));
            zzaxtVar.zzF(zzbbuVar.zza.longValue());
            zzaxtVar.zzG(zzbbuVar.zzb.longValue());
        }
    }
}
