package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbrd;
import com.google.android.gms.internal.ads.zzbrh;
import com.google.android.gms.internal.ads.zzbvj;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzak extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvj zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    zzak(zzaw zzawVar, Context context, zzbvj zzbvjVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbvjVar;
        this.zzc = onH5AdsEventListener;
        Objects.requireNonNull(zzawVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* synthetic */ Object zza() {
        return new zzbrh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Context context = this.zza;
        try {
            return ((zzbrd) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzaj.zza)).zze(ObjectWrapper.wrap(context), this.zzb, 261710000, new zzbqu(this.zzc));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzp(ObjectWrapper.wrap(this.zza), this.zzb, 261710000, new zzbqu(this.zzc));
    }
}
