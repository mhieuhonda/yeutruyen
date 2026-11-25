package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyx {
    private final zzabm zza;
    private final zzeu zzb = new zzeu(32);
    private zzyw zzc;
    private zzyw zzd;
    private zzyw zze;
    private long zzf;

    public zzyx(zzabm zzabmVar) {
        this.zza = zzabmVar;
        zzyw zzywVar = new zzyw(0L, 65536);
        this.zzc = zzywVar;
        this.zzd = zzywVar;
        this.zze = zzywVar;
    }

    private final int zzi(int i) {
        zzyw zzywVar = this.zze;
        if (zzywVar.zzc == null) {
            zzabk zzabkVarZza = this.zza.zza();
            zzyw zzywVar2 = new zzyw(this.zze.zzb, 65536);
            zzywVar.zzc = zzabkVarZza;
            zzywVar.zzd = zzywVar2;
        }
        return Math.min(i, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i) {
        long j = this.zzf + ((long) i);
        this.zzf = j;
        zzyw zzywVar = this.zze;
        if (j == zzywVar.zzb) {
            this.zze = zzywVar.zzd;
        }
    }

    private static zzyw zzk(zzyw zzywVar, zzix zzixVar, zzyy zzyyVar, zzeu zzeuVar) {
        zzyw zzywVarZzm;
        if (zzixVar.zzk()) {
            long j = zzyyVar.zzb;
            int iZzt = 1;
            zzeuVar.zza(1);
            zzyw zzywVarZzm2 = zzm(zzywVar, j, zzeuVar.zzi(), 1);
            long j2 = j + 1;
            byte b = zzeuVar.zzi()[0];
            int i = b & 128;
            int i2 = b & 127;
            zziu zziuVar = zzixVar.zzb;
            byte[] bArr = zziuVar.zza;
            if (bArr == null) {
                zziuVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            zzywVarZzm = zzm(zzywVarZzm2, j2, zziuVar.zza, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                zzeuVar.zza(2);
                zzywVarZzm = zzm(zzywVarZzm, j3, zzeuVar.zzi(), 2);
                j3 += 2;
                iZzt = zzeuVar.zzt();
            }
            int i3 = iZzt;
            int[] iArr = zziuVar.zzd;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zziuVar.zze;
            if (iArr3 == null || iArr3.length < i3) {
                iArr3 = new int[i3];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i3 * 6;
                zzeuVar.zza(i4);
                zzywVarZzm = zzm(zzywVarZzm, j3, zzeuVar.zzi(), i4);
                j3 += (long) i4;
                zzeuVar.zzh(0);
                for (int i5 = 0; i5 < i3; i5++) {
                    iArr2[i5] = zzeuVar.zzt();
                    iArr4[i5] = zzeuVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzyyVar.zza - ((int) (j3 - zzyyVar.zzb));
            }
            zzahl zzahlVar = zzyyVar.zzc;
            String str = zzfm.zza;
            zziuVar.zza(i3, iArr2, iArr4, zzahlVar.zzb, zziuVar.zza, zzahlVar.zza, zzahlVar.zzc, zzahlVar.zzd);
            long j4 = zzyyVar.zzb;
            int i6 = (int) (j3 - j4);
            zzyyVar.zzb = j4 + ((long) i6);
            zzyyVar.zza -= i6;
        } else {
            zzywVarZzm = zzywVar;
        }
        if (!zzixVar.zze()) {
            zzixVar.zzj(zzyyVar.zza);
            return zzl(zzywVarZzm, zzyyVar.zzb, zzixVar.zzc, zzyyVar.zza);
        }
        zzeuVar.zza(4);
        zzyw zzywVarZzm3 = zzm(zzywVarZzm, zzyyVar.zzb, zzeuVar.zzi(), 4);
        int iZzH = zzeuVar.zzH();
        zzyyVar.zzb += 4;
        zzyyVar.zza -= 4;
        zzixVar.zzj(iZzH);
        zzyw zzywVarZzl = zzl(zzywVarZzm3, zzyyVar.zzb, zzixVar.zzc, iZzH);
        zzyyVar.zzb += (long) iZzH;
        int i7 = zzyyVar.zza - iZzH;
        zzyyVar.zza = i7;
        ByteBuffer byteBuffer = zzixVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            zzixVar.zze = ByteBuffer.allocate(i7);
        } else {
            zzixVar.zze.clear();
        }
        return zzl(zzywVarZzl, zzyyVar.zzb, zzixVar.zze, zzyyVar.zza);
    }

    private static zzyw zzl(zzyw zzywVar, long j, ByteBuffer byteBuffer, int i) {
        zzyw zzywVarZzn = zzn(zzywVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (zzywVarZzn.zzb - j));
            byteBuffer.put(zzywVarZzn.zzc.zza, zzywVarZzn.zzb(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == zzywVarZzn.zzb) {
                zzywVarZzn = zzywVarZzn.zzd;
            }
        }
        return zzywVarZzn;
    }

    private static zzyw zzm(zzyw zzywVar, long j, byte[] bArr, int i) {
        zzyw zzywVarZzn = zzn(zzywVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (zzywVarZzn.zzb - j));
            System.arraycopy(zzywVarZzn.zzc.zza, zzywVarZzn.zzb(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == zzywVarZzn.zzb) {
                zzywVarZzn = zzywVarZzn.zzd;
            }
        }
        return zzywVarZzn;
    }

    private static zzyw zzn(zzyw zzywVar, long j) {
        while (j >= zzywVar.zzb) {
            zzywVar = zzywVar.zzd;
        }
        return zzywVar;
    }

    public final void zza() {
        zzyw zzywVar = this.zzc;
        if (zzywVar.zzc != null) {
            this.zza.zzc(zzywVar);
            zzywVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzyw zzywVar2 = this.zzc;
        this.zzd = zzywVar2;
        this.zze = zzywVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zzix zzixVar, zzyy zzyyVar) {
        this.zzd = zzk(this.zzd, zzixVar, zzyyVar, this.zzb);
    }

    public final void zzd(zzix zzixVar, zzyy zzyyVar) {
        zzk(this.zzd, zzixVar, zzyyVar, this.zzb);
    }

    public final void zze(long j) {
        zzyw zzywVar;
        if (j != -1) {
            while (true) {
                zzywVar = this.zzc;
                if (j < zzywVar.zzb) {
                    break;
                }
                this.zza.zzb(zzywVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzywVar.zza) {
                this.zzd = zzywVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i, boolean z) throws IOException {
        int iZzi = zzi(i);
        zzyw zzywVar = this.zze;
        int iZza = zzjVar.zza(zzywVar.zzc.zza, zzywVar.zzb(this.zzf), iZzi);
        if (iZza != -1) {
            zzj(iZza);
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzeu zzeuVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            zzyw zzywVar = this.zze;
            zzeuVar.zzm(zzywVar.zzc.zza, zzywVar.zzb(this.zzf), iZzi);
            i -= iZzi;
            zzj(iZzi);
        }
    }
}
