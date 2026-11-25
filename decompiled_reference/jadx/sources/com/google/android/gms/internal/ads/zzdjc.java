package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdjc implements zzimz {
    private final zzdiz zza;

    private zzdjc(zzdiz zzdizVar) {
        this.zza = zzdizVar;
    }

    public static zzdjc zza(zzdiz zzdizVar) {
        return new zzdjc(zzdizVar);
    }

    public static Set zzc(zzdiz zzdizVar) {
        Set setEmptySet = Collections.emptySet();
        zzinh.zzb(setEmptySet);
        return setEmptySet;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
