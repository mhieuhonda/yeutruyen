package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedw extends com.google.android.gms.ads.internal.client.zzds {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzedk zzd;
    private final zzhcp zze;
    private zzecz zzf;

    zzedw(Context context, WeakReference weakReference, zzedk zzedkVar, zzedy zzedyVar, zzhcp zzhcpVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzedkVar;
        this.zze = zzhcpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzhcf.zzr(this.zzf.zzn(str), new zzedr(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzhcf.zzr(this.zzf.zzn(str), new zzeds(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzdxVarZzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzdxVarZzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zzb(zzecz zzeczVar) {
        this.zzf = zzeczVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void zzc(zzedx zzedxVar) {
        String strZzb = zzedxVar.zzb();
        switch (strZzb.hashCode()) {
            case -1999289321:
                if (strZzb.equals("NATIVE")) {
                    final String strZza = zzedxVar.zza();
                    AdLoader.Builder builder = new AdLoader.Builder(zzl(), strZza);
                    builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzedu
                        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                        public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                            this.zza.zzf(strZza, nativeAd);
                        }
                    });
                    builder.withAdListener(new zzedq(this));
                    NativeAdOptions nativeAdOptionsZze = zzedxVar.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkV)).booleanValue() && nativeAdOptionsZze != null) {
                        builder.withNativeAdOptions(nativeAdOptionsZze);
                    }
                    builder.build().loadAd(zzedxVar.zzc());
                    return;
                }
                break;
            case -1372958932:
                if (strZzb.equals("INTERSTITIAL")) {
                    String strZza2 = zzedxVar.zza();
                    InterstitialAd.load(zzl(), strZza2, zzedxVar.zzc(), new zzedn(this, strZza2));
                    return;
                }
                break;
            case -428325382:
                if (strZzb.equals("APP_OPEN_AD")) {
                    String strZza3 = zzedxVar.zza();
                    AppOpenAd.load(zzl(), strZza3, zzedxVar.zzc(), new zzedl(this, strZza3));
                    return;
                }
                break;
            case 543046670:
                if (strZzb.equals("REWARDED")) {
                    String strZza4 = zzedxVar.zza();
                    RewardedAd.load(zzl(), strZza4, zzedxVar.zzc(), new zzedo(this, strZza4));
                    return;
                }
                break;
            case 1854800829:
                if (strZzb.equals("REWARDED_INTERSTITIAL")) {
                    String strZza5 = zzedxVar.zza();
                    RewardedInterstitialAd.load(zzl(), strZza5, zzedxVar.zzc(), new zzedp(this, strZza5));
                    return;
                }
                break;
            case 1951953708:
                if (strZzb.equals("BANNER")) {
                    String strZza6 = zzedxVar.zza();
                    zzbio zzbioVar = zzbix.zzkV;
                    BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue() && zzedxVar.zzg()) ? new AdManagerAdView(zzl()) : new AdView(zzl());
                    adManagerAdView.setAdSize(zzedxVar.zzd());
                    adManagerAdView.setAdUnitId(strZza6);
                    adManagerAdView.setAdListener(new zzedm(this, strZza6, adManagerAdView));
                    VideoOptions videoOptionsZzf = zzedxVar.zzf();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue() && zzedxVar.zzg() && videoOptionsZzf != null) {
                        ((AdManagerAdView) adManagerAdView).setVideoOptions(videoOptionsZzf);
                    }
                    adManagerAdView.loadAd(zzedxVar.zzc());
                    return;
                }
                break;
        }
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        Activity activityZzo = this.zzd.zzo();
        if (activityZzo != null && (obj = (map = this.zza).get(str)) != null) {
            zzbio zzbioVar = zzbix.zzkU;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                map.remove(str);
            }
            zzk(zzm(obj));
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(activityZzo);
                return;
            }
            if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(activityZzo);
                return;
            }
            if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(activityZzo, zzedv.zza);
                return;
            }
            if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(activityZzo, zzedt.zza);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context contextZzl = zzl();
                intent.setClassName(contextZzl, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzY(contextZzl, intent);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            zzedy.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzedy.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    protected final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    final /* synthetic */ zzedk zzi() {
        return this.zzd;
    }
}
