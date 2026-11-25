package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacj {
    private static final Comparator zza = zzaci.zza;
    private static final Comparator zzb = zzach.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzacg[] zzd = new zzacg[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzacj(int i) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i, float f) {
        zzacg zzacgVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzacg[] zzacgVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzacgVar = zzacgVarArr[i3];
        } else {
            zzacgVar = new zzacg(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzacgVar.zza = i4;
        zzacgVar.zzb = i;
        zzacgVar.zzc = f;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzacgVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            zzacg zzacgVar2 = (zzacg) arrayList.get(0);
            int i7 = zzacgVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                arrayList.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzacg[] zzacgVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzacgVarArr2[i8] = zzacgVar2;
                }
            } else {
                zzacgVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final float zzc(float f) {
        int i = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzacg) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f3 = 0.5f * f2;
            zzacg zzacgVar = (zzacg) arrayList.get(i);
            i2 += zzacgVar.zzb;
            if (i2 >= f3) {
                return zzacgVar.zzc;
            }
            i++;
        }
    }
}
