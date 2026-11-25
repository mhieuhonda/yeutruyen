package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzefp implements zzhcc {
    final /* synthetic */ zzefs zza;

    zzefp(zzefs zzefsVar) {
        Objects.requireNonNull(zzefsVar);
        this.zza = zzefsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhn)).booleanValue()) {
            Matcher matcher = zzefs.zzh.matcher(th.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                zzefs zzefsVar = this.zza;
                zzefsVar.zzc().zzc(Integer.parseInt(strGroup));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfky zzfkyVar = (zzfky) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhn)).booleanValue()) {
            zzefs zzefsVar = this.zza;
            zzfkq zzfkqVar = zzfkyVar.zzb.zzb;
            zzefsVar.zzc().zzc(zzfkqVar.zzf);
            zzefsVar.zzc().zze(zzfkqVar.zzg);
        }
    }
}
