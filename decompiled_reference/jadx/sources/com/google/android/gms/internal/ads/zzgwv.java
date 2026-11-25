package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgwv {
    Object[] zza;
    int zzb;
    zzgwu zzc;

    public zzgwv() {
        this(4);
    }

    private final void zze(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzgwo.zze(length, i2));
        }
    }

    private final zzgww zzf(boolean z) {
        zzgwu zzgwuVar;
        zzgwu zzgwuVar2;
        if (z && (zzgwuVar2 = this.zzc) != null) {
            throw zzgwuVar2.zza();
        }
        zzgyt zzgytVarZzk = zzgyt.zzk(this.zzb, this.zza, this);
        if (!z || (zzgwuVar = this.zzc) == null) {
            return zzgytVarZzk;
        }
        throw zzgwuVar.zza();
    }

    public final zzgwv zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzgvp.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    public final zzgwv zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgww zzc() {
        return zzf(true);
    }

    public final zzgww zzd() {
        return zzf(false);
    }

    zzgwv(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
