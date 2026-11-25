package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zziee {
    private static final zziee zzd = new zziee(true);
    final zzigx zza = new zzigt();
    boolean zzb;
    boolean zzc;

    private zziee() {
    }

    public static zziee zza() {
        return zzd;
    }

    static void zzf(zzidu zziduVar, zzihq zzihqVar, int i, Object obj) throws IOException {
        if (zzihqVar == zzihq.GROUP) {
            zziduVar.zzb(i, 3);
            ((zzifz) obj).zzcX(zziduVar);
            zziduVar.zzb(i, 4);
            return;
        }
        zziduVar.zzb(i, zzihqVar.zzb());
        zzihr zzihrVar = zzihr.INT;
        switch (zzihqVar) {
            case DOUBLE:
                zziduVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case FLOAT:
                zziduVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case INT64:
                zziduVar.zzt(((Long) obj).longValue());
                break;
            case UINT64:
                zziduVar.zzt(((Long) obj).longValue());
                break;
            case INT32:
                zziduVar.zzq(((Integer) obj).intValue());
                break;
            case FIXED64:
                zziduVar.zzu(((Long) obj).longValue());
                break;
            case FIXED32:
                zziduVar.zzs(((Integer) obj).intValue());
                break;
            case BOOL:
                zziduVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof zzidl)) {
                    zziduVar.zzw((String) obj);
                } else {
                    zziduVar.zzk((zzidl) obj);
                }
                break;
            case GROUP:
                ((zzifz) obj).zzcX(zziduVar);
                break;
            case MESSAGE:
                zziduVar.zzo((zzifz) obj);
                break;
            case BYTES:
                if (!(obj instanceof zzidl)) {
                    byte[] bArr = (byte[]) obj;
                    zziduVar.zzl(bArr, 0, bArr.length);
                } else {
                    zziduVar.zzk((zzidl) obj);
                }
                break;
            case UINT32:
                zziduVar.zzr(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof zziet)) {
                    zziduVar.zzq(((Integer) obj).intValue());
                } else {
                    zziduVar.zzq(((zziet) obj).zza());
                }
                break;
            case SFIXED32:
                zziduVar.zzs(((Integer) obj).intValue());
                break;
            case SFIXED64:
                zziduVar.zzu(((Long) obj).longValue());
                break;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                zziduVar.zzr((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                zziduVar.zzt((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int zzh(zzihq zzihqVar, int i, Object obj) {
        int iZzF = zzidu.zzF(i << 3);
        if (zzihqVar == zzihq.GROUP) {
            iZzF += iZzF;
        }
        return iZzF + zzi(zzihqVar, obj);
    }

    static int zzi(zzihq zzihqVar, Object obj) {
        int iZzc;
        int iZzF;
        zzihq zzihqVar2 = zzihq.DOUBLE;
        zzihr zzihrVar = zzihr.INT;
        switch (zzihqVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                int i = zzidu.zzb;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                int i2 = zzidu.zzb;
                return 4;
            case INT64:
                return zzidu.zzG(((Long) obj).longValue());
            case UINT64:
                return zzidu.zzG(((Long) obj).longValue());
            case INT32:
                return zzidu.zzG(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                int i3 = zzidu.zzb;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                int i4 = zzidu.zzb;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                int i5 = zzidu.zzb;
                return 1;
            case STRING:
                if (!(obj instanceof zzidl)) {
                    int i6 = zzidu.zzb;
                    iZzc = zzihp.zzc((String) obj);
                    iZzF = zzidu.zzF(iZzc);
                } else {
                    int i7 = zzidu.zzb;
                    iZzc = ((zzidl) obj).zzb();
                    iZzF = zzidu.zzF(iZzc);
                }
                break;
            case GROUP:
                return ((zzifz) obj).zzbr();
            case MESSAGE:
                if (!(obj instanceof zziff)) {
                    return zzidu.zzH((zzifz) obj);
                }
                iZzc = ((zziff) obj).zzb();
                iZzF = zzidu.zzF(iZzc);
                break;
                break;
            case BYTES:
                if (!(obj instanceof zzidl)) {
                    int i8 = zzidu.zzb;
                    iZzc = ((byte[]) obj).length;
                    iZzF = zzidu.zzF(iZzc);
                } else {
                    int i9 = zzidu.zzb;
                    iZzc = ((zzidl) obj).zzb();
                    iZzF = zzidu.zzF(iZzc);
                }
                break;
            case UINT32:
                return zzidu.zzF(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof zziet ? zzidu.zzG(((zziet) obj).zza()) : zzidu.zzG(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                int i10 = zzidu.zzb;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                int i11 = zzidu.zzb;
                return 8;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                return zzidu.zzF((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                return zzidu.zzG((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzF + iZzc;
    }

    public static int zzj(zzied zziedVar, Object obj) {
        zzihq zzihqVarZzb = zziedVar.zzb();
        int iZza = zziedVar.zza();
        if (!zziedVar.zzd()) {
            return zzh(zzihqVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zziedVar.zze()) {
            int iZzh = 0;
            while (i < size) {
                iZzh += zzh(zzihqVarZzb, iZza, list.get(i));
                i++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i < size) {
            iZzi += zzi(zzihqVarZzb, list.get(i));
            i++;
        }
        return zzidu.zzF(iZza << 3) + iZzi + zzidu.zzF(iZzi);
    }

    private static boolean zzk(Map.Entry entry) {
        zzied zziedVar = (zzied) entry.getKey();
        if (zziedVar.zzc() != zzihr.MESSAGE) {
            return true;
        }
        if (!zziedVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzl(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zziga) {
            return ((zziga) obj).zzbi();
        }
        if (obj instanceof zziff) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int iZzF;
        int iZzF2;
        zzied zziedVar = (zzied) entry.getKey();
        Object value = entry.getValue();
        if (zziedVar.zzc() != zzihr.MESSAGE || zziedVar.zzd() || zziedVar.zze()) {
            return zzj(zziedVar, value);
        }
        if (value instanceof zziff) {
            int iZza = ((zzied) entry.getKey()).zza();
            int iZzF3 = zzidu.zzF(8);
            i = iZzF3 + iZzF3;
            iZzF = zzidu.zzF(16) + zzidu.zzF(iZza);
            int iZzF4 = zzidu.zzF(24);
            int iZzb = ((zziff) value).zzb();
            iZzF2 = iZzF4 + zzidu.zzF(iZzb) + iZzb;
        } else {
            int iZza2 = ((zzied) entry.getKey()).zza();
            int iZzF5 = zzidu.zzF(8);
            i = iZzF5 + iZzF5;
            iZzF = zzidu.zzF(16) + zzidu.zzF(iZza2);
            iZzF2 = zzidu.zzF(24) + zzidu.zzH((zzifz) value);
        }
        return i + iZzF + iZzF2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzn(zzied zziedVar, Object obj) {
        boolean z;
        zziedVar.zzb();
        obj.getClass();
        zzihq zzihqVar = zzihq.DOUBLE;
        zzihr zzihrVar = zzihr.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziedVar.zza()), zziedVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziedVar.zza()), zziedVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziedVar.zza()), zziedVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziedVar.zza()), zziedVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziedVar.zza()), zziedVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziedVar.zza()), zziedVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzidl) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziedVar.zza()), zziedVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zziet)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziedVar.zza()), zziedVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzifz) || (obj instanceof zziff)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziedVar.zza()), zziedVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zziedVar.zza()), zziedVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zziee zzieeVar = new zziee();
        zzigx zzigxVar = this.zza;
        int iZzc = zzigxVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzd = zzigxVar.zzd(i);
            zzieeVar.zzd((zzied) ((zzigu) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzigxVar.zze()) {
            zzieeVar.zzd((zzied) entry.getKey(), entry.getValue());
        }
        zzieeVar.zzc = this.zzc;
        return zzieeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zziee) {
            return this.zza.equals(((zziee) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzigx zzigxVar = this.zza;
        int iZzc = zzigxVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Object value = zzigxVar.zzd(i).getValue();
            if (value instanceof zziep) {
                ((zziep) value).zzbm();
            }
        }
        Iterator it = zzigxVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zziep) {
                ((zziep) value2).zzbm();
            }
        }
        zzigxVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzigx zzigxVar = this.zza;
        if (zzigxVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzc ? new zzife(zzigxVar.entrySet().iterator()) : zzigxVar.entrySet().iterator();
    }

    public final void zzd(zzied zziedVar, Object obj) {
        if (!zziedVar.zzd()) {
            zzn(zziedVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzn(zziedVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zziff) {
            this.zzc = true;
        }
        this.zza.put(zziedVar, obj);
    }

    public final boolean zze() {
        zzigx zzigxVar = this.zza;
        int iZzc = zzigxVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzk(zzigxVar.zzd(i))) {
                return false;
            }
        }
        Iterator it = zzigxVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzigx zzigxVar = this.zza;
        int iZzc = zzigxVar.zzc();
        int iZzm = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzm += zzm(zzigxVar.zzd(i));
        }
        Iterator it = zzigxVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zziee(boolean z) {
        zzb();
        zzb();
    }
}
