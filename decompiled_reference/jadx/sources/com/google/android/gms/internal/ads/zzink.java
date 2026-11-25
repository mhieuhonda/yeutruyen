package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzink {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzink(int i, int i2, zzinj zzinjVar) {
        this.zza = zzimw.zza(i);
        this.zzb = zzimw.zza(i2);
    }

    public final zzink zza(zzini zziniVar) {
        this.zza.add(zziniVar);
        return this;
    }

    public final zzink zzb(zzini zziniVar) {
        this.zzb.add(zziniVar);
        return this;
    }

    public final zzinl zzc() {
        return new zzinl(this.zza, this.zzb, null);
    }
}
