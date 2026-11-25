package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzibt extends zzibr {
    private final zzich zza = new zzich(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzibt) && ((zzibt) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(String str, zzibr zzibrVar) {
        this.zza.put(str, zzibrVar);
    }

    public final Set zzb() {
        return this.zza.entrySet();
    }

    public final boolean zzc(String str) {
        return this.zza.containsKey(str);
    }

    public final zzibr zzh(String str) {
        return (zzibr) this.zza.get(str);
    }
}
