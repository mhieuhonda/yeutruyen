package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeiq extends zzcaw {
    private final Context zza;
    private final zzhcp zzb;
    private final zzeiy zzc;
    private final zzcrx zzd;
    private final ArrayDeque zze;
    private final zzfqt zzf;
    private final zzcbs zzg;

    public zzeiq(Context context, zzhcp zzhcpVar, zzcbs zzcbsVar, zzcrx zzcrxVar, zzeiy zzeiyVar, ArrayDeque arrayDeque, zzeiv zzeivVar, zzfqt zzfqtVar) {
        zzbix.zza(context);
        this.zza = context;
        this.zzb = zzhcpVar;
        this.zzg = zzcbsVar;
        this.zzc = zzeiyVar;
        this.zzd = zzcrxVar;
        this.zze = arrayDeque;
        this.zzf = zzfqtVar;
    }

    private static ListenableFuture zzm(final zzcbk zzcbkVar, zzfps zzfpsVar, final zzfdu zzfduVar) {
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeie
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfduVar.zzc().zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((Bundle) obj), zzcbkVar.zzm);
            }
        };
        return zzfpsVar.zza(zzfpm.GMS_SIGNALS, zzhcf.zza(zzcbkVar.zza)).zzc(zzhbnVar).zzb(zzeif.zza).zzi();
    }

    private static ListenableFuture zzn(ListenableFuture listenableFuture, zzfps zzfpsVar, zzbup zzbupVar, zzfqq zzfqqVar, zzfqg zzfqgVar) {
        zzbuf zzbufVarZza = zzbupVar.zza("AFMA_getAdDictionary", zzbum.zza, zzeik.zza);
        zzfqp.zzb(listenableFuture, zzfqgVar);
        zzfoz zzfozVarZzi = zzfpsVar.zza(zzfpm.BUILD_URL, listenableFuture).zzc(zzbufVarZza).zzi();
        zzfqp.zzf(zzfozVarZzi, zzfqqVar, zzfqgVar);
        return zzfozVarZzi;
    }

    private final void zzo(ListenableFuture listenableFuture, zzcbb zzcbbVar, zzcbk zzcbkVar) {
        zzhcf.zzr(zzhcf.zzj(listenableFuture, new zzhbn(this) { // from class: com.google.android.gms.internal.ads.zzeii
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhcf.zza(zzfmh.zza((InputStream) obj));
            }
        }, zzcfy.zza), new zzeib(this, zzcbkVar, zzcbbVar), zzcfy.zzh);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzble.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(zzeil zzeilVar) {
        zzp();
        this.zze.addLast(zzeilVar);
    }

    private final synchronized zzeil zzr(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzeil zzeilVar = (zzeil) it.next();
            if (zzeilVar.zzc.equals(str)) {
                it.remove();
                return zzeilVar;
            }
        }
        return null;
    }

    public final ListenableFuture zzb(final zzcbk zzcbkVar, int i) {
        zzeil zzeilVarZzr;
        zzfoz zzfozVarZzi;
        zzbug zzbugVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbup zzbupVarZza = zzbugVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfdu zzfduVarZzy = this.zzd.zzy(zzcbkVar, i);
        zzbuf zzbufVarZza = zzbupVarZza.zza("google.afma.response.normalize", zzein.zzd, zzbum.zzb);
        if (((Boolean) zzble.zza.zze()).booleanValue()) {
            zzeilVarZzr = zzr(zzcbkVar.zzh);
            if (zzeilVarZzr == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzcbkVar.zzj;
            zzeilVarZzr = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzeil zzeilVar = zzeilVarZzr;
        zzfqg zzfqgVarZzn = zzeilVar == null ? zzfqg.zzn(context, 9) : zzeilVar.zzd;
        zzfqq zzfqqVarZzf = zzfduVarZzy.zzf();
        zzfqqVarZzf.zzb(zzcbkVar.zza.getStringArrayList("ad_types"));
        zzeix zzeixVar = new zzeix(zzcbkVar.zzg, zzfqqVarZzf, zzfqgVarZzn);
        zzeiu zzeiuVar = new zzeiu(context, zzcbkVar.zzb.afmaVersion, this.zzg, i, null);
        zzfps zzfpsVarZze = zzfduVarZzy.zze();
        zzfqg zzfqgVarZzn2 = zzfqg.zzn(context, 11);
        if (zzeilVar == null) {
            final ListenableFuture listenableFutureZzm = zzm(zzcbkVar, zzfpsVarZze, zzfduVarZzy);
            final ListenableFuture listenableFutureZzn = zzn(listenableFutureZzm, zzfpsVarZze, zzbupVarZza, zzfqqVarZzf, zzfqgVarZzn);
            zzfqg zzfqgVarZzn3 = zzfqg.zzn(context, 10);
            final zzfoz zzfozVarZzi2 = zzfpsVarZze.zzb(zzfpm.HTTP, listenableFutureZzn, listenableFutureZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeij
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzcbm zzcbmVar = (zzcbm) listenableFutureZzn.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue() && (bundle = zzcbkVar.zzm) != null) {
                        bundle.putLong(zzdzc.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzcbmVar.zzj());
                        bundle.putLong(zzdzc.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzcbmVar.zzk());
                    }
                    return new zzeiw((JSONObject) listenableFutureZzm.get(), zzcbmVar);
                }
            }).zzb(zzeixVar).zzb(zzfqp.zzc(zzfqgVarZzn3)).zzb(zzeiuVar).zzi();
            zzfqp.zzd(zzfozVarZzi2, zzfqqVarZzf, zzfqgVarZzn3);
            zzfqp.zzb(zzfozVarZzi2, zzfqgVarZzn2);
            zzfozVarZzi = zzfpsVarZze.zzb(zzfpm.PRE_PROCESS, listenableFutureZzm, listenableFutureZzn, zzfozVarZzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeic
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue() && (bundle = zzcbkVar.zzm) != null) {
                        bundle.putLong(zzdzc.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    return new zzein((zzeit) zzfozVarZzi2.get(), (JSONObject) listenableFutureZzm.get(), (zzcbm) listenableFutureZzn.get());
                }
            }).zzc(zzbufVarZza).zzi();
        } else {
            zzeiw zzeiwVar = new zzeiw(zzeilVar.zzb, zzeilVar.zza);
            zzfqg zzfqgVarZzn4 = zzfqg.zzn(context, 10);
            final zzfoz zzfozVarZzi3 = zzfpsVarZze.zza(zzfpm.HTTP, zzhcf.zza(zzeiwVar)).zzb(zzeixVar).zzb(zzfqp.zzc(zzfqgVarZzn4)).zzb(zzeiuVar).zzi();
            zzfqp.zzd(zzfozVarZzi3, zzfqqVarZzf, zzfqgVarZzn4);
            final ListenableFuture listenableFutureZza = zzhcf.zza(zzeilVar);
            zzfqp.zzb(zzfozVarZzi3, zzfqgVarZzn2);
            zzfozVarZzi = zzfpsVarZze.zzb(zzfpm.PRE_PROCESS, zzfozVarZzi3, listenableFutureZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeid
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzeit zzeitVar = (zzeit) zzfozVarZzi3.get();
                    ListenableFuture listenableFuture = listenableFutureZza;
                    return new zzein(zzeitVar, ((zzeil) listenableFuture.get()).zzb, ((zzeil) listenableFuture.get()).zza);
                }
            }).zzc(zzbufVarZza).zzi();
        }
        zzfqp.zzd(zzfozVarZzi, zzfqqVarZzf, zzfqgVarZzn2);
        return zzfozVarZzi;
    }

    public final ListenableFuture zzc(final zzcbk zzcbkVar, int i) {
        if (!((Boolean) zzble.zza.zze()).booleanValue()) {
            return zzhcf.zzc(new Exception("Split request is disabled."));
        }
        zzfnc zzfncVar = zzcbkVar.zzi;
        if (zzfncVar == null) {
            return zzhcf.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzfncVar.zzc == 0 || zzfncVar.zzd == 0) {
            return zzhcf.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbup zzbupVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfdu zzfduVarZzy = this.zzd.zzy(zzcbkVar, i);
        zzfps zzfpsVarZze = zzfduVarZzy.zze();
        final ListenableFuture listenableFutureZzm = zzm(zzcbkVar, zzfpsVarZze, zzfduVarZzy);
        zzfqq zzfqqVarZzf = zzfduVarZzy.zzf();
        final zzfqg zzfqgVarZzn = zzfqg.zzn(context, 9);
        final ListenableFuture listenableFutureZzn = zzn(listenableFutureZzm, zzfpsVarZze, zzbupVarZza, zzfqqVarZzf, zzfqgVarZzn);
        return zzfpsVarZze.zzb(zzfpm.GET_URL_AND_CACHE_KEY, listenableFutureZzm, listenableFutureZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeig
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(listenableFutureZzn, listenableFutureZzm, zzcbkVar, zzfqgVarZzn);
            }
        }).zzi();
    }

    public final ListenableFuture zzd(String str) {
        if (!((Boolean) zzble.zza.zze()).booleanValue()) {
            return zzhcf.zzc(new Exception("Split request is disabled."));
        }
        zzeia zzeiaVar = new zzeia(this);
        if (zzr(str) != null) {
            return zzhcf.zza(zzeiaVar);
        }
        String.valueOf(str);
        return zzhcf.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zze(zzcbk zzcbkVar, zzcbb zzcbbVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue() && (bundle = zzcbkVar.zzm) != null) {
            bundle.putLong(zzdzc.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture listenableFutureZzb = zzb(zzcbkVar, Binder.getCallingUid());
        zzo(listenableFutureZzb, zzcbbVar, zzcbkVar);
        if (((Boolean) zzbkx.zzi.zze()).booleanValue()) {
            final zzeiy zzeiyVar = this.zzc;
            Objects.requireNonNull(zzeiyVar);
            listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeip
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeiyVar.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzf(zzcbk zzcbkVar, zzcbb zzcbbVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue() && (bundle = zzcbkVar.zzm) != null) {
            bundle.putLong(zzdzc.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzo(zzk(zzcbkVar, Binder.getCallingUid()), zzcbbVar, zzcbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzg(zzcbk zzcbkVar, zzcbb zzcbbVar) {
        zzo(zzc(zzcbkVar, Binder.getCallingUid()), zzcbbVar, zzcbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzh(String str, zzcbb zzcbbVar) {
        zzo(zzd(str), zzcbbVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpL)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpM);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> iterableZzf = zzgug.zza(zzgtf.zzd(',')).zzf(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (String str3 : iterableZzf) {
                Context context = this.zza;
                zzeiu zzeiuVar = new zzeiu(context, str, this.zzg, callingUid, "HEAD");
                HashMap map = new HashMap();
                map.put(HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                zzeis zzeisVar = new zzeis(str3, 30000, map, new byte[0], "", false);
                try {
                    zzeit zzeitVarZzb = zzeiuVar.zza(zzeisVar);
                    zzeit zzeitVar = zzeitVarZzb;
                    if (zzeitVarZzb.zza != 200) {
                        int i = zzeitVarZzb.zza;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i);
                        throw new RemoteException(sb.toString());
                    }
                } catch (Exception e) {
                    throw new RemoteException(e.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzj(zzcat zzcatVar, zzcbc zzcbcVar) {
        if (((Boolean) zzblm.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzcatVar.zza;
            zzhcf.zzr(zzhcf.zza(null), new zzehz(this, zzcbcVar, zzcatVar), zzcfy.zzh);
        } else {
            try {
                zzcbcVar.zze("", zzcatVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
            }
        }
    }

    public final ListenableFuture zzk(final zzcbk zzcbkVar, int i) {
        zzbug zzbugVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbup zzbupVarZza = zzbugVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzblk.zza.zze()).booleanValue()) {
            return zzhcf.zzc(new Exception("Signal collection disabled."));
        }
        zzfdu zzfduVarZzy = this.zzd.zzy(zzcbkVar, i);
        final zzfcv zzfcvVarZzd = zzfduVarZzy.zzd();
        zzbuf zzbufVarZza = zzbupVarZza.zza("google.afma.request.getSignals", zzbum.zza, zzbum.zzb);
        zzfqg zzfqgVarZzn = zzfqg.zzn(context, 22);
        zzfps zzfpsVarZze = zzfduVarZzy.zze();
        zzfpm zzfpmVar = zzfpm.GET_SIGNALS;
        Bundle bundle = zzcbkVar.zza;
        zzfoz zzfozVarZzi = zzfpsVarZze.zza(zzfpmVar, zzhcf.zza(bundle)).zzb(zzfqp.zzc(zzfqgVarZzn)).zzc(new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeih
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) throws JSONException {
                return zzfcvVarZzd.zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((Bundle) obj), zzcbkVar.zzm);
            }
        }).zzj(zzfpm.JS_SIGNALS).zzc(zzbufVarZza).zzi();
        zzfqq zzfqqVarZzf = zzfduVarZzy.zzf();
        zzfqqVarZzf.zzb(bundle.getStringArrayList("ad_types"));
        zzfqqVarZzf.zzd(bundle.getBundle("extras"));
        zzfqp.zze(zzfozVarZzi, zzfqqVarZzf, zzfqgVarZzn);
        if (((Boolean) zzbkx.zzj.zze()).booleanValue()) {
            final zzeiy zzeiyVar = this.zzc;
            Objects.requireNonNull(zzeiyVar);
            zzfozVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeio
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeiyVar.zza();
                }
            }, this.zzb);
        }
        return zzfozVarZzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzl(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzcbk zzcbkVar, zzfqg zzfqgVar) {
        String strZzi = ((zzcbm) listenableFuture.get()).zzi();
        zzq(new zzeil((zzcbm) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzcbkVar.zzh, strZzi, zzfqgVar));
        return new ByteArrayInputStream(strZzi.getBytes(StandardCharsets.UTF_8));
    }
}
