package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u0096\u0080\u0004J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails;", "", "basePlanId", "", "offerId", "offerToken", "offerTags", "", "pricingPhases", "Lio/flutter/plugins/inapppurchase/PlatformPricingPhase;", "installmentPlanDetails", "Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;)V", "getBasePlanId", "()Ljava/lang/String;", "getOfferId", "getOfferToken", "getOfferTags", "()Ljava/util/List;", "getPricingPhases", "getInstallmentPlanDetails", "()Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;", "toList", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformSubscriptionOfferDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String basePlanId;
    private final PlatformInstallmentPlanDetails installmentPlanDetails;
    private final String offerId;
    private final List<String> offerTags;
    private final String offerToken;
    private final List<PlatformPricingPhase> pricingPhases;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformSubscriptionOfferDetails copy$default(PlatformSubscriptionOfferDetails platformSubscriptionOfferDetails, String str, String str2, String str3, List list, List list2, PlatformInstallmentPlanDetails platformInstallmentPlanDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platformSubscriptionOfferDetails.basePlanId;
        }
        if ((i & 2) != 0) {
            str2 = platformSubscriptionOfferDetails.offerId;
        }
        if ((i & 4) != 0) {
            str3 = platformSubscriptionOfferDetails.offerToken;
        }
        if ((i & 8) != 0) {
            list = platformSubscriptionOfferDetails.offerTags;
        }
        if ((i & 16) != 0) {
            list2 = platformSubscriptionOfferDetails.pricingPhases;
        }
        if ((i & 32) != 0) {
            platformInstallmentPlanDetails = platformSubscriptionOfferDetails.installmentPlanDetails;
        }
        List list3 = list2;
        PlatformInstallmentPlanDetails platformInstallmentPlanDetails2 = platformInstallmentPlanDetails;
        return platformSubscriptionOfferDetails.copy(str, str2, str3, list, list3, platformInstallmentPlanDetails2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    public final List<String> component4() {
        return this.offerTags;
    }

    public final List<PlatformPricingPhase> component5() {
        return this.pricingPhases;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PlatformInstallmentPlanDetails getInstallmentPlanDetails() {
        return this.installmentPlanDetails;
    }

    public final PlatformSubscriptionOfferDetails copy(String basePlanId, String offerId, String offerToken, List<String> offerTags, List<PlatformPricingPhase> pricingPhases, PlatformInstallmentPlanDetails installmentPlanDetails) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(pricingPhases, "pricingPhases");
        return new PlatformSubscriptionOfferDetails(basePlanId, offerId, offerToken, offerTags, pricingPhases, installmentPlanDetails);
    }

    public String toString() {
        return "PlatformSubscriptionOfferDetails(basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", offerToken=" + this.offerToken + ", offerTags=" + this.offerTags + ", pricingPhases=" + this.pricingPhases + ", installmentPlanDetails=" + this.installmentPlanDetails + ")";
    }

    public PlatformSubscriptionOfferDetails(String basePlanId, String str, String offerToken, List<String> offerTags, List<PlatformPricingPhase> pricingPhases, PlatformInstallmentPlanDetails platformInstallmentPlanDetails) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(pricingPhases, "pricingPhases");
        this.basePlanId = basePlanId;
        this.offerId = str;
        this.offerToken = offerToken;
        this.offerTags = offerTags;
        this.pricingPhases = pricingPhases;
        this.installmentPlanDetails = platformInstallmentPlanDetails;
    }

    public /* synthetic */ PlatformSubscriptionOfferDetails(String str, String str2, String str3, List list, List list2, PlatformInstallmentPlanDetails platformInstallmentPlanDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, list, list2, (i & 32) != 0 ? null : platformInstallmentPlanDetails);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final List<String> getOfferTags() {
        return this.offerTags;
    }

    public final List<PlatformPricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final PlatformInstallmentPlanDetails getInstallmentPlanDetails() {
        return this.installmentPlanDetails;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformSubscriptionOfferDetails fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            String str2 = (String) pigeonVar_list.get(1);
            Object obj2 = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj2;
            Object obj3 = pigeonVar_list.get(3);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list = (List) obj3;
            Object obj4 = pigeonVar_list.get(4);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformPricingPhase>");
            return new PlatformSubscriptionOfferDetails(str, str2, str3, list, (List) obj4, (PlatformInstallmentPlanDetails) pigeonVar_list.get(5));
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.basePlanId, this.offerId, this.offerToken, this.offerTags, this.pricingPhases, this.installmentPlanDetails);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformSubscriptionOfferDetails platformSubscriptionOfferDetails = (PlatformSubscriptionOfferDetails) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.basePlanId, platformSubscriptionOfferDetails.basePlanId) && MessagesPigeonUtils.INSTANCE.deepEquals(this.offerId, platformSubscriptionOfferDetails.offerId) && MessagesPigeonUtils.INSTANCE.deepEquals(this.offerToken, platformSubscriptionOfferDetails.offerToken) && MessagesPigeonUtils.INSTANCE.deepEquals(this.offerTags, platformSubscriptionOfferDetails.offerTags) && MessagesPigeonUtils.INSTANCE.deepEquals(this.pricingPhases, platformSubscriptionOfferDetails.pricingPhases) && MessagesPigeonUtils.INSTANCE.deepEquals(this.installmentPlanDetails, platformSubscriptionOfferDetails.installmentPlanDetails)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.basePlanId)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.offerId)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.offerToken)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.offerTags)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.pricingPhases)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.installmentPlanDetails);
    }
}
