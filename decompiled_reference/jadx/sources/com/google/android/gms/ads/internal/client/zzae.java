package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzcaf;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzae extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvj zzb;

    zzae(zzaw zzawVar, Context context, zzbvj zzbvjVar) {
        this.zza = context;
        this.zzb = zzbvjVar;
        Objects.requireNonNull(zzawVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Context context = this.zza;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        zzbix.zza(context);
        if (((Boolean) zzba.zzc().zzd(zzbix.zzkU)).booleanValue()) {
            try {
                return ((zzdu) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", zzad.zza)).zze(iObjectWrapperWrap, this.zzb, 261710000);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzcaf.zza(this.zza).zzh(e, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        Context context = this.zza;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        zzbix.zza(context);
        if (((Boolean) zzba.zzc().zzd(zzbix.zzkU)).booleanValue()) {
            return zzcoVar.zzq(iObjectWrapperWrap, this.zzb, 261710000);
        }
        return null;
    }
}
