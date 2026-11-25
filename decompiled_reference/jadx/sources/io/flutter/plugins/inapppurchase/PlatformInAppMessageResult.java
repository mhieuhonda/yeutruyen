package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;", "", "responseCode", "Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;", "purchaseToken", "", "<init>", "(Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;Ljava/lang/String;)V", "getResponseCode", "()Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;", "getPurchaseToken", "()Ljava/lang/String;", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformInAppMessageResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String purchaseToken;
    private final PlatformInAppMessageResponse responseCode;

    public static /* synthetic */ PlatformInAppMessageResult copy$default(PlatformInAppMessageResult platformInAppMessageResult, PlatformInAppMessageResponse platformInAppMessageResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            platformInAppMessageResponse = platformInAppMessageResult.responseCode;
        }
        if ((i & 2) != 0) {
            str = platformInAppMessageResult.purchaseToken;
        }
        return platformInAppMessageResult.copy(platformInAppMessageResponse, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PlatformInAppMessageResponse getResponseCode() {
        return this.responseCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PlatformInAppMessageResult copy(PlatformInAppMessageResponse responseCode, String purchaseToken) {
        Intrinsics.checkNotNullParameter(responseCode, "responseCode");
        return new PlatformInAppMessageResult(responseCode, purchaseToken);
    }

    public String toString() {
        return "PlatformInAppMessageResult(responseCode=" + this.responseCode + ", purchaseToken=" + this.purchaseToken + ")";
    }

    public PlatformInAppMessageResult(PlatformInAppMessageResponse responseCode, String str) {
        Intrinsics.checkNotNullParameter(responseCode, "responseCode");
        this.responseCode = responseCode;
        this.purchaseToken = str;
    }

    public /* synthetic */ PlatformInAppMessageResult(PlatformInAppMessageResponse platformInAppMessageResponse, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(platformInAppMessageResponse, (i & 2) != 0 ? null : str);
    }

    public final PlatformInAppMessageResponse getResponseCode() {
        return this.responseCode;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformInAppMessageResult fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformInAppMessageResponse");
            return new PlatformInAppMessageResult((PlatformInAppMessageResponse) obj, (String) pigeonVar_list.get(1));
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.responseCode, this.purchaseToken);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformInAppMessageResult platformInAppMessageResult = (PlatformInAppMessageResult) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.responseCode, platformInAppMessageResult.responseCode) && MessagesPigeonUtils.INSTANCE.deepEquals(this.purchaseToken, platformInAppMessageResult.purchaseToken)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.responseCode)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.purchaseToken);
    }
}
