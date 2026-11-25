package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaff {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzaff(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = i9;
        this.zzk = f;
        this.zzl = str;
    }

    public static zzaff zza(zzeu zzeuVar) throws zzat {
        String strZzb;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            zzeuVar.zzk(4);
            int iZzs = (zzeuVar.zzs() & 3) + 1;
            if (iZzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzs2 = zzeuVar.zzs() & 31;
            for (int i9 = 0; i9 < iZzs2; i9++) {
                arrayList.add(zzb(zzeuVar));
            }
            int iZzs3 = zzeuVar.zzs();
            for (int i10 = 0; i10 < iZzs3; i10++) {
                arrayList.add(zzb(zzeuVar));
            }
            if (iZzs2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = zzgr.zza;
                zzgq zzgqVarZze = zzgr.zze(bArr2, 5, bArr.length);
                int i11 = zzgqVarZze.zze;
                int i12 = zzgqVarZze.zzf;
                int i13 = zzgqVarZze.zzh + 8;
                int i14 = zzgqVarZze.zzi + 8;
                int i15 = zzgqVarZze.zzj;
                int i16 = zzgqVarZze.zzk;
                int i17 = zzgqVarZze.zzl;
                int i18 = zzgqVarZze.zzm;
                float f2 = zzgqVarZze.zzg;
                strZzb = zzdr.zzb(zzgqVarZze.zza, zzgqVarZze.zzb, zzgqVarZze.zzc);
                i5 = i17;
                i6 = i18;
                f = f2;
                i4 = i14;
                i7 = i15;
                i8 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                strZzb = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new zzaff(arrayList, iZzs, i, i2, i3, i4, i7, i8, i5, i6, f, strZzb);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.zzb("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzeu zzeuVar) {
        int iZzt = zzeuVar.zzt();
        int iZzg = zzeuVar.zzg();
        zzeuVar.zzk(iZzt);
        return zzdr.zzh(zzeuVar.zzi(), iZzg, iZzt);
    }
}
