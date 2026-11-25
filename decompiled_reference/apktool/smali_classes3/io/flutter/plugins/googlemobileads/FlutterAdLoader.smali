.class public Lio/flutter/plugins/googlemobileads/FlutterAdLoader;
.super Ljava/lang/Object;
.source "FlutterAdLoader.java"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public loadAdManagerAppOpen(Ljava/lang/String;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;)V
    .locals 1

    .line 60
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/gms/ads/appopen/AppOpenAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;)V

    return-void
.end method

.method public loadAdManagerInterstitial(Ljava/lang/String;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAdLoadCallback;)V
    .locals 1

    .line 76
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAdLoadCallback;)V

    return-void
.end method

.method public loadAdManagerNativeAd(Ljava/lang/String;Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;Lcom/google/android/gms/ads/nativead/NativeAdOptions;Lcom/google/android/gms/ads/AdListener;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;)V
    .locals 2

    .line 133
    new-instance v0, Lcom/google/android/gms/ads/AdLoader$Builder;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/ads/AdLoader$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 134
    invoke-virtual {v0, p2}, Lcom/google/android/gms/ads/AdLoader$Builder;->forNativeAd(Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;)Lcom/google/android/gms/ads/AdLoader$Builder;

    move-result-object p1

    .line 135
    invoke-virtual {p1, p3}, Lcom/google/android/gms/ads/AdLoader$Builder;->withNativeAdOptions(Lcom/google/android/gms/ads/nativead/NativeAdOptions;)Lcom/google/android/gms/ads/AdLoader$Builder;

    move-result-object p1

    .line 136
    invoke-virtual {p1, p4}, Lcom/google/android/gms/ads/AdLoader$Builder;->withAdListener(Lcom/google/android/gms/ads/AdListener;)Lcom/google/android/gms/ads/AdLoader$Builder;

    move-result-object p1

    .line 137
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdLoader$Builder;->build()Lcom/google/android/gms/ads/AdLoader;

    move-result-object p1

    .line 138
    invoke-virtual {p1, p5}, Lcom/google/android/gms/ads/AdLoader;->loadAd(Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;)V

    return-void
.end method

.method public loadAdManagerRewarded(Ljava/lang/String;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;)V
    .locals 1

    .line 100
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;)V

    return-void
.end method

.method public loadAdManagerRewardedInterstitial(Ljava/lang/String;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAdLoadCallback;)V
    .locals 1

    .line 108
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAdLoadCallback;)V

    return-void
.end method

.method public loadAppOpen(Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;)V
    .locals 1

    .line 52
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/gms/ads/appopen/AppOpenAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;)V

    return-void
.end method

.method public loadInterstitial(Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;)V
    .locals 1

    .line 68
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;)V

    return-void
.end method

.method public loadNativeAd(Ljava/lang/String;Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;Lcom/google/android/gms/ads/nativead/NativeAdOptions;Lcom/google/android/gms/ads/AdListener;Lcom/google/android/gms/ads/AdRequest;)V
    .locals 2

    .line 118
    new-instance v0, Lcom/google/android/gms/ads/AdLoader$Builder;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/ads/AdLoader$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 119
    invoke-virtual {v0, p2}, Lcom/google/android/gms/ads/AdLoader$Builder;->forNativeAd(Lcom/google/android/gms/ads/nativead/NativeAd$OnNativeAdLoadedListener;)Lcom/google/android/gms/ads/AdLoader$Builder;

    move-result-object p1

    .line 120
    invoke-virtual {p1, p3}, Lcom/google/android/gms/ads/AdLoader$Builder;->withNativeAdOptions(Lcom/google/android/gms/ads/nativead/NativeAdOptions;)Lcom/google/android/gms/ads/AdLoader$Builder;

    move-result-object p1

    .line 121
    invoke-virtual {p1, p4}, Lcom/google/android/gms/ads/AdLoader$Builder;->withAdListener(Lcom/google/android/gms/ads/AdListener;)Lcom/google/android/gms/ads/AdLoader$Builder;

    move-result-object p1

    .line 122
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdLoader$Builder;->build()Lcom/google/android/gms/ads/AdLoader;

    move-result-object p1

    .line 123
    invoke-virtual {p1, p5}, Lcom/google/android/gms/ads/AdLoader;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    return-void
.end method

.method public loadRewarded(Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;)V
    .locals 1

    .line 84
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;)V

    return-void
.end method

.method public loadRewardedInterstitial(Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAdLoadCallback;)V
    .locals 1

    .line 92
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAdLoadCallback;)V

    return-void
.end method
