package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpd implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdpd(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdpd zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdpd(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdla((Context) this.zza.zzb(), new HashSet(), ((zzcyr) this.zzb).zza());
    }
}
