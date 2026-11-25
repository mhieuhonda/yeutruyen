package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpw extends zzcya {
    public static final zzgwt zzc = zzgwt.zzn("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdqb zze;
    private final zzdqj zzf;
    private final zzdra zzg;
    private final zzdqg zzh;
    private final zzdql zzi;
    private final zzimt zzj;
    private final zzimt zzk;
    private final zzimt zzl;
    private final zzimt zzm;
    private final zzimt zzn;
    private zzdry zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzced zzt;
    private final zzbaw zzu;
    private final VersionInfoParcel zzv;
    private final Context zzw;
    private final zzdpy zzx;
    private final zzetn zzy;
    private final Map zzz;

    public zzdpw(zzcxz zzcxzVar, Executor executor, zzdqb zzdqbVar, zzdqj zzdqjVar, zzdra zzdraVar, zzdqg zzdqgVar, zzdql zzdqlVar, zzimt zzimtVar, zzimt zzimtVar2, zzimt zzimtVar3, zzimt zzimtVar4, zzimt zzimtVar5, zzced zzcedVar, zzbaw zzbawVar, VersionInfoParcel versionInfoParcel, Context context, zzdpy zzdpyVar, zzetn zzetnVar, zzbfa zzbfaVar) {
        super(zzcxzVar);
        this.zzd = executor;
        this.zze = zzdqbVar;
        this.zzf = zzdqjVar;
        this.zzg = zzdraVar;
        this.zzh = zzdqgVar;
        this.zzi = zzdqlVar;
        this.zzj = zzimtVar;
        this.zzk = zzimtVar2;
        this.zzl = zzimtVar3;
        this.zzm = zzimtVar4;
        this.zzn = zzimtVar5;
        this.zzt = zzcedVar;
        this.zzu = zzbawVar;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdpyVar;
        this.zzy = zzetnVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmk)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long jZzy = com.google.android.gms.ads.internal.util.zzs.zzy(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jZzy >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzml)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdry zzdryVar) {
        Iterator<String> itKeys;
        View view;
        zzbar zzbarVarZzb;
        if (!this.zzp) {
            this.zzo = zzdryVar;
            this.zzg.zza(zzdryVar);
            this.zzf.zza(zzdryVar.zzdF(), zzdryVar.zzj(), zzdryVar.zzk(), zzdryVar, zzdryVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdE)).booleanValue() && (zzbarVarZzb = this.zzu.zzb()) != null) {
                zzbarVarZzb.zzh(zzdryVar.zzdF());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcA)).booleanValue()) {
                zzfkn zzfknVar = this.zzb;
                if (zzfknVar.zzak && (itKeys = zzfknVar.zzaj.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        zzdry zzdryVar2 = this.zzo;
                        WeakReference weakReference = zzdryVar2 == null ? null : (WeakReference) zzdryVar2.zzi().get(next);
                        this.zzz.put(next, false);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzbez zzbezVar = new zzbez(this.zzw, view);
                            this.zzA.add(zzbezVar);
                            zzbezVar.zza(new zzdpl(this, next));
                        }
                    }
                }
            }
            if (zzdryVar.zzg() != null) {
                zzdryVar.zzg().zza(this.zzt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdry zzdryVar) {
        this.zzf.zzb(zzdryVar.zzdF(), zzdryVar.zzi());
        if (zzdryVar.zzdA() != null) {
            zzdryVar.zzdA().setClickable(false);
            zzdryVar.zzdA().removeAllViews();
        }
        if (zzdryVar.zzg() != null) {
            zzdryVar.zzg().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View viewZzag;
        if (!this.zzr && (viewZzag = zzag(map)) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpo)).booleanValue()) {
                Rect rect = new Rect();
                if (viewZzag.getGlobalVisibleRect(rect, new Point()) && viewZzag.getHeight() == rect.height() && viewZzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpp)).booleanValue()) {
                zzbio zzbioVar = zzbix.zzpq;
                if (((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).floatValue() > 0.0d) {
                    double dFloatValue = ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).floatValue();
                    Rect rect2 = new Rect();
                    if (viewZzag.getGlobalVisibleRect(rect2, new Point())) {
                        if (rect2.height() * rect2.width() >= ((double) (viewZzag.getHeight() * viewZzag.getWidth())) * (dFloatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(viewZzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzgwt zzgwtVar = zzc;
            int size = zzgwtVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgwtVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzah() {
        zzdry zzdryVar = this.zzo;
        if (zzdryVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper iObjectWrapperZzn = zzdryVar.zzn();
        if (iObjectWrapperZzn != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzn);
        }
        return zzdra.zza;
    }

    private final void zzai(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgx)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        ListenableFuture listenableFutureZzX = this.zze.zzX();
        if (listenableFutureZzX == null) {
            return;
        }
        zzhcf.zzr(listenableFutureZzX, new zzdpm(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, zzelv zzelvVar) {
        zzclb zzclbVarZzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzelvVar == null || zzclbVarZzW == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzelvVar.zza(), view);
    }

    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzf.zzr(zzdgVar);
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.zzf.zzs(zzdcVar);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdry zzdryVar = this.zzo;
        if (zzdryVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdryVar instanceof zzdqu;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzW(z);
                }
            });
        }
    }

    public final synchronized void zzE(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznj)).booleanValue()) {
            zzdry zzdryVar = this.zzo;
            if (zzdryVar == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdryVar instanceof zzdqu;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdps
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzX(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    public final zzelv zzL(String str, boolean z) {
        boolean z2;
        String str2;
        zzelr zzelrVar;
        zzels zzelsVar;
        String str3;
        zzdqg zzdqgVar = this.zzh;
        if (zzdqgVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdqb zzdqbVar = this.zze;
            zzclb zzclbVarZzW = zzdqbVar.zzW();
            zzclb zzclbVarZzT = zzdqbVar.zzT();
            if (zzclbVarZzW == null && zzclbVarZzT == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdqgVar.zzg();
            int iZzc = zzdqgVar.zzg().zzc();
            int i2 = iZzc - 1;
            boolean z3 = false;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (iZzc != 1) {
                        str3 = iZzc != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    StringBuilder sb = new StringBuilder(str3.length() + 49);
                    sb.append("Unknown omid media type: ");
                    sb.append(str3);
                    sb.append(". Not initializing Omid.");
                    String string = sb.toString();
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                    return null;
                }
                if (zzclbVarZzW == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = false;
                z3 = true;
            } else if (zzclbVarZzT != null) {
                z2 = true;
            } else {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else if (z2) {
                str2 = "javascript";
                zzclbVarZzW = zzclbVarZzT;
            } else {
                zzclbVarZzW = null;
                str2 = null;
            }
            if (zzclbVarZzW == null) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzw)) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzv;
            int i8 = versionInfoParcel.buddyApkVersion;
            int i9 = versionInfoParcel.clientJarVersion;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 1 + String.valueOf(i9).length());
            sb2.append(i8);
            sb2.append(".");
            sb2.append(i9);
            String string2 = sb2.toString();
            if (z2) {
                zzelrVar = zzelr.VIDEO;
                zzelsVar = zzels.DEFINED_BY_JAVASCRIPT;
            } else {
                zzelrVar = zzelr.NATIVE_DISPLAY;
                zzelsVar = zzdqbVar.zzx() == 3 ? zzels.UNSPECIFIED : zzels.ONE_PIXEL;
            }
            zzelv zzelvVarZzd = com.google.android.gms.ads.internal.zzt.zzu().zzd(string2, zzclbVarZzW.zzD(), "", "javascript", str2, str, zzelsVar, zzelrVar, this.zzb.zzal);
            if (zzelvVarZzd == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdqbVar.zzq(zzelvVarZzd);
            zzclbVarZzW.zzak(zzelvVarZzd);
            if (z2) {
                zzfuu zzfuuVarZza = zzelvVarZzd.zza();
                if (zzclbVarZzT != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfuuVarZza, zzclbVarZzT.zzE());
                }
                this.zzs = true;
            }
            if (z) {
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzelvVarZzd.zza());
                zzclbVarZzW.zze("onSdkLoaded", new ArrayMap());
            }
            return zzelvVarZzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgx)).booleanValue()) {
            zzdqb zzdqbVar = this.zze;
            if (zzdqbVar.zzx() != 3) {
                zzcgd zzcgdVarZzY = zzdqbVar.zzY();
                if (zzcgdVarZzY == null) {
                    return;
                }
                zzhcf.zzr(zzcgdVarZzY, new zzdpn(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzelv zzelvVarZzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzelvVarZzZ == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzelvVarZzZ.zza(), view);
    }

    public final zzdpy zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzy.zza(zzdqVar);
    }

    public final void zzR(Bundle bundle) {
        final zzclb zzclbVarZzT = this.zze.zzT();
        if (zzclbVarZzT == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgwt zzgwtVar = zzdpw.zzc;
                    zzclbVarZzT.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error reading event signals", e);
        }
    }

    final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    final /* synthetic */ void zzW(boolean z) {
        zzdry zzdryVar = this.zzo;
        if (zzdryVar != null) {
            this.zzf.zzf(null, zzdryVar.zzdF(), this.zzo.zzi(), this.zzo.zzj(), z, zzah(), 0);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    final /* synthetic */ void zzX(View view, boolean z, int i) {
        zzdry zzdryVar = this.zzo;
        if (zzdryVar != null) {
            this.zzf.zzf(view, zzdryVar.zzdF(), this.zzo.zzi(), this.zzo.zzj(), z, zzah(), i);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    final /* synthetic */ zzdqb zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    final /* synthetic */ zzdry zzaa() {
        return this.zzo;
    }

    final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzz = this.zzf.zzz(bundle);
        this.zzq = zZzz;
        return zZzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final zzdry zzdryVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcy)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzU(zzdryVar);
                }
            });
        } else {
            zzU(zzdryVar);
        }
    }

    public final synchronized void zzh(final zzdry zzdryVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcy)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzV(zzdryVar);
                }
            });
        } else {
            zzV(zzdryVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z) {
        zzclb zzclbVarZzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z, zzah());
        if (this.zzs) {
            zzdqb zzdqbVar = this.zze;
            if (zzdqbVar.zzT() != null && (zzclbVarZzT = zzdqbVar.zzT()) != null) {
                zzclbVarZzT.zze("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzj() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final zzdqj zzdqjVar = this.zzf;
            Objects.requireNonNull(zzdqjVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdqjVar.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[Catch: all -> 0x0092, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x001c, B:12:0x0022, B:13:0x002c, B:15:0x0032, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a), top: B:40:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[Catch: all -> 0x0092, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x001c, B:12:0x0022, B:13:0x002c, B:15:0x0032, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a), top: B:40:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a A[Catch: all -> 0x0092, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x001c, B:12:0x0022, B:13:0x002c, B:15:0x0032, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a), top: B:40:0x0001 }] */
    public final synchronized void zzu(View view, Map map, Map map2, boolean z) {
        Iterator it;
        View view2;
        if (this.zzq) {
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcA)).booleanValue() && this.zzb.zzak) {
            Map map3 = this.zzz;
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                if (!((Boolean) map3.get((String) it2.next())).booleanValue()) {
                }
            }
            if (!z) {
                zzae(view, map, map2);
                zzaf(view, map, map2);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeU)).booleanValue()) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null) {
                    }
                }
            }
        } else {
            if (!z) {
                zzae(view, map, map2);
                zzaf(view, map, map2);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeU)).booleanValue() && map != null) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null && zzI(view2)) {
                        zzae(view, map, map2);
                        return;
                    }
                }
            }
        }
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzbnz zzbnzVar) {
        this.zzf.zzp(zzbnzVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }

    final /* synthetic */ void zzS() {
        try {
            zzdqb zzdqbVar = this.zze;
            int iZzx = zzdqbVar.zzx();
            if (iZzx == 1) {
                zzbnj zzbnjVarZza = this.zzi.zza();
                if (zzbnjVarZza != null) {
                    zzai("Google", true);
                    zzbnjVarZza.zze((zzbmz) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 2) {
                zzbng zzbngVarZzb = this.zzi.zzb();
                if (zzbngVarZzb != null) {
                    zzai("Google", true);
                    zzbngVarZzb.zze((zzbmx) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 3) {
                zzbnp zzbnpVarZzf = this.zzi.zzf(zzdqbVar.zzS());
                if (zzbnpVarZzf != null) {
                    if (zzdqbVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzbnpVarZzf.zze((zzbnc) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 6) {
                zzbnw zzbnwVarZzc = this.zzi.zzc();
                if (zzbnwVarZzc != null) {
                    zzai("Google", true);
                    zzbnwVarZzc.zze((zzboc) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzx != 7) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrong native template id!");
            } else {
                zzbsr zzbsrVarZze = this.zzi.zze();
                if (zzbsrVarZze != null) {
                    zzbsrVarZze.zze((zzbsl) this.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}
