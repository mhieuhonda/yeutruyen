package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import io.flutter.plugin.common.MethodCall;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class FlutterRequestConfiguration {
    private final String maxAdContentRating;
    private final Integer tagForChildDirectedTreatment;
    private final Integer tagForUnderAgeOfConsent;
    private final List<String> testDeviceIds;

    public static void updateRequestConfiguration(MethodCall methodCall) {
        RequestConfiguration.Builder builder = MobileAds.getRequestConfiguration().toBuilder();
        String str = (String) methodCall.argument("maxAdContentRating");
        Integer num = (Integer) methodCall.argument("tagForChildDirectedTreatment");
        Integer num2 = (Integer) methodCall.argument("tagForUnderAgeOfConsent");
        List<String> list = (List) methodCall.argument("testDeviceIds");
        if (str != null) {
            builder.setMaxAdContentRating(str);
        }
        if (num != null) {
            builder.setTagForChildDirectedTreatment(num.intValue());
        }
        if (num2 != null) {
            builder.setTagForUnderAgeOfConsent(num2.intValue());
        }
        if (list != null) {
            builder.setTestDeviceIds(list);
        }
        MobileAds.setRequestConfiguration(builder.build());
    }

    protected static class Builder {
        private String maxAdContentRating;
        private Integer tagForChildDirectedTreatment = -1;
        private Integer tagForUnderAgeOfConsent = -1;
        private List<String> testDeviceIds;

        protected Builder() {
        }

        Builder setMaxAdContentRating(String str) {
            this.maxAdContentRating = str;
            return this;
        }

        Builder setTagForChildDirectedTreatment(Integer num) {
            this.tagForChildDirectedTreatment = num;
            return this;
        }

        Builder setTagForUnderAgeOfConsent(Integer num) {
            this.tagForUnderAgeOfConsent = num;
            return this;
        }

        Builder setTestDeviceIds(List<String> list) {
            this.testDeviceIds = list;
            return this;
        }

        protected String getMaxAdContentRating() {
            return this.maxAdContentRating;
        }

        protected Integer getTagForChildDirectedTreatment() {
            return this.tagForChildDirectedTreatment;
        }

        protected Integer getTagForUnderAgeOfConsent() {
            return this.tagForUnderAgeOfConsent;
        }

        protected List<String> getTestDeviceIds() {
            return this.testDeviceIds;
        }

        FlutterRequestConfiguration build() {
            return new FlutterRequestConfiguration(this.maxAdContentRating, this.tagForChildDirectedTreatment, this.tagForUnderAgeOfConsent, this.testDeviceIds);
        }
    }

    public FlutterRequestConfiguration(String str, Integer num, Integer num2, List<String> list) {
        this.maxAdContentRating = str;
        this.tagForChildDirectedTreatment = num;
        this.tagForUnderAgeOfConsent = num2;
        this.testDeviceIds = list;
    }

    protected String getMaxAdContentRating() {
        return this.maxAdContentRating;
    }

    protected Integer getTagForChildDirectedTreatment() {
        return this.tagForChildDirectedTreatment;
    }

    protected Integer getTagForUnderAgeOfConsent() {
        return this.tagForUnderAgeOfConsent;
    }

    protected List<String> getTestDeviceIds() {
        return this.testDeviceIds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterRequestConfiguration)) {
            return false;
        }
        FlutterRequestConfiguration flutterRequestConfiguration = (FlutterRequestConfiguration) obj;
        return Objects.equals(this.maxAdContentRating, flutterRequestConfiguration.maxAdContentRating) && Objects.equals(this.tagForChildDirectedTreatment, flutterRequestConfiguration.tagForChildDirectedTreatment) && Objects.equals(this.tagForUnderAgeOfConsent, flutterRequestConfiguration.tagForUnderAgeOfConsent) && Objects.equals(this.testDeviceIds, flutterRequestConfiguration.testDeviceIds);
    }

    public int hashCode() {
        return Objects.hash(this.maxAdContentRating, this.tagForChildDirectedTreatment, this.tagForUnderAgeOfConsent, this.testDeviceIds);
    }
}
