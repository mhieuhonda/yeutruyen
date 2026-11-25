package io.flutter.plugins.googlemobileads.nativetemplates;

import android.graphics.Typeface;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public enum FlutterNativeTemplateFontStyle {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    public static FlutterNativeTemplateFontStyle fromIntValue(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Log.w("NativeTemplateFontStyle", "Invalid index for NativeTemplateFontStyle: " + i);
        return NORMAL;
    }

    Typeface getTypeface() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return Typeface.DEFAULT;
        }
        if (iOrdinal == 1) {
            return Typeface.DEFAULT_BOLD;
        }
        if (iOrdinal == 2) {
            return Typeface.defaultFromStyle(2);
        }
        if (iOrdinal == 3) {
            return Typeface.MONOSPACE;
        }
        return Typeface.DEFAULT;
    }
}
