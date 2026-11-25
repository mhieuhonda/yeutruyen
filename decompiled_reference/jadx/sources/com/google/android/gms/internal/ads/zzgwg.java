package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgwg {
    private static final zzgwg zza = new zzgwe();
    private static final zzgwg zzb = new zzgwf(-1);
    private static final zzgwg zzc = new zzgwf(1);

    /* synthetic */ zzgwg(byte[] bArr) {
    }

    public static zzgwg zzg() {
        return zza;
    }

    public abstract zzgwg zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgwg zzb(int i, int i2);

    public abstract zzgwg zzc(boolean z, boolean z2);

    public abstract zzgwg zzd(boolean z, boolean z2);

    public abstract int zze();
}
