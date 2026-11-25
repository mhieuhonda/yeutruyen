package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzigs {
    public static final /* synthetic */ int zza = 0;
    private static final zzihd zzb;

    static {
        int i = zzicy.zza;
        zzb = new zzihf();
    }

    static int zzA(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzidu.zzF(i << 3) + 4);
    }

    static int zzB(List list) {
        return list.size() * 8;
    }

    static int zzC(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzidu.zzF(i << 3) + 8);
    }

    @Deprecated
    static int zzD(int i, zzifz zzifzVar, zzigr zzigrVar) {
        int iZzF = zzidu.zzF(i << 3);
        return iZzF + iZzF + ((zzicu) zzifzVar).zzaT(zzigrVar);
    }

    public static zzihd zzE() {
        return zzb;
    }

    static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzG(zziea zzieaVar, Object obj, Object obj2) {
        if (((zziel) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzH(zzihd zzihdVar, Object obj, Object obj2) {
        zziep zziepVar = (zziep) obj;
        zzihe zziheVarZzc = zziepVar.zzt;
        zzihe zziheVar = ((zziep) obj2).zzt;
        if (!zzihe.zza().equals(zziheVar)) {
            if (zzihe.zza().equals(zziheVarZzc)) {
                zziheVarZzc = zzihe.zzc(zziheVarZzc, zziheVar);
            } else {
                zziheVarZzc.zzm(zziheVar);
            }
        }
        zziepVar.zzt = zziheVarZzc;
    }

    static Object zzI(Object obj, int i, List list, zziev zzievVar, Object obj2, zzihd zzihdVar) {
        if (zzievVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzievVar.zza(iIntValue)) {
                    obj2 = zzJ(obj, i, iIntValue, obj2, zzihdVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            if (zzievVar.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(iIntValue2));
                }
                i2++;
            } else {
                obj2 = zzJ(obj, i, iIntValue2, obj2, zzihdVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object zzJ(Object obj, int i, int i2, Object obj2, zzihd zzihdVar) {
        if (obj2 == null) {
            obj2 = zzihdVar.zzh(obj);
        }
        zzihdVar.zza(obj2, i, i2);
        return obj2;
    }

    public static void zza(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzC(i, list, z);
    }

    public static void zzb(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzB(i, list, z);
    }

    public static void zzc(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzy(i, list, z);
    }

    public static void zzd(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzz(i, list, z);
    }

    public static void zze(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzL(i, list, z);
    }

    public static void zzf(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzA(i, list, z);
    }

    public static void zzg(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzJ(i, list, z);
    }

    public static void zzh(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzw(i, list, z);
    }

    public static void zzi(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzH(i, list, z);
    }

    public static void zzj(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzK(i, list, z);
    }

    public static void zzk(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzx(i, list, z);
    }

    public static void zzl(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzI(i, list, z);
    }

    public static void zzm(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzD(i, list, z);
    }

    public static void zzn(int i, List list, zzihs zzihsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzE(i, list, z);
    }

    public static void zzo(int i, List list, zzihs zzihsVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzF(i, list);
    }

    public static void zzp(int i, List list, zzihs zzihsVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzG(i, list);
    }

    public static void zzq(int i, List list, zzihs zzihsVar, zzigr zzigrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzidv) zzihsVar).zzr(i, list.get(i2), zzigrVar);
        }
    }

    public static void zzr(int i, List list, zzihs zzihsVar, zzigr zzigrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzidv) zzihsVar).zzs(i, list.get(i2), zzigrVar);
        }
    }

    static int zzs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifn)) {
            int iZzG = 0;
            while (i < size) {
                iZzG += zzidu.zzG(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzG;
        }
        zzifn zzifnVar = (zzifn) list;
        int iZzG2 = 0;
        while (i < size) {
            iZzG2 += zzidu.zzG(zzifnVar.zzc(i));
            i++;
        }
        return iZzG2;
    }

    static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifn)) {
            int iZzG = 0;
            while (i < size) {
                iZzG += zzidu.zzG(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzG;
        }
        zzifn zzifnVar = (zzifn) list;
        int iZzG2 = 0;
        while (i < size) {
            iZzG2 += zzidu.zzG(zzifnVar.zzc(i));
            i++;
        }
        return iZzG2;
    }

    static int zzu(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifn)) {
            int iZzG = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzG += zzidu.zzG((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzG;
        }
        zzifn zzifnVar = (zzifn) list;
        int iZzG2 = 0;
        while (i < size) {
            long jZzc = zzifnVar.zzc(i);
            iZzG2 += zzidu.zzG((jZzc >> 63) ^ (jZzc + jZzc));
            i++;
        }
        return iZzG2;
    }

    static int zzv(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iZzG = 0;
            while (i < size) {
                iZzG += zzidu.zzG(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzG;
        }
        zzieq zzieqVar = (zzieq) list;
        int iZzG2 = 0;
        while (i < size) {
            iZzG2 += zzidu.zzG(zzieqVar.zzf(i));
            i++;
        }
        return iZzG2;
    }

    static int zzw(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iZzG = 0;
            while (i < size) {
                iZzG += zzidu.zzG(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzG;
        }
        zzieq zzieqVar = (zzieq) list;
        int iZzG2 = 0;
        while (i < size) {
            iZzG2 += zzidu.zzG(zzieqVar.zzf(i));
            i++;
        }
        return iZzG2;
    }

    static int zzx(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iZzF = 0;
            while (i < size) {
                iZzF += zzidu.zzF(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzF;
        }
        zzieq zzieqVar = (zzieq) list;
        int iZzF2 = 0;
        while (i < size) {
            iZzF2 += zzidu.zzF(zzieqVar.zzf(i));
            i++;
        }
        return iZzF2;
    }

    static int zzy(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iZzF = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzF += zzidu.zzF((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzF;
        }
        zzieq zzieqVar = (zzieq) list;
        int iZzF2 = 0;
        while (i < size) {
            int iZzf = zzieqVar.zzf(i);
            iZzF2 += zzidu.zzF((iZzf >> 31) ^ (iZzf + iZzf));
            i++;
        }
        return iZzF2;
    }

    static int zzz(List list) {
        return list.size() * 4;
    }
}
