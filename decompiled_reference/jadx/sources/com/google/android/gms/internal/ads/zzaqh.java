package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaqh implements zzaqa {
    private final zzard zza;
    private long zzf;
    private String zzh;
    private zzahm zzi;
    private zzaqg zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzaqr zzc = new zzaqr(7, 128);
    private final zzaqr zzd = new zzaqr(8, 128);
    private final zzaqr zze = new zzaqr(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzeu zzn = new zzeu();

    public zzaqh(zzard zzardVar, boolean z, boolean z2, String str) {
        this.zza = zzardVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j2, this.zzm);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i, i2);
            this.zzd.zzd(bArr, i, i2);
        }
        this.zze.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgr.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaqg zzaqgVar = this.zzj;
        if (zzaqgVar != null) {
            zzaqgVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzh = zzaroVar.zzc();
        this.zzi = zzagdVar.zzs(zzaroVar.zzb(), 2);
        this.zzj = new zzaqg(this.zzi, false, false);
        this.zza.zza(zzagdVar, zzaroVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j, int i) {
        this.zzl = j;
        int i2 = i & 2;
        this.zzm = (i2 != 0) | this.zzm;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) {
        int i;
        int i2;
        this.zzi.getClass();
        String str = zzfm.zza;
        int iZzg = zzeuVar.zzg();
        int iZze = zzeuVar.zze();
        byte[] bArrZzi = zzeuVar.zzi();
        this.zzf += (long) zzeuVar.zzd();
        this.zzi.zzc(zzeuVar, zzeuVar.zzd());
        while (true) {
            int iZzi = zzgr.zzi(bArrZzi, iZzg, iZze, this.zzg);
            if (iZzi == iZze) {
                zzg(bArrZzi, iZzg, iZze);
                return;
            }
            int i3 = bArrZzi[iZzi + 3] & Ascii.US;
            if (iZzi > 0) {
                int i4 = iZzi - 1;
                if (bArrZzi[i4] == 0) {
                    i2 = 4;
                    i = i4;
                } else {
                    i = iZzi;
                    i2 = 3;
                }
            } else {
                i = iZzi;
                i2 = 3;
            }
            int i5 = i - iZzg;
            if (i5 > 0) {
                zzg(bArrZzi, iZzg, i);
            }
            int i6 = iZze - i;
            long j = this.zzf - ((long) i6);
            zzh(j, i6, i5 < 0 ? -i5 : 0, this.zzl);
            zzf(j, i3, this.zzl);
            iZzg = i + i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z) {
        this.zzi.getClass();
        String str = zzfm.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        if (!this.zzk) {
            zzaqr zzaqrVar = this.zzc;
            zzaqrVar.zze(i2);
            zzaqr zzaqrVar2 = this.zzd;
            zzaqrVar2.zze(i2);
            if (this.zzk) {
                if (zzaqrVar.zzb()) {
                    zzgq zzgqVarZze = zzgr.zze(zzaqrVar.zza, 4, zzaqrVar.zzb);
                    this.zza.zzb(zzgqVarZze.zzm);
                    this.zzj.zza(zzgqVarZze);
                    zzaqrVar.zza();
                } else if (zzaqrVar2.zzb()) {
                    this.zzj.zzb(zzgr.zzh(zzaqrVar2.zza, 4, zzaqrVar2.zzb));
                    zzaqrVar2.zza();
                }
            } else if (zzaqrVar.zzb() && zzaqrVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzaqrVar.zza, zzaqrVar.zzb));
                arrayList.add(Arrays.copyOf(zzaqrVar2.zza, zzaqrVar2.zzb));
                zzgq zzgqVarZze2 = zzgr.zze(zzaqrVar.zza, 4, zzaqrVar.zzb);
                zzgp zzgpVarZzh = zzgr.zzh(zzaqrVar2.zza, 4, zzaqrVar2.zzb);
                String strZzb = zzdr.zzb(zzgqVarZze2.zza, zzgqVarZze2.zzb, zzgqVarZze2.zzc);
                zzahm zzahmVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzn(this.zzb);
                zztVar.zzo("video/avc");
                zztVar.zzk(strZzb);
                zztVar.zzv(zzgqVarZze2.zze);
                zztVar.zzw(zzgqVarZze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzgqVarZze2.zzj);
                zzhVar.zzb(zzgqVarZze2.zzk);
                zzhVar.zzc(zzgqVarZze2.zzl);
                zzhVar.zze(zzgqVarZze2.zzh + 8);
                zzhVar.zzf(zzgqVarZze2.zzi + 8);
                zztVar.zzE(zzhVar.zzg());
                zztVar.zzB(zzgqVarZze2.zzg);
                zztVar.zzr(arrayList);
                int i3 = zzgqVarZze2.zzm;
                zztVar.zzq(i3);
                zzahmVar.zzA(zztVar.zzP());
                this.zzk = true;
                this.zza.zzb(i3);
                this.zzj.zza(zzgqVarZze2);
                this.zzj.zzb(zzgpVarZzh);
                zzaqrVar.zza();
                zzaqrVar2.zza();
            }
        }
        zzaqr zzaqrVar3 = this.zze;
        if (zzaqrVar3.zze(i2)) {
            int iZza = zzgr.zza(zzaqrVar3.zza, zzaqrVar3.zzb);
            zzeu zzeuVar = this.zzn;
            zzeuVar.zzb(zzaqrVar3.zza, iZza);
            zzeuVar.zzh(4);
            this.zza.zzc(j2, zzeuVar);
        }
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }
}
