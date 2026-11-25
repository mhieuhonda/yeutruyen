package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tJ\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;", "", "enablePrepaidPlans", "", "<init>", "(Z)V", "getEnablePrepaidPlans", "()Z", "toList", "", "equals", "other", "hashCode", "", "component1", "copy", "toString", "", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformPendingPurchasesParams {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean enablePrepaidPlans;

    public static /* synthetic */ PlatformPendingPurchasesParams copy$default(PlatformPendingPurchasesParams platformPendingPurchasesParams, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = platformPendingPurchasesParams.enablePrepaidPlans;
        }
        return platformPendingPurchasesParams.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnablePrepaidPlans() {
        return this.enablePrepaidPlans;
    }

    public final PlatformPendingPurchasesParams copy(boolean enablePrepaidPlans) {
        return new PlatformPendingPurchasesParams(enablePrepaidPlans);
    }

    public String toString() {
        return "PlatformPendingPurchasesParams(enablePrepaidPlans=" + this.enablePrepaidPlans + ")";
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformPendingPurchasesParams fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new PlatformPendingPurchasesParams(((Boolean) obj).booleanValue());
        }
    }

    public PlatformPendingPurchasesParams(boolean z) {
        this.enablePrepaidPlans = z;
    }

    public final boolean getEnablePrepaidPlans() {
        return this.enablePrepaidPlans;
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(Boolean.valueOf(this.enablePrepaidPlans));
    }

    public boolean equals(Object other) {
        if (other == null || !Intrinsics.areEqual(other.getClass(), getClass())) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(Boolean.valueOf(this.enablePrepaidPlans), Boolean.valueOf(((PlatformPendingPurchasesParams) other).enablePrepaidPlans));
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Boolean.valueOf(this.enablePrepaidPlans));
    }
}
