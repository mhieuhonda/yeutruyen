package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzefn;
import com.google.android.gms.internal.ads.zzeha;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzba implements zzhbn {
    private final Executor zza;
    private final zzefn zzb;

    public zzba(Executor executor, zzefn zzefnVar) {
        this.zza = executor;
        this.zzb = zzefnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        final zzcbk zzcbkVar = (zzcbk) obj;
        return zzhcf.zzj(this.zzb.zza(zzcbkVar), new zzhbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                zzeha zzehaVar = (zzeha) obj2;
                zzbc zzbcVar = new zzbc(new JsonReader(new InputStreamReader(zzehaVar.zza())), zzehaVar.zzb());
                try {
                    zzbcVar.zzb = com.google.android.gms.ads.internal.client.zzay.zza().zzo(zzcbkVar.zza).toString();
                } catch (JSONException unused) {
                    zzbcVar.zzb = "{}";
                }
                return zzhcf.zza(zzbcVar);
            }
        }, this.zza);
    }
}
