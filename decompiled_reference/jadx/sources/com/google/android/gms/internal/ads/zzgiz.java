package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgiz extends zzgji {
    private final Map zza;

    zzgiz(zzaxt zzaxtVar, zzgie zzgieVar, Map map, zzgqo zzgqoVar) {
        super("YG+UUJxJEVSGG6jfg3qjLnMxlQFUVyMMjgzEbZMK/+kyZ0C5+m/L80+lYQbH4OQO", "6dR3aiNoBR9E5efHnflEq0hfvoZwKGjGgWyKk1r6EjY=", zzaxtVar, zzgieVar, zzgqoVar.zza(118));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    protected final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxtVar) {
            zzaxtVar.zzf(((Long) objArr2[0]).longValue());
            long jLongValue = ((Long) objArr2[1]).longValue();
            if (jLongValue >= 0) {
                zzaxtVar.zzW(jLongValue);
            }
            long jLongValue2 = ((Long) objArr2[2]).longValue();
            if (jLongValue2 >= 0) {
                zzaxtVar.zzX(jLongValue2);
            }
        }
    }
}
