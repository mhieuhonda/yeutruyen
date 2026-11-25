package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaip extends zzaio {
    private final zzeu zzb;
    private final zzeu zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaip(zzahm zzahmVar) {
        super(zzahmVar);
        this.zzb = new zzeu(zzgr.zza);
        this.zzc = new zzeu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    protected final boolean zza(zzeu zzeuVar) throws zzain {
        int iZzs = zzeuVar.zzs();
        int i = iZzs >> 4;
        int i2 = iZzs & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new zzain(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    protected final boolean zzb(zzeu zzeuVar, long j) throws zzat {
        int i;
        int iZzs = zzeuVar.zzs();
        long jZzy = zzeuVar.zzy();
        if (iZzs == 0) {
            if (!this.zze) {
                zzeu zzeuVar2 = new zzeu(new byte[zzeuVar.zzd()]);
                zzeuVar.zzm(zzeuVar2.zzi(), 0, zzeuVar.zzd());
                zzaff zzaffVarZza = zzaff.zza(zzeuVar2);
                this.zzd = zzaffVarZza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzn("video/x-flv");
                zztVar.zzo("video/avc");
                zztVar.zzk(zzaffVarZza.zzl);
                zztVar.zzv(zzaffVarZza.zzc);
                zztVar.zzw(zzaffVarZza.zzd);
                zztVar.zzB(zzaffVarZza.zzk);
                zztVar.zzr(zzaffVarZza.zza);
                this.zza.zzA(zztVar.zzP());
                this.zze = true;
                return false;
            }
        } else if (iZzs == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            zzeu zzeuVar3 = this.zzc;
            byte[] bArrZzi = zzeuVar3.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzeuVar.zzd() > 0) {
                zzeuVar.zzm(zzeuVar3.zzi(), i3, this.zzd);
                zzeuVar3.zzh(0);
                zzeu zzeuVar4 = this.zzb;
                int iZzH = zzeuVar3.zzH();
                zzeuVar4.zzh(0);
                zzahm zzahmVar = this.zza;
                zzahmVar.zzc(zzeuVar4, 4);
                zzahmVar.zzc(zzeuVar, iZzH);
                i4 = i4 + 4 + iZzH;
            }
            this.zza.zze(j + (jZzy * 1000), i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
