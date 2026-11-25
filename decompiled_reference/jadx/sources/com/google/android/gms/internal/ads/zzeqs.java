package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeqs extends zzccg {
    final /* synthetic */ zzdfk zza;
    final /* synthetic */ zzdcx zzb;
    final /* synthetic */ zzdeg zzc;
    final /* synthetic */ zzdlp zzd;

    zzeqs(zzeqt zzeqtVar, zzdfk zzdfkVar, zzdcx zzdcxVar, zzdeg zzdegVar, zzdlp zzdlpVar) {
        this.zza = zzdfkVar;
        this.zzb = zzdcxVar;
        this.zzc = zzdegVar;
        this.zzd = zzdlpVar;
        Objects.requireNonNull(zzeqtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zze(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzf(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzg(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdU(4);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzk(IObjectWrapper iObjectWrapper, zzcci zzcciVar) {
        this.zzd.zzb(zzcciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzl(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzm(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zzp(IObjectWrapper iObjectWrapper) {
        this.zzd.zzb(null);
    }
}
