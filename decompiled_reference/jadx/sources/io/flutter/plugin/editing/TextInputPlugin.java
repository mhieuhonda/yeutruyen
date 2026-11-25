package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Editable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import io.flutter.Log;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.ScribeChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.PlatformViewsController2;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputPlugin implements ListenableEditingState.EditingStateWatcher {
    private static final String TAG = "TextInputPlugin";
    private final AutofillManager afm;
    private SparseArray<TextInputChannel.Configuration> autofillConfiguration;
    private TextInputChannel.Configuration configuration;
    private ImeSyncDeferringInsetsCallback imeSyncCallback;
    private InputTarget inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
    private boolean isInputConnectionLocked;
    private Rect lastClientRect;
    private InputConnection lastInputConnection;
    private ListenableEditingState mEditable;
    private final InputMethodManager mImm;
    private TextInputChannel.TextEditState mLastKnownFrameworkTextEditingState;
    private boolean mRestartInputPending;
    private final View mView;
    private PlatformViewsController platformViewsController;
    private PlatformViewsController2 platformViewsController2;
    private final ScribeChannel scribeChannel;
    private final TextInputChannel textInputChannel;

    private interface MinMax {
        void inspect(double d, double d2);
    }

    public TextInputPlugin(View view, TextInputChannel textInputChannel, ScribeChannel scribeChannel, PlatformViewsController platformViewsController, PlatformViewsController2 platformViewsController2) {
        this.mView = view;
        this.mEditable = new ListenableEditingState(null, view);
        this.mImm = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (Build.VERSION.SDK_INT >= 26) {
            this.afm = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        } else {
            this.afm = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.imeSyncCallback = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            this.imeSyncCallback.setImeVisibilityListener(new ImeSyncDeferringInsetsCallback.ImeVisibilityListener() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
                @Override // io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.ImeVisibilityListener
                public void onImeVisibilityChanged(boolean z) {
                    if (z) {
                        return;
                    }
                    TextInputPlugin.this.mImm.restartInput(TextInputPlugin.this.mView);
                }
            });
        }
        this.textInputChannel = textInputChannel;
        textInputChannel.setTextInputMethodHandler(new TextInputChannel.TextInputMethodHandler() { // from class: io.flutter.plugin.editing.TextInputPlugin.2
            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void show() {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.showTextInput(textInputPlugin.mView);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void hide() {
                InputTarget.Type type = TextInputPlugin.this.inputTarget.type;
                InputTarget.Type type2 = InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW;
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                if (type == type2) {
                    textInputPlugin.notifyViewExited();
                } else {
                    textInputPlugin.hideTextInput(textInputPlugin.mView);
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void requestAutofill() {
                TextInputPlugin.this.notifyViewEntered();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void finishAutofillContext(boolean z) {
                if (Build.VERSION.SDK_INT < 26 || TextInputPlugin.this.afm == null) {
                    return;
                }
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                if (z) {
                    textInputPlugin.afm.commit();
                } else {
                    textInputPlugin.afm.cancel();
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setClient(int i, TextInputChannel.Configuration configuration) {
                TextInputPlugin.this.setTextInputClient(i, configuration);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setPlatformViewClient(int i, boolean z) {
                TextInputPlugin.this.setPlatformViewTextInputClient(i, z);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditingState(TextInputChannel.TextEditState textEditState) {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.setTextInputEditingState(textInputPlugin.mView, textEditState);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditableSizeAndTransform(double d, double d2, double[] dArr) {
                TextInputPlugin.this.saveEditableSizeAndTransform(d, d2, dArr);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void clearClient() {
                TextInputPlugin.this.clearTextInputClient();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void sendAppPrivateCommand(String str, Bundle bundle) {
                TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
            }
        });
        textInputChannel.requestExistingInputState();
        this.scribeChannel = scribeChannel;
        this.platformViewsController = platformViewsController;
        platformViewsController.attachTextInputPlugin(this);
        this.platformViewsController2 = platformViewsController2;
        platformViewsController2.attachTextInputPlugin(this);
    }

    public InputMethodManager getInputMethodManager() {
        return this.mImm;
    }

    Editable getEditable() {
        return this.mEditable;
    }

    ImeSyncDeferringInsetsCallback getImeSyncCallback() {
        return this.imeSyncCallback;
    }

    public void lockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = true;
        }
    }

    public void unlockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = false;
        }
    }

    public void destroy() {
        this.platformViewsController.detachTextInputPlugin();
        this.platformViewsController2.detachTextInputPlugin();
        this.textInputChannel.setTextInputMethodHandler(null);
        notifyViewExited();
        this.mEditable.removeEditingStateListener(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x008b  */
    /* JADX WARN: Code duplicated, block: B:61:0x008e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0092  */
    /* JADX WARN: Code duplicated, block: B:65:0x0095  */
    /* JADX WARN: Code duplicated, block: B:67:0x0099  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    private static int inputTypeFromTextInputType(TextInputChannel.InputType inputType, boolean z, boolean z2, boolean z3, boolean z4, TextInputChannel.TextCapitalization textCapitalization) {
        int i;
        int i2;
        if (inputType.type == TextInputChannel.TextInputType.DATETIME) {
            return 4;
        }
        if (inputType.type == TextInputChannel.TextInputType.NUMBER) {
            int i3 = inputType.isSigned ? InputDeviceCompat.SOURCE_TOUCHSCREEN : 2;
            return inputType.isDecimal ? i3 | 8192 : i3;
        }
        if (inputType.type == TextInputChannel.TextInputType.PHONE) {
            return 3;
        }
        if (inputType.type == TextInputChannel.TextInputType.NONE) {
            return 0;
        }
        if (inputType.type == TextInputChannel.TextInputType.MULTILINE) {
            i = 131073;
        } else if (inputType.type == TextInputChannel.TextInputType.EMAIL_ADDRESS || inputType.type == TextInputChannel.TextInputType.TWITTER) {
            i = 33;
        } else if (inputType.type == TextInputChannel.TextInputType.URL || inputType.type == TextInputChannel.TextInputType.WEB_SEARCH) {
            i = 17;
        } else if (inputType.type == TextInputChannel.TextInputType.VISIBLE_PASSWORD) {
            i = 145;
        } else if (inputType.type == TextInputChannel.TextInputType.NAME) {
            i = 97;
        } else {
            i = inputType.type == TextInputChannel.TextInputType.POSTAL_ADDRESS ? 113 : 1;
        }
        if (!z) {
            if (z2) {
                i |= 32768;
            }
            i2 = z3 ? 524416 : 524432;
            if (textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS) {
                return i | 4096;
            }
            if (textCapitalization == TextInputChannel.TextCapitalization.WORDS) {
                return i | 8192;
            }
            if (textCapitalization == TextInputChannel.TextCapitalization.SENTENCES) {
                return i | 16384;
            }
            return i;
        }
        i |= i2;
        if (textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS) {
            return i | 4096;
        }
        if (textCapitalization == TextInputChannel.TextCapitalization.WORDS) {
            return i | 8192;
        }
        if (textCapitalization == TextInputChannel.TextCapitalization.SENTENCES) {
            return i | 16384;
        }
        return i;
    }

    public InputConnection createInputConnection(View view, KeyboardManager keyboardManager, EditorInfo editorInfo) {
        int iIntValue;
        if (this.inputTarget.type == InputTarget.Type.NO_TARGET) {
            this.lastInputConnection = null;
            return null;
        }
        if (this.inputTarget.type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.isInputConnectionLocked) {
                return this.lastInputConnection;
            }
            InputConnection inputConnectionOnCreateInputConnection = this.platformViewsController.getPlatformViewById(this.inputTarget.id).onCreateInputConnection(editorInfo);
            this.lastInputConnection = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        editorInfo.inputType = inputTypeFromTextInputType(this.configuration.inputType, this.configuration.obscureText, this.configuration.autocorrect, this.configuration.enableSuggestions, this.configuration.enableIMEPersonalizedLearning, this.configuration.textCapitalization);
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.configuration.enableIMEPersonalizedLearning) {
            editorInfo.imeOptions |= 16777216;
        }
        if (this.configuration.inputAction == null) {
            iIntValue = (131072 & editorInfo.inputType) != 0 ? 1 : 6;
        } else {
            iIntValue = this.configuration.inputAction.intValue();
        }
        if (this.configuration.actionLabel != null) {
            editorInfo.actionLabel = this.configuration.actionLabel;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        if (this.configuration.hintLocales != null) {
            editorInfo.hintLocales = new LocaleList(this.configuration.hintLocales);
        }
        if (this.configuration.contentCommitMimeTypes != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, this.configuration.contentCommitMimeTypes);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
        }
        InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(view, this.inputTarget.id, this.textInputChannel, this.scribeChannel, keyboardManager, this.mEditable, editorInfo);
        editorInfo.initialSelStart = this.mEditable.getSelectionStart();
        editorInfo.initialSelEnd = this.mEditable.getSelectionEnd();
        this.lastInputConnection = inputConnectionAdaptor;
        return inputConnectionAdaptor;
    }

    public InputConnection getLastInputConnection() {
        return this.lastInputConnection;
    }

    public void clearPlatformViewClient(int i) {
        if ((this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || this.inputTarget.type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && this.inputTarget.id == i) {
            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
            notifyViewExited();
            this.mImm.hideSoftInputFromWindow(this.mView.getApplicationWindowToken(), 0);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    public void sendTextInputAppPrivateCommand(String str, Bundle bundle) {
        this.mImm.sendAppPrivateCommand(this.mView, str, bundle);
    }

    void showTextInput(View view) {
        TextInputChannel.Configuration configuration = this.configuration;
        if (configuration == null || configuration.inputType == null || this.configuration.inputType.type != TextInputChannel.TextInputType.NONE) {
            view.requestFocus();
            this.mImm.showSoftInput(view, 0);
        } else {
            hideTextInput(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideTextInput(View view) {
        notifyViewExited();
        this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    void setTextInputClient(int i, TextInputChannel.Configuration configuration) {
        notifyViewExited();
        this.configuration = configuration;
        this.inputTarget = new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, i);
        this.mEditable.removeEditingStateListener(this);
        this.mEditable = new ListenableEditingState(configuration.autofill != null ? configuration.autofill.editState : null, this.mView);
        updateAutofillConfigurationIfNeeded(configuration);
        this.mRestartInputPending = true;
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        this.mEditable.addEditingStateListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformViewTextInputClient(int i, boolean z) {
        if (z) {
            this.mView.requestFocus();
            this.inputTarget = new InputTarget(InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
            return;
        }
        this.inputTarget = new InputTarget(InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i);
        this.lastInputConnection = null;
    }

    private static boolean composingChanged(TextInputChannel.TextEditState textEditState, TextInputChannel.TextEditState textEditState2) {
        int i = textEditState.composingEnd - textEditState.composingStart;
        if (i != textEditState2.composingEnd - textEditState2.composingStart) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (textEditState.text.charAt(textEditState.composingStart + i2) != textEditState2.text.charAt(textEditState2.composingStart + i2)) {
                return true;
            }
        }
        return false;
    }

    void setTextInputEditingState(View view, TextInputChannel.TextEditState textEditState) {
        TextInputChannel.TextEditState textEditState2;
        if (!this.mRestartInputPending && (textEditState2 = this.mLastKnownFrameworkTextEditingState) != null && textEditState2.hasComposing()) {
            boolean zComposingChanged = composingChanged(this.mLastKnownFrameworkTextEditingState, textEditState);
            this.mRestartInputPending = zComposingChanged;
            if (zComposingChanged) {
                Log.i(TAG, "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.mLastKnownFrameworkTextEditingState = textEditState;
        this.mEditable.setEditingState(textEditState);
        if (this.mRestartInputPending) {
            this.mImm.restartInput(view);
            this.mRestartInputPending = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveEditableSizeAndTransform(double d, double d2, final double[] dArr) {
        final double[] dArr2 = new double[4];
        final boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d3 = dArr[12];
        double d4 = dArr[15];
        double d5 = d3 / d4;
        dArr2[1] = d5;
        dArr2[0] = d5;
        double d6 = dArr[13] / d4;
        dArr2[3] = d6;
        dArr2[2] = d6;
        MinMax minMax = new MinMax() { // from class: io.flutter.plugin.editing.TextInputPlugin.3
            @Override // io.flutter.plugin.editing.TextInputPlugin.MinMax
            public void inspect(double d7, double d8) {
                double d9 = 1.0d;
                if (!z) {
                    double[] dArr3 = dArr;
                    d9 = 1.0d / (((dArr3[3] * d7) + (dArr3[7] * d8)) + dArr3[15]);
                }
                double[] dArr4 = dArr;
                double d10 = ((dArr4[0] * d7) + (dArr4[4] * d8) + dArr4[12]) * d9;
                double d11 = ((dArr4[1] * d7) + (dArr4[5] * d8) + dArr4[13]) * d9;
                double[] dArr5 = dArr2;
                if (d10 < dArr5[0]) {
                    dArr5[0] = d10;
                } else if (d10 > dArr5[1]) {
                    dArr5[1] = d10;
                }
                if (d11 < dArr5[2]) {
                    dArr5[2] = d11;
                } else if (d11 > dArr5[3]) {
                    dArr5[3] = d11;
                }
            }
        };
        minMax.inspect(d, 0.0d);
        minMax.inspect(d, d2);
        minMax.inspect(0.0d, d2);
        Float fValueOf = Float.valueOf(this.mView.getContext().getResources().getDisplayMetrics().density);
        this.lastClientRect = new Rect((int) (dArr2[0] * ((double) fValueOf.floatValue())), (int) (dArr2[2] * ((double) fValueOf.floatValue())), (int) Math.ceil(dArr2[1] * ((double) fValueOf.floatValue())), (int) Math.ceil(dArr2[3] * ((double) fValueOf.floatValue())));
    }

    void clearTextInputClient() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.mEditable.removeEditingStateListener(this);
        notifyViewExited();
        this.configuration = null;
        updateAutofillConfigurationIfNeeded(null);
        this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.mView);
        if (rootWindowInsets == null || rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime())) {
            return;
        }
        this.mImm.restartInput(this.mView);
    }

    private static class InputTarget {
        int id;
        Type type;

        enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public InputTarget(Type type, int i) {
            this.type = type;
            this.id = i;
        }
    }

    public boolean handleKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!getInputMethodManager().isAcceptingText() || (inputConnection = this.lastInputConnection) == null) {
            return false;
        }
        if (inputConnection instanceof InputConnectionAdaptor) {
            return ((InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent);
        }
        return inputConnection.sendKeyEvent(keyEvent);
    }

    @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
    public void didChangeEditingState(boolean z, boolean z2, boolean z3) {
        if (z) {
            notifyValueChanged(this.mEditable.toString());
        }
        int selectionStart = this.mEditable.getSelectionStart();
        int selectionEnd = this.mEditable.getSelectionEnd();
        int composingStart = this.mEditable.getComposingStart();
        int composingEnd = this.mEditable.getComposingEnd();
        ArrayList<TextEditingDelta> arrayListExtractBatchTextEditingDeltas = this.mEditable.extractBatchTextEditingDeltas();
        if (this.mLastKnownFrameworkTextEditingState != null && (!this.mEditable.toString().equals(this.mLastKnownFrameworkTextEditingState.text) || selectionStart != this.mLastKnownFrameworkTextEditingState.selectionStart || selectionEnd != this.mLastKnownFrameworkTextEditingState.selectionEnd || composingStart != this.mLastKnownFrameworkTextEditingState.composingStart || composingEnd != this.mLastKnownFrameworkTextEditingState.composingEnd)) {
            Log.v(TAG, "send EditingState to flutter: " + this.mEditable.toString());
            boolean z4 = this.configuration.enableDeltaModel;
            TextInputChannel textInputChannel = this.textInputChannel;
            if (z4) {
                textInputChannel.updateEditingStateWithDeltas(this.inputTarget.id, arrayListExtractBatchTextEditingDeltas);
                this.mEditable.clearBatchDeltas();
            } else {
                textInputChannel.updateEditingState(this.inputTarget.id, this.mEditable.toString(), selectionStart, selectionEnd, composingStart, composingEnd);
                selectionStart = selectionStart;
                selectionEnd = selectionEnd;
                composingStart = composingStart;
                composingEnd = composingEnd;
            }
            this.mLastKnownFrameworkTextEditingState = new TextInputChannel.TextEditState(this.mEditable.toString(), selectionStart, selectionEnd, composingStart, composingEnd);
            return;
        }
        this.mEditable.clearBatchDeltas();
    }

    private boolean needsAutofill() {
        return this.autofillConfiguration != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewEntered() {
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        String str = this.configuration.autofill.uniqueIdentifier;
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.lastClientRect);
        rect.offset(iArr[0], iArr[1]);
        this.afm.notifyViewEntered(this.mView, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewExited() {
        TextInputChannel.Configuration configuration;
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || (configuration = this.configuration) == null || configuration.autofill == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyViewExited(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode());
    }

    private void notifyValueChanged(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyValueChanged(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(str));
    }

    private void updateAutofillConfigurationIfNeeded(TextInputChannel.Configuration configuration) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (configuration == null || configuration.autofill == null) {
            this.autofillConfiguration = null;
            return;
        }
        TextInputChannel.Configuration[] configurationArr = configuration.fields;
        SparseArray<TextInputChannel.Configuration> sparseArray = new SparseArray<>();
        this.autofillConfiguration = sparseArray;
        if (configurationArr == null) {
            sparseArray.put(configuration.autofill.uniqueIdentifier.hashCode(), configuration);
            return;
        }
        for (TextInputChannel.Configuration configuration2 : configurationArr) {
            TextInputChannel.Configuration.Autofill autofill = configuration2.autofill;
            if (autofill != null) {
                this.autofillConfiguration.put(autofill.uniqueIdentifier.hashCode(), configuration2);
                this.afm.notifyValueChanged(this.mView, autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(autofill.editState.text));
            }
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !needsAutofill()) {
            return;
        }
        String str = this.configuration.autofill.uniqueIdentifier;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i2 = 0; i2 < this.autofillConfiguration.size(); i2++) {
            int iKeyAt = this.autofillConfiguration.keyAt(i2);
            TextInputChannel.Configuration.Autofill autofill = this.autofillConfiguration.valueAt(i2).autofill;
            if (autofill != null) {
                viewStructure.addChildCount(1);
                ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
                viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                if (autofill.hints.length > 0) {
                    viewStructureNewChild.setAutofillHints(autofill.hints);
                }
                viewStructureNewChild.setAutofillType(1);
                viewStructureNewChild.setVisibility(0);
                if (autofill.hintText != null) {
                    viewStructureNewChild.setHint(autofill.hintText);
                }
                if (str.hashCode() == iKeyAt && (rect = this.lastClientRect) != null) {
                    viewStructureNewChild.setDimens(rect.left, this.lastClientRect.top, 0, 0, this.lastClientRect.width(), this.lastClientRect.height());
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(this.mEditable));
                } else {
                    viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(autofill.editState.text));
                }
            }
        }
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        TextInputChannel.Configuration configuration;
        if (Build.VERSION.SDK_INT < 26 || (configuration = this.configuration) == null || this.autofillConfiguration == null || configuration.autofill == null) {
            return;
        }
        TextInputChannel.Configuration.Autofill autofill = this.configuration.autofill;
        HashMap<String, TextInputChannel.TextEditState> map = new HashMap<>();
        for (int i = 0; i < sparseArray.size(); i++) {
            TextInputChannel.Configuration configuration2 = this.autofillConfiguration.get(sparseArray.keyAt(i));
            if (configuration2 != null && configuration2.autofill != null) {
                TextInputChannel.Configuration.Autofill autofill2 = configuration2.autofill;
                String string = sparseArray.valueAt(i).getTextValue().toString();
                TextInputChannel.TextEditState textEditState = new TextInputChannel.TextEditState(string, string.length(), string.length(), -1, -1);
                if (autofill2.uniqueIdentifier.equals(autofill.uniqueIdentifier)) {
                    this.mEditable.setEditingState(textEditState);
                } else {
                    map.put(autofill2.uniqueIdentifier, textEditState);
                }
            }
        }
        this.textInputChannel.updateEditingStateWithTag(this.inputTarget.id, map);
    }
}
