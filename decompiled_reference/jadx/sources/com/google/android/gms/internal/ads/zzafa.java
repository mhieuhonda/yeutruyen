package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import okio.Utf8;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzafa {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzv zza(zzeu zzeuVar, String str, String str2, zzq zzqVar) {
        zzet zzetVar = new zzet();
        zzetVar.zza(zzeuVar);
        int i = zzc[zzetVar.zzj(2)];
        zzetVar.zzh(8);
        int i2 = zze[zzetVar.zzj(3)];
        if (zzetVar.zzj(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzetVar.zzj(5)] * 1000;
        zzetVar.zzm();
        zzeuVar.zzh(zzetVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzo("audio/ac3");
        zztVar.zzG(i2);
        zztVar.zzI(i);
        zztVar.zzs(zzqVar);
        zztVar.zze(str2);
        zztVar.zzi(i3);
        zztVar.zzj(i3);
        return zztVar.zzP();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static zzv zzb(zzeu zzeuVar, String str, String str2, zzq zzqVar) {
        String str3;
        zzet zzetVar = new zzet();
        zzetVar.zza(zzeuVar);
        int iZzj = zzetVar.zzj(13) * 1000;
        zzetVar.zzh(3);
        int i = zzc[zzetVar.zzj(2)];
        zzetVar.zzh(10);
        int i2 = zze[zzetVar.zzj(3)];
        if (zzetVar.zzj(1) != 0) {
            i2++;
        }
        zzetVar.zzh(3);
        int iZzj2 = zzetVar.zzj(4);
        zzetVar.zzh(1);
        if (iZzj2 > 0) {
            zzetVar.zzh(6);
            if (zzetVar.zzj(1) != 0) {
                i2 += 2;
            }
            zzetVar.zzh(1);
        }
        if (zzetVar.zzc() > 7) {
            zzetVar.zzh(7);
            if (zzetVar.zzj(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        zzetVar.zzm();
        zzeuVar.zzh(zzetVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzo(str3);
        zztVar.zzG(i2);
        zztVar.zzI(i);
        zztVar.zzs(zzqVar);
        zztVar.zze(str2);
        zztVar.zzj(iZzj);
        return zztVar.zzP();
    }

    public static zzaez zzc(zzet zzetVar) {
        int iZzf;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iZzd = zzetVar.zzd();
        zzetVar.zzh(40);
        int iZzj = zzetVar.zzj(5);
        zzetVar.zzf(iZzd);
        int i9 = -1;
        if (iZzj > 10) {
            zzetVar.zzh(16);
            int iZzj2 = zzetVar.zzj(2);
            if (iZzj2 == 0) {
                i9 = 0;
            } else if (iZzj2 == 1) {
                i9 = 1;
            } else if (iZzj2 == 2) {
                i9 = 2;
            }
            zzetVar.zzh(3);
            int iZzj3 = zzetVar.zzj(11) + 1;
            int iZzj4 = zzetVar.zzj(2);
            if (iZzj4 == 3) {
                i = zzd[zzetVar.zzj(2)];
                i6 = 6;
                i5 = 3;
            } else {
                int iZzj5 = zzetVar.zzj(2);
                int i10 = zzb[iZzj5];
                i5 = iZzj5;
                i = zzc[iZzj4];
                i6 = i10;
            }
            iZzf = iZzj3 + iZzj3;
            int i11 = (iZzf * i) / (i6 * 32);
            int iZzj6 = zzetVar.zzj(3);
            boolean zZzi = zzetVar.zzi();
            i2 = zze[iZzj6] + (zZzi ? 1 : 0);
            zzetVar.zzh(10);
            if (zzetVar.zzi()) {
                zzetVar.zzh(8);
            }
            if (iZzj6 == 0) {
                zzetVar.zzh(5);
                if (zzetVar.zzi()) {
                    zzetVar.zzh(8);
                }
                i7 = 0;
                iZzj6 = 0;
            } else {
                i7 = iZzj6;
            }
            if (i9 == 1) {
                if (zzetVar.zzi()) {
                    zzetVar.zzh(16);
                }
                i8 = 1;
            } else {
                i8 = i9;
            }
            if (zzetVar.zzi()) {
                if (i7 > 2) {
                    zzetVar.zzh(2);
                }
                if ((i7 & 1) != 0 && i7 > 2) {
                    zzetVar.zzh(6);
                }
                if ((i7 & 4) != 0) {
                    zzetVar.zzh(6);
                }
                if (zZzi && zzetVar.zzi()) {
                    zzetVar.zzh(5);
                }
                if (i8 == 0) {
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(6);
                    }
                    if (i7 == 0 && zzetVar.zzi()) {
                        zzetVar.zzh(6);
                    }
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(6);
                    }
                    int iZzj7 = zzetVar.zzj(2);
                    if (iZzj7 == 1) {
                        zzetVar.zzh(5);
                    } else if (iZzj7 == 2) {
                        zzetVar.zzh(12);
                    } else if (iZzj7 == 3) {
                        int iZzj8 = zzetVar.zzj(5);
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(5);
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                if (zzetVar.zzi()) {
                                    zzetVar.zzh(4);
                                }
                                if (zzetVar.zzi()) {
                                    zzetVar.zzh(4);
                                }
                            }
                        }
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(5);
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(7);
                                if (zzetVar.zzi()) {
                                    zzetVar.zzh(8);
                                }
                            }
                        }
                        zzetVar.zzh((iZzj8 + 2) * 8);
                        zzetVar.zzm();
                    }
                    if (i7 < 2) {
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(14);
                        }
                        if (iZzj6 == 0 && zzetVar.zzi()) {
                            zzetVar.zzh(14);
                        }
                    }
                    if (!zzetVar.zzi()) {
                        i8 = 0;
                    } else if (i5 == 0) {
                        zzetVar.zzh(5);
                        i8 = 0;
                        i5 = 0;
                    } else {
                        for (int i12 = 0; i12 < i6; i12++) {
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(5);
                            }
                        }
                        i8 = 0;
                    }
                }
            }
            if (zzetVar.zzi()) {
                zzetVar.zzh(5);
                if (i7 == 2) {
                    zzetVar.zzh(4);
                    i7 = 2;
                }
                if (i7 >= 6) {
                    zzetVar.zzh(2);
                }
                if (zzetVar.zzi()) {
                    zzetVar.zzh(8);
                }
                if (i7 == 0 && zzetVar.zzi()) {
                    zzetVar.zzh(8);
                }
                if (iZzj4 < 3) {
                    zzetVar.zzg();
                }
            }
            if (i8 == 0 && i5 != 3) {
                zzetVar.zzg();
            }
            if (i8 == 2 && (i5 == 3 || zzetVar.zzi())) {
                zzetVar.zzh(6);
            }
            i3 = i6 * 256;
            str = (zzetVar.zzi() && zzetVar.zzj(6) == 1 && zzetVar.zzj(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i11;
        } else {
            zzetVar.zzh(32);
            int iZzj9 = zzetVar.zzj(2);
            String str2 = iZzj9 == 3 ? null : "audio/ac3";
            int iZzj10 = zzetVar.zzj(6);
            int i13 = zzf[iZzj10 / 2] * 1000;
            iZzf = zzf(iZzj9, iZzj10);
            zzetVar.zzh(8);
            int iZzj11 = zzetVar.zzj(3);
            if ((iZzj11 & 1) != 0 && iZzj11 != 1) {
                zzetVar.zzh(2);
            }
            if ((iZzj11 & 4) != 0) {
                zzetVar.zzh(2);
            }
            if (iZzj11 == 2) {
                zzetVar.zzh(2);
            }
            i = iZzj9 < 3 ? zzc[iZzj9] : -1;
            i2 = zze[iZzj11] + (zzetVar.zzi() ? 1 : 0);
            i3 = 1536;
            str = str2;
            i4 = i13;
        }
        return new zzaez(str, i9, i2, i, iZzf, i3, i4, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & Utf8.REPLACEMENT_BYTE);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    public static int zze(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
