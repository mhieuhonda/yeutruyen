package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeqn implements zzema {
    private final Context zza;
    private final zzdwq zzb;
    private final zzdvz zzc;
    private final zzflg zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbqa zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzku)).booleanValue();
    private final zzekz zzi;
    private final zzdzo zzj;
    private final zzdzt zzk;

    public zzeqn(Context context, VersionInfoParcel versionInfoParcel, zzflg zzflgVar, Executor executor, zzdvz zzdvzVar, zzdwq zzdwqVar, zzbqa zzbqaVar, zzekz zzekzVar, zzdzo zzdzoVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzd = zzflgVar;
        this.zzc = zzdvzVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdwqVar;
        this.zzg = zzbqaVar;
        this.zzi = zzekzVar;
        this.zzj = zzdzoVar;
        this.zzk = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar = zzfknVar.zzs;
        return (zzfksVar == null || zzfksVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final ListenableFuture zzb(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        final zzdwu zzdwuVar = new zzdwu();
        ListenableFuture listenableFutureZza = zzhcf.zza(null);
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeqm
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfknVar, zzfkyVar, zzdwuVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture listenableFutureZzj = zzhcf.zzj(listenableFutureZza, zzhbnVar, executor);
        Objects.requireNonNull(zzdwuVar);
        listenableFutureZzj.addListener(new Runnable(zzdwuVar) { // from class: com.google.android.gms.internal.ads.zzeqg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return listenableFutureZzj;
    }

    final /* synthetic */ ListenableFuture zzc(final zzfkn zzfknVar, zzfky zzfkyVar, zzdwu zzdwuVar, Object obj) throws zzclq {
        zzbio zzbioVar = zzbix.zzcV;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            this.zzj.zzf(zzdzc.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdwq zzdwqVar = this.zzb;
        zzflg zzflgVar = this.zzd;
        final zzclb zzclbVarZza = zzdwqVar.zza(zzflgVar.zzf, zzfknVar, zzfkyVar.zzb.zzb);
        zzclbVarZza.zzaw(zzfknVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            this.zzj.zzf(zzdzc.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcgd zzcgdVar = new zzcgd();
        zzdvz zzdvzVar = this.zzc;
        zzcyq zzcyqVar = new zzcyq(zzfkyVar, zzfknVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbqa zzbqaVar = this.zzg;
        boolean z = this.zzh;
        zzekz zzekzVar = this.zzi;
        zzdzo zzdzoVar = this.zzj;
        final zzdvv zzdvvVarZzf = zzdvzVar.zzf(zzcyqVar, new zzdvw(new zzeqj(context, zzdwqVar, zzflgVar, versionInfoParcel, zzfknVar, zzcgdVar, zzclbVarZza, zzbqaVar, z, zzekzVar, zzdzoVar, this.zzk), zzclbVarZza));
        zzcgdVar.zzc(zzdvvVarZzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            zzdzoVar.zzf(zzdzc.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzbqq.zzb(zzclbVarZza, zzdvvVarZzf.zzk());
        zzdvvVarZzf.zzd().zzq(new zzddt() { // from class: com.google.android.gms.internal.ads.zzeqk
            @Override // com.google.android.gms.internal.ads.zzddt
            public final /* synthetic */ void zzdr() {
                zzclb zzclbVar = zzclbVarZza;
                if (zzclbVar.zzP() != null) {
                    zzclbVar.zzP().zzq();
                }
            }
        }, zzcfy.zzh);
        zzdvvVarZzf.zzl().zzi(zzclbVarZza, true, true != z ? null : zzbqaVar, zzdzoVar);
        zzfks zzfksVar = zzfknVar.zzs;
        String strZza = zzfksVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgt)).booleanValue() && zzdvvVarZzf.zzo().zza(true)) {
            strZza = zzcms.zza(strZza, zzcms.zzb(zzfknVar));
        }
        zzdvvVarZzf.zzl();
        return zzhcf.zzk(zzdwp.zzj(zzclbVarZza, zzfksVar.zzb, strZza, zzdzoVar, zzdvzVar.zzd()), new zzgti(this) { // from class: com.google.android.gms.internal.ads.zzeql
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj2) {
                zzclb zzclbVar = zzclbVarZza;
                if (zzfknVar.zzM) {
                    zzclbVar.zzav();
                }
                zzdvv zzdvvVar = zzdvvVarZzf;
                zzclbVar.zzJ();
                zzclbVar.onPause();
                return zzdvvVar.zzh();
            }
        }, this.zze);
    }
}
