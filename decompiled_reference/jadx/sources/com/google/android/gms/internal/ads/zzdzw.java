package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzw implements zzfpt {
    private final zzdzo zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdzw(zzdzo zzdzoVar, Set set, Clock clock) {
        this.zzb = zzdzoVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdzv zzdzvVar = (zzdzv) it.next();
            this.zzd.put(zzdzvVar.zzc(), zzdzvVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfpm zzfpmVar, boolean z) {
        zzdzv zzdzvVar = (zzdzv) this.zzd.get(zzfpmVar);
        if (zzdzvVar == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        Map map = this.zza;
        zzfpm zzfpmVarZzb = zzdzvVar.zzb();
        if (map.containsKey(zzfpmVarZzb)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfpmVarZzb)).longValue();
            zzdzo zzdzoVar = this.zzb;
            String strZza = zzdzvVar.zza();
            Map mapZzc = zzdzoVar.zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(jElapsedRealtime);
            mapZzc.put("label.".concat(strZza), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdL(zzfpm zzfpmVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdM(zzfpm zzfpmVar, String str) {
        this.zza.put(zzfpmVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdN(zzfpm zzfpmVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfpmVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfpmVar)).longValue();
            Map mapZzc = this.zzb.zzc();
            String.valueOf(str);
            String strValueOf = String.valueOf(str);
            String string = Long.toString(jElapsedRealtime);
            String.valueOf(string);
            mapZzc.put("task.".concat(strValueOf), "f.".concat(String.valueOf(string)));
        }
        if (this.zzd.containsKey(zzfpmVar)) {
            zze(zzfpmVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdO(zzfpm zzfpmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfpmVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfpmVar)).longValue();
            Map mapZzc = this.zzb.zzc();
            String.valueOf(str);
            String strValueOf = String.valueOf(str);
            String string = Long.toString(jElapsedRealtime);
            String.valueOf(string);
            mapZzc.put("task.".concat(strValueOf), "s.".concat(String.valueOf(string)));
        }
        if (this.zzd.containsKey(zzfpmVar)) {
            zze(zzfpmVar, true);
        }
    }
}
