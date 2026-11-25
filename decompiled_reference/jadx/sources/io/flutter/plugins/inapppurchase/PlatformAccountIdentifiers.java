package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers;", "", "obfuscatedAccountId", "", "obfuscatedProfileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getObfuscatedAccountId", "()Ljava/lang/String;", "getObfuscatedProfileId", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlatformAccountIdentifiers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String obfuscatedAccountId;
    private final String obfuscatedProfileId;

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformAccountIdentifiers() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PlatformAccountIdentifiers copy$default(PlatformAccountIdentifiers platformAccountIdentifiers, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platformAccountIdentifiers.obfuscatedAccountId;
        }
        if ((i & 2) != 0) {
            str2 = platformAccountIdentifiers.obfuscatedProfileId;
        }
        return platformAccountIdentifiers.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getObfuscatedAccountId() {
        return this.obfuscatedAccountId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    public final PlatformAccountIdentifiers copy(String obfuscatedAccountId, String obfuscatedProfileId) {
        return new PlatformAccountIdentifiers(obfuscatedAccountId, obfuscatedProfileId);
    }

    public String toString() {
        return "PlatformAccountIdentifiers(obfuscatedAccountId=" + this.obfuscatedAccountId + ", obfuscatedProfileId=" + this.obfuscatedProfileId + ")";
    }

    public PlatformAccountIdentifiers(String str, String str2) {
        this.obfuscatedAccountId = str;
        this.obfuscatedProfileId = str2;
    }

    public /* synthetic */ PlatformAccountIdentifiers(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final String getObfuscatedAccountId() {
        return this.obfuscatedAccountId;
    }

    public final String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers;", "pigeonVar_list", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformAccountIdentifiers fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            return new PlatformAccountIdentifiers((String) pigeonVar_list.get(0), (String) pigeonVar_list.get(1));
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf((Object[]) new String[]{this.obfuscatedAccountId, this.obfuscatedProfileId});
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            PlatformAccountIdentifiers platformAccountIdentifiers = (PlatformAccountIdentifiers) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.obfuscatedAccountId, platformAccountIdentifiers.obfuscatedAccountId) && MessagesPigeonUtils.INSTANCE.deepEquals(this.obfuscatedProfileId, platformAccountIdentifiers.obfuscatedProfileId)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.obfuscatedAccountId)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.obfuscatedProfileId);
    }
}
