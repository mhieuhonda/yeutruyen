package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmu;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzcet;
import com.google.android.gms.internal.ads.zzcnq;
import com.google.android.gms.internal.ads.zzdqu;
import com.google.android.gms.internal.ads.zzdqw;
import com.google.android.gms.internal.ads.zzebk;
import com.google.android.gms.internal.ads.zzesl;
import com.google.android.gms.internal.ads.zzffo;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzfkg;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class ClientApi extends zzcn {
    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzb(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvj zzbvjVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfhc zzfhcVarZzj = zzcnq.zza(context, zzbvjVar, i).zzj();
        zzfhcVarZzj.zzd(context);
        zzfhcVarZzj.zzb(zzrVar);
        zzfhcVarZzj.zzc(str);
        return zzfhcVarZzj.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvj zzbvjVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfis zzfisVarZzn = zzcnq.zza(context, zzbvjVar, i).zzn();
        zzfisVarZzn.zzd(context);
        zzfisVarZzn.zzb(zzrVar);
        zzfisVarZzn.zzc(str);
        return zzfisVarZzn.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbq zzd(IObjectWrapper iObjectWrapper, String str, zzbvj zzbvjVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzesl(zzcnq.zza(context, zzbvjVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmp zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdqw((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 261710000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcbz zzf(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfkg zzfkgVarZzq = zzcnq.zza(context, zzbvjVar, i).zzq();
        zzfkgVarZzq.zzc(context);
        return zzfkgVarZzq.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzi zzg(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new zzw(activity);
        }
        int i = adOverlayInfoParcelZza.zzk;
        if (i == 1) {
            return new zzv(activity);
        }
        if (i == 2) {
            return new zzai(activity);
        }
        if (i == 3) {
            return new zzaj(activity);
        }
        if (i != 4) {
            return i != 5 ? new zzw(activity) : new zzag(activity);
        }
        return new zzac(activity, adOverlayInfoParcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzh(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) {
        return zzcnq.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvjVar, i).zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzi(IObjectWrapper iObjectWrapper, int i) {
        return zzcnq.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    @Deprecated
    public final zzbu zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzrVar, str, new VersionInfoParcel(261710000, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmu zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdqu((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzccp zzl(IObjectWrapper iObjectWrapper, String str, zzbvj zzbvjVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfkg zzfkgVarZzq = zzcnq.zza(context, zzbvjVar, i).zzq();
        zzfkgVarZzq.zzc(context);
        zzfkgVarZzq.zzb(str);
        return zzfkgVarZzq.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzm(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvj zzbvjVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzffo zzffoVarZzl = zzcnq.zza(context, zzbvjVar, i).zzl();
        zzffoVarZzl.zzb(str);
        zzffoVarZzl.zzc(context);
        return zzffoVarZzl.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcet zzn(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) {
        return zzcnq.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvjVar, i).zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzb zzo(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) {
        return zzcnq.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvjVar, i).zzu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbra zzp(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i, zzbqx zzbqxVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzebk zzebkVarZzA = zzcnq.zza(context, zzbvjVar, i).zzA();
        zzebkVarZzA.zzc(context);
        zzebkVarZzA.zzb(zzbqxVar);
        return zzebkVarZzA.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzq(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) {
        return zzcnq.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvjVar, i).zzC();
    }
}
