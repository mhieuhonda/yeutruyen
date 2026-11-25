package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwv implements zzzf {
    private final zzgwt zza;
    private long zzb;

    public zzwv(List list, List list2) {
        int i = zzgwt.zzd;
        zzgwq zzgwqVar = new zzgwq();
        zzgtr.zza(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgwqVar.zzf(new zzwu((zzzf) list.get(i2), (List) list2.get(i2)));
        }
        this.zza = zzgwqVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzgwt zzgwtVar = this.zza;
            if (i >= zzgwtVar.size()) {
                break;
            }
            zzwu zzwuVar = (zzwu) zzgwtVar.get(i);
            long jZzb = zzwuVar.zzb();
            if ((zzwuVar.zza().contains(1) || zzwuVar.zza().contains(2) || zzwuVar.zza().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.zzb;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzgwt zzgwtVar = this.zza;
            if (i >= zzgwtVar.size()) {
                break;
            }
            long jZzc = ((zzwu) zzgwtVar.get(i)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzmc zzmcVar) {
        boolean zZzd;
        boolean z = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zZzd = false;
            while (true) {
                zzgwt zzgwtVar = this.zza;
                if (i >= zzgwtVar.size()) {
                    break;
                }
                long jZzc2 = ((zzwu) zzgwtVar.get(i)).zzc();
                boolean z2 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzmcVar.zza;
                if (jZzc2 == jZzc || z2) {
                    zZzd |= ((zzwu) zzgwtVar.get(i)).zzd(zzmcVar);
                }
                i++;
            }
            z |= zZzd;
        } while (zZzd);
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zze() {
        int i = 0;
        while (true) {
            zzgwt zzgwtVar = this.zza;
            if (i >= zzgwtVar.size()) {
                return false;
            }
            if (((zzwu) zzgwtVar.get(i)).zze()) {
                return true;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzf(long j) {
        int i = 0;
        while (true) {
            zzgwt zzgwtVar = this.zza;
            if (i >= zzgwtVar.size()) {
                return;
            }
            ((zzwu) zzgwtVar.get(i)).zzf(j);
            i++;
        }
    }
}
