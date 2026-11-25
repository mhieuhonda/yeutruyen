package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgfg implements zzgfl {
    private final byte[] zza;

    public zzgfg(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return zzgzt.zza(inputStream);
        } catch (IOException e) {
            throw new zzgfh("Cannot read bytes.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
