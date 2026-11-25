.class public Lio/flutter/plugins/imagepicker/ImagePickerPlugin;
.super Ljava/lang/Object;
.source "ImagePickerPlugin.java"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;
.implements Lio/flutter/plugins/imagepicker/ImagePickerApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;,
        Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;
    }
.end annotation


# instance fields
.field activityState:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;

.field private pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;Landroid/app/Activity;)V
    .locals 1

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    new-instance v0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;

    invoke-direct {v0, p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerPlugin;Lio/flutter/plugins/imagepicker/ImagePickerDelegate;Landroid/app/Activity;)V

    iput-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->activityState:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;

    return-void
.end method

.method private getImagePickerDelegate()Lio/flutter/plugins/imagepicker/ImagePickerDelegate;
    .locals 1

    .line 249
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->activityState:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 252
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->activityState:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;->getDelegate()Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private setCameraDevice(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;Lio/flutter/plugins/imagepicker/SourceSpecification;)V
    .locals 1

    .line 257
    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/SourceSpecification;->getCamera()Lio/flutter/plugins/imagepicker/SourceCamera;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 260
    sget-object v0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$1;->$SwitchMap$io$flutter$plugins$imagepicker$SourceCamera:[I

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/SourceCamera;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    .line 266
    sget-object p2, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;->REAR:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;

    goto :goto_0

    .line 262
    :cond_0
    sget-object p2, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;->FRONT:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;

    .line 269
    :goto_0
    invoke-virtual {p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->setCameraDevice(Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;)V

    :cond_1
    return-void
.end method

.method private setup(Lio/flutter/plugin/common/BinaryMessenger;Landroid/app/Application;Landroid/app/Activity;Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 7

    .line 229
    new-instance v0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;

    move-object v5, p0

    move-object v1, p0

    move-object v4, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerPlugin;Landroid/app/Application;Landroid/app/Activity;Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/imagepicker/ImagePickerApi;Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    iput-object v0, v1, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->activityState:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;

    return-void
.end method

.method private tearDown()V
    .locals 1

    .line 233
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->activityState:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;

    if-eqz v0, :cond_0

    .line 234
    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;->release()V

    const/4 v0, 0x0

    .line 235
    iput-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->activityState:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;

    :cond_0
    return-void
.end method


# virtual methods
.method final constructDelegate(Landroid/app/Activity;)Lio/flutter/plugins/imagepicker/ImagePickerDelegate;
    .locals 3

    .line 241
    new-instance v0, Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-direct {v0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerCache;-><init>(Landroid/content/Context;)V

    .line 243
    new-instance v1, Lio/flutter/plugins/imagepicker/ExifDataCopier;

    invoke-direct {v1}, Lio/flutter/plugins/imagepicker/ExifDataCopier;-><init>()V

    .line 244
    new-instance v2, Lio/flutter/plugins/imagepicker/ImageResizer;

    invoke-direct {v2, p1, v1}, Lio/flutter/plugins/imagepicker/ImageResizer;-><init>(Landroid/content/Context;Lio/flutter/plugins/imagepicker/ExifDataCopier;)V

    .line 245
    new-instance v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    invoke-direct {v1, p1, v2, v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;-><init>(Landroid/app/Activity;Lio/flutter/plugins/imagepicker/ImageResizer;Lio/flutter/plugins/imagepicker/ImagePickerCache;)V

    return-object v1
.end method

.method final getActivityState()Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;
    .locals 1

    .line 187
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->activityState:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$ActivityState;

    return-object v0
.end method

.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 3

    .line 202
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 203
    invoke-virtual {v0}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 204
    invoke-virtual {v1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    .line 205
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v2

    .line 202
    invoke-direct {p0, v0, v1, v2, p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->setup(Lio/flutter/plugin/common/BinaryMessenger;Landroid/app/Application;Landroid/app/Activity;Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 0

    .line 211
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->tearDown()V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 216
    invoke-virtual {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    const/4 p1, 0x0

    .line 197
    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    .line 221
    invoke-virtual {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method

.method public pickImages(Lio/flutter/plugins/imagepicker/SourceSpecification;Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/GeneralOptions;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/SourceSpecification;",
            "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
            "Lio/flutter/plugins/imagepicker/GeneralOptions;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 282
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->getImagePickerDelegate()Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    move-result-object v0

    if-nez v0, :cond_0

    .line 284
    new-instance p1, Lio/flutter/plugins/imagepicker/FlutterError;

    const-string p2, "image_picker plugin requires a foreground activity."

    const/4 p3, 0x0

    const-string v0, "no_activity"

    invoke-direct {p1, v0, p2, p3}, Lio/flutter/plugins/imagepicker/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p4, p1}, Lio/flutter/plugins/imagepicker/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 291
    :cond_0
    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->setCameraDevice(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;Lio/flutter/plugins/imagepicker/SourceSpecification;)V

    .line 292
    invoke-virtual {p3}, Lio/flutter/plugins/imagepicker/GeneralOptions;->getAllowMultiple()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 293
    invoke-static {p3}, Lio/flutter/plugins/imagepicker/ImagePickerUtils;->getLimitFromOption(Lio/flutter/plugins/imagepicker/GeneralOptions;)I

    move-result p1

    .line 296
    invoke-virtual {p3}, Lio/flutter/plugins/imagepicker/GeneralOptions;->getUsePhotoPicker()Z

    move-result p3

    .line 295
    invoke-virtual {v0, p2, p3, p1, p4}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->chooseMultiImageFromGallery(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;ZILkotlin/jvm/functions/Function1;)V

    return-void

    .line 298
    :cond_1
    sget-object v1, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$1;->$SwitchMap$io$flutter$plugins$imagepicker$SourceType:[I

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/SourceSpecification;->getType()Lio/flutter/plugins/imagepicker/SourceType;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/SourceType;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 p3, 0x2

    if-eq p1, p3, :cond_2

    return-void

    .line 303
    :cond_2
    invoke-virtual {v0, p2, p4}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->takeImageWithCamera(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 300
    :cond_3
    invoke-virtual {p3}, Lio/flutter/plugins/imagepicker/GeneralOptions;->getUsePhotoPicker()Z

    move-result p1

    invoke-virtual {v0, p2, p1, p4}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->chooseImageFromGallery(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;ZLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public pickMedia(Lio/flutter/plugins/imagepicker/MediaSelectionOptions;Lio/flutter/plugins/imagepicker/GeneralOptions;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/MediaSelectionOptions;",
            "Lio/flutter/plugins/imagepicker/GeneralOptions;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 317
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->getImagePickerDelegate()Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    move-result-object v0

    if-nez v0, :cond_0

    .line 319
    new-instance p1, Lio/flutter/plugins/imagepicker/FlutterError;

    const-string p2, "image_picker plugin requires a foreground activity."

    const/4 v0, 0x0

    const-string v1, "no_activity"

    invoke-direct {p1, v1, p2, v0}, Lio/flutter/plugins/imagepicker/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p3, p1}, Lio/flutter/plugins/imagepicker/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 325
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->chooseMediaFromGallery(Lio/flutter/plugins/imagepicker/MediaSelectionOptions;Lio/flutter/plugins/imagepicker/GeneralOptions;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public pickVideos(Lio/flutter/plugins/imagepicker/SourceSpecification;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lio/flutter/plugins/imagepicker/GeneralOptions;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/SourceSpecification;",
            "Lio/flutter/plugins/imagepicker/VideoSelectionOptions;",
            "Lio/flutter/plugins/imagepicker/GeneralOptions;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 337
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->getImagePickerDelegate()Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    move-result-object v0

    if-nez v0, :cond_0

    .line 339
    new-instance p1, Lio/flutter/plugins/imagepicker/FlutterError;

    const-string p2, "image_picker plugin requires a foreground activity."

    const/4 p3, 0x0

    const-string v0, "no_activity"

    invoke-direct {p1, v0, p2, p3}, Lio/flutter/plugins/imagepicker/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p4, p1}, Lio/flutter/plugins/imagepicker/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 346
    :cond_0
    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->setCameraDevice(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;Lio/flutter/plugins/imagepicker/SourceSpecification;)V

    .line 347
    invoke-virtual {p3}, Lio/flutter/plugins/imagepicker/GeneralOptions;->getAllowMultiple()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 348
    invoke-static {p3}, Lio/flutter/plugins/imagepicker/ImagePickerUtils;->getLimitFromOption(Lio/flutter/plugins/imagepicker/GeneralOptions;)I

    move-result p1

    .line 350
    invoke-virtual {p3}, Lio/flutter/plugins/imagepicker/GeneralOptions;->getUsePhotoPicker()Z

    move-result p3

    .line 349
    invoke-virtual {v0, p2, p3, p1, p4}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->chooseMultiVideoFromGallery(Lio/flutter/plugins/imagepicker/VideoSelectionOptions;ZILkotlin/jvm/functions/Function1;)V

    return-void

    .line 352
    :cond_1
    sget-object v1, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$1;->$SwitchMap$io$flutter$plugins$imagepicker$SourceType:[I

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/SourceSpecification;->getType()Lio/flutter/plugins/imagepicker/SourceType;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/SourceType;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 p3, 0x2

    if-eq p1, p3, :cond_2

    return-void

    .line 357
    :cond_2
    invoke-virtual {v0, p2, p4}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->takeVideoWithCamera(Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 354
    :cond_3
    invoke-virtual {p3}, Lio/flutter/plugins/imagepicker/GeneralOptions;->getUsePhotoPicker()Z

    move-result p1

    invoke-virtual {v0, p2, p1, p4}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->chooseVideoFromGallery(Lio/flutter/plugins/imagepicker/VideoSelectionOptions;ZLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public retrieveLostResults()Lio/flutter/plugins/imagepicker/CacheRetrievalResult;
    .locals 4

    .line 366
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->getImagePickerDelegate()Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 371
    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->retrieveLostImage()Lio/flutter/plugins/imagepicker/CacheRetrievalResult;

    move-result-object v0

    return-object v0

    .line 368
    :cond_0
    new-instance v0, Lio/flutter/plugins/imagepicker/FlutterError;

    const-string v1, "image_picker plugin requires a foreground activity."

    const/4 v2, 0x0

    const-string v3, "no_activity"

    invoke-direct {v0, v3, v1, v2}, Lio/flutter/plugins/imagepicker/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    throw v0
.end method
