package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetails;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.UnfetchedProduct;
import com.android.billingclient.api.UserChoiceDetails;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Translator.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u001a\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u001a\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u001a\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00052\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0005\u001a\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0005\u001a\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001c\u001a\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00052\u0006\u0010!\u001a\u00020\"\u001a\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%\u001a\u0012\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)\u001a\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-\u001a\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020-\u001a\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u000204\u001a\u0012\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108\u001a\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<\u001a\u001c\u0010=\u001a\b\u0012\u0004\u0012\u0002020\u00052\u000e\u0010>\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u0005\u001a\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020:0\u00052\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\u0005\u001a\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00052\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\u0005\u001a\u000e\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020D\u001a\u000e\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J\u001a\u000e\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020-\u001a\u000e\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q\u001a\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u00052\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u0005\u001a\u000e\u0010V\u001a\u00020S2\u0006\u0010W\u001a\u00020U\u001a\u0018\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020J2\b\u0010[\u001a\u0004\u0018\u00010\\\u001a\u0018\u0010]\u001a\u00020^2\u0006\u0010Z\u001a\u00020J2\b\u0010_\u001a\u0004\u0018\u00010`\u001a\u0010\u0010a\u001a\u00020b2\b\u0010c\u001a\u0004\u0018\u00010d\u001a\u000e\u0010e\u001a\u00020\f2\u0006\u0010f\u001a\u00020g\u001a\u000e\u0010h\u001a\u00020-2\u0006\u0010i\u001a\u00020j\u001a\u000e\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020n\u001a\u000e\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020-¨\u0006r"}, d2 = {"fromProductDetail", "Lio/flutter/plugins/inapppurchase/PlatformProductDetails;", "detail", "Lcom/android/billingclient/api/ProductDetails;", "toProductList", "", "Lcom/android/billingclient/api/QueryProductDetailsParams$Product;", "platformProducts", "Lio/flutter/plugins/inapppurchase/PlatformQueryProduct;", "toProduct", "platformProduct", "toProductTypeString", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lio/flutter/plugins/inapppurchase/PlatformProductType;", "toPlatformProductType", "typeString", "fromProductDetailsList", "productDetailsList", "fromOneTimePurchaseOfferDetails", "Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails;", "oneTimePurchaseOfferDetails", "Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;", "fromOneTimePurchaseOfferDetailsList", "oneTimePurchaseOfferDetailsList", "fromSubscriptionOfferDetailsList", "Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails;", "subscriptionOfferDetailsList", "Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;", "fromSubscriptionOfferDetails", "subscriptionOfferDetails", "fromPricingPhases", "Lio/flutter/plugins/inapppurchase/PlatformPricingPhase;", "pricingPhases", "Lcom/android/billingclient/api/ProductDetails$PricingPhases;", "fromPricingPhase", "pricingPhase", "Lcom/android/billingclient/api/ProductDetails$PricingPhase;", "fromInstallmentPlanDetails", "Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;", "installmentPlanDetails", "Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;", "toPlatformRecurrenceMode", "Lio/flutter/plugins/inapppurchase/PlatformRecurrenceMode;", "mode", "", "toPlatformPurchaseState", "Lio/flutter/plugins/inapppurchase/PlatformPurchaseState;", "state", "fromPurchase", "Lio/flutter/plugins/inapppurchase/PlatformPurchase;", "purchase", "Lcom/android/billingclient/api/Purchase;", "fromPendingPurchaseUpdate", "Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate;", "pendingPurchaseUpdate", "Lcom/android/billingclient/api/Purchase$PendingPurchaseUpdate;", "fromPurchaseHistoryRecord", "Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;", "purchaseHistoryRecord", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "fromPurchasesList", "purchases", "fromPurchaseHistoryRecordList", "purchaseHistoryRecords", "fromUnfetchedProductList", "Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;", "unfetchedProductList", "Lcom/android/billingclient/api/UnfetchedProduct;", "fromUnfetchedProduct", "unfetchedProduct", "fromBillingResult", "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "fromBillingResponseCode", "Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;", "billingResponseCode", "fromUserChoiceDetails", "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;", "userChoiceDetails", "Lcom/android/billingclient/api/UserChoiceDetails;", "fromUserChoiceProductsList", "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;", "productsList", "Lcom/android/billingclient/api/UserChoiceDetails$Product;", "fromUserChoiceProduct", "product", "fromBillingConfig", "Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;", Constant.PARAM_RESULT, "billingConfig", "Lcom/android/billingclient/api/BillingConfig;", "fromAlternativeBillingOnlyReportingDetails", "Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse;", "details", "Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;", "toPendingPurchasesParams", "Lcom/android/billingclient/api/PendingPurchasesParams;", "platformPendingPurchasesParams", "Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;", "toBillingClientFeature", "feature", "Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;", "toReplacementMode", "replacementMode", "Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;", "fromInAppMessageResult", "Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;", "inAppMessageResult", "Lcom/android/billingclient/api/InAppMessageResult;", "fromInAppMessageResponseCode", "Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;", "inAppMessageResponseCode", "in_app_purchase_android_release"}, k = 2, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class TranslatorKt {

    /* JADX INFO: compiled from: Translator.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PlatformProductType.values().length];
            try {
                iArr[PlatformProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlatformProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlatformBillingClientFeature.values().length];
            try {
                iArr2[PlatformBillingClientFeature.ALTERNATIVE_BILLING_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PlatformBillingClientFeature.BILLING_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PlatformBillingClientFeature.EXTERNAL_OFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PlatformBillingClientFeature.IN_APP_MESSAGING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PlatformBillingClientFeature.PRICE_CHANGE_CONFIRMATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PlatformBillingClientFeature.PRODUCT_DETAILS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PlatformBillingClientFeature.SUBSCRIPTIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PlatformBillingClientFeature.SUBSCRIPTIONS_UPDATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PlatformReplacementMode.values().length];
            try {
                iArr3[PlatformReplacementMode.CHARGE_FULL_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[PlatformReplacementMode.CHARGE_PRORATED_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[PlatformReplacementMode.DEFERRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[PlatformReplacementMode.WITHOUT_PRORATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[PlatformReplacementMode.WITH_TIME_PRORATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[PlatformReplacementMode.UNKNOWN_REPLACEMENT_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final PlatformProductDetails fromProductDetail(ProductDetails detail) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        String description = detail.getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
        String name = detail.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String productId = detail.getProductId();
        Intrinsics.checkNotNullExpressionValue(productId, "getProductId(...)");
        String productType = detail.getProductType();
        Intrinsics.checkNotNullExpressionValue(productType, "getProductType(...)");
        PlatformProductType platformProductType = toPlatformProductType(productType);
        String title = detail.getTitle();
        Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
        return new PlatformProductDetails(description, name, productId, platformProductType, title, fromOneTimePurchaseOfferDetails(detail.getOneTimePurchaseOfferDetails()), fromOneTimePurchaseOfferDetailsList(detail.getOneTimePurchaseOfferDetailsList()), fromSubscriptionOfferDetailsList(detail.getSubscriptionOfferDetails()));
    }

    public static final List<QueryProductDetailsParams.Product> toProductList(List<PlatformQueryProduct> platformProducts) {
        Intrinsics.checkNotNullParameter(platformProducts, "platformProducts");
        List<PlatformQueryProduct> list = platformProducts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toProduct((PlatformQueryProduct) it.next()));
        }
        return arrayList;
    }

    public static final QueryProductDetailsParams.Product toProduct(PlatformQueryProduct platformProduct) {
        Intrinsics.checkNotNullParameter(platformProduct, "platformProduct");
        QueryProductDetailsParams.Product productBuild = QueryProductDetailsParams.Product.newBuilder().setProductId(platformProduct.getProductId()).setProductType(toProductTypeString(platformProduct.getProductType())).build();
        Intrinsics.checkNotNullExpressionValue(productBuild, "build(...)");
        return productBuild;
    }

    public static final String toProductTypeString(PlatformProductType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return "inapp";
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "subs";
    }

    public static final PlatformProductType toPlatformProductType(String typeString) {
        Intrinsics.checkNotNullParameter(typeString, "typeString");
        if (Intrinsics.areEqual(typeString, "inapp")) {
            return PlatformProductType.INAPP;
        }
        return Intrinsics.areEqual(typeString, "subs") ? PlatformProductType.SUBS : PlatformProductType.INAPP;
    }

    public static final List<PlatformProductDetails> fromProductDetailsList(List<ProductDetails> list) {
        if (list != null) {
            List<ProductDetails> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(fromProductDetail((ProductDetails) it.next()));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    public static final PlatformOneTimePurchaseOfferDetails fromOneTimePurchaseOfferDetails(ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails) {
        if (oneTimePurchaseOfferDetails == null) {
            return null;
        }
        long priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
        String formattedPrice = oneTimePurchaseOfferDetails.getFormattedPrice();
        Intrinsics.checkNotNullExpressionValue(formattedPrice, "getFormattedPrice(...)");
        String priceCurrencyCode = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
        return new PlatformOneTimePurchaseOfferDetails(priceAmountMicros, formattedPrice, priceCurrencyCode);
    }

    public static final List<PlatformOneTimePurchaseOfferDetails> fromOneTimePurchaseOfferDetailsList(List<ProductDetails.OneTimePurchaseOfferDetails> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetailsFromOneTimePurchaseOfferDetails = fromOneTimePurchaseOfferDetails((ProductDetails.OneTimePurchaseOfferDetails) it.next());
            if (platformOneTimePurchaseOfferDetailsFromOneTimePurchaseOfferDetails != null) {
                arrayList.add(platformOneTimePurchaseOfferDetailsFromOneTimePurchaseOfferDetails);
            }
        }
        return arrayList;
    }

    public static final List<PlatformSubscriptionOfferDetails> fromSubscriptionOfferDetailsList(List<ProductDetails.SubscriptionOfferDetails> list) {
        if (list == null) {
            return null;
        }
        List<ProductDetails.SubscriptionOfferDetails> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(fromSubscriptionOfferDetails((ProductDetails.SubscriptionOfferDetails) it.next()));
        }
        return arrayList;
    }

    public static final PlatformSubscriptionOfferDetails fromSubscriptionOfferDetails(ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails) {
        Intrinsics.checkNotNullParameter(subscriptionOfferDetails, "subscriptionOfferDetails");
        String basePlanId = subscriptionOfferDetails.getBasePlanId();
        Intrinsics.checkNotNullExpressionValue(basePlanId, "getBasePlanId(...)");
        String offerId = subscriptionOfferDetails.getOfferId();
        String offerToken = subscriptionOfferDetails.getOfferToken();
        Intrinsics.checkNotNullExpressionValue(offerToken, "getOfferToken(...)");
        List<String> offerTags = subscriptionOfferDetails.getOfferTags();
        Intrinsics.checkNotNullExpressionValue(offerTags, "getOfferTags(...)");
        ProductDetails.PricingPhases pricingPhases = subscriptionOfferDetails.getPricingPhases();
        Intrinsics.checkNotNullExpressionValue(pricingPhases, "getPricingPhases(...)");
        return new PlatformSubscriptionOfferDetails(basePlanId, offerId, offerToken, offerTags, fromPricingPhases(pricingPhases), fromInstallmentPlanDetails(subscriptionOfferDetails.getInstallmentPlanDetails()));
    }

    public static final List<PlatformPricingPhase> fromPricingPhases(ProductDetails.PricingPhases pricingPhases) {
        Intrinsics.checkNotNullParameter(pricingPhases, "pricingPhases");
        List<ProductDetails.PricingPhase> pricingPhaseList = pricingPhases.getPricingPhaseList();
        Intrinsics.checkNotNullExpressionValue(pricingPhaseList, "getPricingPhaseList(...)");
        List<ProductDetails.PricingPhase> list = pricingPhaseList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ProductDetails.PricingPhase pricingPhase : list) {
            Intrinsics.checkNotNull(pricingPhase);
            arrayList.add(fromPricingPhase(pricingPhase));
        }
        return arrayList;
    }

    public static final PlatformPricingPhase fromPricingPhase(ProductDetails.PricingPhase pricingPhase) {
        Intrinsics.checkNotNullParameter(pricingPhase, "pricingPhase");
        long billingCycleCount = pricingPhase.getBillingCycleCount();
        PlatformRecurrenceMode platformRecurrenceMode = toPlatformRecurrenceMode(pricingPhase.getRecurrenceMode());
        long priceAmountMicros = pricingPhase.getPriceAmountMicros();
        String billingPeriod = pricingPhase.getBillingPeriod();
        Intrinsics.checkNotNullExpressionValue(billingPeriod, "getBillingPeriod(...)");
        String formattedPrice = pricingPhase.getFormattedPrice();
        Intrinsics.checkNotNullExpressionValue(formattedPrice, "getFormattedPrice(...)");
        String priceCurrencyCode = pricingPhase.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
        return new PlatformPricingPhase(billingCycleCount, platformRecurrenceMode, priceAmountMicros, billingPeriod, formattedPrice, priceCurrencyCode);
    }

    public static final PlatformInstallmentPlanDetails fromInstallmentPlanDetails(ProductDetails.InstallmentPlanDetails installmentPlanDetails) {
        if (installmentPlanDetails == null) {
            return null;
        }
        return new PlatformInstallmentPlanDetails(installmentPlanDetails.getInstallmentPlanCommitmentPaymentsCount(), installmentPlanDetails.getSubsequentInstallmentPlanCommitmentPaymentsCount());
    }

    public static final PlatformRecurrenceMode toPlatformRecurrenceMode(int i) {
        if (i == 1) {
            return PlatformRecurrenceMode.INFINITE_RECURRING;
        }
        if (i == 2) {
            return PlatformRecurrenceMode.FINITE_RECURRING;
        }
        if (i == 3) {
            return PlatformRecurrenceMode.NON_RECURRING;
        }
        return PlatformRecurrenceMode.NON_RECURRING;
    }

    public static final PlatformPurchaseState toPlatformPurchaseState(int i) {
        if (i == 0) {
            return PlatformPurchaseState.UNSPECIFIED;
        }
        if (i == 1) {
            return PlatformPurchaseState.PURCHASED;
        }
        if (i == 2) {
            return PlatformPurchaseState.PENDING;
        }
        return PlatformPurchaseState.UNSPECIFIED;
    }

    public static final PlatformPurchase fromPurchase(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
        PlatformAccountIdentifiers platformAccountIdentifiers = accountIdentifiers != null ? new PlatformAccountIdentifiers(accountIdentifiers.getObfuscatedAccountId(), accountIdentifiers.getObfuscatedProfileId()) : null;
        Purchase.PendingPurchaseUpdate pendingPurchaseUpdate = purchase.getPendingPurchaseUpdate();
        PlatformPendingPurchaseUpdate platformPendingPurchaseUpdateFromPendingPurchaseUpdate = pendingPurchaseUpdate != null ? fromPendingPurchaseUpdate(pendingPurchaseUpdate) : null;
        String orderId = purchase.getOrderId();
        String packageName = purchase.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        long purchaseTime = purchase.getPurchaseTime();
        String purchaseToken = purchase.getPurchaseToken();
        Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
        String signature = purchase.getSignature();
        Intrinsics.checkNotNullExpressionValue(signature, "getSignature(...)");
        List<String> products = purchase.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        boolean zIsAutoRenewing = purchase.isAutoRenewing();
        String originalJson = purchase.getOriginalJson();
        Intrinsics.checkNotNullExpressionValue(originalJson, "getOriginalJson(...)");
        String developerPayload = purchase.getDeveloperPayload();
        Intrinsics.checkNotNullExpressionValue(developerPayload, "getDeveloperPayload(...)");
        return new PlatformPurchase(orderId, packageName, purchaseTime, purchaseToken, signature, products, zIsAutoRenewing, originalJson, developerPayload, purchase.isAcknowledged(), purchase.getQuantity(), toPlatformPurchaseState(purchase.getPurchaseState()), platformAccountIdentifiers, platformPendingPurchaseUpdateFromPendingPurchaseUpdate);
    }

    public static final PlatformPendingPurchaseUpdate fromPendingPurchaseUpdate(Purchase.PendingPurchaseUpdate pendingPurchaseUpdate) {
        if (pendingPurchaseUpdate == null) {
            return null;
        }
        List<String> products = pendingPurchaseUpdate.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        String purchaseToken = pendingPurchaseUpdate.getPurchaseToken();
        Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
        return new PlatformPendingPurchaseUpdate(products, purchaseToken);
    }

    public static final PlatformPurchaseHistoryRecord fromPurchaseHistoryRecord(PurchaseHistoryRecord purchaseHistoryRecord) {
        Intrinsics.checkNotNullParameter(purchaseHistoryRecord, "purchaseHistoryRecord");
        long quantity = purchaseHistoryRecord.getQuantity();
        long purchaseTime = purchaseHistoryRecord.getPurchaseTime();
        String developerPayload = purchaseHistoryRecord.getDeveloperPayload();
        String originalJson = purchaseHistoryRecord.getOriginalJson();
        Intrinsics.checkNotNullExpressionValue(originalJson, "getOriginalJson(...)");
        String purchaseToken = purchaseHistoryRecord.getPurchaseToken();
        Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
        String signature = purchaseHistoryRecord.getSignature();
        Intrinsics.checkNotNullExpressionValue(signature, "getSignature(...)");
        List<String> products = purchaseHistoryRecord.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        return new PlatformPurchaseHistoryRecord(quantity, purchaseTime, developerPayload, originalJson, purchaseToken, signature, products);
    }

    public static final List<PlatformPurchase> fromPurchasesList(List<? extends Purchase> list) {
        if (list != null) {
            List<? extends Purchase> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(fromPurchase((Purchase) it.next()));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    public static final List<PlatformPurchaseHistoryRecord> fromPurchaseHistoryRecordList(List<? extends PurchaseHistoryRecord> list) {
        if (list != null) {
            List<? extends PurchaseHistoryRecord> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(fromPurchaseHistoryRecord((PurchaseHistoryRecord) it.next()));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    public static final List<PlatformUnfetchedProduct> fromUnfetchedProductList(List<UnfetchedProduct> list) {
        if (list != null) {
            List<UnfetchedProduct> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(fromUnfetchedProduct((UnfetchedProduct) it.next()));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    public static final PlatformUnfetchedProduct fromUnfetchedProduct(UnfetchedProduct unfetchedProduct) {
        Intrinsics.checkNotNullParameter(unfetchedProduct, "unfetchedProduct");
        String productId = unfetchedProduct.getProductId();
        Intrinsics.checkNotNullExpressionValue(productId, "getProductId(...)");
        return new PlatformUnfetchedProduct(productId);
    }

    public static final PlatformBillingResult fromBillingResult(BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        PlatformBillingResponse platformBillingResponseFromBillingResponseCode = fromBillingResponseCode(billingResult.getResponseCode());
        String debugMessage = billingResult.getDebugMessage();
        Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
        return new PlatformBillingResult(platformBillingResponseFromBillingResponseCode, debugMessage, billingResult.getOnPurchasesUpdatedSubResponseCode());
    }

    public static final PlatformBillingResponse fromBillingResponseCode(int i) {
        if (i != 12) {
            switch (i) {
                case -2:
                    return PlatformBillingResponse.FEATURE_NOT_SUPPORTED;
                case -1:
                    return PlatformBillingResponse.SERVICE_DISCONNECTED;
                case 0:
                    return PlatformBillingResponse.OK;
                case 1:
                    return PlatformBillingResponse.USER_CANCELED;
                case 2:
                    return PlatformBillingResponse.SERVICE_UNAVAILABLE;
                case 3:
                    return PlatformBillingResponse.BILLING_UNAVAILABLE;
                case 4:
                    return PlatformBillingResponse.ITEM_UNAVAILABLE;
                case 5:
                    return PlatformBillingResponse.DEVELOPER_ERROR;
                case 6:
                    return PlatformBillingResponse.ERROR;
                case 7:
                    return PlatformBillingResponse.ITEM_ALREADY_OWNED;
                case 8:
                    return PlatformBillingResponse.ITEM_NOT_OWNED;
                default:
                    return PlatformBillingResponse.ERROR;
            }
        }
        return PlatformBillingResponse.NETWORK_ERROR;
    }

    public static final PlatformUserChoiceDetails fromUserChoiceDetails(UserChoiceDetails userChoiceDetails) {
        Intrinsics.checkNotNullParameter(userChoiceDetails, "userChoiceDetails");
        String originalExternalTransactionId = userChoiceDetails.getOriginalExternalTransactionId();
        String externalTransactionToken = userChoiceDetails.getExternalTransactionToken();
        Intrinsics.checkNotNullExpressionValue(externalTransactionToken, "getExternalTransactionToken(...)");
        List<UserChoiceDetails.Product> products = userChoiceDetails.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        return new PlatformUserChoiceDetails(originalExternalTransactionId, externalTransactionToken, fromUserChoiceProductsList(products));
    }

    public static final List<PlatformUserChoiceProduct> fromUserChoiceProductsList(List<? extends UserChoiceDetails.Product> productsList) {
        Intrinsics.checkNotNullParameter(productsList, "productsList");
        List<? extends UserChoiceDetails.Product> list = productsList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromUserChoiceProduct((UserChoiceDetails.Product) it.next()));
        }
        return arrayList;
    }

    public static final PlatformUserChoiceProduct fromUserChoiceProduct(UserChoiceDetails.Product product) {
        Intrinsics.checkNotNullParameter(product, "product");
        String id = product.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        String offerToken = product.getOfferToken();
        String type = product.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return new PlatformUserChoiceProduct(id, offerToken, toPlatformProductType(type));
    }

    public static final PlatformBillingConfigResponse fromBillingConfig(BillingResult result, BillingConfig billingConfig) {
        String countryCode;
        Intrinsics.checkNotNullParameter(result, "result");
        PlatformBillingResult platformBillingResultFromBillingResult = fromBillingResult(result);
        if (billingConfig == null || (countryCode = billingConfig.getCountryCode()) == null) {
            countryCode = "";
        }
        return new PlatformBillingConfigResponse(platformBillingResultFromBillingResult, countryCode);
    }

    public static final PlatformAlternativeBillingOnlyReportingDetailsResponse fromAlternativeBillingOnlyReportingDetails(BillingResult result, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        String externalTransactionToken;
        Intrinsics.checkNotNullParameter(result, "result");
        PlatformBillingResult platformBillingResultFromBillingResult = fromBillingResult(result);
        if (alternativeBillingOnlyReportingDetails == null || (externalTransactionToken = alternativeBillingOnlyReportingDetails.getExternalTransactionToken()) == null) {
            externalTransactionToken = "";
        }
        return new PlatformAlternativeBillingOnlyReportingDetailsResponse(platformBillingResultFromBillingResult, externalTransactionToken);
    }

    public static final PendingPurchasesParams toPendingPurchasesParams(PlatformPendingPurchasesParams platformPendingPurchasesParams) {
        PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
        Intrinsics.checkNotNullExpressionValue(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
        if (platformPendingPurchasesParams != null && platformPendingPurchasesParams.getEnablePrepaidPlans()) {
            builderEnableOneTimeProducts.enablePrepaidPlans();
        }
        PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
        Intrinsics.checkNotNullExpressionValue(pendingPurchasesParamsBuild, "build(...)");
        return pendingPurchasesParamsBuild;
    }

    public static final String toBillingClientFeature(PlatformBillingClientFeature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        switch (WhenMappings.$EnumSwitchMapping$1[feature.ordinal()]) {
            case 1:
                return BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY;
            case 2:
                return BillingClient.FeatureType.BILLING_CONFIG;
            case 3:
                return BillingClient.FeatureType.EXTERNAL_OFFER;
            case 4:
                return BillingClient.FeatureType.IN_APP_MESSAGING;
            case 5:
                return BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION;
            case 6:
                return BillingClient.FeatureType.PRODUCT_DETAILS;
            case 7:
                return BillingClient.FeatureType.SUBSCRIPTIONS;
            case 8:
                return BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int toReplacementMode(PlatformReplacementMode replacementMode) {
        Intrinsics.checkNotNullParameter(replacementMode, "replacementMode");
        switch (WhenMappings.$EnumSwitchMapping$2[replacementMode.ordinal()]) {
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                return 6;
            case 4:
                return 3;
            case 5:
                return 1;
            case 6:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final PlatformInAppMessageResult fromInAppMessageResult(InAppMessageResult inAppMessageResult) {
        Intrinsics.checkNotNullParameter(inAppMessageResult, "inAppMessageResult");
        return new PlatformInAppMessageResult(fromInAppMessageResponseCode(inAppMessageResult.getResponseCode()), inAppMessageResult.getPurchaseToken());
    }

    public static final PlatformInAppMessageResponse fromInAppMessageResponseCode(int i) {
        if (i == 0) {
            return PlatformInAppMessageResponse.NO_ACTION_NEEDED;
        }
        if (i == 1) {
            return PlatformInAppMessageResponse.SUBSCRIPTION_STATUS_UPDATED;
        }
        return PlatformInAppMessageResponse.NO_ACTION_NEEDED;
    }
}
