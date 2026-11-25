package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzark implements zzaga {
    private final int zza;
    private final List zzb;
    private final zzeu zzc;
    private final SparseIntArray zzd;
    private final zzarn zze;
    private final zzanq zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzarg zzj;
    private zzarf zzk;
    private zzagd zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i = zzarj.zza;
    }

    @Deprecated
    public zzark() {
        this(1, 1, zzanq.zza, new zzfj(0L), new zzapx(0), 112800);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        byte[] bArrZzi = this.zzc.zzi();
        zzagbVar.zzi(bArrZzi, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    zzagbVar.zzf(i);
                    return true;
                }
                if (bArrZzi[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        if (this.zza == 0) {
            zzagdVar = new zzant(zzagdVar, this.zzf);
        }
        this.zzl = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        long j;
        long jZzo = zzagbVar.zzo();
        long j2 = -1;
        if (this.zzn) {
            if (jZzo != -1) {
                zzarg zzargVar = this.zzj;
                if (!zzargVar.zza()) {
                    return zzargVar.zzb(zzagbVar, zzahaVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = 0;
            } else {
                this.zzo = true;
                zzarg zzargVar2 = this.zzj;
                if (zzargVar2.zzc() != -9223372036854775807L) {
                    j = 0;
                    zzarf zzarfVar = new zzarf(zzargVar2.zzd(), zzargVar2.zzc(), jZzo, this.zzr, 112800);
                    this.zzk = zzarfVar;
                    this.zzl.zzw(zzarfVar.zza());
                } else {
                    j = 0;
                    this.zzl.zzw(new zzahc(zzargVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zze(j, j);
                if (zzagbVar.zzn() != j) {
                    zzahaVar.zza = j;
                    return 1;
                }
            }
            zzarf zzarfVar2 = this.zzk;
            if (zzarfVar2 != null && zzarfVar2.zzc()) {
                return zzarfVar2.zzd(zzagbVar, zzahaVar);
            }
        } else {
            j2 = -1;
        }
        zzeu zzeuVar = this.zzc;
        byte[] bArrZzi = zzeuVar.zzi();
        if (9400 - zzeuVar.zzg() < 188) {
            int iZzd = zzeuVar.zzd();
            if (iZzd > 0) {
                System.arraycopy(bArrZzi, zzeuVar.zzg(), bArrZzi, 0, iZzd);
            }
            zzeuVar.zzb(bArrZzi, iZzd);
        }
        while (zzeuVar.zzd() < 188) {
            int iZze = zzeuVar.zze();
            int iZza = zzagbVar.zza(bArrZzi, iZze, 9400 - iZze);
            if (iZza == -1) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzarp zzarpVar = (zzarp) sparseArray.valueAt(i);
                    if (zzarpVar instanceof zzaqt) {
                        zzaqt zzaqtVar = (zzaqt) zzarpVar;
                        if (zzaqtVar.zzd(false)) {
                            zzaqtVar.zzc(new zzeu(), 1);
                        }
                    }
                    i++;
                }
            } else {
                zzeuVar.zzf(iZze + iZza);
            }
        }
        int iZzg = zzeuVar.zzg();
        int iZze2 = zzeuVar.zze();
        int iZza2 = zzarq.zza(zzeuVar.zzi(), iZzg, iZze2);
        zzeuVar.zzh(iZza2);
        int i2 = iZza2 + 188;
        if (i2 > iZze2) {
            this.zzq += iZza2 - iZzg;
        } else {
            this.zzq = 0;
        }
        int iZze3 = zzeuVar.zze();
        if (i2 > iZze3) {
            return 0;
        }
        int iZzB = zzeuVar.zzB();
        if ((8388608 & iZzB) != 0) {
            zzeuVar.zzh(i2);
            return 0;
        }
        int i3 = (4194304 & iZzB) != 0 ? 1 : 0;
        int i4 = iZzB & 32;
        int i5 = (iZzB >> 8) & 8191;
        zzarp zzarpVar2 = (iZzB & 16) != 0 ? (zzarp) this.zzg.get(i5) : null;
        if (zzarpVar2 == null) {
            zzeuVar.zzh(i2);
            return 0;
        }
        int i6 = iZzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i7 = sparseIntArray.get(i5, i6 - 1);
        sparseIntArray.put(i5, i6);
        if (i7 == i6) {
            zzeuVar.zzh(i2);
            return 0;
        }
        if (i6 != ((i7 + 1) & 15)) {
            zzarpVar2.zzb();
        }
        if (i4 != 0) {
            int iZzs = zzeuVar.zzs();
            i3 |= (zzeuVar.zzs() & 64) != 0 ? 2 : 0;
            zzeuVar.zzk(iZzs - 1);
        }
        boolean z = this.zzn;
        if (z || !this.zzi.get(i5, false)) {
            zzeuVar.zzf(i2);
            zzarpVar2.zzc(zzeuVar, i3);
            zzeuVar.zzf(iZze3);
        }
        if (!z && this.zzn && jZzo != j2) {
            this.zzp = true;
        }
        zzeuVar.zzh(i2);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        zzarf zzarfVar;
        List list = this.zzb;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzfj zzfjVar = (zzfj) list.get(i);
            if (zzfjVar.zzc() != -9223372036854775807L) {
                long jZza = zzfjVar.zza();
                if (jZza != -9223372036854775807L && jZza != 0 && jZza != j2) {
                    zzfjVar.zzd(j2);
                }
            } else {
                zzfjVar.zzd(j2);
            }
        }
        if (j2 != 0 && (zzarfVar = this.zzk) != null) {
            zzarfVar.zzb(j2);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i2 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzarp) sparseArray.valueAt(i2)).zzb();
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    final /* synthetic */ List zzh() {
        return this.zzb;
    }

    final /* synthetic */ zzarn zzi() {
        return this.zze;
    }

    final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    final /* synthetic */ zzagd zzm() {
        return this.zzl;
    }

    final /* synthetic */ int zzn() {
        return this.zzm;
    }

    final /* synthetic */ void zzo(int i) {
        this.zzm = i;
    }

    final /* synthetic */ void zzp(boolean z) {
        this.zzn = true;
    }

    final /* synthetic */ void zzq(int i) {
        this.zzr = i;
    }

    public zzark(int i, int i2, zzanq zzanqVar, zzfj zzfjVar, zzarn zzarnVar, int i3) {
        this.zze = zzarnVar;
        this.zza = i2;
        this.zzf = zzanqVar;
        this.zzb = Collections.singletonList(zzfjVar);
        this.zzc = new zzeu(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzarg(112800);
        this.zzl = zzagd.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzarnVar.zza();
        int size = sparseArrayZza.size();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray2 = this.zzg;
            if (i4 >= size) {
                sparseArray2.put(0, new zzarb(new zzarh(this)));
                return;
            } else {
                sparseArray2.put(sparseArrayZza.keyAt(i4), (zzarp) sparseArrayZza.valueAt(i4));
                i4++;
            }
        }
    }
}
