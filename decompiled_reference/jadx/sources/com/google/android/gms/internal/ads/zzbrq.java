package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbrq extends zzbrn {
    final /* synthetic */ zzcgd zza;

    zzbrq(zzbrr zzbrrVar, zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
        Objects.requireNonNull(zzbrrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}
