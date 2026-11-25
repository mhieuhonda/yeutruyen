package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgjp {
    private final Context zza;
    private final zzgqo zzb;
    private final zzghl zzc;
    private final String zzd;
    private final boolean zze;

    zzgjp(Context context, zzgqo zzgqoVar, zzghl zzghlVar, zzgdq zzgdqVar) {
        this.zza = context;
        this.zzb = zzgqoVar;
        this.zzc = zzghlVar;
        this.zzd = zzgdqVar.zzd();
        this.zze = zzgdqVar.zzw();
    }

    public final String zza(boolean z, long j) {
        String strEncodeToString = ExifInterface.LONGITUDE_EAST;
        zzgqm zzgqmVarZza = this.zzb.zza(55);
        try {
            zzgqmVarZza.zza();
            zzaze zzazeVarZza = zzazf.zza();
            zzazeVarZza.zzb(this.zzd);
            zzazeVarZza.zza("0.893135394");
            Context context = this.zza;
            zzazeVarZza.zzd(context.getPackageName());
            zzazeVarZza.zzc(System.currentTimeMillis() / 1000);
            zzazeVarZza.zzf((System.currentTimeMillis() - j) / 1000);
            if (this.zze) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            String hexString = Integer.toHexString(b & 255);
                            if (hexString.length() == 1) {
                                sb.append('0');
                            }
                            sb.append(hexString);
                        }
                        strEncodeToString = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                    }
                } catch (Exception unused) {
                }
                zzazeVarZza.zzg(strEncodeToString);
            }
            try {
                Context context2 = this.zza;
                zzazeVarZza.zze(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused2) {
                zzazeVarZza.zze(-1L);
            }
            zzghl zzghlVar = this.zzc;
            if (!zzghlVar.zzc()) {
                zzghlVar.zza();
            }
            zzazl zzazlVarZzf = zzghlVar.zzf(((zzazf) zzazeVarZza.zzbu()).zzaN(), null);
            zzazlVarZzf.zzc(5);
            zzazlVarZzf.zzd(2);
            String strZza = zzgel.zza(((zzazm) zzazlVarZzf.zzbu()).zzaN(), true);
            zzgqmVarZza.zzc();
            return strZza;
        } catch (Throwable th) {
            try {
                zzgqmVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgqmVarZza.zzc();
                throw th2;
            }
        }
    }
}
