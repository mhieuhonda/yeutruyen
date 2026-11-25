package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbhw {
    private final zzbib zza;
    private final zzbic.zzt.zza zzb;
    private final boolean zzc;

    private zzbhw() {
        this.zzb = zzbic.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbib();
    }

    public static zzbhw zza() {
        return new zzbhw();
    }

    private final synchronized void zzd(int i) {
        zzbic.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(com.google.android.gms.ads.internal.util.zzs.zzj());
        zzbia zzbiaVar = new zzbia(this.zza, zzaVar.zzbu().zzaN(), null);
        int i2 = i - 1;
        zzbiaVar.zzb(i2);
        zzbiaVar.zza();
        String string = Integer.toString(i2, 10);
        String.valueOf(string);
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(string)));
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfzu.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(zzf(i).getBytes());
            } catch (IOException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i) {
        zzbic.zzt.zza zzaVar;
        zzaVar = this.zzb;
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", zzaVar.zzf(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(zzaVar.zzbu().zzaN(), 3));
    }

    public final synchronized void zzb(zzbhv zzbhvVar) {
        if (this.zzc) {
            try {
                zzbhvVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgl)).booleanValue()) {
                zze(i);
            } else {
                zzd(i);
            }
        }
    }

    public zzbhw(zzbib zzbibVar) {
        this.zzb = zzbic.zzt.zzx();
        this.zza = zzbibVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgk)).booleanValue();
    }
}
