package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzems implements zzemg {
    private final Context zza;
    private final zzcvg zzb;

    zzems(Context context, zzcvg zzcvgVar) {
        this.zza = context;
        this.zzb = zzcvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzbxi zzbxiVar = (zzbxi) zzemdVar.zzb;
            zzbxiVar.zzo(zzfknVar.zzZ);
            zzbxiVar.zzs(zzfknVar.zzU, zzfknVar.zzv.toString(), zzfkyVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzemr(zzemdVar, null), (zzbvp) zzemdVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfln(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzeny zzenyVar = new zzeny(zzfknVar, (zzbxi) zzemdVar.zzb, AdFormat.APP_OPEN_AD);
        zzcvd zzcvdVarZzf = this.zzb.zzf(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdml(zzenyVar, null), new zzcve(zzfknVar.zzaa));
        zzenyVar.zzc(zzcvdVarZzf.zzd());
        ((zzenp) zzemdVar.zzc).zzc(zzcvdVarZzf.zzg());
        return zzcvdVarZzf.zzh();
    }
}
