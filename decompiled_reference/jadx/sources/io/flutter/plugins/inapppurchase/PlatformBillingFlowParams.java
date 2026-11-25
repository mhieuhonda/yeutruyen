package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u0096\u0080\u0004J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006'"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;", "", "product", "", "replacementMode", "Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;", "offerToken", "accountId", "obfuscatedProfileId", "oldProduct", "purchaseToken", "<init>", "(Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProduct", "()Ljava/lang/String;", "getReplacementMode", "()Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;", "getOfferToken", "getAccountId", "getObfuscatedProfileId", "getOldProduct", "getPurchaseToken", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformBillingFlowParams {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountId;
    private final String obfuscatedProfileId;
    private final String offerToken;
    private final String oldProduct;
    private final String product;
    private final String purchaseToken;
    private final PlatformReplacementMode replacementMode;

    public static /* synthetic */ PlatformBillingFlowParams copy$default(PlatformBillingFlowParams platformBillingFlowParams, String str, PlatformReplacementMode platformReplacementMode, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platformBillingFlowParams.product;
        }
        if ((i & 2) != 0) {
            platformReplacementMode = platformBillingFlowParams.replacementMode;
        }
        if ((i & 4) != 0) {
            str2 = platformBillingFlowParams.offerToken;
        }
        if ((i & 8) != 0) {
            str3 = platformBillingFlowParams.accountId;
        }
        if ((i & 16) != 0) {
            str4 = platformBillingFlowParams.obfuscatedProfileId;
        }
        if ((i & 32) != 0) {
            str5 = platformBillingFlowParams.oldProduct;
        }
        if ((i & 64) != 0) {
            str6 = platformBillingFlowParams.purchaseToken;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return platformBillingFlowParams.copy(str, platformReplacementMode, str10, str3, str9, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PlatformReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOldProduct() {
        return this.oldProduct;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PlatformBillingFlowParams copy(String product, PlatformReplacementMode replacementMode, String offerToken, String accountId, String obfuscatedProfileId, String oldProduct, String purchaseToken) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(replacementMode, "replacementMode");
        return new PlatformBillingFlowParams(product, replacementMode, offerToken, accountId, obfuscatedProfileId, oldProduct, purchaseToken);
    }

    public String toString() {
        return "PlatformBillingFlowParams(product=" + this.product + ", replacementMode=" + this.replacementMode + ", offerToken=" + this.offerToken + ", accountId=" + this.accountId + ", obfuscatedProfileId=" + this.obfuscatedProfileId + ", oldProduct=" + this.oldProduct + ", purchaseToken=" + this.purchaseToken + ")";
    }

    public PlatformBillingFlowParams(String product, PlatformReplacementMode replacementMode, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(replacementMode, "replacementMode");
        this.product = product;
        this.replacementMode = replacementMode;
        this.offerToken = str;
        this.accountId = str2;
        this.obfuscatedProfileId = str3;
        this.oldProduct = str4;
        this.purchaseToken = str5;
    }

    public /* synthetic */ PlatformBillingFlowParams(String str, PlatformReplacementMode platformReplacementMode, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, platformReplacementMode, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    public final String getProduct() {
        return this.product;
    }

    public final PlatformReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    public final String getOldProduct() {
        return this.oldProduct;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformBillingFlowParams fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformReplacementMode");
            return new PlatformBillingFlowParams(str, (PlatformReplacementMode) obj2, (String) pigeonVar_list.get(2), (String) pigeonVar_list.get(3), (String) pigeonVar_list.get(4), (String) pigeonVar_list.get(5), (String) pigeonVar_list.get(6));
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.product, this.replacementMode, this.offerToken, this.accountId, this.obfuscatedProfileId, this.oldProduct, this.purchaseToken);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformBillingFlowParams platformBillingFlowParams = (PlatformBillingFlowParams) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.product, platformBillingFlowParams.product) && MessagesPigeonUtils.INSTANCE.deepEquals(this.replacementMode, platformBillingFlowParams.replacementMode) && MessagesPigeonUtils.INSTANCE.deepEquals(this.offerToken, platformBillingFlowParams.offerToken) && MessagesPigeonUtils.INSTANCE.deepEquals(this.accountId, platformBillingFlowParams.accountId) && MessagesPigeonUtils.INSTANCE.deepEquals(this.obfuscatedProfileId, platformBillingFlowParams.obfuscatedProfileId) && MessagesPigeonUtils.INSTANCE.deepEquals(this.oldProduct, platformBillingFlowParams.oldProduct) && MessagesPigeonUtils.INSTANCE.deepEquals(this.purchaseToken, platformBillingFlowParams.purchaseToken)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.product)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.replacementMode)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.offerToken)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.accountId)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.obfuscatedProfileId)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.oldProduct)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.purchaseToken);
    }
}
