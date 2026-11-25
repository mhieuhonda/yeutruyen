package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzghk implements zzimz {
    private final zzini zza;

    private zzghk(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzghk zza(zzini zziniVar) {
        return new zzghk(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.zza.zzb()).getResources().getDisplayMetrics();
        zzinh.zzb(displayMetrics);
        return displayMetrics;
    }
}
