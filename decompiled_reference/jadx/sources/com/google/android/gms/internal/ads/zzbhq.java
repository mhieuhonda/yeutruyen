package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhq implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbhi zza;
    final /* synthetic */ zzcgd zzb;
    final /* synthetic */ zzbhs zzc;

    zzbhq(zzbhs zzbhsVar, zzbhi zzbhiVar, zzcgd zzcgdVar) {
        this.zza = zzbhiVar;
        this.zzb = zzcgdVar;
        Objects.requireNonNull(zzbhsVar);
        this.zzc = zzbhsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbhs zzbhsVar = this.zzc;
        synchronized (zzbhsVar.zzf()) {
            if (zzbhsVar.zzd()) {
                return;
            }
            zzbhsVar.zze(true);
            final zzbhh zzbhhVarZzc = zzbhsVar.zzc();
            if (zzbhhVarZzc == null) {
                return;
            }
            zzhcp zzhcpVar = zzcfy.zza;
            final zzbhi zzbhiVar = this.zza;
            final zzcgd zzcgdVar = this.zzb;
            final ListenableFuture listenableFutureSubmit = zzhcpVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgd zzcgdVar2 = zzcgdVar;
                    zzbhh zzbhhVar = zzbhhVarZzc;
                    zzbhq zzbhqVar = this.zza;
                    try {
                        zzbhk zzbhkVarZzq = zzbhhVar.zzq();
                        boolean zZzp = zzbhhVar.zzp();
                        zzbhi zzbhiVar2 = zzbhiVar;
                        zzbhf zzbhfVarZzf = zZzp ? zzbhkVarZzq.zzf(zzbhiVar2) : zzbhkVarZzq.zze(zzbhiVar2);
                        if (!zzbhfVarZzf.zza()) {
                            zzcgdVar2.zzd(new RuntimeException("No entry contents."));
                            zzbhqVar.zzc.zzb();
                            return;
                        }
                        zzbhn zzbhnVar = new zzbhn(zzbhqVar, zzbhfVarZzf.zzb(), 1);
                        int i = zzbhnVar.read();
                        if (i == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzbhnVar.unread(i);
                        zzcgdVar2.zzc(zzbhu.zza(zzbhnVar, zzbhfVarZzf.zzd(), zzbhfVarZzf.zzg(), zzbhfVarZzf.zzf(), zzbhfVarZzf.zze()));
                    } catch (RemoteException | IOException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                        zzcgdVar2.zzd(e);
                        zzbhqVar.zzc.zzb();
                    }
                }
            });
            zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbho
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzbhq.zzd;
                    if (zzcgdVar.isCancelled()) {
                        listenableFutureSubmit.cancel(true);
                    }
                }
            }, zzcfy.zzh);
        }
    }
}
