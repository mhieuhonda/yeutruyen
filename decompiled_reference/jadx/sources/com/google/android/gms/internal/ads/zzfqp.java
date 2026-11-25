package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfqp {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzki), str);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfqg zzfqgVar) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            zzhcf.zzr(zzhbx.zzw(listenableFuture), new zzfql(zzfqgVar), zzcfy.zzh);
        }
    }

    public static zzfos zzc(final zzfqg zzfqgVar) {
        return new zzfos() { // from class: com.google.android.gms.internal.ads.zzfqo
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                    zzfqgVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(ListenableFuture listenableFuture, zzfqq zzfqqVar, zzfqg zzfqgVar) {
        zzh(listenableFuture, zzfqqVar, zzfqgVar, false);
    }

    public static void zze(ListenableFuture listenableFuture, zzfqq zzfqqVar, zzfqg zzfqgVar) {
        zzh(listenableFuture, zzfqqVar, zzfqgVar, true);
    }

    public static void zzf(ListenableFuture listenableFuture, zzfqq zzfqqVar, zzfqg zzfqgVar) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            zzhcf.zzr(zzhbx.zzw(listenableFuture), new zzfqn(zzfqqVar, zzfqgVar), zzcfy.zzh);
        }
    }

    public static int zzg(zzflg zzflgVar) {
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(zzflgVar) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    private static void zzh(ListenableFuture listenableFuture, zzfqq zzfqqVar, zzfqg zzfqgVar, boolean z) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            zzhcf.zzr(zzhbx.zzw(listenableFuture), new zzfqm(zzfqqVar, zzfqgVar, z), zzcfy.zzh);
        }
    }
}
