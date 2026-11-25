package xyz.luan.audioplayers;

import android.content.Context;
import android.media.AudioManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tekartik.sqflite.Constant;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import xyz.luan.audioplayers.player.SoundPoolManager;
import xyz.luan.audioplayers.player.WrappedPlayer;
import xyz.luan.audioplayers.source.BytesSource;
import xyz.luan.audioplayers.source.UrlSource;

/* JADX INFO: compiled from: AudioplayersPlugin.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016JT\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2:\u0010\u001f\u001a6\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00160 j\u0002`#H\u0002J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0011H\u0002J\u0006\u0010(\u001a\u00020\nJ\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0012J\u000e\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0012J\u0016\u0010.\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00122\u0006\u0010/\u001a\u000200J\u0016\u00101\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u0011J\u000e\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0011J,\u00104\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\u00112\b\u00106\u001a\u0004\u0018\u00010\u00112\b\u00107\u001a\u0004\u0018\u000108J$\u00109\u001a\u00020\u00162\b\u00105\u001a\u0004\u0018\u00010\u00112\b\u00106\u001a\u0004\u0018\u00010\u00112\b\u00107\u001a\u0004\u0018\u000108J\u000e\u0010:\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lxyz/luan/audioplayers/AudioplayersPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "<init>", "()V", "methods", "Lio/flutter/plugin/common/MethodChannel;", "globalMethods", "globalEvents", "Lxyz/luan/audioplayers/EventHandler;", "context", "Landroid/content/Context;", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "soundPoolManager", "Lxyz/luan/audioplayers/player/SoundPoolManager;", "players", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lxyz/luan/audioplayers/player/WrappedPlayer;", "defaultAudioContext", "Lxyz/luan/audioplayers/AudioContextAndroid;", "onAttachedToEngine", "", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "safeCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "response", "Lio/flutter/plugin/common/MethodChannel$Result;", "handler", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lxyz/luan/audioplayers/FlutterHandler;", "globalMethodHandler", "methodHandler", "getPlayer", "playerId", "getApplicationContext", "getAudioManager", "Landroid/media/AudioManager;", "handleDuration", "player", "handleComplete", "handlePrepared", "isPrepared", "", "handleLog", Constant.PARAM_ERROR_MESSAGE, "handleGlobalLog", "handleError", "errorCode", "errorMessage", "errorDetails", "", "handleGlobalError", "handleSeekComplete", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AudioplayersPlugin implements FlutterPlugin {
    private BinaryMessenger binaryMessenger;
    private Context context;
    private EventHandler globalEvents;
    private MethodChannel globalMethods;
    private MethodChannel methods;
    private SoundPoolManager soundPoolManager;
    private final ConcurrentHashMap<String, WrappedPlayer> players = new ConcurrentHashMap<>();
    private AudioContextAndroid defaultAudioContext = new AudioContextAndroid();

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        this.binaryMessenger = binaryMessenger;
        this.soundPoolManager = new SoundPoolManager(this);
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers");
        this.methods = methodChannel;
        methodChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: xyz.luan.audioplayers.AudioplayersPlugin$$ExternalSyntheticLambda0
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                AudioplayersPlugin.onAttachedToEngine$lambda$0(this.f$0, methodCall, result);
            }
        });
        MethodChannel methodChannel2 = new MethodChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers.global");
        this.globalMethods = methodChannel2;
        methodChannel2.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: xyz.luan.audioplayers.AudioplayersPlugin$$ExternalSyntheticLambda1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                AudioplayersPlugin.onAttachedToEngine$lambda$1(this.f$0, methodCall, result);
            }
        });
        this.globalEvents = new EventHandler(new EventChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers.global/events"));
    }

    static final void onAttachedToEngine$lambda$0(AudioplayersPlugin audioplayersPlugin, MethodCall call, MethodChannel.Result response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        audioplayersPlugin.safeCall(call, response, new AudioplayersPlugin$onAttachedToEngine$1$1(audioplayersPlugin));
    }

    static final void onAttachedToEngine$lambda$1(AudioplayersPlugin audioplayersPlugin, MethodCall call, MethodChannel.Result response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        audioplayersPlugin.safeCall(call, response, new AudioplayersPlugin$onAttachedToEngine$2$1(audioplayersPlugin));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Collection<WrappedPlayer> collectionValues = this.players.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((WrappedPlayer) it.next()).dispose();
        }
        this.players.clear();
        SoundPoolManager soundPoolManager = this.soundPoolManager;
        EventHandler eventHandler = null;
        if (soundPoolManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("soundPoolManager");
            soundPoolManager = null;
        }
        soundPoolManager.dispose();
        EventHandler eventHandler2 = this.globalEvents;
        if (eventHandler2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalEvents");
        } else {
            eventHandler = eventHandler2;
        }
        eventHandler.dispose();
    }

    private final void safeCall(MethodCall call, MethodChannel.Result response, Function2<? super MethodCall, ? super MethodChannel.Result, Unit> handler) {
        try {
            handler.invoke(call, response);
        } catch (Throwable th) {
            response.error("Unexpected AndroidAudioError", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void globalMethodHandler(MethodCall call, MethodChannel.Result response) {
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1630329231:
                    if (str.equals("emitLog")) {
                        String str2 = (String) call.argument(Constant.PARAM_ERROR_MESSAGE);
                        if (str2 == null) {
                            throw new IllegalStateException("message is required".toString());
                        }
                        handleGlobalLog(str2);
                        response.success(1);
                        return;
                    }
                    break;
                case 3237136:
                    if (str.equals("init")) {
                        Collection<WrappedPlayer> collectionValues = this.players.values();
                        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                        Iterator<T> it = collectionValues.iterator();
                        while (it.hasNext()) {
                            ((WrappedPlayer) it.next()).dispose();
                        }
                        this.players.clear();
                        response.success(1);
                        return;
                    }
                    break;
                case 910310901:
                    if (str.equals("emitError")) {
                        String str3 = (String) call.argument(Constant.PARAM_ERROR_CODE);
                        if (str3 == null) {
                            throw new IllegalStateException("code is required".toString());
                        }
                        String str4 = (String) call.argument(Constant.PARAM_ERROR_MESSAGE);
                        if (str4 == null) {
                            throw new IllegalStateException("message is required".toString());
                        }
                        handleGlobalError(str3, str4, null);
                        response.success(1);
                        return;
                    }
                    break;
                case 1902436987:
                    if (str.equals("setAudioContext")) {
                        AudioManager audioManager = getAudioManager();
                        audioManager.setMode(this.defaultAudioContext.getAudioMode());
                        audioManager.setSpeakerphoneOn(this.defaultAudioContext.isSpeakerphoneOn());
                        this.defaultAudioContext = AudioplayersPluginKt.audioContext(call);
                        response.success(1);
                        return;
                    }
                    break;
            }
        }
        response.notImplemented();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void methodHandler(MethodCall call, MethodChannel.Result response) {
        String str = (String) call.argument("playerId");
        if (str == null) {
            return;
        }
        PlayerMode playerModeValueOf = null;
        SoundPoolManager soundPoolManager = null;
        ReleaseMode releaseModeValueOf = null;
        if (Intrinsics.areEqual(call.method, "create")) {
            BinaryMessenger binaryMessenger = this.binaryMessenger;
            if (binaryMessenger == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binaryMessenger");
                binaryMessenger = null;
            }
            EventHandler eventHandler = new EventHandler(new EventChannel(binaryMessenger, "xyz.luan/audioplayers/events/" + str));
            ConcurrentHashMap<String, WrappedPlayer> concurrentHashMap = this.players;
            AudioContextAndroid audioContextAndroidCopy$default = AudioContextAndroid.copy$default(this.defaultAudioContext, false, false, 0, 0, 0, 0, 63, null);
            SoundPoolManager soundPoolManager2 = this.soundPoolManager;
            if (soundPoolManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("soundPoolManager");
            } else {
                soundPoolManager = soundPoolManager2;
            }
            concurrentHashMap.put(str, new WrappedPlayer(this, eventHandler, audioContextAndroidCopy$default, soundPoolManager));
            response.success(1);
            return;
        }
        WrappedPlayer player = getPlayer(str);
        try {
            String str2 = call.method;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1757019252:
                        if (str2.equals("getCurrentPosition")) {
                            response.success(player.getCurrentPosition());
                            return;
                        }
                        break;
                    case -1722943962:
                        if (str2.equals("setPlayerMode")) {
                            String str3 = (String) call.argument("playerMode");
                            if (str3 != null) {
                                playerModeValueOf = PlayerMode.valueOf(AudioplayersPluginKt.toConstantCase((String) CollectionsKt.last(StringsKt.split$default((CharSequence) str3, new char[]{'.'}, false, 0, 6, (Object) null))));
                            }
                            if (playerModeValueOf == null) {
                                throw new IllegalStateException("playerMode is required".toString());
                            }
                            player.setPlayerMode(playerModeValueOf);
                            response.success(1);
                            return;
                        }
                        break;
                    case -1660487654:
                        if (str2.equals("setBalance")) {
                            Double d = (Double) call.argument("balance");
                            if (d == null) {
                                throw new IllegalStateException("balance is required".toString());
                            }
                            player.setBalance((float) d.doubleValue());
                            response.success(1);
                            return;
                        }
                        break;
                    case -1630329231:
                        if (str2.equals("emitLog")) {
                            String str4 = (String) call.argument(Constant.PARAM_ERROR_MESSAGE);
                            if (str4 == null) {
                                throw new IllegalStateException("message is required".toString());
                            }
                            player.handleLog(str4);
                            response.success(1);
                            return;
                        }
                        break;
                    case -934426579:
                        if (str2.equals("resume")) {
                            player.play();
                            response.success(1);
                            return;
                        }
                        break;
                    case -402284771:
                        if (str2.equals("setPlaybackRate")) {
                            Double d2 = (Double) call.argument("playbackRate");
                            if (d2 == null) {
                                throw new IllegalStateException("playbackRate is required".toString());
                            }
                            player.setRate((float) d2.doubleValue());
                            response.success(1);
                            return;
                        }
                        break;
                    case -159032046:
                        if (str2.equals("setSourceUrl")) {
                            String str5 = (String) call.argument(ImagesContract.URL);
                            if (str5 == null) {
                                throw new IllegalStateException("url is required".toString());
                            }
                            Boolean bool = (Boolean) call.argument("isLocal");
                            try {
                                player.setSource(new UrlSource(str5, bool != null ? bool.booleanValue() : false));
                                response.success(1);
                                return;
                            } catch (FileNotFoundException e) {
                                response.error("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", e);
                                return;
                            }
                        }
                        break;
                        break;
                    case 3526264:
                        if (str2.equals("seek")) {
                            Integer num = (Integer) call.argument("position");
                            if (num == null) {
                                throw new IllegalStateException("position is required".toString());
                            }
                            player.seek(num.intValue());
                            response.success(1);
                            return;
                        }
                        break;
                    case 3540994:
                        if (str2.equals("stop")) {
                            player.stop();
                            response.success(1);
                            return;
                        }
                        break;
                    case 85887754:
                        if (str2.equals("getDuration")) {
                            response.success(player.getDuration());
                            return;
                        }
                        break;
                    case 106440182:
                        if (str2.equals("pause")) {
                            player.pause();
                            response.success(1);
                            return;
                        }
                        break;
                    case 670514716:
                        if (str2.equals("setVolume")) {
                            Double d3 = (Double) call.argument("volume");
                            if (d3 == null) {
                                throw new IllegalStateException("volume is required".toString());
                            }
                            player.setVolume((float) d3.doubleValue());
                            response.success(1);
                            return;
                        }
                        break;
                    case 910310901:
                        if (str2.equals("emitError")) {
                            String str6 = (String) call.argument(Constant.PARAM_ERROR_CODE);
                            if (str6 == null) {
                                throw new IllegalStateException("code is required".toString());
                            }
                            String str7 = (String) call.argument(Constant.PARAM_ERROR_MESSAGE);
                            if (str7 == null) {
                                throw new IllegalStateException("message is required".toString());
                            }
                            player.handleError(str6, str7, null);
                            response.success(1);
                            return;
                        }
                        break;
                    case 1090594823:
                        if (str2.equals("release")) {
                            player.release();
                            response.success(1);
                            return;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            player.dispose();
                            this.players.remove(str);
                            response.success(1);
                            return;
                        }
                        break;
                    case 1771699022:
                        if (str2.equals("setSourceBytes")) {
                            byte[] bArr = (byte[]) call.argument("bytes");
                            if (bArr == null) {
                                throw new IllegalStateException("bytes are required".toString());
                            }
                            player.setSource(new BytesSource(bArr));
                            response.success(1);
                            return;
                        }
                        break;
                    case 1902436987:
                        if (str2.equals("setAudioContext")) {
                            player.updateAudioContext(AudioplayersPluginKt.audioContext(call));
                            response.success(1);
                            return;
                        }
                        break;
                    case 2096116872:
                        if (str2.equals("setReleaseMode")) {
                            String str8 = (String) call.argument("releaseMode");
                            if (str8 != null) {
                                releaseModeValueOf = ReleaseMode.valueOf(AudioplayersPluginKt.toConstantCase((String) CollectionsKt.last(StringsKt.split$default((CharSequence) str8, new char[]{'.'}, false, 0, 6, (Object) null))));
                            }
                            if (releaseModeValueOf == null) {
                                throw new IllegalStateException("releaseMode is required".toString());
                            }
                            player.setReleaseMode(releaseModeValueOf);
                            response.success(1);
                            return;
                        }
                        break;
                }
            }
            response.notImplemented();
        } catch (Exception e2) {
            response.error("AndroidAudioError", e2.getMessage(), e2);
        }
    }

    private final WrappedPlayer getPlayer(String playerId) {
        WrappedPlayer wrappedPlayer = this.players.get(playerId);
        if (wrappedPlayer != null) {
            return wrappedPlayer;
        }
        throw new IllegalStateException("Player has not yet been created or has already been disposed.".toString());
    }

    public final Context getApplicationContext() {
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public final AudioManager getAudioManager() {
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        Object systemService = context.getApplicationContext().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public final void handleDuration(WrappedPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        EventHandler eventHandler = player.getEventHandler();
        Pair[] pairArr = new Pair[1];
        Integer duration = player.getDuration();
        pairArr[0] = TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.VALUE, Integer.valueOf(duration != null ? duration.intValue() : 0));
        eventHandler.success("audio.onDuration", MapsKt.hashMapOf(pairArr));
    }

    public final void handleComplete(WrappedPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        EventHandler.success$default(player.getEventHandler(), "audio.onComplete", null, 2, null);
    }

    public final void handlePrepared(WrappedPlayer player, boolean isPrepared) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.getEventHandler().success("audio.onPrepared", MapsKt.hashMapOf(TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.VALUE, Boolean.valueOf(isPrepared))));
    }

    public final void handleLog(WrappedPlayer player, String message) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(message, "message");
        player.getEventHandler().success("audio.onLog", MapsKt.hashMapOf(TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.VALUE, message)));
    }

    public final void handleGlobalLog(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        EventHandler eventHandler = this.globalEvents;
        if (eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalEvents");
            eventHandler = null;
        }
        eventHandler.success("audio.onLog", MapsKt.hashMapOf(TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.VALUE, message)));
    }

    public final void handleError(WrappedPlayer player, String errorCode, String errorMessage, Object errorDetails) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.getEventHandler().error(errorCode, errorMessage, errorDetails);
    }

    public final void handleGlobalError(String errorCode, String errorMessage, Object errorDetails) {
        EventHandler eventHandler = this.globalEvents;
        if (eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalEvents");
            eventHandler = null;
        }
        eventHandler.error(errorCode, errorMessage, errorDetails);
    }

    public final void handleSeekComplete(WrappedPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        EventHandler.success$default(player.getEventHandler(), "audio.onSeekComplete", null, 2, null);
    }
}
