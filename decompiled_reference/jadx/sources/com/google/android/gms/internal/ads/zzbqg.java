package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbqg implements zzhcc {
    final /* synthetic */ Map zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbqk zzd;

    zzbqg(zzbqk zzbqkVar, Map map, com.google.android.gms.ads.internal.client.zza zzaVar, String str) {
        this.zza = map;
        this.zzb = zzaVar;
        this.zzc = str;
        Objects.requireNonNull(zzbqkVar);
        this.zzd = zzbqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlI)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzf(str, this.zzb, this.zza, this.zzc);
    }
}
