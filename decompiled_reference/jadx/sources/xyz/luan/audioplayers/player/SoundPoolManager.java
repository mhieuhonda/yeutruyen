package xyz.luan.audioplayers.player;

import android.media.AudioAttributes;
import android.media.SoundPool;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import xyz.luan.audioplayers.AudioContextAndroid;
import xyz.luan.audioplayers.AudioplayersPlugin;
import xyz.luan.audioplayers.source.UrlSource;

/* JADX INFO: compiled from: SoundPoolPlayer.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lxyz/luan/audioplayers/player/SoundPoolManager;", "", "ref", "Lxyz/luan/audioplayers/AudioplayersPlugin;", "<init>", "(Lxyz/luan/audioplayers/AudioplayersPlugin;)V", "legacySoundPoolWrapper", "Lxyz/luan/audioplayers/player/SoundPoolWrapper;", "soundPoolWrappers", "Ljava/util/HashMap;", "Landroid/media/AudioAttributes;", "Lkotlin/collections/HashMap;", "createSoundPoolWrapper", "", "maxStreams", "", "audioContext", "Lxyz/luan/audioplayers/AudioContextAndroid;", "getSoundPoolWrapper", "dispose", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SoundPoolManager {
    private SoundPoolWrapper legacySoundPoolWrapper;
    private final AudioplayersPlugin ref;
    private final HashMap<AudioAttributes, SoundPoolWrapper> soundPoolWrappers;

    public SoundPoolManager(AudioplayersPlugin ref) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.ref = ref;
        this.soundPoolWrappers = new HashMap<>();
    }

    public final void createSoundPoolWrapper(int maxStreams, AudioContextAndroid audioContext) {
        Intrinsics.checkNotNullParameter(audioContext, "audioContext");
        AudioAttributes audioAttributesBuildAttributes = audioContext.buildAttributes();
        if (this.soundPoolWrappers.containsKey(audioAttributesBuildAttributes)) {
            return;
        }
        SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(audioAttributesBuildAttributes).setMaxStreams(maxStreams).build();
        this.ref.handleGlobalLog("Create SoundPool with " + audioAttributesBuildAttributes);
        Intrinsics.checkNotNull(soundPoolBuild);
        final SoundPoolWrapper soundPoolWrapper = new SoundPoolWrapper(soundPoolBuild);
        soundPoolWrapper.getSoundPool().setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: xyz.luan.audioplayers.player.SoundPoolManager$$ExternalSyntheticLambda0
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                SoundPoolManager.createSoundPoolWrapper$lambda$0(this.f$0, soundPoolWrapper, soundPool, i, i2);
            }
        });
        this.soundPoolWrappers.put(audioAttributesBuildAttributes, soundPoolWrapper);
    }

    static final void createSoundPoolWrapper$lambda$0(SoundPoolManager soundPoolManager, SoundPoolWrapper soundPoolWrapper, SoundPool soundPool, int i, int i2) {
        soundPoolManager.ref.handleGlobalLog("Loaded " + i);
        SoundPoolPlayer soundPoolPlayer = soundPoolWrapper.getSoundIdToPlayer().get(Integer.valueOf(i));
        UrlSource urlSource = soundPoolPlayer != null ? soundPoolPlayer.getUrlSource() : null;
        if (urlSource != null) {
            TypeIntrinsics.asMutableMap(soundPoolWrapper.getSoundIdToPlayer()).remove(soundPoolPlayer.getSoundId());
            synchronized (soundPoolWrapper.getUrlToPlayers()) {
                List<SoundPoolPlayer> listEmptyList = soundPoolWrapper.getUrlToPlayers().get(urlSource);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                for (SoundPoolPlayer soundPoolPlayer2 : listEmptyList) {
                    soundPoolPlayer2.getWrappedPlayer().handleLog("Marking " + soundPoolPlayer2 + " as loaded");
                    soundPoolPlayer2.getWrappedPlayer().setPrepared(true);
                    if (soundPoolPlayer2.getWrappedPlayer().getPlaying()) {
                        soundPoolPlayer2.getWrappedPlayer().handleLog("Delayed start of " + soundPoolPlayer2);
                        soundPoolPlayer2.start();
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final SoundPoolWrapper getSoundPoolWrapper(AudioContextAndroid audioContext) {
        Intrinsics.checkNotNullParameter(audioContext, "audioContext");
        return this.soundPoolWrappers.get(audioContext.buildAttributes());
    }

    public final void dispose() {
        Iterator<Map.Entry<AudioAttributes, SoundPoolWrapper>> it = this.soundPoolWrappers.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().dispose();
        }
        this.soundPoolWrappers.clear();
    }
}
