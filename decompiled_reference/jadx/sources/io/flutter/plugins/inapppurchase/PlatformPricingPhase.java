package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u0096\u0080\u0004J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\n\u0010$\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006&"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPricingPhase;", "", "billingCycleCount", "", "recurrenceMode", "Lio/flutter/plugins/inapppurchase/PlatformRecurrenceMode;", "priceAmountMicros", "billingPeriod", "", "formattedPrice", "priceCurrencyCode", "<init>", "(JLio/flutter/plugins/inapppurchase/PlatformRecurrenceMode;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBillingCycleCount", "()J", "getRecurrenceMode", "()Lio/flutter/plugins/inapppurchase/PlatformRecurrenceMode;", "getPriceAmountMicros", "getBillingPeriod", "()Ljava/lang/String;", "getFormattedPrice", "getPriceCurrencyCode", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformPricingPhase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long billingCycleCount;
    private final String billingPeriod;
    private final String formattedPrice;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;
    private final PlatformRecurrenceMode recurrenceMode;

    public static /* synthetic */ PlatformPricingPhase copy$default(PlatformPricingPhase platformPricingPhase, long j, PlatformRecurrenceMode platformRecurrenceMode, long j2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = platformPricingPhase.billingCycleCount;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            platformRecurrenceMode = platformPricingPhase.recurrenceMode;
        }
        PlatformRecurrenceMode platformRecurrenceMode2 = platformRecurrenceMode;
        if ((i & 4) != 0) {
            j2 = platformPricingPhase.priceAmountMicros;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            str = platformPricingPhase.billingPeriod;
        }
        return platformPricingPhase.copy(j3, platformRecurrenceMode2, j4, str, (i & 16) != 0 ? platformPricingPhase.formattedPrice : str2, (i & 32) != 0 ? platformPricingPhase.priceCurrencyCode : str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBillingCycleCount() {
        return this.billingCycleCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PlatformRecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final PlatformPricingPhase copy(long billingCycleCount, PlatformRecurrenceMode recurrenceMode, long priceAmountMicros, String billingPeriod, String formattedPrice, String priceCurrencyCode) {
        Intrinsics.checkNotNullParameter(recurrenceMode, "recurrenceMode");
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        return new PlatformPricingPhase(billingCycleCount, recurrenceMode, priceAmountMicros, billingPeriod, formattedPrice, priceCurrencyCode);
    }

    public String toString() {
        return "PlatformPricingPhase(billingCycleCount=" + this.billingCycleCount + ", recurrenceMode=" + this.recurrenceMode + ", priceAmountMicros=" + this.priceAmountMicros + ", billingPeriod=" + this.billingPeriod + ", formattedPrice=" + this.formattedPrice + ", priceCurrencyCode=" + this.priceCurrencyCode + ")";
    }

    public PlatformPricingPhase(long j, PlatformRecurrenceMode recurrenceMode, long j2, String billingPeriod, String formattedPrice, String priceCurrencyCode) {
        Intrinsics.checkNotNullParameter(recurrenceMode, "recurrenceMode");
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.billingCycleCount = j;
        this.recurrenceMode = recurrenceMode;
        this.priceAmountMicros = j2;
        this.billingPeriod = billingPeriod;
        this.formattedPrice = formattedPrice;
        this.priceCurrencyCode = priceCurrencyCode;
    }

    public final long getBillingCycleCount() {
        return this.billingCycleCount;
    }

    public final PlatformRecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPricingPhase$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformPricingPhase;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformPricingPhase fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformRecurrenceMode");
            PlatformRecurrenceMode platformRecurrenceMode = (PlatformRecurrenceMode) obj2;
            Object obj3 = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue2 = ((Long) obj3).longValue();
            Object obj4 = pigeonVar_list.get(3);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj4;
            Object obj5 = pigeonVar_list.get(4);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
            Object obj6 = pigeonVar_list.get(5);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.String");
            return new PlatformPricingPhase(jLongValue, platformRecurrenceMode, jLongValue2, str, (String) obj5, (String) obj6);
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(Long.valueOf(this.billingCycleCount), this.recurrenceMode, Long.valueOf(this.priceAmountMicros), this.billingPeriod, this.formattedPrice, this.priceCurrencyCode);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformPricingPhase platformPricingPhase = (PlatformPricingPhase) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(Long.valueOf(this.billingCycleCount), Long.valueOf(platformPricingPhase.billingCycleCount)) && MessagesPigeonUtils.INSTANCE.deepEquals(this.recurrenceMode, platformPricingPhase.recurrenceMode) && MessagesPigeonUtils.INSTANCE.deepEquals(Long.valueOf(this.priceAmountMicros), Long.valueOf(platformPricingPhase.priceAmountMicros)) && MessagesPigeonUtils.INSTANCE.deepEquals(this.billingPeriod, platformPricingPhase.billingPeriod) && MessagesPigeonUtils.INSTANCE.deepEquals(this.formattedPrice, platformPricingPhase.formattedPrice) && MessagesPigeonUtils.INSTANCE.deepEquals(this.priceCurrencyCode, platformPricingPhase.priceCurrencyCode)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Long.valueOf(this.billingCycleCount))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.recurrenceMode)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Long.valueOf(this.priceAmountMicros))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.billingPeriod)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.formattedPrice)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.priceCurrencyCode);
    }
}
