package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzewj implements zzfcq {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final String zzf;
    private final zzdae zzg;

    public zzewj(Context context, Bundle bundle, String str, String str2, com.google.android.gms.ads.internal.util.zzg zzgVar, String str3, zzdae zzdaeVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzgVar;
        this.zzf = str3;
        this.zzg = zzdaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zze;
        if (!zzgVar.zzx()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !zzgVar.zzx());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgL)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                bundle.putString("_app_id", com.google.android.gms.ads.internal.util.zzs.zzr(this.zza));
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AppStatsSignal_AppId");
            }
        }
        String str = this.zzf;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzdae zzdaeVar = this.zzg;
            bundle2.putLong("dload", zzdaeVar.zzc(str));
            bundle2.putInt("pcc", zzdaeVar.zzb(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlr)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zzo() <= 0) {
            return;
        }
        bundle.putInt("nrwv", com.google.android.gms.ads.internal.zzt.zzh().zzo());
    }
}
