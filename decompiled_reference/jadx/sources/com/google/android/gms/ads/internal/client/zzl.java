package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbvj;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzl extends RemoteCreator {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return iInterfaceQueryLocalInterface instanceof zzci ? (zzci) iInterfaceQueryLocalInterface : new zzci(iBinder);
    }

    @Nullable
    public final zzch zza(Context context, zzbvj zzbvjVar) {
        try {
            IBinder iBinderZze = ((zzci) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzbvjVar, 261710000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            return iInterfaceQueryLocalInterface instanceof zzch ? (zzch) iInterfaceQueryLocalInterface : new zzcf(iBinderZze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException | NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }
}
