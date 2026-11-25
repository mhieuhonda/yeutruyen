package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zziez extends AbstractList {
    private final zziex zza;
    private final zziey zzb;

    public zziez(zziex zziexVar, zziey zzieyVar) {
        this.zza = zziexVar;
        this.zzb = zzieyVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.zzb.zzb(this.zza.zzf(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
