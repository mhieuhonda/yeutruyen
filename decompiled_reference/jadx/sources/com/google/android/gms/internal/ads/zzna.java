package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzna extends zziy {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbf[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzna(Collection collection, zzzg zzzgVar) {
        zzbf[] zzbfVarArr = new zzbf[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzbfVarArr[i2] = ((zzmi) it.next()).zzb();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zzmi) it2.next()).zza();
            i++;
        }
        this(zzbfVarArr, objArr, zzzgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziy
    protected final int zzp(int i) {
        return zzfm.zzn(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    protected final int zzq(int i) {
        return zzfm.zzn(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    protected final int zzr(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zziy
    protected final zzbf zzs(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zziy
    protected final int zzt(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zziy
    protected final int zzu(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zziy
    protected final Object zzv(int i) {
        return this.zzh[i];
    }

    final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzna zzx(zzzg zzzgVar) {
        zzbf[] zzbfVarArr = this.zzg;
        zzbf[] zzbfVarArr2 = new zzbf[zzbfVarArr.length];
        for (int i = 0; i < zzbfVarArr.length; i++) {
            zzbfVarArr2[i] = new zzmz(this, zzbfVarArr[i]);
        }
        return new zzna(zzbfVarArr2, this.zzh, zzzgVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzna(zzbf[] zzbfVarArr, Object[] objArr, zzzg zzzgVar) {
        super(false, zzzgVar);
        int i = 0;
        this.zzg = zzbfVarArr;
        int length = zzbfVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int iZza = 0;
        int iZzc = 0;
        int i2 = 0;
        while (i < zzbfVarArr.length) {
            zzbf zzbfVar = zzbfVarArr[i];
            this.zzg[i2] = zzbfVar;
            this.zzf[i2] = iZza;
            this.zze[i2] = iZzc;
            iZza += zzbfVar.zza();
            iZzc += this.zzg[i2].zzc();
            this.zzi.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.zzc = iZza;
        this.zzd = iZzc;
    }
}
