package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcim extends zzcha implements TextureView.SurfaceTextureListener, zzchk {
    private final zzchu zzc;
    private final zzchv zzd;
    private final zzcht zze;
    private final zzdzt zzf;
    private zzcgz zzg;
    private Surface zzh;
    private zzchl zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzchs zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcim(Context context, zzchv zzchvVar, zzchu zzchuVar, boolean z, boolean z2, zzcht zzchtVar, zzdzt zzdztVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzchuVar;
        this.zzd = zzchvVar;
        this.zzo = z;
        this.zze = zzchtVar;
        zzchvVar.zza(this);
        this.zzf = zzdztVar;
    }

    private final boolean zzT() {
        zzchl zzchlVar = this.zzi;
        return (zzchlVar == null || !zzchlVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z, Integer num) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null && !z) {
            zzchlVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z) {
            if (!zzT()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzchlVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzcjh zzcjhVarZzr = this.zzc.zzr(this.zzj);
            if (zzcjhVarZzr instanceof zzcjq) {
                zzchl zzchlVarZza = ((zzcjq) zzcjhVarZzr).zza();
                this.zzi = zzchlVarZza;
                zzchlVarZza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcjhVarZzr instanceof zzcjn)) {
                    String str = this.zzj;
                    String.valueOf(str);
                    String strValueOf = String.valueOf(str);
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzcjn zzcjnVar = (zzcjn) zzcjhVarZzr;
                String strZzF = zzF();
                ByteBuffer byteBufferZzu = zzcjnVar.zzu();
                boolean zZzt = zzcjnVar.zzt();
                String strZzs = zzcjnVar.zzs();
                if (strZzs == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    zzchl zzchlVarZzE = zzE(num);
                    this.zzi = zzchlVarZzE;
                    zzchlVarZzE.zzr(new Uri[]{Uri.parse(strZzs)}, strZzF, byteBufferZzu, zZzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i5 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i5 >= strArr.length) {
                    break;
                }
                uriArr[i5] = Uri.parse(strArr[i5]);
                i5++;
            }
            this.zzi.zzq(uriArr, strZzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int iZzC = this.zzi.zzC();
            this.zzm = iZzC;
            if (iZzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzchl zzchlVar = this.zzi;
            if (zzchlVar != null) {
                zzchlVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzchlVar.zzu(surface, z);
        } catch (IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzt != f) {
            this.zzt = f;
            requestLayout();
        }
    }

    private final void zzac() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzM(true);
        }
    }

    private final void zzad() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzt;
        if (f != 0.0f && this.zzn == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzchs zzchsVar = this.zzn;
        if (zzchsVar != null) {
            zzchsVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzdzt zzdztVar;
        if (this.zzo) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoW)).booleanValue() && (zzdztVar = this.zzf) != null) {
                zzdzs zzdzsVarZza = zzdztVar.zza();
                zzdzsVarZza.zzc("action", "svp_aepv");
                zzdzsVarZza.zzd();
            }
            zzchs zzchsVar = new zzchs(getContext());
            this.zzn = zzchsVar;
            zzchsVar.zzb(surfaceTexture, i, i2);
            zzchs zzchsVar2 = this.zzn;
            zzchsVar2.start();
            SurfaceTexture surfaceTextureZze = zzchsVar2.zze();
            if (surfaceTextureZze != null) {
                surfaceTexture = surfaceTextureZze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcig
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzchs zzchsVar = this.zzn;
        if (zzchsVar != null) {
            zzchsVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcii
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzchs zzchsVar = this.zzn;
        if (zzchsVar != null) {
            zzchsVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcih
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzN(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcij
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzP(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzA(int i) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzB(int i) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzz(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzC(int i) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcib
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        });
    }

    final zzchl zzE(Integer num) {
        zzcht zzchtVar = this.zze;
        zzchu zzchuVar = this.zzc;
        zzckj zzckjVar = new zzckj(zzchuVar.getContext(), zzchtVar, zzchuVar, num);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzckjVar;
    }

    final String zzF() {
        zzchu zzchuVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzchuVar.getContext(), zzchuVar.zzs().afmaVersion);
    }

    final /* synthetic */ void zzG() {
        float fZzc = this.zzb.zzc();
        zzchl zzchlVar = this.zzi;
        if (zzchlVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzchlVar.zzv(fZzc, false);
        } catch (IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    final /* synthetic */ void zzH() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzb();
        }
    }

    final /* synthetic */ void zzI() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zze();
        }
    }

    final /* synthetic */ void zzJ(String str) {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzK() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzc();
        }
    }

    final /* synthetic */ void zzL() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzd();
        }
    }

    final /* synthetic */ void zzM() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zza();
        }
    }

    final /* synthetic */ void zzN(int i, int i2) {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzj(i, i2);
        }
    }

    final /* synthetic */ void zzO() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzh();
        }
    }

    final /* synthetic */ void zzP(int i) {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void zzQ(boolean z, long j) {
        this.zzc.zzu(z, j);
    }

    final /* synthetic */ void zzR(String str) {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzS() {
        zzcgz zzcgzVar = this.zzg;
        if (zzcgzVar != null) {
            zzcgzVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzb(zzcgz zzcgzVar) {
        this.zzg = zzcgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzc(String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzchv zzchvVar = this.zzd;
        zzchvVar.zzf();
        this.zzb.zze();
        zzchvVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcie
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcif
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzi(int i) {
        if (zzU()) {
            this.zzi.zzx(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzj(float f, float f2) {
        zzchs zzchsVar = this.zzn;
        if (zzchsVar != null) {
            zzchsVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzm() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            return zzchlVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzn() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            return zzchlVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzo() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            return zzchlVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzp() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            return zzchlVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcha, com.google.android.gms.internal.ads.zzchx
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcil
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzr(final boolean z, final long j) {
        if (this.zzc != null) {
            zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcik
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzQ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzs(int i) {
        if (this.zzm != i) {
            this.zzm = i;
            if (i == 3) {
                zzY();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcic
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzt(int i, int i2) {
        this.zzr = i;
        this.zzs = i2;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzu(String str, Exception exc) {
        final String strZzZ = zzZ(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strZzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcid
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(strZzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzi(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzv(String str, Exception exc) {
        final String strZzZ = zzZ("onLoadException", exc);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strZzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        com.google.android.gms.ads.internal.zzt.zzh().zzi(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcia
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR(strZzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final Integer zzw() {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            return zzchlVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzy(int i) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzF(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzz(int i) {
        zzchl zzchlVar = this.zzi;
        if (zzchlVar != null) {
            zzchlVar.zzG(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzx(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z = this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4;
        this.zzj = str;
        zzV(z, num);
    }
}
