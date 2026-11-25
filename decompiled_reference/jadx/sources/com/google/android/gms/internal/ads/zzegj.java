package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegj extends zzcba {
    private final zzcgd zza;
    private final zzcbk zzb;

    zzegj(zzcgd zzcgdVar, zzcbk zzcbkVar) {
        this.zza = zzcgdVar;
        this.zzb = zzcbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzeha(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcbk zzcbkVar) {
        this.zza.zzc(new zzeha(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbkVar));
    }
}
