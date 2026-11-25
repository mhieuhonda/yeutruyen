package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgyx extends zzgur {
    final Iterator zza;
    final /* synthetic */ Set zzb;
    final /* synthetic */ Set zzc;

    zzgyx(zzgyy zzgyyVar, Set set, Set set2) {
        this.zzb = set;
        this.zzc = set2;
        Objects.requireNonNull(zzgyyVar);
        this.zza = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzgur
    protected final Object zza() {
        Set set;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            set = this.zzc;
            next = it.next();
        } while (!set.contains(next));
        return next;
    }
}
