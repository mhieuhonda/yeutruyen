package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgit extends zzgji {
    private final Context zza;

    zzgit(zzaxt zzaxtVar, zzgie zzgieVar, Context context, zzgqo zzgqoVar) {
        super("oMAI9M+rfpAXD2NxGp+nC5qJwKDENlbYG7lXxNGFquSBEXZr9ZbCp8YKXYADPdQS", "GTycQamaBLKET6mxwzojHIa3a0Qk/f4p0jfnV7pjl+o=", zzaxtVar, zzgieVar, zzgqoVar.zza(115));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    protected final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxtVar) {
            zzaxtVar.zzO(((Integer) objArr2[0]).intValue());
            int i = 1;
            zzaxtVar.zzd(((Integer) objArr2[1]).intValue());
            zzaxtVar.zze(((Integer) objArr2[2]).intValue());
            zzaxtVar.zzab(((Integer) objArr2[3]).intValue());
            Boolean bool = (Boolean) objArr2[4];
            if (bool == null) {
                zzaxtVar.zzaf(3);
            } else {
                zzaxtVar.zzaf(true != bool.booleanValue() ? 1 : 2);
            }
            Boolean bool2 = (Boolean) objArr2[5];
            if (bool2 == null) {
                zzaxtVar.zzae(3);
            } else {
                if (true == bool2.booleanValue()) {
                    i = 2;
                }
                zzaxtVar.zzae(i);
            }
        }
    }
}
