.class public final Lio/flutter/embedding/engine/FlutterEngineFlags;
.super Ljava/lang/Object;
.source "FlutterEngineFlags.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;
    }
.end annotation


# static fields
.field public static final ALL_FLAGS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;",
            ">;"
        }
    .end annotation
.end field

.field public static final AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final DART_FLAGS:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field public static final DEPRECATED_AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final DEPRECATED_FLAGS_BY_REPLACEMENT:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;",
            "Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;",
            ">;"
        }
    .end annotation
.end field

.field public static final DEPRECATED_FLUTTER_ASSETS_DIR:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final DISABLED_FLAGS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;",
            ">;"
        }
    .end annotation
.end field

.field public static final DISABLE_MERGED_PLATFORM_UI_THREAD:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final DISABLE_SERVICE_AUTH_CODES:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final DUMP_SKP_ON_SHADER_COMPILATION:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final ENABLE_DART_PROFILING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final ENABLE_FLUTTER_GPU:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final ENABLE_HCPP:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final ENABLE_IMPELLER:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field public static final ENABLE_SOFTWARE_RENDERING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final ENABLE_VULKAN_VALIDATION:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final ENDLESS_TRACE_BUFFER:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final FLAG_BY_COMMAND_LINE_ARG:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;",
            ">;"
        }
    .end annotation
.end field

.field private static final FLAG_BY_META_DATA_KEY:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;",
            ">;"
        }
    .end annotation
.end field

.field public static final FLUTTER_ASSETS_DIR:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final IMPELLER_ANTIALIAS_LINES:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final IMPELLER_BACKEND:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final IMPELLER_LAZY_SHADER_MODER:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final IMPELLER_OPENGL_GPU_TRACING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final IMPELLER_VULKAN_GPU_TRACING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field public static final ISOLATE_SNAPSHOT_DATA:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field public static final LEAK_VM:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final MERGED_PLATFORM_UI_THREAD:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field public static final OLD_GEN_HEAP_SIZE:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final PROFILE_MICROTASKS:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final PROFILE_STARTUP:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final PURGE_PERSISTENT_CACHE:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final SKIA_DETERMINISTIC_RENDERING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final START_PAUSED:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field public static final TEST_FLAG:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final TRACE_SKIA:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final TRACE_SKIA_ALLOWLIST:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final TRACE_STARTUP:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final TRACE_SYSTRACE:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final TRACE_TO_FILE:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final USE_TEST_FONTS:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final VERBOSE_LOGGING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field private static final VM_SERVICE_PORT:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

.field public static final VM_SNAPSHOT_DATA:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;


# direct methods
.method static constructor <clinit>()V
    .locals 43

    .line 99
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v1, "--aot-shared-library-name="

    const-string v2, "AOTSharedLibraryName"

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 109
    new-instance v5, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const/4 v9, 0x1

    const/4 v10, 0x0

    const-string v6, "--aot-shared-library-name="

    const-string v7, "aot-shared-library-name"

    const-string v8, "io.flutter.embedding.engine.loader.FlutterLoader."

    invoke-direct/range {v5 .. v10}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v5, Lio/flutter/embedding/engine/FlutterEngineFlags;->DEPRECATED_AOT_SHARED_LIBRARY_NAME:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 122
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v2, "--flutter-assets-dir="

    const-string v6, "FlutterAssetsDir"

    invoke-direct {v1, v2, v6, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->FLUTTER_ASSETS_DIR:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 131
    new-instance v7, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const/4 v11, 0x1

    const/4 v12, 0x0

    const-string v8, "--flutter-assets-dir="

    const-string v9, "flutter-assets-dir"

    const-string v10, "io.flutter.embedding.engine.loader.FlutterLoader."

    invoke-direct/range {v7 .. v12}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v7, Lio/flutter/embedding/engine/FlutterEngineFlags;->DEPRECATED_FLUTTER_ASSETS_DIR:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 143
    new-instance v2, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v6, "--old-gen-heap-size="

    const-string v8, "OldGenHeapSize"

    invoke-direct {v2, v6, v8, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v2, Lio/flutter/embedding/engine/FlutterEngineFlags;->OLD_GEN_HEAP_SIZE:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 152
    new-instance v6, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v8, "--enable-impeller="

    const-string v9, "EnableImpeller"

    invoke-direct {v6, v8, v9, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v6, Lio/flutter/embedding/engine/FlutterEngineFlags;->ENABLE_IMPELLER:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 161
    new-instance v8, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v9, "--impeller-backend="

    const-string v10, "ImpellerBackend"

    invoke-direct {v8, v9, v10, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v8, Lio/flutter/embedding/engine/FlutterEngineFlags;->IMPELLER_BACKEND:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 170
    new-instance v9, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v10, "--enable-dart-profiling"

    const-string v11, "EnableDartProfiling"

    invoke-direct {v9, v10, v11, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v9, Lio/flutter/embedding/engine/FlutterEngineFlags;->ENABLE_DART_PROFILING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 180
    new-instance v10, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v11, "--profile-startup"

    const-string v12, "ProfileStartup"

    invoke-direct {v10, v11, v12, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v10, Lio/flutter/embedding/engine/FlutterEngineFlags;->PROFILE_STARTUP:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 188
    new-instance v11, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v12, "--trace-startup"

    const-string v13, "TraceStartup"

    invoke-direct {v11, v12, v13, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v11, Lio/flutter/embedding/engine/FlutterEngineFlags;->TRACE_STARTUP:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 195
    new-instance v12, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v13, "--merged-platform-ui-thread"

    const-string v14, "MergedPlatformUIThread"

    invoke-direct {v12, v13, v14, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v12, Lio/flutter/embedding/engine/FlutterEngineFlags;->MERGED_PLATFORM_UI_THREAD:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 204
    new-instance v13, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v14, "--vm-snapshot-data="

    const-string v15, "VmSnapshotData"

    invoke-direct {v13, v14, v15, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v13, Lio/flutter/embedding/engine/FlutterEngineFlags;->VM_SNAPSHOT_DATA:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 213
    new-instance v14, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--isolate-snapshot-data="

    move-object/from16 v16, v0

    const-string v0, "IsolateSnapshotData"

    invoke-direct {v14, v15, v0, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v14, Lio/flutter/embedding/engine/FlutterEngineFlags;->ISOLATE_SNAPSHOT_DATA:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 222
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--enable-hcpp-and-surface-control"

    move-object/from16 v17, v1

    const-string v1, "EnableHcpp"

    invoke-direct {v0, v15, v1, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->ENABLE_HCPP:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 231
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--enable-flutter-gpu"

    move-object/from16 v18, v0

    const-string v0, "EnableFlutterGPU"

    invoke-direct {v1, v15, v0, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->ENABLE_FLUTTER_GPU:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 240
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--impeller-lazy-shader-mode"

    move-object/from16 v19, v1

    const-string v1, "ImpellerLazyShaderInitialization"

    invoke-direct {v0, v15, v1, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->IMPELLER_LAZY_SHADER_MODER:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 249
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--impeller-antialias-lines"

    move-object/from16 v20, v0

    const-string v0, "ImpellerAntialiasLines"

    invoke-direct {v1, v15, v0, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->IMPELLER_ANTIALIAS_LINES:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 259
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--enable-opengl-gpu-tracing"

    move/from16 v21, v3

    const-string v3, "EnableOpenGLGPUTracing"

    invoke-direct {v0, v15, v3, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->IMPELLER_OPENGL_GPU_TRACING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 267
    new-instance v3, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--enable-vulkan-gpu-tracing"

    move-object/from16 v22, v0

    const-string v0, "EnableVulkanGPUTracing"

    invoke-direct {v3, v15, v0, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v3, Lio/flutter/embedding/engine/FlutterEngineFlags;->IMPELLER_VULKAN_GPU_TRACING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 275
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--skia-deterministic-rendering"

    move-object/from16 v23, v1

    const-string v1, "SkiaDeterministicRendering"

    invoke-direct {v0, v15, v1, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->SKIA_DETERMINISTIC_RENDERING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 283
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--enable-software-rendering"

    move-object/from16 v24, v0

    const-string v0, "EnableSoftwareRendering"

    invoke-direct {v1, v15, v0, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->ENABLE_SOFTWARE_RENDERING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 291
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--use-test-fonts"

    move-object/from16 v25, v1

    const-string v1, "UseTestFonts"

    invoke-direct {v0, v15, v1, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->USE_TEST_FONTS:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 298
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--vm-service-port="

    move-object/from16 v26, v0

    const-string v0, "VMServicePort"

    invoke-direct {v1, v15, v0, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->VM_SERVICE_PORT:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 305
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--enable-vulkan-validation"

    move-object/from16 v27, v1

    const-string v1, "EnableVulkanValidation"

    invoke-direct {v0, v15, v1, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->ENABLE_VULKAN_VALIDATION:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 313
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--test-flag"

    move-object/from16 v28, v0

    const-string v0, "TestFlag"

    invoke-direct {v1, v15, v0, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->TEST_FLAG:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 328
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--leak-vm="

    move-object/from16 v29, v1

    const-string v1, "LeakVM"

    invoke-direct {v0, v15, v1, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->LEAK_VM:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 335
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--start-paused"

    move-object/from16 v30, v0

    const-string v0, "StartPaused"

    invoke-direct {v1, v15, v0, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->START_PAUSED:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 342
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--disable-service-auth-codes"

    move-object/from16 v31, v1

    const-string v1, "DisableServiceAuthCodes"

    invoke-direct {v0, v15, v1, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->DISABLE_SERVICE_AUTH_CODES:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 350
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--endless-trace-buffer"

    move-object/from16 v32, v0

    const-string v0, "EndlessTraceBuffer"

    invoke-direct {v1, v15, v0, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->ENDLESS_TRACE_BUFFER:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 358
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--trace-skia"

    move-object/from16 v33, v1

    const-string v1, "TraceSkia"

    invoke-direct {v0, v15, v1, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->TRACE_SKIA:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 365
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--trace-skia-allowlist="

    move-object/from16 v34, v0

    const-string v0, "TraceSkiaAllowList"

    invoke-direct {v1, v15, v0, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->TRACE_SKIA_ALLOWLIST:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 373
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--trace-systrace"

    move-object/from16 v35, v1

    const-string v1, "TraceSystrace"

    invoke-direct {v0, v15, v1, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->TRACE_SYSTRACE:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 380
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--trace-to-file="

    move-object/from16 v36, v0

    const-string v0, "TraceToFile"

    invoke-direct {v1, v15, v0, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->TRACE_TO_FILE:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 387
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--profile-microtasks"

    move-object/from16 v37, v1

    const-string v1, "ProfileMicrotasks"

    invoke-direct {v0, v15, v1, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->PROFILE_MICROTASKS:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 395
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--dump-skp-on-shader-compilation"

    move-object/from16 v38, v0

    const-string v0, "DumpSkpOnShaderCompilation"

    invoke-direct {v1, v15, v0, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->DUMP_SKP_ON_SHADER_COMPILATION:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 403
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--purge-persistent-cache"

    move-object/from16 v39, v1

    const-string v1, "PurgePersistentCache"

    invoke-direct {v0, v15, v1, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->PURGE_PERSISTENT_CACHE:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 411
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--verbose-logging"

    move-object/from16 v40, v0

    const-string v0, "VerboseLogging"

    invoke-direct {v1, v15, v0, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->VERBOSE_LOGGING:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 424
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--dart-flags="

    move-object/from16 v41, v1

    const-string v1, "DartFlags"

    invoke-direct {v0, v15, v1, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->DART_FLAGS:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 432
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const-string v15, "--no-enable-merged-platform-ui-thread"

    move-object/from16 v42, v0

    const-string v0, "DisableMergedPlatformUIThread"

    invoke-direct {v1, v15, v0, v4}, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngineFlags$1;)V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->DISABLE_MERGED_PLATFORM_UI_THREAD:Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const/16 v0, 0x27

    .line 436
    new-array v0, v0, [Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    const/4 v4, 0x0

    aput-object v27, v0, v4

    aput-object v26, v0, v21

    const/4 v15, 0x2

    aput-object v25, v0, v15

    const/4 v15, 0x3

    aput-object v24, v0, v15

    const/4 v15, 0x4

    aput-object v16, v0, v15

    const/4 v15, 0x5

    aput-object v17, v0, v15

    const/4 v15, 0x6

    aput-object v6, v0, v15

    const/4 v6, 0x7

    aput-object v8, v0, v6

    const/16 v6, 0x8

    aput-object v28, v0, v6

    const/16 v6, 0x9

    aput-object v31, v0, v6

    const/16 v6, 0xa

    aput-object v32, v0, v6

    const/16 v6, 0xb

    aput-object v33, v0, v6

    const/16 v6, 0xc

    aput-object v9, v0, v6

    const/16 v6, 0xd

    aput-object v10, v0, v6

    const/16 v6, 0xe

    aput-object v34, v0, v6

    const/16 v6, 0xf

    aput-object v35, v0, v6

    const/16 v6, 0x10

    aput-object v36, v0, v6

    const/16 v6, 0x11

    aput-object v37, v0, v6

    const/16 v6, 0x12

    aput-object v38, v0, v6

    const/16 v6, 0x13

    aput-object v39, v0, v6

    const/16 v6, 0x14

    aput-object v41, v0, v6

    const/16 v6, 0x15

    aput-object v42, v0, v6

    const/16 v6, 0x16

    aput-object v12, v0, v6

    const/16 v6, 0x17

    aput-object v1, v0, v6

    const/16 v6, 0x18

    aput-object v5, v0, v6

    const/16 v5, 0x19

    aput-object v7, v0, v5

    const/16 v5, 0x1a

    aput-object v2, v0, v5

    const/16 v2, 0x1b

    aput-object v13, v0, v2

    const/16 v2, 0x1c

    aput-object v14, v0, v2

    const/16 v2, 0x1d

    aput-object v40, v0, v2

    const/16 v2, 0x1e

    aput-object v11, v0, v2

    const/16 v2, 0x1f

    aput-object v30, v0, v2

    const/16 v2, 0x20

    aput-object v29, v0, v2

    const/16 v2, 0x21

    aput-object v19, v0, v2

    const/16 v2, 0x22

    aput-object v20, v0, v2

    const/16 v2, 0x23

    aput-object v23, v0, v2

    const/16 v2, 0x24

    aput-object v22, v0, v2

    const/16 v2, 0x25

    aput-object v3, v0, v2

    const/16 v2, 0x26

    aput-object v18, v0, v2

    .line 438
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 437
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->ALL_FLAGS:Ljava/util/List;

    move/from16 v2, v21

    .line 480
    new-array v2, v2, [Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    aput-object v1, v2, v4

    .line 481
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->DISABLED_FLAGS:Ljava/util/List;

    .line 484
    new-instance v1, Lio/flutter/embedding/engine/FlutterEngineFlags$1;

    invoke-direct {v1}, Lio/flutter/embedding/engine/FlutterEngineFlags$1;-><init>()V

    sput-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->DEPRECATED_FLAGS_BY_REPLACEMENT:Ljava/util/Map;

    .line 499
    new-instance v1, Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 500
    new-instance v2, Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 501
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 502
    iget-object v4, v3, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->engineArgument:Ljava/lang/String;

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    iget-object v4, v3, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;->metadataKey:Ljava/lang/String;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 505
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->FLAG_BY_COMMAND_LINE_ARG:Ljava/util/Map;

    .line 506
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->FLAG_BY_META_DATA_KEY:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getFlagByEngineArgument(Ljava/lang/String;)Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;
    .locals 3

    const/16 v0, 0x3d

    .line 511
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 512
    sget-object v1, Lio/flutter/embedding/engine/FlutterEngineFlags;->FLAG_BY_COMMAND_LINE_ARG:Ljava/util/Map;

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    const/4 v2, 0x0

    .line 513
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    .line 514
    invoke-static {p0}, Lio/flutter/embedding/engine/FlutterEngineFlags;->getReplacementFlagIfDeprecated(Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;)Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    return-object p0
.end method

.method public static getFlagFromIntentKey(Ljava/lang/String;)Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;
    .locals 2

    .line 526
    invoke-static {p0}, Lio/flutter/embedding/engine/FlutterEngineFlags;->getFlagByEngineArgument(Ljava/lang/String;)Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    move-result-object v0

    .line 528
    const-string v1, "--"

    if-nez v0, :cond_0

    .line 529
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/flutter/embedding/engine/FlutterEngineFlags;->getFlagByEngineArgument(Ljava/lang/String;)Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    .line 532
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, "="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lio/flutter/embedding/engine/FlutterEngineFlags;->getFlagByEngineArgument(Ljava/lang/String;)Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static getReplacementFlagIfDeprecated(Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;)Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;
    .locals 1

    .line 545
    sget-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->DEPRECATED_FLAGS_BY_REPLACEMENT:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;

    return-object p0
.end method

.method public static isDisabled(Lio/flutter/embedding/engine/FlutterEngineFlags$Flag;)Z
    .locals 1

    .line 540
    sget-object v0, Lio/flutter/embedding/engine/FlutterEngineFlags;->DISABLED_FLAGS:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
