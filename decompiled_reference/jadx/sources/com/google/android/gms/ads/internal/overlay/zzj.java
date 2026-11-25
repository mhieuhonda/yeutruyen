package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzclb;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzj {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzj(zzclb zzclbVar) throws zzh {
        this.zzb = zzclbVar.getLayoutParams();
        ViewParent parent = zzclbVar.getParent();
        this.zzd = zzclbVar.zzK();
        if (!(parent instanceof ViewGroup)) {
            throw new zzh("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzclbVar.zzE());
        viewGroup.removeView(zzclbVar.zzE());
        zzclbVar.zzag(true);
    }
}
