package xyz.luan.audioplayers.player;

import android.media.MediaPlayer;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xyz.luan.audioplayers.AudioContextAndroid;
import xyz.luan.audioplayers.source.Source;

/* JADX INFO: compiled from: MediaPlayerWrapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000f\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ\r\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u000eH\u0016J\b\u0010$\u001a\u00020\u000eH\u0016J\b\u0010%\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lxyz/luan/audioplayers/player/MediaPlayerWrapper;", "Lxyz/luan/audioplayers/player/PlayerWrapper;", "wrappedPlayer", "Lxyz/luan/audioplayers/player/WrappedPlayer;", "<init>", "(Lxyz/luan/audioplayers/player/WrappedPlayer;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "createMediaPlayer", "getDuration", "", "()Ljava/lang/Integer;", "getCurrentPosition", "setVolume", "", "leftVolume", "", "rightVolume", "setRate", "rate", "setSource", "source", "Lxyz/luan/audioplayers/source/Source;", "setLooping", "looping", "", "start", "pause", "stop", "release", "seekTo", "position", "updateContext", "context", "Lxyz/luan/audioplayers/AudioContextAndroid;", "prepare", "reset", "isLiveStream", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MediaPlayerWrapper implements PlayerWrapper {
    private final MediaPlayer mediaPlayer;
    private final WrappedPlayer wrappedPlayer;

    public MediaPlayerWrapper(WrappedPlayer wrappedPlayer) {
        Intrinsics.checkNotNullParameter(wrappedPlayer, "wrappedPlayer");
        this.wrappedPlayer = wrappedPlayer;
        this.mediaPlayer = createMediaPlayer(wrappedPlayer);
    }

    private final MediaPlayer createMediaPlayer(final WrappedPlayer wrappedPlayer) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: xyz.luan.audioplayers.player.MediaPlayerWrapper$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                wrappedPlayer.onPrepared();
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: xyz.luan.audioplayers.player.MediaPlayerWrapper$$ExternalSyntheticLambda1
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                wrappedPlayer.onCompletion();
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: xyz.luan.audioplayers.player.MediaPlayerWrapper$$ExternalSyntheticLambda2
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                wrappedPlayer.onSeekComplete();
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: xyz.luan.audioplayers.player.MediaPlayerWrapper$$ExternalSyntheticLambda3
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return MediaPlayerWrapper.createMediaPlayer$lambda$0$3(wrappedPlayer, mediaPlayer2, i, i2);
            }
        });
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: xyz.luan.audioplayers.player.MediaPlayerWrapper$$ExternalSyntheticLambda4
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i) {
                wrappedPlayer.onBuffering(i);
            }
        });
        wrappedPlayer.getContext().setAttributesOnPlayer(mediaPlayer);
        return mediaPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createMediaPlayer$lambda$0$3(WrappedPlayer wrappedPlayer, MediaPlayer mediaPlayer, int i, int i2) {
        return wrappedPlayer.onError(i, i2);
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public Integer getDuration() {
        Integer numValueOf = Integer.valueOf(this.mediaPlayer.getDuration());
        if (numValueOf.intValue() == -1) {
            return null;
        }
        return numValueOf;
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public Integer getCurrentPosition() {
        return Integer.valueOf(this.mediaPlayer.getCurrentPosition());
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void setVolume(float leftVolume, float rightVolume) {
        this.mediaPlayer.setVolume(leftVolume, rightVolume);
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void setRate(float rate) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(rate));
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void setSource(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        reset();
        source.setForMediaPlayer(this.mediaPlayer);
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void setLooping(boolean looping) {
        this.mediaPlayer.setLooping(looping);
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void start() {
        setRate(this.wrappedPlayer.getRate());
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void pause() {
        this.mediaPlayer.pause();
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void stop() {
        this.mediaPlayer.stop();
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void release() {
        this.mediaPlayer.reset();
        this.mediaPlayer.release();
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void seekTo(int position) {
        this.mediaPlayer.seekTo(position);
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void updateContext(AudioContextAndroid context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.setAttributesOnPlayer(this.mediaPlayer);
        if (context.getStayAwake()) {
            this.mediaPlayer.setWakeMode(this.wrappedPlayer.getApplicationContext(), 1);
        }
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void prepare() {
        this.mediaPlayer.prepareAsync();
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public void reset() {
        this.mediaPlayer.reset();
    }

    @Override // xyz.luan.audioplayers.player.PlayerWrapper
    public boolean isLiveStream() {
        Integer duration = getDuration();
        return duration == null || duration.intValue() == 0;
    }
}
