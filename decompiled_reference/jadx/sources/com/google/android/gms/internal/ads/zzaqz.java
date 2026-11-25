package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaqz implements zzaga {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzaqv zzi;
    private zzagd zzj;
    private boolean zzk;
    private final zzfj zza = new zzfj(0);
    private final zzeu zzc = new zzeu(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzaqw zzd = new zzaqw();

    static {
        int i = zzaqy.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        byte[] bArr = new byte[14];
        zzagbVar.zzi(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzagbVar.zzk(bArr[13] & 7);
        zzagbVar.zzi(bArr, 0, 3);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzj = zzagdVar;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        zzaqa zzaqcVar;
        zzagd zzagdVar = this.zzj;
        zzagdVar.getClass();
        long jZzo = zzagbVar.zzo();
        if (jZzo != -1) {
            zzaqw zzaqwVar = this.zzd;
            if (!zzaqwVar.zza()) {
                return zzaqwVar.zzc(zzagbVar, zzahaVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzaqw zzaqwVar2 = this.zzd;
            if (zzaqwVar2.zzd() != -9223372036854775807L) {
                zzaqv zzaqvVar = new zzaqv(zzaqwVar2.zzb(), zzaqwVar2.zzd(), jZzo);
                this.zzi = zzaqvVar;
                this.zzj.zzw(zzaqvVar.zza());
            } else {
                zzagdVar.zzw(new zzahc(zzaqwVar2.zzd(), 0L));
            }
        }
        zzaqv zzaqvVar2 = this.zzi;
        if (zzaqvVar2 != null && zzaqvVar2.zzc()) {
            return zzaqvVar2.zzd(zzagbVar, zzahaVar);
        }
        zzagbVar.zzl();
        long jZzm = jZzo != -1 ? jZzo - zzagbVar.zzm() : -1L;
        if (jZzm != -1 && jZzm < 4) {
            return -1;
        }
        zzeu zzeuVar = this.zzc;
        if (!zzagbVar.zzh(zzeuVar.zzi(), 0, 4, true)) {
            return -1;
        }
        zzeuVar.zzh(0);
        int iZzB = zzeuVar.zzB();
        if (iZzB == 441) {
            return -1;
        }
        if (iZzB == 442) {
            zzagbVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(9);
            zzagbVar.zzf((zzeuVar.zzs() & 7) + 14);
            return 0;
        }
        if (iZzB == 443) {
            zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
            zzeuVar.zzh(0);
            zzagbVar.zzf(zzeuVar.zzt() + 6);
            return 0;
        }
        if ((iZzB >> 8) != 1) {
            zzagbVar.zzf(1);
            return 0;
        }
        int i = iZzB & 255;
        SparseArray sparseArray = this.zzb;
        zzaqx zzaqxVar = (zzaqx) sparseArray.get(i);
        if (!this.zze) {
            if (zzaqxVar == null) {
                zzaqa zzaqaVar = null;
                if (i == 189) {
                    zzaqcVar = new zzapq(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzagbVar.zzn();
                } else if ((iZzB & 224) == 192) {
                    zzaqcVar = new zzaqm(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzagbVar.zzn();
                } else if ((iZzB & 240) == 224) {
                    zzaqcVar = new zzaqc(null, "video/mp2p");
                    this.zzg = true;
                    this.zzh = zzagbVar.zzn();
                } else if (zzaqaVar != null) {
                    zzaqaVar.zzb(this.zzj, new zzaro(Integer.MIN_VALUE, i, 256));
                    zzaqxVar = new zzaqx(zzaqaVar, this.zza);
                    sparseArray.put(i, zzaqxVar);
                }
                zzaqaVar = zzaqcVar;
                if (zzaqaVar != null) {
                    zzaqaVar.zzb(this.zzj, new zzaro(Integer.MIN_VALUE, i, 256));
                    zzaqxVar = new zzaqx(zzaqaVar, this.zza);
                    sparseArray.put(i, zzaqxVar);
                }
            }
            long j = 1048576;
            if (this.zzf && this.zzg) {
                j = 8192 + this.zzh;
            }
            if (zzagbVar.zzn() > j) {
                this.zze = true;
                this.zzj.zzv();
            }
        }
        zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
        zzeuVar.zzh(0);
        int iZzt = zzeuVar.zzt() + 6;
        if (zzaqxVar == null) {
            zzagbVar.zzf(iZzt);
        } else {
            zzeuVar.zza(iZzt);
            zzagbVar.zzc(zzeuVar.zzi(), 0, iZzt);
            zzeuVar.zzh(6);
            zzaqxVar.zzb(zzeuVar);
            zzeuVar.zzf(zzeuVar.zzj());
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        zzfj zzfjVar = this.zza;
        if (zzfjVar.zzc() != -9223372036854775807L) {
            long jZza = zzfjVar.zza();
            if (jZza != -9223372036854775807L && jZza != 0 && jZza != j2) {
                zzfjVar.zzd(j2);
            }
        } else {
            zzfjVar.zzd(j2);
        }
        zzaqv zzaqvVar = this.zzi;
        int i = 0;
        if (zzaqvVar != null) {
            zzaqvVar.zzb(j2);
        }
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i >= sparseArray.size()) {
                return;
            }
            ((zzaqx) sparseArray.valueAt(i)).zza();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }
}
