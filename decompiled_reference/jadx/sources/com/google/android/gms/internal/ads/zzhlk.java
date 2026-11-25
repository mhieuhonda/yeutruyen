package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzhlk {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    zzhlk() {
        this(new long[10], new long[10], new long[10]);
    }

    zzhlk(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    void zza(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    final void zzb(zzhlk zzhlkVar, int i) {
        zzhlj.zza(this.zza, zzhlkVar.zza, i);
        zzhlj.zza(this.zzb, zzhlkVar.zzb, i);
        zzhlj.zza(this.zzc, zzhlkVar.zzc, i);
    }

    zzhlk(zzhlk zzhlkVar) {
        this.zza = Arrays.copyOf(zzhlkVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhlkVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhlkVar.zzc, 10);
    }
}
