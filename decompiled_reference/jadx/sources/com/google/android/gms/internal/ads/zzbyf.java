package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbyf implements View.OnClickListener {
    final /* synthetic */ zzbyh zza;

    zzbyf(zzbyh zzbyhVar) {
        Objects.requireNonNull(zzbyhVar);
        this.zza = zzbyhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
