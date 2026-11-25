package io.flutter.plugins.webviewflutter;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lio/flutter/plugins/webviewflutter/WindowInsetsType;", "", "raw", "", "<init>", "(Ljava/lang/String;II)V", "getRaw", "()I", "SYSTEM_BARS", "DISPLAY_CUTOUT", "CAPTION_BAR", "IME", "MANDATORY_SYSTEM_GESTURES", "NAVIGATION_BARS", "STATUS_BARS", "SYSTEM_GESTURES", "TAPPABLE_ELEMENT", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum WindowInsetsType {
    SYSTEM_BARS(0),
    DISPLAY_CUTOUT(1),
    CAPTION_BAR(2),
    IME(3),
    MANDATORY_SYSTEM_GESTURES(4),
    NAVIGATION_BARS(5),
    STATUS_BARS(6),
    SYSTEM_GESTURES(7),
    TAPPABLE_ELEMENT(8);

    private final int raw;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<WindowInsetsType> getEntries() {
        return $ENTRIES;
    }

    WindowInsetsType(int i) {
        this.raw = i;
    }

    public final int getRaw() {
        return this.raw;
    }

    /* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/webviewflutter/WindowInsetsType$Companion;", "", "<init>", "()V", "ofRaw", "Lio/flutter/plugins/webviewflutter/WindowInsetsType;", "raw", "", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WindowInsetsType ofRaw(int raw) {
            for (WindowInsetsType windowInsetsType : WindowInsetsType.values()) {
                if (windowInsetsType.getRaw() == raw) {
                    return windowInsetsType;
                }
            }
            return null;
        }
    }
}
