package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzari implements zzara {
    final /* synthetic */ zzark zza;
    private final zzet zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzari(zzark zzarkVar, int i) {
        Objects.requireNonNull(zzarkVar);
        this.zza = zzarkVar;
        this.zzb = new zzet(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzfj zzfjVar, zzagd zzagdVar, zzaro zzaroVar) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzb(zzeu zzeuVar) {
        int i;
        if (zzeuVar.zzs() != 2) {
            return;
        }
        zzark zzarkVar = this.zza;
        zzfj zzfjVar = (zzfj) zzarkVar.zzh().get(0);
        if ((zzeuVar.zzs() & 128) != 0) {
            zzeuVar.zzk(1);
            int iZzt = zzeuVar.zzt();
            int i2 = 3;
            zzeuVar.zzk(3);
            zzet zzetVar = this.zzb;
            zzeuVar.zzl(zzetVar, 2);
            zzetVar.zzh(3);
            int i3 = 13;
            zzarkVar.zzq(zzetVar.zzj(13));
            zzeuVar.zzl(zzetVar, 2);
            int i4 = 4;
            zzetVar.zzh(4);
            int i5 = 12;
            zzeuVar.zzk(zzetVar.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzeuVar.zzd();
            while (iZzd > 0) {
                int i6 = 5;
                zzeuVar.zzl(zzetVar, 5);
                int iZzj = zzetVar.zzj(8);
                zzetVar.zzh(i2);
                int iZzj2 = zzetVar.zzj(i3);
                zzetVar.zzh(i4);
                int iZzj3 = zzetVar.zzj(i5);
                int iZzg = zzeuVar.zzg();
                int i7 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i8 = -1;
                int iZzs = 0;
                while (zzeuVar.zzg() < i7) {
                    int iZzs2 = zzeuVar.zzs();
                    int iZzg2 = zzeuVar.zzg() + zzeuVar.zzs();
                    if (iZzg2 > i7) {
                        break;
                    }
                    if (iZzs2 == i6) {
                        long jZzz = zzeuVar.zzz();
                        if (jZzz == 1094921523) {
                            zzarkVar = zzarkVar;
                            i8 = 129;
                        } else if (jZzz == 1161904947) {
                            zzarkVar = zzarkVar;
                            zzetVar = zzetVar;
                            iZzd = iZzd;
                            i8 = 135;
                            iZzg2 = iZzg2;
                        } else if (jZzz == 1094921524) {
                            zzarkVar = zzarkVar;
                            i8 = 172;
                        } else if (jZzz == 1212503619) {
                            i = 36;
                            i8 = i;
                        }
                    } else if (iZzs2 == 106) {
                        zzarkVar = zzarkVar;
                        i8 = 129;
                    } else if (iZzs2 == 122) {
                        zzarkVar = zzarkVar;
                        zzetVar = zzetVar;
                        iZzd = iZzd;
                        i8 = 135;
                        iZzg2 = iZzg2;
                    } else {
                        if (iZzs2 == 127) {
                            int iZzs3 = zzeuVar.zzs();
                            if (iZzs3 == 21) {
                                zzarkVar = zzarkVar;
                                i8 = 172;
                            } else if (iZzs3 == 14) {
                                i = 136;
                            } else if (iZzs3 == 33) {
                                i = 139;
                            }
                        } else if (iZzs2 == 123) {
                            i = 138;
                        } else if (iZzs2 == 10) {
                            String strTrim = zzeuVar.zzK(3, StandardCharsets.UTF_8).trim();
                            iZzs = zzeuVar.zzs();
                            str = strTrim;
                        } else if (iZzs2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzeuVar.zzg() < iZzg2) {
                                int i9 = iZzg2;
                                String strTrim2 = zzeuVar.zzK(3, StandardCharsets.UTF_8).trim();
                                int iZzs4 = zzeuVar.zzs();
                                int i10 = iZzd;
                                byte[] bArr = new byte[4];
                                zzeuVar.zzm(bArr, 0, 4);
                                arrayList2.add(new zzarl(strTrim2, iZzs4, bArr));
                                iZzd = i10;
                                iZzg2 = i9;
                                zzetVar = zzetVar;
                                zzarkVar = zzarkVar;
                            }
                            zzarkVar = zzarkVar;
                            iZzg2 = iZzg2;
                            zzetVar = zzetVar;
                            iZzd = iZzd;
                            arrayList = arrayList2;
                            i8 = 89;
                        } else {
                            zzarkVar = zzarkVar;
                            iZzg2 = iZzg2;
                            zzetVar = zzetVar;
                            iZzd = iZzd;
                            if (iZzs2 == 111) {
                                i8 = 257;
                            }
                        }
                        i8 = i;
                    }
                    zzeuVar.zzk(iZzg2 - zzeuVar.zzg());
                    iZzd = iZzd;
                    zzetVar = zzetVar;
                    zzarkVar = zzarkVar;
                    i6 = 5;
                }
                zzark zzarkVar2 = zzarkVar;
                zzet zzetVar2 = zzetVar;
                int i11 = iZzd;
                zzeuVar.zzh(i7);
                zzarm zzarmVar = new zzarm(i8, str, iZzs, arrayList, Arrays.copyOfRange(zzeuVar.zzi(), iZzg, i7));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzarmVar.zza;
                }
                iZzd = i11 - (iZzj3 + 5);
                if (!zzarkVar2.zzk().get(iZzj2)) {
                    zzarp zzarpVarZzb = zzarkVar2.zzi().zzb(iZzj, zzarmVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzarpVarZzb);
                }
                i4 = 4;
                zzetVar = zzetVar2;
                zzarkVar = zzarkVar2;
                i2 = 3;
                i3 = 13;
                i5 = 12;
            }
            zzark zzarkVar3 = zzarkVar;
            int size = sparseIntArray.size();
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                zzarkVar3.zzk().put(iKeyAt, true);
                zzarkVar3.zzl().put(iValueAt, true);
                zzarp zzarpVar = (zzarp) sparseArray.valueAt(i12);
                if (zzarpVar != null) {
                    zzarpVar.zza(zzfjVar, zzarkVar3.zzm(), new zzaro(iZzt, iKeyAt, 8192));
                    zzarkVar3.zzj().put(iValueAt, zzarpVar);
                }
            }
            zzarkVar3.zzj().remove(this.zze);
            zzarkVar3.zzo(0);
            if (zzarkVar3.zzn() == 0) {
                zzarkVar3.zzm().zzv();
                zzarkVar3.zzp(true);
            }
        }
    }
}
