package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzceq;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzfqq;
import com.google.android.gms.internal.ads.zzhcc;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzy implements zzhcc {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzcex zzb;
    final /* synthetic */ zzceq zzc;
    final /* synthetic */ zzfqg zzd;
    final /* synthetic */ zzap zze;

    zzy(zzap zzapVar, ListenableFuture listenableFuture, zzcex zzcexVar, zzceq zzceqVar, zzfqg zzfqgVar) {
        this.zza = listenableFuture;
        this.zzb = zzcexVar;
        this.zzc = zzceqVar;
        this.zzd = zzfqgVar;
        Objects.requireNonNull(zzapVar);
        this.zze = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfqq zzfqqVarZzy = zzap.zzy(this.zza, this.zzb);
        if (((Boolean) zzbkq.zze.zze()).booleanValue() && zzfqqVarZzy != null) {
            zzfqg zzfqgVar = this.zzd;
            zzfqgVar.zzj(th);
            zzfqgVar.zzd(false);
            zzfqqVarZzy.zza(zzfqgVar);
            zzfqqVarZzy.zzh();
        }
        zzceq zzceqVar = this.zzc;
        if (zzceqVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzceqVar.zzb(message);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ListenableFuture listenableFuture = this.zza;
        AtomicBoolean atomicBooleanZzN = this.zze.zzN();
        zzbc zzbcVar = (zzbc) obj;
        zzfqq zzfqqVarZzy = zzap.zzy(listenableFuture, this.zzb);
        atomicBooleanZzN.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziG)).booleanValue()) {
            try {
                zzceq zzceqVar = this.zzc;
                if (zzceqVar != null) {
                    zzceqVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e) {
                String strConcat = "QueryInfo generation has been disabled.".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
            }
            if (!((Boolean) zzbkq.zze.zze()).booleanValue() || zzfqqVarZzy == null) {
                return;
            }
            zzfqg zzfqgVar = this.zzd;
            zzfqgVar.zzk("QueryInfo generation has been disabled.");
            zzfqgVar.zzd(false);
            zzfqqVarZzy.zza(zzfqgVar);
            zzfqqVarZzy.zzh();
            return;
        }
        try {
            if (zzbcVar == null) {
                zzceq zzceqVar2 = this.zzc;
                if (zzceqVar2 != null) {
                    zzceqVar2.zzc(null, null, null);
                }
                zzfqg zzfqgVar2 = this.zzd;
                zzfqgVar2.zzd(true);
                if (!((Boolean) zzbkq.zze.zze()).booleanValue() || zzfqqVarZzy == null) {
                    return;
                }
                zzfqqVarZzy.zza(zzfqgVar2);
                zzfqqVarZzy.zzh();
                return;
            }
            try {
                if (TextUtils.isEmpty(new JSONObject(zzbcVar.zzb).optString("request_id", ""))) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                    zzceq zzceqVar3 = this.zzc;
                    if (zzceqVar3 != null) {
                        zzceqVar3.zzb("Internal error: request ID is empty in request JSON.");
                    }
                    zzfqg zzfqgVar3 = this.zzd;
                    zzfqgVar3.zzk("Request ID empty");
                    zzfqgVar3.zzd(false);
                    if (!((Boolean) zzbkq.zze.zze()).booleanValue() || zzfqqVarZzy == null) {
                        return;
                    }
                    zzfqqVarZzy.zza(zzfqgVar3);
                    zzfqqVarZzy.zzh();
                    return;
                }
                Bundle bundle = zzbcVar.zzd;
                zzap zzapVar = this.zze;
                if (zzapVar.zzF() && bundle != null && bundle.getInt(zzapVar.zzH(), -1) == -1) {
                    bundle.putInt(zzapVar.zzH(), zzapVar.zzI().get());
                }
                if (zzapVar.zzE() && bundle != null && TextUtils.isEmpty(bundle.getString(zzapVar.zzG()))) {
                    if (TextUtils.isEmpty(zzapVar.zzK())) {
                        zzapVar.zzL(com.google.android.gms.ads.internal.zzt.zzc().zze(zzapVar.zzz(), zzapVar.zzJ().afmaVersion));
                    }
                    bundle.putString(zzapVar.zzG(), zzapVar.zzK());
                }
                zzceq zzceqVar4 = this.zzc;
                if (zzceqVar4 != null) {
                    zzceqVar4.zzc(zzbcVar.zza, zzbcVar.zzb, bundle);
                }
                this.zzd.zzd(true);
                if (!((Boolean) zzbkq.zze.zze()).booleanValue() || zzfqqVarZzy == null) {
                    return;
                }
                zzfqqVarZzy.zza(this.zzd);
                zzfqqVarZzy.zzh();
            } catch (JSONException e2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                zzceq zzceqVar5 = this.zzc;
                if (zzceqVar5 != null) {
                    String string = e2.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 33);
                    sb.append("Internal error for request JSON: ");
                    sb.append(string);
                    zzceqVar5.zzb(sb.toString());
                }
                zzfqg zzfqgVar4 = this.zzd;
                zzfqgVar4.zzj(e2);
                zzfqgVar4.zzd(false);
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbkq.zze.zze()).booleanValue() || zzfqqVarZzy == null) {
                    return;
                }
                zzfqqVarZzy.zza(zzfqgVar4);
                zzfqqVarZzy.zzh();
            }
        } catch (RemoteException e3) {
            zzfqg zzfqgVar5 = this.zzd;
            zzfqgVar5.zzj(e3);
            zzfqgVar5.zzd(false);
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
        } finally {
            if (((Boolean) zzbkq.zze.zze()).booleanValue() && zzfqqVarZzy != null) {
                zzfqqVarZzy.zza(this.zzd);
                zzfqqVarZzy.zzh();
            }
        }
    }
}
