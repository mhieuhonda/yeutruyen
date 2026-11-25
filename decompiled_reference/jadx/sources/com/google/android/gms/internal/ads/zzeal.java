package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeal implements zzimz {
    private final zzini zza;

    private zzeal(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzeal zza(zzeai zzeaiVar, zzini zziniVar, zzini zziniVar2) {
        return new zzeal(zzeaiVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzc = zzeai.zzc((zzeas) this.zza.zzb(), zzfoi.zzc());
        zzinh.zzb(setZzc);
        return setZzc;
    }
}
