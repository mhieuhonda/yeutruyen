package io.flutter.plugins.urllauncher;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ImagesContract;
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

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\u0003H&J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lio/flutter/plugins/urllauncher/UrlLauncherApi;", "", "canLaunchUrl", "", ImagesContract.URL, "", "launchUrl", "headers", "", "requireNonBrowser", "openUrlInApp", "allowCustomTab", "webViewOptions", "Lio/flutter/plugins/urllauncher/WebViewOptions;", "browserOptions", "Lio/flutter/plugins/urllauncher/BrowserOptions;", "supportsCustomTabs", "closeWebView", "", "Companion", "url_launcher_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface UrlLauncherApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean canLaunchUrl(String url);

    void closeWebView();

    boolean launchUrl(String url, Map<String, String> headers, boolean requireNonBrowser);

    boolean openUrlInApp(String url, boolean allowCustomTab, WebViewOptions webViewOptions, BrowserOptions browserOptions);

    boolean supportsCustomTabs();

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007R#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/flutter/plugins/urllauncher/UrlLauncherApi$Companion;", "", "<init>", "()V", "codec", "Lio/flutter/plugin/common/MessageCodec;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lkotlin/Lazy;", "setUp", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/urllauncher/UrlLauncherApi;", "messageChannelSuffix", "", "url_launcher_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: codec$delegate, reason: from kotlin metadata */
        private static final Lazy<MessagesPigeonCodec> codec = LazyKt.lazy(new Function0() { // from class: io.flutter.plugins.urllauncher.UrlLauncherApi$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UrlLauncherApi.Companion.codec_delegate$lambda$0();
            }
        });

        public final void setUp(BinaryMessenger binaryMessenger, UrlLauncherApi urlLauncherApi) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, urlLauncherApi, null, 4, null);
        }

        private Companion() {
        }

        static final MessagesPigeonCodec codec_delegate$lambda$0() {
            return new MessagesPigeonCodec();
        }

        public final MessageCodec<Object> getCodec() {
            return codec.getValue();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, UrlLauncherApi urlLauncherApi, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, urlLauncherApi, str);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final UrlLauncherApi api, String messageChannelSuffix) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
            String str = messageChannelSuffix.length() > 0 ? "." + messageChannelSuffix : "";
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl" + str, getCodec());
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.UrlLauncherApi$Companion$$ExternalSyntheticLambda1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        UrlLauncherApi.Companion.setUp$lambda$0$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl" + str, getCodec());
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.UrlLauncherApi$Companion$$ExternalSyntheticLambda2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        UrlLauncherApi.Companion.setUp$lambda$1$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp" + str, getCodec());
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.UrlLauncherApi$Companion$$ExternalSyntheticLambda3
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        UrlLauncherApi.Companion.setUp$lambda$2$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs" + str, getCodec());
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.UrlLauncherApi$Companion$$ExternalSyntheticLambda4
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        UrlLauncherApi.Companion.setUp$lambda$3$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView" + str, getCodec());
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.UrlLauncherApi$Companion$$ExternalSyntheticLambda5
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        UrlLauncherApi.Companion.setUp$lambda$4$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$0$0(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(urlLauncherApi.canLaunchUrl((String) obj2)));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$1$0(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            Map<String, String> map = (Map) obj3;
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(urlLauncherApi.launchUrl(str, map, ((Boolean) obj4).booleanValue())));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$0(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
            WebViewOptions webViewOptions = (WebViewOptions) obj4;
            Object obj5 = list.get(3);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(urlLauncherApi.openUrlInApp(str, zBooleanValue, webViewOptions, (BrowserOptions) obj5)));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$0(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(urlLauncherApi.supportsCustomTabs()));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$0(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            try {
                urlLauncherApi.closeWebView();
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }
    }
}
