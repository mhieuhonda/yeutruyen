package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgip extends zzgji {
    private final Map zza;
    private final Context zzb;
    private final zzgen zzc;
    private final long zzd;
    private final long zze;

    zzgip(zzaxt zzaxtVar, zzgie zzgieVar, Map map, Context context, zzgen zzgenVar, zzgdq zzgdqVar, zzgqo zzgqoVar) {
        super("6uD00qi6mV8zu6AkyeC5bCv3568B2wPeNuQXCAqDKxVcHdQxA+KxNWLV41zFPdNB", "4KiYmGZMrZQiVkw5xeVvBXbdnWwWVS3sMp2EDvInOL8=", zzaxtVar, zzgieVar, zzgqoVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgenVar;
        this.zzd = zzgdqVar.zzl();
        this.zze = zzgdqVar.zzm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgji
    protected final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        String strEncodeToString;
        zzayt zzaytVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        Object[] objArr2 = objArr;
        String strZzb = ExifInterface.LONGITUDE_EAST;
        int i = 1;
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzaytVar = (zzayt) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzaytVar.zzb().length() > 1)) {
                strZzb = zzaytVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.zza.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgui.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr2[5];
        synchronized (zzaxtVar) {
            Object obj = objArr2[4];
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                strEncodeToString = Base64.encodeToString(zzgzo.zzn().zzi().zzj(bArr, 0, bArr.length).getBytes(StandardCharsets.UTF_8), 11);
            } else {
                strEncodeToString = (String) obj;
            }
            zzaxtVar.zzu(((Long) objArr2[0]).longValue());
            zzaxtVar.zzt((String) objArr2[1]);
            zzaxtVar.zzD((String) objArr2[2]);
            zzaxtVar.zzE((String) objArr2[3]);
            zzaxtVar.zzp(strEncodeToString);
            zzaxtVar.zzo(strZzb);
            if (bool != null) {
                if (true == bool.booleanValue()) {
                    i = 2;
                }
                zzaxtVar.zzai(i);
            }
        }
    }
}
