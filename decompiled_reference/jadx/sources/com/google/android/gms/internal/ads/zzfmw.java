package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfmw implements zzfmv {
    private final ConcurrentHashMap zza;
    private final zzfnc zzb;
    private final zzfmy zzc = new zzfmy();

    public zzfmw(zzfnc zzfncVar) {
        this.zza = new ConcurrentHashMap(zzfncVar.zzd);
        this.zzb = zzfncVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfnc> creator = zzfnc.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzht)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfnc zzfncVar = this.zzb;
            sb.append(zzfncVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfnf) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfmu) entry.getValue()).zzc(); i2++) {
                    sb.append("[O]");
                }
                for (int iZzc = ((zzfmu) entry.getValue()).zzc(); iZzc < zzfncVar.zzd; iZzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfmu) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < zzfncVar.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String string = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final synchronized zzfne zza(zzfnf zzfnfVar) {
        zzfne zzfneVarZzb;
        zzfmu zzfmuVar = (zzfmu) this.zza.get(zzfnfVar);
        if (zzfmuVar != null) {
            zzfneVarZzb = zzfmuVar.zzb();
            if (zzfneVarZzb == null) {
                this.zzc.zzb();
            }
            zzfns zzfnsVarZzh = zzfmuVar.zzh();
            if (zzfneVarZzb != null) {
                zzbic.zzb.zzc zzcVarZzs = zzbic.zzb.zzs();
                zzbic.zzb.zza.C0015zza c0015zzaZzs = zzbic.zzb.zza.zzs();
                c0015zzaZzs.zzc(zzbic.zzb.zzd.IN_MEMORY);
                zzbic.zzb.zze.zza zzaVarZzq = zzbic.zzb.zze.zzq();
                zzaVarZzq.zzc(zzfnsVarZzh.zza);
                zzaVarZzq.zzg(zzfnsVarZzh.zzb);
                c0015zzaZzs.zzh(zzaVarZzq);
                zzcVarZzs.zzh(c0015zzaZzs);
                zzfneVarZzb.zza.zza().zzd().zzj(zzcVarZzs.zzbu());
            }
            zzf();
        } else {
            this.zzc.zza();
            zzf();
            zzfneVarZzb = null;
        }
        return zzfneVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final synchronized boolean zzb(zzfnf zzfnfVar, zzfne zzfneVar) {
        boolean zZza;
        ConcurrentHashMap concurrentHashMap = this.zza;
        zzfmu zzfmuVar = (zzfmu) concurrentHashMap.get(zzfnfVar);
        zzfneVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        if (zzfmuVar == null) {
            zzfnc zzfncVar = this.zzb;
            zzfmu zzfmuVar2 = new zzfmu(zzfncVar.zzd, zzfncVar.zze * 1000);
            if (concurrentHashMap.size() == zzfncVar.zzc) {
                int i = zzfncVar.zzg;
                int i2 = i - 1;
                zzfnf zzfnfVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long jZzd = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((zzfmu) entry.getValue()).zzd() < jZzd) {
                            jZzd = ((zzfmu) entry.getValue()).zzd();
                            zzfnfVar2 = (zzfnf) entry.getKey();
                        }
                    }
                    if (zzfnfVar2 != null) {
                        concurrentHashMap.remove(zzfnfVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                        if (((zzfmu) entry2.getValue()).zze() < jZzd) {
                            jZzd = ((zzfmu) entry2.getValue()).zze();
                            zzfnfVar2 = (zzfnf) entry2.getKey();
                        }
                    }
                    if (zzfnfVar2 != null) {
                        concurrentHashMap.remove(zzfnfVar2);
                    }
                } else if (i2 == 2) {
                    int iZzf = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                        if (((zzfmu) entry3.getValue()).zzf() < iZzf) {
                            iZzf = ((zzfmu) entry3.getValue()).zzf();
                            zzfnfVar2 = (zzfnf) entry3.getKey();
                        }
                    }
                    if (zzfnfVar2 != null) {
                        concurrentHashMap.remove(zzfnfVar2);
                    }
                }
                this.zzc.zzd();
            }
            concurrentHashMap.put(zzfnfVar, zzfmuVar2);
            this.zzc.zzc();
            zzfmuVar = zzfmuVar2;
        }
        zZza = zzfmuVar.zza(zzfneVar);
        zzfmy zzfmyVar = this.zzc;
        zzfmyVar.zze();
        zzfmx zzfmxVarZzf = zzfmyVar.zzf();
        zzfns zzfnsVarZzh = zzfmuVar.zzh();
        if (zzfneVar != null) {
            zzbic.zzb.zzc zzcVarZzs = zzbic.zzb.zzs();
            zzbic.zzb.zza.C0015zza c0015zzaZzs = zzbic.zzb.zza.zzs();
            c0015zzaZzs.zzc(zzbic.zzb.zzd.IN_MEMORY);
            zzbic.zzb.zzg.zza zzaVarZzs = zzbic.zzb.zzg.zzs();
            zzaVarZzs.zzc(zzfmxVarZzf.zza);
            zzaVarZzs.zzg(zzfmxVarZzf.zzb);
            zzaVarZzs.zzk(zzfnsVarZzh.zzb);
            c0015zzaZzs.zzn(zzaVarZzs);
            zzcVarZzs.zzh(c0015zzaZzs);
            zzfneVar.zza.zza().zzd().zzk(zzcVarZzs.zzbu());
        }
        zzf();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final synchronized boolean zzc(zzfnf zzfnfVar) {
        zzfmu zzfmuVar = (zzfmu) this.zza.get(zzfnfVar);
        if (zzfmuVar == null) {
            return true;
        }
        return zzfmuVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    @Deprecated
    public final zzfnf zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzfnc zzfncVar = this.zzb;
        return new zzfng(zzmVar, str, new zzcbn(zzfncVar.zza).zza().zzj, zzfncVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final zzfnc zze() {
        return this.zzb;
    }
}
