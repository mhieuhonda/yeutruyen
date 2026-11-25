package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhaa {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgzp zzgzpVar = new zzgzp();
        file.getClass();
        FileOutputStream fileOutputStreamZza = zzgzy.zza(file, zzgxd.zzq(new zzgzx[0]), zzgzpVar);
        try {
            fileOutputStreamZza.write(bArr);
            fileOutputStreamZza.close();
        } catch (Throwable th) {
            try {
                fileOutputStreamZza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void zzc(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        zzgtr.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        zzgtr.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        zzgzz zzgzzVar = new zzgzz(file, null);
        zzgzp zzgzpVar = new zzgzp();
        zzgxd zzgxdVarZzq = zzgxd.zzq(new zzgzx[0]);
        zzgzw zzgzwVarZza = zzgzw.zza();
        try {
            InputStream inputStreamZza = zzgzzVar.zza();
            zzgzwVarZza.zzb(inputStreamZza);
            InputStream inputStream = inputStreamZza;
            FileOutputStream fileOutputStreamZza = zzgzy.zza(file2, zzgxdVarZzq, zzgzpVar);
            zzgzwVarZza.zzb(fileOutputStreamZza);
            FileOutputStream fileOutputStream = fileOutputStreamZza;
            int i = zzgzt.zza;
            byte[] bArr = new byte[8192];
            while (true) {
                int i2 = inputStreamZza.read(bArr);
                if (i2 == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i2);
                }
            }
            zzgzwVarZza.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                throw zzgzwVarZza.zzc(th);
            } catch (Throwable th2) {
                zzgzwVarZza.close();
                throw th2;
            }
        }
    }
}
