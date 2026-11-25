package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tekartik.sqflite.Constant;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaos implements zzans {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzaoq zzh = new zzaoq(30.0f, 1, 1);

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfm.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:126:0x02da  */
    /* JADX WARN: Code duplicated, block: B:185:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0132 A[Catch: zzano -> 0x01a2, TryCatch #1 {zzano -> 0x01a2, blocks: (B:34:0x00b8, B:36:0x00d4, B:39:0x00ea, B:41:0x00f0, B:43:0x00f6, B:52:0x0111, B:61:0x012c, B:63:0x0132, B:64:0x013e, B:65:0x013f, B:66:0x015c, B:56:0x011d, B:60:0x0129, B:67:0x015d, B:68:0x015e, B:69:0x017f, B:38:0x00dd, B:70:0x0180, B:71:0x01a1), top: B:172:0x00b8 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static zzaov zzd(XmlPullParser xmlPullParser, zzaov zzaovVar) {
        Matcher matcher;
        String strGroup;
        int attributeCount = xmlPullParser.getAttributeCount();
        zzaov zzaovVarZze = zzaovVar;
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        zzaovVarZze = zze(zzaovVarZze);
                        zzaovVarZze.zzg("italic".equalsIgnoreCase(attributeValue));
                        continue;
                    }
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        zzaovVarZze = zze(zzaovVarZze);
                        zzaovVarZze.zzM(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        zzaovVarZze = zze(zzaovVarZze);
                        zzaovVarZze.zzi(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        zzaovVarZze = zze(zzaovVarZze);
                        zzaovVarZze.zzz(zzf(attributeValue));
                    } else {
                        continue;
                    }
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        zzaovVarZze = zze(zzaovVarZze);
                        zzaovVarZze.zzK(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        String strZza = zzgsz.zza(attributeValue);
                        switch (strZza.hashCode()) {
                            case -1461280213:
                                if (strZza.equals("nounderline")) {
                                    zzaovVarZze = zze(zzaovVarZze);
                                    zzaovVarZze.zze(false);
                                }
                                break;
                            case -1026963764:
                                if (strZza.equals("underline")) {
                                    zzaovVarZze = zze(zzaovVarZze);
                                    zzaovVarZze.zze(true);
                                }
                                break;
                            case 913457136:
                                if (strZza.equals("nolinethrough")) {
                                    zzaovVarZze = zze(zzaovVarZze);
                                    zzaovVarZze.zzc(false);
                                }
                                break;
                            case 1679736913:
                                if (strZza.equals("linethrough")) {
                                    zzaovVarZze = zze(zzaovVarZze);
                                    zzaovVarZze.zzc(true);
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        zzaovVarZze = zze(zzaovVarZze);
                        zzaovVarZze.zzf("bold".equalsIgnoreCase(attributeValue));
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && "style".equals(xmlPullParser.getName())) {
                        zzaovVarZze = zze(zzaovVarZze);
                        zzaovVarZze.zzs(attributeValue);
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        String strZza2 = zzgsz.zza(attributeValue);
                        switch (strZza2.hashCode()) {
                            case -618561360:
                                if (strZza2.equals("baseContainer")) {
                                    zzaovVarZze = zze(zzaovVarZze);
                                    zzaovVarZze.zzu(2);
                                }
                                break;
                            case -410956671:
                                if (strZza2.equals("container")) {
                                    zzaovVarZze = zze(zzaovVarZze);
                                    zzaovVarZze.zzu(1);
                                }
                                break;
                            case -250518009:
                                if (strZza2.equals("delimiter")) {
                                    zzaovVarZze = zze(zzaovVarZze);
                                    zzaovVarZze.zzu(4);
                                }
                                break;
                            case -136074796:
                                if (strZza2.equals("textContainer")) {
                                    zzaovVarZze = zze(zzaovVarZze);
                                    zzaovVarZze.zzu(3);
                                }
                                break;
                            case 3016401:
                                if (strZza2.equals("base")) {
                                    zzaovVarZze = zze(zzaovVarZze);
                                    zzaovVarZze.zzu(2);
                                }
                                break;
                            case 3556653:
                                if (strZza2.equals("text")) {
                                    zzaovVarZze = zze(zzaovVarZze);
                                    zzaovVarZze.zzu(3);
                                }
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals(TypedValues.Custom.S_COLOR)) {
                        zzaovVarZze = zze(zzaovVarZze);
                        try {
                            zzaovVarZze.zzk(zzds.zza(attributeValue));
                        } catch (IllegalArgumentException unused) {
                            String.valueOf(attributeValue);
                            zzeh.zzc("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        zzaov zzaovVarZze2 = zze(zzaovVarZze);
                        Matcher matcher2 = zza.matcher(attributeValue);
                        float fMin = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String strGroup2 = matcher2.group(1);
                                if (strGroup2 == null) {
                                    throw null;
                                }
                                String str = strGroup2;
                                fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup2)));
                            } catch (NumberFormatException e) {
                                String.valueOf(attributeValue);
                                zzeh.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                            }
                        } else {
                            String.valueOf(attributeValue);
                            zzeh.zzc("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                        }
                        zzaovVarZze2.zzp(fMin);
                        zzaovVarZze = zzaovVarZze2;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String strZza3 = zzgsz.zza(attributeValue);
                        int iHashCode = strZza3.hashCode();
                        if (iHashCode == 96673) {
                            if (strZza3.equals("all")) {
                                zzaovVarZze = zze(zzaovVarZze);
                                zzaovVarZze.zzD(true);
                            }
                        } else if (iHashCode == 3387192 && strZza3.equals("none")) {
                            zzaovVarZze = zze(zzaovVarZze);
                            zzaovVarZze.zzD(false);
                        }
                        break;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        try {
                            zzaovVarZze = zze(zzaovVarZze);
                            String str2 = zzfm.zza;
                            String[] strArrSplit = attributeValue.split("\\s+", -1);
                            int length = strArrSplit.length;
                            if (length == 1) {
                                matcher = zze.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                    sb.append("Invalid number of entries for fontSize: ");
                                    sb.append(length);
                                    sb.append(".");
                                    throw new zzano(sb.toString());
                                }
                                matcher = zze.matcher(strArrSplit[1]);
                                zzeh.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(attributeValue).length() + 36);
                                sb2.append("Invalid expression for fontSize: '");
                                sb2.append(attributeValue);
                                sb2.append("'.");
                                throw new zzano(sb2.toString());
                            }
                            String strGroup3 = matcher.group(3);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            String str3 = strGroup3;
                            int iHashCode2 = strGroup3.hashCode();
                            if (iHashCode2 == 37) {
                                if (!strGroup3.equals("%")) {
                                    StringBuilder sb3 = new StringBuilder(strGroup3.length() + 30);
                                    sb3.append("Invalid unit for fontSize: '");
                                    sb3.append(strGroup3);
                                    sb3.append("'.");
                                    throw new zzano(sb3.toString());
                                }
                                zzaovVarZze.zzH(3);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                String str4 = strGroup;
                                zzaovVarZze.zzG(Float.parseFloat(strGroup));
                            } else if (iHashCode2 == 3240) {
                                if (!strGroup3.equals("em")) {
                                    StringBuilder sb4 = new StringBuilder(strGroup3.length() + 30);
                                    sb4.append("Invalid unit for fontSize: '");
                                    sb4.append(strGroup3);
                                    sb4.append("'.");
                                    throw new zzano(sb4.toString());
                                }
                                zzaovVarZze.zzH(2);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                String str5 = strGroup;
                                zzaovVarZze.zzG(Float.parseFloat(strGroup));
                            } else {
                                if (iHashCode2 != 3592 || !strGroup3.equals("px")) {
                                    StringBuilder sb5 = new StringBuilder(strGroup3.length() + 30);
                                    sb5.append("Invalid unit for fontSize: '");
                                    sb5.append(strGroup3);
                                    sb5.append("'.");
                                    throw new zzano(sb5.toString());
                                }
                                zzaovVarZze.zzH(1);
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                String str6 = strGroup;
                                zzaovVarZze.zzG(Float.parseFloat(strGroup));
                            }
                        } catch (zzano unused2) {
                            String.valueOf(attributeValue);
                            zzeh.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        zzaovVarZze = zze(zzaovVarZze);
                        zzaovVarZze.zzF(zzaoo.zza(attributeValue));
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String strZza4 = zzgsz.zza(attributeValue);
                        int iHashCode3 = strZza4.hashCode();
                        if (iHashCode3 != -1392885889) {
                            if (iHashCode3 == 92734940 && strZza4.equals("after")) {
                                zzaovVarZze = zze(zzaovVarZze);
                                zzaovVarZze.zzw(2);
                            }
                        } else if (strZza4.equals("before")) {
                            zzaovVarZze = zze(zzaovVarZze);
                            zzaovVarZze.zzw(1);
                        }
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        zzaovVarZze = zze(zzaovVarZze);
                        try {
                            zzaovVarZze.zzn(zzds.zza(attributeValue));
                        } catch (IllegalArgumentException unused3) {
                            String.valueOf(attributeValue);
                            zzeh.zzc("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        zzaovVarZze = zze(zzaovVarZze);
                        zzaovVarZze.zzB(zzf(attributeValue));
                    }
                    break;
            }
        }
        return zzaovVarZze;
    }

    private static zzaov zze(zzaov zzaovVar) {
        return zzaovVar == null ? new zzaov() : zzaovVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Layout.Alignment zzf(String str) {
        String strZza = zzgsz.zza(str);
        switch (strZza.hashCode()) {
            case -1364013995:
                if (strZza.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strZza.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strZza.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strZza.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!strZza.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static long zzg(String str, zzaoq zzaoqVar) throws zzano {
        double d;
        double d2;
        Matcher matcher = zzc.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j2 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d3 = j + j2;
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = 0.0d;
            double d6 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d7 = d3 + d4;
            String strGroup5 = matcher.group(5);
            double d8 = strGroup5 != null ? Long.parseLong(strGroup5) / zzaoqVar.zza : 0.0d;
            double d9 = d7 + d6;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d5 = (Long.parseLong(strGroup6) / ((double) zzaoqVar.zzb)) / ((double) zzaoqVar.zza);
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            String.valueOf(str);
            throw new zzano("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d10 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup8.equals("s");
                        } else if (iHashCode == 116 && strGroup8.equals("t")) {
                            d = zzaoqVar.zzc;
                            d10 /= d;
                        }
                    } else if (strGroup8.equals("ms")) {
                        d = 1000.0d;
                        d10 /= d;
                    }
                } else if (strGroup8.equals("m")) {
                    d2 = 60.0d;
                    d10 *= d2;
                }
            } else if (strGroup8.equals("h")) {
                d2 = 3600.0d;
                d10 *= d2;
            }
        } else if (strGroup8.equals("f")) {
            d = zzaoqVar.zza;
            d10 /= d;
        }
        return (long) (d10 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(byte[] bArr, int i, int i2, zzanr zzanrVar, zzdu zzduVar) {
        zzanm.zza(zzb(bArr, i, i2), zzanrVar, zzduVar);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x030a A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_LEAVE, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x0092, B:20:0x009c, B:24:0x00b2, B:26:0x00cd, B:28:0x00d7, B:29:0x00db, B:31:0x00e7, B:32:0x00eb, B:62:0x0164, B:79:0x01bd, B:82:0x01d7, B:84:0x01dd, B:86:0x01e5, B:88:0x01ed, B:90:0x01f5, B:92:0x01fd, B:94:0x0205, B:96:0x020b, B:98:0x0213, B:100:0x021b, B:102:0x0221, B:104:0x0227, B:106:0x022d, B:108:0x0235, B:111:0x023e, B:371:0x072a, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0296, B:122:0x02ac, B:124:0x02b2, B:261:0x0558, B:126:0x02bb, B:129:0x02c7, B:244:0x0509, B:132:0x02e5, B:134:0x02ed, B:136:0x02f5, B:138:0x02fd, B:143:0x030a, B:146:0x0323, B:148:0x0329, B:150:0x0339, B:171:0x03aa, B:173:0x03b0, B:175:0x03b6, B:177:0x03be, B:179:0x03c4, B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:206:0x0477, B:208:0x047f, B:222:0x04ba, B:224:0x04c2, B:242:0x04fc, B:187:0x03fc, B:188:0x03fd, B:189:0x03fe, B:190:0x040d, B:193:0x0415, B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452, B:203:0x0453, B:204:0x0463, B:151:0x0345, B:152:0x0346, B:153:0x0347, B:154:0x034f, B:157:0x0359, B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c, B:167:0x038d, B:168:0x0395, B:247:0x051c, B:249:0x0529, B:251:0x0534, B:253:0x053a, B:255:0x0546, B:266:0x0572, B:268:0x0595, B:304:0x063e, B:273:0x05bc, B:276:0x05c5, B:343:0x06b1, B:282:0x05dc, B:289:0x05f8, B:293:0x060e, B:297:0x0622, B:301:0x0636, B:307:0x064f, B:311:0x065b, B:315:0x0664, B:325:0x0679, B:327:0x067e, B:332:0x068e, B:334:0x069a, B:336:0x069f, B:65:0x0171, B:67:0x017d, B:70:0x0186, B:72:0x018c, B:74:0x019a, B:75:0x01a9, B:76:0x01aa, B:77:0x01ab, B:36:0x0104, B:38:0x0110, B:41:0x011a, B:43:0x0120, B:45:0x012b, B:47:0x0131, B:54:0x0148, B:61:0x015c, B:56:0x0152, B:58:0x0157, B:348:0x06d3, B:350:0x06e3, B:353:0x06e7, B:355:0x06f1, B:357:0x06fb, B:361:0x0706, B:359:0x0703, B:364:0x071b, B:368:0x0723, B:374:0x0744, B:377:0x074a), top: B:404:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0320  */
    /* JADX WARN: Code duplicated, block: B:148:0x0329 A[Catch: NumberFormatException -> 0x0347, IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #3 {NumberFormatException -> 0x0347, blocks: (B:146:0x0323, B:148:0x0329, B:150:0x0339, B:151:0x0345, B:152:0x0346), top: B:392:0x0323 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0339 A[Catch: NumberFormatException -> 0x0347, IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #3 {NumberFormatException -> 0x0347, blocks: (B:146:0x0323, B:148:0x0329, B:150:0x0339, B:151:0x0345, B:152:0x0346), top: B:392:0x0323 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x034f A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x0092, B:20:0x009c, B:24:0x00b2, B:26:0x00cd, B:28:0x00d7, B:29:0x00db, B:31:0x00e7, B:32:0x00eb, B:62:0x0164, B:79:0x01bd, B:82:0x01d7, B:84:0x01dd, B:86:0x01e5, B:88:0x01ed, B:90:0x01f5, B:92:0x01fd, B:94:0x0205, B:96:0x020b, B:98:0x0213, B:100:0x021b, B:102:0x0221, B:104:0x0227, B:106:0x022d, B:108:0x0235, B:111:0x023e, B:371:0x072a, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0296, B:122:0x02ac, B:124:0x02b2, B:261:0x0558, B:126:0x02bb, B:129:0x02c7, B:244:0x0509, B:132:0x02e5, B:134:0x02ed, B:136:0x02f5, B:138:0x02fd, B:143:0x030a, B:146:0x0323, B:148:0x0329, B:150:0x0339, B:171:0x03aa, B:173:0x03b0, B:175:0x03b6, B:177:0x03be, B:179:0x03c4, B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:206:0x0477, B:208:0x047f, B:222:0x04ba, B:224:0x04c2, B:242:0x04fc, B:187:0x03fc, B:188:0x03fd, B:189:0x03fe, B:190:0x040d, B:193:0x0415, B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452, B:203:0x0453, B:204:0x0463, B:151:0x0345, B:152:0x0346, B:153:0x0347, B:154:0x034f, B:157:0x0359, B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c, B:167:0x038d, B:168:0x0395, B:247:0x051c, B:249:0x0529, B:251:0x0534, B:253:0x053a, B:255:0x0546, B:266:0x0572, B:268:0x0595, B:304:0x063e, B:273:0x05bc, B:276:0x05c5, B:343:0x06b1, B:282:0x05dc, B:289:0x05f8, B:293:0x060e, B:297:0x0622, B:301:0x0636, B:307:0x064f, B:311:0x065b, B:315:0x0664, B:325:0x0679, B:327:0x067e, B:332:0x068e, B:334:0x069a, B:336:0x069f, B:65:0x0171, B:67:0x017d, B:70:0x0186, B:72:0x018c, B:74:0x019a, B:75:0x01a9, B:76:0x01aa, B:77:0x01ab, B:36:0x0104, B:38:0x0110, B:41:0x011a, B:43:0x0120, B:45:0x012b, B:47:0x0131, B:54:0x0148, B:61:0x015c, B:56:0x0152, B:58:0x0157, B:348:0x06d3, B:350:0x06e3, B:353:0x06e7, B:355:0x06f1, B:357:0x06fb, B:361:0x0706, B:359:0x0703, B:364:0x071b, B:368:0x0723, B:374:0x0744, B:377:0x074a), top: B:404:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0357 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0359 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_LEAVE, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x0092, B:20:0x009c, B:24:0x00b2, B:26:0x00cd, B:28:0x00d7, B:29:0x00db, B:31:0x00e7, B:32:0x00eb, B:62:0x0164, B:79:0x01bd, B:82:0x01d7, B:84:0x01dd, B:86:0x01e5, B:88:0x01ed, B:90:0x01f5, B:92:0x01fd, B:94:0x0205, B:96:0x020b, B:98:0x0213, B:100:0x021b, B:102:0x0221, B:104:0x0227, B:106:0x022d, B:108:0x0235, B:111:0x023e, B:371:0x072a, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0296, B:122:0x02ac, B:124:0x02b2, B:261:0x0558, B:126:0x02bb, B:129:0x02c7, B:244:0x0509, B:132:0x02e5, B:134:0x02ed, B:136:0x02f5, B:138:0x02fd, B:143:0x030a, B:146:0x0323, B:148:0x0329, B:150:0x0339, B:171:0x03aa, B:173:0x03b0, B:175:0x03b6, B:177:0x03be, B:179:0x03c4, B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:206:0x0477, B:208:0x047f, B:222:0x04ba, B:224:0x04c2, B:242:0x04fc, B:187:0x03fc, B:188:0x03fd, B:189:0x03fe, B:190:0x040d, B:193:0x0415, B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452, B:203:0x0453, B:204:0x0463, B:151:0x0345, B:152:0x0346, B:153:0x0347, B:154:0x034f, B:157:0x0359, B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c, B:167:0x038d, B:168:0x0395, B:247:0x051c, B:249:0x0529, B:251:0x0534, B:253:0x053a, B:255:0x0546, B:266:0x0572, B:268:0x0595, B:304:0x063e, B:273:0x05bc, B:276:0x05c5, B:343:0x06b1, B:282:0x05dc, B:289:0x05f8, B:293:0x060e, B:297:0x0622, B:301:0x0636, B:307:0x064f, B:311:0x065b, B:315:0x0664, B:325:0x0679, B:327:0x067e, B:332:0x068e, B:334:0x069a, B:336:0x069f, B:65:0x0171, B:67:0x017d, B:70:0x0186, B:72:0x018c, B:74:0x019a, B:75:0x01a9, B:76:0x01aa, B:77:0x01ab, B:36:0x0104, B:38:0x0110, B:41:0x011a, B:43:0x0120, B:45:0x012b, B:47:0x0131, B:54:0x0148, B:61:0x015c, B:56:0x0152, B:58:0x0157, B:348:0x06d3, B:350:0x06e3, B:353:0x06e7, B:355:0x06f1, B:357:0x06fb, B:361:0x0706, B:359:0x0703, B:364:0x071b, B:368:0x0723, B:374:0x0744, B:377:0x074a), top: B:404:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0361  */
    /* JADX WARN: Code duplicated, block: B:162:0x0368 A[Catch: NumberFormatException -> 0x038d, IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #12 {NumberFormatException -> 0x038d, blocks: (B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c), top: B:402:0x0362 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0376 A[Catch: NumberFormatException -> 0x038d, IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #12 {NumberFormatException -> 0x038d, blocks: (B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c), top: B:402:0x0362 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0395 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x0092, B:20:0x009c, B:24:0x00b2, B:26:0x00cd, B:28:0x00d7, B:29:0x00db, B:31:0x00e7, B:32:0x00eb, B:62:0x0164, B:79:0x01bd, B:82:0x01d7, B:84:0x01dd, B:86:0x01e5, B:88:0x01ed, B:90:0x01f5, B:92:0x01fd, B:94:0x0205, B:96:0x020b, B:98:0x0213, B:100:0x021b, B:102:0x0221, B:104:0x0227, B:106:0x022d, B:108:0x0235, B:111:0x023e, B:371:0x072a, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0296, B:122:0x02ac, B:124:0x02b2, B:261:0x0558, B:126:0x02bb, B:129:0x02c7, B:244:0x0509, B:132:0x02e5, B:134:0x02ed, B:136:0x02f5, B:138:0x02fd, B:143:0x030a, B:146:0x0323, B:148:0x0329, B:150:0x0339, B:171:0x03aa, B:173:0x03b0, B:175:0x03b6, B:177:0x03be, B:179:0x03c4, B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:206:0x0477, B:208:0x047f, B:222:0x04ba, B:224:0x04c2, B:242:0x04fc, B:187:0x03fc, B:188:0x03fd, B:189:0x03fe, B:190:0x040d, B:193:0x0415, B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452, B:203:0x0453, B:204:0x0463, B:151:0x0345, B:152:0x0346, B:153:0x0347, B:154:0x034f, B:157:0x0359, B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c, B:167:0x038d, B:168:0x0395, B:247:0x051c, B:249:0x0529, B:251:0x0534, B:253:0x053a, B:255:0x0546, B:266:0x0572, B:268:0x0595, B:304:0x063e, B:273:0x05bc, B:276:0x05c5, B:343:0x06b1, B:282:0x05dc, B:289:0x05f8, B:293:0x060e, B:297:0x0622, B:301:0x0636, B:307:0x064f, B:311:0x065b, B:315:0x0664, B:325:0x0679, B:327:0x067e, B:332:0x068e, B:334:0x069a, B:336:0x069f, B:65:0x0171, B:67:0x017d, B:70:0x0186, B:72:0x018c, B:74:0x019a, B:75:0x01a9, B:76:0x01aa, B:77:0x01ab, B:36:0x0104, B:38:0x0110, B:41:0x011a, B:43:0x0120, B:45:0x012b, B:47:0x0131, B:54:0x0148, B:61:0x015c, B:56:0x0152, B:58:0x0157, B:348:0x06d3, B:350:0x06e3, B:353:0x06e7, B:355:0x06f1, B:357:0x06fb, B:361:0x0706, B:359:0x0703, B:364:0x071b, B:368:0x0723, B:374:0x0744, B:377:0x074a), top: B:404:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:179:0x03c4 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_LEAVE, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x0092, B:20:0x009c, B:24:0x00b2, B:26:0x00cd, B:28:0x00d7, B:29:0x00db, B:31:0x00e7, B:32:0x00eb, B:62:0x0164, B:79:0x01bd, B:82:0x01d7, B:84:0x01dd, B:86:0x01e5, B:88:0x01ed, B:90:0x01f5, B:92:0x01fd, B:94:0x0205, B:96:0x020b, B:98:0x0213, B:100:0x021b, B:102:0x0221, B:104:0x0227, B:106:0x022d, B:108:0x0235, B:111:0x023e, B:371:0x072a, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0296, B:122:0x02ac, B:124:0x02b2, B:261:0x0558, B:126:0x02bb, B:129:0x02c7, B:244:0x0509, B:132:0x02e5, B:134:0x02ed, B:136:0x02f5, B:138:0x02fd, B:143:0x030a, B:146:0x0323, B:148:0x0329, B:150:0x0339, B:171:0x03aa, B:173:0x03b0, B:175:0x03b6, B:177:0x03be, B:179:0x03c4, B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:206:0x0477, B:208:0x047f, B:222:0x04ba, B:224:0x04c2, B:242:0x04fc, B:187:0x03fc, B:188:0x03fd, B:189:0x03fe, B:190:0x040d, B:193:0x0415, B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452, B:203:0x0453, B:204:0x0463, B:151:0x0345, B:152:0x0346, B:153:0x0347, B:154:0x034f, B:157:0x0359, B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c, B:167:0x038d, B:168:0x0395, B:247:0x051c, B:249:0x0529, B:251:0x0534, B:253:0x053a, B:255:0x0546, B:266:0x0572, B:268:0x0595, B:304:0x063e, B:273:0x05bc, B:276:0x05c5, B:343:0x06b1, B:282:0x05dc, B:289:0x05f8, B:293:0x060e, B:297:0x0622, B:301:0x0636, B:307:0x064f, B:311:0x065b, B:315:0x0664, B:325:0x0679, B:327:0x067e, B:332:0x068e, B:334:0x069a, B:336:0x069f, B:65:0x0171, B:67:0x017d, B:70:0x0186, B:72:0x018c, B:74:0x019a, B:75:0x01a9, B:76:0x01aa, B:77:0x01ab, B:36:0x0104, B:38:0x0110, B:41:0x011a, B:43:0x0120, B:45:0x012b, B:47:0x0131, B:54:0x0148, B:61:0x015c, B:56:0x0152, B:58:0x0157, B:348:0x06d3, B:350:0x06e3, B:353:0x06e7, B:355:0x06f1, B:357:0x06fb, B:361:0x0706, B:359:0x0703, B:364:0x071b, B:368:0x0723, B:374:0x0744, B:377:0x074a), top: B:404:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:184:0x03dd A[Catch: NumberFormatException -> 0x03fe, IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #5 {NumberFormatException -> 0x03fe, blocks: (B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:187:0x03fc, B:188:0x03fd), top: B:395:0x03d7 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x03ed A[Catch: NumberFormatException -> 0x03fe, IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #5 {NumberFormatException -> 0x03fe, blocks: (B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:187:0x03fc, B:188:0x03fd), top: B:395:0x03d7 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x040d A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x0092, B:20:0x009c, B:24:0x00b2, B:26:0x00cd, B:28:0x00d7, B:29:0x00db, B:31:0x00e7, B:32:0x00eb, B:62:0x0164, B:79:0x01bd, B:82:0x01d7, B:84:0x01dd, B:86:0x01e5, B:88:0x01ed, B:90:0x01f5, B:92:0x01fd, B:94:0x0205, B:96:0x020b, B:98:0x0213, B:100:0x021b, B:102:0x0221, B:104:0x0227, B:106:0x022d, B:108:0x0235, B:111:0x023e, B:371:0x072a, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0296, B:122:0x02ac, B:124:0x02b2, B:261:0x0558, B:126:0x02bb, B:129:0x02c7, B:244:0x0509, B:132:0x02e5, B:134:0x02ed, B:136:0x02f5, B:138:0x02fd, B:143:0x030a, B:146:0x0323, B:148:0x0329, B:150:0x0339, B:171:0x03aa, B:173:0x03b0, B:175:0x03b6, B:177:0x03be, B:179:0x03c4, B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:206:0x0477, B:208:0x047f, B:222:0x04ba, B:224:0x04c2, B:242:0x04fc, B:187:0x03fc, B:188:0x03fd, B:189:0x03fe, B:190:0x040d, B:193:0x0415, B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452, B:203:0x0453, B:204:0x0463, B:151:0x0345, B:152:0x0346, B:153:0x0347, B:154:0x034f, B:157:0x0359, B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c, B:167:0x038d, B:168:0x0395, B:247:0x051c, B:249:0x0529, B:251:0x0534, B:253:0x053a, B:255:0x0546, B:266:0x0572, B:268:0x0595, B:304:0x063e, B:273:0x05bc, B:276:0x05c5, B:343:0x06b1, B:282:0x05dc, B:289:0x05f8, B:293:0x060e, B:297:0x0622, B:301:0x0636, B:307:0x064f, B:311:0x065b, B:315:0x0664, B:325:0x0679, B:327:0x067e, B:332:0x068e, B:334:0x069a, B:336:0x069f, B:65:0x0171, B:67:0x017d, B:70:0x0186, B:72:0x018c, B:74:0x019a, B:75:0x01a9, B:76:0x01aa, B:77:0x01ab, B:36:0x0104, B:38:0x0110, B:41:0x011a, B:43:0x0120, B:45:0x012b, B:47:0x0131, B:54:0x0148, B:61:0x015c, B:56:0x0152, B:58:0x0157, B:348:0x06d3, B:350:0x06e3, B:353:0x06e7, B:355:0x06f1, B:357:0x06fb, B:361:0x0706, B:359:0x0703, B:364:0x071b, B:368:0x0723, B:374:0x0744, B:377:0x074a), top: B:404:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0413 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x0415 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_LEAVE, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x0092, B:20:0x009c, B:24:0x00b2, B:26:0x00cd, B:28:0x00d7, B:29:0x00db, B:31:0x00e7, B:32:0x00eb, B:62:0x0164, B:79:0x01bd, B:82:0x01d7, B:84:0x01dd, B:86:0x01e5, B:88:0x01ed, B:90:0x01f5, B:92:0x01fd, B:94:0x0205, B:96:0x020b, B:98:0x0213, B:100:0x021b, B:102:0x0221, B:104:0x0227, B:106:0x022d, B:108:0x0235, B:111:0x023e, B:371:0x072a, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0296, B:122:0x02ac, B:124:0x02b2, B:261:0x0558, B:126:0x02bb, B:129:0x02c7, B:244:0x0509, B:132:0x02e5, B:134:0x02ed, B:136:0x02f5, B:138:0x02fd, B:143:0x030a, B:146:0x0323, B:148:0x0329, B:150:0x0339, B:171:0x03aa, B:173:0x03b0, B:175:0x03b6, B:177:0x03be, B:179:0x03c4, B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:206:0x0477, B:208:0x047f, B:222:0x04ba, B:224:0x04c2, B:242:0x04fc, B:187:0x03fc, B:188:0x03fd, B:189:0x03fe, B:190:0x040d, B:193:0x0415, B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452, B:203:0x0453, B:204:0x0463, B:151:0x0345, B:152:0x0346, B:153:0x0347, B:154:0x034f, B:157:0x0359, B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c, B:167:0x038d, B:168:0x0395, B:247:0x051c, B:249:0x0529, B:251:0x0534, B:253:0x053a, B:255:0x0546, B:266:0x0572, B:268:0x0595, B:304:0x063e, B:273:0x05bc, B:276:0x05c5, B:343:0x06b1, B:282:0x05dc, B:289:0x05f8, B:293:0x060e, B:297:0x0622, B:301:0x0636, B:307:0x064f, B:311:0x065b, B:315:0x0664, B:325:0x0679, B:327:0x067e, B:332:0x068e, B:334:0x069a, B:336:0x069f, B:65:0x0171, B:67:0x017d, B:70:0x0186, B:72:0x018c, B:74:0x019a, B:75:0x01a9, B:76:0x01aa, B:77:0x01ab, B:36:0x0104, B:38:0x0110, B:41:0x011a, B:43:0x0120, B:45:0x012b, B:47:0x0131, B:54:0x0148, B:61:0x015c, B:56:0x0152, B:58:0x0157, B:348:0x06d3, B:350:0x06e3, B:353:0x06e7, B:355:0x06f1, B:357:0x06fb, B:361:0x0706, B:359:0x0703, B:364:0x071b, B:368:0x0723, B:374:0x0744, B:377:0x074a), top: B:404:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0425  */
    /* JADX WARN: Code duplicated, block: B:198:0x042c A[Catch: NumberFormatException -> 0x0453, IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #11 {NumberFormatException -> 0x0453, blocks: (B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452), top: B:401:0x0426 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x043a A[Catch: NumberFormatException -> 0x0453, IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #11 {NumberFormatException -> 0x0453, blocks: (B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452), top: B:401:0x0426 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x0463 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x0092, B:20:0x009c, B:24:0x00b2, B:26:0x00cd, B:28:0x00d7, B:29:0x00db, B:31:0x00e7, B:32:0x00eb, B:62:0x0164, B:79:0x01bd, B:82:0x01d7, B:84:0x01dd, B:86:0x01e5, B:88:0x01ed, B:90:0x01f5, B:92:0x01fd, B:94:0x0205, B:96:0x020b, B:98:0x0213, B:100:0x021b, B:102:0x0221, B:104:0x0227, B:106:0x022d, B:108:0x0235, B:111:0x023e, B:371:0x072a, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0296, B:122:0x02ac, B:124:0x02b2, B:261:0x0558, B:126:0x02bb, B:129:0x02c7, B:244:0x0509, B:132:0x02e5, B:134:0x02ed, B:136:0x02f5, B:138:0x02fd, B:143:0x030a, B:146:0x0323, B:148:0x0329, B:150:0x0339, B:171:0x03aa, B:173:0x03b0, B:175:0x03b6, B:177:0x03be, B:179:0x03c4, B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:206:0x0477, B:208:0x047f, B:222:0x04ba, B:224:0x04c2, B:242:0x04fc, B:187:0x03fc, B:188:0x03fd, B:189:0x03fe, B:190:0x040d, B:193:0x0415, B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452, B:203:0x0453, B:204:0x0463, B:151:0x0345, B:152:0x0346, B:153:0x0347, B:154:0x034f, B:157:0x0359, B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c, B:167:0x038d, B:168:0x0395, B:247:0x051c, B:249:0x0529, B:251:0x0534, B:253:0x053a, B:255:0x0546, B:266:0x0572, B:268:0x0595, B:304:0x063e, B:273:0x05bc, B:276:0x05c5, B:343:0x06b1, B:282:0x05dc, B:289:0x05f8, B:293:0x060e, B:297:0x0622, B:301:0x0636, B:307:0x064f, B:311:0x065b, B:315:0x0664, B:325:0x0679, B:327:0x067e, B:332:0x068e, B:334:0x069a, B:336:0x069f, B:65:0x0171, B:67:0x017d, B:70:0x0186, B:72:0x018c, B:74:0x019a, B:75:0x01a9, B:76:0x01aa, B:77:0x01ab, B:36:0x0104, B:38:0x0110, B:41:0x011a, B:43:0x0120, B:45:0x012b, B:47:0x0131, B:54:0x0148, B:61:0x015c, B:56:0x0152, B:58:0x0157, B:348:0x06d3, B:350:0x06e3, B:353:0x06e7, B:355:0x06f1, B:357:0x06fb, B:361:0x0706, B:359:0x0703, B:364:0x071b, B:368:0x0723, B:374:0x0744, B:377:0x074a), top: B:404:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0473  */
    /* JADX WARN: Code duplicated, block: B:208:0x047f A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_LEAVE, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x0092, B:20:0x009c, B:24:0x00b2, B:26:0x00cd, B:28:0x00d7, B:29:0x00db, B:31:0x00e7, B:32:0x00eb, B:62:0x0164, B:79:0x01bd, B:82:0x01d7, B:84:0x01dd, B:86:0x01e5, B:88:0x01ed, B:90:0x01f5, B:92:0x01fd, B:94:0x0205, B:96:0x020b, B:98:0x0213, B:100:0x021b, B:102:0x0221, B:104:0x0227, B:106:0x022d, B:108:0x0235, B:111:0x023e, B:371:0x072a, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0296, B:122:0x02ac, B:124:0x02b2, B:261:0x0558, B:126:0x02bb, B:129:0x02c7, B:244:0x0509, B:132:0x02e5, B:134:0x02ed, B:136:0x02f5, B:138:0x02fd, B:143:0x030a, B:146:0x0323, B:148:0x0329, B:150:0x0339, B:171:0x03aa, B:173:0x03b0, B:175:0x03b6, B:177:0x03be, B:179:0x03c4, B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:206:0x0477, B:208:0x047f, B:222:0x04ba, B:224:0x04c2, B:242:0x04fc, B:187:0x03fc, B:188:0x03fd, B:189:0x03fe, B:190:0x040d, B:193:0x0415, B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452, B:203:0x0453, B:204:0x0463, B:151:0x0345, B:152:0x0346, B:153:0x0347, B:154:0x034f, B:157:0x0359, B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c, B:167:0x038d, B:168:0x0395, B:247:0x051c, B:249:0x0529, B:251:0x0534, B:253:0x053a, B:255:0x0546, B:266:0x0572, B:268:0x0595, B:304:0x063e, B:273:0x05bc, B:276:0x05c5, B:343:0x06b1, B:282:0x05dc, B:289:0x05f8, B:293:0x060e, B:297:0x0622, B:301:0x0636, B:307:0x064f, B:311:0x065b, B:315:0x0664, B:325:0x0679, B:327:0x067e, B:332:0x068e, B:334:0x069a, B:336:0x069f, B:65:0x0171, B:67:0x017d, B:70:0x0186, B:72:0x018c, B:74:0x019a, B:75:0x01a9, B:76:0x01aa, B:77:0x01ab, B:36:0x0104, B:38:0x0110, B:41:0x011a, B:43:0x0120, B:45:0x012b, B:47:0x0131, B:54:0x0148, B:61:0x015c, B:56:0x0152, B:58:0x0157, B:348:0x06d3, B:350:0x06e3, B:353:0x06e7, B:355:0x06f1, B:357:0x06fb, B:361:0x0706, B:359:0x0703, B:364:0x071b, B:368:0x0723, B:374:0x0744, B:377:0x074a), top: B:404:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x048c  */
    /* JADX WARN: Code duplicated, block: B:217:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:219:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:220:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:224:0x04c2 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0754, TRY_LEAVE, TryCatch #14 {IOException -> 0x074b, XmlPullParserException -> 0x0754, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x0092, B:20:0x009c, B:24:0x00b2, B:26:0x00cd, B:28:0x00d7, B:29:0x00db, B:31:0x00e7, B:32:0x00eb, B:62:0x0164, B:79:0x01bd, B:82:0x01d7, B:84:0x01dd, B:86:0x01e5, B:88:0x01ed, B:90:0x01f5, B:92:0x01fd, B:94:0x0205, B:96:0x020b, B:98:0x0213, B:100:0x021b, B:102:0x0221, B:104:0x0227, B:106:0x022d, B:108:0x0235, B:111:0x023e, B:371:0x072a, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0296, B:122:0x02ac, B:124:0x02b2, B:261:0x0558, B:126:0x02bb, B:129:0x02c7, B:244:0x0509, B:132:0x02e5, B:134:0x02ed, B:136:0x02f5, B:138:0x02fd, B:143:0x030a, B:146:0x0323, B:148:0x0329, B:150:0x0339, B:171:0x03aa, B:173:0x03b0, B:175:0x03b6, B:177:0x03be, B:179:0x03c4, B:182:0x03d7, B:184:0x03dd, B:186:0x03ed, B:206:0x0477, B:208:0x047f, B:222:0x04ba, B:224:0x04c2, B:242:0x04fc, B:187:0x03fc, B:188:0x03fd, B:189:0x03fe, B:190:0x040d, B:193:0x0415, B:196:0x0426, B:198:0x042c, B:200:0x043a, B:201:0x0451, B:202:0x0452, B:203:0x0453, B:204:0x0463, B:151:0x0345, B:152:0x0346, B:153:0x0347, B:154:0x034f, B:157:0x0359, B:160:0x0362, B:162:0x0368, B:164:0x0376, B:165:0x038b, B:166:0x038c, B:167:0x038d, B:168:0x0395, B:247:0x051c, B:249:0x0529, B:251:0x0534, B:253:0x053a, B:255:0x0546, B:266:0x0572, B:268:0x0595, B:304:0x063e, B:273:0x05bc, B:276:0x05c5, B:343:0x06b1, B:282:0x05dc, B:289:0x05f8, B:293:0x060e, B:297:0x0622, B:301:0x0636, B:307:0x064f, B:311:0x065b, B:315:0x0664, B:325:0x0679, B:327:0x067e, B:332:0x068e, B:334:0x069a, B:336:0x069f, B:65:0x0171, B:67:0x017d, B:70:0x0186, B:72:0x018c, B:74:0x019a, B:75:0x01a9, B:76:0x01aa, B:77:0x01ab, B:36:0x0104, B:38:0x0110, B:41:0x011a, B:43:0x0120, B:45:0x012b, B:47:0x0131, B:54:0x0148, B:61:0x015c, B:56:0x0152, B:58:0x0157, B:348:0x06d3, B:350:0x06e3, B:353:0x06e7, B:355:0x06f1, B:357:0x06fb, B:361:0x0706, B:359:0x0703, B:364:0x071b, B:368:0x0723, B:374:0x0744, B:377:0x074a), top: B:404:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:229:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:235:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:238:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:240:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:241:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:264:0x0564 A[LOOP:1: B:114:0x0271->B:264:0x0564, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:410:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x03fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x055e A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:269:0x05a1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v66, types: [com.google.android.gms.internal.ads.zzaot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.google.android.gms.internal.ads.zzaor] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.google.android.gms.internal.ads.zzaov, java.lang.Throwable] */
    public final zzann zzb(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        HashMap map;
        ArrayDeque arrayDeque;
        zzaoq zzaoqVar;
        ?? r17;
        ?? zzaorVar;
        zzaoq zzaoqVar2;
        zzaop zzaopVar;
        zzaop zzaopVar2;
        long j;
        Object obj;
        String str3;
        String str4;
        String strZzc;
        String str5;
        String strZzL;
        String str6;
        HashMap map2;
        String str7;
        float f;
        float f2;
        ?? zzaotVar;
        String strZzc2;
        float f3;
        float f4;
        String strZzc3;
        int i3;
        float f5;
        String strZzc4;
        int i4;
        String strZza;
        int iHashCode;
        String strZza2;
        int iHashCode2;
        Matcher matcher;
        Matcher matcher2;
        String strGroup;
        int i5;
        String strGroup2;
        String strGroup3;
        float f6;
        String strGroup4;
        String strZzc5;
        zzaov zzaovVar;
        Matcher matcher3;
        Matcher matcher4;
        String strGroup5;
        int i6;
        String strGroup6;
        String strGroup7;
        float f7;
        String strGroup8;
        zzaov zzaovVar2;
        String str8;
        float f8;
        boolean z;
        String str9 = "";
        String str10 = "http://www.w3.org/ns/ttml#parameter";
        String str11 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            map4.put("", new zzaot("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzaoq zzaoqVar3 = zzh;
            zzaow zzaowVar = null;
            ?? r18 = 0;
            zzaoq zzaoqVar4 = zzaoqVar3;
            int i7 = 0;
            int i8 = 15;
            while (eventType != 1) {
                zzaop zzaopVar3 = (zzaop) arrayDeque2.peek();
                ?? r47 = obj2;
                if (i7 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str9;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRate");
                            int i9 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            zzaowVar = zzaowVar;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str10, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                String str12 = zzfm.zza;
                                String[] strArrSplit = attributeValue2.split(" ", -1);
                                zzgtr.zzb(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f8 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                            } else {
                                f8 = 1.0f;
                            }
                            int i10 = zzaoqVar3.zzb;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str10, "subFrameRate");
                            if (attributeValue3 != null) {
                                i10 = Integer.parseInt(attributeValue3);
                            }
                            int i11 = zzaoqVar3.zzc;
                            zzaoqVar = zzaoqVar3;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str10, "tickRate");
                            if (attributeValue4 != null) {
                                i11 = Integer.parseInt(attributeValue4);
                            }
                            zzaoqVar4 = new zzaoq(i9 * f8, i10, i11);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str10, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str10;
                                zzaoqVar4 = zzaoqVar4;
                                i8 = 15;
                            } else {
                                Matcher matcher5 = zzg.matcher(attributeValue5);
                                if (matcher5.matches()) {
                                    try {
                                        String strGroup9 = matcher5.group(1);
                                        if (strGroup9 == null) {
                                            throw r47;
                                        }
                                        String str13 = strGroup9;
                                        int i12 = Integer.parseInt(strGroup9);
                                        str2 = str10;
                                        try {
                                            String strGroup10 = matcher5.group(2);
                                            if (strGroup10 == null) {
                                                throw r47;
                                            }
                                            String str14 = strGroup10;
                                            int i13 = Integer.parseInt(strGroup10);
                                            try {
                                                if (i12 != 0) {
                                                    if (i13 != 0) {
                                                        z = true;
                                                    } else {
                                                        i13 = 0;
                                                        z = false;
                                                    }
                                                    zzgtr.zzg(z, "Invalid cell resolution %s %s", i12, i13);
                                                    i8 = i13;
                                                } else {
                                                    z = false;
                                                }
                                                zzgtr.zzg(z, "Invalid cell resolution %s %s", i12, i13);
                                                i8 = i13;
                                            } catch (NumberFormatException unused) {
                                                zzeh.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                i8 = 15;
                                            }
                                        } catch (NumberFormatException unused2) {
                                            zzaoqVar4 = zzaoqVar4;
                                        }
                                    } catch (NumberFormatException unused3) {
                                        str2 = str10;
                                    }
                                    zzaoqVar4 = zzaoqVar4;
                                    zzeh.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    i8 = 15;
                                } else {
                                    zzeh.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str2 = str10;
                                    zzaoqVar4 = zzaoqVar4;
                                    i8 = 15;
                                }
                            }
                            String strZzc6 = zzfv.zzc(xmlPullParserNewPullParser, "extent");
                            if (strZzc6 == null) {
                                zzaorVar = r47;
                            } else {
                                Matcher matcher6 = zzf.matcher(strZzc6);
                                if (matcher6.matches()) {
                                    try {
                                        String strGroup11 = matcher6.group(1);
                                        if (strGroup11 == null) {
                                            throw r47;
                                        }
                                        String str15 = strGroup11;
                                        int i14 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher6.group(2);
                                        if (strGroup12 == null) {
                                            throw r47;
                                        }
                                        String str16 = strGroup12;
                                        zzaorVar = new zzaor(i14, Integer.parseInt(strGroup12));
                                    } catch (NumberFormatException unused4) {
                                        zzeh.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(strZzc6));
                                        zzaorVar = r47;
                                    }
                                } else {
                                    zzeh.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZzc6));
                                }
                                zzaorVar = r47;
                            }
                        } else {
                            str2 = str10;
                            arrayDeque2 = arrayDeque2;
                            zzaoqVar = zzaoqVar3;
                            zzaowVar = zzaowVar;
                            i7 = i7;
                            zzaorVar = r18;
                        }
                        r18 = zzaorVar;
                        i8 = i8;
                        String str17 = "image";
                        String str18 = "metadata";
                        String str19 = "region";
                        String str20 = "head";
                        zzaoqVar4 = zzaoqVar4;
                        if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals(Constant.PARAM_ERROR_DATA) || name.equals("information")) {
                            if ("head".equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzfv.zzb(xmlPullParserNewPullParser, "style")) {
                                        String strZzc7 = zzfv.zzc(xmlPullParserNewPullParser, "style");
                                        zzaov zzaovVarZzd = zzd(xmlPullParserNewPullParser, new zzaov());
                                        if (strZzc7 != null) {
                                            String[] strArrZzc = zzc(strZzc7);
                                            int i15 = 0;
                                            for (int length = strArrZzc.length; i15 < length; length = length) {
                                                zzaovVarZzd.zzr((zzaov) map3.get(strArrZzc[i15]));
                                                i15++;
                                            }
                                        }
                                        String strZzt = zzaovVarZzd.zzt();
                                        if (strZzt != null) {
                                            map3.put(strZzt, zzaovVarZzd);
                                        }
                                        map = map5;
                                        str3 = str18;
                                        str4 = str19;
                                    } else {
                                        str11 = str11;
                                        str20 = str20;
                                        if (zzfv.zzb(xmlPullParserNewPullParser, str19)) {
                                            str4 = str19;
                                            HashMap map6 = map5;
                                            String strZzc8 = zzfv.zzc(xmlPullParserNewPullParser, "id");
                                            if (strZzc8 == null) {
                                                zzaotVar = r47;
                                                str6 = str17;
                                                map2 = map4;
                                                str7 = str18;
                                            } else {
                                                String strZzc9 = zzfv.zzc(xmlPullParserNewPullParser, "origin");
                                                if (strZzc9 == null) {
                                                    str5 = strZzc9;
                                                    String strZzc10 = zzfv.zzc(xmlPullParserNewPullParser, "style");
                                                    if (strZzc10 != null && (zzaovVar2 = (zzaov) map3.get(strZzc10)) != null) {
                                                        strZzL = zzaovVar2.zzL();
                                                    }
                                                    if (strZzL != null) {
                                                        str6 = str17;
                                                        matcher3 = zzb.matcher(strZzL);
                                                        str7 = str18;
                                                        matcher4 = zzf.matcher(strZzL);
                                                        if (matcher3.matches()) {
                                                            map2 = map4;
                                                            try {
                                                                strGroup7 = matcher3.group(1);
                                                                if (strGroup7 != null) {
                                                                    throw r47;
                                                                }
                                                                String str21 = strGroup7;
                                                                f7 = Float.parseFloat(strGroup7) / 100.0f;
                                                                strGroup8 = matcher3.group(2);
                                                                if (strGroup8 != null) {
                                                                    throw r47;
                                                                }
                                                                String str22 = strGroup8;
                                                                f = Float.parseFloat(strGroup8) / 100.0f;
                                                                f2 = f7;
                                                            } catch (NumberFormatException unused5) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                            }
                                                        } else {
                                                            map2 = map4;
                                                            if (matcher4.matches()) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                            } else if (r18 == 0) {
                                                                zzeh.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                            } else {
                                                                try {
                                                                    strGroup5 = matcher4.group(1);
                                                                    if (strGroup5 != null) {
                                                                        throw r47;
                                                                    }
                                                                    String str23 = strGroup5;
                                                                    i6 = Integer.parseInt(strGroup5);
                                                                    strGroup6 = matcher4.group(2);
                                                                    if (strGroup6 != null) {
                                                                        throw r47;
                                                                    }
                                                                    String str24 = strGroup6;
                                                                    int i16 = Integer.parseInt(strGroup6);
                                                                    float f9 = i6 / r18.zza;
                                                                    f = i16 / r18.zzb;
                                                                    f2 = f9;
                                                                } catch (NumberFormatException unused6) {
                                                                    zzeh.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                                }
                                                            }
                                                        }
                                                        zzaotVar = r47;
                                                    } else {
                                                        str6 = str17;
                                                        map2 = map4;
                                                        str7 = str18;
                                                        f = 0.0f;
                                                        f2 = 0.0f;
                                                    }
                                                    strZzc2 = zzfv.zzc(xmlPullParserNewPullParser, "extent");
                                                    if (strZzc2 == null && (strZzc5 = zzfv.zzc(xmlPullParserNewPullParser, "style")) != null && (zzaovVar = (zzaov) map3.get(strZzc5)) != null) {
                                                        strZzc2 = zzaovVar.zzN();
                                                    }
                                                    if (strZzc2 != null) {
                                                        matcher = zzb.matcher(strZzc2);
                                                        matcher2 = zzf.matcher(strZzc2);
                                                        if (matcher.matches()) {
                                                            try {
                                                                strGroup3 = matcher.group(1);
                                                                if (strGroup3 != null) {
                                                                    throw r47;
                                                                }
                                                                String str25 = strGroup3;
                                                                f6 = Float.parseFloat(strGroup3) / 100.0f;
                                                                strGroup4 = matcher.group(2);
                                                                if (strGroup4 != null) {
                                                                    throw r47;
                                                                }
                                                                String str26 = strGroup4;
                                                                f3 = f6;
                                                                f4 = Float.parseFloat(strGroup4) / 100.0f;
                                                            } catch (NumberFormatException unused7) {
                                                                String.valueOf(strZzL);
                                                                zzeh.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                zzaotVar = r47;
                                                            }
                                                        } else {
                                                            if (matcher2.matches()) {
                                                                String.valueOf(strZzL);
                                                                zzeh.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                            } else if (r18 == 0) {
                                                                String.valueOf(strZzL);
                                                                zzeh.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                            } else {
                                                                try {
                                                                    strGroup = matcher2.group(1);
                                                                    if (strGroup != null) {
                                                                        throw r47;
                                                                    }
                                                                    String str27 = strGroup;
                                                                    i5 = Integer.parseInt(strGroup);
                                                                    strGroup2 = matcher2.group(2);
                                                                    if (strGroup2 != null) {
                                                                        throw r47;
                                                                    }
                                                                    String str28 = strGroup2;
                                                                    int i17 = Integer.parseInt(strGroup2);
                                                                    float f10 = i5 / r18.zza;
                                                                    f4 = i17 / r18.zzb;
                                                                    f3 = f10;
                                                                } catch (NumberFormatException unused8) {
                                                                    String.valueOf(strZzL);
                                                                    zzeh.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                    zzaotVar = r47;
                                                                }
                                                            }
                                                            zzaotVar = r47;
                                                        }
                                                    } else {
                                                        f3 = 1.0f;
                                                        f4 = 1.0f;
                                                    }
                                                    strZzc3 = zzfv.zzc(xmlPullParserNewPullParser, "displayAlign");
                                                    if (strZzc3 != null) {
                                                        strZza2 = zzgsz.zza(strZzc3);
                                                        iHashCode2 = strZza2.hashCode();
                                                        if (iHashCode2 != -1364013995) {
                                                            if (iHashCode2 != 92734940 && strZza2.equals("after")) {
                                                                f5 = f + f4;
                                                                i3 = 2;
                                                            } else {
                                                                i3 = 0;
                                                                f5 = f;
                                                            }
                                                        } else if (strZza2.equals("center")) {
                                                            f5 = f + (f4 / 2.0f);
                                                            i3 = 1;
                                                        } else {
                                                            i3 = 0;
                                                            f5 = f;
                                                        }
                                                    } else {
                                                        i3 = 0;
                                                        f5 = f;
                                                    }
                                                    float f11 = 1.0f / i8;
                                                    strZzc4 = zzfv.zzc(xmlPullParserNewPullParser, "writingMode");
                                                    if (strZzc4 != null) {
                                                        strZza = zzgsz.zza(strZzc4);
                                                        iHashCode = strZza.hashCode();
                                                        if (iHashCode != 3694) {
                                                            if (iHashCode != 3553396) {
                                                                if (iHashCode == 3553576 && strZza.equals("tbrl")) {
                                                                    i4 = 1;
                                                                }
                                                            } else if (strZza.equals("tblr")) {
                                                                i4 = 2;
                                                            }
                                                            i4 = Integer.MIN_VALUE;
                                                        } else if (strZza.equals("tb")) {
                                                            i4 = 2;
                                                        } else {
                                                            i4 = Integer.MIN_VALUE;
                                                        }
                                                    } else {
                                                        i4 = Integer.MIN_VALUE;
                                                    }
                                                    zzaotVar = new zzaot(strZzc8, f2, f5, 0, i3, f3, f4, 1, f11, i4);
                                                } else {
                                                    str5 = strZzc9;
                                                }
                                                strZzL = str5;
                                                if (strZzL != null) {
                                                    str6 = str17;
                                                    matcher3 = zzb.matcher(strZzL);
                                                    str7 = str18;
                                                    matcher4 = zzf.matcher(strZzL);
                                                    if (matcher3.matches()) {
                                                        map2 = map4;
                                                        strGroup7 = matcher3.group(1);
                                                        if (strGroup7 != null) {
                                                            throw r47;
                                                        }
                                                        String str29 = strGroup7;
                                                        f7 = Float.parseFloat(strGroup7) / 100.0f;
                                                        strGroup8 = matcher3.group(2);
                                                        if (strGroup8 != null) {
                                                            throw r47;
                                                        }
                                                        String str210 = strGroup8;
                                                        f = Float.parseFloat(strGroup8) / 100.0f;
                                                        f2 = f7;
                                                    } else {
                                                        map2 = map4;
                                                        if (matcher4.matches()) {
                                                            zzeh.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                        } else if (r18 == 0) {
                                                            zzeh.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                        } else {
                                                            strGroup5 = matcher4.group(1);
                                                            if (strGroup5 != null) {
                                                                throw r47;
                                                            }
                                                            String str211 = strGroup5;
                                                            i6 = Integer.parseInt(strGroup5);
                                                            strGroup6 = matcher4.group(2);
                                                            if (strGroup6 != null) {
                                                                throw r47;
                                                            }
                                                            String str212 = strGroup6;
                                                            int i18 = Integer.parseInt(strGroup6);
                                                            float f12 = i6 / r18.zza;
                                                            f = i18 / r18.zzb;
                                                            f2 = f12;
                                                        }
                                                    }
                                                    zzaotVar = r47;
                                                } else {
                                                    str6 = str17;
                                                    map2 = map4;
                                                    str7 = str18;
                                                    f = 0.0f;
                                                    f2 = 0.0f;
                                                }
                                                strZzc2 = zzfv.zzc(xmlPullParserNewPullParser, "extent");
                                                if (strZzc2 == null) {
                                                    strZzc2 = zzaovVar.zzN();
                                                }
                                                if (strZzc2 != null) {
                                                    matcher = zzb.matcher(strZzc2);
                                                    matcher2 = zzf.matcher(strZzc2);
                                                    if (matcher.matches()) {
                                                        strGroup3 = matcher.group(1);
                                                        if (strGroup3 != null) {
                                                            throw r47;
                                                        }
                                                        String str213 = strGroup3;
                                                        f6 = Float.parseFloat(strGroup3) / 100.0f;
                                                        strGroup4 = matcher.group(2);
                                                        if (strGroup4 != null) {
                                                            throw r47;
                                                        }
                                                        String str214 = strGroup4;
                                                        f3 = f6;
                                                        f4 = Float.parseFloat(strGroup4) / 100.0f;
                                                    } else {
                                                        if (matcher2.matches()) {
                                                            String.valueOf(strZzL);
                                                            zzeh.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                        } else if (r18 == 0) {
                                                            String.valueOf(strZzL);
                                                            zzeh.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                        } else {
                                                            strGroup = matcher2.group(1);
                                                            if (strGroup != null) {
                                                                throw r47;
                                                            }
                                                            String str215 = strGroup;
                                                            i5 = Integer.parseInt(strGroup);
                                                            strGroup2 = matcher2.group(2);
                                                            if (strGroup2 != null) {
                                                                throw r47;
                                                            }
                                                            String str216 = strGroup2;
                                                            int i19 = Integer.parseInt(strGroup2);
                                                            float f13 = i5 / r18.zza;
                                                            f4 = i19 / r18.zzb;
                                                            f3 = f13;
                                                        }
                                                        zzaotVar = r47;
                                                    }
                                                } else {
                                                    f3 = 1.0f;
                                                    f4 = 1.0f;
                                                }
                                                strZzc3 = zzfv.zzc(xmlPullParserNewPullParser, "displayAlign");
                                                if (strZzc3 != null) {
                                                    strZza2 = zzgsz.zza(strZzc3);
                                                    iHashCode2 = strZza2.hashCode();
                                                    if (iHashCode2 != -1364013995) {
                                                        if (iHashCode2 != 92734940) {
                                                            i3 = 0;
                                                            f5 = f;
                                                        } else {
                                                            f5 = f + f4;
                                                            i3 = 2;
                                                        }
                                                    } else if (strZza2.equals("center")) {
                                                        f5 = f + (f4 / 2.0f);
                                                        i3 = 1;
                                                    } else {
                                                        i3 = 0;
                                                        f5 = f;
                                                    }
                                                } else {
                                                    i3 = 0;
                                                    f5 = f;
                                                }
                                                float f14 = 1.0f / i8;
                                                strZzc4 = zzfv.zzc(xmlPullParserNewPullParser, "writingMode");
                                                if (strZzc4 != null) {
                                                    strZza = zzgsz.zza(strZzc4);
                                                    iHashCode = strZza.hashCode();
                                                    if (iHashCode != 3694) {
                                                        if (iHashCode != 3553396) {
                                                            if (iHashCode == 3553576) {
                                                                i4 = 1;
                                                            }
                                                        } else if (strZza.equals("tblr")) {
                                                            i4 = 2;
                                                        }
                                                        i4 = Integer.MIN_VALUE;
                                                    } else if (strZza.equals("tb")) {
                                                        i4 = 2;
                                                    } else {
                                                        i4 = Integer.MIN_VALUE;
                                                    }
                                                } else {
                                                    i4 = Integer.MIN_VALUE;
                                                }
                                                zzaotVar = new zzaot(strZzc8, f2, f5, 0, i3, f3, f4, 1, f14, i4);
                                            }
                                            if (zzaotVar != 0) {
                                                map4 = map2;
                                                map4.put(zzaotVar.zza, zzaotVar);
                                            } else {
                                                map4 = map2;
                                            }
                                            str8 = str20;
                                            map = map6;
                                            str17 = str6;
                                            str3 = str7;
                                        } else {
                                            String str30 = str17;
                                            HashMap map7 = map5;
                                            str3 = str18;
                                            str4 = str19;
                                            if (zzfv.zzb(xmlPullParserNewPullParser, str3)) {
                                                while (true) {
                                                    xmlPullParserNewPullParser.next();
                                                    str17 = str30;
                                                    if (!zzfv.zzb(xmlPullParserNewPullParser, str17) || (strZzc = zzfv.zzc(xmlPullParserNewPullParser, "id")) == null) {
                                                        map = map7;
                                                    } else {
                                                        map = map7;
                                                        map.put(strZzc, xmlPullParserNewPullParser.nextText());
                                                    }
                                                    if (!zzfv.zza(xmlPullParserNewPullParser, str3)) {
                                                        str30 = str17;
                                                        map7 = map;
                                                    }
                                                }
                                            } else {
                                                map = map7;
                                                str17 = str30;
                                            }
                                        }
                                        if (zzfv.zza(xmlPullParserNewPullParser, str8)) {
                                            zzaoqVar2 = zzaoqVar4;
                                            arrayDeque = arrayDeque2;
                                        } else {
                                            str18 = str3;
                                            map5 = map;
                                            str19 = str4;
                                            str20 = str8;
                                            str11 = str11;
                                        }
                                    }
                                    str8 = str20;
                                    if (zzfv.zza(xmlPullParserNewPullParser, str8)) {
                                        zzaoqVar2 = zzaoqVar4;
                                        arrayDeque = arrayDeque2;
                                    } else {
                                        str18 = str3;
                                        map5 = map;
                                        str19 = str4;
                                        str20 = str8;
                                        str11 = str11;
                                    }
                                }
                            } else {
                                str11 = str11;
                                map = map5;
                                Object obj3 = "region";
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    zzaov zzaovVarZzd2 = zzd(xmlPullParserNewPullParser, r47);
                                    int i20 = 0;
                                    String str31 = str;
                                    long jZzg = -9223372036854775807L;
                                    long jZzg2 = -9223372036854775807L;
                                    long jZzg3 = -9223372036854775807L;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    while (i20 < attributeCount) {
                                        String attributeName = xmlPullParserNewPullParser.getAttributeName(i20);
                                        String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i20);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                zzaoqVar2 = zzaoqVar4;
                                                obj = obj3;
                                                if (attributeName.equals(obj) && map4.containsKey(attributeValue6)) {
                                                    str31 = attributeValue6;
                                                }
                                                try {
                                                    i20++;
                                                    obj3 = obj;
                                                    zzaoqVar4 = zzaoqVar2;
                                                } catch (zzano e) {
                                                    e = e;
                                                    arrayDeque = arrayDeque2;
                                                    zzeh.zzd("TtmlParser", "Suppressing parser error", e);
                                                    zzaoqVar4 = zzaoqVar2;
                                                    i7 = 1;
                                                    xmlPullParserNewPullParser.next();
                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                    arrayDeque2 = arrayDeque;
                                                    map5 = map;
                                                    str9 = str;
                                                    zzaoqVar3 = zzaoqVar;
                                                    str10 = str2;
                                                    str11 = str11;
                                                    obj2 = null;
                                                    r18 = r18;
                                                }
                                                break;
                                            case 99841:
                                                zzaoqVar2 = zzaoqVar4;
                                                if (attributeName.equals("dur")) {
                                                    jZzg3 = zzg(attributeValue6, zzaoqVar2);
                                                }
                                                obj = obj3;
                                                i20++;
                                                obj3 = obj;
                                                zzaoqVar4 = zzaoqVar2;
                                                break;
                                            case 100571:
                                                zzaoqVar2 = zzaoqVar4;
                                                if (attributeName.equals("end")) {
                                                    jZzg = zzg(attributeValue6, zzaoqVar2);
                                                }
                                                obj = obj3;
                                                i20++;
                                                obj3 = obj;
                                                zzaoqVar4 = zzaoqVar2;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    zzaoqVar2 = zzaoqVar4;
                                                    jZzg2 = zzg(attributeValue6, zzaoqVar2);
                                                } else {
                                                    zzaoqVar2 = zzaoqVar4;
                                                }
                                                obj = obj3;
                                                i20++;
                                                obj3 = obj;
                                                zzaoqVar4 = zzaoqVar2;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals("style")) {
                                                    String[] strArrZzc2 = zzc(attributeValue6);
                                                    if (strArrZzc2.length > 0) {
                                                        strArr = strArrZzc2;
                                                    }
                                                }
                                                zzaoqVar2 = zzaoqVar4;
                                                obj = obj3;
                                                i20++;
                                                obj3 = obj;
                                                zzaoqVar4 = zzaoqVar2;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            strSubstring = attributeValue6.substring(1);
                                                        }
                                                    } catch (zzano e2) {
                                                        e = e2;
                                                        zzaoqVar2 = zzaoqVar4;
                                                        arrayDeque = arrayDeque2;
                                                        zzeh.zzd("TtmlParser", "Suppressing parser error", e);
                                                        zzaoqVar4 = zzaoqVar2;
                                                        i7 = 1;
                                                        xmlPullParserNewPullParser.next();
                                                        eventType = xmlPullParserNewPullParser.getEventType();
                                                        arrayDeque2 = arrayDeque;
                                                        map5 = map;
                                                        str9 = str;
                                                        zzaoqVar3 = zzaoqVar;
                                                        str10 = str2;
                                                        str11 = str11;
                                                        obj2 = null;
                                                        r18 = r18;
                                                    }
                                                }
                                                zzaoqVar2 = zzaoqVar4;
                                                obj = obj3;
                                                i20++;
                                                obj3 = obj;
                                                zzaoqVar4 = zzaoqVar2;
                                                break;
                                            default:
                                                zzaoqVar2 = zzaoqVar4;
                                                obj = obj3;
                                                i20++;
                                                obj3 = obj;
                                                zzaoqVar4 = zzaoqVar2;
                                                break;
                                        }
                                    }
                                    zzaoqVar2 = zzaoqVar4;
                                    if (zzaopVar3 != null) {
                                        zzaopVar = zzaopVar3;
                                        long j2 = zzaopVar.zzd;
                                        if (j2 == -9223372036854775807L) {
                                            zzaopVar2 = zzaopVar;
                                        } else {
                                            jZzg2 = jZzg2 != -9223372036854775807L ? jZzg2 + j2 : -9223372036854775807L;
                                            if (jZzg != -9223372036854775807L) {
                                                jZzg += j2;
                                                zzaopVar2 = zzaopVar;
                                            } else {
                                                zzaopVar2 = zzaopVar;
                                                jZzg = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        zzaopVar = zzaopVar3;
                                        zzaopVar2 = null;
                                    }
                                    if (jZzg != -9223372036854775807L) {
                                        j = jZzg;
                                    } else {
                                        if (jZzg3 != -9223372036854775807L) {
                                            jZzg = jZzg2 + jZzg3;
                                        } else {
                                            if (zzaopVar2 != null) {
                                                jZzg = zzaopVar2.zze;
                                                if (jZzg != -9223372036854775807L) {
                                                }
                                            }
                                            j = -9223372036854775807L;
                                        }
                                        j = jZzg;
                                    }
                                    zzaop zzaopVarZzb = zzaop.zzb(xmlPullParserNewPullParser.getName(), jZzg2, j, zzaovVarZzd2, strArr, str31, strSubstring, zzaopVar2);
                                    arrayDeque = arrayDeque2;
                                    try {
                                        arrayDeque.push(zzaopVarZzb);
                                        if (zzaopVar != null) {
                                            zzaopVar.zzd(zzaopVarZzb);
                                        }
                                    } catch (zzano e3) {
                                        e = e3;
                                        zzeh.zzd("TtmlParser", "Suppressing parser error", e);
                                        zzaoqVar4 = zzaoqVar2;
                                        i7 = 1;
                                    }
                                } catch (zzano e4) {
                                    e = e4;
                                }
                            }
                            zzaoqVar4 = zzaoqVar2;
                            r17 = r18;
                            i8 = i8;
                        } else {
                            String name2 = xmlPullParserNewPullParser.getName();
                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                            sb.append(str11);
                            sb.append(name2);
                            zzeh.zzb("TtmlParser", sb.toString());
                            str11 = str11;
                            map = map5;
                            arrayDeque = arrayDeque2;
                        }
                        i7 = 1;
                    } else {
                        str2 = str10;
                        str11 = str11;
                        arrayDeque = arrayDeque2;
                        zzaoqVar = zzaoqVar3;
                        zzaowVar = zzaowVar;
                        i7 = i7;
                        map = map5;
                        if (eventType != 4) {
                            r17 = r18;
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                    zzaop zzaopVar4 = (zzaop) arrayDeque.peek();
                                    if (zzaopVar4 == null) {
                                        throw null;
                                    }
                                    zzaowVar = new zzaow(zzaopVar4, map3, map4, map);
                                } else {
                                    zzaowVar = zzaowVar;
                                }
                                arrayDeque.pop();
                                r18 = r18;
                            }
                            i7 = i7;
                        } else {
                            if (zzaopVar3 == null) {
                                throw null;
                            }
                            zzaopVar3.zzd(zzaop.zza(xmlPullParserNewPullParser.getText()));
                            r17 = r18;
                        }
                    }
                    zzaowVar = zzaowVar;
                    r18 = r17;
                    i7 = i7;
                } else {
                    str = str9;
                    str2 = str10;
                    str11 = str11;
                    map = map5;
                    arrayDeque = arrayDeque2;
                    zzaoqVar = zzaoqVar3;
                    zzaowVar = zzaowVar;
                    i7 = i7;
                    if (eventType == 2) {
                        i7++;
                    } else {
                        r17 = r18;
                        if (eventType == 3) {
                            i7--;
                        }
                        zzaowVar = zzaowVar;
                        r18 = r17;
                        i7 = i7;
                    }
                    zzaowVar = zzaowVar;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                arrayDeque2 = arrayDeque;
                map5 = map;
                str9 = str;
                zzaoqVar3 = zzaoqVar;
                str10 = str2;
                str11 = str11;
                obj2 = null;
                r18 = r18;
            }
            zzaow zzaowVar2 = zzaowVar;
            if (zzaowVar2 != null) {
                return zzaowVar2;
            }
            throw null;
        } catch (IOException e5) {
            throw new IllegalStateException("Unexpected error when reading input.", e5);
        } catch (XmlPullParserException e6) {
            throw new IllegalStateException("Unable to decode source", e6);
        }
    }

    public zzaos() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
