package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzu {
    private final zzdp zza = zzdp.zza;

    protected final zzzv zza(zzbg zzbgVar, int[] iArr, int i, zzabr zzabrVar, zzgwt zzgwtVar) {
        return new zzzv(zzbgVar, iArr, 0, zzabrVar, WorkRequest.MIN_BACKOFF_MILLIS, 25000L, 25000L, 1279, 719, 0.7f, 0.75f, zzgwtVar, this.zza);
    }
}
