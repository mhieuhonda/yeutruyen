package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhln {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    zzhln() {
        this(new long[10], new long[10], new long[10]);
    }

    zzhln(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    static zzhln zza(zzhln zzhlnVar, zzhlm zzhlmVar) {
        zzhln zzhlnVar2 = zzhlmVar.zza;
        long[] jArr = zzhlnVar.zza;
        long[] jArr2 = zzhlnVar2.zza;
        long[] jArr3 = zzhlmVar.zzb;
        zzhlw.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhlnVar.zzb;
        long[] jArr5 = zzhlnVar2.zzb;
        long[] jArr6 = zzhlnVar2.zzc;
        zzhlw.zze(jArr4, jArr5, jArr6);
        zzhlw.zze(zzhlnVar.zzc, jArr6, jArr3);
        return zzhlnVar;
    }

    final byte[] zzb() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        int i = zzhlw.zza;
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.zzc;
        zzhlw.zzf(jArr4, jArr14);
        zzhlw.zzf(jArr13, jArr4);
        zzhlw.zzf(jArr12, jArr13);
        zzhlw.zze(jArr5, jArr12, jArr14);
        zzhlw.zze(jArr6, jArr5, jArr4);
        zzhlw.zzf(jArr12, jArr6);
        zzhlw.zze(jArr7, jArr12, jArr5);
        zzhlw.zzf(jArr12, jArr7);
        zzhlw.zzf(jArr13, jArr12);
        zzhlw.zzf(jArr12, jArr13);
        zzhlw.zzf(jArr13, jArr12);
        zzhlw.zzf(jArr12, jArr13);
        zzhlw.zze(jArr8, jArr12, jArr7);
        zzhlw.zzf(jArr12, jArr8);
        zzhlw.zzf(jArr13, jArr12);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            zzhlw.zzf(jArr12, jArr13);
            zzhlw.zzf(jArr13, jArr12);
        }
        zzhlw.zze(jArr9, jArr13, jArr8);
        zzhlw.zzf(jArr12, jArr9);
        zzhlw.zzf(jArr13, jArr12);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            zzhlw.zzf(jArr12, jArr13);
            zzhlw.zzf(jArr13, jArr12);
        }
        zzhlw.zze(jArr12, jArr13, jArr9);
        zzhlw.zzf(jArr13, jArr12);
        zzhlw.zzf(jArr12, jArr13);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            zzhlw.zzf(jArr13, jArr12);
            zzhlw.zzf(jArr12, jArr13);
        }
        zzhlw.zze(jArr10, jArr12, jArr8);
        zzhlw.zzf(jArr12, jArr10);
        zzhlw.zzf(jArr13, jArr12);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            zzhlw.zzf(jArr12, jArr13);
            zzhlw.zzf(jArr13, jArr12);
        }
        zzhlw.zze(jArr11, jArr13, jArr10);
        zzhlw.zzf(jArr13, jArr11);
        zzhlw.zzf(jArr12, jArr13);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            zzhlw.zzf(jArr13, jArr12);
            zzhlw.zzf(jArr12, jArr13);
        }
        zzhlw.zze(jArr13, jArr12, jArr11);
        zzhlw.zzf(jArr12, jArr13);
        zzhlw.zzf(jArr13, jArr12);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            zzhlw.zzf(jArr12, jArr13);
            zzhlw.zzf(jArr13, jArr12);
        }
        zzhlw.zze(jArr12, jArr13, jArr10);
        zzhlw.zzf(jArr13, jArr12);
        zzhlw.zzf(jArr12, jArr13);
        zzhlw.zzf(jArr13, jArr12);
        zzhlw.zzf(jArr12, jArr13);
        zzhlw.zzf(jArr13, jArr12);
        zzhlw.zze(jArr, jArr13, jArr6);
        zzhlw.zze(jArr2, this.zza, jArr);
        zzhlw.zze(jArr3, this.zzb, jArr);
        byte[] bArrZzh = zzhlw.zzh(jArr3);
        bArrZzh[31] = (byte) ((zzhlp.zzf(jArr2) << 7) ^ bArrZzh[31]);
        return bArrZzh;
    }

    zzhln(zzhlm zzhlmVar) {
        this();
        zza(this, zzhlmVar);
    }

    zzhln(zzhln zzhlnVar) {
        this.zza = Arrays.copyOf(zzhlnVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhlnVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhlnVar.zzc, 10);
    }
}
