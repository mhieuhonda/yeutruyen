package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbir implements zzbln {
    final /* synthetic */ SharedPreferences zza;

    zzbir(zzbiv zzbivVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
        Objects.requireNonNull(zzbivVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final Boolean zza(String str, boolean z) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final Long zzb(String str, long j) {
        try {
            return Long.valueOf(this.zza.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final Double zzc(String str, double d) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
