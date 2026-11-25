package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaaz extends zzabf implements zznd {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgyn zzc = zzgyn.zzc(zzaai.zza);
    public final Context zza;
    private final Object zzd;
    private zzaan zze;
    private Thread zzf;
    private zzaco zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzzu zzj;

    public zzaaz(Context context) {
        zzzu zzzuVar = new zzzu();
        zzaan zzaanVar = zzaan.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzzuVar;
        if (zzaanVar instanceof zzaan) {
            this.zze = zzaanVar;
        } else {
            zzaam zzaamVar = new zzaam(zzaanVar, bArr);
            zzaamVar.zzx((zzbl) zzaanVar);
            this.zze = new zzaan(zzaamVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzeh.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static Pair zzA(zzaba[] zzabaVarArr, int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzaba zzabaVar = zzabaVarArr[i2];
            if (zzabaVar != null && zzabaVar.zza.zzc == i) {
                return Pair.create(zzabaVar, Integer.valueOf(i2));
            }
        }
        return null;
    }

    private static final Pair zzB(int i, zzabe zzabeVar, int[][][] iArr, zzaaq zzaaqVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == zzabeVar.zza(i2)) {
                zzzo zzzoVarZzb = zzabeVar.zzb(i2);
                for (int i3 = 0; i3 < zzzoVarZzb.zzb; i3++) {
                    zzbg zzbgVarZza = zzzoVarZzb.zza(i3);
                    List listZza = zzaaqVar.zza(i2, zzbgVarZza, iArr[i2][i3]);
                    int i4 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        zzaar zzaarVar = (zzaar) listZza.get(i5);
                        int iZza = zzaarVar.zza();
                        if (!zArr[i5] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzgwt.zzj(zzaarVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzaarVar);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    zzaar zzaarVar2 = (zzaar) listZza.get(i7);
                                    if (zzaarVar2.zza() == 2 && zzaarVar.zzc(zzaarVar2)) {
                                        arrayList2.add(zzaarVar2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i5 = i6;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzaar) list.get(i8)).zzc;
        }
        zzaar zzaarVar3 = (zzaar) list.get(0);
        return Pair.create(new zzaba(zzaarVar3.zzb, iArr2, 0), Integer.valueOf(zzaarVar3.zza));
    }

    protected static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int zzj(zzv zzvVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzfm.zza;
        return strZzi2.split("-", 2)[0].equals(strZzi.split("-", 2)[0]) ? 2 : 0;
    }

    static /* synthetic */ int zzm(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    static /* synthetic */ int zzn(zzv zzvVar, zzgwt zzgwtVar) {
        for (int i = 0; i < zzgwtVar.size(); i++) {
            int i2 = 0;
            while (true) {
                List list = zzvVar.zzc;
                if (i2 < list.size()) {
                    if (((zzx) list.get(i2)).zzb.equals(zzgwtVar.get(i))) {
                        return i;
                    }
                    i2++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    protected static final zzaba zzp(int i, zzzo zzzoVar, int[][] iArr, zzaan zzaanVar) throws zzjm {
        int i2 = zzaanVar.zzw.zzb;
        int i3 = 0;
        zzbg zzbgVar = null;
        zzaal zzaalVar = null;
        for (int i4 = 0; i4 < zzzoVar.zzb; i4++) {
            zzbg zzbgVarZza = zzzoVar.zza(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < zzbgVarZza.zza; i5++) {
                if (zzne.zzad(iArr2[i5], zzaanVar.zzV)) {
                    zzaal zzaalVar2 = new zzaal(zzbgVarZza.zza(i5), iArr2[i5]);
                    if (zzaalVar == null || zzaalVar2.compareTo(zzaalVar) > 0) {
                        zzbgVar = zzbgVarZza;
                        i3 = i5;
                        zzaalVar = zzaalVar2;
                    }
                }
            }
        }
        if (zzbgVar == null) {
            return null;
        }
        return new zzaba(zzbgVar, new int[]{i3}, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzk() {
        boolean z;
        zzaco zzacoVar;
        synchronized (this.zzd) {
            z = false;
            if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzacoVar = this.zzg) != null && zzacoVar.zzb()) {
                z = true;
            }
        }
        if (z) {
            zzt();
        }
    }

    private static void zzw(zzabe zzabeVar, zzbl zzblVar, zzaba[] zzabaVarArr) {
        HashMap map = new HashMap();
        for (int i = 0; i < 2; i++) {
            zzx(zzabeVar.zzb(i), zzblVar, map);
        }
        zzx(zzabeVar.zze(), zzblVar, map);
        for (int i2 = 0; i2 < 2; i2++) {
            if (((zzbh) map.get(Integer.valueOf(zzabeVar.zza(i2)))) != null) {
                throw null;
            }
        }
    }

    private static void zzx(zzzo zzzoVar, zzbl zzblVar, Map map) {
        for (int i = 0; i < zzzoVar.zzb; i++) {
            if (((zzbh) zzblVar.zzH.get(zzzoVar.zza(i))) != null) {
                throw null;
            }
        }
    }

    private static void zzy(zzabe zzabeVar, zzaan zzaanVar, zzaba[] zzabaVarArr) {
        for (int i = 0; i < 2; i++) {
            zzzo zzzoVarZzb = zzabeVar.zzb(i);
            if (zzaanVar.zzb(i, zzzoVarZzb)) {
                if (zzaanVar.zzc(i, zzzoVarZzb) != null) {
                    throw null;
                }
                zzabaVarArr[i] = null;
            }
        }
    }

    private static void zzz(zzabe zzabeVar, zzaan zzaanVar, zzaba[] zzabaVarArr) {
        for (int i = 0; i < 2; i++) {
            int iZza = zzabeVar.zza(i);
            if (zzaanVar.zza(i) || zzaanVar.zzI.contains(Integer.valueOf(iZza))) {
                zzabaVarArr[i] = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final void zza(zznc zzncVar) {
        synchronized (this.zzd) {
            boolean z = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final void zzb() {
        zzaco zzacoVar;
        synchronized (this.zzd) {
            Thread thread = this.zzf;
            if (thread != null) {
                zzgtr.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzacoVar = this.zzg) != null) {
            zzacoVar.zzg();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzaan zzc() {
        zzaan zzaanVar;
        synchronized (this.zzd) {
            zzaanVar = this.zze;
        }
        return zzaanVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzk();
    }

    public final void zzf(zzaam zzaamVar) {
        boolean zEquals;
        zzaan zzaanVar = new zzaan(zzaamVar, null);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzaanVar);
            this.zze = zzaanVar;
        }
        if (zEquals) {
            return;
        }
        if (zzaanVar.zzU && this.zza == null) {
            zzeh.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final zznd zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    protected final Pair zzh(zzabe zzabeVar, int[][][] iArr, final int[] iArr2, zzxl zzxlVar, zzbf zzbfVar) throws zzjm {
        final zzaan zzaanVar;
        zzzu zzzuVar;
        int[] iArr3;
        int length;
        zzabb zzabbVarZza;
        int i;
        int i2;
        final String languageTag;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        final boolean z;
        Context context3;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzaanVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfm.zzR(context3));
        }
        if (zzaanVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzaco(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzk();
                }
            }, this.zzi);
        }
        zzaba[] zzabaVarArr = new zzaba[2];
        zzw(zzabeVar, zzaanVar, zzabaVarArr);
        zzy(zzabeVar, zzaanVar, zzabaVarArr);
        zzz(zzabeVar, zzaanVar, zzabaVarArr);
        Pair pairZzA = zzA(zzabaVarArr, 1);
        int i3 = 0;
        if (pairZzA == null) {
            int i4 = 0;
            while (true) {
                if (i4 >= 2) {
                    z = false;
                    break;
                }
                if (zzabeVar.zza(i4) == 2 && zzabeVar.zzb(i4).zzb > 0) {
                    z = true;
                    break;
                }
                i4++;
            }
            pairZzA = zzB(1, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaae
                @Override // com.google.android.gms.internal.ads.zzaaq
                public final /* synthetic */ List zza(int i5, zzbg zzbgVar, int[] iArr4) {
                    final zzaaz zzaazVar = this.zza;
                    final zzaan zzaanVar2 = zzaanVar;
                    zzgts zzgtsVar = new zzgts() { // from class: com.google.android.gms.internal.ads.zzaah
                        @Override // com.google.android.gms.internal.ads.zzgts
                        public final /* synthetic */ boolean zza(Object obj) {
                            return zzaazVar.zzl(zzaanVar2, (zzv) obj);
                        }
                    };
                    int i6 = iArr2[i5];
                    int i7 = zzgwt.zzd;
                    zzgwq zzgwqVar = new zzgwq();
                    for (int i8 = 0; i8 < zzbgVar.zza; i8++) {
                        zzgwqVar.zzf(new zzzy(i5, zzbgVar, i8, zzaanVar2, iArr4[i8], z, zzgtsVar, i6));
                    }
                    return zzgwqVar.zzi();
                }
            }, zzzz.zza);
            if (pairZzA != null) {
                zzabaVarArr[((Integer) pairZzA.second).intValue()] = (zzaba) pairZzA.first;
            }
        }
        final String str = pairZzA == null ? null : ((zzaba) pairZzA.first).zza.zza(((zzaba) pairZzA.first).zzb[0]).zzd;
        Pair pairZzA2 = zzA(zzabaVarArr, 2);
        Pair pairZzA3 = zzA(zzabaVarArr, 4);
        if (pairZzA2 == null && pairZzA3 == null) {
            int i5 = zzaanVar.zzw.zzb;
            final Point pointZzT = (!zzaanVar.zzk || (context2 = this.zza) == null) ? null : zzfm.zzT(context2);
            Pair pairZzB = zzB(2, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaad
                /* JADX WARN: Code duplicated, block: B:29:0x004d  */
                @Override // com.google.android.gms.internal.ads.zzaaq
                public final /* synthetic */ List zza(int i6, zzbg zzbgVar, int[] iArr4) {
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    Point point;
                    zzbg zzbgVar2 = zzbgVar;
                    int i13 = zzaaz.zzb;
                    Point point2 = pointZzT;
                    int i14 = iArr2[i6];
                    zzaan zzaanVar2 = zzaanVar;
                    int i15 = point2 != null ? point2.x : zzaanVar2.zzi;
                    int i16 = point2 != null ? point2.y : zzaanVar2.zzj;
                    boolean z2 = zzaanVar2.zzl;
                    if (i15 == Integer.MAX_VALUE) {
                        i7 = -1;
                        i8 = Integer.MAX_VALUE;
                    } else if (i16 == Integer.MAX_VALUE) {
                        i8 = Integer.MAX_VALUE;
                        i7 = -1;
                    } else {
                        int i17 = Integer.MAX_VALUE;
                        for (int i18 = 0; i18 < zzbgVar2.zza; i18++) {
                            zzv zzvVarZza = zzbgVar2.zza(i18);
                            int i19 = zzvVarZza.zzw;
                            if (i19 > 0 && (i10 = zzvVarZza.zzx) > 0) {
                                if (!z2) {
                                    i11 = i16;
                                    i12 = i15;
                                } else if ((i19 > i10) != (i15 > i16)) {
                                    i12 = i16;
                                    i11 = i15;
                                } else {
                                    i11 = i16;
                                    i12 = i15;
                                }
                                int i20 = i19 * i11;
                                int i21 = i10 * i12;
                                if (i20 >= i21) {
                                    String str2 = zzfm.zza;
                                    point = new Point(i12, ((i21 + i19) - 1) / i19);
                                } else {
                                    String str3 = zzfm.zza;
                                    point = new Point(((i20 + i10) - 1) / i10, i11);
                                }
                                int i22 = i19 * i10;
                                if (i19 >= ((int) (point.x * 0.98f)) && i10 >= ((int) (point.y * 0.98f)) && i22 < i17) {
                                    i17 = i22;
                                }
                            }
                        }
                        i7 = -1;
                        i8 = i17;
                    }
                    int i23 = zzgwt.zzd;
                    zzgwq zzgwqVar = new zzgwq();
                    int i24 = 0;
                    while (i24 < zzbgVar2.zza) {
                        int iZzc = zzbgVar2.zza(i24).zzc();
                        if (i8 != Integer.MAX_VALUE) {
                            i9 = i7;
                            boolean z3 = iZzc != i9 && iZzc <= i8;
                            zzgwqVar.zzf(new zzaay(i6, zzbgVar2, i24, zzaanVar2, iArr4[i24], str, i14, z3));
                            i24++;
                            zzbgVar2 = zzbgVar;
                            i7 = i9;
                        } else {
                            i9 = i7;
                        }
                        zzgwqVar.zzf(new zzaay(i6, zzbgVar2, i24, zzaanVar2, iArr4[i24], str, i14, z3));
                        i24++;
                        zzbgVar2 = zzbgVar;
                        i7 = i9;
                    }
                    return zzgwqVar.zzi();
                }
            }, zzaac.zza);
            boolean z2 = zzaanVar.zzE;
            Pair pairZzB2 = pairZzB == null ? zzB(4, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaag
                @Override // com.google.android.gms.internal.ads.zzaaq
                public final /* synthetic */ List zza(int i6, zzbg zzbgVar, int[] iArr4) {
                    int i7 = zzaaz.zzb;
                    int i8 = zzgwt.zzd;
                    zzgwq zzgwqVar = new zzgwq();
                    for (int i9 = 0; i9 < zzbgVar.zza; i9++) {
                        zzgwqVar.zzf(new zzaak(i6, zzbgVar, i9, zzaanVar, iArr4[i9]));
                    }
                    return zzgwqVar.zzi();
                }
            }, zzaaa.zza) : null;
            if (pairZzB2 != null) {
                zzabaVarArr[((Integer) pairZzB2.second).intValue()] = (zzaba) pairZzB2.first;
            } else if (pairZzB != null) {
                zzabaVarArr[((Integer) pairZzB.second).intValue()] = (zzaba) pairZzB.first;
            }
        }
        if (zzA(zzabaVarArr, 3) == null) {
            int i6 = zzaanVar.zzw.zzb;
            if (!zzaanVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str2 = zzfm.zza;
                languageTag = locale.toLanguageTag();
            }
            Pair pairZzB3 = zzB(3, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaaf
                @Override // com.google.android.gms.internal.ads.zzaaq
                public final /* synthetic */ List zza(int i7, zzbg zzbgVar, int[] iArr4) {
                    int i8 = zzaaz.zzb;
                    int i9 = zzgwt.zzd;
                    zzgwq zzgwqVar = new zzgwq();
                    for (int i10 = 0; i10 < zzbgVar.zza; i10++) {
                        zzgwqVar.zzf(new zzaap(i7, zzbgVar, i10, zzaanVar, iArr4[i10], str, languageTag));
                    }
                    return zzgwqVar.zzi();
                }
            }, zzaab.zza);
            if (pairZzB3 != null) {
                zzabaVarArr[((Integer) pairZzB3.second).intValue()] = (zzaba) pairZzB3.first;
            }
        }
        int i7 = zzaanVar.zzw.zzb;
        zzgxc zzgxcVar = new zzgxc();
        int i8 = 0;
        while (i8 < 2) {
            zzaba zzabaVar = zzabaVarArr[i8];
            if (zzabaVar == null || zzaanVar.zza(i8)) {
                i2 = i3;
            } else {
                zzgxd zzgxdVar = zzaanVar.zzI;
                zzbg zzbgVar = zzabaVar.zza;
                i2 = i3;
                if (!zzgxdVar.contains(Integer.valueOf(zzbgVar.zzc))) {
                    zzgxcVar.zzf(zzbgVar.zzb);
                    int i9 = i2;
                    while (true) {
                        int[] iArr4 = zzabaVar.zzb;
                        if (i9 < iArr4.length) {
                            String str3 = zzbgVar.zza(iArr4[i9]).zzn;
                            if (str3 != null) {
                                zzgxcVar.zzf(str3);
                            }
                            i9++;
                        }
                    }
                }
            }
            i8++;
            i3 = i2;
        }
        int i10 = i3;
        zzgxd zzgxdVarZzh = zzgxcVar.zzh();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = i10; i11 < 2; i11++) {
            if (zzabeVar.zza(i11) == 5) {
                zzzo zzzoVarZzb = zzabeVar.zzb(i11);
                for (int i12 = i10; i12 < zzzoVarZzb.zzb; i12++) {
                    zzbg zzbgVarZza = zzzoVarZzb.zza(i12);
                    arrayList.add(zzbgVarZza);
                    int[] iArr5 = (int[]) iArr[i11][i12].clone();
                    for (int i13 = i10; i13 < iArr5.length; i13++) {
                        String str4 = zzbgVarZza.zza(i13).zzn;
                        if (str4 != null && !zzgxdVarZzh.contains(str4)) {
                            iArr5[i13] = 128;
                        }
                    }
                    arrayList2.add(iArr5);
                }
            }
        }
        int i14 = 128;
        zzbg[] zzbgVarArr = new zzbg[arrayList.size()];
        zzfm.zzc(arrayList, zzbgVarArr);
        zzzo zzzoVar = new zzzo(zzbgVarArr);
        int[][] iArr6 = new int[arrayList2.size()][];
        zzfm.zzc(arrayList2, iArr6);
        int i15 = i10;
        while (i15 < 2) {
            if (zzabeVar.zza(i15) == 5) {
                zzaba zzabaVarZzp = zzp(5, zzzoVar, iArr6, zzaanVar);
                zzabaVarArr[i15] = zzabaVarZzp;
                if (zzabaVarZzp == null) {
                    break;
                }
                i = i14;
                Arrays.fill(iArr6[zzzoVar.zzb(zzabaVarZzp.zza)], i);
            } else {
                i = i14;
            }
            i15++;
            i14 = i;
        }
        for (int i16 = i10; i16 < 2; i16++) {
            int iZza = zzabeVar.zza(i16);
            if (iZza != 2 && iZza != 1) {
                if (iZza != 3 && iZza != 4 && iZza != 5 && zzabaVarArr[i16] == null) {
                    zzabaVarArr[i16] = zzp(iZza, zzabeVar.zzb(i16), iArr[i16], zzaanVar);
                }
            }
        }
        zzw(zzabeVar, zzaanVar, zzabaVarArr);
        zzy(zzabeVar, zzaanVar, zzabaVarArr);
        zzz(zzabeVar, zzaanVar, zzabaVarArr);
        zzzu zzzuVar2 = this.zzj;
        zzabr zzabrVarZzu = zzu();
        zzgwt zzgwtVarZzd = zzzv.zzd(zzabaVarArr);
        zzabb[] zzabbVarArr = new zzabb[2];
        int i17 = i10;
        while (i17 < 2) {
            zzaba zzabaVar2 = zzabaVarArr[i17];
            if (zzabaVar2 == null || (length = (iArr3 = zzabaVar2.zzb).length) == 0) {
                zzzuVar = zzzuVar2;
            } else {
                if (length == 1) {
                    zzabbVarZza = new zzabc(zzabaVar2.zza, iArr3[i10], 0, 0, null);
                    zzzuVar = zzzuVar2;
                } else {
                    zzzuVar = zzzuVar2;
                    zzabbVarZza = zzzuVar.zza(zzabaVar2.zza, iArr3, 0, zzabrVarZzu, (zzgwt) zzgwtVarZzd.get(i17));
                }
                zzabbVarArr[i17] = zzabbVarZza;
            }
            i17++;
            zzzuVar2 = zzzuVar;
        }
        zznf[] zznfVarArr = new zznf[2];
        for (int i18 = i10; i18 < 2; i18++) {
            zznfVarArr[i18] = (zzaanVar.zza(i18) || zzaanVar.zzI.contains(Integer.valueOf(zzabeVar.zza(i18))) || (zzabeVar.zza(i18) != -2 && zzabbVarArr[i18] == null)) ? null : zznf.zza;
        }
        boolean z3 = zzaanVar.zzW;
        return Pair.create(zznfVarArr, zzabbVarArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final /* synthetic */ boolean zzl(zzaan zzaanVar, zzv zzvVar) {
        Boolean bool;
        int i;
        zzaco zzacoVar;
        zzaco zzacoVar2;
        if (!zzaanVar.zzU || (((bool = this.zzi) != null && bool.booleanValue()) || (i = zzvVar.zzH) == -1 || i <= 2)) {
            return true;
        }
        String str = zzvVar.zzp;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        if (Build.VERSION.SDK_INT >= 32 || (zzacoVar2 = this.zzg) == null || !zzacoVar2.zzb()) {
                            return true;
                        }
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            break;
                        }
                        return true;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            break;
                        }
                        return true;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            break;
                        }
                        return true;
                    }
                    break;
            }
        }
        return Build.VERSION.SDK_INT >= 32 && (zzacoVar = this.zzg) != null && zzacoVar.zzb() && zzacoVar.zzc() && this.zzg.zzd() && this.zzg.zze(this.zzh, zzvVar);
    }
}
