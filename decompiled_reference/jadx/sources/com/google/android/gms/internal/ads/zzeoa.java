package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeoa implements zzemg {
    private final Context zza;
    private final zzdno zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzeoa(Context context, VersionInfoParcel versionInfoParcel, zzdno zzdnoVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdnoVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        zzfme zzfmeVar = (zzfme) zzemdVar.zzb;
        zzflg zzflgVar = zzfkyVar.zza.zza;
        String string = zzfknVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfknVar.zzs);
        zzfmeVar.zzh(this.zza, zzflgVar.zzd, string, strZzm, (zzbvp) zzemdVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        zzdmi zzdmiVarZzd = this.zzb.zzd(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzdml(new zzenz(this, zzemdVar, zzfknVar), null));
        zzdmiVarZzd.zza().zzq(new zzctg((zzfme) zzemdVar.zzb), this.zzd);
        ((zzenp) zzemdVar.zzc).zzc(zzdmiVarZzd.zzf());
        return zzdmiVarZzd.zzh();
    }

    final /* synthetic */ VersionInfoParcel zzc() {
        return this.zzc;
    }
}
