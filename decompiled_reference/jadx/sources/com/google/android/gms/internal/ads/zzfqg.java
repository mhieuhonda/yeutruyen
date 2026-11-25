package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzfqg {
    static zzfqg zzn(Context context, int i) {
        boolean zBooleanValue;
        if (zzfqt.zza()) {
            int i2 = i - 2;
            if (i2 == 20 || i2 == 21) {
                zBooleanValue = ((Boolean) zzbkq.zze.zze()).booleanValue();
            } else if (i2 != 110) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbkq.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbkq.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbkq.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkq)).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfqi(context, i);
            }
        }
        return new zzfrj();
    }

    static zzfqg zzo(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfqg zzfqgVarZzn = zzn(context, i);
        if (zzfqgVarZzn instanceof zzfqi) {
            zzfqgVarZzn.zza();
            zzfqgVarZzn.zzp(i2);
            zzfqgVarZzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfqp.zza(str)) {
                zzfqgVarZzn.zze(str);
            }
        }
        return zzfqgVarZzn;
    }

    zzfqg zza();

    boolean zzb();

    zzfqg zzc();

    zzfqg zzd(boolean z);

    zzfqg zze(String str);

    zzfqg zzf(zzfqv zzfqvVar);

    zzfqg zzg(zzfkx zzfkxVar);

    zzfqg zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfqg zzi(String str);

    zzfqg zzj(Throwable th);

    zzfqg zzk(String str);

    boolean zzl();

    zzfqj zzm();

    zzfqg zzp(int i);
}
