package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbze;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzai extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvj zzb;

    zzai(zzaw zzawVar, Context context, zzbvj zzbvjVar) {
        this.zza = context;
        this.zzb = zzbvjVar;
        Objects.requireNonNull(zzawVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Context context = this.zza;
        try {
            return ((zzbze) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", zzah.zza)).zze(ObjectWrapper.wrap(context), this.zzb, 261710000);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzo(ObjectWrapper.wrap(this.zza), this.zzb, 261710000);
    }
}
