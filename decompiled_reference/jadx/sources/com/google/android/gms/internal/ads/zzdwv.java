package com.google.android.gms.internal.ads;

import android.view.InputEvent;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwv {

    @Nullable
    private volatile InputEvent zza;

    public final void zza(InputEvent inputEvent) {
        this.zza = inputEvent;
    }

    @Nullable
    public final InputEvent zzb() {
        return this.zza;
    }
}
