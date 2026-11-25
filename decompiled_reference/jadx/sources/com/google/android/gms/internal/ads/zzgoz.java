package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgoz implements zzimz {
    private final zzini zza;

    private zzgoz(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzgoz zza(zzini zziniVar) {
        return new zzgoz(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "ocs"), "pmtd");
    }
}
