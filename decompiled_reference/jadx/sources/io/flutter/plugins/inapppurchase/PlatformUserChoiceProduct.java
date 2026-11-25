package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;", "", "id", "", "offerToken", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lio/flutter/plugins/inapppurchase/PlatformProductType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformProductType;)V", "getId", "()Ljava/lang/String;", "getOfferToken", "getType", "()Lio/flutter/plugins/inapppurchase/PlatformProductType;", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformUserChoiceProduct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private final String offerToken;
    private final PlatformProductType type;

    public static /* synthetic */ PlatformUserChoiceProduct copy$default(PlatformUserChoiceProduct platformUserChoiceProduct, String str, String str2, PlatformProductType platformProductType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platformUserChoiceProduct.id;
        }
        if ((i & 2) != 0) {
            str2 = platformUserChoiceProduct.offerToken;
        }
        if ((i & 4) != 0) {
            platformProductType = platformUserChoiceProduct.type;
        }
        return platformUserChoiceProduct.copy(str, str2, platformProductType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PlatformProductType getType() {
        return this.type;
    }

    public final PlatformUserChoiceProduct copy(String id, String offerToken, PlatformProductType type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new PlatformUserChoiceProduct(id, offerToken, type);
    }

    public String toString() {
        return "PlatformUserChoiceProduct(id=" + this.id + ", offerToken=" + this.offerToken + ", type=" + this.type + ")";
    }

    public PlatformUserChoiceProduct(String id, String str, PlatformProductType type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.offerToken = str;
        this.type = type;
    }

    public /* synthetic */ PlatformUserChoiceProduct(String str, String str2, PlatformProductType platformProductType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, platformProductType);
    }

    public final String getId() {
        return this.id;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final PlatformProductType getType() {
        return this.type;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformUserChoiceProduct fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) pigeonVar_list.get(1);
            Object obj2 = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
            return new PlatformUserChoiceProduct((String) obj, str, (PlatformProductType) obj2);
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.id, this.offerToken, this.type);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformUserChoiceProduct platformUserChoiceProduct = (PlatformUserChoiceProduct) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.id, platformUserChoiceProduct.id) && MessagesPigeonUtils.INSTANCE.deepEquals(this.offerToken, platformUserChoiceProduct.offerToken) && MessagesPigeonUtils.INSTANCE.deepEquals(this.type, platformUserChoiceProduct.type)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.id)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.offerToken)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.type);
    }
}
