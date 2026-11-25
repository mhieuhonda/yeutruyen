package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaop {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzaov zzf;
    public final String zzg;
    public final String zzh;
    public final zzaop zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    public static zzaop zza(String str) {
        return new zzaop(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static zzaop zzb(String str, long j, long j2, zzaov zzaovVar, String[] strArr, String str2, String str3, zzaop zzaopVar) {
        return new zzaop(str, null, j, j2, zzaovVar, strArr, str2, str3, zzaopVar);
    }

    private final void zzi(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        if (z || zEquals || ("div".equals(str) && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzaop zzaopVar = (zzaop) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                zzaopVar.zzi(treeSet, z2);
            }
        }
    }

    private final void zzj(long j, String str, List list) {
        String str2;
        String str3 = this.zzg;
        boolean zEquals = "".equals(str3);
        boolean zZzc = zzc(j);
        if (true != zEquals) {
            str = str3;
        }
        if (zZzc && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zzf(); i++) {
            zze(i).zzj(j, str, list);
        }
    }

    private final void zzk(long j, boolean z, String str, Map map) {
        HashMap map2 = this.zzk;
        map2.clear();
        HashMap map3 = this.zzl;
        map3.clear();
        String str2 = this.zza;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z) {
            SpannableStringBuilder spannableStringBuilderZzl = zzl(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            spannableStringBuilderZzl.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceZzb = ((zzcx) entry.getValue()).zzb();
                charSequenceZzb.getClass();
                map2.put(str6, Integer.valueOf(charSequenceZzb.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < zzf(); i++) {
                zze(i).zzk(j, z || zEquals, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzl2 = zzl(str4, map);
                int length = spannableStringBuilderZzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzl2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzl2.charAt(length) != '\n') {
                    spannableStringBuilderZzl2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceZzb2 = ((zzcx) entry2.getValue()).zzb();
                charSequenceZzb2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceZzb2.length()));
            }
        }
    }

    private static SpannableStringBuilder zzl(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcx zzcxVar = new zzcx();
            zzcxVar.zza(new SpannableStringBuilder());
            map.put(str, zzcxVar);
        }
        CharSequence charSequenceZzb = ((zzcx) map.get(str)).zzb();
        charSequenceZzb.getClass();
        return (SpannableStringBuilder) charSequenceZzb;
    }

    private final void zzm(long j, Map map, Map map2, String str, Map map3) {
        zzaop zzaopVar;
        zzaov zzaovVarZza;
        int i;
        boolean z;
        int i2;
        Map map4 = map;
        if (zzc(j)) {
            String str2 = this.zzg;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it = this.zzl.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = (String) entry.getKey();
                HashMap map5 = this.zzk;
                int iIntValue = map5.containsKey(str4) ? ((Integer) map5.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzcx zzcxVar = (zzcx) map3.get(str4);
                    zzcxVar.getClass();
                    zzaot zzaotVar = (zzaot) map2.get(str3);
                    zzaotVar.getClass();
                    int i3 = zzaotVar.zzj;
                    zzaov zzaovVarZza2 = zzaou.zza(this.zzf, this.zzj, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcxVar.zzb();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcxVar.zza(spannableStringBuilder);
                    }
                    if (zzaovVarZza2 != null) {
                        zzaop zzaopVar2 = this.zzi;
                        if (zzaovVarZza2.zza() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzaovVarZza2.zza()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaovVarZza2.zzb()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaovVarZza2.zzd()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaovVarZza2.zzl()) {
                            zzde.zza(spannableStringBuilder, new ForegroundColorSpan(zzaovVarZza2.zzj()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaovVarZza2.zzo()) {
                            zzde.zza(spannableStringBuilder, new BackgroundColorSpan(zzaovVarZza2.zzm()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaovVarZza2.zzh() != null) {
                            zzde.zza(spannableStringBuilder, new TypefaceSpan(zzaovVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaovVarZza2.zzE() != null) {
                            zzaoo zzaooVarZzE = zzaovVarZza2.zzE();
                            zzaooVarZzE.getClass();
                            int i4 = zzaooVarZzE.zza;
                            if (i4 == -1) {
                                i4 = (i3 == 2 || i3 == 1) ? 3 : 1;
                                i2 = 1;
                            } else {
                                i2 = zzaooVarZzE.zzb;
                            }
                            int i5 = zzaooVarZzE.zzc;
                            if (i5 == -2) {
                                i5 = 1;
                            }
                            zzde.zza(spannableStringBuilder, new zzdf(i4, i2, i5), iIntValue, iIntValue2, 33);
                        }
                        int iZzv = zzaovVarZza2.zzv();
                        if (iZzv == 2) {
                            while (true) {
                                if (zzaopVar2 == null) {
                                    zzaopVar2 = null;
                                    break;
                                }
                                zzaov zzaovVarZza3 = zzaou.zza(zzaopVar2.zzf, zzaopVar2.zzj, map4);
                                if (zzaovVarZza3 != null && zzaovVarZza3.zzv() == 1) {
                                    break;
                                } else {
                                    zzaopVar2 = zzaopVar2.zzi;
                                }
                            }
                            if (zzaopVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzaopVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzaopVar = null;
                                        break;
                                    }
                                    zzaop zzaopVar3 = (zzaop) arrayDeque.pop();
                                    zzaov zzaovVarZza4 = zzaou.zza(zzaopVar3.zzf, zzaopVar3.zzj, map4);
                                    if (zzaovVarZza4 != null && zzaovVarZza4.zzv() == 3) {
                                        zzaopVar = zzaopVar3;
                                        break;
                                    }
                                    for (int iZzf = zzaopVar3.zzf() - 1; iZzf >= 0; iZzf--) {
                                        arrayDeque.push(zzaopVar3.zze(iZzf));
                                    }
                                }
                                if (zzaopVar != null) {
                                    if (zzaopVar.zzf() != 1 || zzaopVar.zze(0).zzb == null) {
                                        zzeh.zzb("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = zzaopVar.zze(0).zzb;
                                        String str6 = zzfm.zza;
                                        zzaov zzaovVarZza5 = zzaou.zza(zzaopVar.zzf, zzaopVar.zzj, map4);
                                        int iZzx = zzaovVarZza5 != null ? zzaovVarZza5.zzx() : -1;
                                        if (iZzx == -1 && (zzaovVarZza = zzaou.zza(zzaopVar2.zzf, zzaopVar2.zzj, map4)) != null) {
                                            iZzx = zzaovVarZza.zzx();
                                        }
                                        spannableStringBuilder.setSpan(new zzdd(str5, iZzx), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzv == 3 || iZzv == 4) {
                            spannableStringBuilder.setSpan(new zzaon(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaovVarZza2.zzC()) {
                            i = 33;
                            zzde.zza(spannableStringBuilder, new zzdc(), iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        int iZzI = zzaovVarZza2.zzI();
                        if (iZzI != 1) {
                            if (iZzI == 2) {
                                zzde.zza(spannableStringBuilder, new RelativeSizeSpan(zzaovVarZza2.zzJ()), iIntValue, iIntValue2, i);
                            } else if (iZzI == 3) {
                                zzde.zzb(spannableStringBuilder, zzaovVarZza2.zzJ() / 100.0f, iIntValue, iIntValue2, i);
                            }
                            z = true;
                        } else {
                            z = true;
                            zzde.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaovVarZza2.zzJ(), true), iIntValue, iIntValue2, i);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzaovVarZza2.zzq() != Float.MAX_VALUE) {
                                zzcxVar.zzp((zzaovVarZza2.zzq() * (-90.0f)) / 100.0f);
                            }
                            if (zzaovVarZza2.zzy() != null) {
                                zzcxVar.zzd(zzaovVarZza2.zzy());
                            }
                            if (zzaovVarZza2.zzA() != null) {
                                zzcxVar.zze(zzaovVarZza2.zzA());
                            }
                        }
                        it = it;
                    }
                }
            }
            int i6 = 0;
            while (i6 < zzf()) {
                zze(i6).zzm(j, map4, map2, str3, map3);
                i6++;
                map4 = map;
            }
        }
    }

    public final boolean zzc(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.zze) {
            return j2 <= j && j < this.zze;
        }
        return true;
    }

    public final void zzd(zzaop zzaopVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzaopVar);
    }

    public final zzaop zze(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzaop) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int zzf() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public final List zzh(long j, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        String str = this.zzg;
        zzj(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzk(j, false, str, treeMap);
        zzm(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzaot zzaotVar = (zzaot) map2.get(pair.first);
                zzaotVar.getClass();
                zzcx zzcxVar = new zzcx();
                zzcxVar.zzc(bitmapDecodeByteArray);
                zzcxVar.zzi(zzaotVar.zzb);
                zzcxVar.zzj(0);
                zzcxVar.zzf(zzaotVar.zzc, 0);
                zzcxVar.zzg(zzaotVar.zze);
                zzcxVar.zzm(zzaotVar.zzf);
                zzcxVar.zzn(zzaotVar.zzg);
                zzcxVar.zzo(zzaotVar.zzj);
                arrayList2.add(zzcxVar.zzr());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzaot zzaotVar2 = (zzaot) map2.get(entry.getKey());
            zzaotVar2.getClass();
            zzcx zzcxVar2 = (zzcx) entry.getValue();
            CharSequence charSequenceZzb = zzcxVar2.zzb();
            charSequenceZzb.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzb;
            for (zzaon zzaonVar : (zzaon[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzaon.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzaonVar), spannableStringBuilder.getSpanEnd(zzaonVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcxVar2.zzf(zzaotVar2.zzc, zzaotVar2.zzd);
            zzcxVar2.zzg(zzaotVar2.zze);
            zzcxVar2.zzi(zzaotVar2.zzb);
            zzcxVar2.zzm(zzaotVar2.zzf);
            zzcxVar2.zzl(zzaotVar2.zzi, zzaotVar2.zzh);
            zzcxVar2.zzo(zzaotVar2.zzj);
            arrayList2.add(zzcxVar2.zzr());
        }
        return arrayList2;
    }

    private zzaop(String str, String str2, long j, long j2, zzaov zzaovVar, String[] strArr, String str3, String str4, zzaop zzaopVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaovVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzaopVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }
}
