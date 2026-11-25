package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails;", "", "priceAmountMicros", "", "formattedPrice", "", "priceCurrencyCode", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getPriceAmountMicros", "()J", "getFormattedPrice", "()Ljava/lang/String;", "getPriceCurrencyCode", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformOneTimePurchaseOfferDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String formattedPrice;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;

    public static /* synthetic */ PlatformOneTimePurchaseOfferDetails copy$default(PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = platformOneTimePurchaseOfferDetails.priceAmountMicros;
        }
        if ((i & 2) != 0) {
            str = platformOneTimePurchaseOfferDetails.formattedPrice;
        }
        if ((i & 4) != 0) {
            str2 = platformOneTimePurchaseOfferDetails.priceCurrencyCode;
        }
        return platformOneTimePurchaseOfferDetails.copy(j, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final PlatformOneTimePurchaseOfferDetails copy(long priceAmountMicros, String formattedPrice, String priceCurrencyCode) {
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        return new PlatformOneTimePurchaseOfferDetails(priceAmountMicros, formattedPrice, priceCurrencyCode);
    }

    public String toString() {
        return "PlatformOneTimePurchaseOfferDetails(priceAmountMicros=" + this.priceAmountMicros + ", formattedPrice=" + this.formattedPrice + ", priceCurrencyCode=" + this.priceCurrencyCode + ")";
    }

    public PlatformOneTimePurchaseOfferDetails(long j, String formattedPrice, String priceCurrencyCode) {
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.priceAmountMicros = j;
        this.formattedPrice = formattedPrice;
        this.priceCurrencyCode = priceCurrencyCode;
    }

    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformOneTimePurchaseOfferDetails fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            return new PlatformOneTimePurchaseOfferDetails(jLongValue, (String) obj2, (String) obj3);
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(Long.valueOf(this.priceAmountMicros), this.formattedPrice, this.priceCurrencyCode);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails = (PlatformOneTimePurchaseOfferDetails) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(Long.valueOf(this.priceAmountMicros), Long.valueOf(platformOneTimePurchaseOfferDetails.priceAmountMicros)) && MessagesPigeonUtils.INSTANCE.deepEquals(this.formattedPrice, platformOneTimePurchaseOfferDetails.formattedPrice) && MessagesPigeonUtils.INSTANCE.deepEquals(this.priceCurrencyCode, platformOneTimePurchaseOfferDetails.priceCurrencyCode)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Long.valueOf(this.priceAmountMicros))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.formattedPrice)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.priceCurrencyCode);
    }
}
