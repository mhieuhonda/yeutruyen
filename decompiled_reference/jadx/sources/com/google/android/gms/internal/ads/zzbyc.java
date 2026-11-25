package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbyc implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbye zza;

    zzbyc(zzbye zzbyeVar) {
        Objects.requireNonNull(zzbyeVar);
        this.zza = zzbyeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbye zzbyeVar = this.zza;
        Intent intentZzb = zzbyeVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzY(zzbyeVar.zzc(), intentZzb);
    }
}
