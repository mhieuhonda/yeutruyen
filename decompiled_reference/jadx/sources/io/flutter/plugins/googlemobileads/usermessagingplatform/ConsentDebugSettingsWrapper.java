package io.flutter.plugins.googlemobileads.usermessagingplatform;

import android.content.Context;
import com.google.android.ump.ConsentDebugSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class ConsentDebugSettingsWrapper {
    private final Integer debugGeography;
    private final List<String> testIdentifiers;

    ConsentDebugSettingsWrapper(Integer num, List<String> list) {
        this.debugGeography = num;
        this.testIdentifiers = list;
    }

    Integer getDebugGeography() {
        return this.debugGeography;
    }

    List<String> getTestIdentifiers() {
        return this.testIdentifiers;
    }

    ConsentDebugSettings getAsConsentDebugSettings(Context context) {
        ConsentDebugSettings.Builder builder = new ConsentDebugSettings.Builder(context);
        Integer num = this.debugGeography;
        if (num != null) {
            builder.setDebugGeography(num.intValue());
        }
        List<String> list = this.testIdentifiers;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                builder.addTestDeviceHashedId(it.next());
            }
        }
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentDebugSettingsWrapper)) {
            return false;
        }
        ConsentDebugSettingsWrapper consentDebugSettingsWrapper = (ConsentDebugSettingsWrapper) obj;
        return Objects.equals(this.debugGeography, consentDebugSettingsWrapper.getDebugGeography()) && Objects.equals(this.testIdentifiers, consentDebugSettingsWrapper.getTestIdentifiers());
    }

    public int hashCode() {
        return Objects.hash(this.debugGeography, this.testIdentifiers);
    }
}
