package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenw implements zzema {
    private final Context zza;
    private final zzdwq zzb;
    private final zzdno zzc;
    private final zzflg zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbqa zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzku)).booleanValue();
    private final zzekz zzi;
    private final zzdzo zzj;
    private final zzdzt zzk;

    public zzenw(Context context, VersionInfoParcel versionInfoParcel, zzflg zzflgVar, Executor executor, zzdno zzdnoVar, zzdwq zzdwqVar, zzbqa zzbqaVar, zzekz zzekzVar, zzdzo zzdzoVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzd = zzflgVar;
        this.zzc = zzdnoVar;
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
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzent
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfknVar, zzfkyVar, zzdwuVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture listenableFutureZzj = zzhcf.zzj(listenableFutureZza, zzhbnVar, executor);
        Objects.requireNonNull(zzdwuVar);
        listenableFutureZzj.addListener(new Runnable(zzdwuVar) { // from class: com.google.android.gms.internal.ads.zzenv
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
        zzdno zzdnoVar = this.zzc;
        zzcyq zzcyqVar = new zzcyq(zzfkyVar, zzfknVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        boolean z = this.zzh;
        zzbqa zzbqaVar = this.zzg;
        final zzdmi zzdmiVarZzd = zzdnoVar.zzd(zzcyqVar, new zzdml(new zzenu(context, versionInfoParcel, zzcgdVar, zzfknVar, zzclbVarZza, zzflgVar, z, zzbqaVar, this.zzi, this.zzk), zzclbVarZza));
        zzcgdVar.zzc(zzdmiVarZzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            this.zzj.zzf(zzdzc.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdmiVarZzd.zzd().zzq(new zzddt() { // from class: com.google.android.gms.internal.ads.zzenr
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgt)).booleanValue() && zzdmiVarZzd.zzl().zza(true)) {
            strZza = zzcms.zza(strZza, zzcms.zzb(zzfknVar));
        }
        zzdwp zzdwpVarZzk = zzdmiVarZzd.zzk();
        zzbqa zzbqaVar2 = true != z ? null : zzbqaVar;
        zzdzo zzdzoVar = this.zzj;
        zzdwpVarZzk.zzi(zzclbVarZza, true, zzbqaVar2, zzdzoVar);
        zzdmiVarZzd.zzk();
        return zzhcf.zzk(zzdwp.zzj(zzclbVarZza, zzfksVar.zzb, strZza, zzdzoVar, zzdnoVar.zzc()), new zzgti(this) { // from class: com.google.android.gms.internal.ads.zzens
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj2) {
                zzclb zzclbVar = zzclbVarZza;
                if (zzfknVar.zzM) {
                    zzclbVar.zzav();
                }
                zzdmi zzdmiVar = zzdmiVarZzd;
                zzclbVar.zzJ();
                zzclbVar.onPause();
                return zzdmiVar.zzh();
            }
        }, this.zze);
    }
}
