package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapz implements zzaqa {
    private final List zza;
    private final zzahm[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzapz(List list, String str) {
        this.zza = list;
        this.zzc = new zzahm[list.size()];
    }

    private final boolean zzf(zzeu zzeuVar, int i) {
        if (zzeuVar.zzd() == 0) {
            return false;
        }
        if (zzeuVar.zzs() != i) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        int i = 0;
        while (true) {
            zzahm[] zzahmVarArr = this.zzc;
            if (i >= zzahmVarArr.length) {
                return;
            }
            zzarl zzarlVar = (zzarl) this.zza.get(i);
            zzaroVar.zza();
            zzahm zzahmVarZzs = zzagdVar.zzs(zzaroVar.zzb(), 3);
            zzt zztVar = new zzt();
            zztVar.zza(zzaroVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo("application/dvbsubs");
            zztVar.zzr(Collections.singletonList(zzarlVar.zzb));
            zztVar.zze(zzarlVar.zza);
            zzahmVarZzs.zzA(zztVar.zzP());
            zzahmVarArr[i] = zzahmVarZzs;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzeuVar, 32)) {
                if (this.zze != 1 || zzf(zzeuVar, 0)) {
                    int iZzg = zzeuVar.zzg();
                    int iZzd = zzeuVar.zzd();
                    for (zzahm zzahmVar : this.zzc) {
                        zzeuVar.zzh(iZzg);
                        zzahmVar.zzc(zzeuVar, iZzd);
                    }
                    this.zzf += iZzd;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z) {
        if (this.zzd) {
            zzgtr.zzi(this.zzg != -9223372036854775807L);
            for (zzahm zzahmVar : this.zzc) {
                zzahmVar.zze(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }
}
