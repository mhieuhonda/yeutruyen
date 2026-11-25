package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeqt implements zzemg {
    private final Context zza;
    private final Executor zzb;
    private final zzdvz zzc;

    public zzeqt(Context context, Executor executor, zzdvz zzdvzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdvzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        try {
            ((zzfme) zzemdVar.zzb).zzl(zzfkyVar.zza.zza.zzd, zzfknVar.zzv.toString());
        } catch (Exception e) {
            String str = zzemdVar.zza;
            String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        zzfme zzfmeVar = (zzfme) zzemdVar.zzb;
        if (zzfmeVar.zzn()) {
            zze(zzfkyVar, zzfknVar, zzemdVar);
            return;
        }
        zzeqq zzeqqVar = new zzeqq(this, zzfkyVar, zzfknVar, zzemdVar);
        zzdej zzdejVar = zzemdVar.zzc;
        ((zzenq) zzdejVar).zzd(zzeqqVar);
        Context context = this.zza;
        zzflg zzflgVar = zzfkyVar.zza.zza;
        String string = zzfknVar.zzv.toString();
        zzfmeVar.zzk(context, zzflgVar.zzd, null, (zzcch) zzdejVar, string);
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzdvv zzdvvVarZzf = this.zzc.zzf(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdvw(new zzeqr(this, zzemdVar, zzfknVar)));
        zzdvvVarZzf.zza().zzq(new zzctg((zzfme) zzemdVar.zzb), this.zzb);
        zzdeg zzdegVarZzb = zzdvvVarZzf.zzb();
        zzdcx zzdcxVarZzc = zzdvvVarZzf.zzc();
        ((zzenq) zzemdVar.zzc).zzc(new zzeqs(this, zzdvvVarZzf.zzi(), zzdcxVarZzc, zzdegVarZzb, zzdvvVarZzf.zzk()));
        return zzdvvVarZzf.zzh();
    }

    final /* synthetic */ Executor zzc() {
        return this.zzb;
    }
}
