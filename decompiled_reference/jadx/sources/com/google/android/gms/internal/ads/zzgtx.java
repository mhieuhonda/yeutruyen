package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtx extends zzgue {
    final /* synthetic */ zzgtf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgtx(zzgug zzgugVar, CharSequence charSequence, zzgtf zzgtfVar) {
        super(zzgugVar, charSequence);
        this.zza = zzgtfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    final int zzc(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzgtr.zzn(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    final int zzd(int i) {
        return i + 1;
    }
}
