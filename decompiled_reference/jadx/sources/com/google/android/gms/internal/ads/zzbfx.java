package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbfx extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbfo zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbfx() {
        zzbfo zzbfoVar = new zzbfo();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbfoVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbko.zzd.zze()).intValue();
        this.zzg = ((Long) zzbko.zza.zze()).intValue();
        this.zzh = ((Long) zzbko.zze.zze()).intValue();
        this.zzi = ((Long) zzbko.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaL)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaM)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaN)).intValue();
        this.zze = ((Long) zzbko.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaP);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaQ)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaR)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaS)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00f8 */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e6 A[EXC_TOP_SPLITTER, LOOP:1: B:63:0x00e6->B:70:0x00e6, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfx.run():void");
    }

    public final void zza() {
        synchronized (this.zzc) {
            if (this.zza) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Content hash thread already started, quitting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    final void zzb(View view) {
        try {
            zzbfn zzbfnVar = new zzbfn(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZze = com.google.android.gms.ads.internal.zzt.zzg().zze();
            if (contextZze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(contextZze.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaO), "id", contextZze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbfw zzbfwVarZzc = zzc(view, zzbfnVar);
            zzbfnVar.zzi();
            if (zzbfwVarZzc.zza == 0 && zzbfwVarZzc.zzb == 0) {
                return;
            }
            int i = zzbfwVarZzc.zzb;
            if (i == 0 && zzbfnVar.zzl() == 0) {
                return;
            }
            if (i == 0 && this.zzd.zza(zzbfnVar)) {
                return;
            }
            this.zzd.zzc(zzbfnVar);
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ContentFetchTask.fetchContent");
        }
    }

    final zzbfw zzc(View view, zzbfn zzbfnVar) {
        if (view == null) {
            return new zzbfw(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbfw(this, 0, 0);
            }
            zzbfnVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbfw(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzclb)) {
            WebView webView = (WebView) view;
            zzbfnVar.zze();
            webView.post(new zzbfv(this, zzbfnVar, webView, globalVisibleRect));
            return new zzbfw(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbfw(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            zzbfw zzbfwVarZzc = zzc(viewGroup.getChildAt(i3), zzbfnVar);
            i += zzbfwVarZzc.zza;
            i2 += zzbfwVarZzc.zzb;
        }
        return new zzbfw(this, i, i2);
    }

    final void zzd(zzbfn zzbfnVar, WebView webView, String str, boolean z) {
        zzbfn zzbfnVar2;
        zzbfnVar.zzd();
        try {
            if (TextUtils.isEmpty(str)) {
                zzbfnVar2 = zzbfnVar;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzbfnVar2 = zzbfnVar;
                    zzbfnVar2.zzf(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    zzbfnVar.zzf(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzbfnVar2 = zzbfnVar;
                }
            }
            if (zzbfnVar2.zza()) {
                this.zzd.zzb(zzbfnVar2);
            }
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Json string may be malformed.");
        } catch (Throwable th) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            String string = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }
}
