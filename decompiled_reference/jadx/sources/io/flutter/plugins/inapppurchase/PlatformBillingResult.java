package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformBillingResult;", "", "responseCode", "Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;", "debugMessage", "", "subResponseCode", "", "<init>", "(Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;Ljava/lang/String;J)V", "getResponseCode", "()Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;", "getDebugMessage", "()Ljava/lang/String;", "getSubResponseCode", "()J", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformBillingResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String debugMessage;
    private final PlatformBillingResponse responseCode;
    private final long subResponseCode;

    public static /* synthetic */ PlatformBillingResult copy$default(PlatformBillingResult platformBillingResult, PlatformBillingResponse platformBillingResponse, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            platformBillingResponse = platformBillingResult.responseCode;
        }
        if ((i & 2) != 0) {
            str = platformBillingResult.debugMessage;
        }
        if ((i & 4) != 0) {
            j = platformBillingResult.subResponseCode;
        }
        return platformBillingResult.copy(platformBillingResponse, str, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PlatformBillingResponse getResponseCode() {
        return this.responseCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDebugMessage() {
        return this.debugMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSubResponseCode() {
        return this.subResponseCode;
    }

    public final PlatformBillingResult copy(PlatformBillingResponse responseCode, String debugMessage, long subResponseCode) {
        Intrinsics.checkNotNullParameter(responseCode, "responseCode");
        Intrinsics.checkNotNullParameter(debugMessage, "debugMessage");
        return new PlatformBillingResult(responseCode, debugMessage, subResponseCode);
    }

    public String toString() {
        return "PlatformBillingResult(responseCode=" + this.responseCode + ", debugMessage=" + this.debugMessage + ", subResponseCode=" + this.subResponseCode + ")";
    }

    public PlatformBillingResult(PlatformBillingResponse responseCode, String debugMessage, long j) {
        Intrinsics.checkNotNullParameter(responseCode, "responseCode");
        Intrinsics.checkNotNullParameter(debugMessage, "debugMessage");
        this.responseCode = responseCode;
        this.debugMessage = debugMessage;
        this.subResponseCode = j;
    }

    public final PlatformBillingResponse getResponseCode() {
        return this.responseCode;
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final long getSubResponseCode() {
        return this.subResponseCode;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformBillingResult$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformBillingResult fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResponse");
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
            return new PlatformBillingResult((PlatformBillingResponse) obj, (String) obj2, ((Long) obj3).longValue());
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.responseCode, this.debugMessage, Long.valueOf(this.subResponseCode));
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformBillingResult platformBillingResult = (PlatformBillingResult) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.responseCode, platformBillingResult.responseCode) && MessagesPigeonUtils.INSTANCE.deepEquals(this.debugMessage, platformBillingResult.debugMessage) && MessagesPigeonUtils.INSTANCE.deepEquals(Long.valueOf(this.subResponseCode), Long.valueOf(platformBillingResult.subResponseCode))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.responseCode)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.debugMessage)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Long.valueOf(this.subResponseCode));
    }
}
