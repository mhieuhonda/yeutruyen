package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagt {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zzfm.zza;
            String str3 = strGroup;
            int i = Integer.parseInt(strGroup, 16);
            String strGroup2 = matcher.group(2);
            String str4 = strGroup2;
            int i2 = Integer.parseInt(strGroup2, 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.zza = i;
            this.zzb = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(zzap zzapVar) {
        zzgwt zzgwtVarZze = zzapVar.zze(zzajm.class, zzags.zza);
        int size = zzgwtVarZze.size();
        int i = 0;
        while (i < size) {
            boolean zZzc = zzc(((zzajm) zzgwtVarZze.get(i)).zzc);
            i++;
            if (zZzc) {
                return true;
            }
        }
        zzgwt zzgwtVarZze2 = zzapVar.zze(zzaju.class, zzagr.zza);
        int size2 = zzgwtVarZze2.size();
        int i2 = 0;
        while (i2 < size2) {
            boolean zZzc2 = zzc(((zzaju) zzgwtVarZze2.get(i2)).zzc);
            i2++;
            if (zZzc2) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
