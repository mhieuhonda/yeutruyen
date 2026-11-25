package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzimr {
    public static zzimr zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzimm(cls.getSimpleName()) : new zzimo(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
