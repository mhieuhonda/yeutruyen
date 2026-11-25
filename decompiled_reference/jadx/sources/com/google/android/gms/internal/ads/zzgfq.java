package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgfq {
    private final zzimt zza;
    private final zzimt zzb;
    private final ExecutorService zzc;
    private final zzimt zzd;
    private ListenableFuture zze = null;

    zzgfq(zzimt zzimtVar, zzimt zzimtVar2, ExecutorService executorService, zzimt zzimtVar3) {
        this.zza = zzimtVar;
        this.zzb = zzimtVar2;
        this.zzc = executorService;
        this.zzd = zzimtVar3;
    }

    public final synchronized ListenableFuture zza() {
        ListenableFuture listenableFuture = this.zze;
        if (listenableFuture != null) {
            return listenableFuture;
        }
        Set set = (Set) this.zzb.zzb();
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzgfo) it.next()).zza());
        }
        zzgqo zzgqoVar = (zzgqo) this.zzd.zzb();
        ListenableFuture listenableFutureZzk = zzhcf.zzk(zzhcf.zzm(arrayList), zzgfp.zza, this.zzc);
        zzgqoVar.zze(2, listenableFutureZzk);
        this.zze = listenableFutureZzk;
        Iterator it2 = ((Set) this.zza.zzb()).iterator();
        while (it2.hasNext()) {
            ((zzgfo) it2.next()).zza();
        }
        ListenableFuture listenableFuture2 = this.zze;
        if (listenableFuture2 == null) {
            throw null;
        }
        return listenableFuture2;
    }

    public final synchronized ListenableFuture zzb() {
        ListenableFuture listenableFuture;
        listenableFuture = this.zze;
        if (listenableFuture == null) {
            throw null;
        }
        return listenableFuture;
    }
}
