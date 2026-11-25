package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateStyle;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class FlutterNativeAd extends FlutterAd {
    private static final String TAG = "FlutterNativeAd";
    private final NativeAdFactory adFactory;
    private FlutterAdManagerAdRequest adManagerRequest;
    private final String adUnitId;
    private final Context context;
    private Map<String, Object> customOptions;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterNativeAdOptions nativeAdOptions;
    private NativeAdView nativeAdView;
    private final FlutterNativeTemplateStyle nativeTemplateStyle;
    private FlutterAdRequest request;
    private TemplateView templateView;

    static class Builder {
        private NativeAdFactory adFactory;
        private FlutterAdManagerAdRequest adManagerRequest;
        private String adUnitId;
        private final Context context;
        private Map<String, Object> customOptions;
        private FlutterAdLoader flutterAdLoader;
        private Integer id;
        private AdInstanceManager manager;
        private FlutterNativeAdOptions nativeAdOptions;
        private FlutterNativeTemplateStyle nativeTemplateStyle;
        private FlutterAdRequest request;

        Builder(Context context) {
            this.context = context;
        }

        public Builder setAdFactory(NativeAdFactory nativeAdFactory) {
            this.adFactory = nativeAdFactory;
            return this;
        }

        public Builder setId(int i) {
            this.id = Integer.valueOf(i);
            return this;
        }

        public Builder setCustomOptions(Map<String, Object> map) {
            this.customOptions = map;
            return this;
        }

        public Builder setManager(AdInstanceManager adInstanceManager) {
            this.manager = adInstanceManager;
            return this;
        }

        public Builder setAdUnitId(String str) {
            this.adUnitId = str;
            return this;
        }

        public Builder setRequest(FlutterAdRequest flutterAdRequest) {
            this.request = flutterAdRequest;
            return this;
        }

        public Builder setAdManagerRequest(FlutterAdManagerAdRequest flutterAdManagerAdRequest) {
            this.adManagerRequest = flutterAdManagerAdRequest;
            return this;
        }

        public Builder setNativeAdOptions(FlutterNativeAdOptions flutterNativeAdOptions) {
            this.nativeAdOptions = flutterNativeAdOptions;
            return this;
        }

        public Builder setFlutterAdLoader(FlutterAdLoader flutterAdLoader) {
            this.flutterAdLoader = flutterAdLoader;
            return this;
        }

        public Builder setNativeTemplateStyle(FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
            this.nativeTemplateStyle = flutterNativeTemplateStyle;
            return this;
        }

        FlutterNativeAd build() {
            if (this.manager == null) {
                throw new IllegalStateException("AdInstanceManager cannot be null.");
            }
            if (this.adUnitId == null) {
                throw new IllegalStateException("AdUnitId cannot be null.");
            }
            if (this.adFactory == null && this.nativeTemplateStyle == null) {
                throw new IllegalStateException("NativeAdFactory and nativeTemplateStyle cannot be null.");
            }
            FlutterAdRequest flutterAdRequest = this.request;
            if (flutterAdRequest == null && this.adManagerRequest == null) {
                throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
            }
            if (flutterAdRequest == null) {
                return new FlutterNativeAd(this.context, this.id.intValue(), this.manager, this.adUnitId, this.adFactory, this.adManagerRequest, this.flutterAdLoader, this.customOptions, this.nativeAdOptions, this.nativeTemplateStyle);
            }
            return new FlutterNativeAd(this.context, this.id.intValue(), this.manager, this.adUnitId, this.adFactory, this.request, this.flutterAdLoader, this.customOptions, this.nativeAdOptions, this.nativeTemplateStyle);
        }
    }

    protected FlutterNativeAd(Context context, int i, AdInstanceManager adInstanceManager, String str, NativeAdFactory nativeAdFactory, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader, Map<String, Object> map, FlutterNativeAdOptions flutterNativeAdOptions, FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
        super(i);
        this.context = context;
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adFactory = nativeAdFactory;
        this.request = flutterAdRequest;
        this.flutterAdLoader = flutterAdLoader;
        this.customOptions = map;
        this.nativeAdOptions = flutterNativeAdOptions;
        this.nativeTemplateStyle = flutterNativeTemplateStyle;
    }

    protected FlutterNativeAd(Context context, int i, AdInstanceManager adInstanceManager, String str, NativeAdFactory nativeAdFactory, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader, Map<String, Object> map, FlutterNativeAdOptions flutterNativeAdOptions, FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
        super(i);
        this.context = context;
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adFactory = nativeAdFactory;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.flutterAdLoader = flutterAdLoader;
        this.customOptions = map;
        this.nativeAdOptions = flutterNativeAdOptions;
        this.nativeTemplateStyle = flutterNativeTemplateStyle;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void load() {
        NativeAdOptions nativeAdOptionsAsNativeAdOptions;
        FlutterNativeAdLoadedListener flutterNativeAdLoadedListener = new FlutterNativeAdLoadedListener(this);
        FlutterNativeAdListener flutterNativeAdListener = new FlutterNativeAdListener(this.adId, this.manager);
        FlutterNativeAdOptions flutterNativeAdOptions = this.nativeAdOptions;
        if (flutterNativeAdOptions == null) {
            nativeAdOptionsAsNativeAdOptions = new NativeAdOptions.Builder().build();
        } else {
            nativeAdOptionsAsNativeAdOptions = flutterNativeAdOptions.asNativeAdOptions();
        }
        NativeAdOptions nativeAdOptions = nativeAdOptionsAsNativeAdOptions;
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader.loadNativeAd(str, flutterNativeAdLoadedListener, nativeAdOptions, flutterNativeAdListener, flutterAdRequest.asAdRequest(str));
        } else {
            FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
            if (flutterAdManagerAdRequest != null) {
                this.flutterAdLoader.loadAdManagerNativeAd(this.adUnitId, flutterNativeAdLoadedListener, nativeAdOptions, flutterNativeAdListener, flutterAdManagerAdRequest.asAdManagerAdRequest(this.adUnitId));
            } else {
                Log.e(TAG, "A null or invalid ad request was provided.");
            }
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public PlatformView getPlatformView() {
        if (this.nativeAdView != null) {
            return new FlutterPlatformView(this.nativeAdView);
        }
        if (this.templateView != null) {
            return new FlutterPlatformView(this.templateView);
        }
        return null;
    }

    void onNativeAdLoaded(NativeAd nativeAd) {
        FlutterNativeTemplateStyle flutterNativeTemplateStyle = this.nativeTemplateStyle;
        if (flutterNativeTemplateStyle != null) {
            TemplateView templateViewAsTemplateView = flutterNativeTemplateStyle.asTemplateView(this.context);
            this.templateView = templateViewAsTemplateView;
            templateViewAsTemplateView.setNativeAd(nativeAd);
        } else {
            this.nativeAdView = this.adFactory.createNativeAd(nativeAd, this.customOptions);
        }
        nativeAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, nativeAd.getResponseInfo());
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void dispose() {
        NativeAdView nativeAdView = this.nativeAdView;
        if (nativeAdView != null) {
            nativeAdView.destroy();
            this.nativeAdView = null;
        }
        TemplateView templateView = this.templateView;
        if (templateView != null) {
            templateView.destroyNativeAd();
            this.templateView = null;
        }
    }
}
