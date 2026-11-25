package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfx implements zzao {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[PHI: r8
      0x003c: PHI (r8v13 int) = (r8v0 int), (r8v16 int) binds: [B:17:0x0032, B:21:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzfx(String str, byte[] bArr, int i, int i2) {
        byte b;
        boolean z = true;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    if (i2 != 23) {
                        z = false;
                    } else if (bArr.length == 4) {
                        i2 = 23;
                    } else {
                        i2 = 23;
                        z = false;
                    }
                    zzgtr.zza(z);
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    if (i2 != 75) {
                        z = false;
                    } else if (bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                        i2 = 75;
                    } else {
                        i2 = 75;
                        z = false;
                    }
                    zzgtr.zza(z);
                }
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    if (i2 != 78) {
                        z = false;
                    } else if (bArr.length == 8) {
                        i2 = 78;
                    } else {
                        i2 = 78;
                        z = false;
                    }
                    zzgtr.zza(z);
                }
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    if (i2 != 78) {
                        z = false;
                    } else if (bArr.length == 8) {
                        i2 = 78;
                    } else {
                        i2 = 78;
                        z = false;
                    }
                    zzgtr.zza(z);
                }
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    zzgtr.zza(i2 == 0);
                }
                break;
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzfx zzfxVar = (zzfx) obj;
            if (this.zza.equals(zzfxVar.zza) && Arrays.equals(this.zzb, zzfxVar.zzb) && this.zzc == zzfxVar.zzc && this.zzd == zzfxVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final List zzb() {
        zzgtr.zzj(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2] & 255));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    public final String toString() {
        String string;
        int i = this.zzd;
        if (i != 0) {
            if (i == 1) {
                string = zzfm.zzj(this.zzb);
            } else if (i == 23) {
                string = String.valueOf(Float.intBitsToFloat(zzhaq.zzd(this.zzb)));
            } else if (i == 67) {
                string = String.valueOf(zzhaq.zzd(this.zzb));
            } else if (i == 75) {
                string = String.valueOf(zzdr$$ExternalSyntheticBackport0.m(this.zzb[0]));
            } else if (i != 78) {
                byte[] bArr = this.zzb;
                String str = zzfm.zza;
                string = zzgzo.zzn().zzi().zzj(bArr, 0, bArr.length);
            } else {
                string = String.valueOf(new zzeu(this.zzb).zzJ());
            }
        } else if (this.zza.equals("auxiliary.tracks.map")) {
            List listZzb = zzb();
            StringBuilder sb = new StringBuilder();
            sb.append("track types = ");
            zzgtl.zzb(sb, listZzb, ",");
            string = sb.toString();
        } else {
            byte[] bArr2 = this.zzb;
            String str2 = zzfm.zza;
            string = zzgzo.zzn().zzi().zzj(bArr2, 0, bArr2.length);
        }
        String str3 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 18 + String.valueOf(string).length());
        sb2.append("mdta: key=");
        sb2.append(str3);
        sb2.append(", value=");
        sb2.append(string);
        return sb2.toString();
    }
}
