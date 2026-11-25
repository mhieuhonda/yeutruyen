package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgjf extends zzgji {
    private static final Long zza = -1L;
    private final zzgen zzb;
    private final Context zzc;
    private final Map zzd;

    zzgjf(zzaxt zzaxtVar, zzgie zzgieVar, zzgen zzgenVar, Context context, Map map, zzgqo zzgqoVar) {
        super("3At8eFbAjAqsz9p03G/poStdLmldcsHDf7hwtHq+b9glp6N8klzSrT8HZ4GJjVN5", "mjdtNA0QQNNvx7gc0+BIhw0NZpaH3AMuijVtb9zt66I=", zzaxtVar, zzgieVar, zzgqoVar.zza(121));
        this.zzb = zzgenVar;
        this.zzc = context;
        this.zzd = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    protected final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        zzgen zzgenVar = this.zzb;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(zzgenVar.ordinal()), this.zzc, zzgto.zza(this.zzd.get("up"), true));
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzaxtVar) {
            if (zzgenVar == zzgen.QUERY) {
                Object obj = objArr2[0];
                Long l = zza;
                zzaxtVar.zzq(((Long) zzgto.zza(obj, l)).longValue());
                zzaxtVar.zzr(((Long) zzgto.zza(objArr2[1], l)).longValue());
            }
            zzaxtVar.zzg(((Long) objArr2[2]).longValue());
            zzaxtVar.zzQ(((Long) objArr2[3]).longValue());
        }
    }
}
