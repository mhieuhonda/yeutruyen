package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtz extends zzgue {
    zzgtz(zzgug zzgugVar, CharSequence charSequence, int i) {
        super(zzgugVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    public final int zzc(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    public final int zzd(int i) {
        return i;
    }
}
