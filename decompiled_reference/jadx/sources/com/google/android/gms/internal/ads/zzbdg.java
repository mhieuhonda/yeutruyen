package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdg extends zzbdm {
    private final zzbcg zzh;
    private long zzi;

    public zzbdg(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2, zzbcg zzbcgVar) {
        super(zzbbzVar, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", zzaxtVar, i, 53);
        this.zzh = zzbcgVar;
        if (zzbcgVar != null) {
            this.zzi = zzbcgVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzH(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
