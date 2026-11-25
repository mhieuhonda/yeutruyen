package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbod extends UnifiedNativeAd {
    private final zzboc zza;
    private final zzbmm zzc;
    private final List zzb = new ArrayList();
    private final VideoController zzd = new VideoController();
    private final List zze = new ArrayList();

    public zzbod(zzboc zzbocVar) {
        zzbml zzbmjVar;
        IBinder iBinder;
        this.zza = zzbocVar;
        zzbmm zzbmmVar = null;
        try {
            List listZzf = zzbocVar.zzf();
            if (listZzf != null) {
                for (Object obj : listZzf) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzbmjVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbmjVar = iInterfaceQueryLocalInterface instanceof zzbml ? (zzbml) iInterfaceQueryLocalInterface : new zzbmj(iBinder);
                    }
                    if (zzbmjVar != null) {
                        this.zzb.add(new zzbmm(zzbmjVar));
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        try {
            List listZzz = this.zza.zzz();
            if (listZzz != null) {
                for (Object obj2 : listZzz) {
                    com.google.android.gms.ads.internal.client.zzdg zzdgVarZzb = obj2 instanceof IBinder ? com.google.android.gms.ads.internal.client.zzdf.zzb((IBinder) obj2) : null;
                    if (zzdgVarZzb != null) {
                        this.zze.add(new com.google.android.gms.ads.internal.client.zzdh(zzdgVarZzb));
                    }
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
        try {
            zzbml zzbmlVarZzh = this.zza.zzh();
            if (zzbmlVarZzh != null) {
                zzbmmVar = new zzbmm(zzbmlVarZzh);
            }
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
        }
        this.zzc = zzbmmVar;
        try {
            if (this.zza.zzq() != null) {
                new zzbmf(this.zza.zzq());
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e4);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzs(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzt(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zza() {
        try {
            return this.zza.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzc() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zze() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzf() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double zzg() {
        try {
            double dZzk = this.zza.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzh() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzi() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zzj() {
        try {
            zzboc zzbocVar = this.zza;
            if (zzbocVar.zzn() != null) {
                this.zzd.zza(zzbocVar.zzn());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception occurred while getting video controller", e);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzk() {
        try {
            IObjectWrapper iObjectWrapperZzv = this.zza.zzv();
            if (iObjectWrapperZzv != null) {
                return ObjectWrapper.unwrap(iObjectWrapperZzv);
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }
}
