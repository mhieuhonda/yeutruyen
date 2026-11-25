package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzepl {
    private final Clock zza;
    private final zzepn zzb;
    private final zzfsm zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhT)).booleanValue();
    private final zzemf zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzepl(Clock clock, zzepn zzepnVar, zzemf zzemfVar, zzfsm zzfsmVar) {
        this.zza = clock;
        this.zzb = zzepnVar;
        this.zzf = zzemfVar;
        this.zzc = zzfsmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean zzi(zzfkn zzfknVar) {
        zzepk zzepkVar = (zzepk) this.zzd.get(zzfknVar);
        if (zzepkVar == null) {
            return false;
        }
        return zzepkVar.zzc == 8;
    }

    public final synchronized void zza() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzb() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzc(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfkn zzfknVar = (zzfkn) it.next();
            String str = zzfknVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfknVar, new zzepk(str, zzfknVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzd(zzfkn zzfknVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfknVar != null) {
            this.zzf.zzi(zzfknVar);
        }
        this.zzg = true;
    }

    final synchronized ListenableFuture zze(zzfky zzfkyVar, zzfkn zzfknVar, ListenableFuture listenableFuture, zzfsi zzfsiVar) {
        zzfkq zzfkqVar = zzfkyVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfknVar.zzw;
        if (str != null) {
            this.zzd.put(zzfknVar, new zzepk(str, zzfknVar.zzaf, 9, 0L, null));
            zzhcf.zzr(listenableFuture, new zzepj(this, jElapsedRealtime, zzfkqVar, zzfknVar, str, zzfsiVar, zzfkyVar), zzcfy.zzh);
        }
        return listenableFuture;
    }

    public final synchronized void zzf(zzfkn zzfknVar) {
        zzepk zzepkVar = (zzepk) this.zzd.get(zzfknVar);
        if (zzepkVar == null || this.zzg) {
            return;
        }
        zzepkVar.zzc = 8;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzepk zzepkVar = (zzepk) ((Map.Entry) it.next()).getValue();
            if (zzepkVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzepkVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized long zzh() {
        return this.zzh;
    }

    final /* synthetic */ Clock zzj() {
        return this.zza;
    }

    final /* synthetic */ zzepn zzk() {
        return this.zzb;
    }

    final /* synthetic */ zzfsm zzl() {
        return this.zzc;
    }

    final /* synthetic */ LinkedHashMap zzm() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzn() {
        return this.zze;
    }

    final /* synthetic */ zzemf zzo() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzp() {
        return this.zzg;
    }
}
