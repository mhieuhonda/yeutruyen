package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzbkh {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbkh(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbkh zza(String str, boolean z) {
        return new zzbkh(str, Boolean.valueOf(z), 1);
    }

    public static zzbkh zzb(String str, long j) {
        return new zzbkh(str, Long.valueOf(j), 2);
    }

    public static zzbkh zzc(String str, double d) {
        return new zzbkh(str, Double.valueOf(d), 3);
    }

    public static zzbkh zzd(String str, String str2) {
        return new zzbkh("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzbln zzblnVarZza = zzblp.zza();
        if (zzblnVarZza == null) {
            if (zzblp.zzb() != null) {
                zzblp.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i == 0) {
            return zzblnVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i == 1) {
            return zzblnVarZza.zzb(this.zza, ((Long) this.zzb).longValue());
        }
        String str = this.zza;
        return i != 2 ? zzblnVarZza.zzd(str, (String) this.zzb) : zzblnVarZza.zzc(str, ((Double) this.zzb).doubleValue());
    }
}
