.class public Lio/flutter/embedding/engine/loader/FlutterLoader;
.super Ljava/lang/Object;
.source "FlutterLoader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;,
        Lio/flutter/embedding/engine/loader/FlutterLoader$InitResult;
    }
.end annotation


# static fields
.field private static final AOT_VMSERVICE_SHARED_LIBRARY_NAME:Ljava/lang/String; = "aot-vmservice-shared-library-name"

.field private static final DEFAULT_KERNEL_BLOB:Ljava/lang/String; = "kernel_blob.bin"

.field private static final DEFAULT_LIBRARY:Ljava/lang/String; = "libflutter.so"

.field private static final SNAPSHOT_ASSET_PATH_KEY:Ljava/lang/String; = "snapshot-asset-path"

.field private static final TAG:Ljava/lang/String; = "FlutterLoader"

.field private static final VMSERVICE_SNAPSHOT_LIBRARY:Ljava/lang/String; = "libvmservice_snapshot.so"

.field private static instance:Lio/flutter/embedding/engine/loader/FlutterLoader;


# instance fields
.field private enableSoftwareRendering:Z

.field private executorService:Ljava/util/concurrent/ExecutorService;

.field private flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

.field private flutterJNI:Lio/flutter/embedding/engine/FlutterJNI;

.field initResultFuture:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Lio/flutter/embedding/engine/loader/FlutterLoader$InitResult;",
            ">;"
        }
    .end annotation
.end field

.field private initStartTimestampMillis:J

.field initialized:Z

.field private settings:Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-static {}, Lio/flutter/FlutterInjector;->instance()Lio/flutter/FlutterInjector;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/FlutterInjector;->getFlutterJNIFactory()Lio/flutter/embedding/engine/FlutterJNI$Factory;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI$Factory;->provideFlutterJNI()Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/embedding/engine/loader/FlutterLoader;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 1

    .line 71
    invoke-static {}, Lio/flutter/FlutterInjector;->instance()Lio/flutter/FlutterInjector;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/FlutterInjector;->executorService()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/flutter/embedding/engine/loader/FlutterLoader;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->enableSoftwareRendering:Z

    .line 86
    iput-boolean v0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->initialized:Z

    .line 82
    iput-object p1, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterJNI:Lio/flutter/embedding/engine/FlutterJNI;

    .line 83
    iput-object p2, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->executorService:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic access$000(Lio/flutter/embedding/engine/loader/FlutterLoader;Landroid/content/Context;)Lio/flutter/embedding/engine/loader/ResourceExtractor;
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lio/flutter/embedding/engine/loader/FlutterLoader;->initResources(Landroid/content/Context;)Lio/flutter/embedding/engine/loader/ResourceExtractor;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lio/flutter/embedding/engine/loader/FlutterLoader;)Lio/flutter/embedding/engine/FlutterJNI;
    .locals 0

    .line 39
    iget-object p0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterJNI:Lio/flutter/embedding/engine/FlutterJNI;

    return-object p0
.end method

.method static synthetic access$200(Lio/flutter/embedding/engine/loader/FlutterLoader;)Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;
    .locals 0

    .line 39
    iget-object p0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    return-object p0
.end method

.method static synthetic access$300(Lio/flutter/embedding/engine/loader/FlutterLoader;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 39
    iget-object p0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->executorService:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method private fullAssetPathFrom(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 742
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    iget-object v1, v1, Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;->flutterAssetsDir:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getSafeAotSharedLibraryName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 597
    const-string v0, "External path "

    const-string v1, "FlutterLoader"

    invoke-virtual {p0, p2}, Lio/flutter/embedding/engine/loader/FlutterLoader;->getFileFromPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    const/4 v2, 0x0

    .line 601
    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 612
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    .line 613
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1

    .line 614
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 615
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    .line 617
    const-string v3, ".so"

    invoke-virtual {p2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz p1, :cond_0

    if-eqz v3, :cond_0

    return-object p2

    .line 623
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, " rejected; not overriding aot-shared-library-name."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 603
    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 606
    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, " is not a valid path. Please ensure this shared AOT library exists."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 603
    invoke-static {v1, p1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method private initResources(Landroid/content/Context;)Lio/flutter/embedding/engine/loader/ResourceExtractor;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method private maybeAddAotSharedLibraryNameArg(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 548
    const-string v0, "FlutterLoader"

    .line 551
    :try_start_0
    invoke-direct {p0, p1, p2}, Lio/flutter/embedding/engine/loader/FlutterLoader;->getSafeAotSharedLibraryName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 553
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error while validating AOT shared library name flag: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_0

    .line 560
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    iget-object v0, v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->engineArgument:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p3, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 564
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Skipping unsafe AOT shared library name flag: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, ". Please ensure that the library is vetted and placed in your application\'s internal storage."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public automaticallyRegisterPlugins()Z
    .locals 1

    .line 737
    iget-object v0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    iget-boolean v0, v0, Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;->automaticallyRegisterPlugins:Z

    return v0
.end method

.method public ensureInitializationComplete(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 259
    invoke-virtual {p0, p1, p2, v0}, Lio/flutter/embedding/engine/loader/FlutterLoader;->ensureInitializationComplete(Landroid/content/Context;[Ljava/lang/String;Z)V

    return-void
.end method

.method ensureInitializationComplete(Landroid/content/Context;[Ljava/lang/String;Z)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v0, p2

    .line 274
    const-string v11, "FlutterLoader"

    .line 0
    const-string v2, "--icu-native-lib-path="

    .line 274
    iget-boolean v4, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->initialized:Z

    if-eqz v4, :cond_0

    goto/16 :goto_a

    .line 277
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    if-ne v4, v5, :cond_1f

    .line 281
    iget-object v4, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->settings:Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;

    if-eqz v4, :cond_1e

    .line 286
    :try_start_0
    const-string v4, "FlutterLoader#ensureInitializationComplete"

    invoke-static {v4}, Lio/flutter/util/TraceSection;->scoped(Ljava/lang/String;)Lio/flutter/util/TraceSection;

    move-result-object v12
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 287
    :try_start_1
    iget-object v4, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->initResultFuture:Ljava/util/concurrent/Future;

    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/flutter/embedding/engine/loader/FlutterLoader$InitResult;

    .line 289
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 292
    const-string v6, "--icu-symbol-prefix=_binary_icudtl_dat"

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 293
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    iget-object v2, v2, Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, "libflutter.so"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 304
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 306
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x80

    .line 305
    invoke-virtual {v2, v6, v7}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 307
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 311
    const-string v6, " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line."

    if-eqz v2, :cond_10

    .line 312
    :try_start_2
    sget-object v8, Lio/flutter/embedding/engine/FlutterEngineFlags;->ALL_FLAGS:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_11

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 313
    iget-object v15, v14, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->metadataKey:Ljava/lang/String;

    .line 314
    invoke-virtual {v2, v15}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v16

    if-nez v16, :cond_1

    :goto_1
    move-object/from16 v17, v8

    goto/16 :goto_6

    .line 320
    :cond_1
    sget-object v13, Lio/flutter/embedding/engine/FlutterEngineFlags;->TEST_FLAG:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    if-ne v14, v13, :cond_2

    .line 321
    const-string v13, "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader."

    invoke-static {v11, v13}, Lio/flutter/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 325
    :cond_2
    invoke-static {v14}, Lio/flutter/embedding/engine/FlutterEngineFlags;->isDisabled(Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;)Z

    move-result v13

    if-nez v13, :cond_f

    .line 330
    invoke-static {v14}, Lio/flutter/embedding/engine/FlutterEngineFlags;->getReplacementFlagIfDeprecated(Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;)Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    move-result-object v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v7, "Flag with metadata key "

    if-eqz v13, :cond_3

    .line 331
    :try_start_3
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v8

    const-string v8, "If you are trying to specify "

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v13, " in your application manifest, please make sure to use the new metadata key name: "

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 336
    invoke-static {v14}, Lio/flutter/embedding/engine/FlutterEngineFlags;->getReplacementFlagIfDeprecated(Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;)Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    move-result-object v13

    iget-object v13, v13, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->metadataKey:Ljava/lang/String;

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 331
    invoke-static {v11, v8}, Lio/flutter/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    move-object/from16 v17, v8

    .line 337
    iget-boolean v8, v14, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->allowedInRelease:Z

    if-nez v8, :cond_4

    if-eqz p3, :cond_4

    .line 339
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_6

    .line 349
    :cond_4
    :goto_2
    sget-object v8, Lio/flutter/embedding/engine/FlutterEngineFlags;->OLD_GEN_HEAP_SIZE:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    if-ne v14, v8, :cond_5

    const/4 v9, 0x1

    goto :goto_3

    .line 353
    :cond_5
    sget-object v8, Lio/flutter/embedding/engine/FlutterEngineFlags;->LEAK_VM:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    if-ne v14, v8, :cond_6

    const/4 v10, 0x1

    goto :goto_3

    .line 356
    :cond_6
    sget-object v8, Lio/flutter/embedding/engine/FlutterEngineFlags;->ENABLE_SOFTWARE_RENDERING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    if-ne v14, v8, :cond_7

    .line 359
    sget-object v8, Lio/flutter/embedding/engine/FlutterEngineFlags;->ENABLE_SOFTWARE_RENDERING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    iget-object v8, v8, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->metadataKey:Ljava/lang/String;

    const/4 v13, 0x0

    .line 360
    invoke-virtual {v2, v8, v13}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v8

    iput-boolean v8, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->enableSoftwareRendering:Z

    goto :goto_3

    .line 362
    :cond_7
    sget-object v8, Lio/flutter/embedding/engine/FlutterEngineFlags;->AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    if-eq v14, v8, :cond_c

    sget-object v8, Lio/flutter/embedding/engine/FlutterEngineFlags;->DEPRECATED_AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    if-ne v14, v8, :cond_8

    goto :goto_5

    .line 380
    :cond_8
    :goto_3
    iget-object v8, v14, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->engineArgument:Ljava/lang/String;

    .line 383
    invoke-virtual {v14}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->hasCommandLineValue()Z

    move-result v13

    if-eqz v13, :cond_b

    .line 384
    invoke-virtual {v2, v15}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_9

    .line 385
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    goto :goto_4

    :cond_9
    const/4 v13, 0x0

    :goto_4
    if-nez v13, :cond_a

    .line 387
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " requires a value, but no value was found. Please specify a value."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    .line 394
    :cond_a
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_b
    const/4 v13, 0x0

    .line 401
    invoke-virtual {v2, v15, v13}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_e

    .line 402
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 366
    :cond_c
    :goto_5
    invoke-virtual {v2, v15}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_d

    .line 368
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Flag "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " was specified with an empty path. Please specify a path to the desired AOT shared library."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    .line 374
    :cond_d
    invoke-direct {v1, v3, v7, v5}, Lio/flutter/embedding/engine/loader/FlutterLoader;->maybeAddAotSharedLibraryNameArg(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    :cond_e
    :goto_6
    move-object/from16 v8, v17

    goto/16 :goto_0

    .line 327
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is disabled and no longer allowed. Please remove this flag from your application manifest."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    const/4 v9, 0x0

    const/4 v10, 0x0

    :cond_11
    if-eqz v0, :cond_17

    .line 411
    array-length v2, v0

    const/4 v13, 0x0

    :goto_7
    if-ge v13, v2, :cond_17

    aget-object v7, v0, v13

    .line 412
    invoke-static {v7}, Lio/flutter/embedding/engine/FlutterEngineFlags;->getFlagByEngineArgument(Ljava/lang/String;)Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    move-result-object v8

    if-nez v8, :cond_12

    .line 416
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 418
    :cond_12
    sget-object v14, Lio/flutter/embedding/engine/FlutterEngineFlags;->TEST_FLAG:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    invoke-virtual {v8, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_13

    .line 419
    const-string v7, "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader."

    invoke-static {v11, v7}, Lio/flutter/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    .line 423
    :cond_13
    sget-object v14, Lio/flutter/embedding/engine/FlutterEngineFlags;->AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    invoke-virtual {v8, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_16

    sget-object v14, Lio/flutter/embedding/engine/FlutterEngineFlags;->DEPRECATED_AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 424
    invoke-virtual {v8, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_14

    goto :goto_8

    .line 431
    :cond_14
    iget-boolean v8, v8, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->allowedInRelease:Z

    if-nez v8, :cond_15

    if-eqz p3, :cond_15

    .line 433
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Command line argument "

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    .line 441
    :cond_15
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 427
    :cond_16
    :goto_8
    sget-object v8, Lio/flutter/embedding/engine/FlutterEngineFlags;->AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    iget-object v8, v8, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->engineArgument:Ljava/lang/String;

    .line 428
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 429
    invoke-direct {v1, v3, v7, v5}, Lio/flutter/embedding/engine/loader/FlutterLoader;->maybeAddAotSharedLibraryNameArg(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    :goto_9
    add-int/lit8 v13, v13, 0x1

    goto :goto_7

    .line 464
    :cond_17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lio/flutter/embedding/engine/FlutterEngineFlags;->AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    iget-object v2, v2, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->engineArgument:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    iget-object v2, v2, Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;->aotSharedLibraryName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 471
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lio/flutter/embedding/engine/FlutterEngineFlags;->AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    iget-object v2, v2, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->engineArgument:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    iget-object v2, v2, Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    iget-object v2, v2, Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;->aotSharedLibraryName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 485
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "--cache-dir-path="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v4, Lio/flutter/embedding/engine/loader/FlutterLoader$InitResult;->engineCachesPath:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 486
    iget-object v0, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    iget-object v0, v0, Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;->domainNetworkPolicy:Ljava/lang/String;

    if-eqz v0, :cond_18

    .line 487
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "--domain-network-policy="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    iget-object v2, v2, Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;->domainNetworkPolicy:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 489
    :cond_18
    iget-object v0, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->settings:Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;->getLogTag()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 490
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "--log-tag="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->settings:Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;

    invoke-virtual {v2}, Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;->getLogTag()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_19
    if-nez v9, :cond_1a

    .line 495
    const-string v0, "activity"

    .line 496
    invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 497
    new-instance v2, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v2}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 498
    invoke-virtual {v0, v2}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 499
    iget-wide v6, v2, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    long-to-double v6, v6

    const-wide v8, 0x412e848000000000L    # 1000000.0

    div-double/2addr v6, v8

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    div-double/2addr v6, v8

    double-to-int v0, v6

    .line 500
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lio/flutter/embedding/engine/FlutterEngineFlags;->OLD_GEN_HEAP_SIZE:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    iget-object v6, v6, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->engineArgument:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 502
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 500
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 505
    :cond_1a
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 506
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 507
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x30

    .line 511
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "--resource-cache-max-bytes-threshold="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 513
    const-string v0, "--prefetched-default-font-manager"

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v10, :cond_1b

    .line 516
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lio/flutter/embedding/engine/FlutterEngineFlags;->LEAK_VM:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    iget-object v2, v2, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->engineArgument:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "true"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 519
    :cond_1b
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    iget-wide v8, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->initStartTimestampMillis:J

    sub-long v8, v6, v8

    .line 521
    iget-object v2, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterJNI:Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v13, 0x0

    new-array v0, v13, [Ljava/lang/String;

    .line 523
    invoke-interface {v5, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iget-object v6, v4, Lio/flutter/embedding/engine/loader/FlutterLoader$InitResult;->appStoragePath:Ljava/lang/String;

    iget-object v7, v4, Lio/flutter/embedding/engine/loader/FlutterLoader$InitResult;->engineCachesPath:Ljava/lang/String;

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v5, 0x0

    move-object v4, v0

    .line 521
    invoke-virtual/range {v2 .. v10}, Lio/flutter/embedding/engine/FlutterJNI;->init(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    const/4 v0, 0x1

    .line 530
    iput-boolean v0, v1, Lio/flutter/embedding/engine/loader/FlutterLoader;->initialized:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v12, :cond_1c

    .line 531
    :try_start_4
    invoke-virtual {v12}, Lio/flutter/util/TraceSection;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :cond_1c
    :goto_a
    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    if-eqz v12, :cond_1d

    .line 286
    :try_start_5
    invoke-virtual {v12}, Lio/flutter/util/TraceSection;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1d
    :goto_b
    throw v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception v0

    .line 532
    const-string v2, "Flutter initialization failed."

    invoke-static {v11, v2, v0}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 533
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 282
    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "ensureInitializationComplete must be called after startInitialization"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 278
    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "ensureInitializationComplete must be called on the main thread"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ensureInitializationCompleteAsync(Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 7

    .line 645
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 649
    iget-object v0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->settings:Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;

    if-eqz v0, :cond_1

    .line 653
    iget-boolean v0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->initialized:Z

    if-eqz v0, :cond_0

    .line 654
    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 657
    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lio/flutter/embedding/engine/loader/FlutterLoader$$ExternalSyntheticLambda0;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lio/flutter/embedding/engine/loader/FlutterLoader$$ExternalSyntheticLambda0;-><init>(Lio/flutter/embedding/engine/loader/FlutterLoader;Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 650
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ensureInitializationComplete must be called after startInitialization"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 646
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ensureInitializationComplete must be called on the main thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public findAppBundlePath()Ljava/lang/String;
    .locals 1

    .line 705
    iget-object v0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    iget-object v0, v0, Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;->flutterAssetsDir:Ljava/lang/String;

    return-object v0
.end method

.method getFileFromPath(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 633
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public getLookupKeyForAsset(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 717
    invoke-direct {p0, p1}, Lio/flutter/embedding/engine/loader/FlutterLoader;->fullAssetPathFrom(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getLookupKeyForAsset(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 731
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "packages"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/flutter/embedding/engine/loader/FlutterLoader;->getLookupKeyForAsset(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getSofwareRenderingEnabledViaManifest()Z
    .locals 1

    .line 579
    iget-boolean v0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->enableSoftwareRendering:Z

    return v0
.end method

.method public initialized()Z
    .locals 1

    .line 677
    iget-boolean v0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->initialized:Z

    return v0
.end method

.method synthetic lambda$ensureInitializationCompleteAsync$0$io-flutter-embedding-engine-loader-FlutterLoader(Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 0

    .line 669
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/embedding/engine/loader/FlutterLoader;->ensureInitializationComplete(Landroid/content/Context;[Ljava/lang/String;)V

    .line 670
    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method synthetic lambda$ensureInitializationCompleteAsync$1$io-flutter-embedding-engine-loader-FlutterLoader(Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 7

    .line 661
    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->initResultFuture:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/embedding/engine/loader/FlutterLoader$InitResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 666
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lio/flutter/util/HandlerCompat;->createAsyncHandler(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lio/flutter/embedding/engine/loader/FlutterLoader$$ExternalSyntheticLambda1;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lio/flutter/embedding/engine/loader/FlutterLoader$$ExternalSyntheticLambda1;-><init>(Lio/flutter/embedding/engine/loader/FlutterLoader;Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 667
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 663
    const-string p2, "FlutterLoader"

    const-string p3, "Flutter initialization failed."

    invoke-static {p2, p3, p1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 664
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public startInitialization(Landroid/content/Context;)V
    .locals 1

    .line 113
    new-instance v0, Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;

    invoke-direct {v0}, Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;-><init>()V

    invoke-virtual {p0, p1, v0}, Lio/flutter/embedding/engine/loader/FlutterLoader;->startInitialization(Landroid/content/Context;Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;)V

    return-void
.end method

.method public startInitialization(Landroid/content/Context;Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;)V
    .locals 3

    .line 129
    iget-object v0, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->settings:Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 132
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_3

    .line 136
    const-string v0, "FlutterLoader#startInitialization"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->scoped(Ljava/lang/String;)Lio/flutter/util/TraceSection;

    move-result-object v0

    .line 138
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 140
    iput-object p2, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->settings:Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;

    .line 142
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->initStartTimestampMillis:J

    .line 143
    invoke-static {p1}, Lio/flutter/embedding/engine/loader/ApplicationInfoLoader;->load(Landroid/content/Context;)Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    move-result-object p2

    iput-object p2, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterApplicationInfo:Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;

    .line 145
    const-string p2, "display"

    .line 146
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/display/DisplayManager;

    .line 147
    iget-object v1, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->flutterJNI:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-static {p2, v1}, Lio/flutter/view/VsyncWaiter;->getInstance(Landroid/hardware/display/DisplayManager;Lio/flutter/embedding/engine/FlutterJNI;)Lio/flutter/view/VsyncWaiter;

    move-result-object p2

    .line 148
    invoke-virtual {p2}, Lio/flutter/view/VsyncWaiter;->init()V

    .line 151
    new-instance p2, Lio/flutter/embedding/engine/loader/FlutterLoader$1;

    invoke-direct {p2, p0, p1}, Lio/flutter/embedding/engine/loader/FlutterLoader$1;-><init>(Lio/flutter/embedding/engine/loader/FlutterLoader;Landroid/content/Context;)V

    .line 245
    iget-object p1, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/embedding/engine/loader/FlutterLoader;->initResultFuture:Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    .line 246
    invoke-virtual {v0}, Lio/flutter/util/TraceSection;->close()V

    :cond_1
    :goto_0
    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_2

    .line 136
    :try_start_1
    invoke-virtual {v0}, Lio/flutter/util/TraceSection;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw p1

    .line 133
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "startInitialization must be called on the main thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
