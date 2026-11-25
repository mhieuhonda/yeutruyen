package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzerz {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdxk zzb;

    public zzerz(zzdxk zzdxkVar) {
        this.zzb = zzdxkVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
        }
    }

    @CheckForNull
    public final zzbxi zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbxi) concurrentHashMap.get(str);
        }
        return null;
    }
}
