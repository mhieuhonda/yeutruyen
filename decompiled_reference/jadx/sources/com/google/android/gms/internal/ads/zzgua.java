package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgua implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzgug zzb;

    zzgua(zzgug zzgugVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzgugVar);
        this.zzb = zzgugVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzgtl.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
