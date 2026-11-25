package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgty extends zzgue {
    final /* synthetic */ zzgtg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgty(zzgug zzgugVar, CharSequence charSequence, zzgtg zzgtgVar) {
        super(zzgugVar, charSequence);
        this.zza = zzgtgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    public final int zzc(int i) {
        Matcher matcher = ((zzgtj) this.zza).zza;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    public final int zzd(int i) {
        return ((zzgtj) this.zza).zza.end();
    }
}
