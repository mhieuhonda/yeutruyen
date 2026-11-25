package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalv {
    public final zzahm zza;
    public zzams zzd;
    public zzalp zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzv zzj;
    private boolean zzm;
    public final zzamr zzb = new zzamr();
    public final zzeu zzc = new zzeu();
    private final zzeu zzk = new zzeu(1);
    private final zzeu zzl = new zzeu();

    public zzalv(zzahm zzahmVar, zzams zzamsVar, zzalp zzalpVar, zzv zzvVar) {
        this.zza = zzahmVar;
        this.zzd = zzamsVar;
        this.zze = zzalpVar;
        this.zzj = zzvVar;
        zza(zzamsVar, zzalpVar);
    }

    public final void zza(zzams zzamsVar, zzalp zzalpVar) {
        this.zzd = zzamsVar;
        this.zze = zzalpVar;
        this.zza.zzA(this.zzj);
        zzc();
    }

    public final void zzb(zzq zzqVar) {
        zzamp zzampVar = this.zzd.zza;
        zzalp zzalpVar = this.zzb.zza;
        String str = zzfm.zza;
        zzamq zzamqVarZza = zzampVar.zza(zzalpVar.zza);
        zzq zzqVarZzb = zzqVar.zzb(zzamqVarZza != null ? zzamqVarZza.zzb : null);
        zzt zztVarZza = this.zzj.zza();
        zztVarZza.zzs(zzqVarZzb);
        this.zza.zzA(zztVarZza.zzP());
    }

    public final void zzc() {
        zzamr zzamrVar = this.zzb;
        zzamrVar.zzd = 0;
        zzamrVar.zzp = 0L;
        zzamrVar.zzq = false;
        zzamrVar.zzk = false;
        zzamrVar.zzo = false;
        zzamrVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final long zzd() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzamr zzamrVar = this.zzb;
        return zzamrVar.zzi[this.zzf];
    }

    public final long zze() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzf() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzg() {
        int i;
        if (this.zzm) {
            i = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i = this.zzd.zzg[this.zzf];
        }
        return zzj() != null ? i | 1073741824 : i;
    }

    public final boolean zzh() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }

    public final int zzi(int i, int i2) {
        zzeu zzeuVar;
        zzamq zzamqVarZzj = zzj();
        if (zzamqVarZzj == null) {
            return 0;
        }
        int i3 = zzamqVarZzj.zzd;
        if (i3 != 0) {
            zzeuVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzamqVarZzj.zze;
            String str = zzfm.zza;
            zzeu zzeuVar2 = this.zzl;
            byte[] bArr2 = bArr;
            int length = bArr2.length;
            zzeuVar2.zzb(bArr2, length);
            zzeuVar = zzeuVar2;
            i3 = length;
        }
        zzamr zzamrVar = this.zzb;
        boolean zZzb = zzamrVar.zzb(this.zzf);
        boolean z = zZzb || i2 != 0;
        zzeu zzeuVar3 = this.zzk;
        zzeuVar3.zzi()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzeuVar3.zzh(0);
        zzahm zzahmVar = this.zza;
        zzahmVar.zzd(zzeuVar3, 1, 1);
        zzahmVar.zzd(zzeuVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zZzb) {
            zzeu zzeuVar4 = this.zzc;
            zzeuVar4.zza(8);
            byte[] bArrZzi = zzeuVar4.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 1;
            bArrZzi[2] = 0;
            bArrZzi[3] = (byte) i2;
            bArrZzi[4] = (byte) ((i >> 24) & 255);
            bArrZzi[5] = (byte) ((i >> 16) & 255);
            bArrZzi[6] = (byte) ((i >> 8) & 255);
            bArrZzi[7] = (byte) (i & 255);
            zzahmVar.zzd(zzeuVar4, 8, 1);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        zzeu zzeuVar5 = zzamrVar.zzn;
        int iZzt = zzeuVar5.zzt();
        zzeuVar5.zzk(-2);
        int i5 = (iZzt * 6) + 2;
        if (i2 != 0) {
            zzeu zzeuVar6 = this.zzc;
            zzeuVar6.zza(i5);
            byte[] bArrZzi2 = zzeuVar6.zzi();
            zzeuVar5.zzm(bArrZzi2, 0, i5);
            int i6 = (((bArrZzi2[2] & 255) << 8) | (bArrZzi2[3] & 255)) + i2;
            bArrZzi2[2] = (byte) ((i6 >> 8) & 255);
            bArrZzi2[3] = (byte) (i6 & 255);
            zzeuVar5 = zzeuVar6;
        }
        zzahmVar.zzd(zzeuVar5, i5, 1);
        return i4 + i5;
    }

    public final zzamq zzj() {
        if (!this.zzm) {
            return null;
        }
        zzamr zzamrVar = this.zzb;
        zzalp zzalpVar = zzamrVar.zza;
        String str = zzfm.zza;
        int i = zzalpVar.zza;
        zzamq zzamqVarZza = zzamrVar.zzm;
        if (zzamqVarZza == null) {
            zzamqVarZza = this.zzd.zza.zza(i);
        }
        if (zzamqVarZza == null || !zzamqVarZza.zza) {
            return null;
        }
        return zzamqVarZza;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzm;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzm = true;
    }
}
