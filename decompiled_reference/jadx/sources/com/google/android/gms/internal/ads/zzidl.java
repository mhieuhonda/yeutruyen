package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzidl implements Iterable<Byte>, Serializable {
    public static final zzidl zza = new zzidj(zzifc.zza);
    private int zzb = 0;

    static {
        int i = zzicy.zza;
    }

    zzidl() {
    }

    public static zzidk zzC() {
        return new zzidk(128);
    }

    static /* synthetic */ boolean zzE(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        zzD(i, i4, bArr.length);
        zzD(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static zzidl zzt(byte[] bArr, int i, int i2) {
        try {
            return zzu(bArr, i, i2, false);
        } catch (zzifh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static zzidl zzu(byte[] bArr, int i, int i2, boolean z) throws zzifh {
        if (i2 == 0) {
            return zza;
        }
        zzD(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzidj(bArr2);
    }

    static zzidl zzv(byte[] bArr) {
        try {
            return zzw(bArr, false);
        } catch (zzifh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static zzidl zzw(byte[] bArr, boolean z) throws zzifh {
        return bArr.length == 0 ? zza : new zzidj(bArr);
    }

    public static zzidl zzx(String str) {
        return str.isEmpty() ? zza : new zzidj(str.getBytes(StandardCharsets.UTF_8));
    }

    public static zzidl zzy(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzidl)) {
            return false;
        }
        zzidl zzidlVar = (zzidl) obj;
        int iZzb = zzb();
        if (iZzb != zzidlVar.zzb()) {
            return false;
        }
        if (iZzb == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = zzidlVar.zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return zzj(zzidlVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzl = this.zzb;
        if (iZzl == 0) {
            int iZzb = zzb();
            iZzl = zzl(iZzb, 0, iZzb);
            if (iZzl == 0) {
                iZzl = 1;
            }
            this.zzb = iZzl;
        }
        return iZzl;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzb()), zzb() <= 50 ? zzigz.zza(zzA()) : zzigz.zza(zzd(0, 47).zzA()).concat("..."));
    }

    public final byte[] zzA() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzifc.zza;
        }
        byte[] bArr = new byte[iZzb];
        zze(bArr, 0, 0, iZzb);
        return bArr;
    }

    public final String zzB(Charset charset) {
        return zzs() ? "" : zzh(charset);
    }

    abstract byte zza(int i);

    public abstract int zzb();

    public abstract zzidl zzc(int i, int i2);

    public abstract zzidl zzd(int i, int i2);

    protected abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract ByteBuffer zzf();

    abstract void zzg(zzidc zzidcVar) throws IOException;

    protected abstract String zzh(Charset charset);

    public abstract boolean zzi();

    protected abstract boolean zzj(zzidl zzidlVar);

    protected abstract int zzl(int i, int i2, int i3);

    public abstract zzidp zzm();

    protected abstract int zzp();

    protected abstract boolean zzq();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zzidg iterator() {
        return new zzidd(this);
    }

    public final boolean zzs() {
        return zzb() == 0;
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i, int i2, int i3) {
        zzD(0, i3, zzb());
        zzD(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    private static zzidl zzk(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (zzidl) it.next();
        }
        int i2 = i >>> 1;
        zzidl zzidlVarZzk = zzk(it, i2);
        zzidl zzidlVarZzk2 = zzk(it, i - i2);
        if (Integer.MAX_VALUE - zzidlVarZzk.zzb() >= zzidlVarZzk2.zzb()) {
            return zzigq.zzk(zzidlVarZzk, zzidlVarZzk2);
        }
        int iZzb = zzidlVarZzk.zzb();
        int iZzb2 = zzidlVarZzk2.zzb();
        StringBuilder sb = new StringBuilder(String.valueOf(iZzb).length() + 31 + String.valueOf(iZzb2).length());
        sb.append("ByteString would be too long: ");
        sb.append(iZzb);
        sb.append("+");
        sb.append(iZzb2);
        throw new IllegalArgumentException(sb.toString());
    }

    static int zzD(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
}
