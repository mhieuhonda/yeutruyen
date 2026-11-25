package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzio implements zzhr {
    private final zzhr zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.emptyMap();

    public zzio(zzhr zzhrVar) {
        this.zza = zzhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int iZza = this.zza.zza(bArr, i, i2);
        if (iZza != -1) {
            this.zzb += (long) iZza;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        this.zzc = zzhvVar.zza;
        this.zzd = Collections.emptyMap();
        try {
            long jZzb = this.zza.zzb(zzhvVar);
            if (zzc() != null) {
            }
            return jZzb;
        } finally {
            Uri uriZzc = zzc();
            if (uriZzc != null) {
                this.zzc = uriZzc;
            }
            this.zzd = zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final long zzf() {
        return this.zzb;
    }

    public final Uri zzg() {
        return this.zzc;
    }

    public final Map zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzik
    public final Map zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zze(zzip zzipVar) {
        zzipVar.getClass();
        this.zza.zze(zzipVar);
    }
}
