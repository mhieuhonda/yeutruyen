package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbmf extends NativeAd.AdChoicesInfo {
    private final zzbme zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbmf(zzbme zzbmeVar) {
        IBinder iBinder;
        this.zza = zzbmeVar;
        try {
            this.zzc = zzbmeVar.zzb();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbmeVar.zzc()) {
                zzbml zzbmjVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbmjVar = iInterfaceQueryLocalInterface instanceof zzbml ? (zzbml) iInterfaceQueryLocalInterface : new zzbmj(iBinder);
                }
                if (zzbmjVar != null) {
                    this.zzb.add(new zzbmm(zzbmjVar));
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
