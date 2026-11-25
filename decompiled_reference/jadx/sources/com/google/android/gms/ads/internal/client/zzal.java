package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvj;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzal extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbvj zzd;
    final /* synthetic */ zzaw zze;

    zzal(zzaw zzawVar, Context context, zzr zzrVar, String str, zzbvj zzbvjVar) {
        this.zza = context;
        this.zzb = zzrVar;
        this.zzc = str;
        this.zzd = zzbvjVar;
        Objects.requireNonNull(zzawVar);
        this.zze = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "banner");
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        return this.zze.zzm().zza(this.zza, this.zzb, this.zzc, this.zzd, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 261710000);
    }
}
