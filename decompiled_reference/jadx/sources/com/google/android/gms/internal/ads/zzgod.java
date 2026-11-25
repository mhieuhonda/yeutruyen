package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgod implements zzimz {
    private final zzini zza;

    private zzgod(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzgod zza(zzini zziniVar) {
        return new zzgod(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File(new File((File) this.zza.zzb(), "drgd"), "v"), "pcopt");
    }
}
