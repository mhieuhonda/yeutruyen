package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbk {
    private final zzgbg zza;

    public final /* synthetic */ zzgbi zza() {
        zziep zziepVarZzbu = this.zza.zzbu();
        Intrinsics.checkNotNullExpressionValue(zziepVarZzbu, "build(...)");
        return (zzgbi) zziepVarZzbu;
    }

    public final /* synthetic */ zziht zzb() {
        Map mapZzb = this.zza.zzb();
        Intrinsics.checkNotNullExpressionValue(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziht(mapZzb);
    }

    public final void zzc(zziht zzihtVar, String key, zzgbe value) {
        Intrinsics.checkNotNullParameter(zzihtVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zziht zzihtVar, String key) {
        Intrinsics.checkNotNullParameter(zzihtVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.zza(key);
    }
}
