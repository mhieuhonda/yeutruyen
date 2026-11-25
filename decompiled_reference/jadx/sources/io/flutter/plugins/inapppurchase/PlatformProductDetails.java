package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fJ\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010!\u001a\u00020\"H\u0096\u0080\u0004J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003Jk\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006."}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformProductDetails;", "", "description", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "productId", "productType", "Lio/flutter/plugins/inapppurchase/PlatformProductType;", "title", "oneTimePurchaseOfferDetails", "Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails;", "oneTimePurchaseOfferDetailsList", "", "subscriptionOfferDetails", "Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformProductType;Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails;Ljava/util/List;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getName", "getProductId", "getProductType", "()Lio/flutter/plugins/inapppurchase/PlatformProductType;", "getTitle", "getOneTimePurchaseOfferDetails", "()Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails;", "getOneTimePurchaseOfferDetailsList", "()Ljava/util/List;", "getSubscriptionOfferDetails", "toList", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformProductDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String description;
    private final String name;
    private final PlatformOneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
    private final List<PlatformOneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList;
    private final String productId;
    private final PlatformProductType productType;
    private final List<PlatformSubscriptionOfferDetails> subscriptionOfferDetails;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformProductDetails copy$default(PlatformProductDetails platformProductDetails, String str, String str2, String str3, PlatformProductType platformProductType, String str4, PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platformProductDetails.description;
        }
        if ((i & 2) != 0) {
            str2 = platformProductDetails.name;
        }
        if ((i & 4) != 0) {
            str3 = platformProductDetails.productId;
        }
        if ((i & 8) != 0) {
            platformProductType = platformProductDetails.productType;
        }
        if ((i & 16) != 0) {
            str4 = platformProductDetails.title;
        }
        if ((i & 32) != 0) {
            platformOneTimePurchaseOfferDetails = platformProductDetails.oneTimePurchaseOfferDetails;
        }
        if ((i & 64) != 0) {
            list = platformProductDetails.oneTimePurchaseOfferDetailsList;
        }
        if ((i & 128) != 0) {
            list2 = platformProductDetails.subscriptionOfferDetails;
        }
        List list3 = list;
        List list4 = list2;
        String str5 = str4;
        PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails2 = platformOneTimePurchaseOfferDetails;
        return platformProductDetails.copy(str, str2, str3, platformProductType, str5, platformOneTimePurchaseOfferDetails2, list3, list4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PlatformProductType getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PlatformOneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        return this.oneTimePurchaseOfferDetails;
    }

    public final List<PlatformOneTimePurchaseOfferDetails> component7() {
        return this.oneTimePurchaseOfferDetailsList;
    }

    public final List<PlatformSubscriptionOfferDetails> component8() {
        return this.subscriptionOfferDetails;
    }

    public final PlatformProductDetails copy(String description, String name, String productId, PlatformProductType productType, String title, PlatformOneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, List<PlatformOneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList, List<PlatformSubscriptionOfferDetails> subscriptionOfferDetails) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(title, "title");
        return new PlatformProductDetails(description, name, productId, productType, title, oneTimePurchaseOfferDetails, oneTimePurchaseOfferDetailsList, subscriptionOfferDetails);
    }

    public String toString() {
        return "PlatformProductDetails(description=" + this.description + ", name=" + this.name + ", productId=" + this.productId + ", productType=" + this.productType + ", title=" + this.title + ", oneTimePurchaseOfferDetails=" + this.oneTimePurchaseOfferDetails + ", oneTimePurchaseOfferDetailsList=" + this.oneTimePurchaseOfferDetailsList + ", subscriptionOfferDetails=" + this.subscriptionOfferDetails + ")";
    }

    public PlatformProductDetails(String description, String name, String productId, PlatformProductType productType, String title, PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails, List<PlatformOneTimePurchaseOfferDetails> list, List<PlatformSubscriptionOfferDetails> list2) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(title, "title");
        this.description = description;
        this.name = name;
        this.productId = productId;
        this.productType = productType;
        this.title = title;
        this.oneTimePurchaseOfferDetails = platformOneTimePurchaseOfferDetails;
        this.oneTimePurchaseOfferDetailsList = list;
        this.subscriptionOfferDetails = list2;
    }

    public /* synthetic */ PlatformProductDetails(String str, String str2, String str3, PlatformProductType platformProductType, String str4, PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, platformProductType, str4, (i & 32) != 0 ? null : platformOneTimePurchaseOfferDetails, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : list2);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final PlatformProductType getProductType() {
        return this.productType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PlatformOneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        return this.oneTimePurchaseOfferDetails;
    }

    public final List<PlatformOneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetailsList() {
        return this.oneTimePurchaseOfferDetailsList;
    }

    public final List<PlatformSubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.subscriptionOfferDetails;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformProductDetails$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformProductDetails;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformProductDetails fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj2;
            Object obj3 = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj3;
            Object obj4 = pigeonVar_list.get(3);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
            PlatformProductType platformProductType = (PlatformProductType) obj4;
            Object obj5 = pigeonVar_list.get(4);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
            return new PlatformProductDetails(str, str2, str3, platformProductType, (String) obj5, (PlatformOneTimePurchaseOfferDetails) pigeonVar_list.get(5), (List) pigeonVar_list.get(6), (List) pigeonVar_list.get(7));
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.description, this.name, this.productId, this.productType, this.title, this.oneTimePurchaseOfferDetails, this.oneTimePurchaseOfferDetailsList, this.subscriptionOfferDetails);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformProductDetails platformProductDetails = (PlatformProductDetails) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.description, platformProductDetails.description) && MessagesPigeonUtils.INSTANCE.deepEquals(this.name, platformProductDetails.name) && MessagesPigeonUtils.INSTANCE.deepEquals(this.productId, platformProductDetails.productId) && MessagesPigeonUtils.INSTANCE.deepEquals(this.productType, platformProductDetails.productType) && MessagesPigeonUtils.INSTANCE.deepEquals(this.title, platformProductDetails.title) && MessagesPigeonUtils.INSTANCE.deepEquals(this.oneTimePurchaseOfferDetails, platformProductDetails.oneTimePurchaseOfferDetails) && MessagesPigeonUtils.INSTANCE.deepEquals(this.oneTimePurchaseOfferDetailsList, platformProductDetails.oneTimePurchaseOfferDetailsList) && MessagesPigeonUtils.INSTANCE.deepEquals(this.subscriptionOfferDetails, platformProductDetails.subscriptionOfferDetails)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.description)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.name)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.productId)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.productType)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.title)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.oneTimePurchaseOfferDetails)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.oneTimePurchaseOfferDetailsList)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.subscriptionOfferDetails);
    }
}
