package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdSize;
import com.google.common.base.Ascii;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateStyle;
import io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class GoogleMobileAdsPlugin implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler {
    private static final String TAG = "GoogleMobileAdsPlugin";
    private AdMessageCodec adMessageCodec;
    private AppStateNotifier appStateNotifier;
    private final FlutterMobileAdsWrapper flutterMobileAds;
    private AdInstanceManager instanceManager;
    private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
    private final Map<String, NativeAdFactory> nativeAdFactories;
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private UserMessagingPlatformManager userMessagingPlatformManager;

    private static <T> T requireNonNull(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException();
    }

    public GoogleMobileAdsPlugin() {
        this.nativeAdFactories = new HashMap();
        this.flutterMobileAds = new FlutterMobileAdsWrapper();
    }

    protected GoogleMobileAdsPlugin(FlutterPlugin.FlutterPluginBinding flutterPluginBinding, AdInstanceManager adInstanceManager, FlutterMobileAdsWrapper flutterMobileAdsWrapper) {
        this.nativeAdFactories = new HashMap();
        this.pluginBinding = flutterPluginBinding;
        this.instanceManager = adInstanceManager;
        this.flutterMobileAds = flutterMobileAdsWrapper;
    }

    protected GoogleMobileAdsPlugin(AppStateNotifier appStateNotifier) {
        this.nativeAdFactories = new HashMap();
        this.appStateNotifier = appStateNotifier;
        this.flutterMobileAds = new FlutterMobileAdsWrapper();
    }

    public static boolean registerNativeAdFactory(FlutterEngine flutterEngine, String str, NativeAdFactory nativeAdFactory) {
        return registerNativeAdFactory((GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class), str, nativeAdFactory);
    }

    @Deprecated
    public static boolean registerMediationNetworkExtrasProvider(FlutterEngine flutterEngine, MediationNetworkExtrasProvider mediationNetworkExtrasProvider) {
        GoogleMobileAdsPlugin googleMobileAdsPlugin = (GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (googleMobileAdsPlugin == null) {
            return false;
        }
        googleMobileAdsPlugin.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
        AdMessageCodec adMessageCodec = googleMobileAdsPlugin.adMessageCodec;
        if (adMessageCodec == null) {
            return true;
        }
        adMessageCodec.setMediationNetworkExtrasProvider(mediationNetworkExtrasProvider);
        return true;
    }

    @Deprecated
    public static void unregisterMediationNetworkExtrasProvider(FlutterEngine flutterEngine) {
        GoogleMobileAdsPlugin googleMobileAdsPlugin = (GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (googleMobileAdsPlugin == null) {
            return;
        }
        AdMessageCodec adMessageCodec = googleMobileAdsPlugin.adMessageCodec;
        if (adMessageCodec != null) {
            adMessageCodec.setMediationNetworkExtrasProvider(null);
        }
        googleMobileAdsPlugin.mediationNetworkExtrasProvider = null;
    }

    private static boolean registerNativeAdFactory(GoogleMobileAdsPlugin googleMobileAdsPlugin, String str, NativeAdFactory nativeAdFactory) {
        if (googleMobileAdsPlugin == null) {
            throw new IllegalStateException(String.format("Could not find a %s instance. The plugin may have not been registered.", TAG));
        }
        return googleMobileAdsPlugin.addNativeAdFactory(str, nativeAdFactory);
    }

    public static NativeAdFactory unregisterNativeAdFactory(FlutterEngine flutterEngine, String str) {
        FlutterPlugin flutterPlugin = flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (flutterPlugin != null) {
            return ((GoogleMobileAdsPlugin) flutterPlugin).removeNativeAdFactory(str);
        }
        return null;
    }

    private boolean addNativeAdFactory(String str, NativeAdFactory nativeAdFactory) {
        if (this.nativeAdFactories.containsKey(str)) {
            Log.e(TAG, String.format("A NativeAdFactory with the following factoryId already exists: %s", str));
            return false;
        }
        this.nativeAdFactories.put(str, nativeAdFactory);
        return true;
    }

    private NativeAdFactory removeNativeAdFactory(String str) {
        return this.nativeAdFactories.remove(str);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
        AdMessageCodec adMessageCodec = new AdMessageCodec(flutterPluginBinding.getApplicationContext(), new FlutterRequestAgentProvider(flutterPluginBinding.getApplicationContext()));
        this.adMessageCodec = adMessageCodec;
        MediationNetworkExtrasProvider mediationNetworkExtrasProvider = this.mediationNetworkExtrasProvider;
        if (mediationNetworkExtrasProvider != null) {
            adMessageCodec.setMediationNetworkExtrasProvider(mediationNetworkExtrasProvider);
        }
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.flutter.io/google_mobile_ads", new StandardMethodCodec(this.adMessageCodec));
        methodChannel.setMethodCallHandler(this);
        this.instanceManager = new AdInstanceManager(methodChannel);
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("plugins.flutter.io/google_mobile_ads/ad_widget", new GoogleMobileAdsViewFactory(this.instanceManager));
        this.appStateNotifier = new AppStateNotifier(flutterPluginBinding.getBinaryMessenger());
        this.userMessagingPlatformManager = new UserMessagingPlatformManager(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AppStateNotifier appStateNotifier = this.appStateNotifier;
        if (appStateNotifier != null) {
            appStateNotifier.stop();
            this.appStateNotifier = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(activityPluginBinding.getActivity());
        }
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null) {
            adMessageCodec.setContext(activityPluginBinding.getActivity());
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(activityPluginBinding.getActivity());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null && (flutterPluginBinding = this.pluginBinding) != null) {
            adMessageCodec.setContext(flutterPluginBinding.getApplicationContext());
        }
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(null);
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(activityPluginBinding.getActivity());
        }
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null) {
            adMessageCodec.setContext(activityPluginBinding.getActivity());
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(activityPluginBinding.getActivity());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null && (flutterPluginBinding = this.pluginBinding) != null) {
            adMessageCodec.setContext(flutterPluginBinding.getApplicationContext());
        }
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(null);
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Context applicationContext;
        FlutterRewardedAd flutterRewardedAd;
        FlutterRewardedInterstitialAd flutterRewardedInterstitialAd;
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager == null || this.pluginBinding == null) {
            Log.e(TAG, "method call received before instanceManager initialized: " + methodCall.method);
            return;
        }
        if (adInstanceManager.getActivity() != null) {
            applicationContext = this.instanceManager.getActivity();
        } else {
            applicationContext = this.pluginBinding.getApplicationContext();
        }
        Context context = applicationContext;
        String str = methodCall.method;
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1959534605:
                if (str.equals("MobileAds#openDebugMenu")) {
                    b = 0;
                }
                break;
            case -1941808395:
                if (str.equals("loadInterstitialAd")) {
                    b = 1;
                }
                break;
            case -1826439721:
                if (str.equals("MobileAds#setAppMuted")) {
                    b = 2;
                }
                break;
            case -1771320504:
                if (str.equals("loadAppOpenAd")) {
                    b = 3;
                }
                break;
            case -1557947903:
                if (str.equals("MobileAds#registerWebView")) {
                    b = 4;
                }
                break;
            case -1548893609:
                if (str.equals("loadRewardedAd")) {
                    b = 5;
                }
                break;
            case -1395015128:
                if (str.equals("MobileAds#getRequestConfiguration")) {
                    b = 6;
                }
                break;
            case -1273455673:
                if (str.equals("loadFluidAd")) {
                    b = 7;
                }
                break;
            case -965504608:
                if (str.equals("loadNativeAd")) {
                    b = 8;
                }
                break;
            case -918684377:
                if (str.equals("setServerSideVerificationOptions")) {
                    b = 9;
                }
                break;
            case -768079951:
                if (str.equals("AdSize#getAnchoredAdaptiveBannerAdSize")) {
                    b = 10;
                }
                break;
            case -676596397:
                if (str.equals("loadAdManagerInterstitialAd")) {
                    b = Ascii.VT;
                }
                break;
            case -572043403:
                if (str.equals("loadBannerAd")) {
                    b = Ascii.FF;
                }
                break;
            case -533157842:
                if (str.equals("MobileAds#setAppVolume")) {
                    b = Ascii.CR;
                }
                break;
            case -436783448:
                if (str.equals("MobileAds#getVersionString")) {
                    b = Ascii.SO;
                }
                break;
            case -215792322:
                if (str.equals("AdSize#getLargeAnchoredAdaptiveBannerAdSize")) {
                    b = Ascii.SI;
                }
                break;
            case -172783533:
                if (str.equals("loadAdManagerBannerAd")) {
                    b = Ascii.DLE;
                }
                break;
            case 90971631:
                if (str.equals("_init")) {
                    b = 17;
                }
                break;
            case 250880674:
                if (str.equals("disposeAd")) {
                    b = Ascii.DC2;
                }
                break;
            case 273004986:
                if (str.equals("getAdSize")) {
                    b = 19;
                }
                break;
            case 288452133:
                if (str.equals("MobileAds#updateRequestConfiguration")) {
                    b = Ascii.DC4;
                }
                break;
            case 316173893:
                if (str.equals("MobileAds#disableMediationInitialization")) {
                    b = Ascii.NAK;
                }
                break;
            case 1064076149:
                if (str.equals("MobileAds#openAdInspector")) {
                    b = Ascii.SYN;
                }
                break;
            case 1355848557:
                if (str.equals("showAdWithoutView")) {
                    b = Ascii.ETB;
                }
                break;
            case 1403601573:
                if (str.equals("MobileAds#initialize")) {
                    b = Ascii.CAN;
                }
                break;
            case 1560054912:
                if (str.equals("isCollapsible")) {
                    b = Ascii.EM;
                }
                break;
            case 1661969852:
                if (str.equals("setImmersiveMode")) {
                    b = Ascii.SUB;
                }
                break;
            case 1882741923:
                if (str.equals("loadRewardedInterstitialAd")) {
                    b = Ascii.ESC;
                }
                break;
        }
        switch (b) {
            case 0:
                this.flutterMobileAds.openDebugMenu(context, (String) methodCall.argument("adUnitId"));
                result.success(null);
                break;
            case 1:
                FlutterInterstitialAd flutterInterstitialAd = new FlutterInterstitialAd(((Integer) methodCall.argument("adId")).intValue(), this.instanceManager, (String) methodCall.argument("adUnitId"), (FlutterAdRequest) methodCall.argument("request"), new FlutterAdLoader(context));
                this.instanceManager.trackAd(flutterInterstitialAd, ((Integer) methodCall.argument("adId")).intValue());
                flutterInterstitialAd.load();
                result.success(null);
                break;
            case 2:
                this.flutterMobileAds.setAppMuted(((Boolean) methodCall.argument("muted")).booleanValue());
                result.success(null);
                break;
            case 3:
                FlutterAppOpenAd flutterAppOpenAd = new FlutterAppOpenAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), (String) requireNonNull((String) methodCall.argument("adUnitId")), (FlutterAdRequest) methodCall.argument("request"), (FlutterAdManagerAdRequest) methodCall.argument("adManagerRequest"), new FlutterAdLoader(context));
                this.instanceManager.trackAd(flutterAppOpenAd, ((Integer) methodCall.argument("adId")).intValue());
                flutterAppOpenAd.load();
                result.success(null);
                break;
            case 4:
                this.flutterMobileAds.registerWebView(((Integer) methodCall.argument("webViewId")).intValue(), this.pluginBinding.getFlutterEngine());
                result.success(null);
                break;
            case 5:
                String str2 = (String) requireNonNull((String) methodCall.argument("adUnitId"));
                FlutterAdRequest flutterAdRequest = (FlutterAdRequest) methodCall.argument("request");
                FlutterAdManagerAdRequest flutterAdManagerAdRequest = (FlutterAdManagerAdRequest) methodCall.argument("adManagerRequest");
                if (flutterAdRequest != null) {
                    flutterRewardedAd = new FlutterRewardedAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str2, flutterAdRequest, new FlutterAdLoader(context));
                } else if (flutterAdManagerAdRequest != null) {
                    flutterRewardedAd = new FlutterRewardedAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str2, flutterAdManagerAdRequest, new FlutterAdLoader(context));
                } else {
                    result.error("InvalidRequest", "A null or invalid ad request was provided.", null);
                }
                FlutterRewardedAd flutterRewardedAd2 = flutterRewardedAd;
                this.instanceManager.trackAd(flutterRewardedAd2, ((Integer) requireNonNull((Integer) methodCall.argument("adId"))).intValue());
                flutterRewardedAd2.load();
                result.success(null);
                break;
            case 6:
                result.success(this.flutterMobileAds.getRequestConfiguration());
                break;
            case 7:
                FluidAdManagerBannerAd fluidAdManagerBannerAd = new FluidAdManagerBannerAd(((Integer) methodCall.argument("adId")).intValue(), this.instanceManager, (String) methodCall.argument("adUnitId"), (FlutterAdManagerAdRequest) methodCall.argument("request"), getBannerAdCreator(context));
                this.instanceManager.trackAd(fluidAdManagerBannerAd, ((Integer) methodCall.argument("adId")).intValue());
                fluidAdManagerBannerAd.load();
                result.success(null);
                break;
            case 8:
                String str3 = (String) methodCall.argument("factoryId");
                NativeAdFactory nativeAdFactory = this.nativeAdFactories.get(str3);
                FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) methodCall.argument("nativeTemplateStyle");
                if (nativeAdFactory == null && flutterNativeTemplateStyle == null) {
                    result.error("NativeAdError", String.format("No NativeAdFactory with id: %s or nativeTemplateStyle", str3), null);
                } else {
                    FlutterNativeAd flutterNativeAdBuild = new FlutterNativeAd.Builder(context).setManager(this.instanceManager).setAdUnitId((String) methodCall.argument("adUnitId")).setAdFactory(nativeAdFactory).setRequest((FlutterAdRequest) methodCall.argument("request")).setAdManagerRequest((FlutterAdManagerAdRequest) methodCall.argument("adManagerRequest")).setCustomOptions((Map) methodCall.argument("customOptions")).setId(((Integer) methodCall.argument("adId")).intValue()).setNativeAdOptions((FlutterNativeAdOptions) methodCall.argument("nativeAdOptions")).setFlutterAdLoader(new FlutterAdLoader(context)).setNativeTemplateStyle((FlutterNativeTemplateStyle) methodCall.argument("nativeTemplateStyle")).build();
                    this.instanceManager.trackAd(flutterNativeAdBuild, ((Integer) methodCall.argument("adId")).intValue());
                    flutterNativeAdBuild.load();
                    result.success(null);
                }
                break;
            case 9:
                FlutterAd flutterAdAdForId = this.instanceManager.adForId(((Integer) methodCall.argument("adId")).intValue());
                FlutterServerSideVerificationOptions flutterServerSideVerificationOptions = (FlutterServerSideVerificationOptions) methodCall.argument("serverSideVerificationOptions");
                if (flutterAdAdForId == null) {
                    Log.w(TAG, "Error - null ad in setServerSideVerificationOptions");
                } else if (flutterAdAdForId instanceof FlutterRewardedAd) {
                    ((FlutterRewardedAd) flutterAdAdForId).setServerSideVerificationOptions(flutterServerSideVerificationOptions);
                } else if (flutterAdAdForId instanceof FlutterRewardedInterstitialAd) {
                    ((FlutterRewardedInterstitialAd) flutterAdAdForId).setServerSideVerificationOptions(flutterServerSideVerificationOptions);
                } else {
                    Log.w(TAG, "Error - setServerSideVerificationOptions called on non-rewarded ad");
                }
                result.success(null);
                break;
            case 10:
                FlutterAdSize.AnchoredAdaptiveBannerAdSize anchoredAdaptiveBannerAdSize = new FlutterAdSize.AnchoredAdaptiveBannerAdSize(context, new FlutterAdSize.AdSizeFactory(), (String) methodCall.argument("orientation"), ((Integer) methodCall.argument("width")).intValue(), false);
                if (AdSize.INVALID.equals(anchoredAdaptiveBannerAdSize.size)) {
                    result.success(null);
                } else {
                    result.success(Integer.valueOf(anchoredAdaptiveBannerAdSize.height));
                }
                break;
            case 11:
                FlutterAdManagerInterstitialAd flutterAdManagerInterstitialAd = new FlutterAdManagerInterstitialAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), (String) requireNonNull((String) methodCall.argument("adUnitId")), (FlutterAdManagerAdRequest) methodCall.argument("request"), new FlutterAdLoader(context));
                this.instanceManager.trackAd(flutterAdManagerInterstitialAd, ((Integer) requireNonNull((Integer) methodCall.argument("adId"))).intValue());
                flutterAdManagerInterstitialAd.load();
                result.success(null);
                break;
            case 12:
                FlutterBannerAd flutterBannerAd = new FlutterBannerAd(((Integer) methodCall.argument("adId")).intValue(), this.instanceManager, (String) methodCall.argument("adUnitId"), (FlutterAdRequest) methodCall.argument("request"), (FlutterAdSize) methodCall.argument("size"), getBannerAdCreator(context));
                this.instanceManager.trackAd(flutterBannerAd, ((Integer) methodCall.argument("adId")).intValue());
                flutterBannerAd.load();
                result.success(null);
                break;
            case 13:
                this.flutterMobileAds.setAppVolume(((Double) methodCall.argument("volume")).doubleValue());
                result.success(null);
                break;
            case 14:
                result.success(this.flutterMobileAds.getVersionString());
                break;
            case 15:
                FlutterAdSize.AnchoredAdaptiveBannerAdSize anchoredAdaptiveBannerAdSize2 = new FlutterAdSize.AnchoredAdaptiveBannerAdSize(context, new FlutterAdSize.AdSizeFactory(), (String) methodCall.argument("orientation"), ((Integer) methodCall.argument("width")).intValue(), true);
                if (AdSize.INVALID.equals(anchoredAdaptiveBannerAdSize2.size)) {
                    result.success(null);
                } else {
                    result.success(Integer.valueOf(anchoredAdaptiveBannerAdSize2.height));
                }
                break;
            case 16:
                FlutterAdManagerBannerAd flutterAdManagerBannerAd = new FlutterAdManagerBannerAd(((Integer) methodCall.argument("adId")).intValue(), this.instanceManager, (String) methodCall.argument("adUnitId"), (List) methodCall.argument("sizes"), (FlutterAdManagerAdRequest) methodCall.argument("request"), getBannerAdCreator(context));
                this.instanceManager.trackAd(flutterAdManagerBannerAd, ((Integer) methodCall.argument("adId")).intValue());
                flutterAdManagerBannerAd.load();
                result.success(null);
                break;
            case 17:
                this.instanceManager.disposeAllAds();
                result.success(null);
                break;
            case 18:
                this.instanceManager.disposeAd(((Integer) methodCall.argument("adId")).intValue());
                result.success(null);
                break;
            case 19:
                FlutterAd flutterAdAdForId2 = this.instanceManager.adForId(((Integer) methodCall.argument("adId")).intValue());
                if (flutterAdAdForId2 == null) {
                    result.success(null);
                } else if (flutterAdAdForId2 instanceof FlutterBannerAd) {
                    result.success(((FlutterBannerAd) flutterAdAdForId2).getAdSize());
                } else if (flutterAdAdForId2 instanceof FlutterAdManagerBannerAd) {
                    result.success(((FlutterAdManagerBannerAd) flutterAdAdForId2).getAdSize());
                } else {
                    result.error("unexpected_ad_type", "Unexpected ad type for getAdSize: " + flutterAdAdForId2, null);
                }
                break;
            case 20:
                FlutterRequestConfiguration.updateRequestConfiguration(methodCall);
                result.success(null);
                break;
            case 21:
                this.flutterMobileAds.disableMediationInitialization(context);
                result.success(null);
                break;
            case 22:
                FlutterAdInspector.openAdInspector(context, this.flutterMobileAds, result);
                break;
            case 23:
                if (!this.instanceManager.showAdWithId(((Integer) methodCall.argument("adId")).intValue())) {
                    result.error("AdShowError", "Ad failed to show.", null);
                } else {
                    result.success(null);
                }
                break;
            case 24:
                this.flutterMobileAds.initialize(context, new FlutterInitializationListener(result));
                break;
            case 25:
                FlutterAd flutterAdAdForId3 = this.instanceManager.adForId(((Integer) methodCall.argument("adId")).intValue());
                if (flutterAdAdForId3 == null) {
                    result.success(false);
                } else if (flutterAdAdForId3 instanceof FlutterBannerAd) {
                    result.success(Boolean.valueOf(((FlutterBannerAd) flutterAdAdForId3).isCollapsible()));
                } else if (flutterAdAdForId3 instanceof FlutterAdManagerBannerAd) {
                    result.success(Boolean.valueOf(((FlutterAdManagerBannerAd) flutterAdAdForId3).isCollapsible()));
                } else {
                    result.error("unexpected_ad_type", "Unexpected ad type for isCollapsible: " + flutterAdAdForId3, null);
                }
                break;
            case 26:
                ((FlutterAd.FlutterOverlayAd) this.instanceManager.adForId(((Integer) methodCall.argument("adId")).intValue())).setImmersiveMode(((Boolean) methodCall.argument("immersiveModeEnabled")).booleanValue());
                result.success(null);
                break;
            case 27:
                String str4 = (String) requireNonNull((String) methodCall.argument("adUnitId"));
                FlutterAdRequest flutterAdRequest2 = (FlutterAdRequest) methodCall.argument("request");
                FlutterAdManagerAdRequest flutterAdManagerAdRequest2 = (FlutterAdManagerAdRequest) methodCall.argument("adManagerRequest");
                if (flutterAdRequest2 != null) {
                    flutterRewardedInterstitialAd = new FlutterRewardedInterstitialAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str4, flutterAdRequest2, new FlutterAdLoader(context));
                } else if (flutterAdManagerAdRequest2 != null) {
                    flutterRewardedInterstitialAd = new FlutterRewardedInterstitialAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str4, flutterAdManagerAdRequest2, new FlutterAdLoader(context));
                } else {
                    result.error("InvalidRequest", "A null or invalid ad request was provided.", null);
                }
                FlutterRewardedInterstitialAd flutterRewardedInterstitialAd2 = flutterRewardedInterstitialAd;
                this.instanceManager.trackAd(flutterRewardedInterstitialAd2, ((Integer) requireNonNull((Integer) methodCall.argument("adId"))).intValue());
                flutterRewardedInterstitialAd2.load();
                result.success(null);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    BannerAdCreator getBannerAdCreator(Context context) {
        return new BannerAdCreator(context);
    }
}
