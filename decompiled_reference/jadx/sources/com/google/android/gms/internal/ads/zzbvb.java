package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbvb implements zzhbn {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzb;

    zzbvb(ListenableFuture listenableFuture, String str, zzbui zzbuiVar, zzbuh zzbuhVar) {
        this.zzb = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzhcf.zzj(this.zzb, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzbva
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return this.zza.zzc(obj, (zzbuc) obj2);
            }
        }, zzcfy.zzh);
    }

    final /* synthetic */ ListenableFuture zzc(Object obj, zzbuc zzbucVar) throws JSONException {
        zzcgd zzcgdVar = new zzcgd();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzbpw.zzo.zzb(string, new zzbuz(this, zzcgdVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbucVar.zzb(this.zza, jSONObject);
        return zzcgdVar;
    }
}
