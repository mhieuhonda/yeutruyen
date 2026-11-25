package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaoo {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgxd zze = zzgxd.zzj(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");
    private static final zzgxd zzf = zzgxd.zzk("dot", "sesame", "circle");
    private static final zzgxd zzg = zzgxd.zzj("filled", "open");
    private static final zzgxd zzh = zzgxd.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaoo(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    public static zzaoo zza(String str) {
        int i;
        if (str == null) {
            return null;
        }
        String strZza = zzgsz.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzgxd zzgxdVarZzq = zzgxd.zzq(TextUtils.split(strZza, zzd));
        String str2 = (String) zzgxh.zzb(zzgzd.zza(zzh, zzgxdVarZzq), "outside");
        int iHashCode = str2.hashCode();
        int i2 = 2;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                i = 2;
            } else {
                i = 1;
            }
        } else if (str2.equals("outside")) {
            i = -2;
        } else {
            i = 1;
        }
        zzgzc zzgzcVarZza = zzgzd.zza(zze, zzgxdVarZzq);
        int i3 = 0;
        if (zzgzcVarZza.isEmpty()) {
            zzgzc zzgzcVarZza2 = zzgzd.zza(zzg, zzgxdVarZzq);
            zzgzc zzgzcVarZza3 = zzgzd.zza(zzf, zzgxdVarZzq);
            if (zzgzcVarZza2.isEmpty() && zzgzcVarZza3.isEmpty()) {
                i2 = -1;
            } else {
                String str3 = (String) zzgxh.zzb(zzgzcVarZza2, "filled");
                i3 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzgxh.zzb(zzgzcVarZza3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 != 99657 || !str4.equals("dot")) {
                        i2 = 1;
                    }
                } else if (str4.equals("sesame")) {
                    i2 = 3;
                } else {
                    i2 = 1;
                }
            }
        } else {
            String str5 = (String) zzgzcVarZza.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i2 = 0;
            } else {
                i2 = -1;
            }
        }
        return new zzaoo(i2, i3, i);
    }
}
