package xyz.luan.audioplayers.player;

import android.media.AudioManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xyz.luan.audioplayers.AudioContextAndroid;

/* JADX INFO: compiled from: FocusManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B@\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001d\u001a\u00020\tH\u0014J\b\u0010\u001e\u001a\u00020\u0006H\u0014J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R/\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lxyz/luan/audioplayers/player/LegacyFocusManager;", "Lxyz/luan/audioplayers/player/FocusManager;", "player", "Lxyz/luan/audioplayers/player/WrappedPlayer;", "onGranted", "Lkotlin/Function0;", "", "onLoss", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "isTransient", "<init>", "(Lxyz/luan/audioplayers/player/WrappedPlayer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getPlayer", "()Lxyz/luan/audioplayers/player/WrappedPlayer;", "getOnGranted", "()Lkotlin/jvm/functions/Function0;", "getOnLoss", "()Lkotlin/jvm/functions/Function1;", "context", "Lxyz/luan/audioplayers/AudioContextAndroid;", "getContext", "()Lxyz/luan/audioplayers/AudioContextAndroid;", "setContext", "(Lxyz/luan/audioplayers/AudioContextAndroid;)V", "audioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "hasAudioFocusRequest", "updateAudioFocusRequest", "handleStop", "requestAudioFocus", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final class LegacyFocusManager extends FocusManager {
    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;
    private AudioContextAndroid context;
    private final Function0<Unit> onGranted;
    private final Function1<Boolean, Unit> onLoss;
    private final WrappedPlayer player;

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyFocusManager(WrappedPlayer player, Function0<Unit> onGranted, Function1<? super Boolean, Unit> onLoss) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(onGranted, "onGranted");
        Intrinsics.checkNotNullParameter(onLoss, "onLoss");
        this.player = player;
        this.onGranted = onGranted;
        this.onLoss = onLoss;
        this.context = getPlayer().getContext();
        updateAudioFocusRequest();
    }

    @Override // xyz.luan.audioplayers.player.FocusManager
    public WrappedPlayer getPlayer() {
        return this.player;
    }

    @Override // xyz.luan.audioplayers.player.FocusManager
    public Function0<Unit> getOnGranted() {
        return this.onGranted;
    }

    @Override // xyz.luan.audioplayers.player.FocusManager
    public Function1<Boolean, Unit> getOnLoss() {
        return this.onLoss;
    }

    @Override // xyz.luan.audioplayers.player.FocusManager
    public AudioContextAndroid getContext() {
        return this.context;
    }

    @Override // xyz.luan.audioplayers.player.FocusManager
    public void setContext(AudioContextAndroid audioContextAndroid) {
        Intrinsics.checkNotNullParameter(audioContextAndroid, "<set-?>");
        this.context = audioContextAndroid;
    }

    @Override // xyz.luan.audioplayers.player.FocusManager
    protected boolean hasAudioFocusRequest() {
        return this.audioFocusChangeListener != null;
    }

    @Override // xyz.luan.audioplayers.player.FocusManager
    protected void updateAudioFocusRequest() {
        this.audioFocusChangeListener = getContext().getAudioFocus() == 0 ? null : new AudioManager.OnAudioFocusChangeListener() { // from class: xyz.luan.audioplayers.player.LegacyFocusManager$$ExternalSyntheticLambda0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                this.f$0.handleFocusResult(i);
            }
        };
    }

    @Override // xyz.luan.audioplayers.player.FocusManager
    public void handleStop() {
        if (hasAudioFocusRequest()) {
            getAudioManager().abandonAudioFocus(this.audioFocusChangeListener);
        }
    }

    @Override // xyz.luan.audioplayers.player.FocusManager
    protected void requestAudioFocus() {
        handleFocusResult(getAudioManager().requestAudioFocus(this.audioFocusChangeListener, 3, getContext().getAudioFocus()));
    }
}
