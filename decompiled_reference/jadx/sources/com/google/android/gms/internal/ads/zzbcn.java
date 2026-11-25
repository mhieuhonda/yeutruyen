package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcn extends zzbdm {
    private static final zzbdn zzh = new zzbdn();
    private final zzaxm zzi;
    private final Context zzj;
    private final zzazt zzk;

    public zzbcn(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2, Context context, zzaxf zzaxfVar, zzaxm zzaxmVar, zzazt zzaztVar) {
        super(zzbbzVar, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", zzaxtVar, i, 27);
        this.zzj = context;
        this.zzi = zzaxmVar;
        this.zzk = zzaztVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zzazq zzc() throws IllegalAccessException, InvocationTargetException {
        String str;
        zzbio zzbioVar = zzbix.zzdJ;
        int iZzb = (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).intValue() <= 0 || ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).intValue() >= this.zzi.zzb()) ? this.zzi.zzb() : ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).intValue();
        zzazq zzazqVar = new zzazq((String) this.zze.invoke(null, this.zzj, false, ""));
        zzazt zzaztVar = this.zzk;
        if (zzaztVar == null || zzaztVar.zza() == null) {
            str = ExifInterface.LONGITUDE_EAST;
        } else {
            try {
                str = (String) zzaztVar.zza().get(iZzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = ExifInterface.LONGITUDE_EAST;
            }
        }
        zzazqVar.zza = str;
        return zzazqVar;
    }

    private final String zzd() {
        try {
            zzbbz zzbbzVar = this.zza;
            if (zzbbzVar.zzm() != null) {
                zzbbzVar.zzm().get();
            }
            zzayt zzaytVarZzl = zzbbzVar.zzl();
            if (zzaytVarZzl == null || !zzaytVarZzl.zza()) {
                return null;
            }
            return zzaytVarZzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzazq zzazqVarZzc;
        zzazq zzazqVar;
        zzbdn zzbdnVar = zzh;
        Context context = this.zzj;
        AtomicReference atomicReferenceZza = zzbdnVar.zza(context.getPackageName());
        synchronized (atomicReferenceZza) {
            zzazq zzazqVar2 = (zzazq) atomicReferenceZza.get();
            if (zzazqVar2 == null || zzbcc.zzc(zzazqVar2.zza) || zzazqVar2.zza.equals(ExifInterface.LONGITUDE_EAST) || zzazqVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                boolean z = false;
                if (zzbcc.zzc(null)) {
                    (!zzbcc.zzc(null) ? false : false).booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                if (this.zzk != null) {
                    zzazqVarZzc = zzc();
                } else {
                    if (i == 3 && !this.zzi.zza()) {
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdv);
                    String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdu)).booleanValue() ? zzb() : null;
                    if (bool.booleanValue() && this.zza.zzi() && zzbcc.zzc(strZzb)) {
                        strZzb = zzd();
                    }
                    zzazq zzazqVar3 = new zzazq((String) this.zze.invoke(null, context, boolValueOf, strZzb));
                    String str = zzazqVar3.zza;
                    if (zzbcc.zzc(str) || str.equals(ExifInterface.LONGITUDE_EAST)) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String strZzd = zzd();
                            if (!zzbcc.zzc(strZzd)) {
                                zzazqVar3.zza = strZzd;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    zzazqVarZzc = zzazqVar3;
                }
                atomicReferenceZza.set(zzazqVarZzc);
            }
            zzazqVar = (zzazq) atomicReferenceZza.get();
        }
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            if (zzazqVar != null) {
                zzaxtVar.zzo(zzazqVar.zza);
                zzaxtVar.zzu(zzazqVar.zzb);
                zzaxtVar.zzt(zzazqVar.zzc);
                zzaxtVar.zzD(zzazqVar.zzd);
                zzaxtVar.zzE(zzazqVar.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzb = zzbcc.zzb((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdw));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzbcc.zzb((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdx)))));
            }
            Context context = this.zzj;
            return zzbdp.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
