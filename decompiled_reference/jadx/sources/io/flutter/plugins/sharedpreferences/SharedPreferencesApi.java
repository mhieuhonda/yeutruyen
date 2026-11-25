package io.flutter.plugins.sharedpreferences;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.g.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH&J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fH&J,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00052\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fH&¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesApi;", "", "remove", "", "key", "", "setBool", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setString", "setInt", "", "setDouble", "", "setEncodedStringList", "setDeprecatedStringList", "", "clear", "prefix", "allowList", "getAll", "", "Companion", "shared_preferences_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SharedPreferencesApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean clear(String prefix, List<String> allowList);

    Map<String, Object> getAll(String prefix, List<String> allowList);

    boolean remove(String key);

    boolean setBool(String key, boolean value);

    boolean setDeprecatedStringList(String key, List<String> value);

    boolean setDouble(String key, double value);

    boolean setEncodedStringList(String key, String value);

    boolean setInt(String key, long value);

    boolean setString(String key, String value);

    /* JADX INFO: compiled from: Messages.g.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007R#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesApi$Companion;", "", "<init>", "()V", "codec", "Lio/flutter/plugin/common/MessageCodec;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lkotlin/Lazy;", "setUp", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesApi;", "messageChannelSuffix", "", "shared_preferences_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: codec$delegate, reason: from kotlin metadata */
        private static final Lazy<MessagesPigeonCodec> codec = LazyKt.lazy(new Function0() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesApi$Companion$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SharedPreferencesApi.Companion.codec_delegate$lambda$0();
            }
        });

        public final void setUp(BinaryMessenger binaryMessenger, SharedPreferencesApi sharedPreferencesApi) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, sharedPreferencesApi, null, 4, null);
        }

        private Companion() {
        }

        static final MessagesPigeonCodec codec_delegate$lambda$0() {
            return new MessagesPigeonCodec();
        }

        public final MessageCodec<Object> getCodec() {
            return codec.getValue();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, SharedPreferencesApi sharedPreferencesApi, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, sharedPreferencesApi, str);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final SharedPreferencesApi api, String messageChannelSuffix) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
            String str = messageChannelSuffix.length() > 0 ? "." + messageChannelSuffix : "";
            BinaryMessenger.TaskQueue taskQueueMakeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesApi$Companion$$ExternalSyntheticLambda0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesApi.Companion.setUp$lambda$0$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesApi$Companion$$ExternalSyntheticLambda1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesApi.Companion.setUp$lambda$1$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesApi$Companion$$ExternalSyntheticLambda2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesApi.Companion.setUp$lambda$2$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesApi$Companion$$ExternalSyntheticLambda3
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesApi.Companion.setUp$lambda$3$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesApi$Companion$$ExternalSyntheticLambda4
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesApi.Companion.setUp$lambda$4$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesApi$Companion$$ExternalSyntheticLambda5
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesApi.Companion.setUp$lambda$5$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesApi$Companion$$ExternalSyntheticLambda6
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesApi.Companion.setUp$lambda$6$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesApi$Companion$$ExternalSyntheticLambda7
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesApi.Companion.setUp$lambda$7$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesApi$Companion$$ExternalSyntheticLambda8
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesApi.Companion.setUp$lambda$8$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$0$0(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(sharedPreferencesApi.remove((String) obj2)));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$1$0(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(sharedPreferencesApi.setBool(str, ((Boolean) obj3).booleanValue())));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$0(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(sharedPreferencesApi.setString(str, (String) obj3)));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$0(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(sharedPreferencesApi.setInt(str, ((Long) obj3).longValue())));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$0(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Double");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(sharedPreferencesApi.setDouble(str, ((Double) obj3).doubleValue())));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$5$0(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(sharedPreferencesApi.setEncodedStringList(str, (String) obj3)));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$6$0(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(sharedPreferencesApi.setDeprecatedStringList(str, (List) obj3)));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$7$0(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(sharedPreferencesApi.clear((String) obj2, (List) list.get(1))));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$8$0(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            try {
                listWrapError = CollectionsKt.listOf(sharedPreferencesApi.getAll((String) obj2, (List) list.get(1)));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }
    }
}
