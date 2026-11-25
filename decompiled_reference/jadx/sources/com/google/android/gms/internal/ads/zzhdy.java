package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.embedding.android.KeyboardMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhdy implements zzhem {
    private static final Charset zza = Charset.forName("UTF-8");
    private final InputStream zzb;

    private zzhdy(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzhdy zza(String str) {
        return new zzhdy(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzibr zzibrVar) throws IOException {
        if (!(zzibrVar instanceof zzibv)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzibrVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jZzc = zzhlz.zzc(zzibrVar.zzg().zzh());
            if (jZzc > KeyboardMap.kValueMask || jZzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jZzc;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x01e2 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01da A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b A[Catch: all -> 0x0238, IllegalStateException -> 0x023a, zzibu | IllegalStateException -> 0x023c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0238, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:7:0x0033, B:9:0x004a, B:11:0x0052, B:13:0x005c, B:15:0x0066, B:17:0x0072, B:19:0x0078, B:21:0x0086, B:23:0x008c, B:25:0x0092, B:27:0x0098, B:29:0x00a0, B:45:0x00e2, B:50:0x010b, B:63:0x012e, B:65:0x013b, B:67:0x0141, B:69:0x0147, B:74:0x0188, B:87:0x01ab, B:78:0x0193, B:82:0x019e, B:86:0x01a9, B:88:0x01c9, B:89:0x01d9, B:90:0x01da, B:91:0x01e1, B:54:0x0116, B:58:0x0121, B:62:0x012c, B:92:0x01e2, B:93:0x01f2, B:94:0x01f3, B:95:0x0203, B:96:0x0204, B:97:0x020b, B:98:0x020c, B:99:0x0213, B:100:0x0214, B:103:0x0220, B:104:0x0227, B:105:0x0228, B:106:0x022f, B:107:0x0230, B:108:0x0237, B:114:0x023d, B:115:0x0242), top: B:118:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116 A[Catch: all -> 0x0238, IllegalStateException -> 0x023a, zzibu | IllegalStateException -> 0x023c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0238, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:7:0x0033, B:9:0x004a, B:11:0x0052, B:13:0x005c, B:15:0x0066, B:17:0x0072, B:19:0x0078, B:21:0x0086, B:23:0x008c, B:25:0x0092, B:27:0x0098, B:29:0x00a0, B:45:0x00e2, B:50:0x010b, B:63:0x012e, B:65:0x013b, B:67:0x0141, B:69:0x0147, B:74:0x0188, B:87:0x01ab, B:78:0x0193, B:82:0x019e, B:86:0x01a9, B:88:0x01c9, B:89:0x01d9, B:90:0x01da, B:91:0x01e1, B:54:0x0116, B:58:0x0121, B:62:0x012c, B:92:0x01e2, B:93:0x01f2, B:94:0x01f3, B:95:0x0203, B:96:0x0204, B:97:0x020b, B:98:0x020c, B:99:0x0213, B:100:0x0214, B:103:0x0220, B:104:0x0227, B:105:0x0228, B:106:0x022f, B:107:0x0230, B:108:0x0237, B:114:0x023d, B:115:0x0242), top: B:118:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121 A[Catch: all -> 0x0238, IllegalStateException -> 0x023a, zzibu | IllegalStateException -> 0x023c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0238, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:7:0x0033, B:9:0x004a, B:11:0x0052, B:13:0x005c, B:15:0x0066, B:17:0x0072, B:19:0x0078, B:21:0x0086, B:23:0x008c, B:25:0x0092, B:27:0x0098, B:29:0x00a0, B:45:0x00e2, B:50:0x010b, B:63:0x012e, B:65:0x013b, B:67:0x0141, B:69:0x0147, B:74:0x0188, B:87:0x01ab, B:78:0x0193, B:82:0x019e, B:86:0x01a9, B:88:0x01c9, B:89:0x01d9, B:90:0x01da, B:91:0x01e1, B:54:0x0116, B:58:0x0121, B:62:0x012c, B:92:0x01e2, B:93:0x01f2, B:94:0x01f3, B:95:0x0203, B:96:0x0204, B:97:0x020b, B:98:0x020c, B:99:0x0213, B:100:0x0214, B:103:0x0220, B:104:0x0227, B:105:0x0228, B:106:0x022f, B:107:0x0230, B:108:0x0237, B:114:0x023d, B:115:0x0242), top: B:118:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c A[Catch: all -> 0x0238, IllegalStateException -> 0x023a, zzibu | IllegalStateException -> 0x023c, TRY_ENTER, TryCatch #0 {all -> 0x0238, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:7:0x0033, B:9:0x004a, B:11:0x0052, B:13:0x005c, B:15:0x0066, B:17:0x0072, B:19:0x0078, B:21:0x0086, B:23:0x008c, B:25:0x0092, B:27:0x0098, B:29:0x00a0, B:45:0x00e2, B:50:0x010b, B:63:0x012e, B:65:0x013b, B:67:0x0141, B:69:0x0147, B:74:0x0188, B:87:0x01ab, B:78:0x0193, B:82:0x019e, B:86:0x01a9, B:88:0x01c9, B:89:0x01d9, B:90:0x01da, B:91:0x01e1, B:54:0x0116, B:58:0x0121, B:62:0x012c, B:92:0x01e2, B:93:0x01f2, B:94:0x01f3, B:95:0x0203, B:96:0x0204, B:97:0x020b, B:98:0x020c, B:99:0x0213, B:100:0x0214, B:103:0x0220, B:104:0x0227, B:105:0x0228, B:106:0x022f, B:107:0x0230, B:108:0x0237, B:114:0x023d, B:115:0x0242), top: B:118:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013b A[Catch: all -> 0x0238, IllegalStateException -> 0x023a, zzibu | IllegalStateException -> 0x023c, TryCatch #0 {all -> 0x0238, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:7:0x0033, B:9:0x004a, B:11:0x0052, B:13:0x005c, B:15:0x0066, B:17:0x0072, B:19:0x0078, B:21:0x0086, B:23:0x008c, B:25:0x0092, B:27:0x0098, B:29:0x00a0, B:45:0x00e2, B:50:0x010b, B:63:0x012e, B:65:0x013b, B:67:0x0141, B:69:0x0147, B:74:0x0188, B:87:0x01ab, B:78:0x0193, B:82:0x019e, B:86:0x01a9, B:88:0x01c9, B:89:0x01d9, B:90:0x01da, B:91:0x01e1, B:54:0x0116, B:58:0x0121, B:62:0x012c, B:92:0x01e2, B:93:0x01f2, B:94:0x01f3, B:95:0x0203, B:96:0x0204, B:97:0x020b, B:98:0x020c, B:99:0x0213, B:100:0x0214, B:103:0x0220, B:104:0x0227, B:105:0x0228, B:106:0x022f, B:107:0x0230, B:108:0x0237, B:114:0x023d, B:115:0x0242), top: B:118:0x0014 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzhem
    public final zzhtk zzb() throws IOException {
        int i;
        String strZzd;
        zzhtx zzhtxVar;
        zzibt zzibtVarZze;
        zzhta zzhtaVar;
        String str = NotificationCompat.CATEGORY_STATUS;
        String str2 = "keyData";
        try {
            try {
                InputStream inputStream = this.zzb;
                int i2 = zzhfb.zza;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i3 = inputStream.read(bArr);
                    InputStream inputStream2 = inputStream;
                    if (i3 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                    inputStream = inputStream2;
                }
                zzibt zzibtVarZze2 = zzhlz.zzb(new String(byteArrayOutputStream.toByteArray(), zza)).zze();
                if (!zzibtVarZze2.zzc("key")) {
                    throw new zzibu("invalid keyset: no key");
                }
                zzibr zzibrVarZzh = zzibtVarZze2.zzh("key");
                if (!(zzibrVarZzh instanceof zzibq)) {
                    throw new zzibu("invalid keyset: key must be an array");
                }
                zzibq zzibqVarZzf = zzibrVarZzh.zzf();
                if (zzibqVarZzf.zzb() == 0) {
                    throw new zzibu("invalid keyset: key is empty");
                }
                zzhth zzhthVarZzh = zzhtk.zzh();
                if (zzibtVarZze2.zzc("primaryKeyId")) {
                    zzhthVarZzh.zza(zzc(zzibtVarZze2.zzh("primaryKeyId")));
                }
                int i4 = 0;
                while (i4 < zzibqVarZzf.zzb()) {
                    zzibt zzibtVarZze3 = zzibqVarZzf.zzc(i4).zze();
                    if (!zzibtVarZze3.zzc(str2) || !zzibtVarZze3.zzc(str) || !zzibtVarZze3.zzc("keyId") || !zzibtVarZze3.zzc("outputPrefixType")) {
                        throw new zzibu("invalid key");
                    }
                    zzibr zzibrVarZzh2 = zzibtVarZze3.zzh(str2);
                    if (!(zzibrVarZzh2 instanceof zzibt)) {
                        throw new zzibu("invalid key: keyData must be an object");
                    }
                    zzhti zzhtiVarZze = zzhtj.zze();
                    String strZzd2 = zzibtVarZze3.zzh(str).zzd();
                    String str3 = str;
                    int iHashCode = strZzd2.hashCode();
                    String str4 = str2;
                    if (iHashCode == -891611359) {
                        if (!strZzd2.equals("ENABLED")) {
                            String.valueOf(strZzd2);
                            throw new zzibu("unknown status: ".concat(String.valueOf(strZzd2)));
                        }
                        i = 3;
                        zzhtiVarZze.zze(i);
                        zzhtiVarZze.zzc(zzc(zzibtVarZze3.zzh("keyId")));
                        strZzd = zzibtVarZze3.zzh("outputPrefixType").zzd();
                        switch (strZzd.hashCode()) {
                            case -2053249079:
                                if (strZzd.equals("LEGACY")) {
                                    zzhtxVar = zzhtx.LEGACY;
                                    zzhtiVarZze.zzd(zzhtxVar);
                                    zzibtVarZze = zzibrVarZzh2.zze();
                                    if (zzibtVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibu("invalid keyData");
                                }
                                break;
                            case 80904:
                                if (strZzd.equals("RAW")) {
                                    zzhtxVar = zzhtx.RAW;
                                    zzhtiVarZze.zzd(zzhtxVar);
                                    zzibtVarZze = zzibrVarZzh2.zze();
                                    if (zzibtVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibu("invalid keyData");
                                }
                                break;
                            case 2575090:
                                if (strZzd.equals("TINK")) {
                                    zzhtxVar = zzhtx.TINK;
                                    zzhtiVarZze.zzd(zzhtxVar);
                                    zzibtVarZze = zzibrVarZzh2.zze();
                                    if (zzibtVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibu("invalid keyData");
                                }
                                break;
                            case 1761684556:
                                if (strZzd.equals("CRUNCHY")) {
                                    zzhtxVar = zzhtx.CRUNCHY;
                                    zzhtiVarZze.zzd(zzhtxVar);
                                    zzibtVarZze = zzibrVarZzh2.zze();
                                    if (zzibtVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibu("invalid keyData");
                                }
                                break;
                        }
                        String.valueOf(strZzd);
                        throw new zzibu("unknown output prefix type: ".concat(String.valueOf(strZzd)));
                    }
                    if (iHashCode == 478389753) {
                        if (!strZzd2.equals("DESTROYED")) {
                            String.valueOf(strZzd2);
                            throw new zzibu("unknown status: ".concat(String.valueOf(strZzd2)));
                        }
                        i = 5;
                        zzhtiVarZze.zze(i);
                        zzhtiVarZze.zzc(zzc(zzibtVarZze3.zzh("keyId")));
                        strZzd = zzibtVarZze3.zzh("outputPrefixType").zzd();
                        switch (strZzd.hashCode()) {
                            case -2053249079:
                                if (strZzd.equals("LEGACY")) {
                                    zzhtxVar = zzhtx.LEGACY;
                                    zzhtiVarZze.zzd(zzhtxVar);
                                    zzibtVarZze = zzibrVarZzh2.zze();
                                    if (zzibtVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibu("invalid keyData");
                                }
                                break;
                            case 80904:
                                if (strZzd.equals("RAW")) {
                                    zzhtxVar = zzhtx.RAW;
                                    zzhtiVarZze.zzd(zzhtxVar);
                                    zzibtVarZze = zzibrVarZzh2.zze();
                                    if (zzibtVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibu("invalid keyData");
                                }
                                break;
                            case 2575090:
                                if (strZzd.equals("TINK")) {
                                    zzhtxVar = zzhtx.TINK;
                                    zzhtiVarZze.zzd(zzhtxVar);
                                    zzibtVarZze = zzibrVarZzh2.zze();
                                    if (zzibtVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibu("invalid keyData");
                                }
                                break;
                            case 1761684556:
                                if (strZzd.equals("CRUNCHY")) {
                                    zzhtxVar = zzhtx.CRUNCHY;
                                    zzhtiVarZze.zzd(zzhtxVar);
                                    zzibtVarZze = zzibrVarZzh2.zze();
                                    if (zzibtVarZze.zzc("typeUrl")) {
                                    }
                                    throw new zzibu("invalid keyData");
                                }
                                break;
                        }
                        String.valueOf(strZzd);
                        throw new zzibu("unknown output prefix type: ".concat(String.valueOf(strZzd)));
                    }
                    if (iHashCode != 1053567612 || !strZzd2.equals("DISABLED")) {
                        String.valueOf(strZzd2);
                        throw new zzibu("unknown status: ".concat(String.valueOf(strZzd2)));
                    }
                    i = 4;
                    zzhtiVarZze.zze(i);
                    zzhtiVarZze.zzc(zzc(zzibtVarZze3.zzh("keyId")));
                    strZzd = zzibtVarZze3.zzh("outputPrefixType").zzd();
                    switch (strZzd.hashCode()) {
                        case -2053249079:
                            if (strZzd.equals("LEGACY")) {
                                zzhtxVar = zzhtx.LEGACY;
                                zzhtiVarZze.zzd(zzhtxVar);
                                zzibtVarZze = zzibrVarZzh2.zze();
                                if (zzibtVarZze.zzc("typeUrl") || !zzibtVarZze.zzc(AppMeasurementSdk.ConditionalUserProperty.VALUE) || !zzibtVarZze.zzc("keyMaterialType")) {
                                    throw new zzibu("invalid keyData");
                                }
                                byte[] bArrZza = zzhzv.zza(zzibtVarZze.zzh(AppMeasurementSdk.ConditionalUserProperty.VALUE).zzd(), 2);
                                zzhsz zzhszVarZzd = zzhtb.zzd();
                                zzhszVarZzd.zza(zzibtVarZze.zzh("typeUrl").zzd());
                                zzidl zzidlVar = zzidl.zza;
                                zzhszVarZzd.zzb(zzidl.zzt(bArrZza, 0, bArrZza.length));
                                String strZzd3 = zzibtVarZze.zzh("keyMaterialType").zzd();
                                switch (strZzd3.hashCode()) {
                                    case -1881281466:
                                        if (!strZzd3.equals("REMOTE")) {
                                            String.valueOf(strZzd3);
                                            throw new zzibu("unknown key material type: ".concat(String.valueOf(strZzd3)));
                                        }
                                        zzhtaVar = zzhta.REMOTE;
                                        break;
                                        break;
                                    case -1609477353:
                                        if (!strZzd3.equals("SYMMETRIC")) {
                                            String.valueOf(strZzd3);
                                            throw new zzibu("unknown key material type: ".concat(String.valueOf(strZzd3)));
                                        }
                                        zzhtaVar = zzhta.SYMMETRIC;
                                        break;
                                        break;
                                    case 249237018:
                                        if (!strZzd3.equals("ASYMMETRIC_PRIVATE")) {
                                            String.valueOf(strZzd3);
                                            throw new zzibu("unknown key material type: ".concat(String.valueOf(strZzd3)));
                                        }
                                        zzhtaVar = zzhta.ASYMMETRIC_PRIVATE;
                                        break;
                                        break;
                                    case 1534613202:
                                        if (!strZzd3.equals("ASYMMETRIC_PUBLIC")) {
                                            String.valueOf(strZzd3);
                                            throw new zzibu("unknown key material type: ".concat(String.valueOf(strZzd3)));
                                        }
                                        zzhtaVar = zzhta.ASYMMETRIC_PUBLIC;
                                        break;
                                        break;
                                    default:
                                        String.valueOf(strZzd3);
                                        throw new zzibu("unknown key material type: ".concat(String.valueOf(strZzd3)));
                                }
                                zzhszVarZzd.zzc(zzhtaVar);
                                zzhtiVarZze.zza((zzhtb) zzhszVarZzd.zzbu());
                                zzhthVarZzh.zzb((zzhtj) zzhtiVarZze.zzbu());
                                i4++;
                                str = str3;
                                str2 = str4;
                            }
                            break;
                        case 80904:
                            if (strZzd.equals("RAW")) {
                                zzhtxVar = zzhtx.RAW;
                                zzhtiVarZze.zzd(zzhtxVar);
                                zzibtVarZze = zzibrVarZzh2.zze();
                                if (zzibtVarZze.zzc("typeUrl")) {
                                }
                                throw new zzibu("invalid keyData");
                            }
                            break;
                        case 2575090:
                            if (strZzd.equals("TINK")) {
                                zzhtxVar = zzhtx.TINK;
                                zzhtiVarZze.zzd(zzhtxVar);
                                zzibtVarZze = zzibrVarZzh2.zze();
                                if (zzibtVarZze.zzc("typeUrl")) {
                                }
                                throw new zzibu("invalid keyData");
                            }
                            break;
                        case 1761684556:
                            if (strZzd.equals("CRUNCHY")) {
                                zzhtxVar = zzhtx.CRUNCHY;
                                zzhtiVarZze.zzd(zzhtxVar);
                                zzibtVarZze = zzibrVarZzh2.zze();
                                if (zzibtVarZze.zzc("typeUrl")) {
                                }
                                throw new zzibu("invalid keyData");
                            }
                            break;
                    }
                    String.valueOf(strZzd);
                    throw new zzibu("unknown output prefix type: ".concat(String.valueOf(strZzd)));
                }
                zzhtk zzhtkVar = (zzhtk) zzhthVarZzh.zzbu();
                this.zzb.close();
                return zzhtkVar;
            } catch (Throwable th) {
                this.zzb.close();
                throw th;
            }
        } catch (zzibu | IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
