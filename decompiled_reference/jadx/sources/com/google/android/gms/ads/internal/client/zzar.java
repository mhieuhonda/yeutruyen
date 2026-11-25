package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzcaf;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzar extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvj zzb;
    final /* synthetic */ zzaw zzc;

    zzar(zzaw zzawVar, Context context, zzbvj zzbvjVar) {
        this.zza = context;
        this.zzb = zzbvjVar;
        Objects.requireNonNull(zzawVar);
        this.zzc = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        zzch zzcfVar;
        Context context = this.zza;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        zzbix.zza(context);
        if (!((Boolean) zzba.zzc().zzd(zzbix.zzmo)).booleanValue()) {
            return this.zzc.zzt().zza(this.zza, this.zzb);
        }
        try {
            zzci zzciVar = (zzci) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", zzaq.zza);
            zzbvj zzbvjVar = this.zzb;
            IBinder iBinderZze = zzciVar.zze(iObjectWrapperWrap, zzbvjVar, 261710000);
            if (iBinderZze == null) {
                zzcfVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcfVar = iInterfaceQueryLocalInterface instanceof zzch ? (zzch) iInterfaceQueryLocalInterface : new zzcf(iBinderZze);
            }
            zzcfVar.zzl(zzbvjVar);
            return zzcfVar;
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
            zzaw zzawVar = this.zzc;
            zzawVar.zzs(zzcaf.zza(this.zza));
            zzawVar.zzr().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzh(ObjectWrapper.wrap(this.zza), this.zzb, 261710000);
    }
}
