package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzihe {
    private static final zzihe zza = new zzihe(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzihe() {
        this(0, new int[8], new Object[8], true);
    }

    private zzihe(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzihe zza() {
        return zza;
    }

    static zzihe zzb() {
        return new zzihe();
    }

    static zzihe zzc(zzihe zziheVar, zzihe zziheVar2) {
        int i = zziheVar.zzb + zziheVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zziheVar.zzc, i);
        System.arraycopy(zziheVar2.zzc, 0, iArrCopyOf, zziheVar.zzb, zziheVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zziheVar.zzd, i);
        System.arraycopy(zziheVar2.zzd, 0, objArrCopyOf, zziheVar.zzb, zziheVar2.zzb);
        return new zzihe(i, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzn(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzihe)) {
            return false;
        }
        zzihe zziheVar = (zzihe) obj;
        int i = this.zzb;
        if (i == zziheVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zziheVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zziheVar.zzd;
            int i3 = this.zzb;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    final void zzf(zzihs zzihsVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzihsVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(zzihs zzihsVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzihsVar.zzc(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzihsVar.zzj(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzihsVar.zzn(i4, (zzidl) obj);
                } else if (i3 == 3) {
                    zzihsVar.zzt(i4);
                    ((zzihe) obj).zzg(zzihsVar);
                    zzihsVar.zzu(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzifg("Protocol message tag had invalid wire type."));
                    }
                    zzihsVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzF = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzidl zzidlVar = (zzidl) this.zzd[i2];
            int iZzF2 = zzidu.zzF(8);
            int iZzF3 = zzidu.zzF(16) + zzidu.zzF(i3);
            int iZzF4 = zzidu.zzF(24);
            int iZzb = zzidlVar.zzb();
            iZzF += iZzF2 + iZzF2 + iZzF3 + iZzF4 + zzidu.zzF(iZzb) + iZzb;
        }
        this.zze = iZzF;
        return iZzF;
    }

    public final int zzi() {
        int iZzF;
        int iZzG;
        int iZzF2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.zzd[i3]).longValue();
                    iZzF2 = zzidu.zzF(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzidl zzidlVar = (zzidl) this.zzd[i3];
                    int iZzF3 = zzidu.zzF(i7);
                    int iZzb = zzidlVar.zzb();
                    iZzF2 = iZzF3 + zzidu.zzF(iZzb) + iZzb;
                } else if (i6 == 3) {
                    int iZzF4 = zzidu.zzF(i5 << 3);
                    iZzF = iZzF4 + iZzF4;
                    iZzG = ((zzihe) this.zzd[i3]).zzi();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new zzifg("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i3]).intValue();
                    iZzF2 = zzidu.zzF(i5 << 3) + 4;
                }
                i2 += iZzF2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.zzd[i3]).longValue();
                iZzF = zzidu.zzF(i8);
                iZzG = zzidu.zzG(jLongValue);
            }
            iZzF2 = iZzF + iZzG;
            i2 += iZzF2;
        }
        this.zze = i2;
        return i2;
    }

    final void zzj(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzigb.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzk(int i, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final boolean zzl(int i, zzidp zzidpVar) throws IOException {
        int iZza;
        zze();
        int i2 = i & 7;
        if (i2 == 0) {
            zzk(i, Long.valueOf(zzidpVar.zzg()));
            return true;
        }
        if (i2 == 1) {
            zzk(i, Long.valueOf(zzidpVar.zzi()));
            return true;
        }
        if (i2 == 2) {
            zzk(i, zzidpVar.zzn());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                zzidpVar.zzK();
                return false;
            }
            if (i2 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            zzk(i, Integer.valueOf(zzidpVar.zzj()));
            return true;
        }
        zzidpVar.zzJ();
        zzidpVar.zzb++;
        zzihe zziheVar = new zzihe();
        do {
            iZza = zzidpVar.zza();
            if (iZza == 0) {
                break;
            }
        } while (zziheVar.zzl(iZza, zzidpVar));
        zzidpVar.zzb--;
        zzidpVar.zzb(4 | ((i >>> 3) << 3));
        zzk(i, zziheVar);
        return true;
    }

    final zzihe zzm(zzihe zziheVar) {
        if (zziheVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zziheVar.zzb;
        zzn(i);
        System.arraycopy(zziheVar.zzc, 0, this.zzc, this.zzb, zziheVar.zzb);
        System.arraycopy(zziheVar.zzd, 0, this.zzd, this.zzb, zziheVar.zzb);
        this.zzb = i;
        return this;
    }
}
