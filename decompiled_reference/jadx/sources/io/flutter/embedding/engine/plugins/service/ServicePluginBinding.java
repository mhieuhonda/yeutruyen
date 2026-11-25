package io.flutter.embedding.engine.plugins.service;

import android.app.Service;

/* JADX INFO: loaded from: classes3.dex */
public interface ServicePluginBinding {
    void addOnModeChangeListener(ServiceAware.OnModeChangeListener onModeChangeListener);

    Object getLifecycle();

    Service getService();

    void removeOnModeChangeListener(ServiceAware.OnModeChangeListener onModeChangeListener);
}
