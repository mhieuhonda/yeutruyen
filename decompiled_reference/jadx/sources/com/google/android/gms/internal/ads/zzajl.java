package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajl extends zzajs {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzajs[] zze;

    public zzajl(String str, boolean z, boolean z2, String[] strArr, zzajs[] zzajsVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzajsVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzajl zzajlVar = (zzajl) obj;
            if (this.zzb == zzajlVar.zzb && this.zzc == zzajlVar.zzc && Objects.equals(this.zza, zzajlVar.zza) && Arrays.equals(this.zzd, zzajlVar.zzd) && Arrays.equals(this.zze, zzajlVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + this.zza.hashCode();
    }
}
