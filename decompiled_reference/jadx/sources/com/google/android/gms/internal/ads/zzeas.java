package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeas implements AppEventListener, zzdgf, com.google.android.gms.ads.internal.client.zza, zzdcz, zzddt, zzddu, zzden, zzddc, zzfpt {
    private final List zza;
    private final zzeag zzb;
    private long zzc;

    public zzeas(zzeag zzeagVar, zzcnq zzcnqVar) {
        this.zzb = zzeagVar;
        this.zza = Collections.singletonList(zzcnqVar);
    }

    private final void zzi(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        String.valueOf(simpleName);
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(simpleName)), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzi(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzi(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zza(Context context) {
        zzi(zzddu.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzb(Context context) {
        zzi(zzddu.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzc(Context context) {
        zzi(zzddu.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    @ParametersAreNonnullByDefault
    public final void zzd(zzcbw zzcbwVar, String str, String str2) {
        zzi(zzdcz.class, "onRewarded", zzcbwVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzi(zzddc.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
        zzi(zzdcz.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdL(zzfpm zzfpmVar, String str) {
        zzi(zzfpl.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdM(zzfpm zzfpmVar, String str) {
        zzi(zzfpl.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdN(zzfpm zzfpmVar, String str, Throwable th) {
        zzi(zzfpl.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdO(zzfpm zzfpmVar, String str) {
        zzi(zzfpl.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        zzi(zzdgf.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        zzi(zzddt.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
        zzi(zzdcz.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
        zzi(zzdcz.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
        zzi(zzdcz.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
        zzi(zzdcz.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(jElapsedRealtime);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        zzi(zzden.class, "onAdLoaded", new Object[0]);
    }
}
