package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.MotionEventTracker;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewCreationRequest;
import io.flutter.embedding.engine.systemchannels.PlatformViewTouch;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.view.AccessibilityBridge;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PlatformViewsController2 implements PlatformViewsAccessibilityDelegate {
    private static final String TAG = "PlatformViewsController2";
    private AndroidTouchProcessor androidTouchProcessor;
    private Context context;
    private FlutterView flutterView;
    private PlatformViewsChannel2 platformViewsChannel;
    private PlatformViewRegistryImpl registry;
    private TextInputPlugin textInputPlugin;
    private FlutterJNI flutterJNI = null;
    private Surface overlayerSurface = null;
    private SurfaceControl overlaySurfaceControl = null;
    private final HashSet<Integer> viewsWithPendingSurfaceCallback = new HashSet<>();
    final PlatformViewsChannel2.PlatformViewsHandler channelHandler = new PlatformViewsChannel2.PlatformViewsHandler() { // from class: io.flutter.plugin.platform.PlatformViewsController2.2
        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void createPlatformView(PlatformViewCreationRequest platformViewCreationRequest) {
            PlatformViewsController2.this.createFlutterPlatformView(platformViewCreationRequest);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void dispose(int i) {
            PlatformViewsController2.this.viewsWithPendingSurfaceCallback.remove(Integer.valueOf(i));
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Disposing unknown platform view with id: " + i);
                return;
            }
            if (platformView.getView() != null) {
                View view = platformView.getView();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            PlatformViewsController2.this.platformViews.remove(i);
            try {
                platformView.dispose();
            } catch (RuntimeException e) {
                Log.e(PlatformViewsController2.TAG, "Disposing platform view threw an exception", e);
            }
            FlutterMutatorView flutterMutatorView = (FlutterMutatorView) PlatformViewsController2.this.platformViewParent.get(i);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                ViewGroup viewGroup2 = (ViewGroup) flutterMutatorView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(flutterMutatorView);
                }
                PlatformViewsController2.this.platformViewParent.remove(i);
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void onTouch(PlatformViewTouch platformViewTouch) {
            int i = platformViewTouch.viewId;
            float f = PlatformViewsController2.this.context.getResources().getDisplayMetrics().density;
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Sending touch to an unknown view with id: " + i);
                return;
            }
            View view = platformView.getView();
            if (view == null) {
                Log.e(PlatformViewsController2.TAG, "Sending touch to a null view with id: " + i);
            } else {
                view.dispatchTouchEvent(PlatformViewsController2.this.toMotionEvent(f, platformViewTouch));
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void setDirection(int i, int i2) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Setting direction to an unknown view with id: " + i);
                return;
            }
            View view = platformView.getView();
            if (view == null) {
                Log.e(PlatformViewsController2.TAG, "Setting direction to a null view with id: " + i);
            } else {
                view.setLayoutDirection(i2);
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void clearFocus(int i) {
            PlatformView platformView = (PlatformView) PlatformViewsController2.this.platformViews.get(i);
            if (platformView == null) {
                Log.e(PlatformViewsController2.TAG, "Clearing focus on an unknown view with id: " + i);
                return;
            }
            View view = platformView.getView();
            if (view == null) {
                Log.e(PlatformViewsController2.TAG, "Clearing focus on a null view with id: " + i);
            } else {
                view.clearFocus();
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public boolean isSurfaceControlEnabled() {
            return PlatformViewsController2.this.isHcppEnabled();
        }
    };
    private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
    private final SparseArray<PlatformView> platformViews = new SparseArray<>();
    private final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray<>();
    private final ArrayList<SurfaceControl.Transaction> pendingTransactions = new ArrayList<>();
    private final ArrayList<SurfaceControl.Transaction> activeTransactions = new ArrayList<>();
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

    private static boolean validateDirection(int i) {
        return i == 0 || i == 1;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i) {
        return false;
    }

    public void setRegistry(PlatformViewRegistry platformViewRegistry) {
        this.registry = (PlatformViewRegistryImpl) platformViewRegistry;
    }

    public void setFlutterJNI(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public PlatformView createFlutterPlatformView(PlatformViewCreationRequest platformViewCreationRequest) {
        PlatformViewFactory factory = this.registry.getFactory(platformViewCreationRequest.viewType);
        if (factory == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
        }
        PlatformView platformViewCreate = factory.create(this.context, platformViewCreationRequest.viewId, platformViewCreationRequest.params != null ? factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params) : null);
        View view = platformViewCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(platformViewCreationRequest.direction);
        this.platformViews.put(platformViewCreationRequest.viewId, platformViewCreate);
        maybeInvokeOnFlutterViewAttached(platformViewCreate);
        return platformViewCreate;
    }

    private static void translateMotionEvent(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    public MotionEvent toMotionEvent(float f, PlatformViewTouch platformViewTouch) {
        MotionEvent motionEventPop = this.motionEventTracker.pop(MotionEventTracker.MotionEventId.from(platformViewTouch.motionEventId));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch.rawPointerCoords, f).toArray(new MotionEvent.PointerCoords[platformViewTouch.pointerCount]);
        if (motionEventPop != null) {
            translateMotionEvent(motionEventPop, pointerCoordsArr);
            return motionEventPop;
        }
        return MotionEvent.obtain(platformViewTouch.downTime.longValue(), platformViewTouch.eventTime.longValue(), platformViewTouch.action, platformViewTouch.pointerCount, (MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch.rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[platformViewTouch.pointerCount]), pointerCoordsArr, platformViewTouch.metaState, platformViewTouch.buttonState, platformViewTouch.xPrecision, platformViewTouch.yPrecision, platformViewTouch.deviceId, platformViewTouch.edgeFlags, platformViewTouch.source, platformViewTouch.flags);
    }

    public void attach(Context context, DartExecutor dartExecutor) {
        if (this.context != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.context = context;
        PlatformViewsChannel2 platformViewsChannel2 = new PlatformViewsChannel2(dartExecutor);
        this.platformViewsChannel = platformViewsChannel2;
        platformViewsChannel2.setPlatformViewsHandler(this.channelHandler);
    }

    public void detach() {
        PlatformViewsChannel2 platformViewsChannel2 = this.platformViewsChannel;
        if (platformViewsChannel2 != null) {
            platformViewsChannel2.setPlatformViewsHandler(null);
        }
        destroyOverlaySurface();
        this.platformViewsChannel = null;
        this.context = null;
    }

    public void attachToView(FlutterView flutterView) {
        this.flutterView = flutterView;
        for (int i = 0; i < this.platformViewParent.size(); i++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i));
        }
        for (int i2 = 0; i2 < this.platformViews.size(); i2++) {
            this.platformViews.valueAt(i2).onFlutterViewAttached(this.flutterView);
        }
    }

    public void detachFromView() {
        for (int i = 0; i < this.platformViewParent.size(); i++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i));
        }
        destroyOverlaySurface();
        this.flutterView = null;
        for (int i2 = 0; i2 < this.platformViews.size(); i2++) {
            this.platformViews.valueAt(i2).onFlutterViewDetached();
        }
    }

    private void maybeInvokeOnFlutterViewAttached(PlatformView platformView) {
        FlutterView flutterView = this.flutterView;
        if (flutterView == null) {
            Log.i(TAG, "null flutterView");
        } else {
            platformView.onFlutterViewAttached(flutterView);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void attachAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge(null);
    }

    public void attachTextInputPlugin(TextInputPlugin textInputPlugin) {
        this.textInputPlugin = textInputPlugin;
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    public void onDetachedFromJNI() {
        disposeAllViews();
    }

    public void onPreEngineRestart() {
        disposeAllViews();
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public View getPlatformViewById(int i) {
        PlatformView platformView = this.platformViews.get(i);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    private void lockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.lockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionLocked();
    }

    private void unlockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.unlockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionUnlocked();
    }

    private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerProperties(it.next()));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties parsePointerProperties(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object obj, float f) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerCoords(it.next(), f));
        }
        return arrayList;
    }

    private static MotionEvent.PointerCoords parsePointerCoords(Object obj, float f) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d = f;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d);
        return pointerCoords;
    }

    private float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    private int toPhysicalPixels(double d) {
        return (int) Math.round(d * ((double) getDisplayDensity()));
    }

    private int toLogicalPixels(double d, float f) {
        return (int) Math.round(d / ((double) f));
    }

    private int toLogicalPixels(double d) {
        return toLogicalPixels(d, getDisplayDensity());
    }

    private void disposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    public void disposePlatformView(int i) {
        this.channelHandler.dispose(i);
    }

    boolean initializePlatformViewIfNeeded(final int i) {
        PlatformView platformView = this.platformViews.get(i);
        if (platformView == null) {
            return false;
        }
        if (this.platformViewParent.get(i) != null) {
            return true;
        }
        View view = platformView.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.context;
        FlutterMutatorView flutterMutatorView = new FlutterMutatorView(context, context.getResources().getDisplayMetrics().density, this.androidTouchProcessor);
        flutterMutatorView.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewsController2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                this.f$0.m338xfc98d9b2(i, view2, z);
            }
        });
        this.platformViewParent.put(i, flutterMutatorView);
        view.setImportantForAccessibility(4);
        flutterMutatorView.addView(view);
        this.flutterView.addView(flutterMutatorView);
        return true;
    }

    /* JADX INFO: renamed from: lambda$initializePlatformViewIfNeeded$0$io-flutter-plugin-platform-PlatformViewsController2, reason: not valid java name */
    /* synthetic */ void m338xfc98d9b2(int i, View view, boolean z) {
        if (z) {
            this.platformViewsChannel.invokeViewFocused(i);
            return;
        }
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.clearPlatformViewClient(i);
        }
    }

    public void attachToFlutterRenderer(FlutterRenderer flutterRenderer) {
        this.androidTouchProcessor = new AndroidTouchProcessor(flutterRenderer, true);
    }

    public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        if (initializePlatformViewIfNeeded(i)) {
            FlutterMutatorView flutterMutatorView = this.platformViewParent.get(i);
            flutterMutatorView.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
            flutterMutatorView.setVisibility(0);
            flutterMutatorView.bringToFront();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7, 51);
            View view = this.platformViews.get(i).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams);
                view.bringToFront();
                if (view instanceof SurfaceView) {
                    maybeApplyClipToSurfaceView((SurfaceView) view, i2, i3, i4, i5, flutterMutatorsStack, i);
                }
            }
        }
    }

    private void maybeApplyClipToSurfaceView(SurfaceView surfaceView, int i, int i2, int i3, int i4, FlutterMutatorsStack flutterMutatorsStack, int i5) {
        RectF rectF = new RectF(i, i2, i3 + i, i4 + i2);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        List<Path> finalClippingPaths = flutterMutatorsStack.getFinalClippingPaths();
        if (finalClippingPaths != null && !finalClippingPaths.isEmpty()) {
            RectF rectF2 = new RectF();
            Iterator<Path> it = finalClippingPaths.iterator();
            while (it.hasNext()) {
                it.next().computeBounds(rectF2, true);
                Rect rect2 = new Rect();
                rectF2.roundOut(rect2);
                if (!rect.intersect(rect2)) {
                    rect.setEmpty();
                    break;
                }
            }
        }
        rect.offset(-i, -i2);
        if (rect.width() < 0 || rect.height() < 0) {
            rect.setEmpty();
        }
        float finalOpacity = flutterMutatorsStack.getFinalOpacity();
        SurfaceControl surfaceControl = surfaceView.getSurfaceControl();
        if (surfaceControl == null) {
            if (this.viewsWithPendingSurfaceCallback.contains(Integer.valueOf(i5))) {
                return;
            }
            this.viewsWithPendingSurfaceCallback.add(Integer.valueOf(i5));
            surfaceView.getHolder().addCallback(createSurfaceClipCallback(surfaceView, finalOpacity, rect, i5));
            return;
        }
        if (!surfaceControl.isValid()) {
            Log.i(TAG, "Skipping applying clip to SurfaceView: " + surfaceView.getId() + " because it has an invalid SurfaceControl.");
        } else {
            createTransaction().setAlpha(surfaceControl, finalOpacity).setCrop(surfaceControl, rect);
        }
    }

    private SurfaceHolder.Callback createSurfaceClipCallback(final SurfaceView surfaceView, final float f, final Rect rect, final int i) {
        return new SurfaceHolder.Callback() { // from class: io.flutter.plugin.platform.PlatformViewsController2.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                SurfaceControl surfaceControl = surfaceView.getSurfaceControl();
                if (surfaceControl != null && surfaceControl.isValid()) {
                    PlatformViewsController2.this.createTransaction().setAlpha(surfaceControl, f).setCrop(surfaceControl, rect);
                } else {
                    Log.i(PlatformViewsController2.TAG, "Failed to apply clipping to SurfaceView: " + surfaceView.getId() + " - the SurfaceControl was null or invalid during surfaceCreated callback.");
                }
                PlatformViewsController2.this.flutterJNI.scheduleFrame();
                PlatformViewsController2.this.viewsWithPendingSurfaceCallback.remove(Integer.valueOf(i));
                surfaceView.getHolder().removeCallback(this);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                PlatformViewsController2.this.viewsWithPendingSurfaceCallback.remove(Integer.valueOf(i));
                surfaceView.getHolder().removeCallback(this);
            }
        };
    }

    public void hidePlatformView(int i) {
        if (initializePlatformViewIfNeeded(i)) {
            this.platformViewParent.get(i).setVisibility(8);
        }
    }

    public void onEndFrame() {
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        int i = 0;
        while (true) {
            int size = this.activeTransactions.size();
            ArrayList<SurfaceControl.Transaction> arrayList = this.activeTransactions;
            if (i < size) {
                transaction = transaction.merge(arrayList.get(i));
                i++;
            } else {
                arrayList.clear();
                this.flutterView.invalidate();
                this.flutterView.getRootSurfaceControl().applyTransactionOnDraw(transaction);
                return;
            }
        }
    }

    public synchronized void swapTransactions() {
        this.activeTransactions.clear();
        this.activeTransactions.addAll(this.pendingTransactions);
        this.pendingTransactions.clear();
    }

    public SurfaceControl.Transaction createTransaction() {
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        this.pendingTransactions.add(transaction);
        return transaction;
    }

    public void applyTransactions() {
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        for (int i = 0; i < this.pendingTransactions.size(); i++) {
            transaction = transaction.merge(this.pendingTransactions.get(i));
        }
        transaction.apply();
        this.pendingTransactions.clear();
    }

    public FlutterOverlaySurface createOverlaySurface() {
        if (this.overlayerSurface == null) {
            SurfaceControl.Builder builder = new SurfaceControl.Builder();
            builder.setBufferSize(this.flutterView.getWidth(), this.flutterView.getHeight());
            builder.setFormat(1);
            builder.setName("Flutter Overlay Surface");
            builder.setOpaque(false);
            builder.setHidden(false);
            SurfaceControl surfaceControlBuild = builder.build();
            SurfaceControl.Transaction transactionBuildReparentTransaction = this.flutterView.getRootSurfaceControl().buildReparentTransaction(surfaceControlBuild);
            transactionBuildReparentTransaction.setLayer(surfaceControlBuild, 1000);
            transactionBuildReparentTransaction.apply();
            this.overlayerSurface = new Surface(surfaceControlBuild);
            this.overlaySurfaceControl = surfaceControlBuild;
        }
        return new FlutterOverlaySurface(0, this.overlayerSurface);
    }

    public void destroyOverlaySurface() {
        Surface surface = this.overlayerSurface;
        if (surface != null) {
            surface.release();
            this.overlayerSurface = null;
            this.overlaySurfaceControl = null;
        }
    }

    public void showOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        createTransaction().setVisibility(this.overlaySurfaceControl, true);
    }

    public void hideOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        createTransaction().setVisibility(this.overlaySurfaceControl, false);
    }

    public boolean isHcppEnabled() {
        FlutterJNI flutterJNI = this.flutterJNI;
        if (flutterJNI == null) {
            return false;
        }
        return flutterJNI.IsSurfaceControlEnabled();
    }
}
