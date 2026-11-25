package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzflt {
    private final zzfkn zza;
    private final zzfkq zzb;
    private final zzfsm zzc;
    private final zzfse zzd;
    private final zzfqq zze;
    private final zzctq zzf;

    public zzflt(zzfsm zzfsmVar, zzfse zzfseVar, zzfkn zzfknVar, zzfkq zzfkqVar, zzctq zzctqVar, zzfqq zzfqqVar) {
        this.zza = zzfknVar;
        this.zzb = zzfkqVar;
        this.zzc = zzfsmVar;
        this.zzd = zzfseVar;
        this.zzf = zzctqVar;
        this.zze = zzfqqVar;
    }

    public final void zza(List list, zzdfo zzdfoVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), 2, zzdfoVar);
        }
    }

    public final void zzb(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzhcf.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlH)).booleanValue() && zzctq.zzc(str)) ? this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhcf.zza(str), new zzfls(this, i), zzcfy.zza);
        }
    }

    public final void zzc(String str, int i, zzdfo zzdfoVar) {
        zzfkn zzfknVar = this.zza;
        if (zzfknVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i);
            return;
        }
        this.zzc.zzb(str, zzfknVar.zzax, this.zze, zzdfoVar);
    }
}
