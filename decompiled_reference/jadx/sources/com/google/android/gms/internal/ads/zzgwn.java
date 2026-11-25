package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzgwn extends zzgwo {
    Object[] zza;
    int zzb;
    boolean zzc;

    zzgwn(int i) {
        zzgvp.zzb(i, "initialCapacity");
        this.zza = new Object[i];
        this.zzb = 0;
    }

    private final void zzf(int i) {
        int length = this.zza.length;
        int iZze = zze(length, this.zzb + i);
        if (iZze > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZze);
            this.zzc = false;
        }
    }

    final void zzb(Object[] objArr, int i) {
        zzgym.zza(objArr, 2);
        zzf(2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    public final zzgwo zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size());
            if (collection instanceof zzgwp) {
                this.zzb = ((zzgwp) collection).zzg(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzd(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwo
    public /* bridge */ /* synthetic */ zzgwo zzd(Object obj) {
        throw null;
    }

    public final zzgwn zza(Object obj) {
        obj.getClass();
        zzf(1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }
}
