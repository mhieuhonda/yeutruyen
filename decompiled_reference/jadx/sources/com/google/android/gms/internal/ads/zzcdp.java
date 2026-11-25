package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzcdp implements zzcdu {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zziit zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzcdr zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcdp(Context context, VersionInfoParcel versionInfoParcel, zzcdr zzcdrVar, String str, zzcdq zzcdqVar) {
        Preconditions.checkNotNull(zzcdrVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzcdrVar;
        Iterator it = zzcdrVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zziit zziitVarZzg = zziks.zzg();
        zziitVarZzg.zzn(9);
        if (str != null) {
            zziitVarZzg.zzb(str);
            zziitVarZzg.zzc(str);
        }
        zziiu zziiuVarZzc = zziiv.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zziiuVarZzc.zza(str2);
        }
        zziitVarZzg.zzd((zziiv) zziiuVarZzc.zzbu());
        zzike zzikeVarZzc = zzikf.zzc();
        zzikeVarZzc.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzikeVarZzc.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzikeVarZzc.zzb(apkVersion);
        }
        zziitVarZzg.zzk((zzikf) zzikeVarZzc.zzbu());
        this.zzd = zziitVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final zzcdr zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzb(String str) {
        synchronized (this.zzj) {
            zziit zziitVar = this.zzd;
            try {
                if (str == null) {
                    zziitVar.zzi();
                } else {
                    zziitVar.zzh(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final boolean zzc() {
        return this.zzi.zzc && !this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzd(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzcdt.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(bitmap);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                zzcfy.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zze(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((zzikc) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzikc zzikcVarZze = zzikd.zze();
            int iZza = zzikb.zza(i);
            if (iZza != 0) {
                zzikcVarZze.zze(iZza);
            }
            zzikcVarZze.zza(linkedHashMap.size());
            zzikcVarZze.zzb(str);
            zzijg zzijgVarZzc = zzijj.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzije zzijeVarZzc = zzijf.zzc();
                        zzijeVarZzc.zza(zzidl.zzx(str2));
                        zzijeVarZzc.zzb(zzidl.zzx(str3));
                        zzijgVarZzc.zza((zzijf) zzijeVarZzc.zzbu());
                    }
                }
            }
            zzikcVarZze.zzc((zzijj) zzijgVarZzc.zzbu());
            linkedHashMap.put(str, zzikcVarZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture listenableFutureZza = zzhcf.zza(Collections.emptyMap());
            zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzcdl
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzh((Map) obj);
                }
            };
            zzhcp zzhcpVar = zzcfy.zzh;
            ListenableFuture listenableFutureZzj = zzhcf.zzj(listenableFutureZza, zzhbnVar, zzhcpVar);
            ListenableFuture listenableFutureZzi = zzhcf.zzi(listenableFutureZzj, 10L, TimeUnit.SECONDS, zzcfy.zzd);
            zzhcf.zzr(listenableFutureZzj, new zzcdk(this, listenableFutureZzi), zzhcpVar);
            zzc.add(listenableFutureZzi);
        }
    }

    final /* synthetic */ void zzg(Bitmap bitmap) {
        zzidk zzidkVarZzC = zzidl.zzC();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzidkVarZzC);
        synchronized (this.zzj) {
            zziit zziitVar = this.zzd;
            zzijw zzijwVarZzc = zzijy.zzc();
            zzijwVarZzc.zzb(zzidkVarZzC.zza());
            zzijwVarZzc.zza("image/png");
            zzijwVarZzc.zzc(2);
            zziitVar.zzj((zzijy) zzijwVarZzc.zzbu());
        }
    }

    final /* synthetic */ ListenableFuture zzh(Map map) {
        int length;
        zzikc zzikcVar;
        ListenableFuture listenableFutureZzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            length = jSONArrayOptJSONArray.length();
                            synchronized (obj) {
                                zzikcVar = (zzikc) this.zze.get(str);
                            }
                        }
                        if (zzikcVar == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            zzcdt.zza(sb.toString());
                        } else {
                            for (int i = 0; i < length; i++) {
                                zzikcVar.zzd(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzblf.zza.zze()).booleanValue()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e);
                }
                return zzhcf.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzhcf.zza(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzf((zzikd) ((zzikc) it.next()).zzbu());
            }
            zziit zziitVar = this.zzd;
            zziitVar.zzl(this.zzf);
            zziitVar.zzm(this.zzg);
            if (zzcdt.zzb()) {
                String strZza = zziitVar.zza();
                String strZzg = zziitVar.zzg();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + 38 + String.valueOf(strZzg).length() + 15);
                sb2.append("Sending SB report\n  url: ");
                sb2.append(strZza);
                sb2.append("\n  clickUrl: ");
                sb2.append(strZzg);
                sb2.append("\n  resources: \n");
                StringBuilder sb3 = new StringBuilder(sb2.toString());
                for (zzikd zzikdVar : zziitVar.zze()) {
                    sb3.append("    [");
                    sb3.append(zzikdVar.zzd());
                    sb3.append("] ");
                    sb3.append(zzikdVar.zzc());
                }
                zzcdt.zza(sb3.toString());
            }
            ListenableFuture listenableFutureZzb = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((zziks) zziitVar.zzbu()).zzaN());
            if (zzcdt.zzb()) {
                listenableFutureZzb.addListener(zzcdn.zza, zzcfy.zza);
            }
            listenableFutureZzk = zzhcf.zzk(listenableFutureZzb, zzcdm.zza, zzcfy.zzh);
        }
        return listenableFutureZzk;
    }
}
