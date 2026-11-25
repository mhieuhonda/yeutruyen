package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhvc {
    public static final zzhvc zza = new zzhvc("SHA256");
    public static final zzhvc zzb = new zzhvc("SHA384");
    public static final zzhvc zzc = new zzhvc("SHA512");
    private final String zzd;

    private zzhvc(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
