package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgtf implements zzgts {
    protected zzgtf() {
    }

    public static zzgtf zzc() {
        return zzgte.zzb;
    }

    public static zzgtf zzd(char c) {
        return new zzgtb(c);
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
