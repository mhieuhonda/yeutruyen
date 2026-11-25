package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzauq;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcgd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbl {
    private static zzato zza;
    private static final Object zzb = new Object();

    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:15:0x003c, B:14:0x0034, B:16:0x003e), top: B:21:0x0010 }] */
    public zzbl(Context context) {
        zzato zzatoVarZza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            if (zza == null) {
                zzbix.zza(context);
                if (ClientLibraryUtils.isPackageSide()) {
                    zzatoVarZza = zzauq.zza(context, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfy)).booleanValue()) {
                        zzatoVarZza = zzay.zzb(context);
                    } else {
                        zzatoVarZza = zzauq.zza(context, null);
                    }
                }
                zza = zzatoVarZza;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzcgd zzcgdVar = new zzcgd();
        zza.zzb(new zzbk(str, null, zzcgdVar));
        return zzcgdVar;
    }

    public final ListenableFuture zzb(int i, String str, Map map, byte[] bArr) {
        zzbi zzbiVar = new zzbi(null);
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbh zzbhVar = new zzbh(this, i, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, ShareTarget.METHOD_GET, zzbhVar.zzm(), zzbhVar.zzn());
            } catch (zzast e) {
                String message = e.getMessage();
                int i2 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        zza.zzb(zzbhVar);
        return zzbiVar;
    }
}
