package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryResponse;", "", "billingResult", "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;", "purchases", "", "Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;", "<init>", "(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;)V", "getBillingResult", "()Lio/flutter/plugins/inapppurchase/PlatformBillingResult;", "getPurchases", "()Ljava/util/List;", "toList", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformPurchaseHistoryResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PlatformBillingResult billingResult;
    private final List<PlatformPurchaseHistoryRecord> purchases;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformPurchaseHistoryResponse copy$default(PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse, PlatformBillingResult platformBillingResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            platformBillingResult = platformPurchaseHistoryResponse.billingResult;
        }
        if ((i & 2) != 0) {
            list = platformPurchaseHistoryResponse.purchases;
        }
        return platformPurchaseHistoryResponse.copy(platformBillingResult, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PlatformBillingResult getBillingResult() {
        return this.billingResult;
    }

    public final List<PlatformPurchaseHistoryRecord> component2() {
        return this.purchases;
    }

    public final PlatformPurchaseHistoryResponse copy(PlatformBillingResult billingResult, List<PlatformPurchaseHistoryRecord> purchases) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        return new PlatformPurchaseHistoryResponse(billingResult, purchases);
    }

    public String toString() {
        return "PlatformPurchaseHistoryResponse(billingResult=" + this.billingResult + ", purchases=" + this.purchases + ")";
    }

    public PlatformPurchaseHistoryResponse(PlatformBillingResult billingResult, List<PlatformPurchaseHistoryRecord> purchases) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        this.billingResult = billingResult;
        this.purchases = purchases;
    }

    public final PlatformBillingResult getBillingResult() {
        return this.billingResult;
    }

    public final List<PlatformPurchaseHistoryRecord> getPurchases() {
        return this.purchases;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryResponse$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryResponse;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformPurchaseHistoryResponse fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformPurchaseHistoryRecord>");
            return new PlatformPurchaseHistoryResponse((PlatformBillingResult) obj, (List) obj2);
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.billingResult, this.purchases);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse = (PlatformPurchaseHistoryResponse) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.billingResult, platformPurchaseHistoryResponse.billingResult) && MessagesPigeonUtils.INSTANCE.deepEquals(this.purchases, platformPurchaseHistoryResponse.purchases)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.billingResult)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.purchases);
    }
}
