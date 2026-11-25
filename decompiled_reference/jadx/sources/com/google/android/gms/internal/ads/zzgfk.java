package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgfk implements zzgfl {
    private final zzifz zza;

    public zzgfk(zzifz zzifzVar) {
        this.zza = zzifzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        ((zzifz) obj).zzaO(outputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return (zzifz) this.zza.zzbd().zza(inputStream, zzidz.zzb());
        } catch (zzifh e) {
            throw new zzgfh("Cannot read proto.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
