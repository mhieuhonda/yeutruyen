package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqw extends zzbmo implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdry {
    public static final zzgwt zza = zzgwt.zzl("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzhcp zzf;
    private View zzg;
    private zzdpw zzi;
    private zzbez zzj;
    private zzbmi zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = 261710000;

    public zzdqw(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgl.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgl.zzb(frameLayout, this);
        this.zzf = zzcfy.zzf;
        this.zzj = new zzbez(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzs() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznj)).booleanValue() || this.zzi.zzG() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdre(this.zzi, this));
    }

    private final synchronized void zzt() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr();
            }
        });
    }

    private final synchronized void zzu(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] bArrDecode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar == null || !zzdpwVar.zzH()) {
            return;
        }
        this.zzi.zzz();
        this.zzi.zzi(view, this.zzd, zzi(), zzj(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdpwVar.zzu(frameLayout, zzi(), zzj(), zzdpw.zzI(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdpwVar.zzu(frameLayout, zzi(), zzj(), zzdpw.zzI(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar != null) {
            zzdpwVar.zzk(view, motionEvent, this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznj)).booleanValue() && this.zzo != null && this.zzi.zzG() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zzh(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized IObjectWrapper zzc(String str) {
        return ObjectWrapper.wrap(zzl(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzd(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof zzdpw)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar != null) {
            zzdpwVar.zzh(this);
        }
        zzt();
        zzdpw zzdpwVar2 = (zzdpw) objUnwrap;
        this.zzi = zzdpwVar2;
        zzdpwVar2.zzg(this);
        this.zzi.zzN(this.zzd);
        this.zzi.zzO(this.zze);
        if (this.zzm) {
            this.zzi.zzP().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeV)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzK())) {
            zzu(this.zzi.zzK());
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final FrameLayout zzdA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzdB(IObjectWrapper iObjectWrapper) {
        this.zzi.zzx((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzdC(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzdD(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzdE(zzbmi zzbmiVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbmiVar;
            zzdpw zzdpwVar = this.zzi;
            if (zzdpwVar != null) {
                zzdpwVar.zzP().zzb(zzbmiVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final /* synthetic */ View zzdF() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zze() {
        if (this.zzn) {
            return;
        }
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar != null) {
            zzdpwVar.zzh(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final zzbez zzg() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized void zzh(String str, View view, boolean z) {
        if (!this.zzn) {
            Map map = this.zzc;
            if (view == null) {
                map.remove(str);
                return;
            }
            map.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbs.zza(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzi() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized Map zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized View zzl(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized String zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final IObjectWrapper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized JSONObject zzo() {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar == null) {
            return null;
        }
        return zzdpwVar.zzv(this.zzd, zzi(), zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzdry
    public final synchronized JSONObject zzp() {
        zzdpw zzdpwVar = this.zzi;
        if (zzdpwVar == null) {
            return null;
        }
        return zzdpwVar.zzw(this.zzd, zzi(), zzj());
    }

    public final FrameLayout zzq() {
        return this.zzd;
    }

    final /* synthetic */ void zzr() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
