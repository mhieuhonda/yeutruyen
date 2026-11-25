package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgxi extends zzgur {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzgts zzb;

    zzgxi(Iterator it, zzgts zzgtsVar) {
        this.zza = it;
        this.zzb = zzgtsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgur
    protected final Object zza() {
        zzgts zzgtsVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgtsVar = this.zzb;
            next = it.next();
        } while (!zzgtsVar.zza(next));
        return next;
    }
}
