package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbg extends zziej implements zziga {
    private zzgbg() {
        throw null;
    }

    /* synthetic */ zzgbg(byte[] bArr) {
        super(zzgbi.zzb);
    }

    public final zzgbg zza(String str) {
        str.getClass();
        zzbg();
        ((zzgbi) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(((zzgbi) this.zza).zzb());
    }

    public final zzgbg zzc(String str, zzgbe zzgbeVar) {
        str.getClass();
        zzgbeVar.getClass();
        zzbg();
        ((zzgbi) this.zza).zze().put(str, zzgbeVar);
        return this;
    }
}
