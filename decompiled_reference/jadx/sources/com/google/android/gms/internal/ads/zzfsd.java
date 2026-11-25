package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfsd {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final zzhcq zzc;
    private final zzfse zzd;
    private final zzcnn zze;

    public zzfsd(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzhcq zzhcqVar, zzfse zzfseVar, zzcnn zzcnnVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzhcqVar;
        this.zzd = zzfseVar;
        this.zze = zzcnnVar;
    }

    private final ListenableFuture zze(final String str, final long j, final int i) {
        final String string;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i > zzxVar.zza()) {
            zzfse zzfseVar = this.zzd;
            if (zzfseVar == null || !zzxVar.zzd()) {
                return zzhcf.zza(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
            }
            zzfseVar.zza(str, "", 2);
            return zzhcf.zza(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjW)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i));
            String strValueOf = String.valueOf(builderClearQuery.build());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(encodedQuery).length());
            sb.append(strValueOf);
            sb.append("&");
            sb.append(encodedQuery);
            string = sb.toString();
        } else {
            string = str;
        }
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfsc
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(i, j, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        zzhcq zzhcqVar = this.zzc;
        return j == 0 ? zzhcf.zzj(zzhcqVar.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfsb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd(string);
            }
        }), zzhbnVar, zzhcqVar) : zzhcf.zzj(zzhcqVar.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfsa
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(string);
            }
        }, j, TimeUnit.MILLISECONDS), zzhbnVar, zzhcqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.client.zzt zzd(String str) {
        zzcnn zzcnnVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzko)).booleanValue() || (zzcnnVar = this.zze) == null || (!com.google.android.gms.ads.internal.zzt.zzc().zzh(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzi(str))) {
            return this.zzb.zzc(str, null);
        }
        String strZzb = zzcnnVar.zzb();
        HashMap map = new HashMap();
        if (strZzb != null) {
            map.put((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkp), strZzb);
        }
        return this.zzb.zzc(str, map);
    }

    public final ListenableFuture zza(String str) {
        if (str != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzg)).booleanValue() || !str.isEmpty()) {
                try {
                    return zze(str, 0L, 1);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return zzhcf.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
                }
            }
        }
        return zzhcf.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
    }

    final /* synthetic */ ListenableFuture zzb(int i, long j, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzhcf.zza(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        long jZzb = zzxVar.zzb();
        if (i != 1) {
            jZzb = (long) (zzxVar.zzc() * j);
        }
        return zze(str, jZzb, i + 1);
    }
}
