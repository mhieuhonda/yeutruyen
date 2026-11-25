package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajk extends zzajs implements zzaiz {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzajs[] zzg;

    public zzajk(String str, int i, int i2, long j, long j2, zzajs[] zzajsVarArr) {
        String str2;
        super("CHAP");
        zzgtr.zza(i <= i2);
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        int length = zzajsVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            zzajs zzajsVar = zzajsVarArr[i3];
            if (zzajsVar instanceof zzajx) {
                zzajx zzajxVar = (zzajx) zzajsVar;
                if (zzajxVar.zzf.equals("TIT2") && !zzajxVar.zzb.isEmpty()) {
                    str2 = (String) zzajxVar.zzb.get(0);
                    break;
                }
            }
            i3++;
        }
        if (str2 != null) {
            new zzx(null, str2);
        }
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzajsVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzajk zzajkVar = (zzajk) obj;
            if (this.zzb == zzajkVar.zzb && this.zzc == zzajkVar.zzc && this.zzd == zzajkVar.zzd && this.zze == zzajkVar.zze && Objects.equals(this.zza, zzajkVar.zza) && Arrays.equals(this.zzg, zzajkVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb + 527;
        String str = this.zza;
        long j = this.zze;
        return (((((((i * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 31) + str.hashCode();
    }
}
