package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaib implements zzahs {
    public final String zza;

    private zzaib(String str) {
        this.zza = str;
    }

    public static zzaib zzb(zzeu zzeuVar) {
        return new zzaib(zzeuVar.zzK(zzeuVar.zzd(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return 1852994675;
    }
}
