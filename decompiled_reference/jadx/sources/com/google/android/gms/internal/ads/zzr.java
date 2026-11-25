package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzr {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzr zza(int i) {
        zzgtr.zzi(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzs zzb() {
        zzgtr.zzi(!this.zzb);
        this.zzb = true;
        return new zzs(this.zza, null);
    }
}
