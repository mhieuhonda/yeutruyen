package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzauh implements zzasv {
    private final zzaug zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzauh(zzaug zzaugVar, int i) {
        this.zzc = zzaugVar;
    }

    static byte[] zzg(zzauf zzaufVar, long j) throws IOException {
        long jZza = zzaufVar.zza();
        if (j >= 0 && j <= jZza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaufVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33 + String.valueOf(jZza).length());
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(jZza);
        throw new IOException(sb.toString());
    }

    static void zzh(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    static void zzj(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static long zzk(InputStream inputStream) throws IOException {
        return (((long) zzp(inputStream)) & 255) | ((((long) zzp(inputStream)) & 255) << 8) | ((((long) zzp(inputStream)) & 255) << 16) | ((((long) zzp(inputStream)) & 255) << 24) | ((((long) zzp(inputStream)) & 255) << 32) | ((((long) zzp(inputStream)) & 255) << 40) | ((((long) zzp(inputStream)) & 255) << 48) | ((((long) zzp(inputStream)) & 255) << 56);
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static String zzm(zzauf zzaufVar) throws IOException {
        return new String(zzg(zzaufVar, zzk(zzaufVar)), "UTF-8");
    }

    private final void zzn(String str, zzaue zzaueVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb += zzaueVar.zza - ((zzaue) map.get(str)).zza;
        } else {
            this.zzb += zzaueVar.zza;
        }
        map.put(str, zzaueVar);
    }

    private final void zzo(String str) {
        zzaue zzaueVar = (zzaue) this.zza.remove(str);
        if (zzaueVar != null) {
            this.zzb -= zzaueVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() >> 1;
        String strValueOf = String.valueOf(str.substring(0, length).hashCode());
        String strValueOf2 = String.valueOf(str.substring(length).hashCode());
        String.valueOf(strValueOf);
        String.valueOf(strValueOf2);
        return String.valueOf(strValueOf).concat(String.valueOf(strValueOf2));
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final synchronized zzasu zza(String str) {
        zzaue zzaueVar = (zzaue) this.zza.get(str);
        if (zzaueVar == null) {
            return null;
        }
        File fileZzf = zzf(str);
        try {
            zzauf zzaufVar = new zzauf(new BufferedInputStream(new FileInputStream(fileZzf)), fileZzf.length());
            try {
                String str2 = zzaue.zza(zzaufVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzatx.zzb("%s: key=%s, found=%s", fileZzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    zzaufVar.close();
                    return null;
                }
                byte[] bArrZzg = zzg(zzaufVar, zzaufVar.zza());
                zzasu zzasuVar = new zzasu();
                zzasuVar.zza = bArrZzg;
                zzasuVar.zzb = zzaueVar.zzc;
                zzasuVar.zzc = zzaueVar.zzd;
                zzasuVar.zzd = zzaueVar.zze;
                zzasuVar.zze = zzaueVar.zzf;
                zzasuVar.zzf = zzaueVar.zzg;
                List<zzatd> list = zzaueVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzatd zzatdVar : list) {
                    treeMap.put(zzatdVar.zza(), zzatdVar.zzb());
                }
                zzasuVar.zzg = treeMap;
                zzasuVar.zzh = Collections.unmodifiableList(list);
                zzaufVar.close();
                return zzasuVar;
            } catch (Throwable th) {
                zzaufVar.close();
                throw th;
            }
        } catch (IOException e) {
            zzatx.zzb("%s: %s", fileZzf.getAbsolutePath(), e.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final synchronized void zzb(String str, zzasu zzasuVar) {
        long j = this.zzb;
        int length = zzasuVar.zza.length;
        long j2 = j + ((long) length);
        int i = this.zzd;
        float f = 0.9f;
        if (j2 <= i || length <= i * 0.9f) {
            File fileZzf = zzf(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzf));
                zzaue zzaueVar = new zzaue(str, zzasuVar);
                try {
                    zzh(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzaueVar.zzb);
                    String str2 = zzaueVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzj(bufferedOutputStream, zzaueVar.zzd);
                    zzj(bufferedOutputStream, zzaueVar.zze);
                    zzj(bufferedOutputStream, zzaueVar.zzf);
                    zzj(bufferedOutputStream, zzaueVar.zzg);
                    List<zzatd> list = zzaueVar.zzh;
                    if (list != null) {
                        zzh(bufferedOutputStream, list.size());
                        for (zzatd zzatdVar : list) {
                            zzl(bufferedOutputStream, zzatdVar.zza());
                            zzl(bufferedOutputStream, zzatdVar.zzb());
                        }
                    } else {
                        zzh(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzasuVar.zza);
                    bufferedOutputStream.close();
                    zzaueVar.zza = fileZzf.length();
                    zzn(str, zzaueVar);
                    long j3 = this.zzb;
                    int i2 = this.zzd;
                    if (j3 >= i2) {
                        boolean z = zzatx.zzb;
                        if (z) {
                            zzatx.zza("Pruning old cache entries.", new Object[0]);
                        }
                        long j4 = this.zzb;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.zza.entrySet().iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            zzaue zzaueVar2 = (zzaue) ((Map.Entry) it.next()).getValue();
                            String str3 = zzaueVar2.zzb;
                            if (zzf(str3).delete()) {
                                this.zzb -= zzaueVar2.zza;
                            } else {
                                zzatx.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i3++;
                            if (this.zzb < i2 * f) {
                                break;
                            } else {
                                f = f;
                            }
                        }
                        if (z) {
                            zzatx.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.zzb - j4), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } catch (IOException e) {
                    zzatx.zzb("%s", e.toString());
                    bufferedOutputStream.close();
                    zzatx.zzb("Failed to write header for %s", fileZzf.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!fileZzf.delete()) {
                    zzatx.zzb("Could not clean up file %s", fileZzf.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzatx.zzb("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzc();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final synchronized void zzc() {
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        zzauf zzaufVar = new zzauf(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzaue zzaueVarZza = zzaue.zza(zzaufVar);
                            zzaueVarZza.zza = length;
                            zzn(zzaueVarZza.zzb, zzaueVarZza);
                            zzaufVar.close();
                        } catch (Throwable th) {
                            zzaufVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzatx.zzc("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final synchronized void zzd(String str, boolean z) {
        zzasu zzasuVarZza = zza(str);
        if (zzasuVarZza != null) {
            zzasuVarZza.zzf = 0L;
            zzasuVarZza.zze = 0L;
            zzb(str, zzasuVarZza);
        }
    }

    public final synchronized void zze(String str) {
        boolean zDelete = zzf(str).delete();
        zzo(str);
        if (zDelete) {
            return;
        }
        zzatx.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzauh(File file, int i) {
        this.zzc = new zzaud(this, file);
    }
}
