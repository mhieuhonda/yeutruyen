package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhan {
    private long[] zza;
    private int zzb = 0;

    zzhan(int i) {
        this.zza = new long[i];
    }

    public final zzhan zza(long j) {
        int i = this.zzb;
        int i2 = i + 1;
        long[] jArr = this.zza;
        int length = jArr.length;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(jArr, i3);
        }
        long[] jArr2 = this.zza;
        int i4 = this.zzb;
        jArr2[i4] = j;
        this.zzb = i4 + 1;
        return this;
    }

    public final zzhao zzb() {
        int i = this.zzb;
        return i == 0 ? zzhao.zza : new zzhao(this.zza, 0, i, null);
    }
}
