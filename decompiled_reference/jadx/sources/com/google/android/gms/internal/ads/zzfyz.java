package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyz {
    private final zzbei zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfyz(zzbei zzbeiVar, File file, File file2, File file3) {
        this.zza = zzbeiVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzbei zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzb;
    }

    public final File zzc() {
        return this.zzc;
    }

    public final byte[] zzd() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzA;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    zzidl zzidlVar = zzidl.zza;
                    ArrayList arrayList = new ArrayList();
                    int iMin = 256;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i = 0;
                        while (i < iMin) {
                            int i2 = fileInputStream.read(bArr, i, iMin - i);
                            if (i2 == -1) {
                                break;
                            }
                            i += i2;
                        }
                        zzidl zzidlVarZzt = i == 0 ? null : zzidl.zzt(bArr, 0, i);
                        if (zzidlVarZzt == null) {
                            break;
                        }
                        arrayList.add(zzidlVarZzt);
                        iMin = Math.min(iMin + iMin, 8192);
                    }
                    bArrZzA = zzidl.zzy(arrayList).zzA();
                    IOUtils.closeQuietly(fileInputStream);
                } catch (IOException unused) {
                    IOUtils.closeQuietly(fileInputStream);
                    bArrZzA = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.zze = bArrZzA;
        }
        byte[] bArr2 = this.zze;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public final boolean zze(long j) {
        return this.zza.zzc() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
