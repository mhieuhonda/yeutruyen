package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.work.WorkRequest;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaoi implements zzans {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzaoh zzc;
    private final zzeu zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzaoi() {
        this(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void zzb(zzeu zzeuVar, Charset charset) {
        while (true) {
            String strZzN = zzeuVar.zzN(charset);
            if (strZzN == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZzN)) {
                while (true) {
                    String strZzN2 = zzeuVar.zzN(charset);
                    if (strZzN2 == null || (zzeuVar.zzd() != 0 && zzeuVar.zzp(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strZzN2.split(":");
                    if (strArrSplit.length == 2) {
                        String strZza = zzgsz.zza(strArrSplit[0].trim());
                        switch (strZza.hashCode()) {
                            case 1879649548:
                                if (strZza.equals("playresx")) {
                                    this.zzf = Float.parseFloat(strArrSplit[1].trim());
                                }
                                break;
                            case 1879649549:
                                if (strZza.equals("playresy")) {
                                    try {
                                        this.zzg = Float.parseFloat(strArrSplit[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                break;
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZzN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzaoj zzaojVarZza = null;
                while (true) {
                    String strZzN3 = zzeuVar.zzN(charset);
                    if (strZzN3 != null && (zzeuVar.zzd() == 0 || zzeuVar.zzp(charset) != 91)) {
                        if (strZzN3.startsWith("Format:")) {
                            zzaojVarZza = zzaoj.zza(strZzN3);
                        } else if (strZzN3.startsWith("Style:")) {
                            if (zzaojVarZza == null) {
                                zzeh.zzc("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzN3));
                            } else {
                                zzaol zzaolVarZza = zzaol.zza(strZzN3, zzaojVarZza);
                                if (zzaolVarZza != null) {
                                    linkedHashMap.put(zzaolVarZza.zza, zzaolVarZza);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strZzN)) {
                zzeh.zzb("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZzN)) {
                return;
            }
        }
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = zzfm.zza;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS);
    }

    private static float zzd(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zze(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:143:0x0316 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(byte[] bArr, int i, int i2, zzanr zzanrVar, zzdu zzduVar) {
        zzaoh zzaohVarZza;
        zzaoh zzaohVar;
        int i3;
        Layout.Alignment alignment;
        int i4;
        int i5;
        int i6;
        Integer num;
        int i7;
        zzaoi zzaoiVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzeu zzeuVar = zzaoiVar.zzd;
        zzeuVar.zzb(bArr, i + i2);
        zzeuVar.zzh(i);
        Charset charsetZzR = zzeuVar.zzR();
        if (charsetZzR == null) {
            charsetZzR = StandardCharsets.UTF_8;
        }
        if (zzaoiVar.zzb) {
            zzaohVarZza = zzaoiVar.zzc;
        } else {
            zzaoiVar.zzb(zzeuVar, charsetZzR);
            zzaohVarZza = null;
        }
        while (true) {
            String strZzN = zzeuVar.zzN(charsetZzR);
            if (strZzN == null) {
                int i8 = 0;
                while (i8 < arrayList.size()) {
                    List list = (List) arrayList.get(i8);
                    if (!list.isEmpty()) {
                        if (i8 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i8)).longValue();
                        zzduVar.zza(new zzank(list, jLongValue, ((Long) arrayList2.get(i8 + 1)).longValue() - jLongValue));
                    } else if (i8 == 0) {
                        i8 = 0;
                        if (i8 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue2 = ((Long) arrayList2.get(i8)).longValue();
                        zzduVar.zza(new zzank(list, jLongValue2, ((Long) arrayList2.get(i8 + 1)).longValue() - jLongValue2));
                    }
                    i8++;
                }
                return;
            }
            if (strZzN.startsWith("Format:")) {
                zzaohVarZza = zzaoh.zza(strZzN);
            } else {
                if (strZzN.startsWith("Dialogue:")) {
                    if (zzaohVarZza == null) {
                        zzeh.zzc("SsaParser", "Skipping dialogue line before complete format: ".concat(strZzN));
                    } else {
                        zzgtr.zza(strZzN.startsWith("Dialogue:"));
                        String strSubstring = strZzN.substring(9);
                        int i9 = zzaohVarZza.zzf;
                        String[] strArrSplit = strSubstring.split(",", i9);
                        if (strArrSplit.length != i9) {
                            zzeh.zzc("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strZzN));
                        } else {
                            int i10 = zzaohVarZza.zza;
                            if (i10 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i10].trim());
                                } catch (RuntimeException unused) {
                                    String str = strArrSplit[zzaohVarZza.zza];
                                    String.valueOf(str);
                                    zzeh.zzc("SsaParser", "Fail to parse layer: ".concat(String.valueOf(str)));
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jZzc = zzc(strArrSplit[zzaohVarZza.zzb]);
                            if (jZzc == -9223372036854775807L) {
                                zzeh.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                            } else {
                                long jZzc2 = zzc(strArrSplit[zzaohVarZza.zzc]);
                                if (jZzc2 == -9223372036854775807L || jZzc2 <= jZzc) {
                                    zzaohVar = zzaohVarZza;
                                    zzeuVar = zzeuVar;
                                    zzeh.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                                } else {
                                    Map map = zzaoiVar.zze;
                                    zzaol zzaolVar = (map == null || (i7 = zzaohVarZza.zzd) == -1) ? null : (zzaol) map.get(strArrSplit[i7].trim());
                                    String str2 = strArrSplit[zzaohVarZza.zze];
                                    zzaok zzaokVarZza = zzaok.zza(str2);
                                    String strReplace = zzaok.zzb(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f = zzaoiVar.zzf;
                                    float f2 = zzaoiVar.zzg;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    zzcx zzcxVar = new zzcx();
                                    zzcxVar.zza(spannableString);
                                    zzcxVar.zzq(i3);
                                    if (zzaolVar != null) {
                                        Integer num2 = zzaolVar.zzc;
                                        zzaohVar = zzaohVarZza;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (zzaolVar.zzj == 3 && (num = zzaolVar.zzd) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f3 = zzaolVar.zze;
                                        if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                            zzcxVar.zzl(f3 / f2, 1);
                                        }
                                        boolean z = zzaolVar.zzf;
                                        if (z && zzaolVar.zzg) {
                                            i5 = 0;
                                            i6 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i5 = 0;
                                            i6 = 33;
                                            if (z) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (zzaolVar.zzg) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (zzaolVar.zzh) {
                                            spannableString.setSpan(new UnderlineSpan(), i5, spannableString.length(), i6);
                                        }
                                        if (zzaolVar.zzi) {
                                            spannableString.setSpan(new StrikethroughSpan(), i5, spannableString.length(), i6);
                                        }
                                    } else {
                                        zzaohVar = zzaohVarZza;
                                        zzeuVar = zzeuVar;
                                        f = f;
                                    }
                                    int i11 = zzaokVarZza.zza;
                                    if (i11 == -1) {
                                        i11 = zzaolVar != null ? zzaolVar.zzb : -1;
                                    }
                                    switch (i11) {
                                        case 0:
                                        default:
                                            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 19);
                                            sb.append("Unknown alignment: ");
                                            sb.append(i11);
                                            zzeh.zzc("SsaParser", sb.toString());
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzcxVar.zzd(alignment);
                                    int i12 = Integer.MIN_VALUE;
                                    switch (i11) {
                                        case 0:
                                        default:
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 19);
                                            sb2.append("Unknown alignment: ");
                                            sb2.append(i11);
                                            zzeh.zzc("SsaParser", sb2.toString());
                                        case -1:
                                            i4 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i4 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i4 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i4 = 2;
                                            break;
                                    }
                                    zzcxVar.zzj(i4);
                                    switch (i11) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 19);
                                            sb3.append("Unknown alignment: ");
                                            sb3.append(i11);
                                            zzeh.zzc("SsaParser", sb3.toString());
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i12 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i12 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i12 = 0;
                                            break;
                                    }
                                    zzcxVar.zzg(i12);
                                    PointF pointF = zzaokVarZza.zzb;
                                    if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                        zzcxVar.zzi(zzd(zzcxVar.zzk()));
                                        zzcxVar.zzf(zzd(zzcxVar.zzh()), 0);
                                    } else {
                                        zzcxVar.zzi(pointF.x / f);
                                        zzcxVar.zzf(pointF.y / f2, 0);
                                    }
                                    zzcy zzcyVarZzr = zzcxVar.zzr();
                                    int iZze = zze(jZzc2, arrayList2, arrayList);
                                    for (int iZze2 = zze(jZzc, arrayList2, arrayList); iZze2 < iZze; iZze2++) {
                                        ((List) arrayList.get(iZze2)).add(zzcyVarZzr);
                                    }
                                }
                            }
                        }
                    }
                    zzaohVar = zzaohVarZza;
                    zzeuVar = zzeuVar;
                } else {
                    zzaohVar = zzaohVarZza;
                    zzeuVar = zzeuVar;
                }
                zzaoiVar = this;
                charsetZzR = charsetZzR;
                zzaohVarZza = zzaohVar;
                zzeuVar = zzeuVar;
            }
        }
    }

    public zzaoi(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzeu();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzj = zzfm.zzj((byte[]) list.get(0));
        zzgtr.zza(strZzj.startsWith("Format:"));
        zzaoh zzaohVarZza = zzaoh.zza(strZzj);
        zzaohVarZza.getClass();
        this.zzc = zzaohVarZza;
        zzb(new zzeu((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
