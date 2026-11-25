package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgdb extends zzhay {
    Object zza;

    zzgdb(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final boolean zza(Object obj) {
        return super.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final boolean zzb(Throwable th) {
        return super.zzb(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    protected final void zzc() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final String zzd() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }
}
