package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbrv implements zzate {
    private volatile zzbri zza;
    private final Context zzb;

    public zzbrv(Context context) {
        this.zzb = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzate
    public final zzath zza(zzatl zzatlVar) throws zzatu {
        Parcelable.Creator<zzbrj> creator = zzbrj.CREATOR;
        Map mapZzm = zzatlVar.zzm();
        int size = mapZzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : mapZzm.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        zzbrj zzbrjVar = new zzbrj(zzatlVar.zzh(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            zzcgd zzcgdVar = new zzcgd();
            this.zza = new zzbri(this.zzb, com.google.android.gms.ads.internal.zzt.zzs().zza(), new zzbrt(this, zzcgdVar), new zzbru(this, zzcgdVar));
            this.zza.checkAvailabilityAndConnect();
            zzbrr zzbrrVar = new zzbrr(this, zzbrjVar);
            zzhcp zzhcpVar = zzcfy.zza;
            ListenableFuture listenableFutureZzi = zzhcf.zzi(zzhcf.zzj(zzcgdVar, zzbrrVar, zzhcpVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfA)).intValue(), TimeUnit.MILLISECONDS, zzcfy.zzd);
            listenableFutureZzi.addListener(new zzbrs(this), zzhcpVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) listenableFutureZzi.get();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            zzbrl zzbrlVar = (zzbrl) new zzcbi(parcelFileDescriptor).zza(zzbrl.CREATOR);
            if (zzbrlVar == null) {
                return null;
            }
            if (zzbrlVar.zza) {
                throw new zzatu(zzbrlVar.zzb);
            }
            String[] strArr3 = zzbrlVar.zze;
            String[] strArr4 = zzbrlVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap map = new HashMap();
            for (int i2 = 0; i2 < strArr3.length; i2++) {
                map.put(strArr3[i2], strArr4[i2]);
            }
            return new zzath(zzbrlVar.zzc, zzbrlVar.zzd, map, zzbrlVar.zzg, zzbrlVar.zzh);
        } catch (InterruptedException | ExecutionException unused) {
            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime3);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            return null;
        } catch (Throwable th) {
            long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime4);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            throw th;
        }
    }

    final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    final /* synthetic */ zzbri zzc() {
        return this.zza;
    }
}
