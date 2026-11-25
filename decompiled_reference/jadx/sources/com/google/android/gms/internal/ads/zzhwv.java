package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhwv {
    public static final zzhwv zza = new zzhwv("SHA256");
    public static final zzhwv zzb = new zzhwv("SHA384");
    public static final zzhwv zzc = new zzhwv("SHA512");
    private final String zzd;

    private zzhwv(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
