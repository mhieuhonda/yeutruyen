package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegw implements zzegy {
    private final Map zza;
    private final zzhcp zzb;
    private final zzdgd zzc;

    public zzegw(Map map, zzhcp zzhcpVar, zzdgd zzdgdVar) {
        this.zza = map;
        this.zzb = zzhcpVar;
        this.zzc = zzdgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegy
    public final ListenableFuture zza(final zzcbk zzcbkVar) {
        this.zzc.zzdP(zzcbkVar);
        ListenableFuture listenableFutureZzc = zzhcf.zzc(new zzeel(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjD)).split(",")) {
            final zzino zzinoVar = (zzino) this.zza.get(str.trim());
            if (zzinoVar != null) {
                listenableFutureZzc = zzhcf.zzh(listenableFutureZzc, zzeel.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzegv
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return ((zzegy) zzinoVar.zzb()).zza(zzcbkVar);
                    }
                }, this.zzb);
            }
        }
        zzhcf.zzr(listenableFutureZzc, new zzegu(this), zzcfy.zzh);
        return listenableFutureZzc;
    }

    final /* synthetic */ zzdgd zzb() {
        return this.zzc;
    }
}
