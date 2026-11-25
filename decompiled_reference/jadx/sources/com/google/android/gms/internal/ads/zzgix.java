package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgix extends zzgji {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    zzgix(zzaxt zzaxtVar, zzgie zzgieVar, zzgqo zzgqoVar) {
        super("yqnoA3qkrpGdV0UDHfD7DkNdKz4CD4Omw8LwQ+mqDfnJnY5wPxLFUyGI2UEZc+9I", "QVM5zcLU6Zl19Cag2KVJanZ3HUWi7v3pEqNBU6r5voo=", zzaxtVar, zzgieVar, zzgqoVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    protected final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    Long l = (Long) method.invoke("", new Object[0]);
                    if (l == null) {
                        throw null;
                    }
                    zza = l;
                }
            }
        }
        synchronized (zzaxtVar) {
            if (zza != null) {
                zzaxtVar.zzm(zza.longValue());
            }
        }
    }
}
