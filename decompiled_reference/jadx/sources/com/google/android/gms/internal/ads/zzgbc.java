package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbc {
    public static Object zza(String str, String str2, zzgbb... zzgbbVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return Class.forName(str).getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
    }
}
