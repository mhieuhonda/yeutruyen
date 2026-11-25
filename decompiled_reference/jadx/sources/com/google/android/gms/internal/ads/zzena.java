package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzena implements zzema {
    private final zzcwx zza;
    private final Context zzb;
    private final zzdwq zzc;
    private final zzflg zzd;
    private final Executor zze;
    private final zzgti zzf;
    private final zzdzo zzg;

    public zzena(zzcwx zzcwxVar, Context context, Executor executor, zzdwq zzdwqVar, zzflg zzflgVar, zzgti zzgtiVar, zzdzo zzdzoVar) {
        this.zzb = context;
        this.zza = zzcwxVar;
        this.zze = executor;
        this.zzc = zzdwqVar;
        this.zzd = zzflgVar;
        this.zzf = zzgtiVar;
        this.zzg = zzdzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar = zzfknVar.zzs;
        return (zzfksVar == null || zzfksVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final ListenableFuture zzb(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        return zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfkyVar, zzfknVar, obj);
            }
        }, this.zze);
    }

    final /* synthetic */ ListenableFuture zzc(zzfky zzfkyVar, zzfkn zzfknVar, Object obj) throws zzclq {
        zzbio zzbioVar = zzbix.zzcV;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            this.zzg.zzf(zzdzc.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVarZza = zzflm.zza(context, zzfknVar.zzu);
        final zzclb zzclbVarZza = this.zzc.zza(zzrVarZza, zzfknVar, zzfkyVar.zzb.zzb);
        zzclbVarZza.zzaw(zzfknVar.zzW);
        View viewZza = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjf)).booleanValue() && zzfknVar.zzag) ? zzcxm.zza(context, zzclbVarZza.zzE(), zzfknVar) : new zzdwt(context, zzclbVarZza.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfknVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            this.zzg.zzf(zzdzc.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcwx zzcwxVar = this.zza;
        zzcyq zzcyqVar = new zzcyq(zzfkyVar, zzfknVar, null);
        Objects.requireNonNull(zzclbVarZza);
        final zzcvt zzcvtVarZzf = zzcwxVar.zzf(zzcyqVar, new zzcvz(viewZza, zzclbVarZza, new zzcxy() { // from class: com.google.android.gms.internal.ads.zzemv
            @Override // com.google.android.gms.internal.ads.zzcxy
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                return zzclbVarZza.zzh();
            }
        }, zzflm.zzb(zzrVarZza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            this.zzg.zzf(zzdzc.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdwp zzdwpVarZzj = zzcvtVarZzf.zzj();
        zzdzo zzdzoVar = this.zzg;
        zzdwpVarZzj.zzi(zzclbVarZza, false, null, zzdzoVar);
        zzddr zzddrVarZzd = zzcvtVarZzf.zzd();
        zzddt zzddtVar = new zzddt() { // from class: com.google.android.gms.internal.ads.zzemw
            @Override // com.google.android.gms.internal.ads.zzddt
            public final /* synthetic */ void zzdr() {
                zzclb zzclbVar = zzclbVarZza;
                if (zzclbVar.zzP() != null) {
                    zzclbVar.zzP().zzq();
                }
            }
        };
        zzhcp zzhcpVar = zzcfy.zzh;
        zzddrVarZzd.zzq(zzddtVar, zzhcpVar);
        zzfks zzfksVar = zzfknVar.zzs;
        String strZza = zzfksVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgt)).booleanValue() && zzcvtVarZzf.zzm().zza(true)) {
            strZza = zzcms.zza(strZza, zzcms.zzb(zzfknVar));
        }
        zzcvtVarZzf.zzj();
        ListenableFuture listenableFutureZzj = zzdwp.zzj(zzclbVarZza, zzfksVar.zzb, strZza, zzdzoVar, zzcwxVar.zze());
        if (zzfknVar.zzM) {
            Objects.requireNonNull(zzclbVarZza);
            listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclbVarZza.zzav();
                }
            }, this.zze);
        }
        listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzclbVarZza);
            }
        }, this.zze);
        return zzhcf.zzk(listenableFutureZzj, new zzgti() { // from class: com.google.android.gms.internal.ads.zzemy
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcvtVarZzf.zzi();
            }
        }, zzhcpVar);
    }

    final /* synthetic */ void zzd(zzclb zzclbVar) {
        zzclbVar.zzJ();
        zzflg zzflgVar = this.zzd;
        zzcmh zzcmhVarZzh = zzclbVar.zzh();
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzflgVar.zza;
        if (zzfwVar != null && zzcmhVarZzh != null) {
            zzcmhVarZzh.zzc(zzfwVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbZ)).booleanValue() || zzclbVar.isAttachedToWindow()) {
            return;
        }
        zzclbVar.onPause();
        zzclbVar.zzaG(true);
    }
}
