package xyz.luan.audioplayers.player;

import android.content.Context;
import android.media.AudioManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xyz.luan.audioplayers.AudioContextAndroid;
import xyz.luan.audioplayers.AudioplayersPlugin;
import xyz.luan.audioplayers.EventHandler;
import xyz.luan.audioplayers.PlayerMode;
import xyz.luan.audioplayers.ReleaseMode;
import xyz.luan.audioplayers.source.Source;

/* JADX INFO: compiled from: WrappedPlayer.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010H\u001a\u00020AH\u0002J\b\u0010I\u001a\u00020\u0013H\u0002J\u000e\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0007J\r\u0010M\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010NJ\r\u0010O\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010NJ\u0006\u0010X\u001a\u00020KJ\b\u0010Y\u001a\u00020KH\u0002J\u0006\u0010Z\u001a\u00020KJ\u0006\u0010[\u001a\u00020KJ\u0006\u0010\\\u001a\u00020KJ\u000e\u0010]\u001a\u00020K2\u0006\u0010^\u001a\u00020AJ\u0006\u0010_\u001a\u00020KJ\u0006\u0010`\u001a\u00020KJ\u000e\u0010a\u001a\u00020K2\u0006\u0010b\u001a\u00020AJ\u0006\u0010c\u001a\u00020KJ\u000e\u0010d\u001a\u00020K2\u0006\u0010e\u001a\u00020fJ$\u0010g\u001a\u00020K2\b\u0010h\u001a\u0004\u0018\u00010f2\b\u0010i\u001a\u0004\u0018\u00010f2\b\u0010j\u001a\u0004\u0018\u00010\u0001J\u0016\u0010k\u001a\u00020.2\u0006\u0010l\u001a\u00020A2\u0006\u0010m\u001a\u00020AJ\b\u0010n\u001a\u00020\u0013H\u0002J\b\u0010o\u001a\u00020KH\u0002J\f\u0010p\u001a\u00020K*\u00020\u0013H\u0002J\u001c\u0010q\u001a\u00020K*\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002J\u0006\u0010r\u001a\u00020KR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010$\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R$\u0010(\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020'@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b-\u0010/R$\u00101\u001a\u0002002\u0006\u0010\u0014\u001a\u000200@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010/\"\u0004\b8\u00109R$\u0010:\u001a\u00020.2\u0006\u0010\u0014\u001a\u00020.@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010/\"\u0004\b<\u00109R\u001a\u0010=\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010/\"\u0004\b?\u00109R\u001a\u0010@\u001a\u00020AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010P\u001a\u00020Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010T\u001a\u00020U8F¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006s"}, d2 = {"Lxyz/luan/audioplayers/player/WrappedPlayer;", "", "ref", "Lxyz/luan/audioplayers/AudioplayersPlugin;", "eventHandler", "Lxyz/luan/audioplayers/EventHandler;", "context", "Lxyz/luan/audioplayers/AudioContextAndroid;", "soundPoolManager", "Lxyz/luan/audioplayers/player/SoundPoolManager;", "<init>", "(Lxyz/luan/audioplayers/AudioplayersPlugin;Lxyz/luan/audioplayers/EventHandler;Lxyz/luan/audioplayers/AudioContextAndroid;Lxyz/luan/audioplayers/player/SoundPoolManager;)V", "getEventHandler", "()Lxyz/luan/audioplayers/EventHandler;", "getContext", "()Lxyz/luan/audioplayers/AudioContextAndroid;", "setContext", "(Lxyz/luan/audioplayers/AudioContextAndroid;)V", "player", "Lxyz/luan/audioplayers/player/PlayerWrapper;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lxyz/luan/audioplayers/source/Source;", "source", "getSource", "()Lxyz/luan/audioplayers/source/Source;", "setSource", "(Lxyz/luan/audioplayers/source/Source;)V", "", "volume", "getVolume", "()F", "setVolume", "(F)V", "balance", "getBalance", "setBalance", "rate", "getRate", "setRate", "Lxyz/luan/audioplayers/ReleaseMode;", "releaseMode", "getReleaseMode", "()Lxyz/luan/audioplayers/ReleaseMode;", "setReleaseMode", "(Lxyz/luan/audioplayers/ReleaseMode;)V", "isLooping", "", "()Z", "Lxyz/luan/audioplayers/PlayerMode;", "playerMode", "getPlayerMode", "()Lxyz/luan/audioplayers/PlayerMode;", "setPlayerMode", "(Lxyz/luan/audioplayers/PlayerMode;)V", "released", "getReleased", "setReleased", "(Z)V", "prepared", "getPrepared", "setPrepared", "playing", "getPlaying", "setPlaying", "shouldSeekTo", "", "getShouldSeekTo", "()I", "setShouldSeekTo", "(I)V", "focusManager", "Lxyz/luan/audioplayers/player/FocusManager;", "maybeGetCurrentPosition", "getOrCreatePlayer", "updateAudioContext", "", "audioContext", "getDuration", "()Ljava/lang/Integer;", "getCurrentPosition", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "play", "requestFocusAndStart", "stop", "release", "pause", "seek", "position", "onPrepared", "onCompletion", "onBuffering", "percent", "onSeekComplete", "handleLog", Constant.PARAM_ERROR_MESSAGE, "", "handleError", "errorCode", "errorMessage", "errorDetails", "onError", "what", "extra", "createPlayer", "initPlayer", "configAndPrepare", "setVolumeAndBalance", "dispose", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class WrappedPlayer {
    private float balance;
    private AudioContextAndroid context;
    private final EventHandler eventHandler;
    private final FocusManager focusManager;
    private PlayerWrapper player;
    private PlayerMode playerMode;
    private boolean playing;
    private boolean prepared;
    private float rate;
    private final AudioplayersPlugin ref;
    private ReleaseMode releaseMode;
    private boolean released;
    private int shouldSeekTo;
    private final SoundPoolManager soundPoolManager;
    private Source source;
    private float volume;

    /* JADX INFO: compiled from: WrappedPlayer.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerMode.values().length];
            try {
                iArr[PlayerMode.MEDIA_PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerMode.LOW_LATENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void onBuffering(int percent) {
    }

    public WrappedPlayer(AudioplayersPlugin ref, EventHandler eventHandler, AudioContextAndroid context, SoundPoolManager soundPoolManager) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(soundPoolManager, "soundPoolManager");
        this.ref = ref;
        this.eventHandler = eventHandler;
        this.context = context;
        this.soundPoolManager = soundPoolManager;
        this.volume = 1.0f;
        this.rate = 1.0f;
        this.releaseMode = ReleaseMode.RELEASE;
        this.playerMode = PlayerMode.MEDIA_PLAYER;
        this.released = true;
        this.shouldSeekTo = -1;
        this.focusManager = FocusManager.INSTANCE.create(this, new Function0() { // from class: xyz.luan.audioplayers.player.WrappedPlayer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WrappedPlayer.focusManager$lambda$0(this.f$0);
            }
        }, new Function1() { // from class: xyz.luan.audioplayers.player.WrappedPlayer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WrappedPlayer.focusManager$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final EventHandler getEventHandler() {
        return this.eventHandler;
    }

    public final AudioContextAndroid getContext() {
        return this.context;
    }

    public final void setContext(AudioContextAndroid audioContextAndroid) {
        Intrinsics.checkNotNullParameter(audioContextAndroid, "<set-?>");
        this.context = audioContextAndroid;
    }

    public final Source getSource() {
        return this.source;
    }

    public final void setSource(Source source) {
        if (!Intrinsics.areEqual(this.source, source)) {
            if (source != null) {
                PlayerWrapper orCreatePlayer = getOrCreatePlayer();
                orCreatePlayer.setSource(source);
                configAndPrepare(orCreatePlayer);
            } else {
                this.released = true;
                setPrepared(false);
                this.playing = false;
                PlayerWrapper playerWrapper = this.player;
                if (playerWrapper != null) {
                    playerWrapper.release();
                }
            }
            this.source = source;
            return;
        }
        this.ref.handlePrepared(this, true);
    }

    public final float getVolume() {
        return this.volume;
    }

    public final void setVolume(float f) {
        PlayerWrapper playerWrapper;
        if (this.volume == f) {
            return;
        }
        this.volume = f;
        if (this.released || (playerWrapper = this.player) == null) {
            return;
        }
        setVolumeAndBalance(playerWrapper, f, this.balance);
    }

    public final float getBalance() {
        return this.balance;
    }

    public final void setBalance(float f) {
        PlayerWrapper playerWrapper;
        if (this.balance == f) {
            return;
        }
        this.balance = f;
        if (this.released || (playerWrapper = this.player) == null) {
            return;
        }
        setVolumeAndBalance(playerWrapper, this.volume, f);
    }

    public final float getRate() {
        return this.rate;
    }

    public final void setRate(float f) {
        PlayerWrapper playerWrapper;
        if (this.rate == f) {
            return;
        }
        this.rate = f;
        if (!this.playing || (playerWrapper = this.player) == null) {
            return;
        }
        playerWrapper.setRate(f);
    }

    public final ReleaseMode getReleaseMode() {
        return this.releaseMode;
    }

    public final void setReleaseMode(ReleaseMode value) {
        PlayerWrapper playerWrapper;
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.releaseMode != value) {
            this.releaseMode = value;
            if (this.released || (playerWrapper = this.player) == null) {
                return;
            }
            playerWrapper.setLooping(isLooping());
        }
    }

    public final boolean isLooping() {
        return this.releaseMode == ReleaseMode.LOOP;
    }

    public final PlayerMode getPlayerMode() {
        return this.playerMode;
    }

    public final void setPlayerMode(PlayerMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.playerMode != value) {
            this.playerMode = value;
            PlayerWrapper playerWrapper = this.player;
            if (playerWrapper != null) {
                this.shouldSeekTo = maybeGetCurrentPosition();
                setPrepared(false);
                playerWrapper.release();
            }
            initPlayer();
        }
    }

    public final boolean getReleased() {
        return this.released;
    }

    public final void setReleased(boolean z) {
        this.released = z;
    }

    public final boolean getPrepared() {
        return this.prepared;
    }

    public final void setPrepared(boolean z) {
        if (this.prepared != z) {
            this.prepared = z;
            this.ref.handlePrepared(this, z);
        }
    }

    public final boolean getPlaying() {
        return this.playing;
    }

    public final void setPlaying(boolean z) {
        this.playing = z;
    }

    public final int getShouldSeekTo() {
        return this.shouldSeekTo;
    }

    public final void setShouldSeekTo(int i) {
        this.shouldSeekTo = i;
    }

    static final Unit focusManager$lambda$0(WrappedPlayer wrappedPlayer) {
        PlayerWrapper playerWrapper;
        if (wrappedPlayer.playing && (playerWrapper = wrappedPlayer.player) != null) {
            playerWrapper.start();
        }
        return Unit.INSTANCE;
    }

    static final Unit focusManager$lambda$1(WrappedPlayer wrappedPlayer, boolean z) {
        if (z) {
            PlayerWrapper playerWrapper = wrappedPlayer.player;
            if (playerWrapper != null) {
                playerWrapper.pause();
            }
        } else {
            wrappedPlayer.pause();
        }
        return Unit.INSTANCE;
    }

    private final int maybeGetCurrentPosition() {
        Object objM410constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            WrappedPlayer wrappedPlayer = this;
            PlayerWrapper playerWrapper = this.player;
            Integer currentPosition = playerWrapper != null ? playerWrapper.getCurrentPosition() : null;
            if (currentPosition != null && currentPosition.intValue() == 0) {
                currentPosition = null;
            }
            objM410constructorimpl = Result.m410constructorimpl(currentPosition);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM410constructorimpl = Result.m410constructorimpl(ResultKt.createFailure(th));
        }
        Integer num = (Integer) (Result.m416isFailureimpl(objM410constructorimpl) ? null : objM410constructorimpl);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private final PlayerWrapper getOrCreatePlayer() {
        PlayerWrapper playerWrapper = this.player;
        if (this.released || playerWrapper == null) {
            PlayerWrapper playerWrapperCreatePlayer = createPlayer();
            this.player = playerWrapperCreatePlayer;
            this.released = false;
            return playerWrapperCreatePlayer;
        }
        if (this.prepared) {
            playerWrapper.reset();
            setPrepared(false);
        }
        return playerWrapper;
    }

    public final void updateAudioContext(AudioContextAndroid audioContext) {
        Intrinsics.checkNotNullParameter(audioContext, "audioContext");
        if (Intrinsics.areEqual(this.context, audioContext)) {
            return;
        }
        if (this.context.getAudioFocus() != 0 && audioContext.getAudioFocus() == 0) {
            this.focusManager.handleStop();
        }
        this.context = AudioContextAndroid.copy$default(audioContext, false, false, 0, 0, 0, 0, 63, null);
        getAudioManager().setMode(this.context.getAudioMode());
        getAudioManager().setSpeakerphoneOn(this.context.isSpeakerphoneOn());
        PlayerWrapper playerWrapper = this.player;
        if (playerWrapper != null) {
            playerWrapper.stop();
            setPrepared(false);
            playerWrapper.updateContext(this.context);
            Source source = this.source;
            if (source != null) {
                playerWrapper.setSource(source);
                configAndPrepare(playerWrapper);
            }
        }
    }

    public final Integer getDuration() {
        PlayerWrapper playerWrapper;
        if (!this.prepared || (playerWrapper = this.player) == null) {
            return null;
        }
        return playerWrapper.getDuration();
    }

    public final Integer getCurrentPosition() {
        PlayerWrapper playerWrapper;
        if (!this.prepared || (playerWrapper = this.player) == null) {
            return null;
        }
        return playerWrapper.getCurrentPosition();
    }

    public final Context getApplicationContext() {
        return this.ref.getApplicationContext();
    }

    public final AudioManager getAudioManager() {
        return this.ref.getAudioManager();
    }

    public final void play() {
        if (this.playing || this.released) {
            return;
        }
        this.playing = true;
        if (this.player == null) {
            initPlayer();
        } else if (this.prepared) {
            requestFocusAndStart();
        }
    }

    private final void requestFocusAndStart() {
        this.focusManager.maybeRequestAudioFocus();
    }

    public final void stop() {
        this.focusManager.handleStop();
        if (this.released) {
            return;
        }
        if (this.releaseMode != ReleaseMode.RELEASE) {
            pause();
            if (this.prepared) {
                PlayerWrapper playerWrapper = this.player;
                if (playerWrapper != null && playerWrapper.isLiveStream()) {
                    PlayerWrapper playerWrapper2 = this.player;
                    if (playerWrapper2 != null) {
                        playerWrapper2.stop();
                    }
                    setPrepared(false);
                    PlayerWrapper playerWrapper3 = this.player;
                    if (playerWrapper3 != null) {
                        playerWrapper3.prepare();
                        return;
                    }
                    return;
                }
                seek(0);
                return;
            }
            return;
        }
        release();
    }

    public final void release() {
        PlayerWrapper playerWrapper;
        this.focusManager.handleStop();
        if (this.released) {
            return;
        }
        if (this.playing && (playerWrapper = this.player) != null) {
            playerWrapper.stop();
        }
        setSource(null);
        this.player = null;
    }

    public final void pause() {
        PlayerWrapper playerWrapper;
        if (this.playing) {
            this.playing = false;
            if (!this.prepared || (playerWrapper = this.player) == null) {
                return;
            }
            playerWrapper.pause();
        }
    }

    public final void seek(int position) {
        PlayerWrapper playerWrapper;
        if (this.prepared && ((playerWrapper = this.player) == null || !playerWrapper.isLiveStream())) {
            PlayerWrapper playerWrapper2 = this.player;
            if (playerWrapper2 != null) {
                playerWrapper2.seekTo(position);
            }
            position = -1;
        }
        this.shouldSeekTo = position;
    }

    public final void onPrepared() {
        PlayerWrapper playerWrapper;
        setPrepared(true);
        this.ref.handleDuration(this);
        if (this.playing) {
            requestFocusAndStart();
        }
        if (this.shouldSeekTo >= 0) {
            PlayerWrapper playerWrapper2 = this.player;
            if ((playerWrapper2 == null || !playerWrapper2.isLiveStream()) && (playerWrapper = this.player) != null) {
                playerWrapper.seekTo(this.shouldSeekTo);
            }
        }
    }

    public final void onCompletion() {
        if (this.releaseMode != ReleaseMode.LOOP) {
            stop();
        }
        this.ref.handleComplete(this);
    }

    public final void onSeekComplete() {
        this.ref.handleSeekComplete(this);
    }

    public final void handleLog(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.ref.handleLog(this, message);
    }

    public final void handleError(String errorCode, String errorMessage, Object errorDetails) {
        this.ref.handleError(this, errorCode, errorMessage, errorDetails);
    }

    public final boolean onError(int what, int extra) {
        String str;
        String str2;
        if (what != 100) {
            str = "MEDIA_ERROR_UNKNOWN {what:" + what + "}";
        } else {
            str = "MEDIA_ERROR_SERVER_DIED";
        }
        if (extra == Integer.MIN_VALUE) {
            str2 = "MEDIA_ERROR_SYSTEM";
        } else if (extra == -1010) {
            str2 = "MEDIA_ERROR_UNSUPPORTED";
        } else if (extra == -1007) {
            str2 = "MEDIA_ERROR_MALFORMED";
        } else if (extra == -1004) {
            str2 = "MEDIA_ERROR_IO";
        } else if (extra != -110) {
            str2 = "MEDIA_ERROR_UNKNOWN {extra:" + extra + "}";
        } else {
            str2 = "MEDIA_ERROR_TIMED_OUT";
        }
        if (!this.prepared && Intrinsics.areEqual(str2, "MEDIA_ERROR_SYSTEM")) {
            handleError("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", str + ", " + str2);
        } else {
            setPrepared(false);
            handleError("AndroidAudioError", str, str2);
        }
        return false;
    }

    private final PlayerWrapper createPlayer() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.playerMode.ordinal()];
        if (i == 1) {
            return new MediaPlayerWrapper(this);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new SoundPoolPlayer(this, this.soundPoolManager);
    }

    private final void initPlayer() {
        PlayerWrapper playerWrapperCreatePlayer = createPlayer();
        this.player = playerWrapperCreatePlayer;
        Source source = this.source;
        if (source != null) {
            playerWrapperCreatePlayer.setSource(source);
            configAndPrepare(playerWrapperCreatePlayer);
        }
    }

    private final void configAndPrepare(PlayerWrapper playerWrapper) {
        setVolumeAndBalance(playerWrapper, this.volume, this.balance);
        playerWrapper.setLooping(isLooping());
        playerWrapper.prepare();
    }

    private final void setVolumeAndBalance(PlayerWrapper playerWrapper, float f, float f2) {
        playerWrapper.setVolume(Math.min(1.0f, 1.0f - f2) * f, Math.min(1.0f, f2 + 1.0f) * f);
    }

    public final void dispose() {
        release();
        this.eventHandler.dispose();
    }
}
