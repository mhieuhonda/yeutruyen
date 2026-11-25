package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgxc extends zzgwn {
    Object[] zzd;
    private int zze;

    public zzgxc() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgwn, com.google.android.gms.internal.ads.zzgwo
    public final /* bridge */ /* synthetic */ zzgwo zzd(Object obj) {
        zzf(obj);
        return this;
    }

    zzgxc(int i, boolean z) {
        super(i);
        this.zzd = new Object[zzgxd.zzo(i)];
    }

    public final zzgxc zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            super.zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgxd zzh() {
        zzgxd zzgxdVarZzw;
        int i = this.zzb;
        if (i == 0) {
            return zzgyu.zza;
        }
        if (i == 1) {
            return new zzgze(Objects.requireNonNull(this.zza[0]));
        }
        if (this.zzd == null || zzgxd.zzo(i) != this.zzd.length) {
            zzgxdVarZzw = zzgxd.zzw(this.zzb, this.zza);
            this.zzb = zzgxdVarZzw.size();
        } else {
            int i2 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgxd.zzx(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.zze;
            Object[] objArr = this.zzd;
            zzgxdVarZzw = new zzgyu(objArrCopyOf, i3, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgxdVarZzw;
    }

    public final zzgxc zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzo = zzgxd.zzo(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzo <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgwm.zza(iHashCode);
                while (true) {
                    int i = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i + 1;
                }
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
