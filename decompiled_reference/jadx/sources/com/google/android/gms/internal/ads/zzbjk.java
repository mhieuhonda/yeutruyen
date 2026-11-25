package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbjk {
    private final Map zza = new HashMap();
    private final zzbjm zzb;

    public zzbjk(zzbjm zzbjmVar) {
        this.zzb = zzbjmVar;
    }

    public final void zza(String str, zzbjj zzbjjVar) {
        this.zza.put(str, zzbjjVar);
    }

    public final void zzb(String str, String str2, long j) {
        Map map = this.zza;
        zzbjj zzbjjVar = (zzbjj) map.get(str2);
        String[] strArr = {str};
        if (zzbjjVar != null) {
            this.zzb.zzb(zzbjjVar, j, strArr);
        }
        map.put(str, new zzbjj(j, null, null));
    }

    public final zzbjm zzc() {
        return this.zzb;
    }
}
