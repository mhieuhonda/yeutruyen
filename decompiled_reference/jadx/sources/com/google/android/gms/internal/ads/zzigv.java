package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzigv implements Iterator {
    final /* synthetic */ zzigx zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzigv(zzigx zzigxVar, byte[] bArr) {
        Objects.requireNonNull(zzigxVar);
        this.zza = zzigxVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzigx zzigxVar = this.zza;
        if (i >= zzigxVar.zzj()) {
            return !zzigxVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzigx zzigxVar = this.zza;
        return i < zzigxVar.zzj() ? (zzigu) zzigxVar.zzi()[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzigx zzigxVar = this.zza;
        zzigxVar.zzh();
        int i = this.zzb;
        if (i >= zzigxVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzigxVar.zzg(i);
        }
    }
}
