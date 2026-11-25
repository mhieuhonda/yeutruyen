package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzh {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfyo zzd;
    private boolean zze;

    public zzfzh(Context context, zzbdz zzbdzVar, zzfyo zzfyoVar, boolean z) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzbdzVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfyoVar;
        this.zze = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        String str = this.zzc;
        String.valueOf(str);
        return "FBAMTD".concat(String.valueOf(str));
    }

    private final String zzg() {
        String str = this.zzc;
        String.valueOf(str);
        return "LATMTD".concat(String.valueOf(str));
    }

    private static String zzh(zzbeb zzbebVar) {
        zzbeh zzbehVarZzi = zzbei.zzi();
        zzbehVarZzi.zza(zzbebVar.zza().zza());
        zzbehVarZzi.zzb(zzbebVar.zza().zzb());
        zzbehVarZzi.zzd(zzbebVar.zza().zzd());
        zzbehVarZzi.zze(zzbebVar.zza().zze());
        zzbehVarZzi.zzc(zzbebVar.zza().zzc());
        return Hex.bytesToStringLowercase(((zzbei) zzbehVarZzi.zzbu()).zzaN());
    }

    private final void zzi(int i, long j) {
        this.zzd.zza(i, j);
    }

    private final void zzj(int i, long j, String str) {
        this.zzd.zzb(i, j, str);
    }

    public final boolean zza(zzbeb zzbebVar, zzfzg zzfzgVar) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzbei zzbeiVarZzk = zzk(1);
            String strZza = zzbebVar.zza().zza();
            if (zzbeiVarZzk != null && zzbeiVarZzk.zza().equals(strZza)) {
                zzi(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            File fileZze = zze(strZza);
            if (fileZze.exists()) {
                String str = true != fileZze.isDirectory() ? "0" : "1";
                String str2 = true != fileZze.isFile() ? "0" : "1";
                z = false;
                StringBuilder sb = new StringBuilder(7);
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                zzj(4023, jCurrentTimeMillis2, sb.toString());
                zzi(4015, jCurrentTimeMillis2);
            } else {
                z = false;
                if (!fileZze.mkdirs()) {
                    zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? "0" : "1"));
                    zzi(4015, jCurrentTimeMillis2);
                    return false;
                }
            }
            File fileZze2 = zze(strZza);
            File file = new File(fileZze2, "pcam.jar");
            File file2 = new File(fileZze2, "pcbc");
            if (!zzfzb.zzb(file, zzbebVar.zzb().zzA())) {
                zzi(4016, jCurrentTimeMillis);
                return z;
            }
            if (!zzfzb.zzb(file2, zzbebVar.zzc().zzA())) {
                zzi(4017, jCurrentTimeMillis);
                return z;
            }
            if (zzfzgVar != null && !zzfzgVar.zza(file)) {
                zzi(4018, jCurrentTimeMillis);
                zzfzb.zze(fileZze2);
                return z;
            }
            String strZzh = zzh(zzbebVar);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            SharedPreferences sharedPreferences = this.zzb;
            String string = sharedPreferences.getString(zzg(), null);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(zzg(), strZzh);
            if (string != null) {
                editorEdit.putString(zzf(), string);
            }
            if (!editorEdit.commit()) {
                zzi(4019, jCurrentTimeMillis3);
                return z;
            }
            HashSet hashSet = new HashSet();
            zzbei zzbeiVarZzk2 = zzk(1);
            if (zzbeiVarZzk2 != null) {
                hashSet.add(zzbeiVarZzk2.zza());
            }
            zzbei zzbeiVarZzk3 = zzk(2);
            if (zzbeiVarZzk3 != null) {
                hashSet.add(zzbeiVarZzk3.zza());
            }
            boolean z2 = z;
            File[] fileArrListFiles = new File(this.zza.getDir("pccache", z2 ? 1 : 0), this.zzc).listFiles();
            int length = fileArrListFiles.length;
            for (int i = z2 ? 1 : 0; i < length; i++) {
                File file3 = fileArrListFiles[i];
                if (!hashSet.contains(file3.getName())) {
                    zzfzb.zze(file3);
                }
            }
            zzi(5014, jCurrentTimeMillis);
            return true;
        }
    }

    public final boolean zzb(zzbeb zzbebVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            if (!zzfzb.zzb(new File(zze(zzbebVar.zza().zza()), "pcbc"), zzbebVar.zzc().zzA())) {
                zzi(4020, jCurrentTimeMillis);
                return false;
            }
            String strZzh = zzh(zzbebVar);
            SharedPreferences.Editor editorEdit = this.zzb.edit();
            editorEdit.putString(zzg(), strZzh);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                zzi(5015, jCurrentTimeMillis);
            } else {
                zzi(4021, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    public final zzfyz zzc(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzbei zzbeiVarZzk = zzk(1);
            if (zzbeiVarZzk == null) {
                zzi(4022, jCurrentTimeMillis);
                return null;
            }
            File fileZze = zze(zzbeiVarZzk.zza());
            File file = new File(fileZze, "pcam.jar");
            if (!file.exists()) {
                file = new File(fileZze, "pcam");
            }
            File file2 = new File(fileZze, "pcbc");
            File file3 = new File(fileZze, "pcopt");
            zzi(5016, jCurrentTimeMillis);
            return new zzfyz(zzbeiVarZzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzbei zzbeiVarZzk = zzk(1);
            if (zzbeiVarZzk == null) {
                zzi(4025, jCurrentTimeMillis);
                return false;
            }
            File fileZze = zze(zzbeiVarZzk.zza());
            if (!new File(fileZze, "pcam.jar").exists()) {
                zzi(4026, jCurrentTimeMillis);
                return false;
            }
            if (new File(fileZze, "pcbc").exists()) {
                zzi(5019, jCurrentTimeMillis);
                return true;
            }
            zzi(4027, jCurrentTimeMillis);
            return false;
        }
    }

    private final zzbei zzk(int i) {
        SharedPreferences sharedPreferences = this.zzb;
        String string = i == 1 ? sharedPreferences.getString(zzg(), null) : sharedPreferences.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzidl zzidlVar = zzidl.zza;
            return zzbei.zzh(zzidl.zzt(bArrStringToBytes, 0, bArrStringToBytes.length), this.zze ? zzidz.zzb() : zzidz.zzc());
        } catch (zzifh unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }
}
