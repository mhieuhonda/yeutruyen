package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhlu {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzhlu() {
    }

    public final zzhlu zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final zzhlv zzb() {
        return new zzhlv(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    /* synthetic */ zzhlu(byte[] bArr) {
    }
}
