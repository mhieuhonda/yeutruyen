package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhlx extends zzibx {
    public static final zzibr zza(zzico zzicoVar) throws IOException {
        String strZzh;
        int iZzm = zzicoVar.zzm();
        zzibr zzibrVarZzc = zzc(zzicoVar, iZzm);
        if (zzibrVarZzc == null) {
            return zzb(zzicoVar, iZzm);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzicoVar.zzf()) {
                if (zzibrVarZzc instanceof zzibt) {
                    strZzh = zzicoVar.zzh();
                    if (!zzhlz.zza(strZzh)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    strZzh = null;
                }
                int iZzm2 = zzicoVar.zzm();
                zzibr zzibrVarZzc2 = zzc(zzicoVar, iZzm2);
                zzibr zzibrVarZzb = zzibrVarZzc2 == null ? zzb(zzicoVar, iZzm2) : zzibrVarZzc2;
                if (zzibrVarZzc instanceof zzibq) {
                    ((zzibq) zzibrVarZzc).zza(zzibrVarZzb);
                } else {
                    zzibt zzibtVar = (zzibt) zzibrVarZzc;
                    if (zzibtVar.zzc(strZzh)) {
                        String.valueOf(strZzh);
                        throw new IOException("duplicate key: ".concat(String.valueOf(strZzh)));
                    }
                    zzibtVar.zza(strZzh, zzibrVarZzb);
                }
                if (zzibrVarZzc2 != null) {
                    arrayDeque.addLast(zzibrVarZzc);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    zzibrVarZzc = zzibrVarZzb;
                } else {
                    continue;
                }
            } else {
                if (zzibrVarZzc instanceof zzibq) {
                    zzicoVar.zzc();
                } else {
                    zzicoVar.zze();
                }
                if (arrayDeque.isEmpty()) {
                    return zzibrVarZzc;
                }
                zzibrVarZzc = (zzibr) arrayDeque.removeLast();
            }
        }
    }

    private static final zzibr zzb(zzico zzicoVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            String strZzi = zzicoVar.zzi();
            if (zzhlz.zza(strZzi)) {
                return new zzibv(strZzi);
            }
            throw new IOException("illegal characters in string");
        }
        if (i2 == 6) {
            return new zzibv(new zzhly(zzicoVar.zzi()));
        }
        if (i2 == 7) {
            return new zzibv(Boolean.valueOf(zzicoVar.zzj()));
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzicp.zza(i)));
        }
        zzicoVar.zzk();
        return zzibs.zza;
    }

    @Nullable
    private static final zzibr zzc(zzico zzicoVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            zzicoVar.zzb();
            return new zzibq();
        }
        if (i2 != 2) {
            return null;
        }
        zzicoVar.zzd();
        return new zzibt();
    }
}
