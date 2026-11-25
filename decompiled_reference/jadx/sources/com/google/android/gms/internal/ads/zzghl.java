package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzghl {
    private MessageDigest zza;
    private final zzgqo zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzghl(zzgqo zzgqoVar) {
        this.zzb = zzgqoVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    final synchronized void zzb(SecureRandom secureRandom) {
        zzgqm zzgqmVarZza = this.zzb.zza(202);
        try {
            try {
                try {
                    zzgqmVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (Throwable th) {
                    zzgqmVarZza.zzb(th);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e) {
                zzgqmVarZza.zzb(e);
            }
            zzgqmVarZza.zzc();
        } catch (Throwable th2) {
            zzgqmVarZza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    final byte[] zzd(byte[] bArr, String str, boolean z) {
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        zzgtr.zza(length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i2 = i - length;
            byte[] bArr2 = new byte[i2];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i2);
            System.arraycopy(bArr2, 0, bArr, length, i2);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzgho[] zzghoVarArr = new zzgib().zzcK;
        int length2 = zzghoVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzghoVarArr[i3].zza(bArrArray, bArr3);
        }
        if (!zzgui.zzc(str)) {
            new zzghn(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzazl zzf(byte[] bArr, String str) {
        zzazl zzazlVarZza = zzazm.zza();
        byte[] bArrZze = zze(bArr);
        zzidl zzidlVar = zzidl.zza;
        zzazlVarZza.zzb(zzidl.zzt(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i2 = i * 255;
            int i3 = i2 + 255;
            if (length > i3) {
                length = i3;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i2, length));
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzazlVarZza.zza(zzidl.zzt(zzd((byte[]) it.next(), str, false), 0, 256));
        }
        return zzazlVarZza;
    }

    public final String zzg(int i, String str) {
        zzaxt zzaxtVarZzj = zzayt.zzj();
        zzaxtVarZzj.zzl(i);
        return Base64.encodeToString(zzd(((zzayt) zzaxtVarZzj.zzbu()).zzaN(), str, true), 11);
    }
}
