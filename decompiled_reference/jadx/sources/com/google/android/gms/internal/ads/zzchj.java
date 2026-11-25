package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzchj {
    private final Context zza;
    private final zzchu zzb;
    private final ViewGroup zzc;
    private final zzdzt zzd;
    private zzchi zze;

    public zzchj(Context context, ViewGroup viewGroup, zzclb zzclbVar, zzdzt zzdztVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzclbVar;
        this.zze = null;
        this.zzd = zzdztVar;
    }

    public final Integer zza() {
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            return zzchiVar.zzl();
        }
        return null;
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            zzchiVar.zzn(i, i2, i3, i4);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4, int i5, boolean z, zzcht zzchtVar) {
        if (this.zze != null) {
            return;
        }
        zzchu zzchuVar = this.zzb;
        zzbje.zza(zzchuVar.zzq().zzc(), zzchuVar.zzi(), "vpr2");
        zzchi zzchiVar = new zzchi(this.zza, zzchuVar, i5, z, zzchuVar.zzq().zzc(), zzchtVar, this.zzd);
        this.zze = zzchiVar;
        this.zzc.addView(zzchiVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzn(i, i2, i3, i4);
        zzchuVar.zzdn(false);
    }

    public final zzchi zzd() {
        return this.zze;
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            zzchiVar.zzr();
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            zzchiVar.zzE();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzg(int i) {
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            zzchiVar.zzm(i);
        }
    }
}
