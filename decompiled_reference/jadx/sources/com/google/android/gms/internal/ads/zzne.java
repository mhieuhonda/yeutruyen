package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzne {
    static boolean zzad(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    String zzV();

    int zza();

    int zzae(zzv zzvVar) throws zzjm;

    int zzu() throws zzjm;

    default void zzv(zznd zzndVar) {
    }

    default void zzw() {
    }
}
