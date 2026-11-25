package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeqb implements zzemg {
    private final Context zza;
    private final zzdvz zzb;

    public zzeqb(Context context, zzdvz zzdvzVar) {
        this.zza = context;
        this.zzb = zzdvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzbxi zzbxiVar = (zzbxi) zzemdVar.zzb;
            zzbxiVar.zzo(zzfknVar.zzZ);
            zzflg zzflgVar = zzfkyVar.zza.zza;
            if (zzflgVar.zzp.zza == 3) {
                zzbxiVar.zzp(zzfknVar.zzU, zzfknVar.zzv.toString(), zzflgVar.zzd, ObjectWrapper.wrap(this.zza), new zzeqa(this, zzemdVar, null), (zzbvp) zzemdVar.zzc);
            } else {
                zzbxiVar.zzl(zzfknVar.zzU, zzfknVar.zzv.toString(), zzflgVar.zzd, ObjectWrapper.wrap(this.zza), new zzeqa(this, zzemdVar, null), (zzbvp) zzemdVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzeny zzenyVar = new zzeny(zzfknVar, (zzbxi) zzemdVar.zzb, AdFormat.REWARDED);
        zzdvv zzdvvVarZzf = this.zzb.zzf(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdvw(zzenyVar));
        zzenyVar.zzc(zzdvvVarZzf.zzd());
        ((zzenp) zzemdVar.zzc).zzc(zzdvvVarZzf.zzn());
        return zzdvvVarZzf.zzh();
    }
}
