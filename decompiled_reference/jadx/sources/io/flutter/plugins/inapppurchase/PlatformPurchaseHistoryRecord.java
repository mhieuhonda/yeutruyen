package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u001c\u001a\u00020\u001dH\u0096\u0080\u0004J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0003JW\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0001J\n\u0010&\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;", "", "quantity", "", "purchaseTime", "developerPayload", "", "originalJson", "purchaseToken", "signature", "products", "", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getQuantity", "()J", "getPurchaseTime", "getDeveloperPayload", "()Ljava/lang/String;", "getOriginalJson", "getPurchaseToken", "getSignature", "getProducts", "()Ljava/util/List;", "toList", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformPurchaseHistoryRecord {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String developerPayload;
    private final String originalJson;
    private final List<String> products;
    private final long purchaseTime;
    private final String purchaseToken;
    private final long quantity;
    private final String signature;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformPurchaseHistoryRecord copy$default(PlatformPurchaseHistoryRecord platformPurchaseHistoryRecord, long j, long j2, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = platformPurchaseHistoryRecord.quantity;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = platformPurchaseHistoryRecord.purchaseTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = platformPurchaseHistoryRecord.developerPayload;
        }
        return platformPurchaseHistoryRecord.copy(j3, j4, str, (i & 8) != 0 ? platformPurchaseHistoryRecord.originalJson : str2, (i & 16) != 0 ? platformPurchaseHistoryRecord.purchaseToken : str3, (i & 32) != 0 ? platformPurchaseHistoryRecord.signature : str4, (i & 64) != 0 ? platformPurchaseHistoryRecord.products : list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOriginalJson() {
        return this.originalJson;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final List<String> component7() {
        return this.products;
    }

    public final PlatformPurchaseHistoryRecord copy(long quantity, long purchaseTime, String developerPayload, String originalJson, String purchaseToken, String signature, List<String> products) {
        Intrinsics.checkNotNullParameter(originalJson, "originalJson");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(products, "products");
        return new PlatformPurchaseHistoryRecord(quantity, purchaseTime, developerPayload, originalJson, purchaseToken, signature, products);
    }

    public String toString() {
        return "PlatformPurchaseHistoryRecord(quantity=" + this.quantity + ", purchaseTime=" + this.purchaseTime + ", developerPayload=" + this.developerPayload + ", originalJson=" + this.originalJson + ", purchaseToken=" + this.purchaseToken + ", signature=" + this.signature + ", products=" + this.products + ")";
    }

    public PlatformPurchaseHistoryRecord(long j, long j2, String str, String originalJson, String purchaseToken, String signature, List<String> products) {
        Intrinsics.checkNotNullParameter(originalJson, "originalJson");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(products, "products");
        this.quantity = j;
        this.purchaseTime = j2;
        this.developerPayload = str;
        this.originalJson = originalJson;
        this.purchaseToken = purchaseToken;
        this.signature = signature;
        this.products = products;
    }

    public /* synthetic */ PlatformPurchaseHistoryRecord(long j, long j2, String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? null : str, str2, str3, str4, list);
    }

    public final long getQuantity() {
        return this.quantity;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final String getOriginalJson() {
        return this.originalJson;
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

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformPurchaseHistoryRecord fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue2 = ((Long) obj2).longValue();
            String str = (String) pigeonVar_list.get(2);
            Object obj3 = pigeonVar_list.get(3);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = pigeonVar_list.get(4);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj4;
            Object obj5 = pigeonVar_list.get(5);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
            Object obj6 = pigeonVar_list.get(6);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new PlatformPurchaseHistoryRecord(jLongValue, jLongValue2, str, str2, str3, (String) obj5, (List) obj6);
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(Long.valueOf(this.quantity), Long.valueOf(this.purchaseTime), this.developerPayload, this.originalJson, this.purchaseToken, this.signature, this.products);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformPurchaseHistoryRecord platformPurchaseHistoryRecord = (PlatformPurchaseHistoryRecord) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(Long.valueOf(this.quantity), Long.valueOf(platformPurchaseHistoryRecord.quantity)) && MessagesPigeonUtils.INSTANCE.deepEquals(Long.valueOf(this.purchaseTime), Long.valueOf(platformPurchaseHistoryRecord.purchaseTime)) && MessagesPigeonUtils.INSTANCE.deepEquals(this.developerPayload, platformPurchaseHistoryRecord.developerPayload) && MessagesPigeonUtils.INSTANCE.deepEquals(this.originalJson, platformPurchaseHistoryRecord.originalJson) && MessagesPigeonUtils.INSTANCE.deepEquals(this.purchaseToken, platformPurchaseHistoryRecord.purchaseToken) && MessagesPigeonUtils.INSTANCE.deepEquals(this.signature, platformPurchaseHistoryRecord.signature) && MessagesPigeonUtils.INSTANCE.deepEquals(this.products, platformPurchaseHistoryRecord.products)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Long.valueOf(this.quantity))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Long.valueOf(this.purchaseTime))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.developerPayload)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.originalJson)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.purchaseToken)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.signature)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.products);
    }
}
