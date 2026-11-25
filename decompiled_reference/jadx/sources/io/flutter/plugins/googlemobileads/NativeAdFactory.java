package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface NativeAdFactory {
    NativeAdView createNativeAd(NativeAd nativeAd, Map<String, Object> map);
}
