package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "<init>", "()V", "readValueOfType", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "buffer", "Ljava/nio/ByteBuffer;", "writeValue", "", "stream", "Ljava/io/ByteArrayOutputStream;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
class MessagesPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (type == -127) {
            Long l = (Long) readValue(buffer);
            if (l != null) {
                return PlatformBillingResponse.INSTANCE.ofRaw((int) l.longValue());
            }
            return null;
        }
        if (type == -126) {
            Long l2 = (Long) readValue(buffer);
            if (l2 != null) {
                return PlatformInAppMessageResponse.INSTANCE.ofRaw((int) l2.longValue());
            }
            return null;
        }
        if (type == -125) {
            Long l3 = (Long) readValue(buffer);
            if (l3 != null) {
                return PlatformReplacementMode.INSTANCE.ofRaw((int) l3.longValue());
            }
            return null;
        }
        if (type == -124) {
            Long l4 = (Long) readValue(buffer);
            if (l4 != null) {
                return PlatformProductType.INSTANCE.ofRaw((int) l4.longValue());
            }
            return null;
        }
        if (type == -123) {
            Long l5 = (Long) readValue(buffer);
            if (l5 != null) {
                return PlatformBillingChoiceMode.INSTANCE.ofRaw((int) l5.longValue());
            }
            return null;
        }
        if (type == -122) {
            Long l6 = (Long) readValue(buffer);
            if (l6 != null) {
                return PlatformBillingClientFeature.INSTANCE.ofRaw((int) l6.longValue());
            }
            return null;
        }
        if (type == -121) {
            Long l7 = (Long) readValue(buffer);
            if (l7 != null) {
                return PlatformPurchaseState.INSTANCE.ofRaw((int) l7.longValue());
            }
            return null;
        }
        if (type == -120) {
            Long l8 = (Long) readValue(buffer);
            if (l8 != null) {
                return PlatformRecurrenceMode.INSTANCE.ofRaw((int) l8.longValue());
            }
            return null;
        }
        if (type == -119) {
            Object value = readValue(buffer);
            List<? extends Object> list = value instanceof List ? (List) value : null;
            if (list != null) {
                return PlatformQueryProduct.INSTANCE.fromList(list);
            }
            return null;
        }
        if (type == -118) {
            Object value2 = readValue(buffer);
            List<? extends Object> list2 = value2 instanceof List ? (List) value2 : null;
            if (list2 != null) {
                return PlatformAccountIdentifiers.INSTANCE.fromList(list2);
            }
            return null;
        }
        if (type == -117) {
            Object value3 = readValue(buffer);
            List<? extends Object> list3 = value3 instanceof List ? (List) value3 : null;
            if (list3 != null) {
                return PlatformBillingResult.INSTANCE.fromList(list3);
            }
            return null;
        }
        if (type == -116) {
            Object value4 = readValue(buffer);
            List<? extends Object> list4 = value4 instanceof List ? (List) value4 : null;
            if (list4 != null) {
                return PlatformOneTimePurchaseOfferDetails.INSTANCE.fromList(list4);
            }
            return null;
        }
        if (type == -115) {
            Object value5 = readValue(buffer);
            List<? extends Object> list5 = value5 instanceof List ? (List) value5 : null;
            if (list5 != null) {
                return PlatformProductDetails.INSTANCE.fromList(list5);
            }
            return null;
        }
        if (type == -114) {
            Object value6 = readValue(buffer);
            List<? extends Object> list6 = value6 instanceof List ? (List) value6 : null;
            if (list6 != null) {
                return PlatformProductDetailsResponse.INSTANCE.fromList(list6);
            }
            return null;
        }
        if (type == -113) {
            Object value7 = readValue(buffer);
            List<? extends Object> list7 = value7 instanceof List ? (List) value7 : null;
            if (list7 != null) {
                return PlatformAlternativeBillingOnlyReportingDetailsResponse.INSTANCE.fromList(list7);
            }
            return null;
        }
        if (type == -112) {
            Object value8 = readValue(buffer);
            List<? extends Object> list8 = value8 instanceof List ? (List) value8 : null;
            if (list8 != null) {
                return PlatformInAppMessageResult.INSTANCE.fromList(list8);
            }
            return null;
        }
        if (type == -111) {
            Object value9 = readValue(buffer);
            List<? extends Object> list9 = value9 instanceof List ? (List) value9 : null;
            if (list9 != null) {
                return PlatformBillingConfigResponse.INSTANCE.fromList(list9);
            }
            return null;
        }
        if (type == -110) {
            Object value10 = readValue(buffer);
            List<? extends Object> list10 = value10 instanceof List ? (List) value10 : null;
            if (list10 != null) {
                return PlatformBillingFlowParams.INSTANCE.fromList(list10);
            }
            return null;
        }
        if (type == -109) {
            Object value11 = readValue(buffer);
            List<? extends Object> list11 = value11 instanceof List ? (List) value11 : null;
            if (list11 != null) {
                return PlatformPricingPhase.INSTANCE.fromList(list11);
            }
            return null;
        }
        if (type == -108) {
            Object value12 = readValue(buffer);
            List<? extends Object> list12 = value12 instanceof List ? (List) value12 : null;
            if (list12 != null) {
                return PlatformPurchase.INSTANCE.fromList(list12);
            }
            return null;
        }
        if (type == -107) {
            Object value13 = readValue(buffer);
            List<? extends Object> list13 = value13 instanceof List ? (List) value13 : null;
            if (list13 != null) {
                return PlatformPendingPurchaseUpdate.INSTANCE.fromList(list13);
            }
            return null;
        }
        if (type == -106) {
            Object value14 = readValue(buffer);
            List<? extends Object> list14 = value14 instanceof List ? (List) value14 : null;
            if (list14 != null) {
                return PlatformPurchaseHistoryRecord.INSTANCE.fromList(list14);
            }
            return null;
        }
        if (type == -105) {
            Object value15 = readValue(buffer);
            List<? extends Object> list15 = value15 instanceof List ? (List) value15 : null;
            if (list15 != null) {
                return PlatformPurchaseHistoryResponse.INSTANCE.fromList(list15);
            }
            return null;
        }
        if (type == -104) {
            Object value16 = readValue(buffer);
            List<? extends Object> list16 = value16 instanceof List ? (List) value16 : null;
            if (list16 != null) {
                return PlatformPurchasesResponse.INSTANCE.fromList(list16);
            }
            return null;
        }
        if (type == -103) {
            Object value17 = readValue(buffer);
            List<? extends Object> list17 = value17 instanceof List ? (List) value17 : null;
            if (list17 != null) {
                return PlatformSubscriptionOfferDetails.INSTANCE.fromList(list17);
            }
            return null;
        }
        if (type == -102) {
            Object value18 = readValue(buffer);
            List<? extends Object> list18 = value18 instanceof List ? (List) value18 : null;
            if (list18 != null) {
                return PlatformUserChoiceDetails.INSTANCE.fromList(list18);
            }
            return null;
        }
        if (type == -101) {
            Object value19 = readValue(buffer);
            List<? extends Object> list19 = value19 instanceof List ? (List) value19 : null;
            if (list19 != null) {
                return PlatformUserChoiceProduct.INSTANCE.fromList(list19);
            }
            return null;
        }
        if (type == -100) {
            Object value20 = readValue(buffer);
            List<? extends Object> list20 = value20 instanceof List ? (List) value20 : null;
            if (list20 != null) {
                return PlatformInstallmentPlanDetails.INSTANCE.fromList(list20);
            }
            return null;
        }
        if (type == -99) {
            Object value21 = readValue(buffer);
            List<? extends Object> list21 = value21 instanceof List ? (List) value21 : null;
            if (list21 != null) {
                return PlatformPendingPurchasesParams.INSTANCE.fromList(list21);
            }
            return null;
        }
        if (type == -98) {
            Object value22 = readValue(buffer);
            List<? extends Object> list22 = value22 instanceof List ? (List) value22 : null;
            if (list22 != null) {
                return PlatformUnfetchedProduct.INSTANCE.fromList(list22);
            }
            return null;
        }
        return super.readValueOfType(type, buffer);
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    protected void writeValue(ByteArrayOutputStream stream, Object value) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (value instanceof PlatformBillingResponse) {
            stream.write(129);
            writeValue(stream, Long.valueOf(((PlatformBillingResponse) value).getRaw()));
            return;
        }
        if (value instanceof PlatformInAppMessageResponse) {
            stream.write(130);
            writeValue(stream, Long.valueOf(((PlatformInAppMessageResponse) value).getRaw()));
            return;
        }
        if (value instanceof PlatformReplacementMode) {
            stream.write(131);
            writeValue(stream, Long.valueOf(((PlatformReplacementMode) value).getRaw()));
            return;
        }
        if (value instanceof PlatformProductType) {
            stream.write(132);
            writeValue(stream, Long.valueOf(((PlatformProductType) value).getRaw()));
            return;
        }
        if (value instanceof PlatformBillingChoiceMode) {
            stream.write(133);
            writeValue(stream, Long.valueOf(((PlatformBillingChoiceMode) value).getRaw()));
            return;
        }
        if (value instanceof PlatformBillingClientFeature) {
            stream.write(134);
            writeValue(stream, Long.valueOf(((PlatformBillingClientFeature) value).getRaw()));
            return;
        }
        if (value instanceof PlatformPurchaseState) {
            stream.write(135);
            writeValue(stream, Long.valueOf(((PlatformPurchaseState) value).getRaw()));
            return;
        }
        if (value instanceof PlatformRecurrenceMode) {
            stream.write(136);
            writeValue(stream, Long.valueOf(((PlatformRecurrenceMode) value).getRaw()));
            return;
        }
        if (value instanceof PlatformQueryProduct) {
            stream.write(137);
            writeValue(stream, ((PlatformQueryProduct) value).toList());
            return;
        }
        if (value instanceof PlatformAccountIdentifiers) {
            stream.write(138);
            writeValue(stream, ((PlatformAccountIdentifiers) value).toList());
            return;
        }
        if (value instanceof PlatformBillingResult) {
            stream.write(139);
            writeValue(stream, ((PlatformBillingResult) value).toList());
            return;
        }
        if (value instanceof PlatformOneTimePurchaseOfferDetails) {
            stream.write(140);
            writeValue(stream, ((PlatformOneTimePurchaseOfferDetails) value).toList());
            return;
        }
        if (value instanceof PlatformProductDetails) {
            stream.write(141);
            writeValue(stream, ((PlatformProductDetails) value).toList());
            return;
        }
        if (value instanceof PlatformProductDetailsResponse) {
            stream.write(142);
            writeValue(stream, ((PlatformProductDetailsResponse) value).toList());
            return;
        }
        if (value instanceof PlatformAlternativeBillingOnlyReportingDetailsResponse) {
            stream.write(143);
            writeValue(stream, ((PlatformAlternativeBillingOnlyReportingDetailsResponse) value).toList());
            return;
        }
        if (value instanceof PlatformInAppMessageResult) {
            stream.write(144);
            writeValue(stream, ((PlatformInAppMessageResult) value).toList());
            return;
        }
        if (value instanceof PlatformBillingConfigResponse) {
            stream.write(145);
            writeValue(stream, ((PlatformBillingConfigResponse) value).toList());
            return;
        }
        if (value instanceof PlatformBillingFlowParams) {
            stream.write(146);
            writeValue(stream, ((PlatformBillingFlowParams) value).toList());
            return;
        }
        if (value instanceof PlatformPricingPhase) {
            stream.write(147);
            writeValue(stream, ((PlatformPricingPhase) value).toList());
            return;
        }
        if (value instanceof PlatformPurchase) {
            stream.write(148);
            writeValue(stream, ((PlatformPurchase) value).toList());
            return;
        }
        if (value instanceof PlatformPendingPurchaseUpdate) {
            stream.write(149);
            writeValue(stream, ((PlatformPendingPurchaseUpdate) value).toList());
            return;
        }
        if (value instanceof PlatformPurchaseHistoryRecord) {
            stream.write(150);
            writeValue(stream, ((PlatformPurchaseHistoryRecord) value).toList());
            return;
        }
        if (value instanceof PlatformPurchaseHistoryResponse) {
            stream.write(151);
            writeValue(stream, ((PlatformPurchaseHistoryResponse) value).toList());
            return;
        }
        if (value instanceof PlatformPurchasesResponse) {
            stream.write(152);
            writeValue(stream, ((PlatformPurchasesResponse) value).toList());
            return;
        }
        if (value instanceof PlatformSubscriptionOfferDetails) {
            stream.write(153);
            writeValue(stream, ((PlatformSubscriptionOfferDetails) value).toList());
            return;
        }
        if (value instanceof PlatformUserChoiceDetails) {
            stream.write(154);
            writeValue(stream, ((PlatformUserChoiceDetails) value).toList());
            return;
        }
        if (value instanceof PlatformUserChoiceProduct) {
            stream.write(155);
            writeValue(stream, ((PlatformUserChoiceProduct) value).toList());
            return;
        }
        if (value instanceof PlatformInstallmentPlanDetails) {
            stream.write(156);
            writeValue(stream, ((PlatformInstallmentPlanDetails) value).toList());
        } else if (value instanceof PlatformPendingPurchasesParams) {
            stream.write(157);
            writeValue(stream, ((PlatformPendingPurchasesParams) value).toList());
        } else if (value instanceof PlatformUnfetchedProduct) {
            stream.write(158);
            writeValue(stream, ((PlatformUnfetchedProduct) value).toList());
        } else {
            super.writeValue(stream, value);
        }
    }
}
