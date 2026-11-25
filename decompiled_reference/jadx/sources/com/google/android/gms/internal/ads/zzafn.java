package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzafn {
    public static void zza(long j, zzeu zzeuVar, zzahm[] zzahmVarArr) {
        int iZzB;
        while (true) {
            if (zzeuVar.zzd() <= 1) {
                return;
            }
            int iZzc = zzc(zzeuVar);
            int iZzc2 = zzc(zzeuVar);
            int iZzg = zzeuVar.zzg() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzeuVar.zzd()) {
                zzeh.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzg = zzeuVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzs = zzeuVar.zzs();
                int iZzt = zzeuVar.zzt();
                if (iZzt == 49) {
                    iZzB = zzeuVar.zzB();
                    iZzt = 49;
                } else {
                    iZzB = 0;
                }
                int iZzs2 = zzeuVar.zzs();
                if (iZzt == 47) {
                    zzeuVar.zzk(1);
                    iZzt = 47;
                }
                boolean z = iZzs == 181 && (iZzt == 49 || iZzt == 47) && iZzs2 == 3;
                if (iZzt == 49) {
                    z &= iZzB == 1195456820;
                }
                if (z) {
                    zzb(j, zzeuVar, zzahmVarArr);
                }
            }
            zzeuVar.zzh(iZzg);
        }
    }

    public static void zzb(long j, zzeu zzeuVar, zzahm[] zzahmVarArr) {
        int iZzs = zzeuVar.zzs();
        if ((iZzs & 64) != 0) {
            int i = iZzs & 31;
            zzeuVar.zzk(1);
            int iZzg = zzeuVar.zzg();
            for (zzahm zzahmVar : zzahmVarArr) {
                int i2 = i * 3;
                zzeuVar.zzh(iZzg);
                zzahmVar.zzc(zzeuVar, i2);
                zzgtr.zzi(j != -9223372036854775807L);
                zzahmVar.zze(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzeu zzeuVar) {
        int i = 0;
        while (zzeuVar.zzd() != 0) {
            int iZzs = zzeuVar.zzs();
            i += iZzs;
            if (iZzs != 255) {
                return i;
            }
        }
        return -1;
    }
}
