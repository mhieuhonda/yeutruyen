package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeml implements zzema {
    private final zzcvg zza;
    private final zzdwq zzb;
    private final zzflg zzc;
    private final Executor zzd;
    private final VersionInfoParcel zze;
    private final zzbqa zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzku)).booleanValue();
    private final zzekz zzh;
    private final zzdzo zzi;
    private final zzdzt zzj;

    public zzeml(zzcvg zzcvgVar, Context context, Executor executor, zzdwq zzdwqVar, zzflg zzflgVar, VersionInfoParcel versionInfoParcel, zzbqa zzbqaVar, zzekz zzekzVar, zzdzo zzdzoVar, zzdzt zzdztVar) {
        this.zza = zzcvgVar;
        this.zzd = executor;
        this.zzb = zzdwqVar;
        this.zzc = zzflgVar;
        this.zze = versionInfoParcel;
        this.zzf = zzbqaVar;
        this.zzh = zzekzVar;
        this.zzi = zzdzoVar;
        this.zzj = zzdztVar;
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
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzemj
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfknVar, zzfkyVar, zzdwuVar, obj);
            }
        };
        Executor executor = this.zzd;
        ListenableFuture listenableFutureZzj = zzhcf.zzj(listenableFutureZza, zzhbnVar, executor);
        Objects.requireNonNull(zzdwuVar);
        listenableFutureZzj.addListener(new Runnable(zzdwuVar) { // from class: com.google.android.gms.internal.ads.zzemk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return listenableFutureZzj;
    }

    final /* synthetic */ ListenableFuture zzc(final zzfkn zzfknVar, zzfky zzfkyVar, zzdwu zzdwuVar, Object obj) throws zzclq {
        zzbio zzbioVar = zzbix.zzcV;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            this.zzi.zzf(zzdzc.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdwq zzdwqVar = this.zzb;
        zzflg zzflgVar = this.zzc;
        final zzclb zzclbVarZza = zzdwqVar.zza(zzflgVar.zzf, zzfknVar, zzfkyVar.zzb.zzb);
        zzclbVarZza.zzaw(zzfknVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            this.zzi.zzf(zzdzc.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcgd zzcgdVar = new zzcgd();
        zzcvg zzcvgVar = this.zza;
        zzcyq zzcyqVar = new zzcyq(zzfkyVar, zzfknVar, null);
        VersionInfoParcel versionInfoParcel = this.zze;
        boolean z = this.zzg;
        zzbqa zzbqaVar = this.zzf;
        final zzcvd zzcvdVarZzf = zzcvgVar.zzf(zzcyqVar, new zzdml(new zzemn(versionInfoParcel, zzcgdVar, zzfknVar, zzclbVarZza, zzflgVar, z, zzbqaVar, this.zzh, this.zzj), zzclbVarZza), new zzcve(zzfknVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            this.zzi.zzf(zzdzc.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdwp zzdwpVarZzi = zzcvdVarZzf.zzi();
        zzbqa zzbqaVar2 = true == z ? zzbqaVar : null;
        zzdzo zzdzoVar = this.zzi;
        zzdwpVarZzi.zzi(zzclbVarZza, false, zzbqaVar2, zzdzoVar);
        zzcgdVar.zzc(zzcvdVarZzf);
        zzcvdVarZzf.zzd().zzq(new zzddt() { // from class: com.google.android.gms.internal.ads.zzemh
            @Override // com.google.android.gms.internal.ads.zzddt
            public final /* synthetic */ void zzdr() {
                zzclb zzclbVar = zzclbVarZza;
                if (zzclbVar.zzP() != null) {
                    zzclbVar.zzP().zzq();
                }
            }
        }, zzcfy.zzh);
        zzfks zzfksVar = zzfknVar.zzs;
        String strZza = zzfksVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgt)).booleanValue() && zzcvdVarZzf.zzk().zza(true)) {
            strZza = zzcms.zza(strZza, zzcms.zzb(zzfknVar));
        }
        zzcvdVarZzf.zzi();
        return zzhcf.zzk(zzdwp.zzj(zzclbVarZza, zzfksVar.zzb, strZza, zzdzoVar, zzcvgVar.zzd()), new zzgti(this) { // from class: com.google.android.gms.internal.ads.zzemi
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj2) {
                zzclb zzclbVar = zzclbVarZza;
                if (zzfknVar.zzM) {
                    zzclbVar.zzav();
                }
                zzcvd zzcvdVar = zzcvdVarZzf;
                zzclbVar.zzJ();
                zzclbVar.onPause();
                return zzcvdVar.zzh();
            }
        }, this.zzd);
    }
}
