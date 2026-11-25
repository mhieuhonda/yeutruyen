package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzmq implements zzmi {
    public final zzxg zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzmq(zzxn zzxnVar, boolean z) {
        this.zza = new zzxg(zzxnVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final zzbf zzb() {
        return this.zza.zzA();
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
