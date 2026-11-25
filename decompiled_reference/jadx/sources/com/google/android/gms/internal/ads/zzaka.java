package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaka implements zzao {
    public final List zza;

    public zzaka(List list) {
        this.zza = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((zzajz) list.get(0)).zzb;
            for (int i = 1; i < list.size(); i++) {
                if (((zzajz) list.get(i)).zza < j) {
                    z = true;
                    break;
                }
                j = ((zzajz) list.get(i)).zzb;
            }
        }
        zzgtr.zza(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzaka) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }
}
