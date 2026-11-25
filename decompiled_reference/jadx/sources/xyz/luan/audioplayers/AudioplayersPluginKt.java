package xyz.luan.audioplayers;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugin.common.MethodCall;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: AudioplayersPlugin.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\t\u001a\u0004\u0018\u0001H\n\"\u0010\b\u0000\u0010\n\u0018\u0001*\b\u0012\u0004\u0012\u0002H\n0\u000b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\fH\u0082\b¢\u0006\u0002\u0010\r\u001a\n\u0010\u000e\u001a\u00020\f*\u00020\f\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0002*j\u0010\u0000\"2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u000122\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¨\u0006\u0011"}, d2 = {"FlutterHandler", "Lkotlin/Function2;", "Lio/flutter/plugin/common/MethodCall;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodChannel$Result;", "response", "", "enumArgument", "T", "", "", "(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Enum;", "toConstantCase", "audioContext", "Lxyz/luan/audioplayers/AudioContextAndroid;", "audioplayers_android_release"}, k = 2, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AudioplayersPluginKt {
    private static final /* synthetic */ <T extends Enum<T>> T enumArgument(MethodCall methodCall, String str) {
        String str2 = (String) methodCall.argument(str);
        if (str2 == null) {
            return null;
        }
        String constantCase = toConstantCase((String) CollectionsKt.last(StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null)));
        Intrinsics.reifiedOperationMarker(5, "T");
        return (T) Enum.valueOf(null, constantCase);
    }

    public static final String toConstantCase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = new Regex("(.) (.)").replace(new Regex("(.)(\\p{Upper})").replace(str, "$1_$2"), "$1_$2").toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioContextAndroid audioContext(MethodCall methodCall) {
        Boolean bool = (Boolean) methodCall.argument("isSpeakerphoneOn");
        if (bool == null) {
            throw new IllegalStateException("isSpeakerphoneOn is required".toString());
        }
        boolean zBooleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) methodCall.argument("stayAwake");
        if (bool2 == null) {
            throw new IllegalStateException("stayAwake is required".toString());
        }
        boolean zBooleanValue2 = bool2.booleanValue();
        Integer num = (Integer) methodCall.argument("contentType");
        if (num == null) {
            throw new IllegalStateException("contentType is required".toString());
        }
        int iIntValue = num.intValue();
        Integer num2 = (Integer) methodCall.argument("usageType");
        if (num2 == null) {
            throw new IllegalStateException("usageType is required".toString());
        }
        int iIntValue2 = num2.intValue();
        Integer num3 = (Integer) methodCall.argument("audioFocus");
        if (num3 == null) {
            throw new IllegalStateException("audioFocus is required".toString());
        }
        int iIntValue3 = num3.intValue();
        Integer num4 = (Integer) methodCall.argument("audioMode");
        if (num4 != null) {
            return new AudioContextAndroid(zBooleanValue, zBooleanValue2, iIntValue, iIntValue2, iIntValue3, num4.intValue());
        }
        throw new IllegalStateException("audioMode is required".toString());
    }
}
