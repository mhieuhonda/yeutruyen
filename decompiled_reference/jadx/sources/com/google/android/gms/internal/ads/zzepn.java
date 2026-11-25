package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzepn {
    private final zzflz zza;
    private final zzdxh zzb;
    private final zzdzt zzc;

    public zzepn(zzflz zzflzVar, zzdxh zzdxhVar, zzdzt zzdztVar) {
        this.zza = zzflzVar;
        this.zzb = zzdxhVar;
        this.zzc = zzdztVar;
    }

    public final void zza(zzfkq zzfkqVar, zzfkn zzfknVar, int i, @Nullable zzeme zzemeVar, long j) {
        zzdxg zzdxgVarZzc;
        zzdzs zzdzsVarZza = this.zzc.zza();
        zzdzsVarZza.zza(zzfkqVar);
        zzdzsVarZza.zzb(zzfknVar);
        zzdzsVarZza.zzc("action", "adapter_status");
        zzdzsVarZza.zzc("adapter_l", String.valueOf(j));
        zzdzsVarZza.zzc("sc", Integer.toString(i));
        if (zzemeVar != null) {
            zzdzsVarZza.zzc("arec", Integer.toString(zzemeVar.zzb().zza));
            String strZza = this.zza.zza(zzemeVar.getMessage());
            if (strZza != null) {
                zzdzsVarZza.zzc("areec", strZza);
            }
        }
        zzdxh zzdxhVar = this.zzb;
        Iterator it = zzfknVar.zzt.iterator();
        do {
            if (!it.hasNext()) {
                zzdxgVarZzc = null;
                break;
            }
            zzdxgVarZzc = zzdxhVar.zzc((String) it.next());
        } while (zzdxgVarZzc == null);
        if (zzdxgVarZzc != null) {
            zzdzsVarZza.zzc("ancn", zzdxgVarZzc.zza);
            zzbxx zzbxxVar = zzdxgVarZzc.zzb;
            if (zzbxxVar != null) {
                zzdzsVarZza.zzc("adapter_v", zzbxxVar.toString());
            }
            zzbxx zzbxxVar2 = zzdxgVarZzc.zzc;
            if (zzbxxVar2 != null) {
                zzdzsVarZza.zzc("adapter_sv", zzbxxVar2.toString());
            }
        }
        zzdzsVarZza.zzd();
    }
}
