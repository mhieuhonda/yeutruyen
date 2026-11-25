package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebr implements zzebc {
    private final long zza;
    private final zzebg zzb;
    private final zzfke zzc;

    zzebr(long j, Context context, zzebg zzebgVar, zzcnq zzcnqVar, String str) {
        this.zza = j;
        this.zzb = zzebgVar;
        zzfkg zzfkgVarZzq = zzcnqVar.zzq();
        zzfkgVarZzq.zzc(context);
        zzfkgVarZzq.zzb(str);
        this.zzc = zzfkgVarZzq.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzc(zzmVar, new zzebp(this));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzb() {
        try {
            zzfke zzfkeVar = this.zzc;
            zzfkeVar.zze(new zzebq(this));
            zzfkeVar.zzb(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzc() {
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }

    final /* synthetic */ zzebg zze() {
        return this.zzb;
    }
}
