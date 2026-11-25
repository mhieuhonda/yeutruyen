package xyz.luan.audioplayers;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.tekartik.sqflite.Constant;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AudioplayersPlugin.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J$\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u0011J$\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u0016\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lxyz/luan/audioplayers/EventHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "eventChannel", "Lio/flutter/plugin/common/EventChannel;", "<init>", "(Lio/flutter/plugin/common/EventChannel;)V", "eventSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "onListen", "", Constant.PARAM_SQL_ARGUMENTS, "", "events", "onCancel", "success", Constant.PARAM_METHOD, "", "", Constant.PARAM_ERROR, "errorCode", "errorMessage", "errorDetails", "dispose", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class EventHandler implements EventChannel.StreamHandler {
    private final EventChannel eventChannel;
    private EventChannel.EventSink eventSink;

    public EventHandler(EventChannel eventChannel) {
        Intrinsics.checkNotNullParameter(eventChannel, "eventChannel");
        this.eventChannel = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object arguments, EventChannel.EventSink events) {
        this.eventSink = events;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object arguments) {
        this.eventSink = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void success$default(EventHandler eventHandler, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = new HashMap();
        }
        eventHandler.success(str, map);
    }

    public final void success(String method, Map<String, ? extends Object> arguments) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        EventChannel.EventSink eventSink = this.eventSink;
        if (eventSink != null) {
            eventSink.success(MapsKt.plus(arguments, new Pair(NotificationCompat.CATEGORY_EVENT, method)));
        }
    }

    public final void error(String errorCode, String errorMessage, Object errorDetails) {
        EventChannel.EventSink eventSink = this.eventSink;
        if (eventSink != null) {
            eventSink.error(errorCode, errorMessage, errorDetails);
        }
    }

    public final void dispose() {
        EventChannel.EventSink eventSink = this.eventSink;
        if (eventSink != null) {
            eventSink.endOfStream();
            onCancel(null);
        }
        this.eventChannel.setStreamHandler(null);
    }
}
