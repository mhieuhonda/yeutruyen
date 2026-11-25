package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhdu {
    private final OutputStream zza;

    private zzhdu(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzhdu zzb(OutputStream outputStream) {
        return new zzhdu(outputStream);
    }

    public final void zza(zzhtk zzhtkVar) throws IOException {
        try {
            zzhtkVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
