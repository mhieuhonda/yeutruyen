package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzgvw implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgwa zze;

    /* synthetic */ zzgvw(zzgwa zzgwaVar, byte[] bArr) {
        Objects.requireNonNull(zzgwaVar);
        this.zze = zzgwaVar;
        this.zzb = zzgwaVar.zzs();
        this.zzc = zzgwaVar.zzf();
        this.zzd = -1;
    }

    private final void zzb() {
        if (this.zze.zzs() != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        Object objZza = zza(i);
        this.zzc = this.zze.zzg(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzgtr.zzj(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zzgwa zzgwaVar = this.zze;
        zzgwaVar.remove(zzgwaVar.zzo(i));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i);
}
