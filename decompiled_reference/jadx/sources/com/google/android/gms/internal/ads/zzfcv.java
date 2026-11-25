package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfcv {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfqq zzd;

    public zzfcv(Context context, Executor executor, Set set, zzfqq zzfqqVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfqqVar;
    }

    public final ListenableFuture zza(final Object obj, final Bundle bundle) {
        zzfqg zzfqgVarZzn = zzfqg.zzn(this.zza, 8);
        zzfqgVarZzn.zza();
        Set<zzfcs> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbio zzbioVar = zzbix.zznt;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).split(","));
        }
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdzc.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdzc.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzfcs zzfcsVar : set) {
            if (!arrayList2.contains(String.valueOf(zzfcsVar.zzb()))) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                ListenableFuture listenableFutureZza = zzfcsVar.zza();
                listenableFutureZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfct
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                        boolean zBooleanValue = ((Boolean) zzbkz.zza.zze()).booleanValue();
                        Bundle bundle3 = bundle2;
                        zzfcs zzfcsVar2 = zzfcsVar;
                        if (zBooleanValue) {
                            String strZza = zzgui.zza(zzfcsVar2.getClass().getCanonicalName());
                            StringBuilder sb = new StringBuilder(strZza.length() + 25 + String.valueOf(jElapsedRealtime2).length());
                            sb.append("Signal runtime (ms) : ");
                            sb.append(strZza);
                            sb.append(" = ");
                            sb.append(jElapsedRealtime2);
                            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue()) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcY)).booleanValue()) {
                                synchronized (this.zza) {
                                    int iZzb = zzfcsVar2.zzb();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 3);
                                    sb2.append("sig");
                                    sb2.append(iZzb);
                                    bundle3.putLong(sb2.toString(), jElapsedRealtime2);
                                }
                            }
                        }
                    }
                }, zzcfy.zzh);
                arrayList.add(listenableFutureZza);
            }
        }
        ListenableFuture listenableFutureZza2 = zzhcf.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfcq zzfcqVar = (zzfcq) ((ListenableFuture) it.next()).get();
                    if (zzfcqVar != null) {
                        zzfcqVar.zza(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdzc.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                        return obj2;
                    }
                    bundle3.putLong(zzdzc.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfqt.zza()) {
            zzfqp.zzd(listenableFutureZza2, this.zzd, zzfqgVarZzn);
        }
        return listenableFutureZza2;
    }
}
