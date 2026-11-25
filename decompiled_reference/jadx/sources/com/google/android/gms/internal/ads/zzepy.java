package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzepy implements zzemg {
    private final Context zza;
    private final Executor zzb;
    private final zzdvz zzc;

    public zzepy(Context context, Executor executor, zzdvz zzdvzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzflg zzflgVar = zzfkyVar.zza.zza;
            if (zzflgVar.zzp.zza == 3) {
                ((zzfme) zzemdVar.zzb).zzx(this.zza, zzflgVar.zzd, zzfknVar.zzv.toString(), (zzbvp) zzemdVar.zzc);
            } else {
                ((zzfme) zzemdVar.zzb).zzv(this.zza, zzflgVar.zzd, zzfknVar.zzv.toString(), (zzbvp) zzemdVar.zzc);
            }
        } catch (Exception e) {
            String str = zzemdVar.zza;
            String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzdvv zzdvvVarZzf = this.zzc.zzf(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdvw(new zzepx(this, zzemdVar, zzfknVar)));
        zzdvvVarZzf.zza().zzq(new zzctg((zzfme) zzemdVar.zzb), this.zzb);
        ((zzenp) zzemdVar.zzc).zzc(zzdvvVarZzf.zzm());
        return zzdvvVarZzf.zzh();
    }
}
