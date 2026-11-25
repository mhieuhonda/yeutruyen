package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgzy {
    public static final FileOutputStream zza(File file, zzgxd zzgxdVar, zzgzp zzgzpVar) throws IOException {
        return new FileOutputStream(file, zzgxdVar.contains(zzgzx.APPEND));
    }
}
