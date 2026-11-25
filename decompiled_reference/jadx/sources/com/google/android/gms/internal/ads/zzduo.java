package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzduo extends zzbnb {
    private final Context zza;
    private final zzdqb zzb;
    private zzdra zzc;
    private zzdpw zzd;

    public zzduo(Context context, zzdqb zzdqbVar, zzdra zzdraVar, zzdpw zzdpwVar) {
        this.zza = context;
        this.zzb = zzdqbVar;
        this.zzc = zzdraVar;
        this.zzd = zzdpwVar;
    }

    final /* synthetic */ zzdpw zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final zzbml zzf(String str) {
        return (zzbml) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final List zzg() {
        try {
            zzdqb zzdqbVar = this.zzb;
            SimpleArrayMap simpleArrayMapZzaa = zzdqbVar.zzaa();
            SimpleArrayMap simpleArrayMapZzad = zzdqbVar.zzad();
            String[] strArr = new String[simpleArrayMapZzaa.getSize() + simpleArrayMapZzad.getSize()];
            int i = 0;
            for (int i2 = 0; i2 < simpleArrayMapZzaa.getSize(); i2++) {
                strArr[i] = (String) simpleArrayMapZzaa.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < simpleArrayMapZzad.getSize(); i3++) {
                strArr[i] = (String) simpleArrayMapZzad.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zzi(String str) {
        zzdpw zzdpwVar = this.zzd;
        if (zzdpwVar != null) {
            zzdpwVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zzj() {
        zzdpw zzdpwVar = this.zzd;
        if (zzdpwVar != null) {
            zzdpwVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final com.google.android.gms.ads.internal.client.zzea zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zzl() {
        zzdpw zzdpwVar = this.zzd;
        if (zzdpwVar != null) {
            zzdpwVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        zzdra zzdraVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdraVar = this.zzc) == null || !zzdraVar.zzd((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzdun(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final boolean zzo() {
        zzdpw zzdpwVar = this.zzd;
        if (zzdpwVar != null && !zzdpwVar.zzM()) {
            return false;
        }
        zzdqb zzdqbVar = this.zzb;
        return zzdqbVar.zzW() != null && zzdqbVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final boolean zzp() {
        zzdqb zzdqbVar = this.zzb;
        zzelv zzelvVarZzZ = zzdqbVar.zzZ();
        if (zzelvVarZzZ == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zze(zzelvVarZzZ.zza());
        if (zzdqbVar.zzW() == null) {
            return true;
        }
        zzdqbVar.zzW().zze("onSdkLoaded", new ArrayMap());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzdpw zzdpwVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzZ() == null || (zzdpwVar = this.zzd) == null) {
            return;
        }
        zzdpwVar.zzN((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zzr() {
        try {
            String strZzac = this.zzb.zzac();
            if (Objects.equals(strZzac, "Google")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(strZzac)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdpw zzdpwVar = this.zzd;
                if (zzdpwVar != null) {
                    zzdpwVar.zzL(strZzac, false);
                }
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final zzbmi zzs() throws RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        zzdra zzdraVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdraVar = this.zzc) == null || !zzdraVar.zze((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzdun(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }
}
