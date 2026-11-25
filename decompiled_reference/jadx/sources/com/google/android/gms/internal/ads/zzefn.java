package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefn {
    private final ScheduledExecutorService zza;
    private final zzhcp zzb;
    private final zzhcp zzc;
    private final zzegm zzd;
    private final zzimt zze;

    public zzefn(ScheduledExecutorService scheduledExecutorService, zzhcp zzhcpVar, zzhcp zzhcpVar2, zzegm zzegmVar, zzimt zzimtVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzhcpVar;
        this.zzc = zzhcpVar2;
        this.zzd = zzegmVar;
        this.zze = zzimtVar;
    }

    public final ListenableFuture zza(final zzcbk zzcbkVar) {
        ListenableFuture listenableFutureSubmit;
        String str = zzcbkVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            listenableFutureSubmit = zzhcf.zzc(new zzegz(1));
        } else {
            listenableFutureSubmit = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziD)).booleanValue() || ((Boolean) zzbli.zza.zze()).booleanValue()) ? this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzefk
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(zzcbkVar);
                }
            }) : this.zzd.zza(zzcbkVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzhbx) zzhcf.zzh((zzhbx) zzhcf.zzi(zzhbx.zzw(listenableFutureSubmit), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgJ)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzcbkVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzb(final zzcbk zzcbkVar, int i, Throwable th) {
        Bundle bundle;
        if (zzcbkVar != null && (bundle = zzcbkVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzhcf.zzj(((zzeiq) this.zze.zzb()).zzk(zzcbkVar, i), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhcf.zza(new zzeha((InputStream) obj, zzcbkVar));
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzeha zzc(zzcbk zzcbkVar) {
        return (zzeha) this.zzd.zza(zzcbkVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgJ)).intValue(), TimeUnit.SECONDS);
    }
}
