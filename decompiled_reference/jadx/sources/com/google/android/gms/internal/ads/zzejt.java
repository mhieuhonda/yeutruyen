package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzejt extends zzeju {
    private static final SparseArray zzg;
    private final Context zzb;
    private final zzdce zzc;
    private final TelephonyManager zzd;
    private final zzejl zze;
    private zzbic.zzq zzf;

    static {
        SparseArray sparseArray = new SparseArray();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbic.zzaf.zzd.CONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbic.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbic.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbic.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbic.zzaf.zzd.DISCONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbic.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbic.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbic.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbic.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbic.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbic.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbic.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbic.zzaf.zzd.CONNECTING);
    }

    zzejt(Context context, zzdce zzdceVar, zzejl zzejlVar, zzejh zzejhVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzejhVar, zzgVar);
        this.zzb = context;
        this.zzc = zzdceVar;
        this.zze = zzejlVar;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
    }

    static final /* synthetic */ zzbic.zzaf.zzd zze(Bundle bundle) {
        return (zzbic.zzaf.zzd) zzg.get(zzflv.zza(zzflv.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbic.zzaf.zzd.UNSPECIFIED);
    }

    private static final zzbic.zzq zzg(boolean z) {
        return z ? zzbic.zzq.ENUM_TRUE : zzbic.zzq.ENUM_FALSE;
    }

    public final void zza(boolean z) {
        zzhcf.zzr(this.zzc.zza(new Bundle()), new zzejs(this, z), zzcfy.zzh);
    }

    final /* synthetic */ zzbic.zzab zzb(Bundle bundle) {
        zzbic.zzab.zzb zzbVar;
        zzbic.zzab.zza zzaVarZzq = zzbic.zzab.zzq();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzf = zzbic.zzq.ENUM_TRUE;
        } else {
            this.zzf = zzbic.zzq.ENUM_FALSE;
            if (i == 0) {
                zzaVarZzq.zzc(zzbic.zzab.zzc.CELL);
            } else if (i != 1) {
                zzaVarZzq.zzc(zzbic.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZzq.zzc(zzbic.zzab.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbic.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbic.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbic.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbic.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZzq.zzg(zzbVar);
        }
        return zzaVarZzq.zzbu();
    }

    final /* synthetic */ byte[] zzc(boolean z, ArrayList arrayList, zzbic.zzab zzabVar, zzbic.zzaf.zzd zzdVar) {
        zzbic.zzaf.zza.C0014zza c0014zzaZzz = zzbic.zzaf.zza.zzz();
        c0014zzaZzz.zzv(arrayList);
        Context context = this.zzb;
        c0014zzaZzz.zzJ(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        c0014zzaZzz.zzN(com.google.android.gms.ads.internal.zzt.zzf().zzd(context, this.zzd));
        zzejl zzejlVar = this.zze;
        c0014zzaZzz.zzk(zzejlVar.zzf());
        c0014zzaZzz.zzo(zzejlVar.zzj());
        c0014zzaZzz.zzR(zzejlVar.zzd());
        c0014zzaZzz.zzZ(zzdVar);
        c0014zzaZzz.zzz(zzabVar);
        c0014zzaZzz.zzV(this.zzf);
        c0014zzaZzz.zzg(zzg(z));
        c0014zzaZzz.zzad(zzejlVar.zzb());
        c0014zzaZzz.zzc(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        c0014zzaZzz.zzF(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return c0014zzaZzz.zzbu().zzaN();
    }

    final /* synthetic */ zzejl zzd() {
        return this.zze;
    }
}
