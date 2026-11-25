package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvz {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzvz(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzvz.class) {
            zzvz zzvzVar = (zzvz) obj;
            if (TextUtils.equals(this.zza, zzvzVar.zza) && this.zzb == zzvzVar.zzb && this.zzc == zzvzVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}
