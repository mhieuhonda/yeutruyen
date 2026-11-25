package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 12\u00020\u0001:\u0003/01B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u001e\u001a\u0004\u0018\u0001H\u001f\"\u0004\b\u0000\u0010\u001f2\u0006\u0010 \u001a\u00020\t¢\u0006\u0002\u0010!J\u0017\u0010\"\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\tJ\u000e\u0010'\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0001J\u001f\u0010(\u001a\u0004\u0018\u0001H\u001f\"\b\b\u0000\u0010\u001f*\u00020\u00012\u0006\u0010 \u001a\u00020\t¢\u0006\u0002\u0010!J\u0010\u0010)\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0006\u0010*\u001a\u00020&J\u0006\u0010+\u001a\u00020&J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010,\u001a\u00020&H\u0002J\u0018\u0010-\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\tH\u0002J\b\u0010.\u001a\u00020&H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\n\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u000bj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b`\fX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0010\u001a*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0004\u0012\u00020\t0\u000bj\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0004\u0012\u00020\t`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;", "", "finalizationListener", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$PigeonFinalizationListener;", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$PigeonFinalizationListener;)V", "identifiers", "Ljava/util/WeakHashMap;", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$IdentityWeakReference;", "", "weakInstances", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "strongInstances", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "weakReferencesToIdentifiers", "handler", "Landroid/os/Handler;", "releaseAllFinalizedInstancesRunnable", "Ljava/lang/Runnable;", "nextIdentifier", "hasFinalizationListenerStopped", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "clearFinalizedWeakReferencesInterval", "getClearFinalizedWeakReferencesInterval", "()J", "setClearFinalizedWeakReferencesInterval", "(J)V", "remove", "T", "identifier", "(J)Ljava/lang/Object;", "getIdentifierForStrongReference", "instance", "(Ljava/lang/Object;)Ljava/lang/Long;", "addDartCreatedInstance", "", "addHostCreatedInstance", "getInstance", "containsInstance", "stopFinalizationListener", "clear", "releaseAllFinalizedInstances", "addInstance", "logWarningIfFinalizationListenerHasStopped", "PigeonFinalizationListener", "IdentityWeakReference", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AndroidWebkitLibraryPigeonInstanceManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long minHostCreatedIdentifier = 65536;
    private static final String tag = "PigeonInstanceManager";
    private long clearFinalizedWeakReferencesInterval;
    private final PigeonFinalizationListener finalizationListener;
    private final Handler handler;
    private boolean hasFinalizationListenerStopped;
    private final WeakHashMap<IdentityWeakReference<Object>, Long> identifiers;
    private long nextIdentifier;
    private final ReferenceQueue<Object> referenceQueue;
    private final Runnable releaseAllFinalizedInstancesRunnable;
    private final HashMap<Long, Object> strongInstances;
    private final HashMap<Long, IdentityWeakReference<Object>> weakInstances;
    private final HashMap<IdentityWeakReference<Object>, Long> weakReferencesToIdentifiers;

    /* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$PigeonFinalizationListener;", "", "onFinalize", "", "identifier", "", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface PigeonFinalizationListener {
        void onFinalize(long identifier);
    }

    public AndroidWebkitLibraryPigeonInstanceManager(PigeonFinalizationListener finalizationListener) {
        Intrinsics.checkNotNullParameter(finalizationListener, "finalizationListener");
        this.finalizationListener = finalizationListener;
        this.identifiers = new WeakHashMap<>();
        this.weakInstances = new HashMap<>();
        this.strongInstances = new HashMap<>();
        this.referenceQueue = new ReferenceQueue<>();
        this.weakReferencesToIdentifiers = new HashMap<>();
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        Runnable runnable = new Runnable() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonInstanceManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.releaseAllFinalizedInstances();
            }
        };
        this.releaseAllFinalizedInstancesRunnable = runnable;
        this.nextIdentifier = minHostCreatedIdentifier;
        this.clearFinalizedWeakReferencesInterval = 3000L;
        handler.postDelayed(runnable, 3000L);
    }

    /* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u000bH\u0096\u0080\u0004R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$IdentityWeakReference;", "T", "", "Ljava/lang/ref/WeakReference;", "instance", "<init>", "(Ljava/lang/Object;)V", "queue", "Ljava/lang/ref/ReferenceQueue;", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V", "savedHashCode", "", "equals", "", "other", "hashCode", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class IdentityWeakReference<T> extends WeakReference<T> {
        private final int savedHashCode;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IdentityWeakReference(T instance) {
            this(instance, null);
            Intrinsics.checkNotNullParameter(instance, "instance");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdentityWeakReference(T instance, ReferenceQueue<T> referenceQueue) {
            super(instance, referenceQueue);
            Intrinsics.checkNotNullParameter(instance, "instance");
            this.savedHashCode = System.identityHashCode(instance);
        }

        public boolean equals(Object other) {
            Object obj = get();
            if (obj != null) {
                return (other instanceof IdentityWeakReference) && ((IdentityWeakReference) other).get() == obj;
            }
            return other == this;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public int getSavedHashCode() {
            return this.savedHashCode;
        }
    }

    public final long getClearFinalizedWeakReferencesInterval() {
        return this.clearFinalizedWeakReferencesInterval;
    }

    public final void setClearFinalizedWeakReferencesInterval(long j) {
        this.handler.removeCallbacks(this.releaseAllFinalizedInstancesRunnable);
        this.clearFinalizedWeakReferencesInterval = j;
        releaseAllFinalizedInstances();
    }

    /* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$Companion;", "", "<init>", "()V", "minHostCreatedIdentifier", "", "tag", "", "create", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;", "finalizationListener", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$PigeonFinalizationListener;", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AndroidWebkitLibraryPigeonInstanceManager create(PigeonFinalizationListener finalizationListener) {
            Intrinsics.checkNotNullParameter(finalizationListener, "finalizationListener");
            return new AndroidWebkitLibraryPigeonInstanceManager(finalizationListener);
        }
    }

    public final <T> T remove(long identifier) {
        logWarningIfFinalizationListenerHasStopped();
        Object androidWebkitLibraryPigeonInstanceManager = getInstance(identifier);
        if (androidWebkitLibraryPigeonInstanceManager instanceof WebViewProxyApi.WebViewPlatformView) {
            ((WebViewProxyApi.WebViewPlatformView) androidWebkitLibraryPigeonInstanceManager).destroy();
        }
        return (T) this.strongInstances.remove(Long.valueOf(identifier));
    }

    public final Long getIdentifierForStrongReference(Object instance) {
        logWarningIfFinalizationListenerHasStopped();
        if (instance == null) {
            return null;
        }
        Long l = this.identifiers.get(new IdentityWeakReference(instance));
        if (l != null) {
            this.strongInstances.put(l, instance);
        }
        return l;
    }

    public final void addDartCreatedInstance(Object instance, long identifier) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        logWarningIfFinalizationListenerHasStopped();
        addInstance(instance, identifier);
    }

    public final long addHostCreatedInstance(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        logWarningIfFinalizationListenerHasStopped();
        if (containsInstance(instance)) {
            throw new IllegalArgumentException(("Instance of " + instance.getClass() + " has already been added.").toString());
        }
        long j = this.nextIdentifier;
        this.nextIdentifier = 1 + j;
        addInstance(instance, j);
        return j;
    }

    public final <T> T getInstance(long identifier) {
        logWarningIfFinalizationListenerHasStopped();
        IdentityWeakReference<Object> identityWeakReference = this.weakInstances.get(Long.valueOf(identifier));
        if (identityWeakReference != null) {
            return (T) identityWeakReference.get();
        }
        return null;
    }

    public final boolean containsInstance(Object instance) {
        logWarningIfFinalizationListenerHasStopped();
        return instance != null && this.identifiers.containsKey(new IdentityWeakReference(instance));
    }

    public final void stopFinalizationListener() {
        this.handler.removeCallbacks(this.releaseAllFinalizedInstancesRunnable);
        this.hasFinalizationListenerStopped = true;
    }

    public final void clear() {
        this.identifiers.clear();
        this.weakInstances.clear();
        this.strongInstances.clear();
        this.weakReferencesToIdentifiers.clear();
    }

    /* JADX INFO: renamed from: hasFinalizationListenerStopped, reason: from getter */
    public final boolean getHasFinalizationListenerStopped() {
        return this.hasFinalizationListenerStopped;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseAllFinalizedInstances() {
        if (getHasFinalizationListenerStopped()) {
            return;
        }
        while (true) {
            IdentityWeakReference identityWeakReference = (IdentityWeakReference) this.referenceQueue.poll();
            if (identityWeakReference != null) {
                Long l = (Long) TypeIntrinsics.asMutableMap(this.weakReferencesToIdentifiers).remove(identityWeakReference);
                if (l != null) {
                    this.weakInstances.remove(l);
                    this.strongInstances.remove(l);
                    this.finalizationListener.onFinalize(l.longValue());
                }
            } else {
                this.handler.postDelayed(this.releaseAllFinalizedInstancesRunnable, this.clearFinalizedWeakReferencesInterval);
                return;
            }
        }
    }

    private final void addInstance(Object instance, long identifier) {
        if (identifier < 0) {
            throw new IllegalArgumentException(("Identifier must be >= 0: " + identifier).toString());
        }
        if (this.weakInstances.containsKey(Long.valueOf(identifier))) {
            throw new IllegalArgumentException(("Identifier has already been added: " + identifier).toString());
        }
        IdentityWeakReference<Object> identityWeakReference = new IdentityWeakReference<>(instance, this.referenceQueue);
        this.identifiers.put(identityWeakReference, Long.valueOf(identifier));
        this.weakInstances.put(Long.valueOf(identifier), identityWeakReference);
        this.weakReferencesToIdentifiers.put(identityWeakReference, Long.valueOf(identifier));
        this.strongInstances.put(Long.valueOf(identifier), instance);
    }

    private final void logWarningIfFinalizationListenerHasStopped() {
        if (getHasFinalizationListenerStopped()) {
            Log.w(tag, "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }
}
