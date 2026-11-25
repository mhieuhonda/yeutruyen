package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhky extends ThreadLocal {
    zzhky() {
    }

    @Nullable
    protected static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zziak.zza.zzb("AES/GCM-SIV/NoPadding");
            if (zzhjo.zzb(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    @Nullable
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
