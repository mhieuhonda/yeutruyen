package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpj extends zzbmh {
    private final zzdqb zza;
    private IObjectWrapper zzb;

    public zzdpj(zzdqb zzdqbVar) {
        this.zza = zzdqbVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final float zze() throws RemoteException {
        zzcnl zzcnlVarZzN;
        int i;
        int i2;
        zzdqb zzdqbVar = this.zza;
        if (zzdqbVar.zzab() != 0.0f) {
            return zzdqbVar.zzab();
        }
        if (zzdqbVar.zzy() != null) {
            try {
                return zzdqbVar.zzy().zzm();
            } catch (RemoteException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoa)).booleanValue() && zzdqbVar.zzU() != null && (zzcnlVarZzN = zzdqbVar.zzU().zzN()) != null && (i = zzcnlVarZzN.zzb) >= 0 && (i2 = zzcnlVarZzN.zza) > 0) {
            return i / i2;
        }
        zzbml zzbmlVarZzD = zzdqbVar.zzD();
        if (zzbmlVarZzD == null) {
            return 0.0f;
        }
        float fZze = (zzbmlVarZzD.zze() == -1 || zzbmlVarZzD.zzf() == -1) ? 0.0f : zzbmlVarZzD.zze() / zzbmlVarZzD.zzf();
        return fZze == 0.0f ? zzb(zzbmlVarZzD.zzb()) : fZze;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final IObjectWrapper zzg() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbml zzbmlVarZzD = this.zza.zzD();
        if (zzbmlVarZzD == null) {
            return null;
        }
        return zzbmlVarZzD.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final float zzh() throws RemoteException {
        zzdqb zzdqbVar = this.zza;
        if (zzdqbVar.zzy() != null) {
            return zzdqbVar.zzy().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final float zzi() throws RemoteException {
        zzdqb zzdqbVar = this.zza;
        if (zzdqbVar.zzy() != null) {
            return zzdqbVar.zzy().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final com.google.android.gms.ads.internal.client.zzea zzj() throws RemoteException {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final boolean zzk() throws RemoteException {
        return this.zza.zzy() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final boolean zzl() throws RemoteException {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzm(zzbnq zzbnqVar) {
        zzdqb zzdqbVar = this.zza;
        if (zzdqbVar.zzy() instanceof zzcmh) {
            ((zzcmh) zzdqbVar.zzy()).zzv(zzbnqVar);
        }
    }
}
