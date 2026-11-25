package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhoj extends RuntimeException {
    public zzhoj(String str) {
        super(str);
    }

    public static Object zza(zzhoi zzhoiVar) {
        try {
            return zzhoiVar.zza();
        } catch (Exception e) {
            throw new zzhoj(e);
        }
    }

    public zzhoj(String str, Throwable th) {
        super(str, th);
    }

    public zzhoj(Throwable th) {
        super(th);
    }
}
