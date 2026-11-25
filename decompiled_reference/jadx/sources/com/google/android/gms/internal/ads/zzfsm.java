package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfsm {
    private final Context zza;
    private final Executor zzb;
    private final zzhcq zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfse zze;
    private final zzfqt zzf;
    private final zzcnn zzg;

    zzfsm(Context context, Executor executor, zzhcq zzhcqVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfse zzfseVar, zzfqt zzfqtVar, zzcnn zzcnnVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzhcqVar;
        this.zzd = zzuVar;
        this.zze = zzfseVar;
        this.zzf = zzfqtVar;
        this.zzg = zzcnnVar;
    }

    public final void zza(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfqq zzfqqVar, zzdfo zzdfoVar) {
        ListenableFuture listenableFutureZzc;
        zzfqg zzfqgVarZzn = null;
        if (zzfqt.zza() && ((Boolean) zzbkq.zzd.zze()).booleanValue()) {
            zzfqgVarZzn = zzfqg.zzn(this.zza, 14);
            zzfqgVarZzn.zza();
        }
        if (zzvVar != null) {
            listenableFutureZzc = new zzfsd(zzvVar.zza(), this.zzd, this.zzc, this.zze, this.zzg).zza(str);
        } else {
            listenableFutureZzc = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfsl
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(str);
                }
            });
        }
        zzhcf.zzr(listenableFutureZzc, new zzfsk(this, zzfqgVarZzn, zzfqqVar, zzdfoVar), this.zzb);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzko)).booleanValue() || (!com.google.android.gms.ads.internal.zzt.zzc().zzh(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzi(str))) {
            return this.zzd.zzc(str, null);
        }
        String strZzb = this.zzg.zzb();
        HashMap map = new HashMap();
        if (strZzb != null) {
            map.put((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkp), strZzb);
        }
        return this.zzd.zzc(str, map);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    final /* synthetic */ zzfqt zze() {
        return this.zzf;
    }
}
