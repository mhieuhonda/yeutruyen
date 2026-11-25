package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.tekartik.sqflite.Constant;
import java.util.HashMap;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzchi extends FrameLayout implements zzcgz {
    final zzchw zza;
    private final zzchu zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbjm zze;
    private final long zzf;
    private final zzcha zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzchi(Context context, zzchu zzchuVar, int i, boolean z, zzbjm zzbjmVar, zzcht zzchtVar, zzdzt zzdztVar) {
        zzcha zzcgyVar;
        zzbjm zzbjmVar2;
        zzcha zzckqVar;
        super(context);
        this.zzb = zzchuVar;
        this.zze = zzbjmVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzt)).booleanValue()) {
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzchuVar.zzk());
        zzchb zzchbVar = zzchuVar.zzk().zza;
        zzchv zzchvVar = new zzchv(context, zzchuVar.zzs(), zzchuVar.zzm(), zzbjmVar, zzchuVar.zzi());
        if (i == 3) {
            zzckqVar = new zzckq(context, zzchvVar);
            zzbjmVar2 = zzbjmVar;
        } else {
            if (i == 2) {
                zzcgyVar = new zzcim(context, zzchvVar, zzchuVar, z, zzchm.zza(zzchuVar), zzchtVar, zzdztVar);
                zzbjmVar2 = zzbjmVar;
            } else {
                zzbjmVar2 = zzbjmVar;
                zzcgyVar = new zzcgy(context, zzchuVar, z, zzchm.zza(zzchuVar), zzchtVar, new zzchv(context, zzchuVar.zzs(), zzchuVar.zzm(), zzbjmVar, zzchuVar.zzi()), zzdztVar);
            }
            zzckqVar = zzcgyVar;
        }
        this.zzg = zzckqVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzckqVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzay)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzav)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaA)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzax)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbjmVar2 != null) {
            zzbjmVar2.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new zzchw(this);
        zzckqVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", map);
    }

    private final void zzL() {
        zzchu zzchuVar = this.zzb;
        if (zzchuVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzchuVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcha zzchaVar = this.zzg;
            if (zzchaVar != null) {
                zzhcp zzhcpVar = zzcfy.zzf;
                Objects.requireNonNull(zzchaVar);
                zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzchaVar.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        zzchw zzchwVar = this.zza;
        if (z) {
            zzchwVar.zzb();
        } else {
            zzchwVar.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgz
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        zzchw zzchwVar = this.zza;
        if (i == 0) {
            zzchwVar.zzb();
            z = true;
        } else {
            zzchwVar.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzche(this, z));
    }

    public final void zzA(int i) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzB(i);
    }

    public final void zzB(int i) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzC(i);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        TextView textView = new TextView(zzchaVar.getContext());
        Resources resourcesZzg = com.google.android.gms.ads.internal.zzt.zzh().zzg();
        String string = resourcesZzg == null ? "AdMob - " : resourcesZzg.getString(R.string.watermark_label_prefix);
        String strZza = zzchaVar.zza();
        String.valueOf(string);
        textView.setText(String.valueOf(string).concat(strZza));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzcha zzchaVar = this.zzg;
        if (zzchaVar != null) {
            zzchaVar.zzd();
        }
        zzL();
    }

    final void zzF() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        long jZzh = zzchaVar.zzh();
        if (this.zzl == jZzh || jZzh <= 0) {
            return;
        }
        float f = jZzh / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcG)).booleanValue()) {
            zzI("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(zzchaVar.zzo()), "qoeCachedBytes", String.valueOf(zzchaVar.zzn()), "qoeLoadedBytes", String.valueOf(zzchaVar.zzm()), "droppedFrames", String.valueOf(zzchaVar.zzp()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = jZzh;
    }

    final /* synthetic */ void zzG(boolean z) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchc(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzb() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar != null && this.zzm == 0) {
            zzI("canplaythrough", TypedValues.TransitionType.S_DURATION, String.valueOf(zzchaVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzchaVar.zzk()), "videoHeight", String.valueOf(zzchaVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcI)).booleanValue()) {
            this.zza.zzb();
        }
        zzchu zzchuVar = this.zzb;
        if (zzchuVar.zzj() != null && !this.zzi) {
            boolean z = (zzchuVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                zzchuVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcI)).booleanValue()) {
            this.zza.zza();
        }
        zzI("ended", new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzf(String str, String str2) {
        zzI(Constant.PARAM_ERROR, "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzg(String str, String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzchaVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (jElapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbjm zzbjmVar = this.zze;
            if (zzbjmVar != null) {
                zzbjmVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            zzbio zzbioVar = zzbix.zzaz;
            int iMax = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
    }

    public final Integer zzl() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar != null) {
            return zzchaVar.zzw();
        }
        return null;
    }

    public final void zzm(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzay)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzn(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i2).length() + 3 + String.valueOf(i3).length() + 3 + String.valueOf(i4).length());
            sb.append("Set video bounds to x:");
            sb.append(i);
            sb.append(";y:");
            sb.append(i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f, float f2) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar != null) {
            zzchaVar.zzj(f, f2);
        }
    }

    public final void zzq(Integer num) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzchaVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzf();
    }

    public final void zzs() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zze();
    }

    public final void zzt(int i) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzi(i);
    }

    public final void zzu() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzb.zza(true);
        zzchaVar.zzq();
    }

    public final void zzv() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzb.zza(false);
        zzchaVar.zzq();
    }

    public final void zzw(float f) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzb.zzb(f);
        zzchaVar.zzq();
    }

    public final void zzx(int i) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzy(i);
    }

    public final void zzy(int i) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzz(i);
    }

    public final void zzz(int i) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzA(i);
    }
}
