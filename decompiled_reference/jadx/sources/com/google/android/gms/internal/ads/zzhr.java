package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzhr extends zzj {
    long zzb(zzhv zzhvVar) throws IOException;

    Uri zzc();

    void zzd() throws IOException;

    void zze(zzip zzipVar);

    default Map zzj() {
        return Collections.emptyMap();
    }
}
