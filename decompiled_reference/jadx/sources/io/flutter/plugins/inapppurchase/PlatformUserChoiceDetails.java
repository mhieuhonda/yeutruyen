package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;", "", "originalExternalTransactionId", "", "externalTransactionToken", "products", "", "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getOriginalExternalTransactionId", "()Ljava/lang/String;", "getExternalTransactionToken", "getProducts", "()Ljava/util/List;", "toList", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformUserChoiceDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String externalTransactionToken;
    private final String originalExternalTransactionId;
    private final List<PlatformUserChoiceProduct> products;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformUserChoiceDetails copy$default(PlatformUserChoiceDetails platformUserChoiceDetails, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platformUserChoiceDetails.originalExternalTransactionId;
        }
        if ((i & 2) != 0) {
            str2 = platformUserChoiceDetails.externalTransactionToken;
        }
        if ((i & 4) != 0) {
            list = platformUserChoiceDetails.products;
        }
        return platformUserChoiceDetails.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOriginalExternalTransactionId() {
        return this.originalExternalTransactionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }

    public final List<PlatformUserChoiceProduct> component3() {
        return this.products;
    }

    public final PlatformUserChoiceDetails copy(String originalExternalTransactionId, String externalTransactionToken, List<PlatformUserChoiceProduct> products) {
        Intrinsics.checkNotNullParameter(externalTransactionToken, "externalTransactionToken");
        Intrinsics.checkNotNullParameter(products, "products");
        return new PlatformUserChoiceDetails(originalExternalTransactionId, externalTransactionToken, products);
    }

    public String toString() {
        return "PlatformUserChoiceDetails(originalExternalTransactionId=" + this.originalExternalTransactionId + ", externalTransactionToken=" + this.externalTransactionToken + ", products=" + this.products + ")";
    }

    public PlatformUserChoiceDetails(String str, String externalTransactionToken, List<PlatformUserChoiceProduct> products) {
        Intrinsics.checkNotNullParameter(externalTransactionToken, "externalTransactionToken");
        Intrinsics.checkNotNullParameter(products, "products");
        this.originalExternalTransactionId = str;
        this.externalTransactionToken = externalTransactionToken;
        this.products = products;
    }

    public /* synthetic */ PlatformUserChoiceDetails(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, list);
    }

    public final String getOriginalExternalTransactionId() {
        return this.originalExternalTransactionId;
    }

    public final String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }

    public final List<PlatformUserChoiceProduct> getProducts() {
        return this.products;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformUserChoiceDetails fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            String str = (String) pigeonVar_list.get(0);
            Object obj = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformUserChoiceProduct>");
            return new PlatformUserChoiceDetails(str, (String) obj, (List) obj2);
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.originalExternalTransactionId, this.externalTransactionToken, this.products);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformUserChoiceDetails platformUserChoiceDetails = (PlatformUserChoiceDetails) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.originalExternalTransactionId, platformUserChoiceDetails.originalExternalTransactionId) && MessagesPigeonUtils.INSTANCE.deepEquals(this.externalTransactionToken, platformUserChoiceDetails.externalTransactionToken) && MessagesPigeonUtils.INSTANCE.deepEquals(this.products, platformUserChoiceDetails.products)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.originalExternalTransactionId)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.externalTransactionToken)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.products);
    }
}
