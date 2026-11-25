package io.flutter.plugins;

import com.aboutyou.dart_packages.sign_in_with_apple.SignInWithApplePlugin;
import com.github.dart_lang.jni.JniPlugin;
import com.github.dart_lang.jni_flutter.JniFlutterPlugin;
import com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin;
import com.llfbandit.app_links.AppLinksPlugin;
import com.tekartik.sqflite.SqflitePlugin;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.inapppurchase.InAppPurchasePlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;
import xyz.luan.audioplayers.AudioplayersPlugin;

/* JADX INFO: loaded from: classes3.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new AppLinksPlugin());
        } catch (Exception e) {
            Log.e(TAG, "Error registering plugin app_links, com.llfbandit.app_links.AppLinksPlugin", e);
        }
        try {
            flutterEngine.getPlugins().add(new AudioplayersPlugin());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin audioplayers_android, xyz.luan.audioplayers.AudioplayersPlugin", e2);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterAndroidLifecyclePlugin());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e3);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterSecureStoragePlugin());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e4);
        }
        try {
            flutterEngine.getPlugins().add(new GoogleMobileAdsPlugin());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e5);
        }
        try {
            flutterEngine.getPlugins().add(new ImagePickerPlugin());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e6);
        }
        try {
            flutterEngine.getPlugins().add(new InAppPurchasePlugin());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin in_app_purchase_android, io.flutter.plugins.inapppurchase.InAppPurchasePlugin", e7);
        }
        try {
            flutterEngine.getPlugins().add(new JniPlugin());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e8);
        }
        try {
            flutterEngine.getPlugins().add(new JniFlutterPlugin());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin jni_flutter, com.github.dart_lang.jni_flutter.JniFlutterPlugin", e9);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add(new SignInWithApplePlugin());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin sign_in_with_apple, com.aboutyou.dart_packages.sign_in_with_apple.SignInWithApplePlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new SqflitePlugin());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add(new WebViewFlutterPlugin());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e14);
        }
    }
}
