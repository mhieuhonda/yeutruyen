package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeoo implements zzemg {
    private final Context zza;
    private final zzdok zzb;
    private final Executor zzc;

    public zzeoo(Context context, zzdok zzdokVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdokVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfky zzfkyVar, int i) {
        return zzfkyVar.zza.zza.zzh.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        zzfme zzfmeVar = (zzfme) zzemdVar.zzb;
        zzflg zzflgVar = zzfkyVar.zza.zza;
        String string = zzfknVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfknVar.zzs);
        zzfmeVar.zzo(this.zza, zzflgVar.zzd, string, strZzm, (zzbvp) zzemdVar.zzc, zzflgVar.zzj, zzflgVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzdqb zzdqbVarZzag;
        zzfme zzfmeVar = (zzfme) zzemdVar.zzb;
        zzbvu zzbvuVarZzD = zzfmeVar.zzD();
        zzbvv zzbvvVarZzE = zzfmeVar.zzE();
        zzbvy zzbvyVarZzu = zzfmeVar.zzu();
        if (zzbvyVarZzu != null && zzc(zzfkyVar, 6)) {
            zzdqbVarZzag = zzdqb.zzaf(zzbvyVarZzu);
        } else if (zzbvuVarZzD != null && zzc(zzfkyVar, 6)) {
            zzdqbVarZzag = zzdqb.zzai(zzbvuVarZzD);
        } else if (zzbvuVarZzD != null && zzc(zzfkyVar, 2)) {
            zzdqbVarZzag = zzdqb.zzah(zzbvuVarZzD);
        } else if (zzbvvVarZzE != null && zzc(zzfkyVar, 6)) {
            zzdqbVarZzag = zzdqb.zzaj(zzbvvVarZzE);
        } else {
            if (zzbvvVarZzE == null || !zzc(zzfkyVar, 1)) {
                throw new zzepp(1, "No native ad mappers");
            }
            zzdqbVarZzag = zzdqb.zzag(zzbvvVarZzE);
        }
        if (zzdqbVarZzag != null) {
            zzflg zzflgVar = zzfkyVar.zza.zza;
            if (zzflgVar.zzh.contains(Integer.toString(zzdqbVarZzag.zzx()))) {
                zzdqd zzdqdVarZze = this.zzb.zze(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdqm(zzdqbVarZzag), new zzdsf(zzbvvVarZzE, zzbvuVarZzD, zzbvyVarZzu));
                ((zzenp) zzemdVar.zzc).zzc(zzdqdVarZze.zzf());
                zzdqdVarZze.zza().zzq(new zzctg(zzfmeVar), this.zzc);
                return zzdqdVarZze.zzh();
            }
        }
        throw new zzepp(1, "No corresponding native ad listener");
    }
}
