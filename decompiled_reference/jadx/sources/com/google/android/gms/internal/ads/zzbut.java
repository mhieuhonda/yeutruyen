package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbut implements zzbuf {
    private final zzbuh zza;
    private final zzbui zzb;
    private final zzbub zzc;
    private final String zzd;

    zzbut(zzbub zzbubVar, String str, zzbui zzbuiVar, zzbuh zzbuhVar) {
        this.zzc = zzbubVar;
        this.zzd = str;
        this.zzb = zzbuiVar;
        this.zza = zzbuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final ListenableFuture zzb(Object obj) {
        zzcgd zzcgdVar = new zzcgd();
        zzbtv zzbtvVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbtvVarZzb.zze(new zzbuq(this, zzbtvVarZzb, obj, zzcgdVar), new zzbur(this, zzcgdVar, zzbtvVarZzb));
        return zzcgdVar;
    }

    final /* synthetic */ void zzc(zzbtv zzbtvVar, zzbuc zzbucVar, Object obj, zzcgd zzcgdVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String string = UUID.randomUUID().toString();
            zzbpw.zzo.zzb(string, new zzbus(this, zzbtvVar, zzcgdVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbucVar.zzb(this.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcgdVar.zzd(e);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e);
            } finally {
                zzbtvVar.zza();
            }
        }
    }

    final /* synthetic */ zzbuh zzd() {
        return this.zza;
    }
}
