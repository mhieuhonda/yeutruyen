package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzbop;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzclr;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzcmz;
import com.google.android.gms.internal.ads.zzcnl;
import com.google.android.gms.internal.ads.zzddm;
import com.google.android.gms.internal.ads.zzdlg;
import com.google.android.gms.internal.ads.zzdzs;
import com.google.android.gms.internal.ads.zzdzt;
import com.google.android.gms.internal.ads.zzela;
import com.google.android.gms.internal.ads.zzelb;
import com.google.android.gms.internal.ads.zzelt;
import com.google.android.gms.internal.ads.zzelv;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgui;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzm extends zzbzh implements zzah {
    static final int zza = Color.argb(0, 0, 0, 0);
    public static final /* synthetic */ int zzp = 0;
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzclb zzd;
    zzj zze;
    zzu zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzi zzl;
    private Runnable zzs;
    private boolean zzt;
    private boolean zzu;
    private Toolbar zzy;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzo = 1;
    int zzn = 0;
    private final Object zzq = new Object();
    private final View.OnClickListener zzr = new zzd(this);
    private boolean zzv = false;
    private boolean zzw = false;
    private boolean zzx = true;

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    private final void zzJ(View view) {
        zzelv zzelvVarZzU;
        zzelt zzeltVarZzV;
        zzclb zzclbVar = this.zzd;
        if (zzclbVar == null) {
            return;
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zzgt)).booleanValue() && (zzeltVarZzV = zzclbVar.zzV()) != null) {
            zzeltVarZzV.zzf(view);
        } else if (((Boolean) zzba.zzc().zzd(zzbix.zzgs)).booleanValue() && (zzelvVarZzU = zzclbVar.zzU()) != null && zzelvVarZzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzelvVarZzU.zza(), view);
        }
    }

    private static final void zzK(zzelv zzelvVar, View view) {
        if (zzelvVar == null || view == null) {
            return;
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zzgs)).booleanValue() && zzelvVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzelvVar.zza(), view);
    }

    protected final void zzA() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.zzb.isFinishing() || this.zzv) {
            return;
        }
        this.zzv = true;
        zzclb zzclbVar = this.zzd;
        if (zzclbVar != null) {
            zzclbVar.zzH(this.zzo - 1);
            synchronized (this.zzq) {
                if (!this.zzt && this.zzd.zzaa()) {
                    if (((Boolean) zzba.zzc().zzd(zzbix.zzgg)).booleanValue() && !this.zzw && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                        zzrVar.zzdT();
                    }
                    this.zzs = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzf
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzB();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this.zzs, ((Long) zzba.zzc().zzd(zzbix.zzbO)).longValue());
                    return;
                }
            }
        }
        zzB();
    }

    final void zzB() {
        zzclb zzclbVar;
        zzr zzrVar;
        if (this.zzw) {
            return;
        }
        this.zzw = true;
        zzclb zzclbVar2 = this.zzd;
        if (zzclbVar2 != null) {
            this.zzl.removeView(zzclbVar2.zzE());
            zzj zzjVar = this.zze;
            if (zzjVar != null) {
                this.zzd.zzai(zzjVar.zzd);
                this.zzd.zzag(false);
                if (((Boolean) zzba.zzc().zzd(zzbix.zzor)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzE());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzE = this.zzd.zzE();
                zzj zzjVar2 = this.zze;
                viewGroup.addView(viewZzE, zzjVar2.zza, zzjVar2.zzb);
                this.zze = null;
            } else {
                Activity activity = this.zzb;
                if (activity.getApplicationContext() != null) {
                    this.zzd.zzai(activity.getApplicationContext());
                }
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdU(this.zzo);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzclbVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzK(zzclbVar.zzU(), this.zzc.zzd.zzE());
    }

    public final void zzC() {
        if (this.zzm) {
            this.zzm = false;
            zzD();
        }
    }

    protected final void zzD() {
        this.zzd.zzI();
    }

    public final void zzE() {
        this.zzl.zzb = true;
    }

    public final void zzF() {
        synchronized (this.zzq) {
            this.zzt = true;
            if (this.zzs != null) {
                zzgax zzgaxVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzgaxVar.removeCallbacks(this.zzs);
                zzgaxVar.post(this.zzs);
            }
        }
    }

    public final void zzG(zzelb zzelbVar) throws RemoteException, zzh {
        zzbzb zzbzbVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbzbVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzh("noioou");
        }
        zzbzbVar.zzh(ObjectWrapper.wrap(zzelbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzH(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.zzb;
            zzela zzelaVarZze = zzelb.zze();
            zzelaVarZze.zza(activity);
            zzelaVarZze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzi(strArr, iArr, ObjectWrapper.wrap(zzelaVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzb() {
        this.zzo = 3;
        Activity activity = this.zzb;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzclb zzclbVar = this.zzd;
        if (zzclbVar != null) {
            zzclbVar.zzae(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzu = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzah
    public final void zzd() {
        this.zzo = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zze() {
        this.zzo = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzf() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final boolean zzg() {
        this.zzo = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zzkv)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzZ = this.zzd.zzZ();
        if (!zZzZ) {
            this.zzd.zze("onbackblocked", Collections.emptyMap());
        }
        return zZzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public void zzh(Bundle bundle) {
        zzr zzrVar;
        if (!this.zzu) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzh("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzo = 4;
            }
            if (activity.getIntent() != null) {
                this.zzx = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z = zzlVar.zza;
                this.zzk = z;
                this.zzn = (int) zzlVar.zze;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new zzl(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzl(this, null).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzx) {
                    zzddm zzddmVar = this.zzc.zzt;
                    if (zzddmVar != null) {
                        zzddmVar.zza();
                    }
                    zzr zzrVar2 = this.zzc.zzc;
                    if (zzrVar2 != null) {
                        zzrVar2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzdlg zzdlgVar = this.zzc.zzu;
                    if (zzdlgVar != null) {
                        zzdlgVar.zzdu();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            if (adOverlayInfoParcel3 != null && (zzrVar = adOverlayInfoParcel3.zzc) != null) {
                zzrVar.zzdo();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            zzi zziVar = new zzi(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
            this.zzl = zziVar;
            zziVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzf().zzh(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.zzc;
            int i = adOverlayInfoParcel5.zzk;
            if (i == 1) {
                zzy(false);
                return;
            }
            if (i == 2) {
                this.zze = new zzj(adOverlayInfoParcel5.zzd);
                zzy(false);
            } else if (i == 3) {
                zzy(true);
            } else {
                if (i != 5) {
                    throw new zzh("Could not determine ad overlay type.");
                }
                zzy(false);
            }
        } catch (zzh e) {
            String message = e.getMessage();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            this.zzo = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzi() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzj() {
        zzr zzrVar;
        if (((Boolean) zzba.zzc().zzd(zzbix.zzgh)).booleanValue()) {
            zzclb zzclbVar = this.zzd;
            if (zzclbVar == null || zzclbVar.zzX()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzk() {
        com.google.android.gms.ads.internal.zzl zzlVar;
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdx();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        boolean z = (adOverlayInfoParcel2 == null || (zzlVar = adOverlayInfoParcel2.zzo) == null || !zzlVar.zzg) ? false : true;
        Window window = this.zzb.getWindow();
        if (((Boolean) zzba.zzc().zzd(zzbix.zzbV)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(true != z ? 5380 : 5894);
        } else {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z) {
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            }
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zzpe)).booleanValue() && Build.VERSION.SDK_INT <= 34 && Build.VERSION.SDK_INT >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            WindowCompat.setDecorFitsSystemWindows(window, false);
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zzgh)).booleanValue()) {
            return;
        }
        zzclb zzclbVar = this.zzd;
        if (zzclbVar != null && !zzclbVar.zzX()) {
            this.zzd.onResume();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzl() {
        zzr zzrVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdw();
        }
        if (!((Boolean) zzba.zzc().zzd(zzbix.zzgh)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzm(int i, int i2, Intent intent) {
        zzdzt zzdztVarZzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            zzbio zzbioVar = zzbix.zzoP;
            if (((Boolean) zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i2);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                zzclb zzclbVar = this.zzd;
                if (zzclbVar == null || zzclbVar.zzP() == null || (zzdztVarZzI = zzclbVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                    return;
                }
                zzdzs zzdzsVarZza = zzdztVarZzI.zza();
                zzdzsVarZza.zzc("action", "hilca");
                zzdzsVarZza.zzc("gqi", zzgui.zza(adOverlayInfoParcel.zzq));
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length());
                sb2.append(i2);
                zzdzsVarZza.zzc("hilr", sb2.toString());
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdzsVarZza.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdzsVarZza.zzc("hills", stringExtra2);
                    }
                }
                zzdzsVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzn(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzp() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdy();
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zzgh)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzq() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdz();
        }
        zzclb zzclbVar = this.zzd;
        if (zzclbVar != null) {
            try {
                this.zzl.removeView(zzclbVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        zzA();
    }

    public final void zzr(boolean z) {
        if (this.zzc.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzba.zzc().zzd(zzbix.zzgj)).intValue();
        boolean z2 = ((Boolean) zzba.zzc().zzd(zzbix.zzbR)).booleanValue() || z;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z2 ? 0 : iIntValue;
        zztVar.zzb = true != z2 ? iIntValue : 0;
        zztVar.zzc = iIntValue;
        this.zzf = new zzu(this.zzb, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzt(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzJ(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzs() {
        this.zzu = true;
    }

    public final void zzt(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzba.zzc().zzd(zzbix.zzbP)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z5 = ((Boolean) zzba.zzc().zzd(zzbix.zzbQ)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbyn(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzuVar.zza(z3);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i) {
        Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zzd(zzbix.zzhb)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zzd(zzbix.zzhc)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzba.zzc().zzd(zzbix.zzhd)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzba.zzc().zzd(zzbix.zzhe)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.zzb;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzu = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    protected final void zzy(boolean z) throws zzh {
        boolean z2;
        ?? r2;
        if (!this.zzu) {
            this.zzb.requestWindowFeature(1);
        }
        Activity activity = this.zzb;
        Window window = activity.getWindow();
        if (window == null) {
            throw new zzh("Invalid activity, no window available.");
        }
        zzclb zzclbVar = this.zzc.zzd;
        zzcmz zzcmzVarZzP = zzclbVar != null ? zzclbVar.zzP() : null;
        boolean z3 = zzcmzVarZzP != null && zzcmzVarZzP.zzk();
        this.zzm = false;
        if (z3) {
            int i = this.zzc.zzj;
            if (i == 6) {
                z2 = activity.getResources().getConfiguration().orientation == 1;
                this.zzm = z2;
            } else if (i == 7) {
                z2 = activity.getResources().getConfiguration().orientation == 2;
                this.zzm = z2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(z2).length() + 41);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z2);
        String string = sb.toString();
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        zzw(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hardware acceleration on the AdActivity window enabled.");
        activity.setContentView(this.zzl);
        this.zzu = true;
        boolean z4 = this.zzk;
        zzi zziVar = this.zzl;
        if (z4) {
            zziVar.setBackgroundColor(zza);
            if (((Boolean) zzba.zzc().zzd(zzbix.zzbz)).booleanValue() && Build.VERSION.SDK_INT >= 31) {
                window.setBackgroundBlurRadius(this.zzn);
            }
        } else {
            zziVar.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                zzclb zzclbVar2 = this.zzc.zzd;
                zzcnl zzcnlVarZzN = zzclbVar2 != null ? zzclbVar2.zzN() : null;
                zzclb zzclbVar3 = this.zzc.zzd;
                String strZzO = zzclbVar3 != null ? zzclbVar3.zzO() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                zzclb zzclbVar4 = adOverlayInfoParcel.zzd;
                boolean z5 = false;
                zzclb zzclbVarZza = zzclr.zza(activity, zzcnlVarZzN, strZzO, true, z3, null, null, versionInfoParcel, null, null, zzclbVar4 != null ? zzclbVar4.zzk() : null, zzbhw.zza(), null, null, null, null, null);
                this.zzd = zzclbVarZza;
                zzcmz zzcmzVarZzP2 = zzclbVarZza.zzP();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbon zzbonVar = adOverlayInfoParcel2.zzp;
                zzbop zzbopVar = adOverlayInfoParcel2.zze;
                zzad zzadVar = adOverlayInfoParcel2.zzi;
                zzclb zzclbVar5 = adOverlayInfoParcel2.zzd;
                zzcmzVarZzP2.zzab(null, zzbonVar, null, zzbopVar, zzadVar, true, null, zzclbVar5 != null ? zzclbVar5.zzP().zzh() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.ads.internal.overlay.zzg
                    @Override // com.google.android.gms.internal.ads.zzcmx
                    public final /* synthetic */ void zza(boolean z6, int i3, String str, String str2) {
                        zzclb zzclbVar6 = this.zza.zzd;
                        if (zzclbVar6 != null) {
                            zzclbVar6.zzI();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new zzh("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                }
                zzclb zzclbVar6 = this.zzc.zzd;
                r2 = z5;
                if (zzclbVar6 != null) {
                    zzclbVar6.zzan(this);
                    r2 = z5;
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error obtaining webview.", e);
                throw new zzh("Could not obtain webview for the overlay.", e);
            }
        } else {
            r2 = 0;
            zzclb zzclbVar7 = this.zzc.zzd;
            this.zzd = zzclbVar7;
            zzclbVar7.zzai(this.zzb);
        }
        if (this.zzc.zzw) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzD(), r2);
            if (((Boolean) zzba.zzc().zzd(zzbix.zzbG)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                this.zzd.zzD().setTextClassifier(TextClassifier.NO_OP);
            }
            if (((Boolean) zzba.zzc().zzd(zzbix.zzbH)).booleanValue()) {
                this.zzd.zzD().setDownloadListener(zze.zza);
            }
        }
        this.zzd.zzae(this);
        zzclb zzclbVar8 = this.zzc.zzd;
        if (zzclbVar8 != null) {
            zzK(zzclbVar8.zzU(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zzd.zzE());
            }
            if (this.zzk) {
                this.zzd.zzat();
                if (((Boolean) zzba.zzc().zzd(zzbix.zzbz)).booleanValue() && Build.VERSION.SDK_INT >= 31) {
                    window.setBackgroundBlurRadius(this.zzn);
                }
            }
            if (this.zzc.zzw) {
                Toolbar toolbar = new Toolbar(this.zzb);
                this.zzy = toolbar;
                toolbar.setId(View.generateViewId());
                this.zzd.zzE().setId(View.generateViewId());
                this.zzy.setBackgroundColor(-12303292);
                this.zzy.setVisibility(r2);
                try {
                    this.zzy.setNavigationIcon(com.google.android.gms.ads.internal.zzt.zzh().zzg().getDrawable(R.drawable.admob_close_button_white_cross, null));
                } catch (Resources.NotFoundException | NullPointerException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e2);
                }
                this.zzy.setNavigationOnClickListener(this.zzr);
                this.zzy.setTitleMarginStart(r2);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.zzl.addView(this.zzy, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.zzy.getId());
                layoutParams2.addRule(12);
                this.zzl.addView(this.zzd.zzE(), layoutParams2);
                zzJ(this.zzy);
            } else {
                this.zzl.addView(this.zzd.zzE(), -1, -1);
            }
        }
        if (!z && !this.zzm) {
            zzD();
        }
        if (this.zzc.zzk != 5) {
            zzr(z3);
            if (this.zzd.zzR()) {
                zzt(z3, true);
                return;
            }
            return;
        }
        Activity activity2 = this.zzb;
        zzela zzelaVarZze = zzelb.zze();
        zzelaVarZze.zza(activity2);
        zzelaVarZze.zzb(this);
        zzelaVarZze.zzc(this.zzc.zzq);
        zzelaVarZze.zzd(this.zzc.zzr);
        try {
            zzG(zzelaVarZze.zze());
        } catch (RemoteException | zzh e3) {
            throw new zzh(e3.getMessage(), e3);
        }
    }

    public final void zzz(String str) {
        Toolbar toolbar = this.zzy;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    public final void zzu(boolean z, int i) {
        zzi zziVar = this.zzl;
        if (!z) {
            zziVar.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        zziVar.setBackgroundColor(0);
        this.zzn = i;
        Window window = this.zzb.getWindow();
        if (!((Boolean) zzba.zzc().zzd(zzbix.zzbz)).booleanValue() || Build.VERSION.SDK_INT < 31 || window == null) {
            return;
        }
        window.setBackgroundBlurRadius(i);
    }
}
