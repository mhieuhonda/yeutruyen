package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgil extends zzgji {
    private final Activity zza;
    private final View zzb;

    zzgil(zzaxt zzaxtVar, zzgie zzgieVar, View view, Activity activity, zzgqo zzgqoVar) {
        super("MB4NRPoKbszEsZs50F7mJwzu+33Ub7A+OagrfmieGdBjZs38LvzcQgcwQTLr3PB3", "U7Z7WtTc2NEgeomO+YkeOiOPYLQ8ra19osxSo/kBqLE=", zzaxtVar, zzgieVar, zzgqoVar.zza(111));
        this.zzb = view;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    protected final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zzb, this.zza);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxtVar) {
            zzaxtVar.zzS(((Long) objArr2[0]).longValue());
            zzaxtVar.zzT(((Long) objArr2[1]).longValue());
            zzaxtVar.zzU((String) objArr2[2]);
        }
    }
}
