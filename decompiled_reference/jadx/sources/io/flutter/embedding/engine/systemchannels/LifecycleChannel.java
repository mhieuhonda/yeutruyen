package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.StringCodec;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class LifecycleChannel {
    private static final String CHANNEL_NAME = "flutter/lifecycle";
    private static final String TAG = "LifecycleChannel";
    private final BasicMessageChannel<String> channel;
    private AppLifecycleState lastAndroidState;
    private AppLifecycleState lastFlutterState;
    private boolean lastFocus;

    private enum AppLifecycleState {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public LifecycleChannel(DartExecutor dartExecutor) {
        this((BasicMessageChannel<String>) new BasicMessageChannel(dartExecutor, CHANNEL_NAME, StringCodec.INSTANCE));
    }

    public LifecycleChannel(BasicMessageChannel<String> basicMessageChannel) {
        this.lastAndroidState = null;
        this.lastFlutterState = null;
        this.lastFocus = true;
        this.channel = basicMessageChannel;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x002c  */
    private void sendState(AppLifecycleState appLifecycleState, boolean z) {
        AppLifecycleState appLifecycleState2;
        AppLifecycleState appLifecycleState3 = this.lastAndroidState;
        if (appLifecycleState3 == appLifecycleState && z == this.lastFocus) {
            return;
        }
        if (appLifecycleState == null && appLifecycleState3 == null) {
            this.lastFocus = z;
            return;
        }
        int iOrdinal = appLifecycleState.ordinal();
        if (iOrdinal == 0) {
            appLifecycleState2 = appLifecycleState;
        } else if (iOrdinal == 1) {
            appLifecycleState2 = z ? AppLifecycleState.RESUMED : AppLifecycleState.INACTIVE;
        } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            appLifecycleState2 = appLifecycleState;
        } else {
            appLifecycleState2 = null;
        }
        this.lastAndroidState = appLifecycleState;
        this.lastFocus = z;
        if (appLifecycleState2 == this.lastFlutterState) {
            return;
        }
        String str = "AppLifecycleState." + appLifecycleState2.name().toLowerCase(Locale.ROOT);
        Log.v(TAG, "Sending " + str + " message.");
        this.channel.send(str);
        this.lastFlutterState = appLifecycleState2;
    }

    public void aWindowIsFocused() {
        sendState(this.lastAndroidState, true);
    }

    public void noWindowsAreFocused() {
        sendState(this.lastAndroidState, false);
    }

    public void appIsResumed() {
        sendState(AppLifecycleState.RESUMED, this.lastFocus);
    }

    public void appIsInactive() {
        sendState(AppLifecycleState.INACTIVE, this.lastFocus);
    }

    public void appIsPaused() {
        sendState(AppLifecycleState.PAUSED, this.lastFocus);
    }

    public void appIsDetached() {
        sendState(AppLifecycleState.DETACHED, this.lastFocus);
    }
}
