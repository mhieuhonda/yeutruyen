package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbyj implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbyk zza;

    zzbyj(zzbyk zzbykVar) {
        Objects.requireNonNull(zzbykVar);
        this.zza = zzbykVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
