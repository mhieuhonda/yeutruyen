package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzasa {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, Ascii.DLE, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = new zzeu(8);
        int i = zzarz.zza(zzagbVar, zzeuVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        int iZzB = zzeuVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iZzB);
        zzeh.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzary zzb(zzagb zzagbVar) throws IOException {
        byte[] bArr;
        int i;
        byte[] bArr2;
        int i2;
        zzeu zzeuVar = new zzeu(16);
        long j = zzd(1718449184, zzagbVar, zzeuVar).zzb;
        zzgtr.zzi(j >= 16);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 16);
        zzeuVar.zzh(0);
        int iZzu = zzeuVar.zzu();
        int iZzu2 = zzeuVar.zzu();
        int iZzI = zzeuVar.zzI();
        int iZzI2 = zzeuVar.zzI();
        int iZzu3 = zzeuVar.zzu();
        int iZzu4 = zzeuVar.zzu();
        int i3 = ((int) j) - 16;
        if (i3 > 0) {
            bArr = new byte[i3];
            zzagbVar.zzi(bArr, 0, i3);
            if (iZzu == 65534) {
                if (i3 == 24) {
                    zzeu zzeuVar2 = new zzeu(bArr);
                    zzeuVar2.zzu();
                    int iZzu5 = zzeuVar2.zzu();
                    if (iZzu5 != 0 && iZzu5 != iZzu4) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzu5).length() + 33 + String.valueOf(iZzu4).length() + 19);
                        sb.append("validBits ( ");
                        sb.append(iZzu5);
                        sb.append(")  != bitsPerSample( ");
                        sb.append(iZzu4);
                        sb.append(") are not supported");
                        throw zzat.zzc(sb.toString());
                    }
                    int iZzI3 = zzeuVar2.zzI();
                    if (!zzft.zza(iZzI3, iZzu2)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzI3).length() + 57 + String.valueOf(iZzu2).length());
                        sb2.append("Channel mask ");
                        sb2.append(iZzI3);
                        sb2.append(" is invalid or does not match channel count ");
                        sb2.append(iZzu2);
                        throw zzat.zzc(sb2.toString());
                    }
                    int iZzu6 = zzeuVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzeuVar2.zzm(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                        throw zzat.zzc("invalid wav format extension guid");
                    }
                    i2 = iZzI3;
                    bArr2 = bArr;
                    i = iZzu6;
                } else {
                    bArr2 = bArr;
                    i = 65534;
                }
                zzagbVar.zzf((int) (zzagbVar.zzm() - zzagbVar.zzn()));
                return new zzary(i, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2, i2);
            }
            i2 = 0;
            zzagbVar.zzf((int) (zzagbVar.zzm() - zzagbVar.zzn()));
            return new zzary(i, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2, i2);
        }
        bArr = zzfm.zzb;
        i = iZzu;
        bArr2 = bArr;
        i2 = 0;
        zzagbVar.zzf((int) (zzagbVar.zzm() - zzagbVar.zzn()));
        return new zzary(i, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2, i2);
    }

    public static Pair zzc(zzagb zzagbVar) throws IOException {
        zzagbVar.zzl();
        zzarz zzarzVarZzd = zzd(1684108385, zzagbVar, new zzeu(8));
        zzagbVar.zzf(8);
        return Pair.create(Long.valueOf(zzagbVar.zzn()), Long.valueOf(zzarzVarZzd.zzb));
    }

    private static zzarz zzd(int i, zzagb zzagbVar, zzeu zzeuVar) throws IOException {
        zzarz zzarzVarZza = zzarz.zza(zzagbVar, zzeuVar);
        while (true) {
            int i2 = zzarzVarZza.zza;
            if (i2 == i) {
                return zzarzVarZza;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i2);
            zzeh.zzc("WavHeaderReader", sb.toString());
            long j = zzarzVarZza.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i2);
                throw zzat.zzc(sb2.toString());
            }
            zzagbVar.zzf((int) j2);
            zzarzVarZza = zzarz.zza(zzagbVar, zzeuVar);
        }
    }
}
