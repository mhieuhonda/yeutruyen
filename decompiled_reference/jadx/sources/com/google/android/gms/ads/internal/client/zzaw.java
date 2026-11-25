package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzf;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzcah;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzcdb;
import com.google.android.gms.internal.ads.zzcet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzfc zzc;
    private final zzboe zzd;
    private final zzbzf zze;
    private zzcah zzf;
    private final zzl zzg;

    public zzaw(zzk zzkVar, zzi zziVar, zzfc zzfcVar, zzboe zzboeVar, zzcdb zzcdbVar, zzbzf zzbzfVar, zzbof zzbofVar, zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzfcVar;
        this.zzd = zzboeVar;
        this.zze = zzbzfVar;
        this.zzg = zzlVar;
    }

    static /* synthetic */ void zzl(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zza().zzi(context, zzay.zzg().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbu zza(Context context, zzr zzrVar, String str, zzbvj zzbvjVar) {
        return (zzbu) new zzam(this, context, zzrVar, str, zzbvjVar).zzd(context, false);
    }

    public final zzbu zzb(Context context, zzr zzrVar, String str, zzbvj zzbvjVar) {
        return (zzbu) new zzan(this, context, zzrVar, str, zzbvjVar).zzd(context, false);
    }

    public final zzbq zzc(Context context, String str, zzbvj zzbvjVar) {
        return (zzbq) new zzap(this, context, str, zzbvjVar).zzd(context, false);
    }

    public final zzch zzd(Context context, zzbvj zzbvjVar) {
        return (zzch) new zzar(this, context, zzbvjVar).zzd(context, false);
    }

    public final zzbmp zze(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbmp) new zzav(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzccp zzf(Context context, String str, zzbvj zzbvjVar) {
        return (zzccp) new zzaa(this, context, str, zzbvjVar).zzd(context, false);
    }

    public final zzbzi zzg(Activity activity) {
        zzac zzacVar = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("useClientJar flag not found in activity intent extras.");
        }
        return (zzbzi) zzacVar.zzd(activity, booleanExtra);
    }

    public final zzdt zzh(Context context, zzbvj zzbvjVar) {
        return (zzdt) new zzae(this, context, zzbvjVar).zzd(context, false);
    }

    public final zzcet zzi(Context context, zzbvj zzbvjVar) {
        return (zzcet) new zzag(this, context, zzbvjVar).zzd(context, false);
    }

    public final zzbzb zzj(Context context, zzbvj zzbvjVar) {
        return (zzbzb) new zzai(this, context, zzbvjVar).zzd(context, false);
    }

    public final zzbra zzk(Context context, zzbvj zzbvjVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbra) new zzak(this, context, zzbvjVar, onH5AdsEventListener).zzd(context, false);
    }

    final /* synthetic */ zzk zzm() {
        return this.zza;
    }

    final /* synthetic */ zzi zzn() {
        return this.zzb;
    }

    final /* synthetic */ zzfc zzo() {
        return this.zzc;
    }

    final /* synthetic */ zzboe zzp() {
        return this.zzd;
    }

    final /* synthetic */ zzbzf zzq() {
        return this.zze;
    }

    final /* synthetic */ zzcah zzr() {
        return this.zzf;
    }

    final /* synthetic */ void zzs(zzcah zzcahVar) {
        this.zzf = zzcahVar;
    }

    final /* synthetic */ zzl zzt() {
        return this.zzg;
    }
}
