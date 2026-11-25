package io.flutter.plugins.googlemobileads;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.gms.ads.AdSize;
import io.flutter.plugin.platform.PlatformView;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
final class FluidAdManagerBannerAd extends FlutterAdManagerBannerAd {
    private static final String TAG = "FluidAdManagerBannerAd";
    private ViewGroup containerView;
    private int height;

    FluidAdManagerBannerAd(int i, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, BannerAdCreator bannerAdCreator) {
        super(i, adInstanceManager, str, Collections.singletonList(new FlutterAdSize(AdSize.FLUID)), flutterAdManagerAdRequest, bannerAdCreator);
        this.height = -1;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdManagerBannerAd, io.flutter.plugins.googlemobileads.FlutterAdLoadedListener
    public void onAdLoaded() {
        if (this.adView != null) {
            this.adView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: io.flutter.plugins.googlemobileads.FluidAdManagerBannerAd.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredHeight != FluidAdManagerBannerAd.this.height) {
                        FluidAdManagerBannerAd.this.manager.onFluidAdHeightChanged(FluidAdManagerBannerAd.this.adId, measuredHeight);
                    }
                    FluidAdManagerBannerAd.this.height = measuredHeight;
                }
            });
            this.manager.onAdLoaded(this.adId, this.adView.getResponseInfo());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdManagerBannerAd, io.flutter.plugins.googlemobileads.FlutterAd
    PlatformView getPlatformView() {
        if (this.adView == null) {
            return null;
        }
        if (this.containerView != null) {
            return new FlutterPlatformView(this.containerView);
        }
        ScrollView scrollViewCreateContainerView = createContainerView();
        if (scrollViewCreateContainerView == null) {
            return null;
        }
        scrollViewCreateContainerView.setClipChildren(false);
        scrollViewCreateContainerView.setVerticalScrollBarEnabled(false);
        scrollViewCreateContainerView.setHorizontalScrollBarEnabled(false);
        this.containerView = scrollViewCreateContainerView;
        scrollViewCreateContainerView.addView(this.adView);
        return new FlutterPlatformView(this.adView);
    }

    ScrollView createContainerView() {
        if (this.manager.getActivity() == null) {
            Log.e(TAG, "Tried to create container view before plugin is attached to an activity.");
            return null;
        }
        return new ScrollView(this.manager.getActivity());
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdManagerBannerAd, io.flutter.plugins.googlemobileads.FlutterAd
    void dispose() {
        if (this.adView != null) {
            this.adView.destroy();
            this.adView = null;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.containerView = null;
        }
    }
}
