package io.flutter.plugins.urllauncher;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\n\u0010\u0019\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lio/flutter/plugins/urllauncher/WebViewOptions;", "", "enableJavaScript", "", "enableDomStorage", "headers", "", "", "<init>", "(ZZLjava/util/Map;)V", "getEnableJavaScript", "()Z", "getEnableDomStorage", "getHeaders", "()Ljava/util/Map;", "toList", "", "equals", "other", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "url_launcher_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class WebViewOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean enableDomStorage;
    private final boolean enableJavaScript;
    private final Map<String, String> headers;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewOptions copy$default(WebViewOptions webViewOptions, boolean z, boolean z2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = webViewOptions.enableJavaScript;
        }
        if ((i & 2) != 0) {
            z2 = webViewOptions.enableDomStorage;
        }
        if ((i & 4) != 0) {
            map = webViewOptions.headers;
        }
        return webViewOptions.copy(z, z2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableJavaScript() {
        return this.enableJavaScript;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnableDomStorage() {
        return this.enableDomStorage;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    public final WebViewOptions copy(boolean enableJavaScript, boolean enableDomStorage, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new WebViewOptions(enableJavaScript, enableDomStorage, headers);
    }

    public String toString() {
        return "WebViewOptions(enableJavaScript=" + this.enableJavaScript + ", enableDomStorage=" + this.enableDomStorage + ", headers=" + this.headers + ")";
    }

    public WebViewOptions(boolean z, boolean z2, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.enableJavaScript = z;
        this.enableDomStorage = z2;
        this.headers = headers;
    }

    public final boolean getEnableJavaScript() {
        return this.enableJavaScript;
    }

    public final boolean getEnableDomStorage() {
        return this.enableDomStorage;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/urllauncher/WebViewOptions$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/urllauncher/WebViewOptions;", "pigeonVar_list", "", "url_launcher_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WebViewOptions fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            Object obj3 = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            return new WebViewOptions(zBooleanValue, zBooleanValue2, (Map) obj3);
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(Boolean.valueOf(this.enableJavaScript), Boolean.valueOf(this.enableDomStorage), this.headers);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            WebViewOptions webViewOptions = (WebViewOptions) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(Boolean.valueOf(this.enableJavaScript), Boolean.valueOf(webViewOptions.enableJavaScript)) && MessagesPigeonUtils.INSTANCE.deepEquals(Boolean.valueOf(this.enableDomStorage), Boolean.valueOf(webViewOptions.enableDomStorage)) && MessagesPigeonUtils.INSTANCE.deepEquals(this.headers, webViewOptions.headers)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Boolean.valueOf(this.enableJavaScript))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Boolean.valueOf(this.enableDomStorage))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.headers);
    }
}
