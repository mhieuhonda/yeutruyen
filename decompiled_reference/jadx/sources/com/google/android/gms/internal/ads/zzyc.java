package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyc extends zzwt {
    private static final zzak zza;
    private final zzxn[] zzb;
    private final List zzc;
    private final zzbf[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzya zzh;
    private final zzww zzi;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("MergingMediaSource");
        zza = zzzVar.zzc();
    }

    public zzyc(boolean z, boolean z2, zzww zzwwVar, zzxn... zzxnVarArr) {
        this.zzb = zzxnVarArr;
        this.zzi = zzwwVar;
        this.zze = new ArrayList(Arrays.asList(zzxnVarArr));
        this.zzc = new ArrayList(zzxnVarArr.length);
        int i = 0;
        while (true) {
            int length = zzxnVarArr.length;
            if (i >= length) {
                this.zzd = new zzbf[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgyi.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzB(zzak zzakVar) {
        this.zzb[0].zzB(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzE(zzxj zzxjVar) {
        zzxz zzxzVar = (zzxz) zzxjVar;
        int i = 0;
        while (true) {
            zzxn[] zzxnVarArr = this.zzb;
            if (i >= zzxnVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i);
            zzxj zzxjVarZza = zzxzVar.zza(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((zzyb) list.get(i2)).zzb().equals(zzxjVarZza)) {
                    list.remove(i2);
                    break;
                }
            }
            zzxnVarArr[i].zzE(zzxzVar.zza(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final zzxj zzH(zzxl zzxlVar, zzabm zzabmVar, long j) {
        zzbf[] zzbfVarArr = this.zzd;
        zzxn[] zzxnVarArr = this.zzb;
        int length = zzxnVarArr.length;
        zzxj[] zzxjVarArr = new zzxj[length];
        int iZze = zzbfVarArr[0].zze(zzxlVar.zza);
        for (int i = 0; i < length; i++) {
            zzxl zzxlVarZza = zzxlVar.zza(zzbfVarArr[i].zzf(iZze));
            zzxjVarArr[i] = zzxnVarArr[i].zzH(zzxlVarZza, zzabmVar, j - this.zzg[iZze][i]);
            ((List) this.zzc.get(i)).add(new zzyb(zzxlVarZza, zzxjVarArr[i], null));
        }
        return new zzxz(this.zzi, this.zzg[iZze], zzxjVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final zzak zzK() {
        zzxn[] zzxnVarArr = this.zzb;
        return zzxnVarArr.length > 0 ? zzxnVarArr[0].zzK() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzwm
    protected final void zza(zzip zzipVar) {
        super.zza(zzipVar);
        int i = 0;
        while (true) {
            zzxn[] zzxnVarArr = this.zzb;
            if (i >= zzxnVarArr.length) {
                return;
            }
            zzw(Integer.valueOf(i), zzxnVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzwm
    protected final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzxn
    public final void zzu() throws IOException {
        zzya zzyaVar = this.zzh;
        if (zzyaVar != null) {
            throw zzyaVar;
        }
        super.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    protected final /* bridge */ /* synthetic */ void zzv(Object obj, zzxn zzxnVar, zzbf zzbfVar) {
        int iZzc;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            iZzc = zzbfVar.zzc();
            this.zzf = iZzc;
        } else {
            int iZzc2 = zzbfVar.zzc();
            int i = this.zzf;
            if (iZzc2 != i) {
                this.zzh = new zzya(0);
                return;
            }
            iZzc = i;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzc, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzxnVar);
        zzbf[] zzbfVarArr = this.zzd;
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            zze(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    protected final /* bridge */ /* synthetic */ zzxl zzy(Object obj, zzxl zzxlVar) {
        int iIntValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(iIntValue);
        for (int i = 0; i < list2.size(); i++) {
            if (((zzyb) list2.get(i)).zza().equals(zzxlVar)) {
                return ((zzyb) ((List) list.get(0)).get(i)).zza();
            }
        }
        return null;
    }
}
