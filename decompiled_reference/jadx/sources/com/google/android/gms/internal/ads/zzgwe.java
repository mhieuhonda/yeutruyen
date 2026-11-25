package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgwe extends zzgwg {
    zzgwe() {
        super(null);
    }

    static final zzgwg zzf(int i) {
        if (i < 0) {
            return zzgwg.zzb;
        }
        return i > 0 ? zzgwg.zzc : zzgwg.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final zzgwg zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final zzgwg zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final zzgwg zzc(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final zzgwg zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final int zze() {
        return 0;
    }
}
