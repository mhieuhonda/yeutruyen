package androidx.webkit;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface WebViewStartUpResult {
    Long getMaxTimePerTaskInUiThreadMillis();

    List<StartUpLocation> getNonUiThreadBlockingStartUpLocations();

    Long getTotalTimeInUiThreadMillis();

    List<StartUpLocation> getUiThreadBlockingStartUpLocations();
}
