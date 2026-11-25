package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class FlutterAdRequest {
    private final Map<String, String> adMobExtras;
    private final String contentUrl;
    private final Integer httpTimeoutMillis;
    private final List<String> keywords;
    private final List<FlutterMediationExtras> mediationExtras;
    private final String mediationExtrasIdentifier;
    private final MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
    private final List<String> neighboringContentUrls;
    private final Boolean nonPersonalizedAds;
    private final String requestAgent;

    protected static class Builder {
        private Map<String, String> adMobExtras;
        private String contentUrl;
        private Integer httpTimeoutMillis;
        private List<String> keywords;
        private List<FlutterMediationExtras> mediationExtras;
        private String mediationExtrasIdentifier;
        private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
        private List<String> neighboringContentUrls;
        private Boolean nonPersonalizedAds;
        private String requestAgent;

        protected Builder() {
        }

        Builder setRequestAgent(String str) {
            this.requestAgent = str;
            return this;
        }

        Builder setKeywords(List<String> list) {
            this.keywords = list;
            return this;
        }

        Builder setContentUrl(String str) {
            this.contentUrl = str;
            return this;
        }

        Builder setNonPersonalizedAds(Boolean bool) {
            this.nonPersonalizedAds = bool;
            return this;
        }

        Builder setNeighboringContentUrls(List<String> list) {
            this.neighboringContentUrls = list;
            return this;
        }

        Builder setHttpTimeoutMillis(Integer num) {
            this.httpTimeoutMillis = num;
            return this;
        }

        Builder setMediationNetworkExtrasIdentifier(String str) {
            this.mediationExtrasIdentifier = str;
            return this;
        }

        Builder setMediationNetworkExtrasProvider(MediationNetworkExtrasProvider mediationNetworkExtrasProvider) {
            this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
            return this;
        }

        Builder setAdMobExtras(Map<String, String> map) {
            this.adMobExtras = map;
            return this;
        }

        Builder setMediationExtras(List<FlutterMediationExtras> list) {
            this.mediationExtras = list;
            return this;
        }

        protected List<String> getKeywords() {
            return this.keywords;
        }

        protected String getContentUrl() {
            return this.contentUrl;
        }

        protected Boolean getNonPersonalizedAds() {
            return this.nonPersonalizedAds;
        }

        protected List<String> getNeighboringContentUrls() {
            return this.neighboringContentUrls;
        }

        protected Integer getHttpTimeoutMillis() {
            return this.httpTimeoutMillis;
        }

        protected String getMediationExtrasIdentifier() {
            return this.mediationExtrasIdentifier;
        }

        protected MediationNetworkExtrasProvider getMediationNetworkExtrasProvider() {
            return this.mediationNetworkExtrasProvider;
        }

        protected Map<String, String> getAdMobExtras() {
            return this.adMobExtras;
        }

        protected String getRequestAgent() {
            return this.requestAgent;
        }

        protected List<FlutterMediationExtras> getMediationExtras() {
            return this.mediationExtras;
        }

        FlutterAdRequest build() {
            return new FlutterAdRequest(this.keywords, this.contentUrl, this.nonPersonalizedAds, this.neighboringContentUrls, this.httpTimeoutMillis, this.mediationExtrasIdentifier, this.mediationNetworkExtrasProvider, this.adMobExtras, this.requestAgent, this.mediationExtras);
        }
    }

    protected FlutterAdRequest(List<String> list, String str, Boolean bool, List<String> list2, Integer num, String str2, MediationNetworkExtrasProvider mediationNetworkExtrasProvider, Map<String, String> map, String str3, List<FlutterMediationExtras> list3) {
        this.keywords = list;
        this.contentUrl = str;
        this.nonPersonalizedAds = bool;
        this.neighboringContentUrls = list2;
        this.httpTimeoutMillis = num;
        this.mediationExtrasIdentifier = str2;
        this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
        this.adMobExtras = map;
        this.requestAgent = str3;
        this.mediationExtras = list3;
    }

    private <T extends AbstractAdRequestBuilder<T>> void addNetworkExtras(AbstractAdRequestBuilder<T> abstractAdRequestBuilder, String str) {
        HashMap map = new HashMap();
        List<FlutterMediationExtras> list = this.mediationExtras;
        if (list != null) {
            Iterator<FlutterMediationExtras> it = list.iterator();
            while (it.hasNext()) {
                Pair<Class<? extends MediationExtrasReceiver>, Bundle> mediationExtras = it.next().getMediationExtras();
                map.put((Class) mediationExtras.first, (Bundle) mediationExtras.second);
            }
        } else {
            MediationNetworkExtrasProvider mediationNetworkExtrasProvider = this.mediationNetworkExtrasProvider;
            if (mediationNetworkExtrasProvider != null) {
                map.putAll(mediationNetworkExtrasProvider.getMediationExtras(str, this.mediationExtrasIdentifier));
            }
        }
        Map<String, String> map2 = this.adMobExtras;
        if (map2 != null && !map2.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.adMobExtras.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            map.put(AdMobAdapter.class, bundle);
        }
        Boolean bool = this.nonPersonalizedAds;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) map.get(AdMobAdapter.class);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", "1");
            map.put(AdMobAdapter.class, bundle2);
        }
        for (Map.Entry entry2 : map.entrySet()) {
            abstractAdRequestBuilder.addNetworkExtrasBundle((Class) entry2.getKey(), (Bundle) entry2.getValue());
        }
    }

    protected <T extends AbstractAdRequestBuilder<T>> AbstractAdRequestBuilder<T> updateAdRequestBuilder(AbstractAdRequestBuilder<T> abstractAdRequestBuilder, String str) {
        List<String> list = this.keywords;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                abstractAdRequestBuilder.addKeyword(it.next());
            }
        }
        String str2 = this.contentUrl;
        if (str2 != null) {
            abstractAdRequestBuilder.setContentUrl(str2);
        }
        addNetworkExtras(abstractAdRequestBuilder, str);
        List<String> list2 = this.neighboringContentUrls;
        if (list2 != null) {
            abstractAdRequestBuilder.setNeighboringContentUrls(list2);
        }
        Integer num = this.httpTimeoutMillis;
        if (num != null) {
            abstractAdRequestBuilder.setHttpTimeoutMillis(num.intValue());
        }
        abstractAdRequestBuilder.setRequestAgent(this.requestAgent);
        return abstractAdRequestBuilder;
    }

    AdRequest asAdRequest(String str) {
        return ((AdRequest.Builder) updateAdRequestBuilder(new AdRequest.Builder(), str)).build();
    }

    protected List<String> getKeywords() {
        return this.keywords;
    }

    protected String getContentUrl() {
        return this.contentUrl;
    }

    protected Boolean getNonPersonalizedAds() {
        return this.nonPersonalizedAds;
    }

    protected List<String> getNeighboringContentUrls() {
        return this.neighboringContentUrls;
    }

    protected Integer getHttpTimeoutMillis() {
        return this.httpTimeoutMillis;
    }

    protected String getMediationExtrasIdentifier() {
        return this.mediationExtrasIdentifier;
    }

    protected Map<String, String> getAdMobExtras() {
        return this.adMobExtras;
    }

    protected String getRequestAgent() {
        return this.requestAgent;
    }

    protected List<FlutterMediationExtras> getMediationExtras() {
        return this.mediationExtras;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdRequest)) {
            return false;
        }
        FlutterAdRequest flutterAdRequest = (FlutterAdRequest) obj;
        return Objects.equals(this.keywords, flutterAdRequest.keywords) && Objects.equals(this.contentUrl, flutterAdRequest.contentUrl) && Objects.equals(this.nonPersonalizedAds, flutterAdRequest.nonPersonalizedAds) && Objects.equals(this.neighboringContentUrls, flutterAdRequest.neighboringContentUrls) && Objects.equals(this.httpTimeoutMillis, flutterAdRequest.httpTimeoutMillis) && Objects.equals(this.mediationExtrasIdentifier, flutterAdRequest.mediationExtrasIdentifier) && Objects.equals(this.mediationNetworkExtrasProvider, flutterAdRequest.mediationNetworkExtrasProvider) && Objects.equals(this.adMobExtras, flutterAdRequest.adMobExtras) && Objects.equals(this.mediationExtras, flutterAdRequest.mediationExtras);
    }

    public int hashCode() {
        return Objects.hash(this.keywords, this.contentUrl, this.nonPersonalizedAds, this.neighboringContentUrls, this.httpTimeoutMillis, this.mediationExtrasIdentifier, this.mediationNetworkExtrasProvider, this.mediationExtras);
    }
}
