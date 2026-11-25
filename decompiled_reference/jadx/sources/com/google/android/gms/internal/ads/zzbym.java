package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbym extends zzbyn implements zzbpx {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzclb zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbie zzk;
    private float zzl;
    private int zzm;

    public zzbym(zzclb zzclbVar, Context context, zzbie zzbieVar) {
        super(zzclbVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzclbVar;
        this.zzi = context;
        this.zzk = zzbieVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zza();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zza();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics2, displayMetrics2.heightPixels);
        zzclb zzclbVar = this.zzh;
        Activity activityZzj = zzclbVar.zzj();
        if (activityZzj == null || activityZzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            int[] iArrZzV = com.google.android.gms.ads.internal.util.zzs.zzV(activityZzj);
            com.google.android.gms.ads.internal.client.zzay.zza();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzC(this.zza, iArrZzV[0]);
            com.google.android.gms.ads.internal.client.zzay.zza();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzC(this.zza, iArrZzV[1]);
        }
        if (zzclbVar.zzN().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzclbVar.measure(0, 0);
        }
        zzl(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbyl zzbylVar = new zzbyl();
        zzbie zzbieVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbylVar.zzb(zzbieVar.zzc(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbylVar.zza(zzbieVar.zzc(intent2));
        zzbylVar.zzc(zzbieVar.zzb());
        zzbylVar.zzd(zzbieVar.zza());
        zzbylVar.zze(true);
        boolean zZzf = zzbylVar.zzf();
        boolean zZzg = zzbylVar.zzg();
        boolean zZzh = zzbylVar.zzh();
        boolean zZzi = zzbylVar.zzi();
        try {
            jSONObjectPut = new JSONObject().put("sms", zZzf).put("tel", zZzg).put("calendar", zZzh).put("storePicture", zZzi).put("inlineVideo", zzbylVar.zzj());
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        zzclbVar.zzd("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        zzclbVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        zzb(com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Dispatching Ready Event.");
        }
        zzh(zzclbVar.zzs().afmaVersion);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[PHI: r4
      0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzb(int i, int i2) {
        int i3;
        Context context = this.zzi;
        int i4 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzc();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzW((Activity) context)[0];
        } else {
            i3 = 0;
        }
        zzclb zzclbVar = this.zzh;
        if (zzclbVar.zzN() == null || !zzclbVar.zzN().zzg()) {
            int width = zzclbVar.getWidth();
            int height = zzclbVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaJ)).booleanValue()) {
                if (width == 0) {
                    width = zzclbVar.zzN() != null ? zzclbVar.zzN().zzb : 0;
                }
                if (height != 0) {
                    i4 = height;
                } else if (zzclbVar.zzN() != null) {
                    i4 = zzclbVar.zzN().zza;
                }
            } else {
                i4 = height;
            }
            this.zzf = com.google.android.gms.ads.internal.client.zzay.zza().zza(context, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzay.zza().zza(context, i4);
        }
        zzj(i, i2 - i3, this.zzf, this.zzg);
        zzclbVar.zzP().zzP(i, i2);
    }
}
