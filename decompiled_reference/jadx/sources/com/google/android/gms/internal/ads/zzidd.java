package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzidd extends zzide {
    final /* synthetic */ zzidl zza;
    private int zzb;
    private final int zzc;

    zzidd(zzidl zzidlVar) {
        Objects.requireNonNull(zzidlVar);
        this.zza = zzidlVar;
        this.zzb = 0;
        this.zzc = zzidlVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzidg
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zza(i);
    }
}
