package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaix {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzaiw zza(String str) throws IOException {
        long j;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!zzfv.zzb(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzat.zzb("Couldn't find xmp metadata", null);
            }
            zzgwt zzgwtVarZzi = zzgwt.zzi();
            long j2 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (zzfv.zzb(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String strZzc = zzfv.zzc(xmlPullParserNewPullParser, strArr[i2]);
                        if (strZzc != null) {
                            if (Integer.parseInt(strZzc) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    String strZzc2 = zzfv.zzc(xmlPullParserNewPullParser, strArr2[i3]);
                                    if (strZzc2 != null) {
                                        j = Long.parseLong(strZzc2);
                                        if (j != -1) {
                                            break;
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                break;
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i >= 2) {
                                    zzgwtVarZzi = zzgwt.zzi();
                                    break;
                                }
                                String strZzc3 = zzfv.zzc(xmlPullParserNewPullParser, strArr3[i]);
                                if (strZzc3 != null) {
                                    zzgwtVarZzi = zzgwt.zzk(new zzaiv("image/jpeg", "Primary", 0L, 0L), new zzaiv("video/mp4", "MotionPhoto", Long.parseLong(strZzc3), 0L));
                                    break;
                                }
                                i++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (zzfv.zzb(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzgwtVarZzi = zzc(xmlPullParserNewPullParser, "Container", "Item");
                } else if (zzfv.zzb(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzgwtVarZzi = zzc(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzfv.zza(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzgwtVarZzi.isEmpty()) {
                return null;
            }
            return new zzaiw(j2, zzgwtVarZzi);
        } catch (zzat | NumberFormatException | XmlPullParserException unused) {
            zzeh.zzc("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static boolean zzb(String str) {
        if (str == null) {
            return false;
        }
        String[] strArr = zza;
        for (int i = 0; i < 4; i++) {
            String str2 = strArr[i];
            String.valueOf(str2);
            if (str.contains(String.valueOf(str2).concat("=\"1\""))) {
                return true;
            }
        }
        return false;
    }

    private static zzgwt zzc(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = zzgwt.zzd;
        zzgwq zzgwqVar = new zzgwq();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfv.zzb(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZzc = zzfv.zzc(xmlPullParser, strConcat2);
                String strZzc2 = zzfv.zzc(xmlPullParser, strConcat3);
                String strZzc3 = zzfv.zzc(xmlPullParser, strConcat4);
                String strZzc4 = zzfv.zzc(xmlPullParser, strConcat5);
                if (strZzc == null || strZzc2 == null) {
                    return zzgwt.zzi();
                }
                zzgwqVar.zzf(new zzaiv(strZzc, strZzc2, strZzc3 != null ? Long.parseLong(strZzc3) : 0L, strZzc4 != null ? Long.parseLong(strZzc4) : 0L));
            }
        } while (!zzfv.zza(xmlPullParser, str.concat(":Directory")));
        return zzgwqVar.zzi();
    }
}
