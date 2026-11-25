package io.flutter.embedding.engine.loader;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngineFlags;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.util.HandlerCompat;
import io.flutter.util.TraceSection;
import io.flutter.view.VsyncWaiter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public class FlutterLoader {
    private static final String AOT_VMSERVICE_SHARED_LIBRARY_NAME = "aot-vmservice-shared-library-name";
    private static final String DEFAULT_KERNEL_BLOB = "kernel_blob.bin";
    private static final String DEFAULT_LIBRARY = "libflutter.so";
    private static final String SNAPSHOT_ASSET_PATH_KEY = "snapshot-asset-path";
    private static final String TAG = "FlutterLoader";
    private static final String VMSERVICE_SNAPSHOT_LIBRARY = "libvmservice_snapshot.so";
    private static FlutterLoader instance;
    private boolean enableSoftwareRendering;
    private ExecutorService executorService;
    private FlutterApplicationInfo flutterApplicationInfo;
    private FlutterJNI flutterJNI;
    Future<InitResult> initResultFuture;
    private long initStartTimestampMillis;
    boolean initialized;
    private Settings settings;

    /* JADX INFO: Access modifiers changed from: private */
    public ResourceExtractor initResources(Context context) {
        return null;
    }

    public FlutterLoader() {
        this(FlutterInjector.instance().getFlutterJNIFactory().provideFlutterJNI());
    }

    public FlutterLoader(FlutterJNI flutterJNI) {
        this(flutterJNI, FlutterInjector.instance().executorService());
    }

    public FlutterLoader(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.enableSoftwareRendering = false;
        this.initialized = false;
        this.flutterJNI = flutterJNI;
        this.executorService = executorService;
    }

    private static class InitResult {
        final String appStoragePath;
        final String dataDirPath;
        final String engineCachesPath;

        /* synthetic */ InitResult(String str, String str2, String str3, AnonymousClass1 anonymousClass1) {
            this(str, str2, str3);
        }

        private InitResult(String str, String str2, String str3) {
            this.appStoragePath = str;
            this.engineCachesPath = str2;
            this.dataDirPath = str3;
        }
    }

    public void startInitialization(Context context) {
        startInitialization(context, new Settings());
    }

    public void startInitialization(Context context, Settings settings) {
        if (this.settings != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        TraceSection traceSectionScoped = TraceSection.scoped("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.settings = settings;
            this.initStartTimestampMillis = SystemClock.uptimeMillis();
            this.flutterApplicationInfo = ApplicationInfoLoader.load(applicationContext);
            VsyncWaiter.getInstance((DisplayManager) applicationContext.getSystemService("display"), this.flutterJNI).init();
            this.initResultFuture = this.executorService.submit(new AnonymousClass1(applicationContext));
            if (traceSectionScoped != null) {
                traceSectionScoped.close();
            }
        } catch (Throwable th) {
            if (traceSectionScoped != null) {
                try {
                    traceSectionScoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: io.flutter.embedding.engine.loader.FlutterLoader$1, reason: invalid class name */
    class AnonymousClass1 implements Callable<InitResult> {
        final /* synthetic */ Context val$appContext;

        AnonymousClass1(Context context) {
            this.val$appContext = context;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0199 */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.flutter.embedding.engine.loader.FlutterLoader.InitResult call() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.loader.FlutterLoader.AnonymousClass1.call():io.flutter.embedding.engine.loader.FlutterLoader$InitResult");
        }

        /* JADX INFO: renamed from: lambda$call$0$io-flutter-embedding-engine-loader-FlutterLoader$1, reason: not valid java name */
        /* synthetic */ void m327lambda$call$0$ioflutterembeddingengineloaderFlutterLoader$1() {
            FlutterLoader.this.flutterJNI.prefetchDefaultFontManager();
        }
    }

    public void ensureInitializationComplete(Context context, String[] strArr) {
        ensureInitializationComplete(context, strArr, true);
    }

    void ensureInitializationComplete(Context context, String[] strArr, boolean z) {
        boolean z2;
        boolean z3;
        Iterator<FlutterEngineFlags.Flag> it;
        if (this.initialized) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            TraceSection traceSectionScoped = TraceSection.scoped("FlutterLoader#ensureInitializationComplete");
            try {
                InitResult initResult = this.initResultFuture.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.flutterApplicationInfo.nativeLibraryDir + File.separator + DEFAULT_LIBRARY);
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z2 = false;
                    z3 = false;
                    for (Iterator<FlutterEngineFlags.Flag> it2 = FlutterEngineFlags.ALL_FLAGS.iterator(); it2.hasNext(); it2 = it) {
                        FlutterEngineFlags.Flag next = it2.next();
                        String str = next.metadataKey;
                        if (!bundle.containsKey(str)) {
                            it = it2;
                        } else if (next == FlutterEngineFlags.TEST_FLAG) {
                            Log.w(TAG, "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            it = it2;
                        } else {
                            if (FlutterEngineFlags.isDisabled(next)) {
                                throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                            }
                            if (FlutterEngineFlags.getReplacementFlagIfDeprecated(next) != null) {
                                it = it2;
                                Log.w(TAG, "If you are trying to specify " + str + " in your application manifest, please make sure to use the new metadata key name: " + FlutterEngineFlags.getReplacementFlagIfDeprecated(next).metadataKey);
                            } else {
                                it = it2;
                                if (!next.allowedInRelease && z) {
                                    Log.e(TAG, "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            if (next == FlutterEngineFlags.OLD_GEN_HEAP_SIZE) {
                                z2 = true;
                            } else if (next == FlutterEngineFlags.LEAK_VM) {
                                z3 = true;
                            } else if (next == FlutterEngineFlags.ENABLE_SOFTWARE_RENDERING) {
                                this.enableSoftwareRendering = bundle.getBoolean(FlutterEngineFlags.ENABLE_SOFTWARE_RENDERING.metadataKey, false);
                            } else if (next == FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME || next == FlutterEngineFlags.DEPRECATED_AOT_SHARED_LIBRARY_NAME) {
                                String string = bundle.getString(str);
                                if (string == null) {
                                    Log.e(TAG, "Flag " + str + " was specified with an empty path. Please specify a path to the desired AOT shared library.");
                                } else {
                                    maybeAddAotSharedLibraryNameArg(context, string, arrayList);
                                }
                            }
                            String str2 = next.engineArgument;
                            if (next.hasCommandLineValue()) {
                                Object obj = bundle.get(str);
                                String string2 = obj != null ? obj.toString() : null;
                                if (string2 == null) {
                                    Log.e(TAG, "Flag with metadata key " + str + " requires a value, but no value was found. Please specify a value.");
                                } else {
                                    arrayList.add(str2 + string2);
                                }
                            } else if (bundle.getBoolean(str, false)) {
                                arrayList.add(str2);
                            }
                        }
                    }
                } else {
                    z2 = false;
                    z3 = false;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        FlutterEngineFlags.Flag flagByEngineArgument = FlutterEngineFlags.getFlagByEngineArgument(str3);
                        if (flagByEngineArgument == null) {
                            arrayList.add(str3);
                        } else if (flagByEngineArgument.equals(FlutterEngineFlags.TEST_FLAG)) {
                            Log.w(TAG, "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else if (flagByEngineArgument.equals(FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME) || flagByEngineArgument.equals(FlutterEngineFlags.DEPRECATED_AOT_SHARED_LIBRARY_NAME)) {
                            maybeAddAotSharedLibraryNameArg(context, str3.substring(FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME.engineArgument.length()), arrayList);
                        } else if (flagByEngineArgument.allowedInRelease || !z) {
                            arrayList.add(str3);
                        } else {
                            Log.e(TAG, "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                        }
                    }
                }
                arrayList.add(FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME.engineArgument + this.flutterApplicationInfo.aotSharedLibraryName);
                arrayList.add(FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME.engineArgument + this.flutterApplicationInfo.nativeLibraryDir + File.separator + this.flutterApplicationInfo.aotSharedLibraryName);
                arrayList.add("--cache-dir-path=" + initResult.engineCachesPath);
                if (this.flutterApplicationInfo.domainNetworkPolicy != null) {
                    arrayList.add("--domain-network-policy=" + this.flutterApplicationInfo.domainNetworkPolicy);
                }
                if (this.settings.getLogTag() != null) {
                    arrayList.add("--log-tag=" + this.settings.getLogTag());
                }
                if (!z2) {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    arrayList.add(FlutterEngineFlags.OLD_GEN_HEAP_SIZE.engineArgument + String.valueOf((int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z3) {
                    arrayList.add(FlutterEngineFlags.LEAK_VM.engineArgument + "true");
                }
                this.flutterJNI.init(context, (String[]) arrayList.toArray(new String[0]), null, initResult.appStoragePath, initResult.engineCachesPath, SystemClock.uptimeMillis() - this.initStartTimestampMillis, Build.VERSION.SDK_INT);
                this.initialized = true;
                if (traceSectionScoped != null) {
                    traceSectionScoped.close();
                }
            } catch (Throwable th) {
                if (traceSectionScoped == null) {
                    throw th;
                }
                try {
                    traceSectionScoped.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    private void maybeAddAotSharedLibraryNameArg(Context context, String str, List<String> list) {
        String safeAotSharedLibraryName;
        try {
            safeAotSharedLibraryName = getSafeAotSharedLibraryName(context, str);
        } catch (IOException e) {
            Log.e(TAG, "Error while validating AOT shared library name flag: " + str, e);
            safeAotSharedLibraryName = null;
        }
        if (safeAotSharedLibraryName == null) {
            Log.e(TAG, "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
        } else {
            list.add(0, FlutterEngineFlags.AOT_SHARED_LIBRARY_NAME.engineArgument + safeAotSharedLibraryName);
        }
    }

    public boolean getSofwareRenderingEnabledViaManifest() {
        return this.enableSoftwareRendering;
    }

    private String getSafeAotSharedLibraryName(Context context, String str) throws IOException {
        File fileFromPath = getFileFromPath(str);
        try {
            String canonicalPath = fileFromPath.getCanonicalPath();
            boolean zStartsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator);
            boolean zEndsWith = canonicalPath.endsWith(".so");
            if (zStartsWith && zEndsWith) {
                return canonicalPath;
            }
            Log.e(TAG, "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Log.e(TAG, "External path " + fileFromPath.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    File getFileFromPath(String str) {
        return new File(str);
    }

    public void ensureInitializationCompleteAsync(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.initialized) {
            handler.post(runnable);
        } else {
            this.executorService.execute(new Runnable() { // from class: io.flutter.embedding.engine.loader.FlutterLoader$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m326xa15f5dc1(context, strArr, handler, runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$ensureInitializationCompleteAsync$1$io-flutter-embedding-engine-loader-FlutterLoader, reason: not valid java name */
    /* synthetic */ void m326xa15f5dc1(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        try {
            this.initResultFuture.get();
            HandlerCompat.createAsyncHandler(Looper.getMainLooper()).post(new Runnable() { // from class: io.flutter.embedding.engine.loader.FlutterLoader$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m325xafb5b7a2(context, strArr, handler, runnable);
                }
            });
        } catch (Exception e) {
            Log.e(TAG, "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: lambda$ensureInitializationCompleteAsync$0$io-flutter-embedding-engine-loader-FlutterLoader, reason: not valid java name */
    /* synthetic */ void m325xafb5b7a2(Context context, String[] strArr, Handler handler, Runnable runnable) {
        ensureInitializationComplete(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    public boolean initialized() {
        return this.initialized;
    }

    public String findAppBundlePath() {
        return this.flutterApplicationInfo.flutterAssetsDir;
    }

    public String getLookupKeyForAsset(String str) {
        return fullAssetPathFrom(str);
    }

    public String getLookupKeyForAsset(String str, String str2) {
        return getLookupKeyForAsset("packages" + File.separator + str2 + File.separator + str);
    }

    public boolean automaticallyRegisterPlugins() {
        return this.flutterApplicationInfo.automaticallyRegisterPlugins;
    }

    private String fullAssetPathFrom(String str) {
        return this.flutterApplicationInfo.flutterAssetsDir + File.separator + str;
    }

    public static class Settings {
        private String logTag;

        public String getLogTag() {
            return this.logTag;
        }

        public void setLogTag(String str) {
            this.logTag = str;
        }
    }
}
