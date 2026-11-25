package io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tekartik.sqflite.Constant;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class AdInstanceManager {
    private Activity activity;
    private final Map<Integer, FlutterAd> ads = new HashMap();
    private final MethodChannel channel;

    AdInstanceManager(MethodChannel methodChannel) {
        this.channel = methodChannel;
    }

    void setActivity(Activity activity) {
        this.activity = activity;
    }

    Activity getActivity() {
        return this.activity;
    }

    FlutterAd adForId(int i) {
        return this.ads.get(Integer.valueOf(i));
    }

    Integer adIdFor(FlutterAd flutterAd) {
        for (Integer num : this.ads.keySet()) {
            if (this.ads.get(num) == flutterAd) {
                return num;
            }
        }
        return null;
    }

    void trackAd(FlutterAd flutterAd, int i) {
        if (this.ads.get(Integer.valueOf(i)) != null) {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", Integer.valueOf(i)));
        }
        this.ads.put(Integer.valueOf(i), flutterAd);
    }

    void disposeAd(int i) {
        if (this.ads.containsKey(Integer.valueOf(i))) {
            FlutterAd flutterAd = this.ads.get(Integer.valueOf(i));
            if (flutterAd != null) {
                flutterAd.dispose();
            }
            this.ads.remove(Integer.valueOf(i));
        }
    }

    void disposeAllAds() {
        for (Map.Entry<Integer, FlutterAd> entry : this.ads.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().dispose();
            }
        }
        this.ads.clear();
    }

    void onAdLoaded(int i, ResponseInfo responseInfo) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdLoaded");
        map.put("responseInfo", responseInfo == null ? null : new FlutterAd.FlutterResponseInfo(responseInfo));
        invokeOnAdEvent(map);
    }

    void onAdFailedToLoad(int i, FlutterAd.FlutterLoadAdError flutterLoadAdError) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdFailedToLoad");
        map.put("loadAdError", flutterLoadAdError);
        invokeOnAdEvent(map);
    }

    void onAppEvent(int i, String str, String str2) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAppEvent");
        map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        map.put(Constant.PARAM_ERROR_DATA, str2);
        invokeOnAdEvent(map);
    }

    void onAdImpression(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdImpression");
        invokeOnAdEvent(map);
    }

    void onAdClicked(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdClicked");
        invokeOnAdEvent(map);
    }

    void onAdOpened(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdOpened");
        invokeOnAdEvent(map);
    }

    void onAdClosed(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdClosed");
        invokeOnAdEvent(map);
    }

    void onRewardedAdUserEarnedReward(int i, FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onRewardedAdUserEarnedReward");
        map.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(map);
    }

    void onRewardedInterstitialAdUserEarnedReward(int i, FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onRewardedInterstitialAdUserEarnedReward");
        map.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(map);
    }

    void onPaidEvent(FlutterAd flutterAd, FlutterAdValue flutterAdValue) {
        HashMap map = new HashMap();
        map.put("adId", adIdFor(flutterAd));
        map.put("eventName", "onPaidEvent");
        map.put("valueMicros", Long.valueOf(flutterAdValue.valueMicros));
        map.put("precision", Integer.valueOf(flutterAdValue.precisionType));
        map.put("currencyCode", flutterAdValue.currencyCode);
        invokeOnAdEvent(map);
    }

    void onFailedToShowFullScreenContent(int i, AdError adError) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onFailedToShowFullScreenContent");
        map.put(Constant.PARAM_ERROR, new FlutterAd.FlutterAdError(adError));
        invokeOnAdEvent(map);
    }

    void onAdShowedFullScreenContent(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdShowedFullScreenContent");
        invokeOnAdEvent(map);
    }

    void onAdDismissedFullScreenContent(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdDismissedFullScreenContent");
        invokeOnAdEvent(map);
    }

    void onAdMetadataChanged(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdMetadataChanged");
        invokeOnAdEvent(map);
    }

    void onFluidAdHeightChanged(int i, int i2) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onFluidAdHeightChanged");
        map.put("height", Integer.valueOf(i2));
        invokeOnAdEvent(map);
    }

    boolean showAdWithId(int i) {
        FlutterAd.FlutterOverlayAd flutterOverlayAd = (FlutterAd.FlutterOverlayAd) adForId(i);
        if (flutterOverlayAd == null) {
            return false;
        }
        flutterOverlayAd.show();
        return true;
    }

    private void invokeOnAdEvent(final Map<Object, Object> map) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.flutter.plugins.googlemobileads.AdInstanceManager.1
            @Override // java.lang.Runnable
            public void run() {
                AdInstanceManager.this.channel.invokeMethod("onAdEvent", map);
            }
        });
    }
}
