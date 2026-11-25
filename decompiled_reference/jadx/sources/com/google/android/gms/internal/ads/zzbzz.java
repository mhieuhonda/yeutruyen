package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbzz {
    private static zzcet zze;
    private final Context zza;
    private final AdFormat zzb;
    private final com.google.android.gms.ads.internal.client.zzeh zzc;
    private final String zzd;

    public zzbzz(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzeh zzehVar, String str) {
        this.zza = context;
        this.zzb = adFormat;
        this.zzc = zzehVar;
        this.zzd = str;
    }

    public static zzcet zza(Context context) {
        zzcet zzcetVar;
        synchronized (zzbzz.class) {
            if (zze == null) {
                zze = com.google.android.gms.ads.internal.client.zzay.zzb().zzi(context, new zzbvf());
            }
            zzcetVar = zze;
        }
        return zzcetVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zzmVarZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.zza;
        zzcet zzcetVarZza = zza(context);
        if (zzcetVarZza == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        com.google.android.gms.ads.internal.client.zzeh zzehVar = this.zzc;
        if (zzehVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzi(jCurrentTimeMillis);
            zzmVarZza = zznVar.zza();
        } else {
            zzehVar.zzp(jCurrentTimeMillis);
            zzmVarZza = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, zzehVar);
        }
        try {
            zzcetVarZza.zze(iObjectWrapperWrap, new zzcex(this.zzd, this.zzb.name(), null, zzmVarZza), new zzbzy(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
