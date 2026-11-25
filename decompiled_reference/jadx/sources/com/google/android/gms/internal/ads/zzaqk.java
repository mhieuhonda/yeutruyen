package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaqk implements zzaqa {
    private zzahm zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = "video/mp2t";
    private final zzeu zzb = new zzeu(10);
    private long zze = -9223372036854775807L;

    public zzaqk(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzd = false;
        this.zze = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        zzahm zzahmVarZzs = zzagdVar.zzs(zzaroVar.zzb(), 5);
        this.zzc = zzahmVarZzs;
        zzt zztVar = new zzt();
        zztVar.zza(zzaroVar.zzc());
        zztVar.zzn(this.zza);
        zztVar.zzo("application/id3");
        zzahmVarZzs.zzA(zztVar.zzP());
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int iZzd = zzeuVar.zzd();
            int i = this.zzg;
            if (i < 10) {
                int iMin = Math.min(iZzd, 10 - i);
                byte[] bArrZzi = zzeuVar.zzi();
                int iZzg = zzeuVar.zzg();
                zzeu zzeuVar2 = this.zzb;
                System.arraycopy(bArrZzi, iZzg, zzeuVar2.zzi(), this.zzg, iMin);
                if (this.zzg + iMin == 10) {
                    zzeuVar2.zzh(0);
                    if (zzeuVar2.zzs() != 73 || zzeuVar2.zzs() != 68 || zzeuVar2.zzs() != 51) {
                        zzeh.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzeuVar2.zzk(3);
                        this.zzf = zzeuVar2.zzG() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZzd, this.zzf - this.zzg);
            this.zzc.zzc(zzeuVar, iMin2);
            this.zzg += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z) {
        int i;
        this.zzc.getClass();
        if (this.zzd && (i = this.zzf) != 0 && this.zzg == i) {
            zzgtr.zzi(this.zze != -9223372036854775807L);
            this.zzc.zze(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }
}
