package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdh extends zzbdm {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbdh(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2) {
        super(zzbbzVar, "9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", zzaxtVar, i, 33);
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
            zzaxtVar.zzs(zzh.longValue());
        }
    }
}
