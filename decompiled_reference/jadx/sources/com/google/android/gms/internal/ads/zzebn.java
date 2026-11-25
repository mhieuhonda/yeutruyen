package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebn implements zzebc {
    private final long zza;
    private final zzets zzb;

    zzebn(long j, Context context, zzebg zzebgVar, zzcnq zzcnqVar, String str) {
        this.zza = j;
        zzfis zzfisVarZzn = zzcnqVar.zzn();
        zzfisVarZzn.zzd(context);
        zzfisVarZzn.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzfisVarZzn.zzc(str);
        zzets zzetsVarZza = zzfisVarZzn.zza().zza();
        this.zzb = zzetsVarZza;
        zzetsVarZza.zzdS(new zzebm(this, zzebgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzb() {
        this.zzb.zzR(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzc() {
        this.zzb.zzc();
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }
}
