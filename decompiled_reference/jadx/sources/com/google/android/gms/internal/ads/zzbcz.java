package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcz extends zzbdm {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzbcz(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2) {
        super(zzbbzVar, "XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", zzaxtVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zza(ExifInterface.LONGITUDE_EAST);
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (String) this.zze.invoke(null, new Object[0]);
                }
            }
        }
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zza(zzh);
        }
    }
}
