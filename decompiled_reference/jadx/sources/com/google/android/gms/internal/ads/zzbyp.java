package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbyp extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbyp(zzbme zzbmeVar) {
        try {
            this.zzb = zzbmeVar.zzb();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbmeVar.zzc()) {
                zzbml zzbmlVarZzh = obj instanceof IBinder ? zzbmk.zzh((IBinder) obj) : null;
                if (zzbmlVarZzh != null) {
                    this.zza.add(new zzbyr(zzbmlVarZzh));
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
