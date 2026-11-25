package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdal implements zzdgf, zzdls {
    private zzcbd zza;
    private final Context zzc;
    private final zzfqt zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    zzdal(Context context, zzfqt zzfqtVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfqtVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void zzc() {
        zzcbd zzcbdVar;
        int i;
        zzbup zzbupVarZzb;
        if (!this.zzb.getAndSet(true)) {
            if (((Boolean) zzbkx.zzo.zze()).booleanValue()) {
                i = 2;
            } else {
                i = 3;
                if (!((Boolean) zzbkx.zzp.zze()).booleanValue()) {
                    if (((Boolean) zzbkx.zzn.zze()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzd()).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i = 2;
                            } else if (!TextUtils.equals(strOptString, NotificationCompat.CATEGORY_SERVICE)) {
                                i = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i = 1;
                    }
                }
            }
            int i2 = i - 1;
            if (i2 == 1) {
                zzbupVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            } else if (i2 == 2) {
                zzbupVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            }
            zzbuj zzbujVar = zzbum.zza;
            this.zza = new zzcbg(this.zzc, zzbupVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzbujVar, zzbujVar), this.zze, this.zzf);
            this.zzg = true;
        }
        if (this.zzg && (zzcbdVar = this.zza) != null) {
            ListenableFuture listenableFutureZzb = zzcbdVar.zzb();
            if (!this.zzh && ((Boolean) zzbkp.zzi.zze()).booleanValue()) {
                listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdak
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf();
                    }
                }, this.zzf);
            }
            zzcgb.zza(listenableFutureZzb, "persistFlagsClient", zzcfy.zzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zze(String str) {
        zzc();
    }

    final /* synthetic */ void zzf() {
        zzbii.zze(this.zzc);
        this.zzh = true;
    }
}
