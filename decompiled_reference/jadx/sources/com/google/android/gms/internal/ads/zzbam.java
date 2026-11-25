package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbam implements zzfzg {
    final /* synthetic */ zzfxl zza;

    zzbam(zzbao zzbaoVar, zzfxl zzfxlVar) {
        this.zza = zzfxlVar;
        Objects.requireNonNull(zzbaoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
