package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001d"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;", "", "billingResult", "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;", "productDetails", "", "Lio/flutter/plugins/inapppurchase/PlatformProductDetails;", "unfetchedProductList", "Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;", "<init>", "(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;Ljava/util/List;)V", "getBillingResult", "()Lio/flutter/plugins/inapppurchase/PlatformBillingResult;", "getProductDetails", "()Ljava/util/List;", "getUnfetchedProductList", "toList", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformProductDetailsResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PlatformBillingResult billingResult;
    private final List<PlatformProductDetails> productDetails;
    private final List<PlatformUnfetchedProduct> unfetchedProductList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformProductDetailsResponse copy$default(PlatformProductDetailsResponse platformProductDetailsResponse, PlatformBillingResult platformBillingResult, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            platformBillingResult = platformProductDetailsResponse.billingResult;
        }
        if ((i & 2) != 0) {
            list = platformProductDetailsResponse.productDetails;
        }
        if ((i & 4) != 0) {
            list2 = platformProductDetailsResponse.unfetchedProductList;
        }
        return platformProductDetailsResponse.copy(platformBillingResult, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PlatformBillingResult getBillingResult() {
        return this.billingResult;
    }

    public final List<PlatformProductDetails> component2() {
        return this.productDetails;
    }

    public final List<PlatformUnfetchedProduct> component3() {
        return this.unfetchedProductList;
    }

    public final PlatformProductDetailsResponse copy(PlatformBillingResult billingResult, List<PlatformProductDetails> productDetails, List<PlatformUnfetchedProduct> unfetchedProductList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(unfetchedProductList, "unfetchedProductList");
        return new PlatformProductDetailsResponse(billingResult, productDetails, unfetchedProductList);
    }

    public String toString() {
        return "PlatformProductDetailsResponse(billingResult=" + this.billingResult + ", productDetails=" + this.productDetails + ", unfetchedProductList=" + this.unfetchedProductList + ")";
    }

    public PlatformProductDetailsResponse(PlatformBillingResult billingResult, List<PlatformProductDetails> productDetails, List<PlatformUnfetchedProduct> unfetchedProductList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(unfetchedProductList, "unfetchedProductList");
        this.billingResult = billingResult;
        this.productDetails = productDetails;
        this.unfetchedProductList = unfetchedProductList;
    }

    public final PlatformBillingResult getBillingResult() {
        return this.billingResult;
    }

    public final List<PlatformProductDetails> getProductDetails() {
        return this.productDetails;
    }

    public final List<PlatformUnfetchedProduct> getUnfetchedProductList() {
        return this.unfetchedProductList;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformProductDetailsResponse fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingResult");
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformProductDetails>");
            Object obj3 = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformUnfetchedProduct>");
            return new PlatformProductDetailsResponse((PlatformBillingResult) obj, (List) obj2, (List) obj3);
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.billingResult, this.productDetails, this.unfetchedProductList);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformProductDetailsResponse platformProductDetailsResponse = (PlatformProductDetailsResponse) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.billingResult, platformProductDetailsResponse.billingResult) && MessagesPigeonUtils.INSTANCE.deepEquals(this.productDetails, platformProductDetailsResponse.productDetails) && MessagesPigeonUtils.INSTANCE.deepEquals(this.unfetchedProductList, platformProductDetailsResponse.unfetchedProductList)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.billingResult)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.productDetails)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.unfetchedProductList);
    }
}
