package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgiv extends zzgji {
    private final zzgdq zza;

    zzgiv(zzaxt zzaxtVar, zzgie zzgieVar, zzgdq zzgdqVar, zzgqo zzgqoVar) {
        super("4x2Hh5iTg/qW5xffP7XUVyyhNVEHgfMgXZN24VVA9KHUAzifkbImBn58u0wzbVSZ", "gKocIG5D8c3aRlaOl/4axnWoyxTZtkz2guMC88wPwLk=", zzaxtVar, zzgieVar, zzgqoVar.zza(116));
        this.zza = zzgdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    protected final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza.zzd());
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxtVar) {
            zzaxtVar.zzb((String) objArr2[0]);
            zzaxtVar.zzaa((String) objArr2[1]);
        }
    }
}
