package io.flutter.plugins.imagepicker;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.tekartik.sqflite.Constant;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0004\u0012\u00020\u00030\u000bH&J@\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0004\u0012\u00020\u00030\u000bH&J8\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0004\u0012\u00020\u00030\u000bH&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lio/flutter/plugins/imagepicker/ImagePickerApi;", "", "pickImages", "", "source", "Lio/flutter/plugins/imagepicker/SourceSpecification;", Constant.METHOD_OPTIONS, "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;", "generalOptions", "Lio/flutter/plugins/imagepicker/GeneralOptions;", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "", "", "pickVideos", "Lio/flutter/plugins/imagepicker/VideoSelectionOptions;", "pickMedia", "mediaSelectionOptions", "Lio/flutter/plugins/imagepicker/MediaSelectionOptions;", "retrieveLostResults", "Lio/flutter/plugins/imagepicker/CacheRetrievalResult;", "Companion", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ImagePickerApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void pickImages(SourceSpecification source, ImageSelectionOptions options, GeneralOptions generalOptions, Function1<? super Result<? extends List<String>>, Unit> callback);

    void pickMedia(MediaSelectionOptions mediaSelectionOptions, GeneralOptions generalOptions, Function1<? super Result<? extends List<String>>, Unit> callback);

    void pickVideos(SourceSpecification source, VideoSelectionOptions options, GeneralOptions generalOptions, Function1<? super Result<? extends List<String>>, Unit> callback);

    CacheRetrievalResult retrieveLostResults();

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007R#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/flutter/plugins/imagepicker/ImagePickerApi$Companion;", "", "<init>", "()V", "codec", "Lio/flutter/plugin/common/MessageCodec;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lkotlin/Lazy;", "setUp", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/imagepicker/ImagePickerApi;", "messageChannelSuffix", "", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: codec$delegate, reason: from kotlin metadata */
        private static final Lazy<MessagesPigeonCodec> codec = LazyKt.lazy(new Function0() { // from class: io.flutter.plugins.imagepicker.ImagePickerApi$Companion$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImagePickerApi.Companion.codec_delegate$lambda$0();
            }
        });

        public final void setUp(BinaryMessenger binaryMessenger, ImagePickerApi imagePickerApi) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, imagePickerApi, null, 4, null);
        }

        private Companion() {
        }

        static final MessagesPigeonCodec codec_delegate$lambda$0() {
            return new MessagesPigeonCodec();
        }

        public final MessageCodec<Object> getCodec() {
            return codec.getValue();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, ImagePickerApi imagePickerApi, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, imagePickerApi, str);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final ImagePickerApi api, String messageChannelSuffix) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
            String str = messageChannelSuffix.length() > 0 ? "." + messageChannelSuffix : "";
            BinaryMessenger.TaskQueue taskQueueMakeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.imagepicker.ImagePickerApi$Companion$$ExternalSyntheticLambda2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        ImagePickerApi.Companion.setUp$lambda$0$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.imagepicker.ImagePickerApi$Companion$$ExternalSyntheticLambda3
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        ImagePickerApi.Companion.setUp$lambda$1$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia" + str, getCodec());
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.imagepicker.ImagePickerApi$Companion$$ExternalSyntheticLambda4
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        ImagePickerApi.Companion.setUp$lambda$2$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.imagepicker.ImagePickerApi$Companion$$ExternalSyntheticLambda5
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        ImagePickerApi.Companion.setUp$lambda$3$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$0$0(ImagePickerApi imagePickerApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
            imagePickerApi.pickImages((SourceSpecification) obj2, (ImageSelectionOptions) obj3, (GeneralOptions) obj4, new Function1() { // from class: io.flutter.plugins.imagepicker.ImagePickerApi$Companion$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    return ImagePickerApi.Companion.setUp$lambda$0$0$0(reply, (Result) obj5);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$0$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((List) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$1$0(ImagePickerApi imagePickerApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.VideoSelectionOptions");
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
            imagePickerApi.pickVideos((SourceSpecification) obj2, (VideoSelectionOptions) obj3, (GeneralOptions) obj4, new Function1() { // from class: io.flutter.plugins.imagepicker.ImagePickerApi$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    return ImagePickerApi.Companion.setUp$lambda$1$0$0(reply, (Result) obj5);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$1$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((List) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$0(ImagePickerApi imagePickerApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.MediaSelectionOptions");
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
            imagePickerApi.pickMedia((MediaSelectionOptions) obj2, (GeneralOptions) obj3, new Function1() { // from class: io.flutter.plugins.imagepicker.ImagePickerApi$Companion$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return ImagePickerApi.Companion.setUp$lambda$2$0$0(reply, (Result) obj4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$2$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((List) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$0(ImagePickerApi imagePickerApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            try {
                listWrapError = CollectionsKt.listOf(imagePickerApi.retrieveLostResults());
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }
    }
}
