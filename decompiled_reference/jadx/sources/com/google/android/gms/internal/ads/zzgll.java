package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgll {
    private final File zza;
    private final zzfxl zzb;
    private final zzgqo zzc;

    public zzgll(File file, zzfxl zzfxlVar, zzgqo zzgqoVar) {
        this.zza = file;
        this.zzb = zzfxlVar;
        this.zzc = zzgqoVar;
    }

    public final boolean zza(byte[] bArr) {
        boolean zZza;
        try {
            File file = this.zza;
            zzhaa.zzb(file);
            zzhaa.zza(bArr, file);
            zZza = this.zzb.zza(file);
        } catch (IOException | GeneralSecurityException e) {
            this.zzc.zzd(2027, e);
            zZza = false;
        }
        try {
            this.zza.delete();
        } catch (SecurityException unused) {
        }
        return zZza;
    }
}
