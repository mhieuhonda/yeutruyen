package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzean implements zzimz {
    private final zzini zza;

    private zzean(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzean zza(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        return new zzean(zzeaiVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZze = zzeai.zze((zzeas) this.zza.zzb(), zzfoi.zzc());
        zzinh.zzb(setZze);
        return setZze;
    }
}
