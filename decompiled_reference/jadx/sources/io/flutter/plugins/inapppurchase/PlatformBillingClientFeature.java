package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;", "", "raw", "", "<init>", "(Ljava/lang/String;II)V", "getRaw", "()I", "ALTERNATIVE_BILLING_ONLY", "BILLING_CONFIG", "EXTERNAL_OFFER", "IN_APP_MESSAGING", "PRICE_CHANGE_CONFIRMATION", "PRODUCT_DETAILS", "SUBSCRIPTIONS", "SUBSCRIPTIONS_UPDATE", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum PlatformBillingClientFeature {
    ALTERNATIVE_BILLING_ONLY(0),
    BILLING_CONFIG(1),
    EXTERNAL_OFFER(2),
    IN_APP_MESSAGING(3),
    PRICE_CHANGE_CONFIRMATION(4),
    PRODUCT_DETAILS(5),
    SUBSCRIPTIONS(6),
    SUBSCRIPTIONS_UPDATE(7);

    private final int raw;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<PlatformBillingClientFeature> getEntries() {
        return $ENTRIES;
    }

    PlatformBillingClientFeature(int i) {
        this.raw = i;
    }

    public final int getRaw() {
        return this.raw;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature$Companion;", "", "<init>", "()V", "ofRaw", "Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;", "raw", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformBillingClientFeature ofRaw(int raw) {
            for (PlatformBillingClientFeature platformBillingClientFeature : PlatformBillingClientFeature.values()) {
                if (platformBillingClientFeature.getRaw() == raw) {
                    return platformBillingClientFeature;
                }
            }
            return null;
        }
    }
}
