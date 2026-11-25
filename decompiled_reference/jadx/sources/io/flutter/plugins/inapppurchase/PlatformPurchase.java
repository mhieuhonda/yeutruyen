package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 A2\u00020\u0001:\u0001AB\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nJ\u0014\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010/\u001a\u000200H\u0096\u0080\u0004J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0012HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0016HÆ\u0003J¡\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\n\u0010@\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\"R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006B"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPurchase;", "", "orderId", "", "packageName", "purchaseTime", "", "purchaseToken", "signature", "products", "", "isAutoRenewing", "", "originalJson", "developerPayload", "isAcknowledged", "quantity", "purchaseState", "Lio/flutter/plugins/inapppurchase/PlatformPurchaseState;", "accountIdentifiers", "Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers;", "pendingPurchaseUpdate", "Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZJLio/flutter/plugins/inapppurchase/PlatformPurchaseState;Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers;Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate;)V", "getOrderId", "()Ljava/lang/String;", "getPackageName", "getPurchaseTime", "()J", "getPurchaseToken", "getSignature", "getProducts", "()Ljava/util/List;", "()Z", "getOriginalJson", "getDeveloperPayload", "getQuantity", "getPurchaseState", "()Lio/flutter/plugins/inapppurchase/PlatformPurchaseState;", "getAccountIdentifiers", "()Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers;", "getPendingPurchaseUpdate", "()Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate;", "toList", "equals", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformPurchase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PlatformAccountIdentifiers accountIdentifiers;
    private final String developerPayload;
    private final boolean isAcknowledged;
    private final boolean isAutoRenewing;
    private final String orderId;
    private final String originalJson;
    private final String packageName;
    private final PlatformPendingPurchaseUpdate pendingPurchaseUpdate;
    private final List<String> products;
    private final PlatformPurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final long quantity;
    private final String signature;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformPurchase copy$default(PlatformPurchase platformPurchase, String str, String str2, long j, String str3, String str4, List list, boolean z, String str5, String str6, boolean z2, long j2, PlatformPurchaseState platformPurchaseState, PlatformAccountIdentifiers platformAccountIdentifiers, PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate, int i, Object obj) {
        String str7 = (i & 1) != 0 ? platformPurchase.orderId : str;
        return platformPurchase.copy(str7, (i & 2) != 0 ? platformPurchase.packageName : str2, (i & 4) != 0 ? platformPurchase.purchaseTime : j, (i & 8) != 0 ? platformPurchase.purchaseToken : str3, (i & 16) != 0 ? platformPurchase.signature : str4, (i & 32) != 0 ? platformPurchase.products : list, (i & 64) != 0 ? platformPurchase.isAutoRenewing : z, (i & 128) != 0 ? platformPurchase.originalJson : str5, (i & 256) != 0 ? platformPurchase.developerPayload : str6, (i & 512) != 0 ? platformPurchase.isAcknowledged : z2, (i & 1024) != 0 ? platformPurchase.quantity : j2, (i & 2048) != 0 ? platformPurchase.purchaseState : platformPurchaseState, (i & 4096) != 0 ? platformPurchase.accountIdentifiers : platformAccountIdentifiers, (i & 8192) != 0 ? platformPurchase.pendingPurchaseUpdate : platformPendingPurchaseUpdate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsAcknowledged() {
        return this.isAcknowledged;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final PlatformPurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final PlatformAccountIdentifiers getAccountIdentifiers() {
        return this.accountIdentifiers;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final PlatformPendingPurchaseUpdate getPendingPurchaseUpdate() {
        return this.pendingPurchaseUpdate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final List<String> component6() {
        return this.products;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOriginalJson() {
        return this.originalJson;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final PlatformPurchase copy(String orderId, String packageName, long purchaseTime, String purchaseToken, String signature, List<String> products, boolean isAutoRenewing, String originalJson, String developerPayload, boolean isAcknowledged, long quantity, PlatformPurchaseState purchaseState, PlatformAccountIdentifiers accountIdentifiers, PlatformPendingPurchaseUpdate pendingPurchaseUpdate) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(originalJson, "originalJson");
        Intrinsics.checkNotNullParameter(developerPayload, "developerPayload");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        return new PlatformPurchase(orderId, packageName, purchaseTime, purchaseToken, signature, products, isAutoRenewing, originalJson, developerPayload, isAcknowledged, quantity, purchaseState, accountIdentifiers, pendingPurchaseUpdate);
    }

    public String toString() {
        return "PlatformPurchase(orderId=" + this.orderId + ", packageName=" + this.packageName + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ", signature=" + this.signature + ", products=" + this.products + ", isAutoRenewing=" + this.isAutoRenewing + ", originalJson=" + this.originalJson + ", developerPayload=" + this.developerPayload + ", isAcknowledged=" + this.isAcknowledged + ", quantity=" + this.quantity + ", purchaseState=" + this.purchaseState + ", accountIdentifiers=" + this.accountIdentifiers + ", pendingPurchaseUpdate=" + this.pendingPurchaseUpdate + ")";
    }

    public PlatformPurchase(String str, String packageName, long j, String purchaseToken, String signature, List<String> products, boolean z, String originalJson, String developerPayload, boolean z2, long j2, PlatformPurchaseState purchaseState, PlatformAccountIdentifiers platformAccountIdentifiers, PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(originalJson, "originalJson");
        Intrinsics.checkNotNullParameter(developerPayload, "developerPayload");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        this.orderId = str;
        this.packageName = packageName;
        this.purchaseTime = j;
        this.purchaseToken = purchaseToken;
        this.signature = signature;
        this.products = products;
        this.isAutoRenewing = z;
        this.originalJson = originalJson;
        this.developerPayload = developerPayload;
        this.isAcknowledged = z2;
        this.quantity = j2;
        this.purchaseState = purchaseState;
        this.accountIdentifiers = platformAccountIdentifiers;
        this.pendingPurchaseUpdate = platformPendingPurchaseUpdate;
    }

    public /* synthetic */ PlatformPurchase(String str, String str2, long j, String str3, String str4, List list, boolean z, String str5, String str6, boolean z2, long j2, PlatformPurchaseState platformPurchaseState, PlatformAccountIdentifiers platformAccountIdentifiers, PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, j, str3, str4, list, z, str5, str6, z2, j2, platformPurchaseState, (i & 4096) != 0 ? null : platformAccountIdentifiers, (i & 8192) != 0 ? null : platformPendingPurchaseUpdate);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final List<String> getProducts() {
        return this.products;
    }

    public final boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final String getOriginalJson() {
        return this.originalJson;
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final boolean isAcknowledged() {
        return this.isAcknowledged;
    }

    public final long getQuantity() {
        return this.quantity;
    }

    public final PlatformPurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final PlatformAccountIdentifiers getAccountIdentifiers() {
        return this.accountIdentifiers;
    }

    public final PlatformPendingPurchaseUpdate getPendingPurchaseUpdate() {
        return this.pendingPurchaseUpdate;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPurchase$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformPurchase;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformPurchase fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            String str = (String) pigeonVar_list.get(0);
            Object obj = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            Object obj2 = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj2).longValue();
            Object obj3 = pigeonVar_list.get(3);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = pigeonVar_list.get(4);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
            Object obj5 = pigeonVar_list.get(5);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            Object obj6 = pigeonVar_list.get(6);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj6).booleanValue();
            Object obj7 = pigeonVar_list.get(7);
            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.String");
            Object obj8 = pigeonVar_list.get(8);
            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.String");
            Object obj9 = pigeonVar_list.get(9);
            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
            Object obj10 = pigeonVar_list.get(10);
            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue2 = ((Long) obj10).longValue();
            Object obj11 = pigeonVar_list.get(11);
            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPurchaseState");
            return new PlatformPurchase(str, str2, jLongValue, (String) obj3, (String) obj4, (List) obj5, zBooleanValue, (String) obj7, (String) obj8, zBooleanValue2, jLongValue2, (PlatformPurchaseState) obj11, (PlatformAccountIdentifiers) pigeonVar_list.get(12), (PlatformPendingPurchaseUpdate) pigeonVar_list.get(13));
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.orderId, this.packageName, Long.valueOf(this.purchaseTime), this.purchaseToken, this.signature, this.products, Boolean.valueOf(this.isAutoRenewing), this.originalJson, this.developerPayload, Boolean.valueOf(this.isAcknowledged), Long.valueOf(this.quantity), this.purchaseState, this.accountIdentifiers, this.pendingPurchaseUpdate);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformPurchase platformPurchase = (PlatformPurchase) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.orderId, platformPurchase.orderId) && MessagesPigeonUtils.INSTANCE.deepEquals(this.packageName, platformPurchase.packageName) && MessagesPigeonUtils.INSTANCE.deepEquals(Long.valueOf(this.purchaseTime), Long.valueOf(platformPurchase.purchaseTime)) && MessagesPigeonUtils.INSTANCE.deepEquals(this.purchaseToken, platformPurchase.purchaseToken) && MessagesPigeonUtils.INSTANCE.deepEquals(this.signature, platformPurchase.signature) && MessagesPigeonUtils.INSTANCE.deepEquals(this.products, platformPurchase.products) && MessagesPigeonUtils.INSTANCE.deepEquals(Boolean.valueOf(this.isAutoRenewing), Boolean.valueOf(platformPurchase.isAutoRenewing)) && MessagesPigeonUtils.INSTANCE.deepEquals(this.originalJson, platformPurchase.originalJson) && MessagesPigeonUtils.INSTANCE.deepEquals(this.developerPayload, platformPurchase.developerPayload) && MessagesPigeonUtils.INSTANCE.deepEquals(Boolean.valueOf(this.isAcknowledged), Boolean.valueOf(platformPurchase.isAcknowledged)) && MessagesPigeonUtils.INSTANCE.deepEquals(Long.valueOf(this.quantity), Long.valueOf(platformPurchase.quantity)) && MessagesPigeonUtils.INSTANCE.deepEquals(this.purchaseState, platformPurchase.purchaseState) && MessagesPigeonUtils.INSTANCE.deepEquals(this.accountIdentifiers, platformPurchase.accountIdentifiers) && MessagesPigeonUtils.INSTANCE.deepEquals(this.pendingPurchaseUpdate, platformPurchase.pendingPurchaseUpdate)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.orderId)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.packageName)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Long.valueOf(this.purchaseTime))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.purchaseToken)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.signature)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.products)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Boolean.valueOf(this.isAutoRenewing))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.originalJson)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.developerPayload)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Boolean.valueOf(this.isAcknowledged))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Long.valueOf(this.quantity))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.purchaseState)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.accountIdentifiers)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.pendingPurchaseUpdate);
    }
}
