package com.github.dart_lang.jni_flutter;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class JniFlutterPlugin implements FlutterPlugin, ActivityAware {
    private static Context context;
    private static final ConcurrentHashMap<Long, JniFlutterPlugin> pluginMap = new ConcurrentHashMap<>();
    private volatile Activity activity;
    private long engineId;

    public static Context getApplicationContext() {
        return context;
    }

    public static Activity getActivity(long j) {
        return ((JniFlutterPlugin) Objects.requireNonNull(pluginMap.get(Long.valueOf(j)))).activity;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.engineId = flutterPluginBinding.getFlutterEngine().getEngineId();
        context = flutterPluginBinding.getApplicationContext();
        pluginMap.put(Long.valueOf(this.engineId), this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.activity = null;
        pluginMap.remove(Long.valueOf(this.engineId));
    }

    private void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        setActivity(activityPluginBinding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        setActivity(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        setActivity(activityPluginBinding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        setActivity(null);
    }
}
