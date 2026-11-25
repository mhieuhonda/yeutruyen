package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhes {
    public static final zzhes zza = new zzhes("UNKNOWN_KEYMATERIAL");
    public static final zzhes zzb = new zzhes("SYMMETRIC");
    public static final zzhes zzc = new zzhes("ASYMMETRIC_PRIVATE");
    public static final zzhes zzd = new zzhes("ASYMMETRIC_PUBLIC");
    public static final zzhes zze = new zzhes("REMOTE");
    private final String zzf;

    private zzhes(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
