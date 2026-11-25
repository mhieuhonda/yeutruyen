package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zziay extends ThreadLocal {
    final /* synthetic */ zziaz zza;

    zziay(zziaz zziazVar) {
        Objects.requireNonNull(zziazVar);
        this.zza = zziazVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zziak zziakVar = zziak.zzb;
            zziaz zziazVar = this.zza;
            Mac mac = (Mac) zziakVar.zzb(zziazVar.zzb());
            mac.init(zziazVar.zzc());
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
