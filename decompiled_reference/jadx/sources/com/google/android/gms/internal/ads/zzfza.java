package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfza {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzbdz zzd;

    public zzfza(Context context, zzbdz zzbdzVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfzb.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfzb.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbdzVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append("FBAMTD");
        sb.append(iZza);
        return sb.toString();
    }

    private final String zzf() {
        int iZza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append("LATMTD");
        sb.append(iZza);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    public final boolean zza(zzbeb zzbebVar, zzfzg zzfzgVar) {
        boolean z;
        String strZza = zzbebVar.zza().zza();
        byte[] bArrZzA = zzbebVar.zzb().zzA();
        byte[] bArrZzA2 = zzbebVar.zzc().zzA();
        if (!TextUtils.isEmpty(strZza) && bArrZzA2.length != 0) {
            File file = this.zza;
            zzfzb.zze(file);
            file.mkdirs();
            zzfzb.zzc(strZza, file).mkdirs();
            File fileZza = zzfzb.zza(strZza, "pcam.jar", file);
            if ((bArrZzA.length <= 0 || zzfzb.zzb(fileZza, bArrZzA)) && zzfzb.zzb(zzfzb.zza(strZza, "pcbc", file), bArrZzA2)) {
                File fileZza2 = zzfzb.zza(zzbebVar.zza().zza(), "pcam.jar", file);
                if (fileZza2.exists() && zzfzgVar != null && !zzfzgVar.zza(fileZza2)) {
                    return false;
                }
                String strZza2 = zzbebVar.zza().zza();
                if (TextUtils.isEmpty(strZza2)) {
                    z = false;
                } else {
                    File fileZza3 = zzfzb.zza(strZza2, "pcam.jar", file);
                    File fileZza4 = zzfzb.zza(strZza2, "pcbc", file);
                    File fileZza5 = zzfzb.zza(strZza2, "pcam.jar", zzd());
                    File fileZza6 = zzfzb.zza(strZza2, "pcbc", zzd());
                    if ((!fileZza3.exists() || fileZza3.renameTo(fileZza5)) && fileZza4.exists() && fileZza4.renameTo(fileZza6)) {
                        zzbeh zzbehVarZzi = zzbei.zzi();
                        zzbehVarZzi.zza(zzbebVar.zza().zza());
                        zzbehVarZzi.zzb(zzbebVar.zza().zzb());
                        zzbehVarZzi.zzd(zzbebVar.zza().zzd());
                        zzbehVarZzi.zze(zzbebVar.zza().zze());
                        zzbehVarZzi.zzc(zzbebVar.zza().zzc());
                        zzbei zzbeiVar = (zzbei) zzbehVarZzi.zzbu();
                        zzbei zzbeiVarZzc = zzc(1);
                        SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzbeiVarZzc != null && !zzbeiVar.zza().equals(zzbeiVarZzc.zza())) {
                            editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzbeiVarZzc.zzaN()));
                        }
                        editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzbeiVar.zzaN()));
                        if (editorEdit.commit()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                HashSet hashSet = new HashSet();
                zzbei zzbeiVarZzc2 = zzc(1);
                if (zzbeiVarZzc2 != null) {
                    hashSet.add(zzbeiVarZzc2.zza());
                }
                zzbei zzbeiVarZzc3 = zzc(2);
                if (zzbeiVarZzc3 != null) {
                    hashSet.add(zzbeiVarZzc3.zza());
                }
                for (File file2 : zzd().listFiles()) {
                    String name = file2.getName();
                    if (!hashSet.contains(name)) {
                        zzfzb.zze(zzfzb.zzc(name, zzd()));
                    }
                }
                return z;
            }
        }
        return false;
    }

    public final zzfyz zzb(int i) {
        zzbei zzbeiVarZzc = zzc(1);
        if (zzbeiVarZzc == null) {
            return null;
        }
        String strZza = zzbeiVarZzc.zza();
        File fileZza = zzfzb.zza(strZza, "pcam.jar", zzd());
        if (!fileZza.exists()) {
            fileZza = zzfzb.zza(strZza, "pcam", zzd());
        }
        return new zzfyz(zzbeiVarZzc, fileZza, zzfzb.zza(strZza, "pcbc", zzd()), zzfzb.zza(strZza, "pcopt", zzd()));
    }

    final zzbei zzc(int i) {
        SharedPreferences sharedPreferences = this.zzc;
        String string = i == 1 ? sharedPreferences.getString(zzf(), null) : sharedPreferences.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzidl zzidlVar = zzidl.zza;
            zzbei zzbeiVarZzg = zzbei.zzg(zzidl.zzt(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZza = zzbeiVarZzg.zza();
            File fileZza = zzfzb.zza(strZza, "pcam.jar", zzd());
            if (!fileZza.exists()) {
                fileZza = zzfzb.zza(strZza, "pcam", zzd());
            }
            File fileZza2 = zzfzb.zza(strZza, "pcbc", zzd());
            if (fileZza.exists() && fileZza2.exists()) {
                return zzbeiVarZzg;
            }
            return null;
        } catch (zzifh unused) {
        }
    }
}
