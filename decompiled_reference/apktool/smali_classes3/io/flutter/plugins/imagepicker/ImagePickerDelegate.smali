.class public Lio/flutter/plugins/imagepicker/ImagePickerDelegate;
.super Ljava/lang/Object;
.source "ImagePickerDelegate.java"

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;
.implements Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;,
        Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;,
        Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;,
        Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;,
        Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;,
        Lio/flutter/plugins/imagepicker/ImagePickerDelegate$OnPathReadyListener;
    }
.end annotation


# static fields
.field static final REQUEST_CAMERA_IMAGE_PERMISSION:I = 0x929

.field static final REQUEST_CAMERA_VIDEO_PERMISSION:I = 0x933

.field static final REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY:I = 0x926

.field static final REQUEST_CODE_CHOOSE_MEDIA_FROM_GALLERY:I = 0x92b

.field static final REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY:I = 0x92a

.field static final REQUEST_CODE_CHOOSE_MULTI_VIDEO_FROM_GALLERY:I = 0x92c

.field static final REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY:I = 0x930

.field static final REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA:I = 0x927

.field static final REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA:I = 0x931


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

.field private cameraDevice:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;

.field private final executor:Ljava/util/concurrent/ExecutorService;

.field final fileProviderName:Ljava/lang/String;

.field private final fileUriResolver:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;

.field private final fileUtils:Lio/flutter/plugins/imagepicker/FileUtils;

.field private final imageResizer:Lio/flutter/plugins/imagepicker/ImageResizer;

.field private pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

.field private final pendingCallStateLock:Ljava/lang/Object;

.field private pendingCameraMediaUri:Landroid/net/Uri;

.field private final permissionManager:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;


# direct methods
.method public static synthetic $r8$lambda$9UOSDYzRqvp7-olO_mS8Tre_180(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->lambda$onActivityResult$1(ILandroid/content/Intent;)V

    return-void
.end method

.method public static synthetic $r8$lambda$PBC9ui77uGR07Ynvd3NcO-ffqQM(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->lambda$onActivityResult$3(I)V

    return-void
.end method

.method public static synthetic $r8$lambda$Tnd1UBHmr8BpNTJVsm-jSzZhKZ0(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->lambda$onActivityResult$4(ILandroid/content/Intent;)V

    return-void
.end method

.method public static synthetic $r8$lambda$UVxHUkjxMFjeWivfESnr10WBZRI(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->lambda$onActivityResult$5(ILandroid/content/Intent;)V

    return-void
.end method

.method public static synthetic $r8$lambda$aRuhIqS0c0GrINp4EyBGkO3lpX4(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->lambda$handleCaptureImageResult$7(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$dUPy7IicTSweuN4KQnyOTGsMWKg(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->lambda$onActivityResult$0(ILandroid/content/Intent;)V

    return-void
.end method

.method public static synthetic $r8$lambda$hnSkOB5mvy5WPvZS3y7JWrgojSQ(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithSuccess(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$psjSzjMYClLwewWardZbYciTZ-U(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->lambda$onActivityResult$6(I)V

    return-void
.end method

.method public static synthetic $r8$lambda$uKJHVDvds42LfsXizZgRSn5ycA4(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->lambda$onActivityResult$2(ILandroid/content/Intent;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lio/flutter/plugins/imagepicker/ImageResizer;Lio/flutter/plugins/imagepicker/ImagePickerCache;)V
    .locals 11

    .line 157
    new-instance v7, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$1;

    invoke-direct {v7, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$1;-><init>(Landroid/app/Activity;)V

    new-instance v8, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$2;

    invoke-direct {v8, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$2;-><init>(Landroid/app/Activity;)V

    new-instance v9, Lio/flutter/plugins/imagepicker/FileUtils;

    invoke-direct {v9}, Lio/flutter/plugins/imagepicker/FileUtils;-><init>()V

    .line 197
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v10

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p3

    .line 157
    invoke-direct/range {v0 .. v10}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;-><init>(Landroid/app/Activity;Lio/flutter/plugins/imagepicker/ImageResizer;Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;Lio/flutter/plugins/imagepicker/ImagePickerCache;Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;Lio/flutter/plugins/imagepicker/FileUtils;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method constructor <init>(Landroid/app/Activity;Lio/flutter/plugins/imagepicker/ImageResizer;Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;Lio/flutter/plugins/imagepicker/ImagePickerCache;Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;Lio/flutter/plugins/imagepicker/FileUtils;Ljava/util/concurrent/ExecutorService;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lio/flutter/plugins/imagepicker/ImageResizer;",
            "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
            "Lio/flutter/plugins/imagepicker/VideoSelectionOptions;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;",
            "Lio/flutter/plugins/imagepicker/ImagePickerCache;",
            "Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;",
            "Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;",
            "Lio/flutter/plugins/imagepicker/FileUtils;",
            "Ljava/util/concurrent/ExecutorService;",
            ")V"
        }
    .end annotation

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallStateLock:Ljava/lang/Object;

    .line 218
    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    .line 219
    iput-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->imageResizer:Lio/flutter/plugins/imagepicker/ImageResizer;

    .line 220
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, ".flutter.image_provider"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->fileProviderName:Ljava/lang/String;

    if-eqz p5, :cond_0

    .line 222
    new-instance p1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    invoke-direct {p1, p3, p4, p5}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;-><init>(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    .line 225
    :cond_0
    iput-object p7, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->permissionManager:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;

    .line 226
    iput-object p8, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->fileUriResolver:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;

    .line 227
    iput-object p9, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->fileUtils:Lio/flutter/plugins/imagepicker/FileUtils;

    .line 228
    iput-object p6, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    .line 229
    iput-object p10, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->executor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method private createTemporaryWritableFile(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 599
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 601
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getCacheDir()Ljava/io/File;

    move-result-object v1

    .line 604
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 605
    invoke-static {v0, p1, v1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 607
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private createTemporaryWritableImageFile()Ljava/io/File;
    .locals 1

    .line 591
    const-string v0, ".jpg"

    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->createTemporaryWritableFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private createTemporaryWritableVideoFile()Ljava/io/File;
    .locals 1

    .line 595
    const-string v0, ".mp4"

    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->createTemporaryWritableFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private finishWithAlreadyActiveError(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    .line 1021
    new-instance v0, Lio/flutter/plugins/imagepicker/FlutterError;

    const-string v1, "Image picker is already active"

    const/4 v2, 0x0

    const-string v3, "already_active"

    invoke-direct {v0, v3, v1, v2}, Lio/flutter/plugins/imagepicker/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lio/flutter/plugins/imagepicker/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method private finishWithError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1028
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallStateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1029
    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 1030
    iget-object v1, v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->callback:Lkotlin/jvm/functions/Function1;

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 1032
    :goto_0
    iput-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    .line 1033
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    .line 1036
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-virtual {v0, v2, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->saveResult(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 1038
    :cond_1
    new-instance v0, Lio/flutter/plugins/imagepicker/FlutterError;

    invoke-direct {v0, p1, p2, v2}, Lio/flutter/plugins/imagepicker/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v1, v0}, Lio/flutter/plugins/imagepicker/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p1

    .line 1033
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private finishWithListSuccess(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1002
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallStateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 1003
    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 1004
    iget-object v1, v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->callback:Lkotlin/jvm/functions/Function1;

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 1006
    :goto_0
    iput-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    .line 1007
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    .line 1010
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-virtual {v0, p1, v2, v2}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->saveResult(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 1012
    :cond_1
    invoke-static {v1, p1}, Lio/flutter/plugins/imagepicker/ResultUtilsKt;->completeWithValue(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 1007
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private finishWithSuccess(Ljava/lang/String;)V
    .locals 3

    .line 975
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    .line 977
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 982
    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallStateLock:Ljava/lang/Object;

    monitor-enter p1

    .line 983
    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 984
    iget-object v1, v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->callback:Lkotlin/jvm/functions/Function1;

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 986
    :goto_0
    iput-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    .line 987
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_3

    .line 991
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 992
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-virtual {p1, v0, v2, v2}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->saveResult(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void

    .line 995
    :cond_3
    invoke-static {v1, v0}, Lio/flutter/plugins/imagepicker/ResultUtilsKt;->completeWithValue(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    .line 987
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private getPathsFromIntent(Landroid/content/Intent;Z)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Z)",
            "Ljava/util/ArrayList<",
            "Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;",
            ">;"
        }
    .end annotation

    .line 720
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 722
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_5

    .line 726
    invoke-virtual {p1}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    const/4 v1, 0x0

    .line 735
    :goto_0
    invoke-virtual {p1}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/ClipData;->getItemCount()I

    move-result v3

    if-ge v1, v3, :cond_4

    .line 736
    invoke-virtual {p1}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    move-result-object v3

    if-nez v3, :cond_1

    return-object v2

    .line 741
    :cond_1
    iget-object v4, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->fileUtils:Lio/flutter/plugins/imagepicker/FileUtils;

    iget-object v5, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    invoke-virtual {v4, v5, v3}, Lio/flutter/plugins/imagepicker/FileUtils;->getPathFromUri(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    return-object v2

    :cond_2
    if-eqz p2, :cond_3

    .line 746
    iget-object v5, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v2

    .line 747
    :goto_1
    new-instance v5, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;

    invoke-direct {v5, p0, v4, v3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-object v0

    .line 750
    :cond_5
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->fileUtils:Lio/flutter/plugins/imagepicker/FileUtils;

    iget-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    invoke-virtual {p1, p2, v1}, Lio/flutter/plugins/imagepicker/FileUtils;->getPathFromUri(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_6

    return-object v2

    .line 754
    :cond_6
    new-instance p2, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;

    invoke-direct {p2, p0, p1, v2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private getResizedImagePath(Ljava/lang/String;Lio/flutter/plugins/imagepicker/ImageSelectionOptions;)Ljava/lang/String;
    .locals 5

    .line 916
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->imageResizer:Lio/flutter/plugins/imagepicker/ImageResizer;

    .line 918
    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->getMaxWidth()Ljava/lang/Double;

    move-result-object v1

    .line 919
    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->getMaxHeight()Ljava/lang/Double;

    move-result-object v2

    .line 920
    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->getQuality()J

    move-result-wide v3

    long-to-int p2, v3

    .line 916
    invoke-virtual {v0, p1, v1, v2, p2}, Lio/flutter/plugins/imagepicker/ImageResizer;->resizeImageIfNeeded(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private grantUriPermissions(Landroid/content/Intent;Landroid/net/Uri;)V
    .locals 3

    .line 615
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 617
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_0

    const-wide/32 v1, 0x10000

    .line 620
    invoke-static {v1, v2}, Landroid/content/pm/PackageManager$ResolveInfoFlags;->of(J)Landroid/content/pm/PackageManager$ResolveInfoFlags;

    move-result-object v1

    .line 619
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 622
    :cond_0
    invoke-static {v0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->queryIntentActivitiesPreApi33(Landroid/content/pm/PackageManager;Landroid/content/Intent;)Ljava/util/List;

    move-result-object p1

    .line 625
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 626
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v1, v0, p2, v2}, Landroid/app/Activity;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method private handleCaptureImageResult(I)V
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 866
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCameraMediaUri:Landroid/net/Uri;

    .line 868
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->fileUriResolver:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 871
    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->retrievePendingCameraMediaUriPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    new-instance v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda7;

    invoke-direct {v1, p0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda7;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;)V

    .line 868
    invoke-interface {v0, p1, v1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;->getFullImagePath(Landroid/net/Uri;Lio/flutter/plugins/imagepicker/ImagePickerDelegate$OnPathReadyListener;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 877
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithSuccess(Ljava/lang/String;)V

    return-void
.end method

.method private handleCaptureVideoResult(I)V
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 882
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCameraMediaUri:Landroid/net/Uri;

    .line 883
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->fileUriResolver:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 886
    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->retrievePendingCameraMediaUriPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    new-instance v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda8;

    invoke-direct {v1, p0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda8;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;)V

    .line 883
    invoke-interface {v0, p1, v1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;->getFullImagePath(Landroid/net/Uri;Lio/flutter/plugins/imagepicker/ImagePickerDelegate$OnPathReadyListener;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 892
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithSuccess(Ljava/lang/String;)V

    return-void
.end method

.method private handleChooseImageResult(ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    .line 761
    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->getPathsFromIntent(Landroid/content/Intent;Z)Ljava/util/ArrayList;

    move-result-object p1

    if-nez p1, :cond_0

    .line 764
    const-string p1, "no_valid_image_uri"

    const-string p2, "Cannot find the selected image."

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 768
    :cond_0
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleMediaResult(Ljava/util/ArrayList;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 773
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithSuccess(Ljava/lang/String;)V

    return-void
.end method

.method private handleChooseMediaResult(ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_1

    const/4 p1, 0x1

    .line 814
    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->getPathsFromIntent(Landroid/content/Intent;Z)Ljava/util/ArrayList;

    move-result-object p1

    if-nez p1, :cond_0

    .line 817
    const-string p1, "no_valid_media_uri"

    const-string p2, "Cannot find the selected media."

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 821
    :cond_0
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleMediaResult(Ljava/util/ArrayList;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 826
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithSuccess(Ljava/lang/String;)V

    return-void
.end method

.method private handleChooseMultiImageResult(ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    .line 831
    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->getPathsFromIntent(Landroid/content/Intent;Z)Ljava/util/ArrayList;

    move-result-object p1

    if-nez p1, :cond_0

    .line 834
    const-string p1, "missing_valid_image_uri"

    const-string p2, "Cannot find at least one of the selected images."

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 839
    :cond_0
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleMediaResult(Ljava/util/ArrayList;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 844
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithSuccess(Ljava/lang/String;)V

    return-void
.end method

.method private handleChooseMultiVideoResult(ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    .line 778
    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->getPathsFromIntent(Landroid/content/Intent;Z)Ljava/util/ArrayList;

    move-result-object p1

    if-nez p1, :cond_0

    .line 781
    const-string p1, "missing_valid_video_uri"

    const-string p2, "Cannot find at least one of the selected videos."

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 786
    :cond_0
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleMediaResult(Ljava/util/ArrayList;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 791
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithSuccess(Ljava/lang/String;)V

    return-void
.end method

.method private handleChooseVideoResult(ILandroid/content/Intent;)V
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    if-eqz p2, :cond_2

    const/4 p1, 0x0

    .line 849
    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->getPathsFromIntent(Landroid/content/Intent;Z)Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 851
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 856
    :cond_0
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;

    iget-object p1, p1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;->path:Ljava/lang/String;

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithSuccess(Ljava/lang/String;)V

    return-void

    .line 852
    :cond_1
    :goto_0
    const-string p1, "no_valid_video_uri"

    const-string p2, "Cannot find the selected video."

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 p1, 0x0

    .line 861
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithSuccess(Ljava/lang/String;)V

    return-void
.end method

.method private handleMediaResult(Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;",
            ">;)V"
        }
    .end annotation

    .line 925
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallStateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 926
    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    if-eqz v1, :cond_0

    .line 927
    iget-object v1, v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->imageOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 929
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 931
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 933
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 934
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;

    .line 935
    iget-object v4, v3, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;->path:Ljava/lang/String;

    .line 936
    iget-object v5, v3, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;->mimeType:Ljava/lang/String;

    if-eqz v5, :cond_1

    iget-object v5, v3, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;->mimeType:Ljava/lang/String;

    const-string v6, "video/"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 937
    :cond_1
    iget-object v3, v3, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;->path:Ljava/lang/String;

    invoke-direct {p0, v3, v1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->getResizedImagePath(Ljava/lang/String;Lio/flutter/plugins/imagepicker/ImageSelectionOptions;)Ljava/lang/String;

    move-result-object v4

    .line 939
    :cond_2
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 941
    :cond_3
    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithListSuccess(Ljava/util/ArrayList;)V

    return-void

    .line 943
    :cond_4
    :goto_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_5

    .line 944
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;

    iget-object v1, v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;->path:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 946
    :cond_5
    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithListSuccess(Ljava/util/ArrayList;)V

    return-void

    :catchall_0
    move-exception p1

    .line 929
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private synthetic lambda$handleCaptureImageResult$7(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 872
    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleImageResult(Ljava/lang/String;Z)V

    return-void
.end method

.method private synthetic lambda$onActivityResult$0(ILandroid/content/Intent;)V
    .locals 0

    .line 689
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleChooseImageResult(ILandroid/content/Intent;)V

    return-void
.end method

.method private synthetic lambda$onActivityResult$1(ILandroid/content/Intent;)V
    .locals 0

    .line 692
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleChooseMultiImageResult(ILandroid/content/Intent;)V

    return-void
.end method

.method private synthetic lambda$onActivityResult$2(ILandroid/content/Intent;)V
    .locals 0

    .line 695
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleChooseMultiVideoResult(ILandroid/content/Intent;)V

    return-void
.end method

.method private synthetic lambda$onActivityResult$3(I)V
    .locals 0

    .line 698
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleCaptureImageResult(I)V

    return-void
.end method

.method private synthetic lambda$onActivityResult$4(ILandroid/content/Intent;)V
    .locals 0

    .line 701
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleChooseMediaResult(ILandroid/content/Intent;)V

    return-void
.end method

.method private synthetic lambda$onActivityResult$5(ILandroid/content/Intent;)V
    .locals 0

    .line 704
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleChooseVideoResult(ILandroid/content/Intent;)V

    return-void
.end method

.method private synthetic lambda$onActivityResult$6(I)V
    .locals 0

    .line 707
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->handleCaptureVideoResult(I)V

    return-void
.end method

.method private launchMultiPickImageFromGalleryIntent(Ljava/lang/Boolean;I)V
    .locals 2

    .line 484
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 485
    new-instance p1, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;

    invoke-direct {p1, p2}, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;-><init>(I)V

    iget-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    new-instance v0, Landroidx/activity/result/PickVisualMediaRequest$Builder;

    invoke-direct {v0}, Landroidx/activity/result/PickVisualMediaRequest$Builder;-><init>()V

    sget-object v1, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;->INSTANCE:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;

    .line 490
    invoke-virtual {v0, v1}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->setMediaType(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;

    move-result-object v0

    .line 491
    invoke-virtual {v0}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->build()Landroidx/activity/result/PickVisualMediaRequest;

    move-result-object v0

    .line 487
    invoke-virtual {p1, p2, v0}, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;->createIntent(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 493
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 494
    const-string p2, "image/*"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 495
    const-string p2, "android.intent.extra.ALLOW_MULTIPLE"

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 497
    :goto_0
    iget-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    const/16 v0, 0x92a

    invoke-virtual {p2, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private launchMultiPickVideoFromGalleryIntent(Ljava/lang/Boolean;I)V
    .locals 2

    .line 519
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 520
    new-instance p1, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;

    invoke-direct {p1, p2}, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;-><init>(I)V

    iget-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    new-instance v0, Landroidx/activity/result/PickVisualMediaRequest$Builder;

    invoke-direct {v0}, Landroidx/activity/result/PickVisualMediaRequest$Builder;-><init>()V

    sget-object v1, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;->INSTANCE:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;

    .line 525
    invoke-virtual {v0, v1}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->setMediaType(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;

    move-result-object v0

    .line 526
    invoke-virtual {v0}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->build()Landroidx/activity/result/PickVisualMediaRequest;

    move-result-object v0

    .line 522
    invoke-virtual {p1, p2, v0}, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;->createIntent(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 528
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 529
    const-string p2, "video/*"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 530
    const-string p2, "android.intent.extra.ALLOW_MULTIPLE"

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 532
    :goto_0
    iget-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    const/16 v0, 0x92c

    invoke-virtual {p2, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private launchPickImageFromGalleryIntent(Ljava/lang/Boolean;)V
    .locals 3

    .line 467
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 468
    new-instance p1, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;

    invoke-direct {p1}, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;-><init>()V

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    new-instance v1, Landroidx/activity/result/PickVisualMediaRequest$Builder;

    invoke-direct {v1}, Landroidx/activity/result/PickVisualMediaRequest$Builder;-><init>()V

    sget-object v2, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;->INSTANCE:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;

    .line 473
    invoke-virtual {v1, v2}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->setMediaType(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;

    move-result-object v1

    .line 474
    invoke-virtual {v1}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->build()Landroidx/activity/result/PickVisualMediaRequest;

    move-result-object v1

    .line 470
    invoke-virtual {p1, v0, v1}, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;->createIntent(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 476
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 477
    const-string v0, "image/*"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 479
    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    const/16 v1, 0x926

    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private launchPickMediaFromGalleryIntent(Lio/flutter/plugins/imagepicker/GeneralOptions;)V
    .locals 4

    .line 309
    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/GeneralOptions;->getUsePhotoPicker()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 310
    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/GeneralOptions;->getAllowMultiple()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    invoke-static {p1}, Lio/flutter/plugins/imagepicker/ImagePickerUtils;->getLimitFromOption(Lio/flutter/plugins/imagepicker/GeneralOptions;)I

    move-result p1

    .line 313
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;

    invoke-direct {v0, p1}, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;-><init>(I)V

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    new-instance v1, Landroidx/activity/result/PickVisualMediaRequest$Builder;

    invoke-direct {v1}, Landroidx/activity/result/PickVisualMediaRequest$Builder;-><init>()V

    sget-object v2, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;->INSTANCE:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;

    .line 318
    invoke-virtual {v1, v2}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->setMediaType(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;

    move-result-object v1

    .line 320
    invoke-virtual {v1}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->build()Landroidx/activity/result/PickVisualMediaRequest;

    move-result-object v1

    .line 315
    invoke-virtual {v0, p1, v1}, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;->createIntent(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 322
    :cond_0
    new-instance p1, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;

    invoke-direct {p1}, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;-><init>()V

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    new-instance v1, Landroidx/activity/result/PickVisualMediaRequest$Builder;

    invoke-direct {v1}, Landroidx/activity/result/PickVisualMediaRequest$Builder;-><init>()V

    sget-object v2, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;->INSTANCE:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;

    .line 327
    invoke-virtual {v1, v2}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->setMediaType(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;

    move-result-object v1

    .line 329
    invoke-virtual {v1}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->build()Landroidx/activity/result/PickVisualMediaRequest;

    move-result-object v1

    .line 324
    invoke-virtual {p1, v0, v1}, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;->createIntent(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 332
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 333
    const-string v1, "*/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, 0x2

    .line 334
    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "video/*"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "image/*"

    aput-object v3, v1, v2

    .line 335
    const-string v2, "CONTENT_TYPE"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 336
    const-string v1, "android.intent.extra.ALLOW_MULTIPLE"

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/GeneralOptions;->getAllowMultiple()Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-object p1, v0

    .line 338
    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    const/16 v1, 0x92b

    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private launchPickVideoFromGalleryIntent(Ljava/lang/Boolean;)V
    .locals 3

    .line 358
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 359
    new-instance p1, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;

    invoke-direct {p1}, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;-><init>()V

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    new-instance v1, Landroidx/activity/result/PickVisualMediaRequest$Builder;

    invoke-direct {v1}, Landroidx/activity/result/PickVisualMediaRequest$Builder;-><init>()V

    sget-object v2, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;->INSTANCE:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;

    .line 364
    invoke-virtual {v1, v2}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->setMediaType(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;

    move-result-object v1

    .line 365
    invoke-virtual {v1}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->build()Landroidx/activity/result/PickVisualMediaRequest;

    move-result-object v1

    .line 361
    invoke-virtual {p1, v0, v1}, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;->createIntent(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 367
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 368
    const-string v0, "video/*"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 371
    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    const/16 v1, 0x930

    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private launchTakeImageWithCameraIntent()V
    .locals 4

    .line 564
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 565
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cameraDevice:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;

    sget-object v2, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;->FRONT:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;

    if-ne v1, v2, :cond_0

    .line 566
    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->useFrontCamera(Landroid/content/Intent;)V

    .line 569
    :cond_0
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->createTemporaryWritableImageFile()Ljava/io/File;

    move-result-object v1

    .line 570
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "file:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iput-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCameraMediaUri:Landroid/net/Uri;

    .line 572
    iget-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->fileUriResolver:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->fileProviderName:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;->resolveFileProviderUriForFile(Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    .line 573
    const-string v3, "output"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 574
    invoke-direct {p0, v0, v2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->grantUriPermissions(Landroid/content/Intent;Landroid/net/Uri;)V

    .line 577
    :try_start_0
    iget-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    const/16 v3, 0x927

    invoke-virtual {v2, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 582
    :catch_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 584
    invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V

    .line 586
    :goto_0
    const-string v0, "no_available_camera"

    const-string v1, "No cameras available for taking pictures."

    invoke-direct {p0, v0, v1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private launchTakeVideoWithCameraIntent()V
    .locals 4

    .line 396
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.VIDEO_CAPTURE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 399
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallStateLock:Ljava/lang/Object;

    monitor-enter v1

    .line 400
    :try_start_0
    iget-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    if-eqz v2, :cond_0

    .line 401
    iget-object v2, v2, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->videoOptions:Lio/flutter/plugins/imagepicker/VideoSelectionOptions;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 403
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    .line 405
    invoke-virtual {v2}, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->getMaxDurationSeconds()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 406
    invoke-virtual {v2}, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->getMaxDurationSeconds()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    .line 407
    const-string v2, "android.intent.extra.durationLimit"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 409
    :cond_1
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cameraDevice:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;

    sget-object v2, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;->FRONT:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;

    if-ne v1, v2, :cond_2

    .line 410
    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->useFrontCamera(Landroid/content/Intent;)V

    .line 413
    :cond_2
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->createTemporaryWritableVideoFile()Ljava/io/File;

    move-result-object v1

    .line 414
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "file:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iput-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCameraMediaUri:Landroid/net/Uri;

    .line 416
    iget-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->fileUriResolver:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->fileProviderName:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$FileUriResolver;->resolveFileProviderUriForFile(Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    .line 417
    const-string v3, "output"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 418
    invoke-direct {p0, v0, v2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->grantUriPermissions(Landroid/content/Intent;Landroid/net/Uri;)V

    .line 421
    :try_start_1
    iget-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->activity:Landroid/app/Activity;

    const/16 v3, 0x931

    invoke-virtual {v2, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 426
    :catch_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 428
    invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V

    .line 430
    :goto_1
    const-string v0, "no_available_camera"

    const-string v1, "No cameras available for taking pictures."

    invoke-direct {p0, v0, v1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v0

    .line 403
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method private needRequestCameraPermission()Z
    .locals 1

    .line 557
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->permissionManager:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 560
    :cond_0
    invoke-interface {v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;->needRequestCameraPermission()Z

    move-result v0

    return v0
.end method

.method private static queryIntentActivitiesPreApi33(Landroid/content/pm/PackageManager;Landroid/content/Intent;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/pm/PackageManager;",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    const/high16 v0, 0x10000

    .line 637
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 639
    const-string p1, "ImagePickerDelegate"

    const-string v0, "Fallback query for intent activities failed. Ensure the intent is properly formatted and check if Android 11+ package visibility restrictions require a specific <queries> declaration in your app\'s AndroidManifest.xml."

    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 645
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private setPendingOptionsAndResult(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
            "Lio/flutter/plugins/imagepicker/VideoSelectionOptions;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    .line 957
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallStateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 958
    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    .line 959
    monitor-exit v0

    return p1

    .line 961
    :cond_0
    new-instance v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    invoke-direct {v1, p1, p2, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;-><init>(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    .line 962
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 965
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->clear()V

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    .line 962
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private useFrontCamera(Landroid/content/Intent;)V
    .locals 2

    .line 1043
    const-string v0, "android.intent.extras.CAMERA_FACING"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1044
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 1045
    const-string v0, "android.intent.extra.USE_FRONT_CAMERA"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_0
    return-void
.end method


# virtual methods
.method public chooseImageFromGallery(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;ZLkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
            "Z",
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

    const/4 v0, 0x0

    .line 441
    invoke-direct {p0, p1, v0, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->setPendingOptionsAndResult(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 442
    invoke-direct {p0, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithAlreadyActiveError(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 446
    :cond_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->launchPickImageFromGalleryIntent(Ljava/lang/Boolean;)V

    return-void
.end method

.method public chooseMediaFromGallery(Lio/flutter/plugins/imagepicker/MediaSelectionOptions;Lio/flutter/plugins/imagepicker/GeneralOptions;Lkotlin/jvm/functions/Function1;)V
    .locals 1
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

    .line 299
    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->getImageSelectionOptions()Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->setPendingOptionsAndResult(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 300
    invoke-direct {p0, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithAlreadyActiveError(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 304
    :cond_0
    invoke-direct {p0, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->launchPickMediaFromGalleryIntent(Lio/flutter/plugins/imagepicker/GeneralOptions;)V

    return-void
.end method

.method public chooseMultiImageFromGallery(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;ZILkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
            "ZI",
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

    const/4 v0, 0x0

    .line 457
    invoke-direct {p0, p1, v0, p4}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->setPendingOptionsAndResult(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 458
    invoke-direct {p0, p4}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithAlreadyActiveError(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 462
    :cond_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->launchMultiPickImageFromGalleryIntent(Ljava/lang/Boolean;I)V

    return-void
.end method

.method public chooseMultiVideoFromGallery(Lio/flutter/plugins/imagepicker/VideoSelectionOptions;ZILkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/VideoSelectionOptions;",
            "ZI",
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

    const/4 v0, 0x0

    .line 509
    invoke-direct {p0, v0, p1, p4}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->setPendingOptionsAndResult(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 510
    invoke-direct {p0, p4}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithAlreadyActiveError(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 514
    :cond_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->launchMultiPickVideoFromGalleryIntent(Ljava/lang/Boolean;I)V

    return-void
.end method

.method public chooseVideoFromGallery(Lio/flutter/plugins/imagepicker/VideoSelectionOptions;ZLkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/VideoSelectionOptions;",
            "Z",
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

    const/4 v0, 0x0

    .line 348
    invoke-direct {p0, v0, p1, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->setPendingOptionsAndResult(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 349
    invoke-direct {p0, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithAlreadyActiveError(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 353
    :cond_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->launchPickVideoFromGalleryIntent(Ljava/lang/Boolean;)V

    return-void
.end method

.method handleImageResult(Ljava/lang/String;Z)V
    .locals 2

    .line 897
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallStateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 898
    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    if-eqz v1, :cond_0

    .line 899
    iget-object v1, v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->imageOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 901
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    .line 904
    invoke-direct {p0, p1, v1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->getResizedImagePath(Ljava/lang/String;Lio/flutter/plugins/imagepicker/ImageSelectionOptions;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 906
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p2, :cond_1

    .line 907
    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 909
    :cond_1
    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithSuccess(Ljava/lang/String;)V

    return-void

    .line 911
    :cond_2
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithSuccess(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    .line 901
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 1

    const/16 v0, 0x926

    if-eq p1, v0, :cond_3

    const/16 v0, 0x927

    if-eq p1, v0, :cond_2

    const/16 v0, 0x930

    if-eq p1, v0, :cond_1

    const/16 v0, 0x931

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    .line 695
    :pswitch_0
    new-instance p1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda2;

    invoke-direct {p1, p0, p2, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda2;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V

    goto :goto_0

    .line 701
    :pswitch_1
    new-instance p1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda4;

    invoke-direct {p1, p0, p2, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda4;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V

    goto :goto_0

    .line 692
    :pswitch_2
    new-instance p1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda1;

    invoke-direct {p1, p0, p2, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda1;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V

    goto :goto_0

    .line 707
    :cond_0
    new-instance p1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda6;

    invoke-direct {p1, p0, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda6;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;I)V

    goto :goto_0

    .line 704
    :cond_1
    new-instance p1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda5;

    invoke-direct {p1, p0, p2, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda5;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V

    goto :goto_0

    .line 698
    :cond_2
    new-instance p1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda3;

    invoke-direct {p1, p0, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda3;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;I)V

    goto :goto_0

    .line 689
    :cond_3
    new-instance p1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0, p2, p3}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$$ExternalSyntheticLambda0;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V

    .line 713
    :goto_0
    iget-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x92a
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 3

    .line 652
    array-length p2, p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lez p2, :cond_0

    aget p2, p3, v1

    if-nez p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    const/16 p3, 0x933

    const/16 v2, 0x929

    if-eq p1, v2, :cond_2

    if-eq p1, p3, :cond_1

    return v1

    :cond_1
    if-eqz p2, :cond_3

    .line 663
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->launchTakeVideoWithCameraIntent()V

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    .line 658
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->launchTakeImageWithCameraIntent()V

    :cond_3
    :goto_1
    if-nez p2, :cond_5

    if-eq p1, v2, :cond_4

    if-eq p1, p3, :cond_4

    goto :goto_2

    .line 674
    :cond_4
    const-string p1, "camera_access_denied"

    const-string p2, "The user did not allow camera access."

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_2
    return v0
.end method

.method retrieveLostImage()Lio/flutter/plugins/imagepicker/CacheRetrievalResult;
    .locals 9

    .line 262
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->getCacheMap()Ljava/util/Map;

    move-result-object v0

    .line 263
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    .line 267
    :cond_0
    const-string v1, "type"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    .line 269
    const-string v3, "pathList"

    .line 270
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-eqz v1, :cond_4

    if-nez v3, :cond_1

    goto :goto_2

    .line 276
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 277
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 278
    const-string v5, "maxWidth"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Double;

    .line 279
    const-string v6, "maxHeight"

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Double;

    .line 280
    const-string v7, "imageQuality"

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-nez v7, :cond_2

    const/16 v7, 0x64

    goto :goto_1

    .line 281
    :cond_2
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 283
    :goto_1
    iget-object v8, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->imageResizer:Lio/flutter/plugins/imagepicker/ImageResizer;

    invoke-virtual {v8, v4, v5, v6, v7}, Lio/flutter/plugins/imagepicker/ImageResizer;->resizeImageIfNeeded(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 286
    :cond_3
    iget-object v3, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-virtual {v3}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->clear()V

    .line 288
    new-instance v3, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;

    const-string v4, "error"

    .line 289
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    invoke-direct {v3, v1, v0, v2}, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;-><init>(Lio/flutter/plugins/imagepicker/CacheRetrievalType;Lio/flutter/plugins/imagepicker/CacheRetrievalError;Ljava/util/List;)V

    return-object v3

    .line 273
    :cond_4
    :goto_2
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->clear()V

    return-object v2
.end method

.method saveStateBeforeResult()V
    .locals 3

    .line 239
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallStateLock:Ljava/lang/Object;

    monitor-enter v0

    .line 240
    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCallState:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;

    if-nez v1, :cond_0

    .line 241
    monitor-exit v0

    return-void

    .line 243
    :cond_0
    iget-object v1, v1, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->imageOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    .line 244
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    if-eqz v1, :cond_1

    .line 248
    sget-object v2, Lio/flutter/plugins/imagepicker/ImagePickerCache$CacheType;->IMAGE:Lio/flutter/plugins/imagepicker/ImagePickerCache$CacheType;

    goto :goto_0

    .line 249
    :cond_1
    sget-object v2, Lio/flutter/plugins/imagepicker/ImagePickerCache$CacheType;->VIDEO:Lio/flutter/plugins/imagepicker/ImagePickerCache$CacheType;

    .line 246
    :goto_0
    invoke-virtual {v0, v2}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->saveType(Lio/flutter/plugins/imagepicker/ImagePickerCache$CacheType;)V

    if-eqz v1, :cond_2

    .line 251
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->saveDimensionWithOutputOptions(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;)V

    .line 254
    :cond_2
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->pendingCameraMediaUri:Landroid/net/Uri;

    if-eqz v0, :cond_3

    .line 256
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cache:Lio/flutter/plugins/imagepicker/ImagePickerCache;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/imagepicker/ImagePickerCache;->savePendingCameraMediaUriPath(Landroid/net/Uri;)V

    :cond_3
    return-void

    :catchall_0
    move-exception v1

    .line 244
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method setCameraDevice(Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->cameraDevice:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$CameraDevice;

    return-void
.end method

.method public takeImageWithCamera(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
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

    const/4 v0, 0x0

    .line 542
    invoke-direct {p0, p1, v0, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->setPendingOptionsAndResult(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 543
    invoke-direct {p0, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithAlreadyActiveError(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 547
    :cond_0
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->needRequestCameraPermission()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->permissionManager:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;

    .line 548
    const-string p2, "android.permission.CAMERA"

    invoke-interface {p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;->isPermissionGranted(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 549
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->permissionManager:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;

    const/16 v0, 0x929

    invoke-interface {p1, p2, v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;->askForPermission(Ljava/lang/String;I)V

    return-void

    .line 553
    :cond_1
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->launchTakeImageWithCameraIntent()V

    return-void
.end method

.method public takeVideoWithCamera(Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/VideoSelectionOptions;",
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

    const/4 v0, 0x0

    .line 380
    invoke-direct {p0, v0, p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->setPendingOptionsAndResult(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 381
    invoke-direct {p0, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->finishWithAlreadyActiveError(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 385
    :cond_0
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->needRequestCameraPermission()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->permissionManager:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;

    .line 386
    const-string p2, "android.permission.CAMERA"

    invoke-interface {p1, p2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;->isPermissionGranted(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 387
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->permissionManager:Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;

    const/16 v0, 0x933

    invoke-interface {p1, p2, v0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PermissionManager;->askForPermission(Ljava/lang/String;I)V

    return-void

    .line 392
    :cond_1
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->launchTakeVideoWithCameraIntent()V

    return-void
.end method
