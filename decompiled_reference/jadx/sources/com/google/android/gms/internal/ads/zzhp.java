package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.tekartik.sqflite.Constant;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhp extends zzhj {
    private zzhv zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzhp() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.zzb;
        String str = zzfm.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        zzf(zzhvVar);
        this.zza = zzhvVar;
        Uri uriNormalizeScheme = zzhvVar.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzgtr.zzf(Constant.PARAM_ERROR_DATA.equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zzfm.zza;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            String strValueOf = String.valueOf(uriNormalizeScheme);
            String.valueOf(strValueOf);
            throw zzat.zza("Unexpected URI format: ".concat(String.valueOf(strValueOf)), null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                String.valueOf(str2);
                throw zzat.zza("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e);
            }
        } else {
            this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j = zzhvVar.zze;
        int length = this.zzb.length;
        if (j > length) {
            this.zzb = null;
            throw new zzhs(2008);
        }
        int i = (int) j;
        this.zzc = i;
        int i2 = length - i;
        this.zzd = i2;
        long j2 = zzhvVar.zzf;
        if (j2 != -1) {
            this.zzd = (int) Math.min(i2, j2);
        }
        zzg(zzhvVar);
        return j2 != -1 ? j2 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        zzhv zzhvVar = this.zza;
        if (zzhvVar != null) {
            return zzhvVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzi();
        }
        this.zza = null;
    }
}
