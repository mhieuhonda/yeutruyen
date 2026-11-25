package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfwu {
    private final zzfvv zza;
    private final ArrayList zzb;

    public zzfwu(zzfvv zzfvvVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfvvVar;
        arrayList.add(str);
    }

    public final void zza(String str) {
        this.zzb.add(str);
    }

    public final zzfvv zzb() {
        return this.zza;
    }

    public final ArrayList zzc() {
        return this.zzb;
    }
}
