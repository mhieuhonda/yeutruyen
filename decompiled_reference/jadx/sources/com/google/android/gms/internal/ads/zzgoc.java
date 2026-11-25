package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgoc implements zzimz {
    private final zzini zza;

    private zzgoc(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzgoc zza(zzini zziniVar) {
        return new zzgoc(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pmtd");
    }
}
