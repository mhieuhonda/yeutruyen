package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import io.flutter.plugin.common.MethodChannel;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class FlutterInitializationListener implements OnInitializationCompleteListener {
    private boolean isInitializationCompleted = false;
    private final MethodChannel.Result result;

    FlutterInitializationListener(MethodChannel.Result result) {
        this.result = result;
    }

    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
    public void onInitializationComplete(InitializationStatus initializationStatus) {
        if (this.isInitializationCompleted) {
            return;
        }
        try {
            Method declaredMethod = Class.forName("com.google.android.gms.ads.MobileAds").getDeclaredMethod("setPlugin", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, Constants.REQUEST_AGENT_PREFIX_VERSIONED);
        } catch (Exception unused) {
        }
        this.result.success(new FlutterInitializationStatus(initializationStatus));
        this.isInitializationCompleted = true;
    }
}
