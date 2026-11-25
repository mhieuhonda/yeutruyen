package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgq;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzel extends com.google.android.gms.ads.preload.zzb {
    public zzel(Context context) {
        super(context, AdFormat.APP_OPEN_AD);
    }

    public final AppOpenAd zza(String str) {
        zzbgq zzbgqVarZzp;
        try {
            zzbgqVarZzp = this.zza.zzp(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzbgqVarZzp = null;
        }
        if (zzbgqVarZzp == null) {
            return null;
        }
        return new zzbgm(zzbgqVarZzp);
    }
}
