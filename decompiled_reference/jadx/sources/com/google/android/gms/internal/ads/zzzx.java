package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzzx implements zzabb {
    protected final zzbg zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzv[] zzd;
    private int zze;

    public zzzx(zzbg zzbgVar, int[] iArr, int i) {
        zzv[] zzvVarArr;
        int length = iArr.length;
        zzgtr.zzi(length > 0);
        zzbgVar.getClass();
        this.zza = zzbgVar;
        this.zzb = length;
        this.zzd = new zzv[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            zzvVarArr = this.zzd;
            if (i2 >= length2) {
                break;
            }
            zzvVarArr[i2] = zzbgVar.zza(iArr[i2]);
            i2++;
        }
        Arrays.sort(zzvVarArr, zzzw.zza);
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzbgVar.zzb(this.zzd[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzzx zzzxVar = (zzzx) obj;
            if (this.zza.equals(zzzxVar.zza) && Arrays.equals(this.zzc, zzzxVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final zzv zzb(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final zzv zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int zzf(int i) {
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int zzg(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zzh() {
        return this.zzc[0];
    }
}
