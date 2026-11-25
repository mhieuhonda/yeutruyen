package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzhbl extends zzhay.zzf {
    private static final zzhbi zzbq;
    private static final zzhcn zzbr = new zzhcn(zzhbl.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zzhbi zzhbkVar;
        byte[] bArr = null;
        try {
            zzhbkVar = new zzhbj(bArr);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzhbkVar = new zzhbk(bArr);
        }
        zzbq = zzhbkVar;
        if (th != null) {
            zzbr.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzhbl(int i) {
        this.remainingField = i;
    }

    final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbq.zza(this, null, setNewSetFromMap);
        return (Set) Objects.requireNonNull(this.seenExceptionsField);
    }

    final int zzC() {
        return zzbq.zzb(this);
    }

    abstract void zzf(Set set);
}
