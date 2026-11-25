package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class FlutterInitializationStatus {
    final Map<String, FlutterAdapterStatus> adapterStatuses;

    FlutterInitializationStatus(Map<String, FlutterAdapterStatus> map) {
        this.adapterStatuses = map;
    }

    FlutterInitializationStatus(InitializationStatus initializationStatus) {
        HashMap map = new HashMap();
        for (Map.Entry<String, AdapterStatus> entry : initializationStatus.getAdapterStatusMap().entrySet()) {
            map.put(entry.getKey(), new FlutterAdapterStatus(entry.getValue()));
        }
        this.adapterStatuses = map;
    }
}
