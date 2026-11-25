package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzewi implements zzfcs {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzczq zze;
    private final zzfmo zzf;
    private final zzflg zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzh().zzp();
    private final zzdzo zzi;
    private final zzdae zzj;

    public zzewi(Context context, String str, String str2, zzczq zzczqVar, zzfmo zzfmoVar, zzflg zzflgVar, zzdzo zzdzoVar, zzdae zzdaeVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzczqVar;
        this.zzf = zzfmoVar;
        this.zzg = zzflgVar;
        this.zzi = zzdzoVar;
        this.zzj = zzdaeVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        Bundle bundle = new Bundle();
        zzdzo zzdzoVar = this.zzi;
        Map mapZzc = zzdzoVar.zzc();
        String str = this.zzb;
        mapZzc.put("seq_num", str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue()) {
            zzdzoVar.zzd("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd));
            com.google.android.gms.ads.internal.zzt.zzc();
            zzdzoVar.zzd("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zza) ? "1" : "0");
        }
        zzczq zzczqVar = this.zze;
        zzflg zzflgVar = this.zzg;
        zzczqVar.zzi(zzflgVar.zzd);
        bundle.putAll(this.zzf.zzc());
        return zzhcf.zza(new zzewj(this.zza, bundle, str, this.zzc, this.zzh, zzflgVar.zzg, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 12;
    }
}
