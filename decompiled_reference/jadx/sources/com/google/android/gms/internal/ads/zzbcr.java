package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcr extends zzbdm {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzbcr(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2) {
        super(zzbbzVar, "iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", zzaxtVar, i, 82);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (String) this.zze.invoke(null, new Object[0]);
                }
            }
        }
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzV(zzh);
        }
    }
}
