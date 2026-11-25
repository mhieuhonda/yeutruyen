package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.Log;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class KeyEmbedderResponder implements KeyboardManager.Responder {
    private static final String TAG = "KeyEmbedderResponder";
    private final BinaryMessenger messenger;
    private final HashMap<Long, Long> pressingRecords = new HashMap<>();
    private final HashMap<Long, KeyboardMap.TogglingGoal> togglingGoals = new HashMap<>();
    private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();

    private static long keyOfPlane(long j, long j2) {
        return (j & KeyboardMap.kValueMask) | j2;
    }

    private static KeyData.Type getEventType(KeyEvent keyEvent) {
        boolean z = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z ? KeyData.Type.kRepeat : KeyData.Type.kDown;
        }
        if (action == 1) {
            return KeyData.Type.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    public KeyEmbedderResponder(BinaryMessenger binaryMessenger) {
        this.messenger = binaryMessenger;
        for (KeyboardMap.TogglingGoal togglingGoal : KeyboardMap.getTogglingGoals()) {
            this.togglingGoals.put(Long.valueOf(togglingGoal.logicalKey), togglingGoal);
        }
    }

    private Long getPhysicalKey(KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
        }
        Long l = KeyboardMap.scanCodeToPhysical.get(Long.valueOf(scanCode));
        return l != null ? l : Long.valueOf(keyOfPlane(keyEvent.getScanCode(), KeyboardMap.kAndroidPlane));
    }

    private Long getLogicalKey(KeyEvent keyEvent) {
        Long l = KeyboardMap.keyCodeToLogical.get(Long.valueOf(keyEvent.getKeyCode()));
        return l != null ? l : Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
    }

    void updatePressingState(Long l, Long l2) {
        HashMap<Long, Long> map = this.pressingRecords;
        if (l2 != null) {
            if (map.put(l, l2) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (map.remove(l) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    void synchronizePressingKey(KeyboardMap.PressingGoal pressingGoal, boolean z, long j, final long j2, final KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        boolean[] zArr = new boolean[pressingGoal.keys.length];
        Boolean[] boolArr = new Boolean[pressingGoal.keys.length];
        int i = 0;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (i >= pressingGoal.keys.length) {
                break;
            }
            final KeyboardMap.KeyPair keyPair = pressingGoal.keys[i];
            zArr[i] = this.pressingRecords.containsKey(Long.valueOf(keyPair.physicalKey));
            if (keyPair.logicalKey == j) {
                int i2 = AnonymousClass1.$SwitchMap$io$flutter$embedding$android$KeyData$Type[getEventType(keyEvent).ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    } else if (i2 == 3) {
                        if (!z) {
                            arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.KeyEmbedderResponder$$ExternalSyntheticLambda2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f$0.m320xa7448bcd(keyPair, j2, keyEvent);
                                }
                            });
                        }
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    }
                    i++;
                } else {
                    boolArr[i] = false;
                    if (!z) {
                        arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.KeyEmbedderResponder$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.m319x63b96e0c(keyPair, j2, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z2 && !zArr[i]) {
                z3 = false;
            }
            z2 = z3;
            i++;
        }
        boolean z4 = keyEvent.getDeviceId() == -1;
        if (z) {
            for (int i3 = 0; i3 < pressingGoal.keys.length; i3++) {
                if (boolArr[i3] == null) {
                    if (z2 || z4) {
                        boolArr[i3] = Boolean.valueOf(zArr[i3]);
                    } else {
                        boolArr[i3] = true;
                        z2 = true;
                    }
                }
            }
            if (!z2 && !z4) {
                boolArr[0] = true;
            }
        } else {
            for (int i4 = 0; i4 < pressingGoal.keys.length; i4++) {
                if (boolArr[i4] == null) {
                    boolArr[i4] = false;
                }
            }
        }
        for (int i5 = 0; i5 < pressingGoal.keys.length; i5++) {
            if (zArr[i5] != boolArr[i5].booleanValue()) {
                KeyboardMap.KeyPair keyPair2 = pressingGoal.keys[i5];
                synthesizeEvent(boolArr[i5].booleanValue(), Long.valueOf(keyPair2.logicalKey), Long.valueOf(keyPair2.physicalKey), keyEvent.getEventTime());
            }
        }
    }

    /* JADX INFO: renamed from: io.flutter.embedding.android.KeyEmbedderResponder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$android$KeyData$Type;

        static {
            int[] iArr = new int[KeyData.Type.values().length];
            $SwitchMap$io$flutter$embedding$android$KeyData$Type = iArr;
            try {
                iArr[KeyData.Type.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: lambda$synchronizePressingKey$0$io-flutter-embedding-android-KeyEmbedderResponder, reason: not valid java name */
    /* synthetic */ void m319x63b96e0c(KeyboardMap.KeyPair keyPair, long j, KeyEvent keyEvent) {
        synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j), keyEvent.getEventTime());
    }

    /* JADX INFO: renamed from: lambda$synchronizePressingKey$1$io-flutter-embedding-android-KeyEmbedderResponder, reason: not valid java name */
    /* synthetic */ void m320xa7448bcd(KeyboardMap.KeyPair keyPair, long j, KeyEvent keyEvent) {
        synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j), keyEvent.getEventTime());
    }

    void synchronizeTogglingKey(KeyboardMap.TogglingGoal togglingGoal, boolean z, long j, KeyEvent keyEvent) {
        if (togglingGoal.logicalKey == j || togglingGoal.enabled == z) {
            return;
        }
        boolean zContainsKey = this.pressingRecords.containsKey(Long.valueOf(togglingGoal.physicalKey));
        boolean z2 = !zContainsKey;
        if (!zContainsKey) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(z2, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
        if (zContainsKey) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(zContainsKey, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:0x013f A[LOOP:2: B:70:0x0139->B:72:0x013f, LOOP_END] */
    private boolean handleEventImpl(KeyEvent keyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        boolean z;
        Long l;
        KeyData.Type type;
        KeyData keyData;
        int source;
        Iterator<Runnable> it;
        KeyboardMap.TogglingGoal togglingGoal;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            return false;
        }
        Long physicalKey = getPhysicalKey(keyEvent);
        Long logicalKey = getLogicalKey(keyEvent);
        ArrayList<Runnable> arrayList = new ArrayList<>();
        for (KeyboardMap.PressingGoal pressingGoal : KeyboardMap.pressingGoals) {
            synchronizePressingKey(pressingGoal, (keyEvent.getMetaState() & pressingGoal.mask) != 0, logicalKey.longValue(), physicalKey.longValue(), keyEvent, arrayList);
        }
        for (KeyboardMap.TogglingGoal togglingGoal2 : this.togglingGoals.values()) {
            synchronizeTogglingKey(togglingGoal2, (keyEvent.getMetaState() & togglingGoal2.mask) != 0, logicalKey.longValue(), keyEvent);
        }
        int action = keyEvent.getAction();
        if (action == 0) {
            z = true;
        } else {
            if (action != 1) {
                return false;
            }
            z = false;
        }
        Long l2 = this.pressingRecords.get(physicalKey);
        if (z) {
            if (l2 == null) {
                type = KeyData.Type.kDown;
            } else {
                if (keyEvent.getRepeatCount() > 0) {
                    type = KeyData.Type.kRepeat;
                } else {
                    l = physicalKey;
                    synthesizeEvent(false, l2, l, keyEvent.getEventTime());
                    type = KeyData.Type.kDown;
                }
                char cCharValue = this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()).charValue();
                String str = cCharValue != 0 ? "" + cCharValue : null;
                if (type != KeyData.Type.kRepeat) {
                    updatePressingState(l, z ? logicalKey : null);
                }
                if (type == KeyData.Type.kDown && (togglingGoal = this.togglingGoals.get(logicalKey)) != null) {
                    togglingGoal.enabled = !togglingGoal.enabled;
                }
                keyData = new KeyData();
                source = keyEvent.getSource();
                if (source == 513) {
                    keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
                } else if (source == 1025) {
                    keyData.deviceType = KeyData.DeviceType.kGamepad;
                } else if (source == 16777232) {
                    keyData.deviceType = KeyData.DeviceType.kJoystick;
                } else if (source != 33554433) {
                    keyData.deviceType = KeyData.DeviceType.kKeyboard;
                } else {
                    keyData.deviceType = KeyData.DeviceType.kHdmi;
                }
                keyData.timestamp = keyEvent.getEventTime();
                keyData.type = type;
                keyData.logicalKey = logicalKey.longValue();
                keyData.physicalKey = l.longValue();
                keyData.character = str;
                keyData.synthesized = false;
                sendKeyEvent(keyData, onKeyEventHandledCallback);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                return true;
            }
            l = physicalKey;
            char cCharValue2 = this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()).charValue();
            if (cCharValue2 != 0) {
            }
            if (type != KeyData.Type.kRepeat) {
                updatePressingState(l, z ? logicalKey : null);
            }
            if (type == KeyData.Type.kDown) {
                togglingGoal.enabled = !togglingGoal.enabled;
            }
            keyData = new KeyData();
            source = keyEvent.getSource();
            if (source == 513) {
                keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
            } else if (source == 1025) {
                keyData.deviceType = KeyData.DeviceType.kGamepad;
            } else if (source == 16777232) {
                keyData.deviceType = KeyData.DeviceType.kJoystick;
            } else if (source != 33554433) {
                keyData.deviceType = KeyData.DeviceType.kKeyboard;
            } else {
                keyData.deviceType = KeyData.DeviceType.kHdmi;
            }
            keyData.timestamp = keyEvent.getEventTime();
            keyData.type = type;
            keyData.logicalKey = logicalKey.longValue();
            keyData.physicalKey = l.longValue();
            keyData.character = str;
            keyData.synthesized = false;
            sendKeyEvent(keyData, onKeyEventHandledCallback);
            it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return true;
        }
        l = physicalKey;
        if (l2 == null) {
            return false;
        }
        type = KeyData.Type.kUp;
        if (type != KeyData.Type.kRepeat) {
            updatePressingState(l, z ? logicalKey : null);
        }
        if (type == KeyData.Type.kDown) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        keyData = new KeyData();
        source = keyEvent.getSource();
        if (source == 513) {
            keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
        } else if (source == 1025) {
            keyData.deviceType = KeyData.DeviceType.kGamepad;
        } else if (source == 16777232) {
            keyData.deviceType = KeyData.DeviceType.kJoystick;
        } else if (source != 33554433) {
            keyData.deviceType = KeyData.DeviceType.kKeyboard;
        } else {
            keyData.deviceType = KeyData.DeviceType.kHdmi;
        }
        keyData.timestamp = keyEvent.getEventTime();
        keyData.type = type;
        keyData.logicalKey = logicalKey.longValue();
        keyData.physicalKey = l.longValue();
        keyData.character = str;
        keyData.synthesized = false;
        sendKeyEvent(keyData, onKeyEventHandledCallback);
        it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        return true;
    }

    private void synthesizeEvent(boolean z, Long l, Long l2, long j) {
        KeyData keyData = new KeyData();
        keyData.timestamp = j;
        keyData.type = z ? KeyData.Type.kDown : KeyData.Type.kUp;
        keyData.logicalKey = l.longValue();
        keyData.physicalKey = l2.longValue();
        keyData.character = null;
        keyData.synthesized = true;
        keyData.deviceType = KeyData.DeviceType.kKeyboard;
        if (l2.longValue() != 0 && l.longValue() != 0) {
            if (!z) {
                l = null;
            }
            updatePressingState(l2, l);
        }
        sendKeyEvent(keyData, null);
    }

    private void sendKeyEvent(KeyData keyData, final KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.messenger.send(KeyData.CHANNEL, keyData.toBytes(), onKeyEventHandledCallback == null ? null : new BinaryMessenger.BinaryReply() { // from class: io.flutter.embedding.android.KeyEmbedderResponder$$ExternalSyntheticLambda0
            @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
            public final void reply(ByteBuffer byteBuffer) {
                KeyEmbedderResponder.lambda$sendKeyEvent$2(onKeyEventHandledCallback, byteBuffer);
            }
        });
    }

    static /* synthetic */ void lambda$sendKeyEvent$2(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback, ByteBuffer byteBuffer) {
        Boolean boolValueOf = false;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            Log.w(TAG, "A null reply was received when sending a key event to the framework.");
        }
        onKeyEventHandledCallback.onKeyEventHandled(boolValueOf.booleanValue());
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(KeyEvent keyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        if (handleEventImpl(keyEvent, onKeyEventHandledCallback)) {
            return;
        }
        synthesizeEvent(true, 0L, 0L, 0L);
        onKeyEventHandledCallback.onKeyEventHandled(true);
    }

    public Map<Long, Long> getPressedState() {
        return Collections.unmodifiableMap(this.pressingRecords);
    }
}
