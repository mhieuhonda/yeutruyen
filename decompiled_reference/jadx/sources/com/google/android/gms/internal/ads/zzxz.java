package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxz implements zzxj, zzxi {
    private final zzxj[] zza;
    private final boolean[] zzb;
    private zzxi zzf;
    private zzzo zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzzf zzi = new zzwv(zzgwt.zzi(), zzgwt.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzxj[] zzh = new zzxj[0];

    public zzxz(zzww zzwwVar, long[] jArr, zzxj... zzxjVarArr) {
        this.zza = zzxjVarArr;
        this.zzb = new boolean[zzxjVarArr.length];
        for (int i = 0; i < zzxjVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zzb[i] = true;
                this.zza[i] = new zzzl(zzxjVarArr[i], j);
            }
        }
    }

    public final zzxj zza(int i) {
        boolean z = this.zzb[i];
        zzxj[] zzxjVarArr = this.zza;
        return z ? ((zzzl) zzxjVarArr[i]).zza() : zzxjVarArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        return this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        return this.zzi.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzmc zzmcVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzd(zzmcVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzxj) arrayList.get(i)).zzd(zzmcVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zze() {
        return this.zzi.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final void zzf(long j) {
        this.zzi.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzl(zzxi zzxiVar, long j) {
        this.zzf = zzxiVar;
        ArrayList arrayList = this.zzd;
        zzxj[] zzxjVarArr = this.zza;
        Collections.addAll(arrayList, zzxjVarArr);
        for (zzxj zzxjVar : zzxjVarArr) {
            zzxjVar.zzl(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzm() throws IOException {
        int i = 0;
        while (true) {
            zzxj[] zzxjVarArr = this.zza;
            if (i >= zzxjVarArr.length) {
                return;
            }
            zzxjVarArr[i].zzm();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzo(zzabb[] zzabbVarArr, boolean[] zArr, zzzd[] zzzdVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = zzabbVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzabbVarArr.length;
            if (i2 >= length) {
                break;
            }
            zzzd zzzdVar = zzzdVarArr[i2];
            Integer num = zzzdVar == null ? null : (Integer) this.zzc.get(zzzdVar);
            iArr[i2] = num == null ? -1 : num.intValue();
            zzabb zzabbVar = zzabbVarArr[i2];
            if (zzabbVar != null) {
                String str = zzabbVar.zza().zzb;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzxj[] zzxjVarArr = this.zza;
        zzzd[] zzzdVarArr2 = new zzzd[length];
        zzzd[] zzzdVarArr3 = new zzzd[length];
        zzabb[] zzabbVarArr2 = new zzabb[length];
        ArrayList arrayList = new ArrayList(zzxjVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < zzxjVarArr.length) {
            int i4 = i;
            while (i4 < zzabbVarArr.length) {
                zzzdVarArr3[i4] = iArr[i4] == i3 ? zzzdVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    zzabb zzabbVar2 = zzabbVarArr[i4];
                    zzabbVar2.getClass();
                    zzbg zzbgVar = (zzbg) this.zze.get(zzabbVar2.zza());
                    zzbgVar.getClass();
                    zzabbVarArr2[i4] = new zzxy(zzabbVar2, zzbgVar);
                } else {
                    zzabbVarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr2;
            }
            int[] iArr3 = iArr2;
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            long jZzo = zzxjVarArr[i3].zzo(zzabbVarArr2, zArr, zzzdVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jZzo;
            } else if (jZzo != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzabbVarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    zzzd zzzdVar2 = zzzdVarArr3[i6];
                    zzzdVar2.getClass();
                    zzzdVarArr2[i6] = zzzdVar2;
                    identityHashMap.put(zzzdVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzgtr.zzi(zzzdVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(zzxjVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            iArr2 = iArr3;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzzdVarArr2, i7, zzzdVarArr, i7, length);
        this.zzh = (zzxj[]) arrayList3.toArray(new zzxj[i7]);
        this.zzi = new zzwv(arrayList3, zzgxt.zzc(arrayList3, zzxx.zza));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzp(zzxj zzxjVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzxjVar);
        if (arrayList.isEmpty()) {
            zzxj[] zzxjVarArr = this.zza;
            int i = 0;
            for (zzxj zzxjVar2 : zzxjVarArr) {
                i += zzxjVar2.zzn().zzb;
            }
            zzbg[] zzbgVarArr = new zzbg[i];
            int i2 = 0;
            for (int i3 = 0; i3 < zzxjVarArr.length; i3++) {
                zzzo zzzoVarZzn = zzxjVarArr[i3].zzn();
                int i4 = zzzoVarZzn.zzb;
                int i5 = 0;
                while (i5 < i4) {
                    zzbg zzbgVarZza = zzzoVarZzn.zza(i5);
                    int i6 = zzbgVarZza.zza;
                    zzv[] zzvVarArr = new zzv[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        zzv zzvVarZza = zzbgVarZza.zza(i7);
                        zzt zztVarZza = zzvVarZza.zza();
                        String str = zzvVarZza.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzxj[] zzxjVarArr2 = zzxjVarArr;
                        int i8 = i2;
                        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 1 + str.length());
                        sb.append(i3);
                        sb.append(":");
                        sb.append(str);
                        zztVarZza.zza(sb.toString());
                        String str2 = zzvVarZza.zzn;
                        if (str2 != null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 1 + str2.length());
                            sb2.append(i3);
                            sb2.append(":");
                            sb2.append(str2);
                            zztVarZza.zzm(sb2.toString());
                        }
                        zzvVarArr[i7] = zztVarZza.zzP();
                        i7++;
                        zzxjVarArr = zzxjVarArr2;
                        i2 = i8;
                    }
                    zzxj[] zzxjVarArr3 = zzxjVarArr;
                    int i9 = i2;
                    String str3 = zzbgVarZza.zzb;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 1 + String.valueOf(str3).length());
                    sb3.append(i3);
                    sb3.append(":");
                    sb3.append(str3);
                    zzbg zzbgVar = new zzbg(sb3.toString(), zzvVarArr);
                    this.zze.put(zzbgVar, zzbgVarZza);
                    i2 = i9 + 1;
                    zzbgVarArr[i9] = zzbgVar;
                    i5++;
                    zzxjVarArr = zzxjVarArr3;
                }
            }
            this.zzg = new zzzo(zzbgVarArr);
            zzxi zzxiVar = this.zzf;
            zzxiVar.getClass();
            zzxiVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzq(long j, boolean z) {
        for (zzxj zzxjVar : this.zzh) {
            zzxjVar.zzq(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzr() {
        long j = -9223372036854775807L;
        for (zzxj zzxjVar : this.zzh) {
            long jZzr = zzxjVar.zzr();
            if (jZzr == -9223372036854775807L) {
                if (j != -9223372036854775807L && zzxjVar.zzt(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zzxj zzxjVar2 : this.zzh) {
                    if (zzxjVar2 == zzxjVar) {
                        break;
                    }
                    if (zzxjVar2.zzt(jZzr) != jZzr) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzr;
            } else if (jZzr != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final /* bridge */ /* synthetic */ void zzs(zzzf zzzfVar) {
        zzxi zzxiVar = this.zzf;
        zzxiVar.getClass();
        zzxiVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzt(long j) {
        long jZzt = this.zzh[0].zzt(j);
        int i = 1;
        while (true) {
            zzxj[] zzxjVarArr = this.zzh;
            if (i >= zzxjVarArr.length) {
                return jZzt;
            }
            if (zzxjVarArr[i].zzt(jZzt) != jZzt) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzu(long j, zznk zznkVar) {
        zzxj[] zzxjVarArr = this.zzh;
        return (zzxjVarArr.length > 0 ? zzxjVarArr[0] : this.zza[0]).zzu(j, zznkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final zzzo zzn() {
        zzzo zzzoVar = this.zzg;
        zzzoVar.getClass();
        return zzzoVar;
    }
}
