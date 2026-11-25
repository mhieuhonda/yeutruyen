package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzigp implements Iterator {
    private final ArrayDeque zza;
    private zzidi zzb;

    /* synthetic */ zzigp(zzidl zzidlVar, byte[] bArr) {
        if (!(zzidlVar instanceof zzigq)) {
            this.zza = null;
            this.zzb = (zzidi) zzidlVar;
            return;
        }
        zzigq zzigqVar = (zzigq) zzidlVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzigqVar.zzp());
        this.zza = arrayDeque;
        arrayDeque.push(zzigqVar);
        this.zzb = zzb(zzigqVar.zzo());
    }

    private final zzidi zzb(zzidl zzidlVar) {
        while (zzidlVar instanceof zzigq) {
            zzigq zzigqVar = (zzigq) zzidlVar;
            this.zza.push(zzigqVar);
            zzidlVar = zzigqVar.zzo();
        }
        return (zzidi) zzidlVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzidi next() {
        zzidi zzidiVarZzb;
        zzidi zzidiVar = this.zzb;
        if (zzidiVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzidiVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzidiVarZzb = zzb(((zzigq) arrayDeque.pop()).zzF());
        } while (zzidiVarZzb.zzs());
        this.zzb = zzidiVarZzb;
        return zzidiVar;
    }
}
