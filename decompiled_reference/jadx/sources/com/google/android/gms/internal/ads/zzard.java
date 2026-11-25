package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzard {
    private final List zza;
    private final zzahm[] zzc;
    private final String zzb = "video/mp2t";
    private final zzhb zzd = new zzhb(new zzha() { // from class: com.google.android.gms.internal.ads.zzarc
        @Override // com.google.android.gms.internal.ads.zzha
        public final /* synthetic */ void zza(long j, zzeu zzeuVar) {
            this.zza.zzf(j, zzeuVar);
        }
    });

    public zzard(List list, String str) {
        this.zza = list;
        this.zzc = new zzahm[list.size()];
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
            String strZzc = zzvVar.zza;
            if (strZzc == null) {
                strZzc = zzaroVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(strZzc);
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

    public final void zzb(int i) {
        this.zzd.zza(i);
    }

    public final void zzc(long j, zzeu zzeuVar) {
        this.zzd.zzc(j, zzeuVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    final /* synthetic */ void zzf(long j, zzeu zzeuVar) {
        zzafn.zza(j, zzeuVar, this.zzc);
    }
}
