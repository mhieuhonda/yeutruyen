package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaqj implements zzaqa {
    private final zzard zza;
    private String zzb;
    private zzahm zzc;
    private zzaqi zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaqr zzg = new zzaqr(32, 128);
    private final zzaqr zzh = new zzaqr(33, 128);
    private final zzaqr zzi = new zzaqr(34, 128);
    private final zzaqr zzj = new zzaqr(39, 128);
    private final zzaqr zzk = new zzaqr(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzeu zzn = new zzeu();

    public zzaqj(zzard zzardVar, String str) {
        this.zza = zzardVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, int i2, long j2) {
        this.zzd.zzb(j, i, i2, j2, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i2);
            this.zzh.zzc(i2);
            this.zzi.zzc(i2);
        }
        this.zzj.zzc(i2);
        this.zzk.zzc(i2);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i2);
            this.zzh.zzd(bArr, i, i2);
            this.zzi.zzd(bArr, i, i2);
        }
        this.zzj.zzd(bArr, i, i2);
        this.zzk.zzd(bArr, i, i2);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        this.zzd.zzd(j, i, this.zze);
        if (!this.zze) {
            zzaqr zzaqrVar = this.zzg;
            zzaqrVar.zze(i2);
            zzaqr zzaqrVar2 = this.zzh;
            zzaqrVar2.zze(i2);
            zzaqr zzaqrVar3 = this.zzi;
            zzaqrVar3.zze(i2);
            if (zzaqrVar.zzb() && zzaqrVar2.zzb() && zzaqrVar3.zzb()) {
                String str = this.zzb;
                int i3 = zzaqrVar.zzb;
                byte[] bArr = new byte[zzaqrVar2.zzb + i3 + zzaqrVar3.zzb];
                System.arraycopy(zzaqrVar.zza, 0, bArr, 0, i3);
                System.arraycopy(zzaqrVar2.zza, 0, bArr, zzaqrVar.zzb, zzaqrVar2.zzb);
                System.arraycopy(zzaqrVar3.zza, 0, bArr, zzaqrVar.zzb + zzaqrVar2.zzb, zzaqrVar3.zzb);
                String strZzc = null;
                zzgl zzglVarZzg = zzgr.zzg(zzaqrVar2.zza, 3, zzaqrVar2.zzb, null);
                zzgg zzggVar = zzglVarZzg.zzb;
                if (zzggVar != null) {
                    int i4 = zzggVar.zzf;
                    int[] iArr = zzggVar.zze;
                    int i5 = zzggVar.zzd;
                    strZzc = zzdr.zzc(zzggVar.zza, zzggVar.zzb, zzggVar.zzc, i5, iArr, i4);
                }
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzn("video/mp2t");
                zztVar.zzo("video/hevc");
                zztVar.zzk(strZzc);
                zztVar.zzv(zzglVarZzg.zze);
                zztVar.zzw(zzglVarZzg.zzf);
                zztVar.zzx(zzglVarZzg.zzg);
                zztVar.zzy(zzglVarZzg.zzh);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzglVarZzg.zzk);
                zzhVar.zzb(zzglVarZzg.zzl);
                zzhVar.zzc(zzglVarZzg.zzm);
                zzhVar.zze(zzglVarZzg.zzc + 8);
                zzhVar.zzf(zzglVarZzg.zzd + 8);
                zztVar.zzE(zzhVar.zzg());
                zztVar.zzB(zzglVarZzg.zzi);
                zztVar.zzq(zzglVarZzg.zzj);
                zztVar.zzF(zzglVarZzg.zza + 1);
                zztVar.zzr(Collections.singletonList(bArr));
                zzv zzvVarZzP = zztVar.zzP();
                this.zzc.zzA(zzvVarZzP);
                int i6 = zzvVarZzP.zzr;
                zzgtr.zzi(i6 != -1);
                this.zza.zzb(i6);
                this.zze = true;
            }
        }
        zzaqr zzaqrVar4 = this.zzj;
        if (zzaqrVar4.zze(i2)) {
            int iZza = zzgr.zza(zzaqrVar4.zza, zzaqrVar4.zzb);
            zzeu zzeuVar = this.zzn;
            zzeuVar.zzb(zzaqrVar4.zza, iZza);
            zzeuVar.zzk(5);
            this.zza.zzc(j2, zzeuVar);
        }
        zzaqr zzaqrVar5 = this.zzk;
        if (zzaqrVar5.zze(i2)) {
            int iZza2 = zzgr.zza(zzaqrVar5.zza, zzaqrVar5.zzb);
            zzeu zzeuVar2 = this.zzn;
            zzeuVar2.zzb(zzaqrVar5.zza, iZza2);
            zzeuVar2.zzk(5);
            this.zza.zzc(j2, zzeuVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgr.zzj(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaqi zzaqiVar = this.zzd;
        if (zzaqiVar != null) {
            zzaqiVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzb = zzaroVar.zzc();
        this.zzc = zzagdVar.zzs(zzaroVar.zzb(), 2);
        this.zzd = new zzaqi(this.zzc);
        this.zza.zza(zzagdVar, zzaroVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) {
        this.zzc.getClass();
        String str = zzfm.zza;
        while (zzeuVar.zzd() > 0) {
            int iZzg = zzeuVar.zzg();
            int iZze = zzeuVar.zze();
            byte[] bArrZzi = zzeuVar.zzi();
            this.zzl += (long) zzeuVar.zzd();
            this.zzc.zzc(zzeuVar, zzeuVar.zzd());
            while (iZzg < iZze) {
                int iZzi = zzgr.zzi(bArrZzi, iZzg, iZze, this.zzf);
                if (iZzi == iZze) {
                    zzg(bArrZzi, iZzg, iZze);
                    return;
                }
                int i = bArrZzi[iZzi + 3] & 126;
                int i2 = 3;
                if (iZzi > 0) {
                    int i3 = iZzi - 1;
                    if (bArrZzi[i3] == 0) {
                        i2 = 4;
                        iZzi = i3;
                    }
                }
                int i4 = iZzi - iZzg;
                if (i4 > 0) {
                    zzg(bArrZzi, iZzg, iZzi);
                }
                int i5 = iZze - iZzi;
                long j = this.zzl - ((long) i5);
                zzh(j, i5, i4 < 0 ? -i4 : 0, this.zzm);
                zzf(j, i5, i >> 1, this.zzm);
                iZzg = iZzi + i2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z) {
        this.zzc.getClass();
        String str = zzfm.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
