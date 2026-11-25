package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;", "", "billingResult", "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;", "countryCode", "", "<init>", "(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/lang/String;)V", "getBillingResult", "()Lio/flutter/plugins/inapppurchase/PlatformBillingResult;", "getCountryCode", "()Ljava/lang/String;", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformBillingConfigResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PlatformBillingResult billingResult;
    private final String countryCode;

    public static /* synthetic */ PlatformBillingConfigResponse copy$default(PlatformBillingConfigResponse platformBillingConfigResponse, PlatformBillingResult platformBillingResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            platformBillingResult = platformBillingConfigResponse.billingResult;
        }
        if ((i & 2) != 0) {
            str = platformBillingConfigResponse.countryCode;
        }
        return platformBillingConfigResponse.copy(platformBillingResult, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PlatformBillingResult getBillingResult() {
        return this.billingResult;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final PlatformBillingConfigResponse copy(PlatformBillingResult billingResult, String countryCode) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new PlatformBillingConfigResponse(billingResult, countryCode);
    }

    public String toString() {
        return "PlatformBillingConfigResponse(billingResult=" + this.billingResult + ", countryCode=" + this.countryCode + ")";
    }

    public PlatformBillingConfigResponse(PlatformBillingResult billingResult, String countryCode) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.billingResult = billingResult;
        this.countryCode = countryCode;
    }

    public final PlatformBillingResult getBillingResult() {
        return this.billingResult;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformBillingConfigResponse fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            return new PlatformBillingConfigResponse((PlatformBillingResult) obj, (String) obj2);
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.billingResult, this.countryCode);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformBillingConfigResponse platformBillingConfigResponse = (PlatformBillingConfigResponse) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.billingResult, platformBillingConfigResponse.billingResult) && MessagesPigeonUtils.INSTANCE.deepEquals(this.countryCode, platformBillingConfigResponse.countryCode)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.billingResult)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.countryCode);
    }
}
