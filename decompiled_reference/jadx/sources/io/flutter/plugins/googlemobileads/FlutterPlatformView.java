package io.flutter.plugins.googlemobileads;

import android.view.View;
import io.flutter.plugin.platform.PlatformView;

/* JADX INFO: loaded from: classes3.dex */
class FlutterPlatformView implements PlatformView {
    private View view;

    FlutterPlatformView(View view) {
        this.view = view;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.view;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        this.view = null;
    }
}
