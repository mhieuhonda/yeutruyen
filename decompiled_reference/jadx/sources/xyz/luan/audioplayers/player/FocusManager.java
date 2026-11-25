package xyz.luan.audioplayers.player;

import android.media.AudioManager;
import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xyz.luan.audioplayers.AudioContextAndroid;

/* JADX INFO: compiled from: FocusManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u000fH$J\b\u0010\u001c\u001a\u00020\nH$J\u0006\u0010!\u001a\u00020\nJ\b\u0010\"\u001a\u00020\nH$J\b\u0010#\u001a\u00020\nH&J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&H\u0004R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR-\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u00020\u0016X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lxyz/luan/audioplayers/player/FocusManager;", "", "<init>", "()V", "player", "Lxyz/luan/audioplayers/player/WrappedPlayer;", "getPlayer", "()Lxyz/luan/audioplayers/player/WrappedPlayer;", "onGranted", "Lkotlin/Function0;", "", "getOnGranted", "()Lkotlin/jvm/functions/Function0;", "onLoss", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "isTransient", "getOnLoss", "()Lkotlin/jvm/functions/Function1;", "context", "Lxyz/luan/audioplayers/AudioContextAndroid;", "getContext", "()Lxyz/luan/audioplayers/AudioContextAndroid;", "setContext", "(Lxyz/luan/audioplayers/AudioContextAndroid;)V", "hasAudioFocusRequest", "updateAudioFocusRequest", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "maybeRequestAudioFocus", "requestAudioFocus", "handleStop", "handleFocusResult", Constant.PARAM_RESULT, "", "Companion", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class FocusManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract AudioContextAndroid getContext();

    public abstract Function0<Unit> getOnGranted();

    public abstract Function1<Boolean, Unit> getOnLoss();

    public abstract WrappedPlayer getPlayer();

    public abstract void handleStop();

    protected abstract boolean hasAudioFocusRequest();

    protected abstract void requestAudioFocus();

    public abstract void setContext(AudioContextAndroid audioContextAndroid);

    protected abstract void updateAudioFocusRequest();

    /* JADX INFO: compiled from: FocusManager.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\n0\f¨\u0006\u0011"}, d2 = {"Lxyz/luan/audioplayers/player/FocusManager$Companion;", "", "<init>", "()V", "create", "Lxyz/luan/audioplayers/player/FocusManager;", "player", "Lxyz/luan/audioplayers/player/WrappedPlayer;", "onGranted", "Lkotlin/Function0;", "", "onLoss", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "isTransient", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FocusManager create(WrappedPlayer player, Function0<Unit> onGranted, Function1<? super Boolean, Unit> onLoss) {
            Intrinsics.checkNotNullParameter(player, "player");
            Intrinsics.checkNotNullParameter(onGranted, "onGranted");
            Intrinsics.checkNotNullParameter(onLoss, "onLoss");
            if (Build.VERSION.SDK_INT >= 26) {
                return new ModernFocusManager(player, onGranted, onLoss);
            }
            return new LegacyFocusManager(player, onGranted, onLoss);
        }
    }

    protected final AudioManager getAudioManager() {
        return getPlayer().getAudioManager();
    }

    public final void maybeRequestAudioFocus() {
        if (!Intrinsics.areEqual(getContext(), getPlayer().getContext())) {
            setContext(getPlayer().getContext());
            updateAudioFocusRequest();
        }
        if (hasAudioFocusRequest()) {
            requestAudioFocus();
        } else {
            getOnGranted().invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void handleFocusResult(int result) {
        if (result == -2) {
            getOnLoss().invoke(true);
        } else if (result == -1) {
            getOnLoss().invoke(false);
        } else {
            if (result != 1) {
                return;
            }
            getOnGranted().invoke();
        }
    }
}
