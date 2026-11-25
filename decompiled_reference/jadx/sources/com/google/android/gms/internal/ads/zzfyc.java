package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfyc implements zzfyf {
    private static final zzayt zza;

    static {
        zzaxt zzaxtVarZzj = zzayt.zzj();
        zzaxtVarZzj.zzo(ExifInterface.LONGITUDE_EAST);
        zza = (zzayt) zzaxtVarZzj.zzbu();
    }

    zzfyc() {
    }

    @Override // com.google.android.gms.internal.ads.zzfyf
    public final zzayt zza() {
        return zza;
    }
}
