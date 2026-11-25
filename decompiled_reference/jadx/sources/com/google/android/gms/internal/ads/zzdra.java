package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdra {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzflg zzc;
    private final zzdqg zzd;
    private final zzdqb zze;
    private final zzdro zzf;
    private final zzdrw zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbma zzj;
    private final zzdpy zzk;

    public zzdra(com.google.android.gms.ads.internal.util.zzg zzgVar, zzflg zzflgVar, zzdqg zzdqgVar, zzdqb zzdqbVar, zzdro zzdroVar, zzdrw zzdrwVar, Executor executor, Executor executor2, zzdpy zzdpyVar) {
        this.zzb = zzgVar;
        this.zzc = zzflgVar;
        this.zzj = zzflgVar.zzj;
        this.zzd = zzdqgVar;
        this.zze = zzdqbVar;
        this.zzf = zzdroVar;
        this.zzg = zzdrwVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdpyVar;
    }

    public final void zza(final zzdry zzdryVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(zzdryVar);
            }
        });
    }

    public final void zzb(zzdry zzdryVar) {
        zzdro zzdroVar;
        if (zzdryVar == null || (zzdroVar = this.zzf) == null || zzdryVar.zzdA() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdryVar.zzdA().addView(zzdroVar.zza());
        } catch (zzclq e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzc(zzdry zzdryVar) {
        if (zzdryVar == null) {
            return;
        }
        Context context = zzdryVar.zzdF().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdrw zzdrwVar = this.zzg;
            if (zzdrwVar == null || zzdryVar.zzdA() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdrwVar.zza(zzdryVar.zzdA(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzclq e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    final /* synthetic */ void zzf(zzdry zzdryVar) {
        ViewGroup viewGroup;
        View viewZzA;
        final ViewGroup viewGroup2;
        zzbmi zzbmiVarZza;
        Drawable drawable;
        zzdqg zzdqgVar = this.zzd;
        if (!zzdqgVar.zze() && !zzdqgVar.zzc()) {
            viewGroup = null;
            break;
        }
        String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
        int i = 0;
        while (true) {
            if (i >= 2) {
                viewGroup = null;
                break;
            }
            View viewZzl = zzdryVar.zzl(strArr[i]);
            if (viewZzl instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewZzl;
                break;
            }
            i++;
        }
        Context context = zzdryVar.zzdF().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdqb zzdqbVar = this.zze;
        if (zzdqbVar.zzA() != null) {
            viewZzA = zzdqbVar.zzA();
            zzbma zzbmaVar = this.zzj;
            if (zzbmaVar != null && viewGroup == null) {
                zzh(layoutParams, zzbmaVar.zze);
                viewZzA.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdqbVar.zzz() instanceof zzblt) {
            zzblt zzbltVar = (zzblt) zzdqbVar.zzz();
            if (viewGroup == null) {
                zzh(layoutParams, zzbltVar.zzi());
                viewGroup = null;
            }
            View zzbluVar = new zzblu(context, zzbltVar, layoutParams);
            zzbluVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeQ));
            viewZzA = zzbluVar;
        } else {
            viewZzA = null;
        }
        if (viewZzA != null) {
            if (viewZzA.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewZzA.getParent()).removeView(viewZzA);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewZzA);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdryVar.zzdF().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(viewZzA);
                FrameLayout frameLayoutZzdA = zzdryVar.zzdA();
                if (frameLayoutZzdA != null) {
                    frameLayoutZzdA.addView(zzaVar);
                }
            }
            zzdryVar.zzh(zzdryVar.zzm(), viewZzA, true);
        }
        zzgwt zzgwtVar = zzdqw.zza;
        int size = zzgwtVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewZzl2 = zzdryVar.zzl((String) zzgwtVar.get(i2));
            i2++;
            if (viewZzl2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewZzl2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            if (zzdqbVar.zzT() != null) {
                zzdqbVar.zzT().zzaq(new zzdqx(zzdryVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlG)).booleanValue() && zzi(viewGroup2, false)) {
            if (zzdqbVar.zzU() != null) {
                zzdqbVar.zzU().zzaq(new zzdqx(zzdryVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzdF = zzdryVar.zzdF();
        Context context2 = viewZzdF != null ? viewZzdF.getContext() : null;
        if (context2 == null || (zzbmiVarZza = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper iObjectWrapperZzg = zzbmiVarZza.zzg();
            if (iObjectWrapperZzg == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzg)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper iObjectWrapperZzn = zzdryVar.zzn();
            if (iObjectWrapperZzn == null || !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhm)).booleanValue()) {
                imageView.setScaleType(zza);
            } else {
                imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzn));
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get main image drawable");
        }
    }

    final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdqb zzdqbVar = this.zze;
        if (zzdqbVar.zzJ() != null) {
            boolean z = viewGroup != null;
            if (zzdqbVar.zzx() == 2 || zzdqbVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, String.valueOf(zzdqbVar.zzx()), z);
            } else if (zzdqbVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                String str = this.zzc.zzg;
                zzgVar.zzr(str, ExifInterface.GPS_MEASUREMENT_2D, z);
                zzgVar.zzr(str, "1", z);
            }
        }
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        zzdqb zzdqbVar = this.zze;
        View viewZzJ = z ? zzdqbVar.zzJ() : zzdqbVar.zzK();
        if (viewZzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzJ.getParent()).removeView(viewZzJ);
        }
        viewGroup.addView(viewZzJ, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeS)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
