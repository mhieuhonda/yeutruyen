package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehl {
    private final zzhcp zza;
    private final zzegq zzb;
    private final zzimt zzc;

    public zzehl(zzhcp zzhcpVar, zzegq zzegqVar, zzimt zzimtVar) {
        this.zza = zzhcpVar;
        this.zzb = zzegqVar;
        this.zzc = zzimtVar;
    }

    private final ListenableFuture zzg(final zzcbk zzcbkVar, zzehb zzehbVar, final zzehb zzehbVar2, final zzhbn zzhbnVar) {
        ListenableFuture listenableFutureZzh;
        String str = zzcbkVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            listenableFutureZzh = zzhcf.zzc(new zzegz(1));
        } else {
            listenableFutureZzh = zzhcf.zzh(zzehbVar.zza(zzcbkVar), ExecutionException.class, zzehk.zza, this.zza);
        }
        zzhcp zzhcpVar = this.zza;
        return (zzhbx) zzhcf.zzh((zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzj(zzhbx.zzw(listenableFutureZzh), zzehd.zza, zzhcpVar), zzhbnVar, zzhcpVar), zzegz.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzehe
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzehbVar2, zzcbkVar, zzhbnVar, (zzegz) obj);
            }
        }, zzhcpVar);
    }

    public final ListenableFuture zza(final zzcbk zzcbkVar) {
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzehf
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str = new String(zzgzt.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzcbk zzcbkVar2 = zzcbkVar;
                zzcbkVar2.zzj = str;
                return zzhcf.zza(zzcbkVar2);
            }
        };
        final zzegq zzegqVar = this.zzb;
        Objects.requireNonNull(zzegqVar);
        return zzg(zzcbkVar, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehc
            @Override // com.google.android.gms.internal.ads.zzehb
            public final /* synthetic */ ListenableFuture zza(zzcbk zzcbkVar2) {
                return zzegqVar.zza(zzcbkVar2);
            }
        }, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehg
            @Override // com.google.android.gms.internal.ads.zzehb
            public final /* synthetic */ ListenableFuture zza(zzcbk zzcbkVar2) {
                return this.zza.zzd(zzcbkVar2);
            }
        }, zzhbnVar);
    }

    public final ListenableFuture zzb(zzcbk zzcbkVar) {
        return zzg(zzcbkVar, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehi
            @Override // com.google.android.gms.internal.ads.zzehb
            public final /* synthetic */ ListenableFuture zza(zzcbk zzcbkVar2) {
                return this.zza.zze(zzcbkVar2);
            }
        }, new zzehb() { // from class: com.google.android.gms.internal.ads.zzehj
            @Override // com.google.android.gms.internal.ads.zzehb
            public final /* synthetic */ ListenableFuture zza(zzcbk zzcbkVar2) {
                return this.zza.zzf(zzcbkVar2);
            }
        }, zzehh.zza);
    }

    final /* synthetic */ ListenableFuture zzc(zzehb zzehbVar, zzcbk zzcbkVar, zzhbn zzhbnVar, zzegz zzegzVar) {
        return zzhcf.zzj(zzehbVar.zza(zzcbkVar), zzhbnVar, this.zza);
    }

    final /* synthetic */ ListenableFuture zzd(zzcbk zzcbkVar) {
        return ((zzeiq) this.zzc.zzb()).zzc(zzcbkVar, Binder.getCallingUid());
    }

    final /* synthetic */ ListenableFuture zze(zzcbk zzcbkVar) {
        return this.zzb.zzd(zzcbkVar.zzh);
    }

    final /* synthetic */ ListenableFuture zzf(zzcbk zzcbkVar) {
        return ((zzeiq) this.zzc.zzb()).zzd(zzcbkVar.zzh);
    }
}
