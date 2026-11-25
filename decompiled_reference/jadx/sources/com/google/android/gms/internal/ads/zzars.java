package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzars {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzahm[] zzc;
    private final zzhb zzd;

    public zzars(List list, String str) {
        this.zza = list;
        this.zzc = new zzahm[list.size()];
        zzhb zzhbVar = new zzhb(new zzha() { // from class: com.google.android.gms.internal.ads.zzarr
            @Override // com.google.android.gms.internal.ads.zzha
            public final /* synthetic */ void zza(long j, zzeu zzeuVar) {
                this.zza.zzc(j, zzeuVar);
            }
        });
        this.zzd = zzhbVar;
        zzhbVar.zza(3);
    }

    public final void zza(zzagd zzagdVar, zzaro zzaroVar) {
        int i = 0;
        while (true) {
            zzahm[] zzahmVarArr = this.zzc;
            if (i >= zzahmVarArr.length) {
                return;
            }
            zzaroVar.zza();
            zzahm zzahmVarZzs = zzagdVar.zzs(zzaroVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i);
            String str = zzvVar.zzp;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzgtr.zzf(z, "Invalid closed caption MIME type provided: %s", str);
            zzt zztVar = new zzt();
            zztVar.zza(zzaroVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzM(zzvVar.zzN);
            zztVar.zzr(zzvVar.zzs);
            zzahmVarZzs.zzA(zztVar.zzP());
            zzahmVarArr[i] = zzahmVarZzs;
            i++;
        }
    }

    public final void zzb(long j, zzeu zzeuVar) {
        if (zzeuVar.zzd() < 9) {
            return;
        }
        int iZzB = zzeuVar.zzB();
        int iZzB2 = zzeuVar.zzB();
        int iZzs = zzeuVar.zzs();
        if (iZzB == 434 && iZzB2 == 1195456820 && iZzs == 3) {
            this.zzd.zzc(j, zzeuVar);
        }
    }

    final /* synthetic */ void zzc(long j, zzeu zzeuVar) {
        zzafn.zzb(j, zzeuVar, this.zzc);
    }
}
