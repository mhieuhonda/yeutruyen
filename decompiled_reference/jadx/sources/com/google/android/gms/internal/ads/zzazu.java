package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzazu implements Runnable {
    private zzazu() {
        throw null;
    }

    /* synthetic */ zzazu(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzazv.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzazv.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzazv.zzb;
        } catch (Throwable th) {
            zzazv.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
