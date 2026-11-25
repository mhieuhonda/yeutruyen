package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapj {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(map2);
    }

    public static zzapd zza(zzeu zzeuVar, List list) {
        String strZzN = zzeuVar.zzN(StandardCharsets.UTF_8);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzeuVar, list);
            }
            String strZzN2 = zzeuVar.zzN(StandardCharsets.UTF_8);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzeuVar, list);
                }
            }
        }
        return null;
    }

    static zzcx zzb(String str) {
        zzapi zzapiVar = new zzapi();
        zze(str, zzapiVar);
        return zzapiVar.zza();
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01bb  */
    static SpannedString zzc(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            int length = i + 1;
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, length);
                int iIndexOf2 = str2.indexOf(32, length);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(length, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    spannableStringBuilder.append(' ');
                                } else {
                                    StringBuilder sb = new StringBuilder(String.valueOf(strSubstring).length() + 33);
                                    sb.append("ignoring unsupported entity: '&");
                                    sb.append(strSubstring);
                                    sb.append(";'");
                                    zzeh.zzc("WebvttCueParser", sb.toString());
                                }
                            } else if (strSubstring.equals("amp")) {
                                spannableStringBuilder.append(Typography.amp);
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + 33);
                                sb2.append("ignoring unsupported entity: '&");
                                sb2.append(strSubstring);
                                sb2.append(";'");
                                zzeh.zzc("WebvttCueParser", sb2.toString());
                            }
                        } else if (strSubstring.equals("lt")) {
                            spannableStringBuilder.append(Typography.less);
                        } else {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(strSubstring).length() + 33);
                            sb3.append("ignoring unsupported entity: '&");
                            sb3.append(strSubstring);
                            sb3.append(";'");
                            zzeh.zzc("WebvttCueParser", sb3.toString());
                        }
                    } else if (strSubstring.equals("gt")) {
                        spannableStringBuilder.append(Typography.greater);
                    } else {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(strSubstring).length() + 33);
                        sb4.append("ignoring unsupported entity: '&");
                        sb4.append(strSubstring);
                        sb4.append(";'");
                        zzeh.zzc("WebvttCueParser", sb4.toString());
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (length < str2.length()) {
                char cCharAt2 = str2.charAt(length);
                int iIndexOf3 = str2.indexOf(62, length);
                length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i2 = length - 2;
                boolean z = str2.charAt(i2) == '/';
                int i3 = i + (cCharAt2 == '/' ? 2 : 1);
                if (!z) {
                    i2 = length - 1;
                }
                String strSubstring2 = str2.substring(i3, i2);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    zzgtr.zza(true ^ strTrim.isEmpty());
                    String str3 = zzfm.zza;
                    String str4 = strTrim.split("[ \\.]", 2)[0];
                    int iHashCode2 = str4.hashCode();
                    if (iHashCode2 == 98 ? str4.equals("b") : !(iHashCode2 == 99 ? !str4.equals("c") : iHashCode2 == 105 ? !str4.equals("i") : iHashCode2 == 3650 ? !str4.equals("rt") : iHashCode2 == 3314158 ? !str4.equals("lang") : iHashCode2 == 3511770 ? !str4.equals("ruby") : iHashCode2 == 117 ? !str4.equals("u") : iHashCode2 != 118 || !str4.equals("v"))) {
                        if (cCharAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                zzapg zzapgVar = (zzapg) arrayDeque.pop();
                                zzf(str, zzapgVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new zzapf(zzapgVar, spannableStringBuilder.length(), null));
                                }
                                if (zzapgVar.zza.equals(str4)) {
                                    break;
                                }
                            }
                        } else if (!z) {
                            arrayDeque.push(zzapg.zza(strSubstring2, spannableStringBuilder.length()));
                        }
                    }
                }
            }
            i = length;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (zzapg) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, zzapg.zzb(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static zzapd zzd(String str, Matcher matcher, zzeu zzeuVar, List list) {
        zzapi zzapiVar = new zzapi();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            String str2 = strGroup;
            zzapiVar.zza = zzapl.zza(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            String str3 = strGroup2;
            zzapiVar.zzb = zzapl.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzapiVar);
            StringBuilder sb = new StringBuilder();
            String strZzN = zzeuVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strZzN.trim());
                strZzN = zzeuVar.zzN(StandardCharsets.UTF_8);
            }
            zzapiVar.zzc = zzc(str, sb.toString(), list);
            return new zzapd(zzapiVar.zza().zzr(), zzapiVar.zza, zzapiVar.zzb);
        } catch (IllegalArgumentException unused) {
            String strGroup4 = matcher.group();
            String.valueOf(strGroup4);
            zzeh.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(strGroup4)));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: NumberFormatException -> 0x01d2, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01d2, blocks: (B:6:0x002c, B:9:0x0042, B:11:0x004a, B:33:0x008f, B:32:0x0087, B:34:0x0093, B:36:0x009b, B:38:0x00a3, B:39:0x00ab, B:41:0x00b3, B:54:0x00df, B:53:0x00d6, B:55:0x00e3, B:56:0x0108, B:58:0x010e, B:80:0x015d, B:79:0x014d, B:81:0x0163, B:82:0x016b, B:84:0x0171, B:100:0x01ae, B:99:0x019e, B:101:0x01b4, B:103:0x01bc, B:104:0x01c6), top: B:108:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6 A[Catch: NumberFormatException -> 0x01d2, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01d2, blocks: (B:6:0x002c, B:9:0x0042, B:11:0x004a, B:33:0x008f, B:32:0x0087, B:34:0x0093, B:36:0x009b, B:38:0x00a3, B:39:0x00ab, B:41:0x00b3, B:54:0x00df, B:53:0x00d6, B:55:0x00e3, B:56:0x0108, B:58:0x010e, B:80:0x015d, B:79:0x014d, B:81:0x0163, B:82:0x016b, B:84:0x0171, B:100:0x01ae, B:99:0x019e, B:101:0x01b4, B:103:0x01bc, B:104:0x01c6), top: B:108:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x0141  */
    /* JADX WARN: Code duplicated, block: B:78:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x014d A[Catch: NumberFormatException -> 0x01d2, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01d2, blocks: (B:6:0x002c, B:9:0x0042, B:11:0x004a, B:33:0x008f, B:32:0x0087, B:34:0x0093, B:36:0x009b, B:38:0x00a3, B:39:0x00ab, B:41:0x00b3, B:54:0x00df, B:53:0x00d6, B:55:0x00e3, B:56:0x0108, B:58:0x010e, B:80:0x015d, B:79:0x014d, B:81:0x0163, B:82:0x016b, B:84:0x0171, B:100:0x01ae, B:99:0x019e, B:101:0x01b4, B:103:0x01bc, B:104:0x01c6), top: B:108:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:98:0x019c  */
    /* JADX WARN: Code duplicated, block: B:99:0x019e A[Catch: NumberFormatException -> 0x01d2, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01d2, blocks: (B:6:0x002c, B:9:0x0042, B:11:0x004a, B:33:0x008f, B:32:0x0087, B:34:0x0093, B:36:0x009b, B:38:0x00a3, B:39:0x00ab, B:41:0x00b3, B:54:0x00df, B:53:0x00d6, B:55:0x00e3, B:56:0x0108, B:58:0x010e, B:80:0x015d, B:79:0x014d, B:81:0x0163, B:82:0x016b, B:84:0x0171, B:100:0x01ae, B:99:0x019e, B:101:0x01b4, B:103:0x01bc, B:104:0x01c6), top: B:108:0x002c }] */
    private static void zze(String str, zzapi zzapiVar) {
        int i;
        int i2;
        int i3;
        int i4;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring) {
                            case "center":
                            case "middle":
                                i4 = 1;
                                break;
                            case "end":
                                i4 = 2;
                                break;
                            case "start":
                                i4 = 0;
                                break;
                            default:
                                String.valueOf(strSubstring);
                                zzeh.zzc("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(strSubstring)));
                                i4 = Integer.MIN_VALUE;
                                break;
                        }
                        zzapiVar.zzg = i4;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzapiVar.zze = zzapl.zzb(strGroup2);
                        zzapiVar.zzf = 0;
                    } else {
                        zzapiVar.zze = Integer.parseInt(strGroup2);
                        zzapiVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            if (!strGroup2.equals("center")) {
                                zzeh.zzc("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            }
                            i = 2;
                            break;
                        case "end":
                            i = 3;
                            break;
                        case "left":
                            i = 4;
                            break;
                        case "right":
                            i = 5;
                            break;
                        case "start":
                            i = 1;
                            break;
                        default:
                            zzeh.zzc("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                    }
                    zzapiVar.zzd = i;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2) {
                            case "line-left":
                                i3 = 0;
                                break;
                            case "center":
                                i3 = 1;
                                break;
                            case "line-right":
                                i3 = 2;
                                break;
                            case "middle":
                                i3 = 1;
                                break;
                            case "end":
                                i3 = 2;
                                break;
                            case "start":
                                i3 = 0;
                                break;
                            default:
                                String.valueOf(strSubstring2);
                                zzeh.zzc("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(strSubstring2)));
                                i3 = Integer.MIN_VALUE;
                                break;
                        }
                        zzapiVar.zzi = i3;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzapiVar.zzh = zzapl.zzb(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzapiVar.zzj = zzapl.zzb(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            i2 = 1;
                        } else {
                            zzeh.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (strGroup2.equals("lr")) {
                        i2 = 2;
                    } else {
                        zzeh.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                        i2 = Integer.MIN_VALUE;
                    }
                    zzapiVar.zzk = i2;
                } else {
                    StringBuilder sb = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(strGroup);
                    sb.append(":");
                    sb.append(strGroup2);
                    zzeh.zzc("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String strGroup3 = matcher.group();
                String.valueOf(strGroup3);
                zzeh.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(strGroup3)));
            }
        }
    }

    private static void zzf(String str, zzapg zzapgVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = zzapgVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzapgVar.zza;
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iZzg = zzg(list2, str, zzapgVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, zzapf.zza);
                        int i3 = i;
                        int i4 = 0;
                        int length2 = 0;
                        while (i4 < arrayList.size()) {
                            if ("rt".equals(((zzapf) arrayList.get(i4)).zzc().zza)) {
                                zzapf zzapfVar = (zzapf) arrayList.get(i4);
                                int iZzg2 = zzg(list2, str, zzapfVar.zzc());
                                if (iZzg2 == i2) {
                                    iZzg2 = iZzg != i2 ? iZzg : 1;
                                }
                                int i5 = zzapfVar.zzc().zzb - length2;
                                int iZzd = zzapfVar.zzd() - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, iZzd);
                                spannableStringBuilder.delete(i5, iZzd);
                                spannableStringBuilder.setSpan(new zzdd(charSequenceSubSequence.toString(), iZzg2), i3, i5, 33);
                                length2 += charSequenceSubSequence.length();
                                i3 = i5;
                            }
                            i4++;
                            i2 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : zzapgVar.zzd) {
                                Map map = zzc;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                                } else {
                                    Map map2 = zzd;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new zzdg(zzapgVar.zzc), i, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List listZzh = zzh(list2, str, zzapgVar);
        for (int i6 = 0; i6 < listZzh.size(); i6++) {
            zzapc zzapcVar = ((zzaph) listZzh.get(i6)).zzb;
            if (zzapcVar != null) {
                if (zzapcVar.zzf() != -1) {
                    zzde.zza(spannableStringBuilder, new StyleSpan(zzapcVar.zzf()), i, length, 33);
                }
                if (zzapcVar.zzg()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (zzapcVar.zzo()) {
                    zzde.zza(spannableStringBuilder, new ForegroundColorSpan(zzapcVar.zzm()), i, length, 33);
                }
                if (zzapcVar.zzr()) {
                    zzde.zza(spannableStringBuilder, new BackgroundColorSpan(zzapcVar.zzp()), i, length, 33);
                }
                if (zzapcVar.zzk() != null) {
                    zzde.zza(spannableStringBuilder, new TypefaceSpan(zzapcVar.zzk()), i, length, 33);
                }
                int iZzu = zzapcVar.zzu();
                if (iZzu == 1) {
                    zzde.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzapcVar.zzv(), true), i, length, 33);
                } else if (iZzu == 2) {
                    zzde.zza(spannableStringBuilder, new RelativeSizeSpan(zzapcVar.zzv()), i, length, 33);
                } else if (iZzu == 3) {
                    zzde.zza(spannableStringBuilder, new RelativeSizeSpan(zzapcVar.zzv() / 100.0f), i, length, 33);
                }
                if (zzapcVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzdc(), i, length, 33);
                }
            }
        }
    }

    private static int zzg(List list, String str, zzapg zzapgVar) {
        List listZzh = zzh(list, str, zzapgVar);
        for (int i = 0; i < listZzh.size(); i++) {
            zzapc zzapcVar = ((zzaph) listZzh.get(i)).zzb;
            if (zzapcVar.zzx() != -1) {
                return zzapcVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, String str, zzapg zzapgVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzapc zzapcVar = (zzapc) list.get(i);
            int iZze = zzapcVar.zze(str, zzapgVar.zza, zzapgVar.zzd, zzapgVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzaph(iZze, zzapcVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
