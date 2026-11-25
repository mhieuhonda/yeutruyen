package io.flutter.plugins.googlemobileads;

import android.util.Log;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
class FlutterRewardedAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterRewardedAd";
    private final FlutterAdManagerAdRequest adManagerRequest;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;
    RewardedAd rewardedAd;

    static class FlutterRewardItem {
        final Integer amount;
        final String type;

        FlutterRewardItem(Integer num, String str) {
            this.amount = num;
            this.type = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlutterRewardItem)) {
                return false;
            }
            FlutterRewardItem flutterRewardItem = (FlutterRewardItem) obj;
            if (this.amount.equals(flutterRewardItem.amount)) {
                return this.type.equals(flutterRewardItem.type);
            }
            return false;
        }

        public int hashCode() {
            return (this.amount.hashCode() * 31) + this.type.hashCode();
        }
    }

    public FlutterRewardedAd(int i, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.adManagerRequest = null;
        this.flutterAdLoader = flutterAdLoader;
    }

    public FlutterRewardedAd(int i, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.request = null;
        this.flutterAdLoader = flutterAdLoader;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void load() {
        DelegatingRewardedCallback delegatingRewardedCallback = new DelegatingRewardedCallback(this);
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader.loadRewarded(str, flutterAdRequest.asAdRequest(str), delegatingRewardedCallback);
            return;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
        if (flutterAdManagerAdRequest != null) {
            FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
            String str2 = this.adUnitId;
            flutterAdLoader2.loadAdManagerRewarded(str2, flutterAdManagerAdRequest.asAdManagerAdRequest(str2), delegatingRewardedCallback);
            return;
        }
        Log.e(TAG, "A null or invalid ad request was provided.");
    }

    void onAdLoaded(RewardedAd rewardedAd) {
        this.rewardedAd = rewardedAd;
        rewardedAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, rewardedAd.getResponseInfo());
    }

    void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.rewardedAd == null) {
            Log.e(TAG, "Error showing rewarded - the rewarded ad wasn't loaded yet.");
        } else {
            if (this.manager.getActivity() == null) {
                Log.e(TAG, "Tried to show rewarded ad before activity was bound to the plugin.");
                return;
            }
            this.rewardedAd.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.rewardedAd.setOnAdMetadataChangedListener(new DelegatingRewardedCallback(this));
            this.rewardedAd.show(this.manager.getActivity(), new DelegatingRewardedCallback(this));
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z) {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            Log.e(TAG, "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
        } else {
            rewardedAd.setImmersiveMode(z);
        }
    }

    void onAdMetadataChanged() {
        this.manager.onAdMetadataChanged(this.adId);
    }

    void onUserEarnedReward(RewardItem rewardItem) {
        this.manager.onRewardedAdUserEarnedReward(this.adId, new FlutterRewardItem(Integer.valueOf(rewardItem.getAmount()), rewardItem.getType()));
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void dispose() {
        this.rewardedAd = null;
    }

    public void setServerSideVerificationOptions(FlutterServerSideVerificationOptions flutterServerSideVerificationOptions) {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setServerSideVerificationOptions(flutterServerSideVerificationOptions.asServerSideVerificationOptions());
        } else {
            Log.e(TAG, "RewardedAd is null in setServerSideVerificationOptions");
        }
    }

    private static final class DelegatingRewardedCallback extends RewardedAdLoadCallback implements OnAdMetadataChangedListener, OnUserEarnedRewardListener {
        private final WeakReference<FlutterRewardedAd> delegate;

        DelegatingRewardedCallback(FlutterRewardedAd flutterRewardedAd) {
            this.delegate = new WeakReference<>(flutterRewardedAd);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd rewardedAd) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdLoaded(rewardedAd);
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdFailedToLoad(loadAdError);
            }
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
            if (this.delegate.get() != null) {
                this.delegate.get().onUserEarnedReward(rewardItem);
            }
        }

        @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
        public void onAdMetadataChanged() {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdMetadataChanged();
            }
        }
    }
}
