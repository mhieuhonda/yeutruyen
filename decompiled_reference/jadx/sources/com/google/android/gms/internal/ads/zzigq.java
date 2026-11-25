package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzigq extends zzidl {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzidl zzd;
    private final zzidl zze;
    private final int zzf;
    private final int zzg;

    private zzigq(zzidl zzidlVar, zzidl zzidlVar2) {
        this.zzd = zzidlVar;
        this.zze = zzidlVar2;
        int iZzb = zzidlVar.zzb();
        this.zzf = iZzb;
        this.zzc = iZzb + zzidlVar2.zzb();
        this.zzg = Math.max(zzidlVar.zzp(), zzidlVar2.zzp()) + 1;
    }

    /* synthetic */ zzigq(zzidl zzidlVar, zzidl zzidlVar2, byte[] bArr) {
        this(zzidlVar, zzidlVar2);
    }

    private static zzidl zzG(zzidl zzidlVar, zzidl zzidlVar2) {
        int iZzb = zzidlVar.zzb();
        int iZzb2 = zzidlVar2.zzb();
        byte[] bArr = new byte[iZzb + iZzb2];
        zzidlVar.zzz(bArr, 0, 0, iZzb);
        zzidlVar2.zzz(bArr, 0, iZzb, iZzb2);
        return zzidl.zzv(bArr);
    }

    static zzidl zzk(zzidl zzidlVar, zzidl zzidlVar2) {
        if (zzidlVar2.zzb() == 0) {
            return zzidlVar;
        }
        if (zzidlVar.zzb() == 0) {
            return zzidlVar2;
        }
        int iZzb = zzidlVar.zzb() + zzidlVar2.zzb();
        if (iZzb < 128) {
            return zzG(zzidlVar, zzidlVar2);
        }
        if (zzidlVar instanceof zzigq) {
            zzigq zzigqVar = (zzigq) zzidlVar;
            zzidl zzidlVar3 = zzigqVar.zze;
            if (zzidlVar3.zzb() + zzidlVar2.zzb() < 128) {
                return new zzigq(zzigqVar.zzd, zzG(zzidlVar3, zzidlVar2));
            }
            zzidl zzidlVar4 = zzigqVar.zzd;
            if (zzidlVar4.zzp() > zzidlVar3.zzp() && zzigqVar.zzg > zzidlVar2.zzp()) {
                return new zzigq(zzidlVar4, new zzigq(zzidlVar3, zzidlVar2));
            }
        }
        return iZzb >= zzn(Math.max(zzidlVar.zzp(), zzidlVar2.zzp()) + 1) ? new zzigq(zzidlVar, zzidlVar2) : zzigo.zza(zzidlVar, zzidlVar2, new ArrayDeque());
    }

    static int zzn(int i) {
        int[] iArr = zzb;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzidl, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzign(this);
    }

    final /* synthetic */ zzidl zzF() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    final byte zza(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zza(i) : this.zze.zza(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzc(int i, int i2) {
        return zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzd(int i, int i2) {
        int i3 = this.zzc;
        int iZzD = zzD(i, i2, i3);
        if (iZzD == 0) {
            return zzidl.zza;
        }
        if (iZzD == i3) {
            return this;
        }
        int i4 = this.zzf;
        if (i2 <= i4) {
            return this.zzd.zzc(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.zze.zzc(i - i4, i5);
        }
        zzidl zzidlVar = this.zzd;
        return new zzigq(zzidlVar.zzc(i, zzidlVar.zzb()), this.zze.zzc(0, i5));
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    final void zzg(zzidc zzidcVar) throws IOException {
        this.zzd.zzg(zzidcVar);
        this.zze.zzg(zzidcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final String zzh(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzi() {
        zzigp zzigpVar = new zzigp(this, null);
        while (zzigpVar.hasNext()) {
            if (!zzigpVar.next().zzi()) {
                return zzihp.zza(zzA());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzj(zzidl zzidlVar) {
        byte[] bArr = null;
        zzigp zzigpVar = new zzigp(this, bArr);
        zzidi zzidiVarZza = zzigpVar.next();
        zzigp zzigpVar2 = new zzigp(zzidlVar, bArr);
        zzidi zzidiVarZza2 = zzigpVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iZzb = zzidiVarZza.zzb() - i;
            int iZzb2 = zzidiVarZza2.zzb() - i2;
            int iMin = Math.min(iZzb, iZzb2);
            if (!(i == 0 ? zzidiVarZza.zzk(zzidiVarZza2, i2, iMin) : zzidiVarZza2.zzk(zzidiVarZza, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzb) {
                i = 0;
                zzidiVarZza = zzigpVar.next();
            } else {
                i += iMin;
                zzidiVarZza = zzidiVarZza;
            }
            if (iMin == iZzb2) {
                zzidiVarZza2 = zzigpVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final int zzl(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzl(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzl(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzl(this.zzd.zzl(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidp zzm() {
        ArrayList arrayList = new ArrayList();
        zzigp zzigpVar = new zzigp(this, null);
        while (zzigpVar.hasNext()) {
            arrayList.add(zzigpVar.next().zzf());
        }
        int i = zzidp.zze;
        return zzidp.zzH(new zzifi(arrayList), 4096);
    }

    final /* synthetic */ zzidl zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    protected final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: zzr */
    public final zzidg iterator() {
        return new zzign(this);
    }
}
