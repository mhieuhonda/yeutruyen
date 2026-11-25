package xyz.luan.audioplayers;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AudioContextAndroid.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bB\t\b\u0017¢\u0006\u0004\b\n\u0010\fJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u0006H\u0003J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\n\u0010%\u001a\u00020&HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006'"}, d2 = {"Lxyz/luan/audioplayers/AudioContextAndroid;", "", "isSpeakerphoneOn", "", "stayAwake", "contentType", "", "usageType", "audioFocus", "audioMode", "<init>", "(ZZIIII)V", "()V", "()Z", "getStayAwake", "getContentType", "()I", "getUsageType", "getAudioFocus", "getAudioMode", "setAttributesOnPlayer", "", "player", "Landroid/media/MediaPlayer;", "buildAttributes", "Landroid/media/AudioAttributes;", "getStreamType", "hashCode", "equals", "other", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "toString", "", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class AudioContextAndroid {
    private final int audioFocus;
    private final int audioMode;
    private final int contentType;
    private final boolean isSpeakerphoneOn;
    private final boolean stayAwake;
    private final int usageType;

    public static /* synthetic */ AudioContextAndroid copy$default(AudioContextAndroid audioContextAndroid, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z = audioContextAndroid.isSpeakerphoneOn;
        }
        if ((i5 & 2) != 0) {
            z2 = audioContextAndroid.stayAwake;
        }
        if ((i5 & 4) != 0) {
            i = audioContextAndroid.contentType;
        }
        if ((i5 & 8) != 0) {
            i2 = audioContextAndroid.usageType;
        }
        if ((i5 & 16) != 0) {
            i3 = audioContextAndroid.audioFocus;
        }
        if ((i5 & 32) != 0) {
            i4 = audioContextAndroid.audioMode;
        }
        int i6 = i3;
        int i7 = i4;
        return audioContextAndroid.copy(z, z2, i, i2, i6, i7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSpeakerphoneOn() {
        return this.isSpeakerphoneOn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getStayAwake() {
        return this.stayAwake;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUsageType() {
        return this.usageType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAudioFocus() {
        return this.audioFocus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAudioMode() {
        return this.audioMode;
    }

    public final AudioContextAndroid copy(boolean isSpeakerphoneOn, boolean stayAwake, int contentType, int usageType, int audioFocus, int audioMode) {
        return new AudioContextAndroid(isSpeakerphoneOn, stayAwake, contentType, usageType, audioFocus, audioMode);
    }

    public String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.isSpeakerphoneOn + ", stayAwake=" + this.stayAwake + ", contentType=" + this.contentType + ", usageType=" + this.usageType + ", audioFocus=" + this.audioFocus + ", audioMode=" + this.audioMode + ")";
    }

    public AudioContextAndroid(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        this.isSpeakerphoneOn = z;
        this.stayAwake = z2;
        this.contentType = i;
        this.usageType = i2;
        this.audioFocus = i3;
        this.audioMode = i4;
    }

    public final boolean isSpeakerphoneOn() {
        return this.isSpeakerphoneOn;
    }

    public final boolean getStayAwake() {
        return this.stayAwake;
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final int getUsageType() {
        return this.usageType;
    }

    public final int getAudioFocus() {
        return this.audioFocus;
    }

    public final int getAudioMode() {
        return this.audioMode;
    }

    public AudioContextAndroid() {
        this(false, false, 2, 1, 1, 0);
    }

    public final void setAttributesOnPlayer(MediaPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setAudioAttributes(buildAttributes());
    }

    public final AudioAttributes buildAttributes() {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(this.usageType).setContentType(this.contentType).build();
        Intrinsics.checkNotNullExpressionValue(audioAttributesBuild, "build(...)");
        return audioAttributesBuild;
    }

    @Deprecated(message = "This is used for Android older than LOLLIPOP", replaceWith = @ReplaceWith(expression = "buildAttributes", imports = {}))
    private final int getStreamType() {
        int i = this.usageType;
        if (i != 2) {
            return i != 6 ? 3 : 2;
        }
        return 0;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isSpeakerphoneOn), Boolean.valueOf(this.stayAwake), Integer.valueOf(this.contentType), Integer.valueOf(this.usageType), Integer.valueOf(this.audioFocus), Integer.valueOf(this.audioMode));
    }

    public boolean equals(Object other) {
        if (!(other instanceof AudioContextAndroid)) {
            return false;
        }
        AudioContextAndroid audioContextAndroid = (AudioContextAndroid) other;
        return this.isSpeakerphoneOn == audioContextAndroid.isSpeakerphoneOn && this.stayAwake == audioContextAndroid.stayAwake && this.contentType == audioContextAndroid.contentType && this.usageType == audioContextAndroid.usageType && this.audioFocus == audioContextAndroid.audioFocus && this.audioMode == audioContextAndroid.audioMode;
    }
}
