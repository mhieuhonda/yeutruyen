package io.flutter.plugins.googlemobileads;

import android.content.Context;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class FlutterAdInspector {
    public static void openAdInspector(Context context, FlutterMobileAdsWrapper flutterMobileAdsWrapper, final MethodChannel.Result result) {
        flutterMobileAdsWrapper.openAdInspector(context, new OnAdInspectorClosedListener() { // from class: io.flutter.plugins.googlemobileads.FlutterAdInspector$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.ads.OnAdInspectorClosedListener
            public final void onAdInspectorClosed(AdInspectorError adInspectorError) {
                FlutterAdInspector.lambda$openAdInspector$0(result, adInspectorError);
            }
        });
    }

    static /* synthetic */ void lambda$openAdInspector$0(MethodChannel.Result result, AdInspectorError adInspectorError) {
        if (adInspectorError != null) {
            result.error(Integer.toString(adInspectorError.getCode()), adInspectorError.getMessage(), adInspectorError.getDomain());
        } else {
            result.success(null);
        }
    }
}
