package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgwr extends zzguq {
    private final zzgwt zza;

    zzgwr(zzgwt zzgwtVar, int i) {
        super(zzgwtVar.size(), i);
        this.zza = zzgwtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguq
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
