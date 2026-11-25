package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegi extends zzcba {
    final /* synthetic */ zzegk zza;

    protected zzegi(zzegk zzegkVar) {
        Objects.requireNonNull(zzegkVar);
        this.zza = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzegk zzegkVar = this.zza;
        zzegkVar.zza.zzc(new zzeha(autoCloseInputStream, zzegkVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcbk zzcbkVar) {
        this.zza.zza.zzc(new zzeha(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbkVar));
    }
}
