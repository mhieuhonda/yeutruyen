package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhm extends zzhj {
    private final zzhl zza;
    private Uri zzb;
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzhm(final byte[] bArr) {
        zzhl zzhlVar = new zzhl() { // from class: com.google.android.gms.internal.ads.zzhk
            @Override // com.google.android.gms.internal.ads.zzhl
            public final /* synthetic */ byte[] zza(Uri uri) {
                return bArr;
            }
        };
        super(false);
        this.zza = zzhlVar;
        zzgtr.zza(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zze;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        System.arraycopy(bArr2, this.zzd, bArr, i, iMin);
        this.zzd += iMin;
        this.zze -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        zzf(zzhvVar);
        Uri uri = zzhvVar.zza;
        this.zzb = uri;
        this.zzc = this.zza.zza(uri);
        long j = zzhvVar.zze;
        int length = this.zzc.length;
        if (j > length) {
            throw new zzhs(2008);
        }
        int i = (int) j;
        this.zzd = i;
        int i2 = length - i;
        this.zze = i2;
        long j2 = zzhvVar.zzf;
        if (j2 != -1) {
            this.zze = (int) Math.min(i2, j2);
        }
        this.zzf = true;
        zzg(zzhvVar);
        return j2 != -1 ? j2 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }
}
