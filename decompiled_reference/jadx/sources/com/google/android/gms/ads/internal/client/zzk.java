package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzk extends RemoteCreator {
    private zzcah zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface : new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzr zzrVar, String str, zzbvj zzbvjVar, int i) {
        zzbix.zza(context);
        if (!((Boolean) zzba.zzc().zzd(zzbix.zzmo)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbvjVar, 261710000, i);
                if (iBinderZze == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinderZze);
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderZze2 = ((zzbv) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbvjVar, 261710000, i);
            if (iBinderZze2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface2 : new zzbs(iBinderZze2);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e2) {
            zzcah zzcahVarZza = zzcaf.zza(context);
            this.zza = zzcahVarZza;
            zzcahVarZza.zzh(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
