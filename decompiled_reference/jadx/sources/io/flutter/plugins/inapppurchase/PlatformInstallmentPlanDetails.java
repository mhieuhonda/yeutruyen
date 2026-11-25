package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0017"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;", "", "commitmentPaymentsCount", "", "subsequentCommitmentPaymentsCount", "<init>", "(JJ)V", "getCommitmentPaymentsCount", "()J", "getSubsequentCommitmentPaymentsCount", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformInstallmentPlanDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long commitmentPaymentsCount;
    private final long subsequentCommitmentPaymentsCount;

    public static /* synthetic */ PlatformInstallmentPlanDetails copy$default(PlatformInstallmentPlanDetails platformInstallmentPlanDetails, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = platformInstallmentPlanDetails.commitmentPaymentsCount;
        }
        if ((i & 2) != 0) {
            j2 = platformInstallmentPlanDetails.subsequentCommitmentPaymentsCount;
        }
        return platformInstallmentPlanDetails.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCommitmentPaymentsCount() {
        return this.commitmentPaymentsCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSubsequentCommitmentPaymentsCount() {
        return this.subsequentCommitmentPaymentsCount;
    }

    public final PlatformInstallmentPlanDetails copy(long commitmentPaymentsCount, long subsequentCommitmentPaymentsCount) {
        return new PlatformInstallmentPlanDetails(commitmentPaymentsCount, subsequentCommitmentPaymentsCount);
    }

    public String toString() {
        return "PlatformInstallmentPlanDetails(commitmentPaymentsCount=" + this.commitmentPaymentsCount + ", subsequentCommitmentPaymentsCount=" + this.subsequentCommitmentPaymentsCount + ")";
    }

    public PlatformInstallmentPlanDetails(long j, long j2) {
        this.commitmentPaymentsCount = j;
        this.subsequentCommitmentPaymentsCount = j2;
    }

    public final long getCommitmentPaymentsCount() {
        return this.commitmentPaymentsCount;
    }

    public final long getSubsequentCommitmentPaymentsCount() {
        return this.subsequentCommitmentPaymentsCount;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformInstallmentPlanDetails fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            return new PlatformInstallmentPlanDetails(jLongValue, ((Long) obj2).longValue());
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf((Object[]) new Long[]{Long.valueOf(this.commitmentPaymentsCount), Long.valueOf(this.subsequentCommitmentPaymentsCount)});
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformInstallmentPlanDetails platformInstallmentPlanDetails = (PlatformInstallmentPlanDetails) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(Long.valueOf(this.commitmentPaymentsCount), Long.valueOf(platformInstallmentPlanDetails.commitmentPaymentsCount)) && MessagesPigeonUtils.INSTANCE.deepEquals(Long.valueOf(this.subsequentCommitmentPaymentsCount), Long.valueOf(platformInstallmentPlanDetails.subsequentCommitmentPaymentsCount))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Long.valueOf(this.commitmentPaymentsCount))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Long.valueOf(this.subsequentCommitmentPaymentsCount));
    }
}
