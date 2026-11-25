package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J#\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\n\u0010\u0015\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate;", "", "products", "", "", "purchaseToken", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getProducts", "()Ljava/util/List;", "getPurchaseToken", "()Ljava/lang/String;", "toList", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformPendingPurchaseUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<String> products;
    private final String purchaseToken;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformPendingPurchaseUpdate copy$default(PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = platformPendingPurchaseUpdate.products;
        }
        if ((i & 2) != 0) {
            str = platformPendingPurchaseUpdate.purchaseToken;
        }
        return platformPendingPurchaseUpdate.copy(list, str);
    }

    public final List<String> component1() {
        return this.products;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PlatformPendingPurchaseUpdate copy(List<String> products, String purchaseToken) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        return new PlatformPendingPurchaseUpdate(products, purchaseToken);
    }

    public String toString() {
        return "PlatformPendingPurchaseUpdate(products=" + this.products + ", purchaseToken=" + this.purchaseToken + ")";
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformPendingPurchaseUpdate fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            return new PlatformPendingPurchaseUpdate((List) obj, (String) obj2);
        }
    }

    public PlatformPendingPurchaseUpdate(List<String> products, String purchaseToken) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.products = products;
        this.purchaseToken = purchaseToken;
    }

    public final List<String> getProducts() {
        return this.products;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.products, this.purchaseToken);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate = (PlatformPendingPurchaseUpdate) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.products, platformPendingPurchaseUpdate.products) && MessagesPigeonUtils.INSTANCE.deepEquals(this.purchaseToken, platformPendingPurchaseUpdate.purchaseToken)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.products)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.purchaseToken);
    }
}
