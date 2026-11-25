package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcjx implements zzhr {
    private final zzhr zza;
    private final long zzb;
    private final zzhr zzc;
    private long zzd;
    private Uri zze;

    zzcjx(zzhr zzhrVar, int i, zzhr zzhrVar2) {
        this.zza = zzhrVar;
        this.zzb = i;
        this.zzc = zzhrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int iZza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + ((long) iZza);
            this.zzd = j3;
            i3 = iZza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int iZza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + iZza2;
        this.zzd += (long) iZza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        Uri uri;
        zzhv zzhvVar2;
        Uri uri2 = zzhvVar.zza;
        this.zze = uri2;
        long j = zzhvVar.zze;
        long j2 = this.zzb;
        zzhv zzhvVar3 = null;
        if (j >= j2) {
            uri = uri2;
            zzhvVar2 = null;
        } else {
            long j3 = zzhvVar.zzf;
            long jMin = j2 - j;
            if (j3 != -1) {
                jMin = Math.min(j3, jMin);
            }
            uri = uri2;
            zzhvVar2 = new zzhv(uri, j, jMin, null);
        }
        long j4 = zzhvVar.zzf;
        if (j4 == -1 || j + j4 > j2) {
            zzhvVar3 = new zzhv(uri, Math.max(j2, j), j4 != -1 ? Math.min(j4, (j + j4) - j2) : -1L, null);
        }
        long jZzb = zzhvVar2 != null ? this.zza.zzb(zzhvVar2) : 0L;
        long jZzb2 = zzhvVar3 != null ? this.zzc.zzb(zzhvVar3) : 0L;
        this.zzd = j;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zze(zzip zzipVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzik
    public final Map zzj() {
        return zzgww.zza();
    }
}
