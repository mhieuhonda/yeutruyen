package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhlm {
    final zzhln zza;
    final long[] zzb;

    zzhlm() {
        this(new zzhln(), new long[10]);
    }

    zzhlm(zzhln zzhlnVar, long[] jArr) {
        this.zza = zzhlnVar;
        this.zzb = jArr;
    }

    zzhlm(zzhlm zzhlmVar) {
        this.zza = new zzhln(zzhlmVar.zza);
        this.zzb = Arrays.copyOf(zzhlmVar.zzb, 10);
    }
}
