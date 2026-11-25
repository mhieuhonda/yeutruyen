package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhpe {
    public static final zzhpe zza = new zzhpe("SHA1");
    public static final zzhpe zzb = new zzhpe("SHA224");
    public static final zzhpe zzc = new zzhpe("SHA256");
    public static final zzhpe zzd = new zzhpe("SHA384");
    public static final zzhpe zze = new zzhpe("SHA512");
    private final String zzf;

    private zzhpe(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
