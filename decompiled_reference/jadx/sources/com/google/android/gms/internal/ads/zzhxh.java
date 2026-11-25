package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhxh {
    public static final zzhxh zza = new zzhxh("SHA256");
    public static final zzhxh zzb = new zzhxh("SHA384");
    public static final zzhxh zzc = new zzhxh("SHA512");
    private final String zzd;

    private zzhxh(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
