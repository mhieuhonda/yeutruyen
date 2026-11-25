package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzduh extends zzbsk implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzblv {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzea zzb;
    private zzdpw zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzduh(zzdpw zzdpwVar, zzdqb zzdqbVar) {
        this.zza = zzdqbVar.zzJ();
        this.zzb = zzdqbVar.zzy();
        this.zzc = zzdpwVar;
        if (zzdqbVar.zzT() != null) {
            zzdqbVar.zzT().zzax(this);
        }
    }

    private final void zzg() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private final void zzh() {
        View view;
        zzdpw zzdpwVar = this.zzc;
        if (zzdpwVar == null || (view = this.zza) == null) {
            return;
        }
        zzdpwVar.zzu(view, Collections.emptyMap(), Collections.emptyMap(), zzdpw.zzI(this.zza));
    }

    private static final void zzi(zzbso zzbsoVar, int i) {
        try {
            zzbsoVar.zzf(i);
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zza() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdug
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    this.zza.zzc();
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final com.google.android.gms.ads.internal.client.zzea zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zzc() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzg();
        zzdpw zzdpwVar = this.zzc;
        if (zzdpwVar != null) {
            zzdpwVar.zzd();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zzd(IObjectWrapper iObjectWrapper, zzbso zzbsoVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream ad can not be shown after destroy().");
            zzi(zzbsoVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream internal error: ".concat(str));
            zzi(zzbsoVar, 0);
            return;
        }
        if (this.zze) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream ad should not be used again.");
            zzi(zzbsoVar, 1);
            return;
        }
        this.zze = true;
        zzg();
        ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgl.zza(this.zza, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgl.zzb(this.zza, this);
        zzh();
        try {
            zzbsoVar.zze();
        } catch (RemoteException e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzd(iObjectWrapper, new zzduf(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final zzbmi zzf() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdpw zzdpwVar = this.zzc;
        if (zzdpwVar == null || zzdpwVar.zzP() == null) {
            return null;
        }
        return zzdpwVar.zzP().zza();
    }
}
