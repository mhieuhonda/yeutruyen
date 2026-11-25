package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgir extends zzgji {
    zzgir(zzaxt zzaxtVar, zzgie zzgieVar, zzgqo zzgqoVar) {
        super("StEAvb/iigDIlQhq4PghExfp73gHg8IUtO74V2AuLhqk3CKzmFDPWKX0qTLgtCrl", "a0akqO7gmy+q2qeS0xD9lQHxt87lQ1nAIIevL4sq6Y8=", zzaxtVar, zzgieVar, zzgqoVar.zza(114));
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    protected final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzaxtVar) {
            zzaxtVar.zza(ExifInterface.LONGITUDE_EAST);
            zzaxtVar.zzB(0L);
            zzaxtVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", new Object[0]);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxtVar) {
            zzaxtVar.zza((String) objArr2[0]);
            zzaxtVar.zzB(((Long) objArr2[1]).longValue());
            zzaxtVar.zzV((String) objArr2[2]);
        }
    }
}
