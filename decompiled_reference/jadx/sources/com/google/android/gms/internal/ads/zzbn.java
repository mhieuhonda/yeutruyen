package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbn {
    public static final zzbn zza = new zzbn(zzgwt.zzi());
    private final zzgwt zzb;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
    }

    public zzbn(List list) {
        this.zzb = zzgwt.zzq(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzgwt zza() {
        return this.zzb;
    }

    public final boolean zzb(int i) {
        int i2 = 0;
        while (true) {
            zzgwt zzgwtVar = this.zzb;
            if (i2 >= zzgwtVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgwtVar.get(i2);
            if (zzbmVar.zzb() && zzbmVar.zzd() == i) {
                return true;
            }
            i2++;
        }
    }
}
