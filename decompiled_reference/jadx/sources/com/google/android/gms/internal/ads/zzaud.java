package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaud implements zzaug {
    final /* synthetic */ File zza;

    zzaud(zzauh zzauhVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzauhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final File zza() {
        return this.zza;
    }
}
