package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbyd implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbye zza;

    zzbyd(zzbye zzbyeVar) {
        Objects.requireNonNull(zzbyeVar);
        this.zza = zzbyeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
