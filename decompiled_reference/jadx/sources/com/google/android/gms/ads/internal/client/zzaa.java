package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzcdb;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaa extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbvj zzc;

    zzaa(zzaw zzawVar, Context context, String str, zzbvj zzbvjVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbvjVar;
        Objects.requireNonNull(zzawVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "rewarded");
        return new zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        return zzcdb.zza(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzl(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 261710000);
    }
}
