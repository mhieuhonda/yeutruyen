package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeor implements zzemg {
    private final Context zza;
    private final zzdok zzb;
    private zzbvy zzc;
    private final VersionInfoParcel zzd;

    public zzeor(Context context, zzdok zzdokVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdokVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzbxi zzbxiVar = (zzbxi) zzemdVar.zzb;
            zzbxiVar.zzo(zzfknVar.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcx)).intValue()) {
                zzbxiVar.zzn(zzfknVar.zzU, zzfknVar.zzv.toString(), zzfkyVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeoq(this, zzemdVar, null), (zzbvp) zzemdVar.zzc);
                return;
            }
            String str = zzfknVar.zzU;
            String string = zzfknVar.zzv.toString();
            zzflg zzflgVar = zzfkyVar.zza.zza;
            zzbxiVar.zzr(str, string, zzflgVar.zzd, ObjectWrapper.wrap(this.zza), new zzeoq(this, zzemdVar, null), (zzbvp) zzemdVar.zzc, zzflgVar.zzj);
        } catch (RemoteException e) {
            throw new zzfln(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        ArrayList arrayList = zzfkyVar.zza.zza.zzh;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzepp(2, "Unified must be used for RTB.");
        }
        zzdqb zzdqbVarZzaf = zzdqb.zzaf(this.zzc);
        if (!arrayList.contains(Integer.toString(zzdqbVarZzaf.zzx()))) {
            throw new zzepp(1, "No corresponding native ad listener");
        }
        zzdqd zzdqdVarZze = this.zzb.zze(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdqm(zzdqbVarZzaf), new zzdsf(null, null, this.zzc));
        ((zzenp) zzemdVar.zzc).zzc(zzdqdVarZze.zzg());
        return zzdqdVarZze.zzh();
    }

    final /* synthetic */ void zzc(zzbvy zzbvyVar) {
        this.zzc = zzbvyVar;
    }
}
