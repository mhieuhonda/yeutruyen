package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgxd<E> extends zzgwp<E> implements Set<E> {
    private transient zzgwt zza;

    zzgxd() {
    }

    public static zzgxd zzh() {
        return zzgyu.zza;
    }

    public static zzgxd zzi(Object obj) {
        return new zzgze(obj);
    }

    public static zzgxd zzj(Object obj, Object obj2) {
        return zzw(2, obj, obj2);
    }

    public static zzgxd zzk(Object obj, Object obj2, Object obj3) {
        return zzw(3, obj, obj2, obj3);
    }

    public static zzgxd zzl(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzw(4, obj, obj2, obj3, obj4);
    }

    public static zzgxd zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzw(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgxd zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzw(i, objArr2);
    }

    static int zzo(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzgtr.zzb(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzgxd zzp(Collection collection) {
        if ((collection instanceof zzgxd) && !(collection instanceof SortedSet)) {
            zzgxd zzgxdVar = (zzgxd) collection;
            if (!zzgxdVar.zzf()) {
                return zzgxdVar;
            }
        }
        Object[] array = collection.toArray();
        return zzw(array.length, array);
    }

    public static zzgxd zzq(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? zzw(length, (Object[]) objArr.clone()) : new zzgze(objArr[0]);
        }
        return zzgyu.zza;
    }

    public static zzgxc zzt(int i) {
        zzgvp.zzb(i, "expectedSize");
        return new zzgxc(i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzx(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgxd) && zzr() && ((zzgxd) obj).zzr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgzd.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgzd.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgzh iterator();

    @Override // com.google.android.gms.internal.ads.zzgwp
    public zzgwt zze() {
        zzgwt zzgwtVar = this.zza;
        if (zzgwtVar != null) {
            return zzgwtVar;
        }
        zzgwt zzgwtVarZzs = zzs();
        this.zza = zzgwtVarZzs;
        return zzgwtVarZzs;
    }

    boolean zzr() {
        return false;
    }

    zzgwt zzs() {
        Object[] array = toArray();
        int i = zzgwt.zzd;
        return zzgwt.zzt(array, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgxd zzw(int i, Object... objArr) {
        if (i == 0) {
            return zzgyu.zza;
        }
        if (i == 1) {
            return new zzgze(Objects.requireNonNull(objArr[0]));
        }
        int iZzo = zzo(i);
        Object[] objArr2 = new Object[iZzo];
        int i2 = iZzo - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            zzgym.zzb(obj, i5);
            int iHashCode = obj.hashCode();
            int iZza = zzgwm.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(obj)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new zzgze(Objects.requireNonNull(objArr[0]));
        }
        if (zzo(i4) < iZzo / 2) {
            return zzw(i4, objArr);
        }
        if (zzx(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzgyu(objArr, i3, objArr2, i2, i4);
    }
}
