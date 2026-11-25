package xyz.luan.audioplayers.player;

import android.media.SoundPool;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import xyz.luan.audioplayers.AudioContextAndroid;
import xyz.luan.audioplayers.source.Source;
import xyz.luan.audioplayers.source.UrlSource;

/* JADX INFO: compiled from: SoundPoolPlayer.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\b\u0010\"\u001a\u00020 H\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0015H\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0016J\u0018\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000200H\u0016J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020 2\u0006\u00105\u001a\u000206H\u0016J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\n\u00109\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020\rH\u0016J\b\u0010<\u001a\u00020 H\u0016J\b\u0010=\u001a\u00020 H\u0016J\b\u0010>\u001a\u00020 H\u0016J\b\u0010?\u001a\u000206H\u0016J\f\u0010@\u001a\u00020\r*\u000206H\u0002J\u0010\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020CH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR(\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u0014\u001a\u0004\u0018\u00010(@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006D"}, d2 = {"Lxyz/luan/audioplayers/player/SoundPoolPlayer;", "Lxyz/luan/audioplayers/player/PlayerWrapper;", "wrappedPlayer", "Lxyz/luan/audioplayers/player/WrappedPlayer;", "soundPoolManager", "Lxyz/luan/audioplayers/player/SoundPoolManager;", "<init>", "(Lxyz/luan/audioplayers/player/WrappedPlayer;Lxyz/luan/audioplayers/player/SoundPoolManager;)V", "getWrappedPlayer", "()Lxyz/luan/audioplayers/player/WrappedPlayer;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "soundId", "", "getSoundId", "()Ljava/lang/Integer;", "setSoundId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "streamId", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lxyz/luan/audioplayers/AudioContextAndroid;", "audioContext", "setAudioContext", "(Lxyz/luan/audioplayers/AudioContextAndroid;)V", "soundPoolWrapper", "Lxyz/luan/audioplayers/player/SoundPoolWrapper;", "soundPool", "Landroid/media/SoundPool;", "getSoundPool", "()Landroid/media/SoundPool;", "stop", "", "release", "pause", "updateContext", "context", "setSource", "source", "Lxyz/luan/audioplayers/source/Source;", "Lxyz/luan/audioplayers/source/UrlSource;", "urlSource", "getUrlSource", "()Lxyz/luan/audioplayers/source/UrlSource;", "setUrlSource", "(Lxyz/luan/audioplayers/source/UrlSource;)V", "setVolume", "leftVolume", "", "rightVolume", "setRate", "rate", "setLooping", "looping", "", "getDuration", "", "getCurrentPosition", "seekTo", "position", "start", "prepare", "reset", "isLiveStream", "loopModeInteger", "unsupportedOperation", Constant.PARAM_ERROR_MESSAGE, "", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SoundPoolPlayer implements PlayerWrapper {
    private AudioContextAndroid audioContext;
    private final CoroutineScope mainScope;
    private Integer soundId;
    private final SoundPoolManager soundPoolManager;
    private SoundPoolWrapper soundPoolWrapper;
    private Integer streamId;
    private UrlSource urlSource;
    private final WrappedPlayer wrappedPlayer;

    private final int loopModeInteger(boolean z) {
        return z ? -1 : 0;
    }

    /* JADX INFO: renamed from: getCurrentPosition, reason: collision with other method in class */
    public Void m2057getCurrentPosition() {
        return null;
    }

    /* JADX INFO: renamed from: getDuration, reason: collision with other method in class */
    public Void m2058getDuration() {
        return null;
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public boolean isLiveStream() {
        return false;
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void prepare() {
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void reset() {
    }

    public SoundPoolPlayer(WrappedPlayer wrappedPlayer, SoundPoolManager soundPoolManager) {
        Intrinsics.checkNotNullParameter(wrappedPlayer, "wrappedPlayer");
        Intrinsics.checkNotNullParameter(soundPoolManager, "soundPoolManager");
        this.wrappedPlayer = wrappedPlayer;
        this.soundPoolManager = soundPoolManager;
        this.mainScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        AudioContextAndroid context = wrappedPlayer.getContext();
        this.audioContext = context;
        soundPoolManager.createSoundPoolWrapper(32, context);
        SoundPoolWrapper soundPoolWrapper = soundPoolManager.getSoundPoolWrapper(this.audioContext);
        if (soundPoolWrapper != null) {
            this.soundPoolWrapper = soundPoolWrapper;
        } else {
            throw new IllegalStateException(("Could not create SoundPool " + this.audioContext).toString());
        }
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public /* bridge */ /* synthetic */ Integer getCurrentPosition() {
        return (Integer) m2057getCurrentPosition();
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public /* bridge */ /* synthetic */ Integer getDuration() {
        return (Integer) m2058getDuration();
    }

    public final WrappedPlayer getWrappedPlayer() {
        return this.wrappedPlayer;
    }

    public final Integer getSoundId() {
        return this.soundId;
    }

    public final void setSoundId(Integer num) {
        this.soundId = num;
    }

    private final void setAudioContext(AudioContextAndroid audioContextAndroid) {
        if (!Intrinsics.areEqual(this.audioContext.buildAttributes(), audioContextAndroid.buildAttributes())) {
            release();
            this.soundPoolManager.createSoundPoolWrapper(32, audioContextAndroid);
            SoundPoolWrapper soundPoolWrapper = this.soundPoolManager.getSoundPoolWrapper(audioContextAndroid);
            if (soundPoolWrapper == null) {
                throw new IllegalStateException(("Could not create SoundPool " + audioContextAndroid).toString());
            }
            this.soundPoolWrapper = soundPoolWrapper;
        }
        this.audioContext = audioContextAndroid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoundPool getSoundPool() {
        return this.soundPoolWrapper.getSoundPool();
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void stop() {
        Integer num = this.streamId;
        if (num != null) {
            getSoundPool().stop(num.intValue());
            this.streamId = null;
        }
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void release() {
        stop();
        Integer num = this.soundId;
        if (num != null) {
            int iIntValue = num.intValue();
            UrlSource urlSource = this.urlSource;
            if (urlSource == null) {
                return;
            }
            synchronized (this.soundPoolWrapper.getUrlToPlayers()) {
                List<SoundPoolPlayer> list = this.soundPoolWrapper.getUrlToPlayers().get(urlSource);
                if (list == null) {
                    return;
                }
                if (CollectionsKt.singleOrNull((List) list) == this) {
                    this.soundPoolWrapper.getUrlToPlayers().remove(urlSource);
                    getSoundPool().unload(iIntValue);
                    this.soundPoolWrapper.getSoundIdToPlayer().remove(Integer.valueOf(iIntValue));
                    this.wrappedPlayer.handleLog("unloaded soundId " + iIntValue);
                } else {
                    list.remove(this);
                }
                this.soundId = null;
                setUrlSource(null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void pause() {
        Integer num = this.streamId;
        if (num != null) {
            getSoundPool().pause(num.intValue());
        }
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void updateContext(AudioContextAndroid context) {
        Intrinsics.checkNotNullParameter(context, "context");
        setAudioContext(context);
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void setSource(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.setForSoundPool(this);
    }

    public final UrlSource getUrlSource() {
        return this.urlSource;
    }

    public final void setUrlSource(UrlSource urlSource) {
        if (urlSource != null) {
            synchronized (this.soundPoolWrapper.getUrlToPlayers()) {
                Map<UrlSource, List<SoundPoolPlayer>> urlToPlayers = this.soundPoolWrapper.getUrlToPlayers();
                ArrayList arrayList = urlToPlayers.get(urlSource);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    urlToPlayers.put(urlSource, arrayList);
                }
                List<SoundPoolPlayer> list = arrayList;
                SoundPoolPlayer soundPoolPlayer = (SoundPoolPlayer) CollectionsKt.firstOrNull((List) list);
                if (soundPoolPlayer != null) {
                    boolean prepared = soundPoolPlayer.wrappedPlayer.getPrepared();
                    this.wrappedPlayer.setPrepared(prepared);
                    Integer num = soundPoolPlayer.soundId;
                    this.soundId = num;
                    this.wrappedPlayer.handleLog("Reusing soundId " + num + " for " + urlSource + " is prepared=" + prepared + " " + this);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.wrappedPlayer.setPrepared(false);
                    this.wrappedPlayer.handleLog("Fetching actual URL for " + urlSource);
                    BuildersKt__Builders_commonKt.launch$default(this.mainScope, Dispatchers.getIO(), null, new SoundPoolPlayer$urlSource$1$1(urlSource, this, this, jCurrentTimeMillis, null), 2, null);
                }
                list.add(this);
            }
        }
        this.urlSource = urlSource;
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void setVolume(float leftVolume, float rightVolume) {
        Integer num = this.streamId;
        if (num != null) {
            getSoundPool().setVolume(num.intValue(), leftVolume, rightVolume);
        }
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void setRate(float rate) {
        Integer num = this.streamId;
        if (num != null) {
            getSoundPool().setRate(num.intValue(), rate);
        }
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void setLooping(boolean looping) {
        Integer num = this.streamId;
        if (num != null) {
            getSoundPool().setLoop(num.intValue(), loopModeInteger(looping));
        }
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void seekTo(int position) {
        if (position == 0) {
            Integer num = this.streamId;
            if (num != null) {
                int iIntValue = num.intValue();
                stop();
                if (this.wrappedPlayer.getPlaying()) {
                    getSoundPool().resume(iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        unsupportedOperation("seek");
        throw new KotlinNothingValueException();
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void start() {
        Integer num = this.streamId;
        Integer num2 = this.soundId;
        if (num != null) {
            getSoundPool().resume(num.intValue());
        } else if (num2 != null) {
            this.streamId = Integer.valueOf(getSoundPool().play(num2.intValue(), this.wrappedPlayer.getVolume(), this.wrappedPlayer.getVolume(), 0, loopModeInteger(this.wrappedPlayer.isLooping()), this.wrappedPlayer.getRate()));
        }
    }

    private final Void unsupportedOperation(String message) {
        throw new UnsupportedOperationException("LOW_LATENCY mode does not support: " + message);
    }
}
