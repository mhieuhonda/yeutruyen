package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class FlutterEngineCache {
    private static FlutterEngineCache instance;
    private final Map<String, FlutterEngine> cachedEngines = new HashMap();

    public static FlutterEngineCache getInstance() {
        if (instance == null) {
            instance = new FlutterEngineCache();
        }
        return instance;
    }

    FlutterEngineCache() {
    }

    public boolean contains(String str) {
        return this.cachedEngines.containsKey(str);
    }

    public FlutterEngine get(String str) {
        return this.cachedEngines.get(str);
    }

    public void put(String str, FlutterEngine flutterEngine) {
        Map<String, FlutterEngine> map = this.cachedEngines;
        if (flutterEngine != null) {
            map.put(str, flutterEngine);
        } else {
            map.remove(str);
        }
    }

    public void remove(String str) {
        put(str, null);
    }

    public void clear() {
        this.cachedEngines.clear();
    }
}
