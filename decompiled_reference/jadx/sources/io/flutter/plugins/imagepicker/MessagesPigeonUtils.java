package io.flutter.plugins.imagepicker;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tekartik.sqflite.Constant;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001¨\u0006\u0019"}, d2 = {"Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;", "", "<init>", "()V", "wrapResult", "", Constant.PARAM_RESULT, "wrapError", "exception", "", "doubleEquals", "", "a", "", "b", "floatEquals", "", "doubleHash", "", "d", "floatHash", "f", "deepEquals", "deepHash", AppMeasurementSdk.ConditionalUserProperty.VALUE, "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final class MessagesPigeonUtils {
    public static final MessagesPigeonUtils INSTANCE = new MessagesPigeonUtils();

    private MessagesPigeonUtils() {
    }

    public final List<Object> wrapResult(Object result) {
        return CollectionsKt.listOf(result);
    }

    public final List<Object> wrapError(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (exception instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) exception;
            return CollectionsKt.listOf(flutterError.getCode(), flutterError.getMessage(), flutterError.getDetails());
        }
        return CollectionsKt.listOf((Object[]) new String[]{exception.getClass().getSimpleName(), exception.toString(), "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception)});
    }

    public final boolean doubleEquals(double a, double b) {
        if ((a == 0.0d ? 0.0d : a) == (b != 0.0d ? b : 0.0d)) {
            return true;
        }
        return Double.isNaN(a) && Double.isNaN(b);
    }

    public final boolean floatEquals(float a, float b) {
        if ((a == 0.0f ? 0.0f : a) == (b != 0.0f ? b : 0.0f)) {
            return true;
        }
        return Float.isNaN(a) && Float.isNaN(b);
    }

    public final int doubleHash(double d) {
        if (d == 0.0d) {
            d = 0.0d;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final int floatHash(float f) {
        if (f == 0.0f) {
            f = 0.0f;
        }
        return Float.floatToIntBits(f);
    }

    public final boolean deepEquals(Object a, Object b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if ((a instanceof byte[]) && (b instanceof byte[])) {
            return Arrays.equals((byte[]) a, (byte[]) b);
        }
        if ((a instanceof int[]) && (b instanceof int[])) {
            return Arrays.equals((int[]) a, (int[]) b);
        }
        if ((a instanceof long[]) && (b instanceof long[])) {
            return Arrays.equals((long[]) a, (long[]) b);
        }
        if ((a instanceof double[]) && (b instanceof double[])) {
            double[] dArr = (double[]) a;
            double[] dArr2 = (double[]) b;
            if (dArr.length != dArr2.length) {
                return false;
            }
            int length = dArr.length;
            for (int i = 0; i < length; i++) {
                if (!doubleEquals(dArr[i], dArr2[i])) {
                    return false;
                }
            }
            return true;
        }
        if ((a instanceof float[]) && (b instanceof float[])) {
            float[] fArr = (float[]) a;
            float[] fArr2 = (float[]) b;
            if (fArr.length != fArr2.length) {
                return false;
            }
            int length2 = fArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (!floatEquals(fArr[i2], fArr2[i2])) {
                    return false;
                }
            }
            return true;
        }
        if ((a instanceof Object[]) && (b instanceof Object[])) {
            Object[] objArr = (Object[]) a;
            Object[] objArr2 = (Object[]) b;
            if (objArr.length != objArr2.length) {
                return false;
            }
            int length3 = objArr.length;
            for (int i3 = 0; i3 < length3; i3++) {
                if (!deepEquals(objArr[i3], objArr2[i3])) {
                    return false;
                }
            }
            return true;
        }
        if ((a instanceof List) && (b instanceof List)) {
            List list = (List) a;
            List list2 = (List) b;
            if (list.size() != list2.size()) {
                return false;
            }
            Iterator it = list.iterator();
            Iterator it2 = list2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (!deepEquals(it.next(), it2.next())) {
                    return false;
                }
            }
            return true;
        }
        if ((a instanceof Map) && (b instanceof Map)) {
            Map map = (Map) a;
            Map map2 = (Map) b;
            if (map.size() != map2.size()) {
                return false;
            }
            loop4: for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (deepEquals(key, entry2.getKey())) {
                        if (!deepEquals(entry.getValue(), entry2.getValue())) {
                            break loop4;
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if ((a instanceof Double) && (b instanceof Double)) {
            return doubleEquals(((Number) a).doubleValue(), ((Number) b).doubleValue());
        }
        if ((a instanceof Float) && (b instanceof Float)) {
            return floatEquals(((Number) a).floatValue(), ((Number) b).floatValue());
        }
        return Intrinsics.areEqual(a, b);
    }

    public final int deepHash(Object value) {
        int iDeepHash = 0;
        if (value == null) {
            return 0;
        }
        if (value instanceof byte[]) {
            return Arrays.hashCode((byte[]) value);
        }
        if (value instanceof int[]) {
            return Arrays.hashCode((int[]) value);
        }
        if (value instanceof long[]) {
            return Arrays.hashCode((long[]) value);
        }
        int iDeepHash2 = 1;
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            int length = dArr.length;
            while (iDeepHash < length) {
                iDeepHash2 = (iDeepHash2 * 31) + doubleHash(dArr[iDeepHash]);
                iDeepHash++;
            }
            return iDeepHash2;
        }
        if (value instanceof float[]) {
            float[] fArr = (float[]) value;
            int length2 = fArr.length;
            while (iDeepHash < length2) {
                iDeepHash2 = (iDeepHash2 * 31) + floatHash(fArr[iDeepHash]);
                iDeepHash++;
            }
            return iDeepHash2;
        }
        if (value instanceof Object[]) {
            Object[] objArr = (Object[]) value;
            int length3 = objArr.length;
            while (iDeepHash < length3) {
                iDeepHash2 = (iDeepHash2 * 31) + deepHash(objArr[iDeepHash]);
                iDeepHash++;
            }
            return iDeepHash2;
        }
        if (value instanceof List) {
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                iDeepHash2 = (iDeepHash2 * 31) + deepHash(it.next());
            }
            return iDeepHash2;
        }
        if (value instanceof Map) {
            for (Map.Entry entry : ((Map) value).entrySet()) {
                iDeepHash += deepHash(entry.getValue()) ^ (deepHash(entry.getKey()) * 31);
            }
            return iDeepHash;
        }
        if (value instanceof Double) {
            return doubleHash(((Number) value).doubleValue());
        }
        return value instanceof Float ? floatHash(((Number) value).floatValue()) : value.hashCode();
    }
}
