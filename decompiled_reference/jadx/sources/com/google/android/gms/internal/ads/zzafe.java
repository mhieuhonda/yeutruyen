package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzafe {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;

    private zzafe(int i, String str, int i2, int i3, int i4) {
        this.zza = i;
        this.zze = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0216 A[Catch: RuntimeException -> 0x025f, TryCatch #0 {RuntimeException -> 0x025f, blocks: (B:3:0x0008, B:6:0x001b, B:8:0x0039, B:14:0x005f, B:17:0x0080, B:19:0x00d0, B:21:0x00de, B:23:0x00eb, B:25:0x0113, B:27:0x0119, B:29:0x012a, B:31:0x0133, B:33:0x013b, B:35:0x014c, B:37:0x0159, B:39:0x016a, B:41:0x0170, B:43:0x0181, B:45:0x0187, B:47:0x0198, B:49:0x01a2, B:51:0x01ad, B:52:0x01b0, B:53:0x01b4, B:55:0x01ca, B:57:0x01d0, B:59:0x01d9, B:60:0x01dc, B:65:0x01e9, B:67:0x01ef, B:69:0x01f4, B:70:0x01f7, B:73:0x0202, B:76:0x0209, B:79:0x0210, B:81:0x0216, B:83:0x0224, B:95:0x024a, B:99:0x0255, B:94:0x0246, B:63:0x01e3), top: B:104:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0224 A[Catch: RuntimeException -> 0x025f, TryCatch #0 {RuntimeException -> 0x025f, blocks: (B:3:0x0008, B:6:0x001b, B:8:0x0039, B:14:0x005f, B:17:0x0080, B:19:0x00d0, B:21:0x00de, B:23:0x00eb, B:25:0x0113, B:27:0x0119, B:29:0x012a, B:31:0x0133, B:33:0x013b, B:35:0x014c, B:37:0x0159, B:39:0x016a, B:41:0x0170, B:43:0x0181, B:45:0x0187, B:47:0x0198, B:49:0x01a2, B:51:0x01ad, B:52:0x01b0, B:53:0x01b4, B:55:0x01ca, B:57:0x01d0, B:59:0x01d9, B:60:0x01dc, B:65:0x01e9, B:67:0x01ef, B:69:0x01f4, B:70:0x01f7, B:73:0x0202, B:76:0x0209, B:79:0x0210, B:81:0x0216, B:83:0x0224, B:95:0x024a, B:99:0x0255, B:94:0x0246, B:63:0x01e3), top: B:104:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0245  */
    /* JADX WARN: Code duplicated, block: B:97:0x0250  */
    /* JADX WARN: Code duplicated, block: B:98:0x0253  */
    public static zzafe zza(byte[] bArr) throws zzat {
        int i;
        int i2;
        int iZzj;
        int i3;
        int iZzj2;
        int i4;
        try {
            zzet zzetVar = new zzet(bArr, bArr.length);
            zzetVar.zzg();
            int iZzj3 = zzetVar.zzj(7);
            if (iZzj3 != 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(iZzj3).length() + 26);
                sb.append("Unsupported av1C version: ");
                sb.append(iZzj3);
                zzeh.zzc("Av1Config", sb.toString());
                return null;
            }
            int iZzj4 = zzetVar.zzj(3);
            int iZzj5 = zzetVar.zzj(5);
            boolean zZzi = zzetVar.zzi();
            boolean zZzi2 = zzetVar.zzi();
            boolean zZzi3 = zzetVar.zzi();
            if (zZzi2) {
                i = true != zZzi3 ? 10 : 12;
            } else {
                i = 8;
            }
            zzetVar.zzh(13);
            Object[] objArr = {Integer.valueOf(iZzj5)};
            String str = zzfm.zza;
            String str2 = String.format(Locale.US, "%02d", objArr);
            String str3 = true != zZzi ? "M" : "H";
            String str4 = String.format(Locale.US, "%02d", Integer.valueOf(i));
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj4).length() + 6 + String.valueOf(str2).length() + 2 + String.valueOf(str4).length());
            sb2.append("av01.");
            sb2.append(iZzj4);
            sb2.append(".");
            sb2.append(str2);
            sb2.append(str3);
            sb2.append(".");
            sb2.append(str4);
            String string = sb2.toString();
            if (zzetVar.zzc() <= 0) {
                return new zzafe(i, string, -1, -1, -1);
            }
            int i5 = 7;
            zzetVar.zzg();
            int iZzj6 = zzetVar.zzj(4);
            if (iZzj6 != 1) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj6).length() + 22);
                sb3.append("Unsupported obu_type: ");
                sb3.append(iZzj6);
                zzeh.zzb("Av1Config", sb3.toString());
                return new zzafe(i, string, -1, -1, -1);
            }
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported obu_extension_flag");
                return new zzafe(i, string, -1, -1, -1);
            }
            boolean zZzi4 = zzetVar.zzi();
            zzetVar.zzg();
            if (zZzi4 && zzetVar.zzj(8) > 127) {
                zzeh.zzb("Av1Config", "Excessive obu_size");
                return new zzafe(i, string, -1, -1, -1);
            }
            int iZzj7 = zzetVar.zzj(3);
            zzetVar.zzg();
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported reduced_still_picture_header");
                return new zzafe(i, string, -1, -1, -1);
            }
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported timing_info_present_flag");
                return new zzafe(i, string, -1, -1, -1);
            }
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new zzafe(i, string, -1, -1, -1);
            }
            int iZzj8 = zzetVar.zzj(5);
            boolean z = false;
            int i6 = 0;
            while (i6 <= iZzj8) {
                zzetVar.zzh(12);
                if (zzetVar.zzj(5) > i5) {
                    zzetVar.zzg();
                }
                i6++;
                i5 = 7;
            }
            int iZzj9 = zzetVar.zzj(4);
            int iZzj10 = zzetVar.zzj(4);
            zzetVar.zzh(iZzj9 + 1);
            zzetVar.zzh(iZzj10 + 1);
            if (zzetVar.zzi()) {
                i2 = 7;
                zzetVar.zzh(7);
            } else {
                i2 = 7;
            }
            zzetVar.zzh(i2);
            boolean zZzi5 = zzetVar.zzi();
            if (zZzi5) {
                zzetVar.zzh(2);
            }
            if (zzetVar.zzi() || zzetVar.zzj(1) > 0) {
                if (!zzetVar.zzi()) {
                    zzetVar.zzh(1);
                }
            }
            if (zZzi5) {
                zzetVar.zzh(3);
            }
            zzetVar.zzh(3);
            boolean zZzi6 = zzetVar.zzi();
            if (iZzj7 != 2) {
                if (iZzj7 == 1) {
                }
                if (!zzetVar.zzi()) {
                    return new zzafe(i, string, -1, -1, -1);
                }
                int iZzj11 = zzetVar.zzj(8);
                iZzj = zzetVar.zzj(8);
                int iZzj12 = zzetVar.zzj(8);
                if (z && iZzj11 == 1) {
                    if (iZzj == 13) {
                        if (iZzj12 == 0) {
                            i3 = 13;
                            iZzj11 = 1;
                            iZzj2 = 1;
                        } else {
                            i3 = 13;
                        }
                        int iZzb = zzi.zzb(iZzj11);
                        if (iZzj2 == 1) {
                            i4 = 1;
                        } else {
                            i4 = 2;
                        }
                        return new zzafe(i, string, iZzb, i4, zzi.zzc(i3));
                    }
                    i3 = iZzj;
                    iZzj11 = 1;
                } else {
                    i3 = iZzj;
                }
                iZzj2 = zzetVar.zzj(1);
                int iZzb2 = zzi.zzb(iZzj11);
                if (iZzj2 == 1) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                return new zzafe(i, string, iZzb2, i4, zzi.zzc(i3));
            }
            if (zZzi6) {
                zzetVar.zzg();
            }
            if (zzetVar.zzi()) {
                z = true;
            }
            if (!zzetVar.zzi()) {
                return new zzafe(i, string, -1, -1, -1);
            }
            int iZzj13 = zzetVar.zzj(8);
            iZzj = zzetVar.zzj(8);
            int iZzj14 = zzetVar.zzj(8);
            if (z) {
                i3 = iZzj;
                iZzj2 = zzetVar.zzj(1);
            } else {
                i3 = iZzj;
                iZzj2 = zzetVar.zzj(1);
            }
            int iZzb3 = zzi.zzb(iZzj13);
            if (iZzj2 == 1) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            return new zzafe(i, string, iZzb3, i4, zzi.zzc(i3));
        } catch (RuntimeException e) {
            throw zzat.zzb("Error parsing AV1 config", e);
        }
    }
}
