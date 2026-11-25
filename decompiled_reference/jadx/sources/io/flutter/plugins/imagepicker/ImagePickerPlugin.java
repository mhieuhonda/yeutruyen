package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class ImagePickerPlugin implements FlutterPlugin, ActivityAware, ImagePickerApi {
    ActivityState activityState;
    private FlutterPlugin.FlutterPluginBinding pluginBinding;

    private class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
        private final Activity thisActivity;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner lifecycleOwner) {
        }

        LifeCycleObserver(Activity activity) {
            this.thisActivity = activity;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner lifecycleOwner) {
            onActivityStopped(this.thisActivity);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            onActivityDestroyed(this.thisActivity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.thisActivity != activity || activity.getApplicationContext() == null) {
                return;
            }
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (this.thisActivity == activity) {
                ImagePickerPlugin.this.activityState.getDelegate().saveStateBeforeResult();
            }
        }
    }

    private class ActivityState {
        private Activity activity;
        private ActivityPluginBinding activityBinding;
        private Application application;
        private ImagePickerDelegate delegate;
        private Lifecycle lifecycle;
        private BinaryMessenger messenger;
        private LifeCycleObserver observer;

        ActivityState(Application application, Activity activity, BinaryMessenger binaryMessenger, ImagePickerApi imagePickerApi, ActivityPluginBinding activityPluginBinding) {
            this.application = application;
            this.activity = activity;
            this.activityBinding = activityPluginBinding;
            this.messenger = binaryMessenger;
            this.delegate = ImagePickerPlugin.this.constructDelegate(activity);
            ImagePickerApi.INSTANCE.setUp(binaryMessenger, imagePickerApi);
            this.observer = ImagePickerPlugin.this.new LifeCycleObserver(activity);
            activityPluginBinding.addActivityResultListener(this.delegate);
            activityPluginBinding.addRequestPermissionsResultListener(this.delegate);
            Lifecycle activityLifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding);
            this.lifecycle = activityLifecycle;
            activityLifecycle.addObserver(this.observer);
        }

        ActivityState(ImagePickerDelegate imagePickerDelegate, Activity activity) {
            this.activity = activity;
            this.delegate = imagePickerDelegate;
        }

        void release() {
            ActivityPluginBinding activityPluginBinding = this.activityBinding;
            if (activityPluginBinding != null) {
                activityPluginBinding.removeActivityResultListener(this.delegate);
                this.activityBinding.removeRequestPermissionsResultListener(this.delegate);
                this.activityBinding = null;
            }
            Lifecycle lifecycle = this.lifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this.observer);
                this.lifecycle = null;
            }
            ImagePickerApi.INSTANCE.setUp(this.messenger, null);
            Application application = this.application;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.observer);
                this.application = null;
            }
            this.activity = null;
            this.observer = null;
            this.delegate = null;
        }

        Activity getActivity() {
            return this.activity;
        }

        ImagePickerDelegate getDelegate() {
            return this.delegate;
        }
    }

    public ImagePickerPlugin() {
    }

    ImagePickerPlugin(ImagePickerDelegate imagePickerDelegate, Activity activity) {
        this.activityState = new ActivityState(imagePickerDelegate, activity);
    }

    final ActivityState getActivityState() {
        return this.activityState;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        setup(this.pluginBinding.getBinaryMessenger(), (Application) this.pluginBinding.getApplicationContext(), activityPluginBinding.getActivity(), activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        tearDown();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    private void setup(BinaryMessenger binaryMessenger, Application application, Activity activity, ActivityPluginBinding activityPluginBinding) {
        this.activityState = new ActivityState(application, activity, binaryMessenger, this, activityPluginBinding);
    }

    private void tearDown() {
        ActivityState activityState = this.activityState;
        if (activityState != null) {
            activityState.release();
            this.activityState = null;
        }
    }

    final ImagePickerDelegate constructDelegate(Activity activity) {
        return new ImagePickerDelegate(activity, new ImageResizer(activity, new ExifDataCopier()), new ImagePickerCache(activity));
    }

    private ImagePickerDelegate getImagePickerDelegate() {
        ActivityState activityState = this.activityState;
        if (activityState == null || activityState.getActivity() == null) {
            return null;
        }
        return this.activityState.getDelegate();
    }

    private void setCameraDevice(ImagePickerDelegate imagePickerDelegate, SourceSpecification sourceSpecification) {
        ImagePickerDelegate.CameraDevice cameraDevice;
        SourceCamera camera = sourceSpecification.getCamera();
        if (camera != null) {
            if (AnonymousClass1.$SwitchMap$io$flutter$plugins$imagepicker$SourceCamera[camera.ordinal()] == 1) {
                cameraDevice = ImagePickerDelegate.CameraDevice.FRONT;
            } else {
                cameraDevice = ImagePickerDelegate.CameraDevice.REAR;
            }
            imagePickerDelegate.setCameraDevice(cameraDevice);
        }
    }

    @Override // io.flutter.plugins.imagepicker.ImagePickerApi
    public void pickImages(SourceSpecification sourceSpecification, ImageSelectionOptions imageSelectionOptions, GeneralOptions generalOptions, Function1<? super Result<? extends List<String>>, Unit> function1) {
        ImagePickerDelegate imagePickerDelegate = getImagePickerDelegate();
        if (imagePickerDelegate == null) {
            ResultUtilsKt.completeWithError(function1, new FlutterError("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        setCameraDevice(imagePickerDelegate, sourceSpecification);
        if (generalOptions.getAllowMultiple()) {
            imagePickerDelegate.chooseMultiImageFromGallery(imageSelectionOptions, generalOptions.getUsePhotoPicker(), ImagePickerUtils.getLimitFromOption(generalOptions), function1);
            return;
        }
        int i = AnonymousClass1.$SwitchMap$io$flutter$plugins$imagepicker$SourceType[sourceSpecification.getType().ordinal()];
        if (i == 1) {
            imagePickerDelegate.chooseImageFromGallery(imageSelectionOptions, generalOptions.getUsePhotoPicker(), function1);
        } else {
            if (i != 2) {
                return;
            }
            imagePickerDelegate.takeImageWithCamera(imageSelectionOptions, function1);
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.imagepicker.ImagePickerPlugin$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$imagepicker$SourceCamera;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$imagepicker$SourceType;

        static {
            int[] iArr = new int[SourceType.values().length];
            $SwitchMap$io$flutter$plugins$imagepicker$SourceType = iArr;
            try {
                iArr[SourceType.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$imagepicker$SourceType[SourceType.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[SourceCamera.values().length];
            $SwitchMap$io$flutter$plugins$imagepicker$SourceCamera = iArr2;
            try {
                iArr2[SourceCamera.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$imagepicker$SourceCamera[SourceCamera.REAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // io.flutter.plugins.imagepicker.ImagePickerApi
    public void pickMedia(MediaSelectionOptions mediaSelectionOptions, GeneralOptions generalOptions, Function1<? super Result<? extends List<String>>, Unit> function1) {
        ImagePickerDelegate imagePickerDelegate = getImagePickerDelegate();
        if (imagePickerDelegate == null) {
            ResultUtilsKt.completeWithError(function1, new FlutterError("no_activity", "image_picker plugin requires a foreground activity.", null));
        } else {
            imagePickerDelegate.chooseMediaFromGallery(mediaSelectionOptions, generalOptions, function1);
        }
    }

    @Override // io.flutter.plugins.imagepicker.ImagePickerApi
    public void pickVideos(SourceSpecification sourceSpecification, VideoSelectionOptions videoSelectionOptions, GeneralOptions generalOptions, Function1<? super Result<? extends List<String>>, Unit> function1) {
        ImagePickerDelegate imagePickerDelegate = getImagePickerDelegate();
        if (imagePickerDelegate == null) {
            ResultUtilsKt.completeWithError(function1, new FlutterError("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        setCameraDevice(imagePickerDelegate, sourceSpecification);
        if (generalOptions.getAllowMultiple()) {
            imagePickerDelegate.chooseMultiVideoFromGallery(videoSelectionOptions, generalOptions.getUsePhotoPicker(), ImagePickerUtils.getLimitFromOption(generalOptions), function1);
            return;
        }
        int i = AnonymousClass1.$SwitchMap$io$flutter$plugins$imagepicker$SourceType[sourceSpecification.getType().ordinal()];
        if (i == 1) {
            imagePickerDelegate.chooseVideoFromGallery(videoSelectionOptions, generalOptions.getUsePhotoPicker(), function1);
        } else {
            if (i != 2) {
                return;
            }
            imagePickerDelegate.takeVideoWithCamera(videoSelectionOptions, function1);
        }
    }

    @Override // io.flutter.plugins.imagepicker.ImagePickerApi
    public CacheRetrievalResult retrieveLostResults() {
        ImagePickerDelegate imagePickerDelegate = getImagePickerDelegate();
        if (imagePickerDelegate == null) {
            throw new FlutterError("no_activity", "image_picker plugin requires a foreground activity.", null);
        }
        return imagePickerDelegate.retrieveLostImage();
    }
}
